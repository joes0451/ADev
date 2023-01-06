
/*
 * :folding=explicit:collapseFolds=1:
 */

	/**
	 *	  ADev is a lightweight Android development tool
	 *
	 *	  Copyright (c) 2013 - 2023 Joseph Siebenmann
	 *
	 *    This program is free software: you can redistribute it and/or modify
	 *    it under the terms of the GNU General Public License as published by
	 *    the Free Software Foundation; version 2.
	 *
	 *    This program is distributed in the hope that it will be useful,
	 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
	 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	 *    GNU General Public License for more details.
	 *
	 *    You should have received a copy of the GNU General Public License
	 *    along with this program.  If not, see <http://www.gnu.org/licenses/>.
	 */


package com.dominionmobile.adev;


import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.io.IOException;
import java.io.ByteArrayOutputStream;


public class SocketTransport
{

    public static final String HANDSHAKE_STRING = "JDWP-Handshake";

    static Socket transportSocket;
    static InputStream input;
    static OutputStream output;

    //{{{	close()
    /**
     * Closes transport connection.
     */
    static void close()
    {
    	//System.out.println("\n--SocketTransport close()--");
        if ( input != null )
        {
        	try
        	{
        		if ( input != null )
        			input.close();
        	}
        	catch (IOException ioe)
        	{
        	}
        }
        
        if ( output != null )
        {
        	try
        	{
        		if ( output != null )
        			output.close();
        	}
        	catch (IOException ioe)
        	{
        	}
        }
        
        if ( (transportSocket != null) &&
        	(input == null) &&
        	(output == null) &&
        	(! transportSocket.isClosed()) )
        {
        	try
        	{
        		transportSocket.close();
        	}
        	catch (IOException ioe)
        	{
        	}
        }
    }	//}}}

    //{{{	isOpen()
    // Check if transport connection is open.
    public boolean isOpen()
    {
        return (transportSocket != null 
			&& transportSocket.isConnected() 
			&& !transportSocket.isClosed());
    }	//}}}

    //{{{	readPacket()
    // Read packet bytes from transport connection.
    static byte[] readPacket() throws IOException
    {
    	//System.out.println("\nSocketTransport, readPacket()");
        // Read packet header
        byte[] header = new byte[Constants.HEADER_SIZE];
        int iOffset = 0;

        while ( iOffset < Constants.HEADER_SIZE )
        {
            try
            {
                int bytesRead = input.read(header, iOffset, Constants.HEADER_SIZE - iOffset);
                //System.out.println("(Header)bytesRead: "+bytesRead);
                if ( bytesRead < 0 )
                {
                    break;
                }
                
                iOffset += bytesRead;
            }
            catch ( IOException e )
            {
                // Workaround for "Socket Closed" exception if connection was closed
                //System.out.println("(readPacket())Exception: "+e.toString());
                break;
            }
        }

        if ( iOffset == 0 )
        {
            return null;
        }
        
        if ( iOffset < Constants.HEADER_SIZE )
        {
            throw new IOException("Connection closed reading packet header");
        }

        // Extract packet length
        int len = Utils.getPacketLength(header);
        //System.out.println("len: "+len);
        if ( len < Constants.HEADER_SIZE )
        {
            throw new IOException("Wrong packet size: " + len);
        }
        
        // Allocate packet bytes and store header there 
        byte[] bytes = new byte[len];
        System.arraycopy(header, 0, bytes, 0, Constants.HEADER_SIZE);

        // Read packet data
        while ( iOffset < len )
        {
            int bytesRead = input.read(bytes, iOffset, len - iOffset);
            //System.out.println("(Data)bytesRead: "+bytesRead);
            if ( bytesRead < 0 )
            {
            	break;
            }
            
            iOffset += bytesRead;
        }
        
        if ( iOffset < len )
        {
            throw new IOException("Connection closed reading packet data");
        }
        
        return bytes;
    }	//}}}

    //{{{	writePacket()
    // Write packet bytes to transport connection.
    static void writePacket(byte[] packet) throws IOException
    {
    	//System.out.println("\nSocketTransport, writePacket()");
        output.write(packet);
        output.flush();
    }	//}}}

    //{{{	attach()
    static void attach(long lAttachTimeout, long lHandshakeTimeout) throws IOException
    {
    	//System.out.println("\nSocketTransport, attach()");
    	long lFinishTime = System.currentTimeMillis() + lAttachTimeout;
    	IOException exception = null;
    	
        try
        {
            do
            {
                try
                {
                    transportSocket = new Socket("localhost", Constants.PORT_NUMBER);
                    break;
                }
                catch (IOException e)
                {
                    Thread.sleep(4000);
                }
            }
            while ((lAttachTimeout == 0) || (System.currentTimeMillis() < lFinishTime));
        }
        catch (InterruptedException e)
        {
            throw new InterruptedIOException("Interruption in attaching to localhost");
        }
        
        if ( transportSocket == null )
        {
            if ( exception != null )
            {
                throw exception;
            }
            else
            {
                throw new SocketTimeoutException("Timeout exceeded in attaching to localhost");
            }
        }
        
        input = transportSocket.getInputStream();
        output = transportSocket.getOutputStream();

        handshake(lHandshakeTimeout);
    	
    }	//}}}
    
    //{{{	handshake()
	// Performs handshaking for given timeout.
    static void handshake(long handshakeTimeout) throws IOException
    {
    	//System.out.println("\nSocketTransport, handshake()");
        transportSocket.setSoTimeout((int)handshakeTimeout);
        
        try
        {
            output.write(HANDSHAKE_STRING.getBytes());
            output.flush();
            
/*            
            if ( output == null )
            	System.out.println("output null");
            else
            	System.out.println("output: "+output);
            
            if ( input == null )
            	System.out.println("input null");
            else
            	System.out.println("input: "+input);
/**/            
            
            int len = HANDSHAKE_STRING.length();
            //System.out.println("len: "+len);
            byte[] bytes = new byte[len];
            int iOffset = 0;
            int bytesRead;
            while ( iOffset < len )
            {
                bytesRead = input.read(bytes, iOffset, len - iOffset);
                //System.out.println("bytesRead: "+bytesRead);
                if ( bytesRead < 0 )
                {
                    break;
                }
                
                iOffset += bytesRead;
            }
            
            String response = new String(bytes, 0, iOffset);
            //System.out.println("response: '"+response+"'");
            if ( ! response.equals(HANDSHAKE_STRING) )
            {
                throw new IOException("Unexpected handshake response: " + response);
            }
        }
        finally
        {
            transportSocket.setSoTimeout(0);
        }
        
    }	//}}}

    //{{{	createStreams()
    // Creates I/O streams for connection socket.
    static void createStreams() throws IOException
    {
    	//System.out.println("\nSocketTransport, createStreams()");
    	
		try
		{
			transportSocket = new Socket("localhost", Constants.PORT_NUMBER);
		}
		catch (IOException e)
		{
			System.out.println("(SocketTransport)Exception: "+e.toString());
		}
		
		input = transportSocket.getInputStream();
		//System.out.println("input: "+input);
		output = transportSocket.getOutputStream();
		//System.out.println("output: "+output);
		
    }	//}}}
}
