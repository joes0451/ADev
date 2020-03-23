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

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;


public class WebSocket
{
	private static final String GUID = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
	private static final int VERSION = 13;
	
	static final byte OPCODE_TEXT = 0x1;
	static final byte OPCODE_BINARY = 0x2;
	static final byte OPCODE_CLOSE = 0x8;
	static final byte OPCODE_PING = 0x9;
	static final byte OPCODE_PONG = 0xA;
	
	private URI url = null;
	private WebSocketEventHandler eventHandler = null;
	
	private volatile boolean connected = false;
	
	private Socket socket = null;
	private DataInputStream input = null;
	private PrintStream output = null;
	
	private WebSocketReceiver receiver = null;
	private WebSocketHandshake handshake = null;
	
	private final Random random = new SecureRandom();
	
	public WebSocket(URI url)
	{
		this(url, null, null);
		//System.out.println("WebSocket() constructor1");
	}

	public WebSocket(URI url, String protocol)
	{
		this(url, protocol, null);
		//System.out.println("WebSocket() constructor2");
	}

	public WebSocket(URI url, String protocol, Map<String, String> extraHeaders)
	{
		//System.out.println("WebSocket() constructor3");
		this.url = url;
		handshake = new WebSocketHandshake(url, protocol, extraHeaders);
	}

	public void setEventHandler(WebSocketEventHandler eventHandler)
	{
		this.eventHandler = eventHandler;
	}

	public WebSocketEventHandler getEventHandler()
	{
		return this.eventHandler;
	}

	public void connect() throws WebSocketException
	{
		//System.out.println("WebSocket() connect()");
		try {
			if (connected) {
				throw new WebSocketException("already connected");
			}

			socket = createSocket();
			input = new DataInputStream(socket.getInputStream());
			output = new PrintStream(socket.getOutputStream());
/*		
			if ( output == null )
				System.out.println("output null");
			else
				System.out.println("output not null");
/**/
/*
			if ( handshake == null )
				System.out.println("handshake null");
			else
				System.out.println("handshake not null");
/**/
			output.write(handshake.getHandshake());

			boolean handshakeComplete = false;
			int len = 1000;
			byte[] buffer = new byte[len];
			int pos = 0;
			ArrayList<String> handshakeLines = new ArrayList<String>();

			while (!handshakeComplete) {
				int b = input.read();
				buffer[pos] = (byte) b;
				pos += 1;

				if (buffer[pos - 1] == 0x0A && buffer[pos - 2] == 0x0D) {
					String line = new String(buffer, "UTF-8");
					if (line.trim().equals("")) {
						handshakeComplete = true;
					} else {
						handshakeLines.add(line.trim());
					}

					buffer = new byte[len];
					pos = 0;
				}
			}
			
			//System.out.println("Handshake complete?");
/*
			for (String line : handshakeLines) {
				System.out.println(line);
			}
/**/

			handshake.verifyServerStatusLine(handshakeLines.get(0));
			handshakeLines.remove(0);

			HashMap<String, String> headers = new HashMap<String, String>();
			for (String line : handshakeLines) {
				String[] keyValue = line.split(": ", 2);
				headers.put(keyValue[0], keyValue[1]);
			}
			handshake.verifyServerHandshakeHeaders(headers);

			receiver = new WebSocketReceiver(input, this);
/*			
			if ( receiver == null )
				System.out.println("receiver null");
			else
				System.out.println("receiver not null");
/**/			
			
			receiver.start();
			connected = true;
			eventHandler.onOpen();
		}
		catch (WebSocketException wse)
		{
			System.out.println("connect Exception: "+wse.toString());
			throw wse;
		}
		catch (IOException ioe)
		{
			System.out.println("connect Exception: "+ioe.toString());
			throw new WebSocketException("error while connecting: " + ioe.getMessage(), ioe);
		}
		
		//System.out.println("Exiting connect()");
		
	}

	public synchronized void send(String data) throws WebSocketException
	{
		//System.out.println("WebSocket() send()");
		//System.out.println("send(): '"+data+"'");
		//System.out.println("connected: "+connected);
		
		if (!connected) {
			throw new WebSocketException("error while sending text data: not connected");
		}

		try {
			this.sendFrame(OPCODE_TEXT, true, data.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private synchronized void sendFrame(byte opcode, boolean masking, byte[] data) throws WebSocketException, IOException
	{
		//System.out.println("WebSocket() sendFrame()");
		int headerLength = 2; // This is just an assumed headerLength, as we use a ByteArrayOutputStream
		if (masking) {
			headerLength += 4;
		}
		ByteArrayOutputStream frame = new ByteArrayOutputStream(data.length + headerLength);

		byte fin = (byte) 0x80;
		byte startByte = (byte) (fin | opcode);
		frame.write(startByte);
		int length = data.length;
		int length_field = 0;

		if (length < 126) {
			if (masking) {
				length = 0x80 | length;
			}
			frame.write((byte) length);
		} else if (length <= 65535) {
			length_field = 126;
			if (masking) {
				length_field = 0x80 | length_field;
			}
			frame.write((byte) length_field);
			byte[] lengthBytes = intToByteArray(length);
			frame.write(lengthBytes[2]);
			frame.write(lengthBytes[3]);
		} else {
			length_field = 127;
			if (masking) {
				length_field = 0x80 | length_field;
			}
			frame.write((byte) length_field);
			// Since an integer occupies just 4 bytes we fill the 4 leading length bytes with zero
			frame.write(new byte[]{0x0, 0x0, 0x0, 0x0});
			frame.write(intToByteArray(length));
		}

		byte[] mask = null;
		if (masking) {
			mask = generateMask();
			frame.write(mask);

			for (int i = 0; i < data.length; i++) {
				data[i] ^= mask[i % 4];
			}
		}

		frame.write(data);
		output.write(frame.toByteArray());
		output.flush();
		//System.out.println("Exiting sendFrame()");
	}

	public void handleReceiverError()
	{
		//System.out.println("WebSocket() handleReceiverError()");
		try {
			if (connected) {
				close();
			}
		} catch (WebSocketException wse) {
			wse.printStackTrace();
		}
	}

	public synchronized void close() throws WebSocketException
	{
		//System.out.println("WebSocket() close()");
		if (!connected) {
			return;
		}

		sendCloseHandshake();

		if (receiver.isRunning()) {
			receiver.stopit();
		}

		closeStreams();

		eventHandler.onClose();
	}

	private synchronized void sendCloseHandshake() throws WebSocketException
	{
		//System.out.println("WebSocket() sendCloseHandshake()");
		if (!connected) {
			throw new WebSocketException("error while sending close handshake: not connected");
		}

		//System.out.println("Sending close");
		if (!connected) {
			throw new WebSocketException("error while sending close");
		}

		try {
			this.sendFrame(OPCODE_CLOSE, true, new byte[0]);
		} catch (IOException e) {
			e.printStackTrace();
		}

		connected = false;
	}

	private Socket createSocket() throws WebSocketException
	{
		//System.out.println("WebSocket() createSocket()");
		String scheme = url.getScheme();
		String host = url.getHost();
		int port = url.getPort();

		Socket socket = null;

		if (scheme != null && scheme.equals("ws")) {
			if (port == -1) {
				port = 80;
			}
			try {
				socket = new Socket(host, port);
			} catch (UnknownHostException uhe) {
				throw new WebSocketException("unknown host: " + host, uhe);
			} catch (IOException ioe) {
				throw new WebSocketException("error while creating socket to " + url, ioe);
			}
		} else if (scheme != null && scheme.equals("wss")) {
			if (port == -1) {
				port = 443;
			}
			try {
				SocketFactory factory = SSLSocketFactory.getDefault();
				socket = factory.createSocket(host, port);
			} catch (UnknownHostException uhe) {
				throw new WebSocketException("unknown host: " + host, uhe);
			} catch (IOException ioe) {
				throw new WebSocketException("error while creating secure socket to " + url, ioe);
			}
		} else {
			throw new WebSocketException("unsupported protocol: " + scheme);
		}

		return socket;
	}

	private byte[] generateMask()
	{
		final byte[] mask = new byte[4];
		random.nextBytes(mask);
		return mask;
	}

	private byte[] intToByteArray(int number)
	{
		byte[] bytes = ByteBuffer.allocate(4).putInt(number).array();
		return bytes;
	}

	private void closeStreams() throws WebSocketException
	{
		//System.out.println("WebSocket() closeStreams()");
		try {
			input.close();
			output.close();
			socket.close();
		} catch (IOException ioe) {
			throw new WebSocketException("error while closing websocket connection: ", ioe);
		}
	}

	public static int getVersion()
	{
		return VERSION;
	}
}
