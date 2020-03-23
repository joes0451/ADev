
	/**
	 *	  ADev is a lightweight Android development tool
	 *
	 *	  Copyright (c) 2013 - 2020 Joseph Siebenmann
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

import java.io.IOException;

/**
 * This exception is thrown if reading packet form JDWP connection is timed out.
 */
public class TimeoutException extends IOException
{


    private boolean wasConnectionClosed = false;
    
    /**
     * Create new exception instance.
     * @param connectionClosed is true if connection was normally closed
     *        before timeout exceeded 
     */
    public TimeoutException(boolean connectionClosed)
    {
        super(connectionClosed ? "Connection was closed" : "Timeout was exceeded");
        this.wasConnectionClosed = connectionClosed;
    }

    /**
     * Returns true if connection was normally closed before timeout exceeded.
     * @return true or false
     */
    public boolean isConnectionClosed()
    {
        return wasConnectionClosed;
    }
}
