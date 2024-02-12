
/*
 * :folding=explicit:collapseFolds=1:
 */

	/**
	 *	  ADev is a lightweight Android development tool
	 *
	 *	  Copyright (c) 2013 - 2024 Joseph Siebenmann
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


import java.util.List;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import com.dominionmobile.adev.TimeoutException;


public class PacketDispatcher extends Thread
{
    static CommandsSynchronyzer commandsSynchronyzer;
    private EventsSynchronyzer eventsSynchronyzer;
    private IOException connectionException;
	
	//{{{	EventsSynchronyzer
    private class EventsSynchronyzer
    {

        // List of received events.
        private List eventQueue;

        EventsSynchronyzer()
        {
            // Initialize eventQueue
            eventQueue = new ArrayList();
        }

        // Notifies thread that the new event has been received.
        public void notifyThread(EventPacket eventPacket)
                throws InterruptedException
        {
        	//System.out.println("PacketDispatcher EventsSynchronyzer, notifyThread()");
            synchronized (this)
            {
                // Add the event to eventQueue
                eventQueue.add(eventPacket);

                // Notify next waiting thread
                this.notify();
            }
        }

        // Wait for new event during timeout.
        public EventPacket waitForNextEvent(long timeout)
                throws InterruptedException, IOException
        {
            synchronized (this)
            {
                // If there is already received event in eventQueue,
                // then return it
                synchronized (eventQueue)
                {
                    if ( ! eventQueue.isEmpty() )
                    {
                        return (EventPacket)eventQueue.remove(0);
                    }

                    // If eventQueue is empty and connection is already closed
                    // re-raise the exception
                    if ( connectionException != null )
                        throw connectionException;
                }

                // Wait for the next event
                this.wait(timeout);

                synchronized (eventQueue)
                {
                    if ( !eventQueue.isEmpty() )
                    {
                        // Event received
                        EventPacket event = (EventPacket)eventQueue.remove(0);
                        return event;
                    }

                    if ( connectionException != null )
                    {
                        throw connectionException;
                    }
                }
            }

            // No events occurred during timeout
            throw new TimeoutException(false);
        }

        // Connection is closed. Notify all waiting threads.
        public void terminate()
        {
            synchronized (this)
            {
                this.notifyAll();
            }
        }
    }	//}}}

    //{{{	CommandsSynchronyzer
    /**
     * Internal class to synchronize jdwp commands. It sends command packets
     * through connection and returns replies.
     */
    class CommandsSynchronyzer
    {

        private int commandId;

        private Hashtable commands;
        private Hashtable replies;

        CommandsSynchronyzer()
        {
        	//System.out.println("CommandsSynchronyzer() constructor");
            commands = new Hashtable();
            replies = new Hashtable();

            // Set first command id to 1
            commandId = 1;
        }

        // Get the next Id for a command.
        private synchronized int getNextId()
        {
            return commandId++;
        }

        /**
         * Notifies thread that reply packet was received.
         */
        public void notifyThread(ReplyPacket replyPacket) throws IOException,
                InterruptedException
        {
        	//System.out.println("PacketDispatcher, CommandsSynchronyzer notifyThread()");
            synchronized (commands)
            {

                // Obtain the current command id
                Integer Id = new Integer(replyPacket.getId());

                // Obtain the current command packet by command id
                CommandPacket command = (CommandPacket)commands.remove(Id);
                if ( command == null )
                {
                    // Received reply's id that does not correspond to any command
                    throw new IOException("Reply id corresponds to no command. Id = "+ Id);
                }

                synchronized (command)
                {
                    // Put the reply in replies queue
                    synchronized (replies)
                    {
                        replies.put(new Integer(replyPacket.getId()),
                                replyPacket);
                    }
                    
                    // Notify waiting thread
                    command.notifyAll();
                }
            }
        }

        /**
         * Sends command and waits for the reply during timeout.
         */
        public ReplyPacket waitForReply(CommandPacket command, long timeout)
                throws InterruptedException, IOException
        {
        	//System.out.println("CommandsSynchronyzer waitForReply()");
            synchronized (command) 
            {
                // If connection is already closed reraise the exception
                if ( connectionException != null )
                {
                    throw connectionException;
                }

                // Obtain new command Id
                Integer Id = new Integer(getNextId());
                command.setId(Id.intValue());

                // Add command into commands hashtable
                synchronized (commands)
                {
                    commands.put(Id, command);
                    
                    // Write this package to connection
                    SocketTransport.writePacket(command.toBytesArray());
                }

                if ( connectionException != null )
                {
                    throw connectionException;
                }

                // Wait for reply
                command.wait(timeout);

                // Receive the reply
                ReplyPacket currentReply = null;
                synchronized (replies)
                {
                    currentReply = (ReplyPacket)replies.remove(Id);
                }
                
                // If reply is ok, return it
                if ( currentReply != null )
                {
                    return currentReply;
                }

                // If connection is already closed reraise the exception
                if ( connectionException != null )
                {
                	throw connectionException;
                }
            }
            
            // No event occurred during timeout
            throw new TimeoutException(false);
        }

        
        
        /**
         * Sends command without waiting for the reply and returns id of the
         * sent command.
         */
        public int sendCommand(CommandPacket command) throws IOException
        {

            // If connection is already closed reraise the exception
            if ( connectionException != null )
                throw connectionException;

            // Obtain new command id
            Integer Id = new Integer(getNextId());
            command.setId(Id.intValue());

            // Add command into commands hashtable
            synchronized (commands)
            {
                commands.put(Id, command);

                SocketTransport.writePacket(command.toBytesArray());
            }

            // If connection is already closed reraise the exception
            if ( connectionException != null )
            {
                throw connectionException;
            }

            return Id.intValue();

        }

        /**
         * Receives the reply during timeout for command with specified command ID.
         */
        public ReplyPacket receiveReply(int commandId, long timeout)
                throws InterruptedException, IOException
        {

            // If connection is already closed reraise the exception
            if ( connectionException != null )
                throw connectionException;

            // receive the reply
            ReplyPacket currentReply = null;
            long endTimeMlsecForWait = System.currentTimeMillis() + timeout;
            synchronized (replies)
            {
                while ( true )
                {
                    currentReply =
                    	(ReplyPacket)replies.remove(new Integer(commandId));
                    	
                    // If reply is ok, return it
                    if ( currentReply != null )
                    {
                        return currentReply;
                    }
                    
                    // If connection is already closed reraise the exception
                    if ( connectionException != null )
                    {
                        throw connectionException;
                    }
                    
                    if ( System.currentTimeMillis() >= endTimeMlsecForWait )
                    {
                        break;
                    }
                    
                    replies.wait(100);
                }
            }
            
            // No expected reply was found during timeout
            throw new TimeoutException(false);
        }

        /**
         * This method is called when connection is closed. It notifies all the
         * waiting threads.
         */
        public void terminate()
        {
        	//System.out.println("PacketDispatcher, terminate()");
            synchronized (commands)
            {
                // Enumerate all waiting commands
                for ( Enumeration en = commands.keys(); en.hasMoreElements(); )
                {
                    CommandPacket command =
                    	(CommandPacket)commands.get(en.nextElement());
                    	
                    synchronized (command)
                    {
                        // Notify the waiting object
                        command.notifyAll();
                    }
                }
            }
        }
    }	//}}}

    //{{{	PacketDispatcher()  constructor
    public PacketDispatcher()
    {
    	//System.out.println("\nPacketDispatcher constructor");
        commandsSynchronyzer = new CommandsSynchronyzer();
        eventsSynchronyzer = new EventsSynchronyzer();

        // Start the thread
        start();
    }	//}}}

    //{{{	run()
    // Reads packets from connection and dispatches them between waiting threads.
    public void run()
    {

        connectionException = null;

        try
        {
            // Start listening for replies
            while ( ! isInterrupted() )
            {

                // Read packet from transport
                byte[] packet = SocketTransport.readPacket();

                // Break cycle if empty packet
                if ( packet == null || packet.length == 0 )
                {
                	//System.out.println("PacketDispatcher run(), Empty packet, breaking..");
                    break;
                }
                
/*                
				if ( packet.length < 1000 )
				{
					System.out.println("\n");
					String sByte;
					int iL = 0;               
					for ( int j = 0; j < packet.length; j++ )
					{
						sByte = Integer.toHexString((int)packet[j]);
						if ( sByte.length() == 1 )
							System.out.print("0");
						else if ( sByte.length() > 2 )
							sByte = sByte.substring(6);
						
						System.out.print(sByte);
						System.out.print(" ");
	
						iL++;					
						if ( iL > 20 )
						{
							System.out.print("\n");
							iL = 0;
						}
					}
					System.out.println("\n");
				}
/**/               
                
                

                // Check flags
                if ( packet.length < Constants.FLAGS_INDEX )
                {
                	;
                	//System.out.println("PacketDispatcher, wrong packet size");
                }
                else
                {
                    int flag = packet[Constants.FLAGS_INDEX] & 0xFF;
                    if ( flag != 0 )
                    {
                        if ( flag != Constants.REPLY_PACKET_FLAG )
                        {
                        	;
                        	//System.out.println("PacketDispatcher, wrong packet flags");
                        }
                    }
                }

                // Check the reply flag
                if ( Utils.isReply(packet) )
                {
                	//System.out.println("REPLY");
                    // New reply
                    ReplyPacket replyPacket = new ReplyPacket(packet);

                    // Check for received reply packet length
                    int packetLength = replyPacket.getLength();
                    if ( packetLength < Constants.HEADER_SIZE )
                    {
                    	;
                    	//System.out.println("PacketDispatcher, received wrong packet length: "+packetLength);
                    }

					int replyID = replyPacket.getId();

                    commandsSynchronyzer.notifyThread(replyPacket);
                }
                else
                {
                    // New event
                    EventPacket eventPacket = new EventPacket(packet);

					ADev.getPutEventPacketAr(Constants.PUT, packet); 
					
					// Get RequestId..
					int iRequestId = (int)Utils.readFromByteArray(
						packet,					// byte[]
						Constants.ID_INDEX,		// iFrom
						Constants.INT_SIZE);	// iSize

					synchronized ( ADev.EventReplyObject )
					{
						try
						{
							(ADev.EventReplyObject).notify();
						}
						catch (IllegalMonitorStateException imse)
						{
							System.out.println("PacketDispatcher notify() Exception: "+imse.toString());
						}
					}
					
                    eventsSynchronyzer.notifyThread(eventPacket);
                }
            }

            // This exception is sent for all waiting threads
            connectionException = new TimeoutException(true);
        }
        catch (IOException e)
        {
            // Connection exception is sent for all waiting threads
            connectionException = e;

            e.printStackTrace();
        }
        catch (InterruptedException e)
        {
        	//System.out.println("PacketDispatcher Exception: "+e.toString());
            // Connection exception is sent for all waiting threads
            connectionException = new InterruptedIOException(e.getMessage());
            connectionException.initCause(e);

            e.printStackTrace();
        }

        // Notify all the waiting threads
        eventsSynchronyzer.terminate();
        commandsSynchronyzer.terminate();
    }	//}}}

    //{{{	receiveEvent()
    /**
     * Receives event from event queue if there are any events or waits during
     * timeout for any event occurrence.
     */
    public EventPacket receiveEvent(long timeout) throws IOException,
            InterruptedException, TimeoutException
    {
        return eventsSynchronyzer.waitForNextEvent(timeout);
    }	//}}}

    //{{{	performCommand(CommandPacket)
    // Send command packet and wait for reply packet during default timeout.
    public ReplyPacket performCommand(CommandPacket command)
            throws InterruptedException, IOException, TimeoutException
    {
        return performCommand(command, 3000);
    }	//}}}

    //{{{	performCommand(CommandPacket, long)
    // Send command packet and wait for reply during certain timeout.
    static ReplyPacket performCommand(CommandPacket command, long timeout)
            throws InterruptedException, IOException, TimeoutException
    {
    	//System.out.println("PacketDispatcher, performCommand(CommandPacket, long)");
        return commandsSynchronyzer.waitForReply(command, timeout);
    }	//}}}
    
    //{{{	sendCommand()
    // Send CommandPacket without waiting for the reply.
    static int sendCommand(CommandPacket command) throws IOException
    {
        return commandsSynchronyzer.sendCommand(command);
    }	//}}}

    //{{{	receiveReply()
    /**
     * Waits for reply for command which was sent before by 'sendCommand()' method.
     */
    public ReplyPacket receiveReply(int commandId, long timeout)
            throws InterruptedException, IOException, TimeoutException
    {
        return commandsSynchronyzer.receiveReply(commandId, timeout);
    }	//}}}

}
