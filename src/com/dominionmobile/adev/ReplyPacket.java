
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

public class ReplyPacket
{
	byte[] packet;

	public ReplyPacket(byte[] packet)
	{
		this.packet = packet;
	}
	
	public int getId()
	{
		int iId = (int)Utils.readFromByteArray(
			packet,
			Constants.ID_INDEX,
			Constants.INT_SIZE);

		return iId;		
	}
	
	public int getLength()
	{
		int iLength = (int)Utils.readFromByteArray(
			packet,
			Constants.LENGTH_INDEX,
			Constants.INT_SIZE);

		return iLength;		
	}
	
	public int getErrorCode()
	{
		int iErrorCode = (int)Utils.readFromByteArray(
			packet,
			Constants.ERROR_CODE_INDEX,
			Constants.ERROR_CODE_SIZE);
		
		return iErrorCode;
	}
	
	public byte[] toBytesArray()
	{
		return packet;		
	}

}

