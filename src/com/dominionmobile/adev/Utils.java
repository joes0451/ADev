
/*
 * :folding=explicit:collapseFolds=1:
 */

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


import java.io.UnsupportedEncodingException;
import java.io.IOException;
import java.util.concurrent.Semaphore;
import java.util.regex.Pattern;

import com.dominionmobile.adev.Value;
import com.dominionmobile.adev.TaggedObject;
import com.dominionmobile.adev.ADev;

import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.File;


class Utils
{
	//{{{	Data
	private static Semaphore checkControl = new Semaphore(1);
	
	//}}}
	
	//{{{	processPath()
	/**
     * Remove double quotes
     * Flip '\' -> '/'
     */
	static String processPath(String inS)
	{
		StringBuffer sb = null;

		if ( (inS != null) && (! inS.equals("")) )
			sb = new StringBuffer(inS);
		else
			return inS;
		
		for ( int g = 0; g < sb.length(); )
		{
			if ( sb.charAt(g) == '\\' )
				sb.setCharAt(g, '/');
			else if ( sb.charAt(g) == (char)'"' )
			{
				sb.deleteCharAt(g);
				continue;
			}
			
			g++;
		}
		
		return sb.toString();
	}	//}}}

	//{{{	processRelativePath()
	/**
     * Remove double quotes
     * Flip '\' -> '/' and add trailing '/'
     */
	static String processRelativePath(String inS)
	{
		StringBuffer sb = null;

		if ( (inS != null) && (! inS.equals("")) )
			sb = new StringBuffer(inS);
		else
			return inS;
		
		for ( int g = 0; g < sb.length(); )
		{
			if ( sb.charAt(g) == '\\' )
				sb.setCharAt(g, '/');
			else if ( sb.charAt(g) == (char)'"' )
			{
				sb.deleteCharAt(g);
				continue;
			}
			
			g++;
		}

		if ( sb.charAt(sb.length() - 1) == '/' )
			;
		else
			sb.append('/');
		
		return sb.toString();
	}	//}}}

	//{{{	convertSignature()
	static String convertSignature(String sIn)
	{
		// Convert signature like: 'java.lang.NullPointerException'
		// to: 'Ljava/lang/NullPointerException;'
		
		StringBuffer sb = new StringBuffer();
		sb.append("L");
		
		for ( int j = 0; j < sIn.length(); j++ )
		{
			if ( sIn.charAt(j) == '.' )
				sb.append("/");
			else
				sb.append(sIn.charAt(j));
		}
		
		sb.append(";");
		
		return sb.toString();
	}	//}}}
	
	//{{{	convertToSlashes()
	static String convertToSlashes(String sIn)
	{
		
		StringBuffer sb = null;
		int iLoc = 0;
			
		if ( (sIn != null) && (sIn.length() > 0 ) )
		{
			sb = new StringBuffer(sIn);
			for ( ; iLoc < sb.length(); )
			{
				iLoc = sb.indexOf(".", iLoc);
				if ( iLoc != -1 )
				{
					sb.setCharAt(iLoc, '/');
				}
				else
					break;
				
				iLoc++;
			}
		}
		
		return sb.toString();
	}	//}}}

	//{{{	getRelativePath()
	static String getRelativePath(
		String sTargetPath, String sBasePath, String sPathSeparator)
	{
		
		boolean isDir = false;
		
		File f = new File(sTargetPath);
		isDir = f.isDirectory();
		
		//  We need the -1 argument to split to make sure we get a trailing 
		//  "" token if the base ends in the path separator and is therefore
		//  a directory. We require directory paths to end in the path
		//  separator -- otherwise they are indistinguishable from files.
		String[] baseSa = sBasePath.split(Pattern.quote(sPathSeparator), -1);
		String[] targetSa = sTargetPath.split(Pattern.quote(sPathSeparator), 0);
		
		//  First get all the common elements. Store them as a string,
		//  and also count how many of them there are. 
		String common = "";
		int commonIndex = 0;
		
		for ( int i = 0; i < targetSa.length && i < baseSa.length; i++ )
		{
			if ( targetSa[i].equals(baseSa[i]) )
			{
				common += targetSa[i] + sPathSeparator;
				commonIndex++;
			}
			else
				break;
		}
		
		if ( commonIndex == 0 )
		{
			return sTargetPath;
		}
		
		String sRelative = "";
		if ( baseSa.length == commonIndex )
		{
			sRelative = "." + sPathSeparator;
		}
		else
		{
			int numDirsUp = baseSa.length - commonIndex - (isDir?0:1);
			//  The number of directories we have to backtrack is the length of 
			//  the base path MINUS the number of common path elements, minus
			//  one because the last element in the path isn't a directory.
			for ( int i = 1; i <= (numDirsUp); i++ )
			{
				sRelative += ".." + sPathSeparator;
			}
		}
		
		// If we are comparing directories.. 
		if ( sTargetPath.length() > common.length() )
		{
			// It's OK, it isn't a directory
			sRelative += sTargetPath.substring(common.length());
		}

		if ( sRelative.charAt(sRelative.length() - 1) == '/' )
			sRelative = sRelative.substring(0, sRelative.length() - 1);
		
		return sRelative;
	}	//}}}
	
	//{{{	readFile()
	static byte[] readFile(int iInitialSize, String fileName)
	{
		//System.out.println("== readFile() ==");
		ByteArrayOutputStream baos = new ByteArrayOutputStream(iInitialSize);
		byte[] tempBuf = new byte[iInitialSize];
		
		int iBufLength = tempBuf.length;		
    	int bytes_read = 0;

		FileInputStream fis = null;

		try
		{
			File file = new File(fileName);
			fis = new FileInputStream(file);

			while ( true )
			{
				bytes_read = fis.read(tempBuf, 0, iBufLength);
				//System.out.println("bytes_read: "+bytes_read);
				if ( bytes_read == -1 )
				{
					// EOF
					break;
				}
	
				baos.write(tempBuf, 0, bytes_read);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if ( fis != null )
					fis.close();
			}
			catch (IOException ioe)
			{
			}
		}
		
		return baos.toByteArray();
		
	}	//}}}

	//{{{	GetSourceScope()
	static int[] GetSourceScope(byte[] inByte, ArrayList LineAr)
	{
		//System.out.println("\n== GetSourceScope() ==");
		int[] out = new int[2];
		int iStart;
		int iPEnd = 0;
		int iLine;
		int iLoc;
		int iLoc2;
		int iLoc4;
		int iLoc5;
		int iCbSave = 0;
		int iParenSave = 0;
		int iLen = 0;
		int iIndentlevel;
		char cChr;
		boolean bInComment = false;
		boolean bInLineComment = false;
		LineTableInfo lineTableInfo;
		String sSource = "";
		
		// !! Note:
		// It's possible that 'LineAr' could be null
		// because of a single line Interface Method..

		ADev.bMoveCursorToTop = true;
		
		out[0] = 0;		// Start of Parameter info past 0x0a
		out[1] = 0;		// Location of end '}'
		
		if ( inByte != null )
		{
			sSource = new String(inByte);
			iLen = sSource.length();
		}
		else
			return out;
		
		if ( (LineAr != null) && (LineAr.size() > 0) )
		{
			lineTableInfo = (LineTableInfo)LineAr.get(0);
			iStart = lineTableInfo.iLineNumber;
			
			// Scan to 0x0a of Start line..
			iLoc = 0;
			iLine = -1;		// So it will be zero based for the adjusted..
			
			for ( ; iLoc < iLen; iLoc++ )
			{
				iLoc = sSource.indexOf((char)0x0a, iLoc);
				if ( iLoc != -1 )
				{
					iLine++;
					if ( (iLine + 1) == iStart )
						break;
				}
				else
					break;
			}
			
			int iPCount = 0;
			int iCBSave = 0;
			String sParams;
			StringTokenizer sT;

			iLoc4 = iLoc;
			while ( true )
			{
				// Scan back to '{' taking into account comments..
				for ( iLoc4-- ; iLoc4 >= 0; iLoc4-- )
				{
					cChr = sSource.charAt(iLoc4);
					if ( cChr == '/' )
					{
						if ( sSource.charAt(iLoc4 - 1) == '*' )
						{
							// End of comment..
							bInComment = true;
						}
						
						if ( sSource.charAt(iLoc4 - 1) == '/' )
						{
							if ( iCBSave != 0 )
							{
								// '{' was inside line comment, so turn it off..
								iCBSave = 0;
							}
						}
					}
					
					if ( cChr == '*' )
					{
						if ( sSource.charAt(iLoc4 - 1) == '/' )
						{
							// Check for '/**/'..
							//             ^
							if ( ((iLoc4 + 2) < iLen ) && (sSource.charAt(iLoc4 + 1) == '*')
								&& (sSource.charAt(iLoc4 + 2) == '/') )
							{
								// Not at start of comment..
							}
							else
							{
								// Start of comment..
								bInComment = false;
							}
						}
					}
					
					if ( cChr == '{' )
					{
						if ( bInComment == false)
						{
							iCBSave = iLoc4;
							break;
						}
					}
				}	// End for..
				
				for ( ; sSource.charAt(iLoc4) != ')'; iLoc4-- );
				iPEnd = iLoc4;
				
				for ( ; sSource.charAt(iLoc4) != '('; iLoc4-- );
	
				sParams = sSource.substring((iLoc4 + 1), iPEnd);
				
				iLoc5 = sParams.indexOf(",");
				if ( iLoc5 != -1 )
					break;
				
				sT = new StringTokenizer(sParams);
				iPCount = sT.countTokens();
				
				if ( iPCount == 0 )
					break;
				
				if ( (iPCount & 1) == 0 )
					break;	// Even number..
					
			}	// End while..
			
			// An 0x0a could occur before we hit the '('			
			// Scan back to '('..
			for ( ; (iPEnd >= 0) && (sSource.charAt(iPEnd) != (char)'('); iPEnd-- );
			
			// Scan back to 0x0a to capture the start of the Param info..
			for ( ; (iPEnd >= 0) && (sSource.charAt(iPEnd) != (char)0x0a); iPEnd-- );
			
			// Set start of Parameter info past 0x0a..
			out[0] = iPEnd + 1;
			
			
			// Convert current iLoc location to a line number
			// in the source, which will become our 'zero' line..
			int iLoc6 = 0;
			iLine = -1;
			for ( ; iLoc6 < iLen; iLoc6++ )
			{
				iLoc6 = sSource.indexOf((char)0x0a, iLoc6);
				if ( iLoc6 != -1 )
				{
					iLine++;
					if ( iLoc6 > iLoc4 )
						break;
				}
				else
					break;
			}
			
			ADev.iSourceLineAdjust = iLine + 1;
			
			iLoc = iCBSave;
			iLoc++;		// get past..

			iIndentlevel = 1;
			bInComment = false;
			bInLineComment = false;
			
			// Find end '}' taking into account comments..
			for ( ; iLoc < iLen; iLoc++ )
			{
				cChr = sSource.charAt(iLoc);
				
				if ( cChr == (char)0x0a )
				{
					bInLineComment = false;		// Reset..
				}

				if ( cChr == '/' )
				{
					if ( sSource.charAt(iLoc + 1) == '/' )
					{
						bInLineComment = true;
					}
					
					if ( sSource.charAt(iLoc + 1) == '*' )
					{
						// Start of comment..
						bInComment = true;
					}
				}
				
				if ( cChr == '*' )
				{
					if ( sSource.charAt(iLoc + 1) == '/' )
					{
						// End of comment..
						bInComment = false;		// Reset..
					}
				}
				
				if ( cChr == '{' )
				{
					if ( (! bInComment) && (! bInLineComment) )
					{
						iIndentlevel++;
					}
				}
					
				if ( cChr == '}' )
				{
					if ( (! bInComment) && (! bInLineComment) )
					{
						iIndentlevel--;
						if ( iIndentlevel == 0 )
						{
							// Found end '}'..
							out[1] = iLoc + 1;
							break;
						}
					}
				}
			}	// End for..
		}
		return out;		
	}	//}}}
	
    //{{{	writeAtByteArray()
    protected static void writeAtByteArray(long lVal, byte[] ar, int iTo, int iSize)
    {
        for ( int i = 0; i < iSize; i++ )
        {
        	if ( (iTo + i) < ar.length )
        		ar[iTo + i] = (byte)(lVal >> 8 * (iSize - 1 - i));
        }
    }	//}}}

	//{{{	readFromByteArray()	
    protected static long readFromByteArray(byte[] ar, int iFrom, int iSize)
    {

        long lRet = 0;
        byte temp;
        for ( int i = 0; i < iSize; i++ )
        {
        	if ( (iFrom + i) < ar.length )
        	{
				temp = ar[iFrom + i];
				lRet = (lRet << 8) | (((long) temp) & 0xFF);
			}
        }
        
        return lRet;
    }	//}}}

    //{{{	isValuePrimitiveType()
    static boolean isValuePrimitiveType(byte tag)
    {
        switch (tag)
        {
			case (byte)Constants.TAG_ARRAY:
			{
				return false;
			}
			case (byte)Constants.TAG_BYTE:
			{
				return true;
			}
			case (byte)Constants.TAG_CHAR:
			{
				return true;
			}
			case (byte)Constants.TAG_OBJECT:
			{
				return false;
			}
			case (byte)Constants.TAG_FLOAT:
			{
				return true;
			}
			case (byte)Constants.TAG_DOUBLE:
			{
				return true;
			}
			case (byte)Constants.TAG_INT:
			{
				return true;
			}
			case (byte)Constants.TAG_LONG:
			{
				return true;
			}
			case (byte)Constants.TAG_SHORT:
			{
				return true;
			}
			case (byte)Constants.TAG_VOID:
			{
				return true;
			}
			case (byte)Constants.TAG_BOOLEAN:
			{
				return true;
			}
			case (byte)Constants.TAG_STRING:
			{
				return false;
			}
			case (byte)Constants.TAG_THREAD:
			{
				return false;
			}
			case (byte)Constants.TAG_THREAD_GROUP:
			{
				return false;
			}
			case (byte)Constants.TAG_CLASS_LOADER:
			{
				return false;
			}
			case (byte)Constants.TAG_CLASS_OBJECT:
			{
				return false;
			}
			case (byte)Constants.TAG_NO:
			{
				return true;
			}
			default:
			{
				return false;
			}
        }
    }	//}}}

    //{{{	filterObject()
    static String filterObject(String sIn)
    {
    	String sRet = "";
    	if ( (sIn != null) && (sIn.length() > 0) )
    		;
    	else
    		return sRet;
    	
    	byte[] bA = {(byte)0x5c};	// '\'
    	String sBackSlash = new String(bA);
    	
    	//System.out.println("sIn: '"+sIn+"'");
    	StringBuffer sB = new StringBuffer(sIn);
    	int iLoc = 0;

    	while ( true )
    	{
    		iLoc = sB.indexOf(sBackSlash, iLoc);
    		if ( iLoc != -1 )
    		{
    			sB.deleteCharAt(iLoc);
    		}
    		else
    			break;
    		
    		iLoc++;	// Next..
    	}
 
    	//System.out.println("(Return)sB: '"+sB.toString()+"'");
    	return sB.toString();
    }	//}}}
    
    //{{{	getStringValue()
    static String getStringValue(long lStringId)
    {
    	String stringValue = "";
    	
		stringValue = JDWPCommands.command_Value(lStringId);
		
		return stringValue;
    }	//}}}
    
    //{{{	getNextValueAsArrayRegion()
    static ArrayRegion getNextValueAsArrayRegion(int[] index, byte[] packet)
    {
        byte array_tag = getNextValueAsByte(index, packet);
        int array_length = getNextValueAsInt(index, packet);

        ArrayRegion array = new ArrayRegion(array_tag, array_length);

        for ( int i = 0; i < array_length; i++ )
        {
            if ( isValuePrimitiveType(array_tag) )
                array.setValue(i, getNextValueAsUntaggedValue(array_tag, index, packet));
            else
                array.setValue(i, getNextValueAsValue(index, packet));
        }
        
        return array;
    }	//}}}

    //{{{	getTypeLength()
    static int getTypeLength(int typeId)
    {
    	switch (typeId)
    	{
    		case Constants.REF_TYPE_BYTE:
    		case Constants.REF_TYPE_BOOLEAN:
    			return 1;
    			
    		case Constants.REF_TYPE_INT:
    			return 4;
    			
    		case Constants.REF_TYPE_LONG:
    			return 8;
    			
    		case Constants.REF_TYPE_SHORT:
    			return 2;
    			
    		case Constants.REF_TYPE_FLOAT:
    			return 4;
    			
    		case Constants.REF_TYPE_DOUBLE:
    			return 8;
    			
    		case Constants.REF_TYPE_VOID:
    			return 0;

			case Constants.REF_TYPE_REFERENCE_TYPE_ID:
				return ADev.iReferenceTypeIdSize;

			case Constants.REF_TYPE_METHOD_ID:
				return ADev.iMethodIdSize;

			case Constants.REF_TYPE_FIELD_ID:
				return ADev.iFieldIdSize;

			case Constants.REF_TYPE_FRAME_ID:
				return ADev.iFrameIdSize;

			case Constants.REF_TYPE_OBJECT_ID:
				return ADev.iObjectIdSize;
    			
    		case Constants.REF_TYPE_OBJECT:
    		case Constants.REF_TYPE_ARRAY:
    		case Constants.REF_TYPE_THREAD:
   			case Constants.REF_TYPE_THREAD_GROUP:
  			case Constants.REF_TYPE_CLASS_LOADER:
  			case Constants.REF_TYPE_CLASS_OBJECT:
    			return ADev.iObjectIdSize;
    			
    		default:
    			return -1;	// Error..
    	}
    }	//}}}

	//{{{	setNextValueAsObjectID()
    static void setNextValueAsObjectID(long val, int[] index, byte[] packet)
    {
        index[0] += ADev.iObjectIdSize;	// Next location..

        writeAtByteArray(
        	val,		// lVal
        	packet,		// byte[]
        	index[0] - ADev.iObjectIdSize,		// iTo
        	ADev.iObjectIdSize);				// iSize
    }	//}}}

    //{{{	getNextValueAsObjectID()
    static long getNextValueAsObjectID(int[] index, byte[] packet)
    {
        index[0] += ADev.iObjectIdSize;	// Next location..
                
        return (long)readFromByteArray(
        	packet,		// byte[]
        	index[0] - ADev.iObjectIdSize,	// iFrom
        	ADev.iObjectIdSize);	// iSize
    }	//}}}

    //{{{	setNextValueAsReferenceTypeID()
    static void setNextValueAsReferenceTypeID(long val, int[] index, byte[] packet)
    {
        setNextValueAsObjectID(val, index, packet);
    }	//}}}

    //{{{	getNextValueAsReferenceTypeID()
    static long getNextValueAsReferenceTypeID(int[] index, byte[] packet)
    {
        return getNextValueAsObjectID(index, packet);
    }	//}}}

    //{{{	setNextValueAsShort()
    static void setNextValueAsShort(short val, int[] index, byte[] packet)
    {
        index[0] += Constants.SHORT_SIZE;
        
        writeAtByteArray(
        	(long)val,
        	packet,
        	index[0] - Constants.SHORT_SIZE,
        	Constants.SHORT_SIZE);
    }	//}}}

    //{{{	getNextValueAsShort()
    static short getNextValueAsShort(int[] index, byte[] packet)
    {
        index[0] += Constants.SHORT_SIZE;
                
        return (short)readFromByteArray(
        	packet,
        	index[0] - Constants.SHORT_SIZE,
        	Constants.SHORT_SIZE);
    }	//}}}

    //{{{	setNextValueAsDouble(
    static void setNextValueAsDouble(double dval, int[] index, byte[] packet)
    {
        index[0] += getTypeLength(Constants.REF_TYPE_DOUBLE);

		long val = Double.doubleToLongBits(dval);        
        
        writeAtByteArray(
        	(long)val,
        	packet,
        	index[0] - getTypeLength(Constants.REF_TYPE_DOUBLE),
        	getTypeLength(Constants.REF_TYPE_DOUBLE));
    }	//}}}

    //{{{	getNextValueAsDouble()
    static double getNextValueAsDouble(int[] index, byte[] packet)
    {
        index[0] += getTypeLength(Constants.REF_TYPE_DOUBLE);
                
        long res = readFromByteArray(
        	packet,
        	index[0] - getTypeLength(Constants.REF_TYPE_DOUBLE),
        	getTypeLength(Constants.REF_TYPE_DOUBLE));

        return Double.longBitsToDouble(res);
    }	//}}}

    //{{{	setNextValueAsFloat(
    static void setNextValueAsFloat(float fval, int[] index, byte[] packet)
    {
        index[0] += getTypeLength(Constants.REF_TYPE_FLOAT);
        
        long val = Float.floatToIntBits(fval);
        
        writeAtByteArray(
        	(long)val,
        	packet,
        	index[0] - getTypeLength(Constants.REF_TYPE_FLOAT),
        	getTypeLength(Constants.REF_TYPE_FLOAT));
        
    }	//}}}

    //{{{	getNextValueAsFloat()
    static float getNextValueAsFloat(int[] index, byte[] packet)
    {
        index[0] += getTypeLength(Constants.REF_TYPE_FLOAT);
                
        long res = readFromByteArray(
        	packet,
        	index[0] - getTypeLength(Constants.REF_TYPE_FLOAT),
        	getTypeLength(Constants.REF_TYPE_FLOAT));

        return Float.intBitsToFloat((int)res);
    }	//}}}

    //{{{	setNextValueAsChar(
    static void setNextValueAsChar(char val, int[] index, byte[] packet)
    {
        index[0] += getTypeLength(Constants.REF_TYPE_CHAR);
        
        writeAtByteArray(
        	(long)val,
        	packet,
        	index[0] - getTypeLength(Constants.REF_TYPE_CHAR),
        	getTypeLength(Constants.REF_TYPE_CHAR));
    }	//}}}

    //{{{	getNextValueAsChar()
    static char getNextValueAsChar(int[] index, byte[] packet)
    {
        index[0] += getTypeLength(Constants.REF_TYPE_CHAR);
                
        return (char)readFromByteArray(
        	packet,
        	index[0] - getTypeLength(Constants.REF_TYPE_CHAR),
        	getTypeLength(Constants.REF_TYPE_CHAR));
    }	//}}}
    
	//{{{	setNextValueAsBoolean()
    static void setNextValueAsBoolean(boolean val, int[] index, byte[] packet)
    {
        if ( val )
        	packet[index[0]] = 1;
        else
        	packet[index[0]] = 0;
        	
        index[0] += Constants.BOOLEAN_SIZE;		// Set next location..

    }	//}}}

    //{{{	getNextValueAsBoolean()
    static boolean getNextValueAsBoolean(int[] index, byte[] packet)
    {
        int res = (int)packet[index[0]] & 0xFF;
        
        index[0] += Constants.BOOLEAN_SIZE;		// Set next location..
        
        return (res != 0);
    }	//}}}

	//{{{	setNextValueAsByte()
    static void setNextValueAsByte(byte val, int[] index, byte[] packet)
    {
        index[0] += Constants.BYTE_SIZE;
        
        packet[index[0] - Constants.BYTE_SIZE] = val;
    }	//}}}

    //{{{	getNextValueAsByte()
    static byte getNextValueAsByte(int[] index, byte[] packet)
    {
        index[0] += Constants.BYTE_SIZE;		// Set next location..
        
        return packet[index[0] - Constants.BYTE_SIZE];
    }	//}}}

    //{{{	setNextValueAsFieldID()
    static void setNextValueAsFieldID(long fieldID, int[] index, byte[] packet)
    {
        index[0] += ADev.iFieldIdSize;
        
        writeAtByteArray(
        	fieldID,
        	packet,
        	index[0] - ADev.iFieldIdSize,
        	ADev.iFieldIdSize);
    }	//}}}

	//{{{	getNextValueAsFieldID()
    static int getNextValueAsFieldID(int[] index, byte[] packet)
    {
        index[0] = index[0] + getTypeLength(Constants.REF_TYPE_FIELD_ID);
                
        long result = readFromByteArray(
        	packet,
        	index[0] - getTypeLength(Constants.REF_TYPE_FIELD_ID),
        	getTypeLength(Constants.REF_TYPE_FIELD_ID));
        
        return (int)result;
    }	//}}}

    //{{{	setNextValueAsLong()
    static void setNextValueAsLong(long val, int[] index, byte[] packet)
    {
        index[0] += Constants.LONG_SIZE;

        writeAtByteArray(
        	(long)val,
        	packet,
        	index[0] - Constants.LONG_SIZE,			// To
        	Constants.LONG_SIZE);
    }	//}}}

    //{{{	getNextValueAsLong()
    static long getNextValueAsLong(int[] index, byte[] packet)
    {
        index[0] += Constants.LONG_SIZE;		// Set next location..
                
        return readFromByteArray(
        	packet,		// byte[]
        	index[0] - Constants.LONG_SIZE,
        	Constants.LONG_SIZE);
    }	//}}}

	//{{{	getNextValueAsInt()    
    static int getNextValueAsInt(int[] index, byte[] packet)
    {
        index[0] += Constants.INT_SIZE;		// Set next location..
        
        return (int)readFromByteArray(
        	packet,
        	index[0] - Constants.INT_SIZE,
        	Constants.INT_SIZE);
    }	//}}}

    //{{{	setNextValueAsInt()
    static void setNextValueAsInt(int val, int[] index, byte[] packet)
    {
        index[0] += Constants.INT_SIZE;
        
        writeAtByteArray(
        	(long)val,		// long value
        	packet,		// byte[] array
        	index[0] - Constants.INT_SIZE,			// To
        	Constants.INT_SIZE);	// Value size
    }	//}}}

    //{{{	getNextValueAsString()
    static String getNextValueAsString(int[] index, byte[] packet)
    {
        int string_length = getNextValueAsInt(index, packet);
        String retS = "";

		// !! Note:
		// It looks like that if the string length is zero
		// there are no following string bytes.
        
        // Check for zero length..
        if ( string_length == 0 )
        	;
        else
        {
			try
			{
				retS = new String(packet, index[0], string_length, "UTF-8");
			}
			catch (UnsupportedEncodingException e)
			{
			}
	
			// Note:
			// The 'getNextValueAsInt()' above, adjusts
			// past the length bytes..
			index[0] += string_length;
		}
		
        return retS;
    }	//}}}

    //{{{	setNextValueAsString()
    static void setNextValueAsString(String val, int[] index, byte[] packet)
    {
        byte[] val_as_bytes = null;

		// String -> byte[]..        
        try
        {
            val_as_bytes = val.getBytes("UTF-8");
        }
        catch (UnsupportedEncodingException e)
        {
        	System.out.println("Exception: "+e.toString());
        }


		// Load leading 4 byte integer length..        
        writeAtByteArray(
        	(long)val_as_bytes.length,		// long value
        	packet,						// byte[] array
        	index[0],
        	Constants.INT_SIZE);			// Value size

		// Load String byte[]..        
        System.arraycopy(
        	val_as_bytes,	// src
        	0,				// srcPos
        	packet,		// dest
        	index[0] + Constants.INT_SIZE,
        	val_as_bytes.length);					// length
        
        // Update index..
        index[0] += (Constants.INT_SIZE + val_as_bytes.length);
        
    }	//}}}

	//{{{	setNextValueAsMethodID()
    static void setNextValueAsMethodID(long methodID, int[] index, byte[] packet)
    {
        index[0] += ADev.iMethodIdSize;	// Next location..
        
        writeAtByteArray(
        	methodID,
        	packet,		// byte[]
        	index[0] - ADev.iMethodIdSize,		// iTo
        	ADev.iMethodIdSize);				// iSize
        
    }	//}}}

	//{{{	getNextValueAsMethodID()
    static long getNextValueAsMethodID(int[] index, byte[] packet)
    {
        index[0] = index[0] + getTypeLength(Constants.REF_TYPE_METHOD_ID);
        
        long result = readFromByteArray(
        	packet,
        	index[0] - getTypeLength(Constants.REF_TYPE_METHOD_ID),
        	getTypeLength(Constants.REF_TYPE_METHOD_ID));
        
        return result;
    }	//}}}

    //{{{	setNextValueAsFrameID()
    static void setNextValueAsFrameID(long frameID, int[] index, byte[] packet)
    {
        index[0] += ADev.iFrameIdSize;

        writeAtByteArray(
        	frameID,
        	packet,
        	index[0] - ADev.iFrameIdSize,
        	ADev.iFrameIdSize);
    }	//}}}

    //{{{	getNextValueAsFrameID()
    static long getNextValueAsFrameID(int[] index, byte[] packet)
    {
        index[0] += getTypeLength(Constants.REF_TYPE_FRAME_ID);
        
        long result = readFromByteArray(
        	packet,
        	index[0] - getTypeLength(Constants.REF_TYPE_FRAME_ID),
        	getTypeLength(Constants.REF_TYPE_FRAME_ID));
        
        return result;
    }	//}}}
    
	//{{{	setNextValueAsValue()   
    static void setNextValueAsValue(Value value, int[] index, byte[] packet)
    {
        setNextValueAsByte(value.getTag(), index, packet);
        setNextValueAsUntaggedValue(value, index, packet);
    }	//}}}

    //{{{	getNextValueAsValue()
    static Value getNextValueAsValue(int[] index, byte[] packet)
    {
        byte tag = getNextValueAsByte(index, packet);
        return getNextValueAsUntaggedValue(tag, index, packet);
    }	//}}}

    //{{{	setNextValueAsTaggedObject()
    static void setNextValueAsTaggedObject(TaggedObject taggedObject, int[] index, byte[] packet)
    {
        setNextValueAsByte(taggedObject.tag, index, packet);
        setNextValueAsObjectID(taggedObject.objectID, index, packet);

    }	//}}}

    //{{{	getNextValueAsTaggedObject()
    static TaggedObject getNextValueAsTaggedObject(int[] index, byte[] packet)
    {
        TaggedObject taggedObject = new TaggedObject();
        taggedObject.tag = getNextValueAsByte(index, packet);
        taggedObject.objectID = getNextValueAsObjectID(index, packet);
        
        return taggedObject;
    }	//}}}

    //{{{	setNextValueAsUntaggedValue()
    static void setNextValueAsUntaggedValue(Value value, int[] index, byte[] packet)
    {
        switch (value.getTag())
        {
			case Constants.TAG_BOOLEAN:
				setNextValueAsBoolean(value.getBooleanValue(), index, packet);
				break;
			case Constants.TAG_BYTE:
				setNextValueAsByte(value.getByteValue(), index, packet);
				break;
			case Constants.TAG_CHAR:
				setNextValueAsChar(value.getCharValue(), index, packet);
				break;
			case Constants.TAG_DOUBLE:
				setNextValueAsDouble(value.getDoubleValue(), index, packet);
				break;
			case Constants.TAG_FLOAT:
				setNextValueAsFloat(value.getFloatValue(), index, packet);
				break;
			case Constants.TAG_INT:
				setNextValueAsInt(value.getIntValue(), index, packet);
				break;
			case Constants.TAG_LONG:
				setNextValueAsLong(value.getLongValue(), index, packet);
				break;
			case Constants.TAG_SHORT:
				setNextValueAsShort(value.getShortValue(), index, packet);
				break;
			case Constants.TAG_VOID:
				break;
			case Constants.TAG_STRING:
			case Constants.TAG_ARRAY:
			case Constants.TAG_CLASS_LOADER:
			case Constants.TAG_CLASS_OBJECT:
			case Constants.TAG_OBJECT:
			case Constants.TAG_THREAD_GROUP:
			case Constants.TAG_THREAD:
				setNextValueAsObjectID(value.getLongValue(), index, packet);
				break;
			default:
				;
        }
    }	//}}}

    //{{{	getNextValueAsUntaggedValue()
    static Value getNextValueAsUntaggedValue(byte tag, int[] index, byte[] packet)
    {
    	//System.out.println("\ngetNextValueAsUntaggedValue()");
        Value value = null;

/*        
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
        
		//System.out.println("index[0]: "+index[0]);        
        
        switch (tag)
        {
			case Constants.TAG_BOOLEAN:
				value = new Value(getNextValueAsBoolean(index, packet));
				break;
			case Constants.TAG_BYTE:
				value = new Value(getNextValueAsByte(index, packet));
				break;
			case Constants.TAG_CHAR:
				value = new Value(getNextValueAsChar(index, packet));
				break;
			case Constants.TAG_DOUBLE:
				value = new Value(getNextValueAsDouble(index, packet));
				break;
			case Constants.TAG_FLOAT:
				value = new Value(getNextValueAsFloat(index, packet));
				break;
			case Constants.TAG_INT:
				value = new Value(getNextValueAsInt(index, packet));
				break;
			case Constants.TAG_LONG:
				value = new Value(getNextValueAsLong(index, packet));
				break;
			case Constants.TAG_SHORT:
				value = new Value(getNextValueAsShort(index, packet));
				break;
			case Constants.TAG_STRING:
			case Constants.TAG_ARRAY:
			case Constants.TAG_CLASS_LOADER:
			case Constants.TAG_CLASS_OBJECT:
			case Constants.TAG_OBJECT:
			case Constants.TAG_THREAD_GROUP:
			case Constants.TAG_THREAD:
				value = new Value(tag, getNextValueAsObjectID(index, packet));
				break;
			default:
				;
        }
        
        return value;
    }	//}}}

    //{{{	getPacketLength()
    static int getPacketLength(byte[] p)
    {
        return (int)readFromByteArray(p, Constants.LENGTH_INDEX, Constants.INT_SIZE);
    }	//}}}

    //{{{	isReply(byte[])
    static boolean isReply(byte[] p)
    {
        if ( p.length < Constants.FLAGS_INDEX )
            return false;
        return (p[Constants.FLAGS_INDEX] & Constants.REPLY_PACKET_FLAG) != 0;
    }	//}}}

    //{{{	getErrorCode()
    static String getErrorCode(int iError)
    {
    	if ( iError == Constants.ERROR_NONE )
    		return "ERROR_NONE";
    	else if ( iError == Constants.ERROR_INVALID_THREAD )
    		return "ERROR_INVALID_THREAD";
    	else if ( iError == Constants.ERROR_INVALID_THREAD_GROUP )
    		return "ERROR_INVALID_THREAD_GROUP";
    	else if ( iError == Constants.ERROR_INVALID_PRIORITY )
    		return "ERROR_INVALID_PRIORITY";
    	else if ( iError == Constants.ERROR_THREAD_NOT_SUSPENDED )
    		return "ERROR_THREAD_NOT_SUSPENDED";
    	else if ( iError == Constants.ERROR_THREAD_SUSPENDED )
    		return "ERROR_THREAD_SUSPENDED";
    	else if ( iError == Constants.ERROR_THREAD_NOT_ALIVE )
    		return "ERROR_THREAD_NOT_ALIVE";
    	else if ( iError == Constants.ERROR_INVALID_OBJECT )
    		return "ERROR_INVALID_OBJECT";
    	else if ( iError == Constants.ERROR_INVALID_CLASS )
    		return "ERROR_INVALID_CLASS";
    	else if ( iError == Constants.ERROR_CLASS_NOT_PREPARED )
    		return "ERROR_CLASS_NOT_PREPARED";
    	else if ( iError == Constants.ERROR_INVALID_METHOD_ID )
    		return "ERROR_INVALID_METHOD_ID";
    	else if ( iError == Constants.ERROR_INVALID_LOCATION )
    		return "ERROR_INVALID_LOCATION";
    	else if ( iError == Constants.ERROR_INVALID_FIELD_ID )
    		return "ERROR_INVALID_FIELD_ID";
    	else if ( iError == Constants.ERROR_INVALID_FRAME_ID )
    		return "ERROR_INVALID_FRAME_ID";
    	else if ( iError == Constants.ERROR_NO_MORE_FRAMES )
    		return "ERROR_NO_MORE_FRAMES";
    	else if ( iError == Constants.ERROR_OPAQUE_FRAME )
    		return "ERROR_OPAQUE_FRAME";
    	else if ( iError == Constants.ERROR_NOT_CURRENT_FRAME )
    		return "ERROR_NOT_CURRENT_FRAME";
    	else if ( iError == Constants.ERROR_TYPE_MISMATCH )
    		return "ERROR_TYPE_MISMATCH";
    	else if ( iError == Constants.ERROR_NVALID_SLOT )
    		return "ERROR_NVALID_SLOT";
    	else if ( iError == Constants.ERROR_DUPLICATE )
    		return "ERROR_DUPLICATE";
    	else if ( iError == Constants.ERROR_NOT_FOUND )
    		return "ERROR_NOT_FOUND";
    	else if ( iError == Constants.ERROR_INVALID_MONITOR )
    		return "ERROR_INVALID_MONITOR";
    	else if ( iError == Constants.ERROR_NOT_MONITOR_OWNER )
    		return "ERROR_NOT_MONITOR_OWNER";
    	else if ( iError == Constants.ERROR_INTERRUPT )
    		return "ERROR_INTERRUPT";
    	else if ( iError == Constants.ERROR_INVALID_CLASS_FORMAT )
    		return "ERROR_INVALID_CLASS_FORMAT";
    	else if ( iError == Constants.ERROR_CIRCULAR_CLASS_DEFINITION )
    		return "ERROR_CIRCULAR_CLASS_DEFINITION";
    	else if ( iError == Constants.ERROR_FAILS_VERIFICATION )
    		return "ERROR_FAILS_VERIFICATION";
    	else if ( iError == Constants.ERROR_ADD_METHOD_NOT_IMPLEMENTED )
    		return "ERROR_ADD_METHOD_NOT_IMPLEMENTED";
    	else if ( iError == Constants.ERROR_SCHEMA_CHANGE_NOT_IMPLEMENTED )
    		return "ERROR_SCHEMA_CHANGE_NOT_IMPLEMENTED";
    	else if ( iError == Constants.ERROR_INVALID_TYPESTATE )
    		return "ERROR_INVALID_TYPESTATE";
    	else if ( iError == Constants.ERROR_HIERARCHY_CHANGE_NOT_IMPLEMENTED )
    		return "ERROR_HIERARCHY_CHANGE_NOT_IMPLEMENTED";
    	else if ( iError == Constants.ERROR_DELETE_METHOD_NOT_IMPLEMENTED )
    		return "ERROR_DELETE_METHOD_NOT_IMPLEMENTED";
    	else if ( iError == Constants.ERROR_UNSUPPORTED_VERSION )
    		return "ERROR_UNSUPPORTED_VERSION";
    	else if ( iError == Constants.ERROR_NAMES_DONT_MATCH )
    		return "ERROR_NAMES_DONT_MATCH";
    	else if ( iError == Constants.ERROR_CLASS_MODIFIERS_CHANGE_NOT_IMPLEMENTED )
    		return "ERROR_CLASS_MODIFIERS_CHANGE_NOT_IMPLEMENTED";
    	else if ( iError == Constants.ERROR_METHOD_MODIFIERS_CHANGE_NOT_IMPLEMENTED )
    		return "ERROR_METHOD_MODIFIERS_CHANGE_NOT_IMPLEMENTED";
    	else if ( iError == Constants.ERROR_NOT_IMPLEMENTED )
    		return "ERROR_NOT_IMPLEMENTED";
    	else if ( iError == Constants.ERROR_NULL_POINTER )
    		return "ERROR_NULL_POINTER";
    	else if ( iError == Constants.ERROR_ABSENT_INFORMATION )
    		return "ERROR_ABSENT_INFORMATION";
    	else if ( iError == Constants.ERROR_INVALID_EVENT_TYPE )
    		return "ERROR_INVALID_EVENT_TYPE";
    	else if ( iError == Constants.ERROR_ILLEGAL_ARGUMENT )
    		return "ERROR_ILLEGAL_ARGUMENT";
    	else if ( iError == Constants.ERROR_OUT_OF_MEMORY )
    		return "ERROR_OUT_OF_MEMORY";
    	else if ( iError == Constants.ERROR_ACCESS_DENIED )
    		return "ERROR_ACCESS_DENIED";
    	else if ( iError == Constants.ERROR_VM_DEAD )
    		return "ERROR_VM_DEAD";
    	else if ( iError == Constants.ERROR_INTERNAL )
    		return "ERROR_INTERNAL";
    	else if ( iError == Constants.ERROR_UNATTACHED_THREAD )
    		return "ERROR_UNATTACHED_THREAD";
    	else if ( iError == Constants.ERROR_INVALID_TAG )
    		return "ERROR_INVALID_TAG";
    	else if ( iError == Constants.ERROR_ALREADY_INVOKING )
    		return "ERROR_ALREADY_INVOKING";
    	else if ( iError == Constants.ERROR_INVALID_INDEX )
    		return "ERROR_INVALID_INDEX";
    	else if ( iError == Constants.ERROR_INVALID_LENGTH )
    		return "ERROR_INVALID_LENGTH";
    	else if ( iError == Constants.ERROR_INVALID_STRING )
    		return "ERROR_INVALID_STRING";
    	else if ( iError == Constants.ERROR_INVALID_CLASS_LOADER )
    		return "ERROR_INVALID_CLASS_LOADER";
    	else if ( iError == Constants.ERROR_INVALID_ARRAY )
    		return "ERROR_INVALID_ARRAY";
    	else if ( iError == Constants.ERROR_TRANSPORT_LOAD )
    		return "ERROR_TRANSPORT_LOAD";
    	else if ( iError == Constants.ERROR_TRANSPORT_INIT )
    		return "ERROR_TRANSPORT_INIT";
    	else if ( iError == Constants.ERROR_NATIVE_METHOD )
    		return "ERROR_NATIVE_METHOD";
    	else if ( iError == Constants.ERROR_INVALID_COUNT )
    		return "ERROR_INVALID_COUNT";
    	else
    		return "UNDEFINED";
    }	//}}}
    
    //{{{	getHeaderInfo()
	protected static void getHeaderInfo(int[] iHeader, byte[] packet )
	{
		// [0] = Length
		// [1] = Id
		// [2] = Flags
		// [3] = Error Code
		// Get Header values..
		iHeader[0] = (int)readFromByteArray(packet, Constants.LENGTH_INDEX, Constants.INT_SIZE);			// Length
		iHeader[1] = (int)readFromByteArray(packet, Constants.ID_INDEX, Constants.INT_SIZE);					// Id
		iHeader[2] = (int)readFromByteArray(packet, Constants.FLAGS_INDEX, Constants.BYTE_SIZE);				// Flags

		// Check if it's a reply..
		if ( iHeader[2] == (int)0x80 )
		{
			// Reply..
			// Indicates if the command packet that is being replied too was successfully processed.
			// A value of zero indicates success, a non-zero value indicates an error.
			iHeader[3] = (int)readFromByteArray(packet, Constants.ERROR_CODE_INDEX, Constants.SHORT_SIZE);	// Error Code
			if ( iHeader[3] != 0 )
			{
				System.out.println(getErrorCode(iHeader[3]));
			}
		}
		else
		{
			// Command..
			;
		}

	}	//}}}

    //{{{	buildHeader()
    protected static byte[] buildHeader(
    	int iCommand, int iCommandSet, int[] iPacketId, int iPacketDataLength)
    {
    	// Build header..
    	// The unique Id gets added in PacketDispatcher
    	byte[] header = new byte[Constants.HEADER_SIZE];

    	int iLen = iPacketDataLength + Constants.HEADER_SIZE;
    	
    	for ( int g = 0; g < Constants.HEADER_SIZE; g++ )
    		header[g] = (byte)0x00;
    	
    	writeAtByteArray(iLen, header, Constants.LENGTH_INDEX, Constants.INT_SIZE);			// Length

		// Flags only used in Reply..    	
		header[Constants.COMMAND_SET_INDEX] = (byte)iCommandSet;
		header[Constants.COMMAND_INDEX] = (byte)iCommand;

		return header;		
    	
    }	//}}}
    
    //{{{	buildHeaderWithData()
    protected static byte[] buildHeaderWithData(
    	int iCommand, int iCommandSet, int[] iPacketId, byte[] data, int iDataLength)
    {
    	//System.out.println("\nbuildHeaderWithData");
    	// Build header..
    	// The unique Id gets added in PacketDispatcher
    	byte[] packet = new byte[Constants.HEADER_SIZE + iDataLength];	// Constants.HEADER_SIZE = 11
    	//System.out.println("(Original)packet.length: "+packet.length);

    	int iLen = iDataLength + Constants.HEADER_SIZE;
    	
    	for ( int g = 0; g < packet.length; g++ )
    		packet[g] = (byte)0x00;
    	
    	writeAtByteArray(
    		iLen,		// lVal
    		packet,		// ar
    		Constants.LENGTH_INDEX,		// iTo
    		Constants.INT_SIZE);		// iSize

		// Flags only used in Reply..   	
		packet[Constants.COMMAND_SET_INDEX] = (byte)iCommandSet;
		packet[Constants.COMMAND_INDEX] = (byte)iCommand;
		
		//System.out.println("iDataLength: "+iDataLength);
		//System.out.println("packet.length: "+packet.length);
		//System.out.println("data.length: "+data.length);

		try
		{		
			// Load Data..
			System.arraycopy(
				data,		// src
				0,			// srcPos
				packet,		// dest
				Constants.HEADER_SIZE,	// destPos
				iDataLength);			// length
		}
		catch (IndexOutOfBoundsException ioobe)
		{
			System.out.println("Exception: "+ioobe.toString());
		}
		catch (NullPointerException npe)
		{
			System.out.println("Exception: "+npe.toString());
		}

		return packet;		
    	
    }	//}}}

}

