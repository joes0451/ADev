/*
 *  Copyright (C) 2012 Roderick Baier
 *  
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  
 *  	http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License. 
 */

//package de.roderick.weberknecht;
package com.dominionmobile.adev;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import java.io.ByteArrayOutputStream;


public class WebSocketReceiver extends Thread
{
	private DataInputStream input = null;
	private WebSocket websocket = null;
	private WebSocketEventHandler eventHandler = null;

	private volatile boolean stop = false;

	
	public WebSocketReceiver(DataInputStream input, WebSocket websocket)
	{
		//System.out.println("WebSocketReceiver() constructor");
		this.input = input;
		this.websocket = websocket;
		this.eventHandler = websocket.getEventHandler();
	}

	public void run()
	{
		//System.out.println("WebSocketReceiver() run()");
		List<Byte> messageBytes = new ArrayList<Byte>();
/*
		if ( input == null )
			System.out.println("input null");
		else
			System.out.println("input not null");
/**/

		byte[] bBuffer;
		byte[] tBuf;
		int iBytesRead;
		int iBytesRemaining;
		int iBytesToRead;
		int iLen;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		while (!stop)
		{
			try
			{
				byte b = input.readByte();
				//System.out.println("(input.readByte())b: "+b);
				byte opcode = (byte) (b & 0xf);
				//System.out.println("opcode: "+opcode);
				byte length = input.readByte();
				//System.out.println("length: "+length);
				long payload_length = 0;
				if (length < 126) {
					payload_length = length;
				} else if (length == 126) {
					payload_length = ((0xff & input.readByte()) << 8) | (0xff & input.readByte());
				} else if (length == 127) {
					// Does work up to MAX_VALUE of long (2^63-1) after that minus values are returned.
					// However frames with such a high payload length are vastly unrealistic.
					// TODO: add Limit for WebSocket Payload Length.
					payload_length = input.readLong();
				}
				
				//System.out.println("payload_length: "+payload_length);
				
				bBuffer = new byte[(int)payload_length];
				//tBuf = new byte[6144];
				tBuf = new byte[5120];
				iLen = tBuf.length;
				//tBuf = new byte[(int)payload_length];
				
				baos.reset();
				iBytesRemaining = (int)payload_length;
				
				while ( true )
				{
					try
					{
						//System.out.println("iBytesRemaining: "+iBytesRemaining);
						if ( iBytesRemaining < iLen )
							iBytesToRead = iBytesRemaining;
						else
							iBytesToRead = iLen;
						
						//System.out.println("iBytesToRead: "+iBytesToRead);
						if ( iBytesToRead == 0 )
							break;
						
						iBytesRead = input.read(
							tBuf,
							0,
							//tBuf.length);
							iBytesToRead);
						
						
						//System.out.println("iBytesRead: "+iBytesRead);
						
						iBytesRemaining -= iBytesRead;

						baos.write(tBuf, 0, iBytesRead);
						
						//if ( baos.size() >= payload_length )
							//break;
						
					}
					catch (IOException ioe)
					{
						System.out.println("Exception: "+ioe.toString());
					}
				}
				
				//System.out.println("Dropped out");
				
				try
				{
					baos.flush();
					bBuffer = baos.toByteArray();
				}
				catch (IOException ioe)
				{
				}

				//System.out.println("\n");	
				for (int i = 0; i < payload_length; i++) 
				{
					messageBytes.add(bBuffer[i]);
/*					
					if ( (bBuffer[i] >= (byte)0x20) && (bBuffer[i] <= (byte)0x7e) )
						System.out.print((char)bBuffer[i]);
					else
						System.out.print("["+Integer.toHexString((int)bBuffer[i])+"]");
/**/
				}
				//System.out.println("\n");
				
				//System.out.println("(add() loop) Dropped out");
				
/*				
				for (int i = 0; i < payload_length; i++)
				{
					messageBytes.add(input.readByte());
				}
/**/

				//System.out.println("(readByte() loop)Dropped out");
				//System.out.println("messageBytes.size(): "+messageBytes.size());
				
				Byte[] message = messageBytes.toArray(new Byte[messageBytes.size()]);
				WebSocketMessage ws_message = new WebSocketMessage(message);
				
				// Add to queue..
				
				
				eventHandler.onMessage(ws_message);
				
				messageBytes.clear();
				
			}
			catch (IOException ioe)
			{
				System.out.println("run() Exception: "+ioe.toString());
				handleError();
			}
		}
		
		//System.out.println("Exiting run()");
	}

	public void stopit()
	{
		//System.out.println("WebSocketReceiver() stopit()");
		stop = true;
	}

	public boolean isRunning()
	{
		//System.out.println("WebSocketReceiver() isRunning()");
		return !stop;
	}

	private void handleError()
	{
		//System.out.println("WebSocketReceiver() handleError()");
		stopit();
		websocket.handleReceiverError();
	}
}
