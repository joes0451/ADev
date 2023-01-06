
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


public class Value
{

    private byte tag;

    private Number numberValue;

    private boolean booleanValue;

    private char charValue;

    /**
     * Creates new value with no tag.
     */
    public Value()
    {
        tag = Constants.TAG_VOID;	// ?
    }

    /**
     * Creates new ID value with specified tag.
     */
    public Value(byte tag, long value)
    {
        this.tag = tag;
        this.numberValue = new Long(value);
    }

    /**
     * Creates new byte value.
     */
    public Value(byte value)
    {
        this.tag = Constants.TAG_BYTE;
        this.numberValue = new Byte(value);
    }

    /**
     * Creates new short value.
     */
    public Value(short value)
    {
        this.tag = Constants.TAG_SHORT;
        this.numberValue = new Short(value);
    }

    /**
     * Creates new int value.
     */
    public Value(int value)
    {
        this.tag = Constants.TAG_INT;
        this.numberValue = new Integer(value);
    }

    /**
     * Creates new long value.
     */
    public Value(long value)
    {
        this.tag = Constants.TAG_LONG;
        this.numberValue = new Long(value);
    }

    /**
     * Creates new float value.
     */
    public Value(float value)
    {
        this.tag = Constants.TAG_FLOAT;
        this.numberValue = new Float(value);
    }

    /**
     * Creates new double value.
     */
    public Value(double value)
    {
        this.tag = Constants.TAG_DOUBLE;
        this.numberValue = new Double(value);
    }

    /**
     * Creates new boolean value.
     */
    public Value(boolean value)
    {
        this.tag = Constants.TAG_BOOLEAN;
        this.booleanValue = value;
    }

    /**
     * Creates new char value.
     */
    public Value(char value)
    {
        this.tag = Constants.TAG_CHAR;
        this.charValue = value;
    }

    /**
     * Returns tag of this value.
     * 
     * @return Returns the tag.
     */
    public byte getTag()
    {
        return tag;
    }

    /**
     * Returns byte representation of this value.
     * 
     * @return byte value
     */
    public byte getByteValue()
    {
        return numberValue.byteValue();
    }

    /**
     * Returns short representation of this value.
     * 
     * @return short value
     */
    public short getShortValue()
    {
        return numberValue.shortValue();
    }

    /**
     * Returns int representation of this value.
     * 
     * @return int value
     */
    public int getIntValue()
    {
        return numberValue.intValue();
    }

    /**
     * Returns long representation of this value.
     * 
     * @return long value
     */
    public long getLongValue()
    {
        return numberValue.longValue();
    }

    /**
     * Returns float representation of this value.
     * 
     * @return float value
     */
    public float getFloatValue()
    {
        return numberValue.floatValue();
    }

    /**
     * Returns double representation of this value.
     * 
     * @return double value
     */
    public double getDoubleValue()
    {
        return numberValue.doubleValue();
    }

    /**
     * Returns boolean representation of this value.
     * 
     * @return boolean value
     */
    public boolean getBooleanValue()
    {
        return booleanValue;
    }

    /**
     * Returns char representation of this value.
     * 
     * @return char value
     */
    public char getCharValue()
    {
        return charValue;
    }

}
