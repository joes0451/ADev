
/*
 * :folding=explicit:collapseFolds=1:
 */

	/**
	 *	  ADev is a lightweight Android development tool
	 *
	 *	  Copyright (c) 2020 - 2024 Joseph Siebenmann
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

import com.dominionmobile.adev.Value;

public class ArrayRegion
{
    private byte    tag;
    private int     length;
    private Value[] values;

   public ArrayRegion(byte tag, int length)
   {
        this.tag = tag;
        this.length = length;
        values = new Value[length];
    }

    public Value getValue(int index)
    {
        return values[index];
    }

    public void setValue(int index, Value value)
    {
        values[index] = value;
    }

    public int getLength()
    {
        return length;
    }
    
    public void setLength(int length)
    {
        this.length = length;
    }
    
    public byte getTag()
    {
        return tag;
    }
    
    public void setTag(byte tag)
    {
        this.tag = tag;
    }
}