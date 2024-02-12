
	/**
	 *	  ADev is a lightweight Android development tool
	 *
	 *	  Copyright (c) 2013 - 2024 Joseph Siebenmann
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

class VariableTableInfo
{
	String sName;			// The variable's name.
	long lCodeIndex;		// // First code index at which the variable is visible.
	String sSignature;		// The variable type's JNI signature.
	String[] sStringValue;	// The variable's String Value(s).
	int iLength;		// Unsigned value used in conjunction with codeIndex.
	int iSlot;			// The local variable's index in its frame
	long lObjectId;	
}


