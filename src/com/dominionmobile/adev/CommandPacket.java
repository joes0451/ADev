
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

public class CommandPacket
{
	byte[] packet;
	
	public CommandPacket(byte[] packet)
	{
		this.packet = packet;
	}

	public void setId(int iId)
	{
		// Overwrite Id..
		Utils.writeAtByteArray(
			(long)iId,				// lVal
			packet,					// byte[]
			Constants.ID_INDEX,		// iTo
			Constants.INT_SIZE);	// iSize

/*
			System.out.println("\nCommandPacket setId()");
			String sByte;
			System.out.println();		
			for ( int g = 0; g < packet.length; g++ )
			{
				sByte = Integer.toHexString((int)packet[g]);
				if ( sByte.length() == 1 )
					System.out.print("0");
				else if ( sByte.length() > 2 )
					sByte = sByte.substring(6);
				
				System.out.print(sByte);
				System.out.print(" ");
			}
			System.out.println();
/**/		
	}
	
	public byte[] toBytesArray()
	{
		return packet;
	}
}

