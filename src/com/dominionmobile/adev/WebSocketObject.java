
	/**
	 *	  ADev is a lightweight Android development tool
	 *
	 *	  Copyright (c) 2013 - 2020 Joseph Siebenmann
	 *
	 *    This program is free software: you can redistribute it and/or modify
	 *    it under the terms of the GNU General  Public License as published by
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

public class WebSocketObject
//class WebSocketObject
{
	private static WebSocket webSocket;
	
	public WebSocketObject(WebSocket webSocket)
	{
		this.webSocket = webSocket;
	}

	//public WebSocket getWebSocket()
	//public static synchronized WebSocket getWebSocket()
	public static WebSocket getWebSocket()
	{
		return webSocket;
	}
}



