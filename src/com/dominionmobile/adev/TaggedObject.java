
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

// This class represents tagged-objectID value.
public class TaggedObject
{
    public byte tag;
    public long objectID;

    // Creates new value with empty tag.
    public TaggedObject()
    {
        tag = Constants.TAG_NO;
        objectID = 0;
    }

    // Creates new value with specified data.
    public TaggedObject(byte tag, long objectID)
    {
        this.tag = tag;
        this.objectID = objectID;
    }
}