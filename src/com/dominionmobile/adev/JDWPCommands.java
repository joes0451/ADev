
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

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Vector;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import com.dominionmobile.adev.ADev;
import com.dominionmobile.adev.Value;
import java.io.IOException;

class JDWPCommands
{

	//{{{	command_Name()	Thread name	
	static String command_Name(long lThreadId)
	{
		//System.out.println("\n** command_Name() **");
		// Returns the Thread name..

		// Construct the Data packet..
		byte[] dataPacket = new byte[32];
		for ( int g = 0; g < 32; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..
		
		// Load the 'threadId'..		
		Utils.setNextValueAsObjectID(lThreadId, index, dataPacket);

		int iDataLength = index[0];
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_NAME,					// Command
			Constants.COMMAND_SET_THREAD_REFERENCE,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..

		
		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		long lTimeout = Constants.REPLY_NORMAL_TIMEOUT;
		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(command_Name())(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(command_Name())(performCommand())Exception: "+ie.toString());
		}
		
		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}
		
		String threadNameS = "";

		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			index[0] = 11;	// Reset starting location..
			
			threadNameS = Utils.getNextValueAsString(index, replyPacket);
		}

		return threadNameS;		
	}	//}}}

	//{{{	command_Signature()
	static String command_Signature(long lRefType)
	{
		//System.out.println("** command_Signature() **");
		// Returns the JNI signature of a reference type.

		// Construct the Data packet..
		byte[] dataPacket = new byte[32];
		for ( int g = 0; g < 32; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..

		// Load..		
		Utils.setNextValueAsReferenceTypeID(lRefType, index, dataPacket);
		
		int iDataLength = index[0];
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_SIGNATURE,			// Command
			Constants.COMMAND_SET_REFERENCE_TYPE,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..

		
		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(command_Signature())(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(command_Signature())(performCommand())Exception: "+ie.toString());
		}
		
		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}

		String signatureS = "";
		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			index[0] = 11;	// Reset starting location..
			
			signatureS = Utils.getNextValueAsString(index, replyPacket);
		}

		return signatureS;		
	}	//}}}

	//{{{	command_ClassObject()
	static long command_ClassObject(long lReferenceTypeId)
	{
		// Returns the class object corresponding to this type.
		//System.out.println("command_ClassObject()");
		
		// Construct the Data packet..
		byte[] dataPacket = new byte[32];
		for ( int g = 0; g < 32; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..
		
		Utils.setNextValueAsReferenceTypeID(lReferenceTypeId, index, dataPacket);

		int iDataLength = index[0];
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_CLASS_OBJECT,			// Command
			Constants.COMMAND_SET_REFERENCE_TYPE,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..

		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(command_ClassObject())(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(command_ClassObject())(performCommand())Exception: "+ie.toString());
		}

		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}
		
		long lClassObjectId = 0;
		
		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			index[0] = 11;	// Reset starting location..
			
			// classObjectID same as objectId
			lClassObjectId = Utils.getNextValueAsObjectID(index, replyPacket);
		}
		
		return lClassObjectId;		
	}	//}}}
	
	//{{{	command_ReferenceType()
	static long command_ReferenceType(long lObjectId)
	{
		// Returns the runtime type of the object. The runtime type will be a class or an array.
		//System.out.println("command_ReferenceType()");

		// Construct the Data packet..
		byte[] dataPacket = new byte[32];
		for ( int g = 0; g < 32; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..

		// Load..		
		Utils.setNextValueAsObjectID(lObjectId, index, dataPacket);
		
		int iDataLength = index[0];
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_REFERENCE_TYPE,		// Command
			Constants.COMMANS_SET_OBJECT_REFERENCE,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..

		
		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(performCommand())Exception: "+ie.toString());
		}
		
		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}

		long lReferenceTypeId = 0;
		
		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			index[0] = 11;	// Reset starting location..

			byte bRefTypeTag = Utils.getNextValueAsByte(index, replyPacket);
			
			lReferenceTypeId = Utils.getNextValueAsReferenceTypeID(index, replyPacket);
		}
		
		return lReferenceTypeId;

	}	//}}}

	//{{{	command_Dispose()
	static void command_Dispose()
	{
		// Invalidates this virtual machine mirror. The communication channel to the target VM is closed.

		// Construct packet..
		int iPacketDataLength = 0;
		int iPacketLength = 0;

		iPacketLength = iPacketDataLength + Constants.HEADER_SIZE;
		
		int[] iPacketId = new int[1];
		
		byte[] header = Utils.buildHeader(
			Constants.COMMAND_DISPOSE,				// Command
			Constants.COMMAND_SET_VIRTUAL_MACHINE,	// CommandSet
			iPacketId,
			iPacketDataLength);		// Packet data length..


		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(header);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(performCommand())Exception: "+ie.toString());
		}

		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}

		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
		}
		
	}	//}}}
	
	//{{{	command_Suspend()	No reply
	static void command_Suspend(long lThreadId)
	{
		//System.out.println("** command_Suspend() **");
		// Suspends the thread.
		
		// Construct the Data packet..
		byte[] dataPacket = new byte[32];
		for ( int g = 0; g < 32; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..
		
		// Load the 'threadId'..		
		Utils.setNextValueAsObjectID(lThreadId, index, dataPacket);
		
		int iDataLength = index[0];
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_SUSPEND,		// Command
			Constants.COMMAND_SET_THREAD_REFERENCE,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..

		
		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;
		int iReturnId;

		try
		{		
			iReturnId = PacketDispatcher.sendCommand(command);
		}
		catch (IOException ioe)
		{
			System.out.println("(performCommand())Exception: "+ioe.toString());
		}
		
	}	//}}}

	//{{{	command_ResumeThread()	(ThreadReference)	No reply
	static void command_ResumeThread(long lThreadId)
	{
		//System.out.println("\n** command_ResumeThread() **");
		// Resumes the execution of a given thread.
		
		// Construct the Data packet..
		byte[] dataPacket = new byte[32];
		for ( int g = 0; g < 32; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..
		
		// Load the 'threadId'..		
		Utils.setNextValueAsObjectID(lThreadId, index, dataPacket);

		int iDataLength = index[0];
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_RESUME_THREAD,		// Command
			Constants.COMMAND_SET_THREAD_REFERENCE,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..

		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;
		int iReturnId;

		try
		{		
			iReturnId = PacketDispatcher.sendCommand(command);
		}
		catch (IOException ioe)
		{
			System.out.println("(performCommand())Exception: "+ioe.toString());
		}
		
	}	//}}}

	//{{{	command_Resume()	(VirtualMachine)	No reply *
	static void command_Resume()
	{
		//System.out.println("\n** command_Resume() **");
		// Resumes execution of the application after the suspend command or an event has stopped it.
		// Construct packet..
		int iPacketDataLength = 0;
		int iPacketLength = 0;

		iPacketLength = iPacketDataLength + Constants.HEADER_SIZE;
		
		int[] iPacketId = new int[1];
		
		byte[] header = Utils.buildHeader(
			Constants.COMMAND_RESUME_VM,			// Command
			Constants.COMMAND_SET_VIRTUAL_MACHINE,	// CommandSet
			iPacketId,
			iPacketDataLength);		// Packet data length..

		
		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(header);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(performCommand())Exception: "+ie.toString());
		}
		
		byte[] replyPacket = null;
		if ( reply != null )		
			replyPacket = reply.toBytesArray();
		
	}	//}}}

	//{{{	command_ClearAllBreakpoints()	No reply
	static void command_ClearAllBreakpoints()
	{
		//System.out.println("\n** command_ClearAllBreakpoints() **");
		// Removes all set breakpoints, a no-op if there are no breakpoints set.
		
		// Construct packet..
		int iPacketDataLength = 0;
		int iPacketLength = 0;

		iPacketLength = iPacketDataLength + Constants.HEADER_SIZE;
		
		int[] iPacketId = new int[1];
		
		byte[] header = Utils.buildHeader(
			Constants.COMMAND_CLEAR_ALL_BREAKPOINTS,	// Command
			Constants.COMMAND_SET_EVENT_REQUEST,		// CommandSet
			iPacketId,
			iPacketDataLength);		// Packet data length..

		
		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(header);

		ReplyPacket reply = null;
		int iReturnId;

		try
		{		
			iReturnId = PacketDispatcher.sendCommand(command);
		}
		catch (IOException ioe)
		{
			System.out.println("(performCommand())Exception: "+ioe.toString());
		}
		
	}	//}}}

	//{{{	command_Status()
	static void command_Status(long lThreadId, int[] iStatus)
	{
		//System.out.println("\n** command_Status() **");
		// Returns the current status of a thread.
		
		// Construct the Data packet..
		byte[] dataPacket = new byte[32];
		for ( int g = 0; g < 32; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..
		
		// Load the 'threadId'..		
		Utils.setNextValueAsObjectID(lThreadId, index, dataPacket);
		
		int iDataLength = index[0];
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_STATUS,		// Command
			Constants.COMMAND_SET_THREAD_REFERENCE,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..
		
		
		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(performCommand())Exception: "+ie.toString());
		}
		
		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}

		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			index[0] = 11;	// Starting location..
	
			iStatus[0] = Utils.getNextValueAsInt(index, replyPacket);
			iStatus[1] = Utils.getNextValueAsInt(index, replyPacket);
		}
		
	}	//}}}

	//{{{	command_SuspendCount()
	static int command_SuspendCount(long lThreadId)
	{
		//System.out.println("\n** command_SuspendCount() **");
		// Get the suspend count for this thread.
		
		// Construct the Data packet..
		byte[] dataPacket = new byte[32];
		for ( int g = 0; g < 32; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..

		// Load the 'threadId'..		
		Utils.setNextValueAsObjectID(lThreadId, index, dataPacket);

		int iDataLength = index[0];
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_SUSPEND_COUNT,		// Command
			Constants.COMMAND_SET_THREAD_REFERENCE,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..

	
		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(performCommand())Exception: "+ie.toString());
		}
		
		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}
		
		int iSuspendCount = 0;
		
		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			index[0] = 11;	// Starting location..
	
			iSuspendCount = Utils.getNextValueAsInt(index, replyPacket);
		}

		return 	iSuspendCount;	
	}	//}}}

	//{{{	command_Capabilities()	
	static void command_Capabilities()
	{
		// Retrieve this VM's capabilities.

/*		
		bCanWatchFieldModification: false
		bCanWatchFieldAccess: false
		bCanGetBytecodes: false
		bCanGetSyntheticAttribute: false
		bCanGetOwnedMonitorInfo: false
		bCanGetCurrentContendedMonitor: false
		bCanGetMonitorInfo: false
/**/

		// Construct packet..
		int iPacketDataLength = 0;
		int iPacketLength = 0;

		iPacketLength = iPacketDataLength + Constants.HEADER_SIZE;
		
		int[] iPacketId = new int[1];
		
		byte[] header = Utils.buildHeader(
			Constants.COMMAND_CAPABILITIES,			// Command
			Constants.COMMAND_SET_VIRTUAL_MACHINE,	// CommandSet
			iPacketId,
			iPacketDataLength);		// Packet data length..


		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(header);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(performCommand())Exception: "+ie.toString());
		}
		
		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}

		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			int[] index = new int[1];		
			index[0] = 11;	// Reset starting location..
			
			boolean bCanWatchFieldModification = Utils.getNextValueAsBoolean(index, replyPacket);
			//System.out.println("bCanWatchFieldModification: "+bCanWatchFieldModification);
	
			boolean bCanWatchFieldAccess = Utils.getNextValueAsBoolean(index, replyPacket);
			//System.out.println("bCanWatchFieldAccess: "+bCanWatchFieldAccess);
	
			boolean bCanGetBytecodes = Utils.getNextValueAsBoolean(index, replyPacket);
			//System.out.println("bCanGetBytecodes: "+bCanGetBytecodes);
	
			boolean bCanGetSyntheticAttribute = Utils.getNextValueAsBoolean(index, replyPacket);
			//System.out.println("bCanGetSyntheticAttribute: "+bCanGetSyntheticAttribute);
	
			boolean bCanGetOwnedMonitorInfo = Utils.getNextValueAsBoolean(index, replyPacket);
			//System.out.println("bCanGetOwnedMonitorInfo: "+bCanGetOwnedMonitorInfo);
	
			boolean bCanGetCurrentContendedMonitor = Utils.getNextValueAsBoolean(index, replyPacket);
			//System.out.println("bCanGetCurrentContendedMonitor: "+bCanGetCurrentContendedMonitor);
	
			boolean bCanGetMonitorInfo = Utils.getNextValueAsBoolean(index, replyPacket);
			//System.out.println("bCanGetMonitorInfo: "+bCanGetMonitorInfo);
		}
		
	}	//}}}

	//{{{	command_CapabilitiesNew()	
	static void command_CapabilitiesNew()
	{
		// Retrieve all of this VM's capabilities.
		
/*
     bCanWatchFieldModification: false
     bCanWatchFieldAccess: false
     bCanGetBytecodes: false
     bCanGetSyntheticAttribute: true
     bCanGetOwnedMonitorInfo: false
     bCanGetCurrentContendedMonitor: false
     bCanGetMonitorInfo: false
     bCanRedefineClasses: false
     bCanAddMethod: false
     bCanUnrestrictedlyRedefineClasses: false
     bCanPopFrames: false
     bCanUseInstanceFilters: false
     bCanGetSourceDebugExtension: false
     bCanRequestVMDeathEvent: false
     bCanSetDefaultStratum: false
     bCanGetInstanceInfo: false
     bCanRequestMonitorEvents: false
/**/     
     
		// Construct packet..
		int iPacketDataLength = 0;
		int iPacketLength = 0;

		iPacketLength = iPacketDataLength + Constants.HEADER_SIZE;
		
		int[] iPacketId = new int[1];
		
		byte[] header = Utils.buildHeader(
			Constants.COMMAND_CAPABILITIES_NEW,			// Command
			Constants.COMMAND_SET_VIRTUAL_MACHINE,	// CommandSet
			iPacketId,
			iPacketDataLength);		// Packet data length..


		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(header);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(performCommand())Exception: "+ie.toString());
		}
		
		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}

		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			int[] index = new int[1];		
			index[0] = 11;	// Reset starting location..
			
			boolean bCanWatchFieldModification = Utils.getNextValueAsBoolean(index, replyPacket);
			//System.out.println("bCanWatchFieldModification: "+bCanWatchFieldModification);
	
			boolean bCanWatchFieldAccess = Utils.getNextValueAsBoolean(index, replyPacket);
			//System.out.println("bCanWatchFieldAccess: "+bCanWatchFieldAccess);
	
			boolean bCanGetBytecodes = Utils.getNextValueAsBoolean(index, replyPacket);
			//System.out.println("bCanGetBytecodes: "+bCanGetBytecodes);
	
			boolean bCanGetSyntheticAttribute = Utils.getNextValueAsBoolean(index, replyPacket);
			//System.out.println("bCanGetSyntheticAttribute: "+bCanGetSyntheticAttribute);
	
			boolean bCanGetOwnedMonitorInfo = Utils.getNextValueAsBoolean(index, replyPacket);
			//System.out.println("bCanGetOwnedMonitorInfo: "+bCanGetOwnedMonitorInfo);
	
			boolean bCanGetCurrentContendedMonitor = Utils.getNextValueAsBoolean(index, replyPacket);
			//System.out.println("bCanGetCurrentContendedMonitor: "+bCanGetCurrentContendedMonitor);
	
			boolean bCanGetMonitorInfo = Utils.getNextValueAsBoolean(index, replyPacket);
			//System.out.println("bCanGetMonitorInfo: "+bCanGetMonitorInfo);
	
			boolean bCanRedefineClasses = Utils.getNextValueAsBoolean(index, replyPacket);
			//System.out.println("bCanRedefineClasses: "+bCanRedefineClasses);
			
			boolean bCanAddMethod = Utils.getNextValueAsBoolean(index, replyPacket);
			//System.out.println("bCanAddMethod: "+bCanAddMethod);
	
			boolean bCanUnrestrictedlyRedefineClasses = Utils.getNextValueAsBoolean(index, replyPacket);
			//System.out.println("bCanUnrestrictedlyRedefineClasses: "+bCanUnrestrictedlyRedefineClasses);
			
			boolean bCanPopFrames = Utils.getNextValueAsBoolean(index, replyPacket);
			//System.out.println("bCanPopFrames: "+bCanPopFrames);
			
			boolean bCanUseInstanceFilters = Utils.getNextValueAsBoolean(index, replyPacket);
			//System.out.println("bCanUseInstanceFilters: "+bCanUseInstanceFilters);
			
			boolean bCanGetSourceDebugExtension = Utils.getNextValueAsBoolean(index, replyPacket);
			//System.out.println("bCanGetSourceDebugExtension: "+bCanGetSourceDebugExtension);
			
			boolean bCanRequestVMDeathEvent = Utils.getNextValueAsBoolean(index, replyPacket);
			//System.out.println("bCanRequestVMDeathEvent: "+bCanRequestVMDeathEvent);
			
			boolean bCanSetDefaultStratum = Utils.getNextValueAsBoolean(index, replyPacket);
			//System.out.println("bCanSetDefaultStratum: "+bCanSetDefaultStratum);
			
			boolean bCanGetInstanceInfo = Utils.getNextValueAsBoolean(index, replyPacket);
			//System.out.println("bCanGetInstanceInfo: "+bCanGetInstanceInfo);

			boolean bCanRequestMonitorEvents = Utils.getNextValueAsBoolean(index, replyPacket);
			//System.out.println("bCanRequestMonitorEvents: "+bCanRequestMonitorEvents);
		}
		
	}	//}}}

	//{{{	command_AllThreads()	
	static void command_AllThreads()
	{
		//System.out.println("\n** command_AllThreads() **");
		// Returns all threads currently running in the target VM
		// Construct packet..
		int iPacketDataLength = 0;
		int iPacketLength = 0;

		iPacketLength = iPacketDataLength + Constants.HEADER_SIZE;
		
		int[] iPacketId = new int[1];
		
		byte[] header = Utils.buildHeader(
			Constants.COMMAND_ALL_THREADS,			// Command
			Constants.COMMAND_SET_VIRTUAL_MACHINE,	// CommandSet
			iPacketId,
			iPacketDataLength);		// Packet data length..

		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(header);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(command_AllThreads())(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(command_AllThreads())(performCommand())Exception: "+ie.toString());
		}
		
		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}
		
		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			int[] index = new int[1];
			index[0] = 11;	// Starting location..
	
			ADev.AllThreadsAr = new ArrayList();
			
			int iThreadIndex;
			long lThreadId;
			Long LVal;
			
			int iNumThreads = Utils.getNextValueAsInt(index, replyPacket);
			//System.out.println("iNumThreads: "+iNumThreads);
			
			for ( iThreadIndex = 0; iThreadIndex < iNumThreads; iThreadIndex++ )
			{
				lThreadId = Utils.getNextValueAsObjectID(index, replyPacket);
				//System.out.println("lThreadId: "+lThreadId);
	
				// Add..			
				LVal = new Long(lThreadId);
				ADev.AllThreadsAr.add((Long)LVal);
			}
		}
	}	//}}}

	//{{{	command_AllClassesWithGeneric()	
	static void command_AllClassesWithGeneric(String sMatch)
	{
		//System.out.println("\n** command_AllClassesWithGeneric() **");
		//System.out.println("sMatch: '"+sMatch+"'");
		// Returns reference types for all classes currently loaded by the target VM.
		// Construct packet..
		int iPacketDataLength = 0;
		int iPacketLength = 0;

		iPacketLength = iPacketDataLength + Constants.HEADER_SIZE;
		
		int[] iPacketId = new int[1];
		
		byte[] header = Utils.buildHeader(
			Constants.COMMAND_ALL_CLASSES_WITH_GENERIC,			// Command
			Constants.COMMAND_SET_VIRTUAL_MACHINE,		// CommandSet
			iPacketId,
			iPacketDataLength);		// Packet data length..


		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(header);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_LONGER_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(command_AllClassesWithGeneric())(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(command_AllClassesWithGeneric())(performCommand())Exception: "+ie.toString());
		}
		
		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}
		
		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			int[] iHeaderInfo = new int[4];
			Utils.getHeaderInfo(iHeaderInfo, replyPacket);
	
			int[] index = new int[1];
			index[0] = 11;	// Starting location..
	
			int iClassIndex;
			byte byte_Kind;
			String signatureS;
			String genericSignatureS;
			int iStatus;
			long lRefTypeId_RefType;
			
			int iLoc;
			int iLoc2;
			int iLoc3;
			int iNumClasses = Utils.getNextValueAsInt(index, replyPacket);
			//System.out.println("iNumClasses: "+iNumClasses);
			
			ADev.AllClassesAr = new ArrayList();
			ClassInfo classInfo;
			
			for ( iClassIndex = 0; iClassIndex < iNumClasses; iClassIndex++ )
			{
				//System.out.println("---------------------------------------------");
				byte_Kind = Utils.getNextValueAsByte(index, replyPacket);
				//System.out.println("byte_Kind: "+byte_Kind);
				
				lRefTypeId_RefType = Utils.getNextValueAsReferenceTypeID(index, replyPacket);
				//System.out.println("lRefTypeId_RefType: "+Long.toHexString(lRefTypeId_RefType));

				// Like:  'Lcom/dominionmobile/android/weather/MainActivity;'				
				signatureS = Utils.getNextValueAsString(index, replyPacket);
				//System.out.println("signatureS: '"+signatureS+"'");
				
				iLoc = signatureS.indexOf(sMatch);
				if ( (iLoc != -1) && (byte_Kind == (byte)Constants.TYPE_TAG_CLASS) )
				{
					//System.out.println("--------------------------------------");
					classInfo = new ClassInfo();
					classInfo.sSignature = signatureS;
					//System.out.println("classInfo.sSignature: '"+classInfo.sSignature+"'");
					classInfo.byte_refTypeTag = byte_Kind;
					//System.out.println("classInfo.byte_refTypeTag: '"+classInfo.byte_refTypeTag+"'");
					classInfo.lTypeId = lRefTypeId_RefType;
					//System.out.println("classInfo.lTypeId: "+classInfo.lTypeId+"  "+Long.toHexString(classInfo.lTypeId));
					//System.out.println("classInfo.lTypeId: "+classInfo.lTypeId);
					
					ADev.AllClassesAr.add((ClassInfo)classInfo);
				}
				
				iLoc2 = signatureS.indexOf("java/lang/Throwable");
				if ( iLoc2 != -1 )
				{
					ADev.lThrowableRefTypeId = lRefTypeId_RefType;
				}
				
				genericSignatureS = Utils.getNextValueAsString(index, replyPacket);
				//System.out.println("genericSignatureS: '"+genericSignatureS+"'");
				
				iStatus = Utils.getNextValueAsInt(index, replyPacket);
				//System.out.println("iStatus: "+iStatus);
			}
		}
	}	//}}}

	//{{{	command_SourceFile()
	static	String command_SourceFile(long lClassId)
	{
		// Returns like:  'HourlyActivity.java'
		//System.out.println("\n** command_SourceFile() **");
		//System.out.println("lClassId: "+lClassId);
		// Returns the name of source file in which a reference type was declared.
		
		// Construct the Data packet..
		byte[] dataPacket = new byte[32];
		for ( int g = 0; g < 32; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..
		
		// Load the 'referenceTypeID'..		
		Utils.setNextValueAsReferenceTypeID(lClassId, index, dataPacket);

		int iDataLength = index[0];
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_SOURCE_FILE,			// Command
			Constants.COMMAND_SET_REFERENCE_TYPE,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..

		
		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_LONGER_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(command_SourceFile())(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(command_SourceFile())(performCommand())Exception: "+ie.toString());
		}
		
		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}
		
		String sSourceFile = "";
		
		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			index[0] = 11;	// Reset starting location..
			
			sSourceFile = Utils.getNextValueAsString(index, replyPacket);
			//System.out.println("sSourceFile: '"+sSourceFile+"'");
		}
		
		return sSourceFile;
	}	//}}}
	
	//{{{	command_IDSizes()
	static void command_IDSizes()
	{
		// Construct packet..
		//System.out.println("** command_IDSizes() **");
		// Returns the sizes of variably-sized data types in the target VM.
		
		// iFieldIdSize: 4
		// iMethodIdSize: 4
		// iObjectIdSize: 8
		// iReferenceTypeIdSize: 8
		// iFrameIdSize: 8

		int iPacketDataLength = 0;
		int iPacketLength = 0;

		iPacketLength = iPacketDataLength + Constants.HEADER_SIZE;
		
		int[] iPacketId = new int[1];
		
		byte[] header = Utils.buildHeader(
			Constants.COMMAND_IDSIZES,			// Command
			Constants.COMMAND_SET_VIRTUAL_MACHINE,	// CommandSet
			iPacketId,
			iPacketDataLength);		// Packet data length..
		
		
		/*
		 * Get ready to send..
		 */

		CommandPacket command = new CommandPacket(header);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(performCommand())Exception: "+ie.toString());
		}
		
		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}
		
		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			int[] index = new int[1];
			index[0] = 11;	// Starting location..
	
			ADev.iFieldIdSize = Utils.getNextValueAsInt(index, replyPacket);
			//System.out.println("iFieldIdSize: "+ADev.iFieldIdSize);
			
			ADev.iMethodIdSize = Utils.getNextValueAsInt(index, replyPacket);
			//System.out.println("iMethodIdSize: "+ADev.iMethodIdSize);
			
			ADev.iObjectIdSize = Utils.getNextValueAsInt(index, replyPacket);
			//System.out.println("iObjectIdSize: "+ADev.iObjectIdSize);
			
			ADev.iReferenceTypeIdSize = Utils.getNextValueAsInt(index, replyPacket);
			//System.out.println("iReferenceTypeIdSize: "+ADev.iReferenceTypeIdSize);
			
			ADev.iFrameIdSize = Utils.getNextValueAsInt(index, replyPacket);
			//System.out.println("iFrameIdSize: "+ADev.iFrameIdSize);
		}
		
	}	//}}}

	//{{{	command_MethodsWithGeneric()
	static void command_MethodsWithGeneric(long lRefType)
	{
		//System.out.println("\n** command_MethodsWithGeneric() **");
		//System.out.println("lRefType: "+lRefType);
		// Returns information, including the generic signature if any, for each method in a reference type
		
		// Construct the Data packet..
		byte[] dataPacket = new byte[32];
		for ( int g = 0; g < 32; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..
		
		// Load the 'refType'..		
		Utils.setNextValueAsObjectID(lRefType, index, dataPacket);
		
		int iDataLength = index[0];
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_METHODS_WITH_GENERIC,	// Command
			Constants.COMMAND_SET_REFERENCE_TYPE,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..

		
		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(command_MethodsWithGeneric())(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(command_MethodsWithGeneric())(performCommand())Exception: "+ie.toString());
		}
		
		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}
		
		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			index[0] = 11;	// Reset starting location..
	
			int iMethodIndex;
			long lMethodId;
			int iModBits;
			String methodNameS;
			String signatureS;
			String sGenericSignature;
			
			ADev.AllMethodsAr = new ArrayList();
			MethodInfo methodInfo;
			
			int iNumDeclared = Utils.getNextValueAsInt(index, replyPacket);
			//System.out.println("iNumDeclared: "+iNumDeclared);
			
			for ( iMethodIndex = 0; iMethodIndex < iNumDeclared; iMethodIndex++ )
			{
				//System.out.println("---------------------------------------------");
				
				lMethodId = Utils.getNextValueAsMethodID(index, replyPacket);
				//System.out.println("lMethodId: "+lMethodId);
				
				methodNameS = Utils.getNextValueAsString(index, replyPacket);
				//System.out.println("methodNameS: '"+methodNameS+"'");
				
				signatureS = Utils.getNextValueAsString(index, replyPacket);
				//System.out.println("signatureS: '"+signatureS+"'");
	
				sGenericSignature = Utils.getNextValueAsString(index, replyPacket);
				//System.out.println("sGenericSignature: '"+sGenericSignature+"'");

				// Note:
				// These are the 'Access flags'
				// Defined like: ACC_PUBLIC = 0x0001 				
				iModBits = Utils.getNextValueAsInt(index, replyPacket);
				//System.out.println("iModBits: "+iModBits);
				
				methodInfo = new MethodInfo();
				methodInfo.lMethodId = lMethodId;
				methodInfo.sName = methodNameS;
				methodInfo.sSignature = signatureS;
				methodInfo.iModBits = iModBits;
				
				ADev.AllMethodsAr.add((MethodInfo)methodInfo);
			}
		}
	}	//}}}

	//{{{	command_FieldsWithGeneric()	
	static void command_FieldsWithGeneric(long lReferenceTypeId)
	{
		// Where 'lReferenceTypeId' is the ClassId
		// All Class variables..
		//System.out.println("\n** command_FieldsWithGeneric() **");		
		// Returns information for each field in a reference type.

		// Construct the Data packet..
		byte[] dataPacket = new byte[32];
		for ( int g = 0; g < 32; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..
		
		Utils.setNextValueAsReferenceTypeID(lReferenceTypeId, index, dataPacket);
		
		int iDataLength = index[0];
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_FIELDS_WITH_GENERIC,	// Command
			Constants.COMMAND_SET_REFERENCE_TYPE,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..

		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_LONGER_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(command_FieldsWithGeneric())(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(command_FieldsWithGeneric())(performCommand())Exception: "+ie.toString());
		}
		
		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}

		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			index[0] = 11;	// Starting location..
	
			ADev.FieldsAr = new ArrayList();
			FieldsInfo fieldsInfo;
	
			int iFieldIndex;		
			int iDeclared;
			int iFieldId;
			String sName;
			String sSignature;
			String sGenericSignature;
			int iModBits;
			
			
			iDeclared = Utils.getNextValueAsInt(index, replyPacket);
			//System.out.println("iDeclared: "+iDeclared);
			
			for ( iFieldIndex = 0; iFieldIndex < iDeclared; iFieldIndex++ )
			{
				//System.out.println("---------------------------------------------");
				
				iFieldId = Utils.getNextValueAsFieldID(index, replyPacket);
				//System.out.println("iFieldId: "+iFieldId+"   "+Integer.toHexString(iFieldId));			
	
				sName = Utils.getNextValueAsString(index, replyPacket);
				//System.out.println("sName: '"+sName+"'");
	
				sSignature = Utils.getNextValueAsString(index, replyPacket);
				//System.out.println("sSignature: '"+sSignature+"'");
				
				sGenericSignature = Utils.getNextValueAsString(index, replyPacket);
				//System.out.println("sGenericSignature: '"+sGenericSignature+"'");
	
				iModBits = Utils.getNextValueAsInt(index, replyPacket);
				//System.out.println("iModBits: "+iModBits);
				
				fieldsInfo = new FieldsInfo();
				fieldsInfo.lFieldId = iFieldId;
				fieldsInfo.sName = sName;
				fieldsInfo.sSignature = sSignature;
				fieldsInfo.iModBits = iModBits;
				
				// Add..			
				ADev.FieldsAr.add((FieldsInfo)fieldsInfo);
			}
		}
	}	//}}}

	//{{{	command_Length()	ArrayReference
	static int command_Length(long lObjectId)
	{
		// Returns the number of components in a given array.
		//System.out.println("\n** command_Length() **");

		// Construct the Data packet..
		byte[] dataPacket = new byte[32];
		for ( int g = 0; g < 32; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..
		
		// Load the 'ObjectID'..		
		Utils.setNextValueAsObjectID(lObjectId, index, dataPacket);
		
		int iDataLength = index[0];
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_LENGTH,		// Command
			Constants.COMMAND_SET_ARRAY_REFERENCE,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..


		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(performCommand())Exception: "+ie.toString());
		}
		
		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}
		
		int iLength = 0;
		
		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			index[0] = 11;	// Reset starting location..
			
			iLength = Utils.getNextValueAsInt(index, replyPacket);
			//System.out.println("iLength: "+iLength);
		}
		
		return iLength;		
	}	//}}}

	//{{{	command_Clear()		No reply *
	static void command_Clear(byte bEventKind, int iRequestId)
	{
		//System.out.println("\n** command_Clear() **");
		// Clear an event request.
		//System.out.println("iRequestId: "+iRequestId+"  "+Integer.toHexString(iRequestId));
		
		// Construct the Data packet..
		byte[] dataPacket = new byte[32];
		for ( int g = 0; g < 32; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..

		Utils.setNextValueAsByte(bEventKind, index, dataPacket);
		Utils.setNextValueAsInt(iRequestId, index, dataPacket);

		int iDataLength = index[0];
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_CLEAR,				// Command
			Constants.COMMAND_SET_EVENT_REQUEST,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..

		
		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;
		int iReturnId;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(performCommand())Exception: "+ie.toString());
		}

		byte[] replyPacket = null;
		if ( reply != null )		
			replyPacket = reply.toBytesArray();
		
	} //}}}
	
	//{{{	command_GetValuesArray()
	static void command_GetValuesArray(
		long lObjectId,		// Array ObjectId
		int iFirstIndex,	// The first index to retrieve.
		int iLength)		// The number of components to retrieve. 
	{
		// Returns a range of array components.
		//System.out.println("\n** command_GetValuesArray() **");
		//System.out.println("lObjectId: "+lObjectId+"  "+Long.toHexString(lObjectId));
		//System.out.println("iLength: "+iLength);
		
		// Construct the Data packet..
		byte[] dataPacket = new byte[32];
		for ( int g = 0; g < 32; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..

		Utils.setNextValueAsObjectID(lObjectId, index, dataPacket);		// The array object ID.  
		Utils.setNextValueAsInt(iFirstIndex, index, dataPacket);		// The first index to retrieve. 
		Utils.setNextValueAsInt(iLength, index, dataPacket);		// The number of components to retrieve. 

		int iDataLength = index[0];
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_GET_VALUES_ARRAY,		// Command
			Constants.COMMAND_SET_ARRAY_REFERENCE,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..

		
		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_LONGER_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(performCommand())Exception: "+ie.toString());
		}
		
		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}
		
		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			index[0] = 11;	// Reset starting location..
			Value value;
			StringBuffer sb;
			ADev.variableArrayVector = new Vector();

			/*
			 * arrayregion
			 */

			ArrayRegion arrayRegion = Utils.getNextValueAsArrayRegion(index, replyPacket);
			 
			int iArrayRegionLength = arrayRegion.getLength();
			//System.out.println("iArrayRegionLength: "+iArrayRegionLength);
			 
			byte bArrayType = arrayRegion.getTag();
			//System.out.println("bArrayType: "+bArrayType+"  "+(char)bArrayType);

			byte bTag;
			byte byteValue;
			short shortValue;
			char charValue;
			float floatValue;
			double doubleValue;
			int intValue = 0;
			long longValue;
			boolean booleanValue;
			String stringValue;
			
			for ( int iG = 0; iG < iArrayRegionLength; iG++ )
			{
				sb = new StringBuffer();
				sb.append("  [");
				sb.append(iG);
				sb.append("]    ");
				
				value = arrayRegion.getValue(iG);
				
				bTag = value.getTag();
				//System.out.println("bTag: '"+(char)bTag+"'");
				
				if ( bTag == (byte)Constants.TAG_BYTE )
				{
					//System.out.println("TAG_BYTE");
					byteValue = value.getByteValue();
					//System.out.println("byteValue: "+byteValue);
					sb.append(byteValue);
					
				}
				else if ( bTag == (byte)Constants.TAG_CHAR )
				{
					//System.out.println("TAG_CHAR");
					charValue = value.getCharValue();
					//System.out.println("charValue: "+charValue);
					sb.append(charValue);
						
				}
				else if ( bTag == (byte)Constants.TAG_FLOAT )
				{
					//System.out.println("TAG_FLOAT");
					floatValue = value.getFloatValue();
					//System.out.println("floatValue: "+floatValue);
					sb.append(floatValue);
						
				}
				else if ( bTag == (byte)Constants.TAG_DOUBLE )
				{
					//System.out.println("TAG_DOUBLE");
					doubleValue = value.getDoubleValue();
					//System.out.println("doubleValue: "+doubleValue);
					sb.append(doubleValue);
						
				}
				else if ( bTag == (byte)Constants.TAG_INT )
				{
					//System.out.println("TAG_INT");
					intValue = value.getIntValue();
					//System.out.println("intValue: "+intValue);
					sb.append(intValue);
				}
				else if ( bTag == (byte)Constants.TAG_LONG )
				{
					//System.out.println("TAG_LONG");
					longValue = value.getLongValue();
					//System.out.println("longValue: "+longValue);
					sb.append(longValue);
						
				}
				else if ( bTag == (byte)Constants.TAG_SHORT )
				{
					//System.out.println("TAG_SHORT");
					shortValue = value.getShortValue();
					//System.out.println("shortValue: "+shortValue);
					sb.append(shortValue);
						
				}
				else if ( bTag == (byte)Constants.TAG_BOOLEAN )
				{
					//System.out.println("TAG_BOOLEAN");
					booleanValue = value.getBooleanValue();
					//System.out.println("booleanValue: "+booleanValue);
					sb.append(booleanValue);
				}
				else if ( bTag == (byte)Constants.TAG_STRING )
				{
					//System.out.println("TAG_STRING");
					long lStringId = value.getLongValue();
					if ( lStringId != 0 )
					{
						stringValue = Utils.getStringValue(lStringId);
						//System.out.println("stringValue: '"+stringValue+"'");
						sb.append("\"");
						sb.append(stringValue);
						sb.append("\"");
					}
				}

				// Add to Vector..
				//System.out.println("(ADD, variableArrayVector): '"+sb.toString()+"'");				
				ADev.variableArrayVector.add((String)sb.toString());				
			}
		}
		
	}	//}}}

	//{{{	command_SetValuesInstance()	No reply *
	//static void command_SetValuesInstance(long lObjectId, int iValues, int[] iFieldId, Value[] values)
	static void command_SetValuesInstance(long lObjectId, int[] iFieldId, Value[] values)
	{
		//System.out.println("\ncommand_SetValuesInstance()");
		// Sets the value of one or more instance fields.
		// Construct the Data packet..
		byte[] dataPacket = new byte[1024];
		for ( int g = 0; g < 1024; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..
		
		Utils.setNextValueAsObjectID(lObjectId, index, dataPacket);
		Utils.setNextValueAsInt(values.length, index, dataPacket);
		
		for ( int g = 0; g < values.length; g++ )
		{
			// fieldId
			Utils.setNextValueAsFieldID(iFieldId[g], index, dataPacket);
			
			// untagged-value..
			Utils.setNextValueAsUntaggedValue(values[g], index, dataPacket);
		}
		
		int iDataLength = index[0];
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_SET_VALUES_INSTANCE,	// Command
			Constants.COMMANS_SET_OBJECT_REFERENCE,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..

		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(performCommand())Exception: "+ie.toString());
		}
		
		// Gets reply..
		
		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}
		
		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
/*			
			String sByte;
			System.out.println();		
			for ( int g = 0; g < replyPacket.length; g++ )
			{
				sByte = Integer.toHexString((int)replyPacket[g]);
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
	}	//}}}
	
	//{{{	command_SetValuesStatic()   COMMAND_SET_CLASS_TYPE   No reply  
	static void command_SetValuesStatic(long lClassId, int[] iFields, Value[] values)
	{
		//System.out.println("\ncommand_SetValuesStatic()");
		// Sets the value of one or more static fields.
		// Construct the Data packet..
		byte[] dataPacket = new byte[1024];
		for ( int g = 0; g < 1024; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..
		int iLen = iFields.length;
		
		Utils.setNextValueAsReferenceTypeID(lClassId, index, dataPacket);
		Utils.setNextValueAsInt(iLen, index, dataPacket);
		
		for ( int g = 0; g < iLen; g++ )
		{
			// fieldId
			Utils.setNextValueAsFieldID(iFields[g], index, dataPacket);
			
			// untagged-value..
			Utils.setNextValueAsUntaggedValue(values[g], index, dataPacket);
		}
		
		int iDataLength = index[0];
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_SET_VALUES_STATIC,	// Command
			Constants.COMMAND_SET_CLASS_TYPE,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..


		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_LONGER_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(performCommand())Exception: "+ie.toString());
		}
		
		byte[] replyPacket = null;
		if ( reply != null )		
			replyPacket = reply.toBytesArray();
		
	}	//}}}

	//{{{	command_GetValuesObject()	
	static void command_GetValuesObject(
		long lObjectId,		// object, The object ID 
		long[] lFieldId)	// fieldID, Field to get
	{
		//System.out.println("\ncommand_GetValuesObject()");
		//System.out.println("lObjectId: "+lObjectId);
		//System.out.println("lFieldId[0]: "+lFieldId[0]);
		
		// Returns the value of one or more instance fields.
		// Construct the Data packet..
		byte[] dataPacket = new byte[1024];
		for ( int g = 0; g < 1024; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..
		int iLen = lFieldId.length;
		//System.out.println("iLen: "+iLen);
		
		Utils.setNextValueAsObjectID(lObjectId, index, dataPacket);	// The object ID 
		Utils.setNextValueAsInt(iLen, index, dataPacket);			// 	The number of values to get
		
		for ( int g = 0; g < iLen; g++ )
			Utils.setNextValueAsFieldID(lFieldId[g], index, dataPacket);		// Field to get
		
		int iDataLength = index[0];
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_GET_VALUES_OBJECT,	// Command
			Constants.COMMANS_SET_OBJECT_REFERENCE,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..


		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(command_GetValuesObject())(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(command_GetValuesObject())(performCommand())Exception: "+ie.toString());
		}
		
		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}
		
		Value value = null;
		ADev.NonStaticValueAr = new ArrayList();
		ClassValueInfo classValueInfo;
		
		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			index[0] = 11;	// Starting location..
			
			int iValues;
			int iIndex;
			byte bType;
			String sValue;

			iValues = Utils.getNextValueAsInt(index, replyPacket);
			
			for ( iIndex = 0; iIndex < iValues; iIndex++ )
			{
				classValueInfo = new ClassValueInfo();
				classValueInfo.lFieldId = lFieldId[iIndex];
				classValueInfo.value = Utils.getNextValueAsValue(index, replyPacket);
				
				ADev.NonStaticValueAr.add((ClassValueInfo)classValueInfo);
			}
		}
	}	//}}}
	
	//{{{	command_GetValues()	  COMMAND_SET_REFERENCE_TYPE
	static void command_GetValues(
		long lReferenceTypeId,
		long[] lFields)
	{
		//System.out.println("\n** command_GetValues() **");
		// Returns the value of one or more static fields of the reference type.
		
		// Construct the Data packet..
		byte[] dataPacket = new byte[1024];
		for ( int g = 0; g < 1024; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..
		int iLen = lFields.length;
		
		Utils.setNextValueAsReferenceTypeID(lReferenceTypeId, index, dataPacket);	// The reference type ID.
		Utils.setNextValueAsInt(iLen, index, dataPacket);	// The number of values to get
		
		for ( int g = 0; g < iLen; g++ )
			Utils.setNextValueAsFieldID(lFields[g], index, dataPacket);		// A field to get 
		
		int iDataLength = index[0];
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_GET_VALUES,			// Command
			Constants.COMMAND_SET_REFERENCE_TYPE,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..


		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(performCommand())Exception: "+ie.toString());
		}
		
		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}
		
		Value value = null;
		ADev.StaticValueAr = new ArrayList();
		
		ClassVariableInfo classVariableInfo = null;
		ClassValueInfo classValueInfo;
		
		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			index[0] = 11;	// Starting location..
	
			int iValues;
			int iIndex;
			byte bType;
			
			ADev.ClassVarAr = new ArrayList();
			
			iValues = Utils.getNextValueAsInt(index, replyPacket);

			for ( iIndex = 0; iIndex < iValues; iIndex++ )
			{
				classValueInfo = new ClassValueInfo();
				classValueInfo.lFieldId = lFields[iIndex];
				classValueInfo.value = Utils.getNextValueAsValue(index, replyPacket);
				
				ADev.StaticValueAr.add((ClassValueInfo)classValueInfo);
			}
		}
	}	//}}}

	//{{{	command_SetValuesLocal()   COMMAND_SET_STACK_FRAME   No reply *  
	static void command_SetValuesLocal(long lThreadId, long lFrameId, int[] iSlots, Value[] values)
	{
		// Sets the value of one or more local variables. 
		// Construct the Data packet..
		byte[] dataPacket = new byte[1024];
		for ( int g = 0; g < 1024; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..
		int iLen = iSlots.length;

		Utils.setNextValueAsObjectID(lThreadId, index, dataPacket);
		Utils.setNextValueAsFrameID(lFrameId, index, dataPacket);	// (Uses iFrameIdSize)		
		Utils.setNextValueAsInt(iLen, index, dataPacket);
		
		for ( int g = 0; g < iLen; g++ )
		{
			// slot
			Utils.setNextValueAsInt(iSlots[g], index, dataPacket);
			
			// value..
			Utils.setNextValueAsValue(values[g], index, dataPacket);
		}
		
		int iDataLength = index[0];
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_SET_VALUES_LOCAL,	// Command
			Constants.COMMAND_SET_STACK_FRAME,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..


		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;
		
		/**
		 * Gets a reply
		 */

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(performCommand())Exception: "+ie.toString());
		}
		
		byte[] replyPacket = null;
		if ( reply != null )		
			replyPacket = reply.toBytesArray();
		
	}	//}}}

	//{{{	command_GetValuesFrame()	(StackFrame)
	//static Value[] command_GetValuesFrame(
	static void command_GetValuesFrame(
		long lThreadId,
		long lFrameId,
		int iNumSlots)
	{
		//System.out.println("\n** command_GetValuesFrame() **");
		// Returns the value of one or more local variables in a given frame.
		//System.out.println("lThreadId: "+lThreadId);
		//System.out.println("lFrameId: "+lFrameId);
		//System.out.println("iNumSlots: "+iNumSlots);

		// Construct the Data packet..
		byte[] dataPacket = new byte[1024];
		for ( int g = 0; g < 1024; g++ )
			dataPacket[g] = (byte)0x00;
			
		int[] index = new int[1];
		index[0] = 0;	// Starting location..
		
		FrameSlot frameSlot;
		
		Utils.setNextValueAsObjectID(lThreadId, index, dataPacket);
		Utils.setNextValueAsFrameID(lFrameId, index, dataPacket);		// (Uses iFrameIdSize)
		Utils.setNextValueAsInt(iNumSlots, index, dataPacket);

		// We have to use the 'slot' value now to tell what to update
		// since the returned Value Object won't give you any Id info..
		
		for ( int g = 0; g < iNumSlots; g++ )
		{
			//System.out.println("--------------");
			frameSlot = new FrameSlot();
			frameSlot = (FrameSlot)ADev.FrameSlotAr.get(g);
			
			Utils.setNextValueAsInt(frameSlot.iSlot, index, dataPacket);
			//System.out.println("(slot): "+frameSlot.iSlot);
			Utils.setNextValueAsByte(frameSlot.bSigByte, index, dataPacket);
			//System.out.println("(sigByte): "+frameSlot.bSigByte+"   '"+(char)frameSlot.bSigByte+"'");
		}
			
		int iDataLength = index[0];
		//System.out.println("iDataLength: "+iDataLength);
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_GET_VALUES_FRAME,	// Command
			Constants.COMMAND_SET_STACK_FRAME,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..


		/*
		 * Get ready to send..
		 */

		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_LONGER_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(performCommand())(IOException)Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(performCommand())(InterruptedException)Exception: "+ie.toString());
		}
		
		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}

		//Value[] values = null;
		
		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			index[0] = 11;	// Starting location..
			ADev.LocalValueAr = new ArrayList();
	
			int iValues;
			int iIndex;
			
			byte bByteValue;
			short sShortValue;
			int	iIntValue;
			long lLongValue;
			float fFloatValue;
			double dDoubleValue;
			boolean bBooleanValue;
			char cCharValue;
			String sStringValue;
			
			iValues = Utils.getNextValueAsInt(index, replyPacket);
			//System.out.println("iValues: "+iValues);
	
			byte bSigByte;
			boolean bModified;
			int iKey = 0;
			int iSlot;
			int iVarIndex;
			StringBuffer sb;
			Integer IVal;
			VariableTableInfo variableTableInfo = null;
			LocalValueInfo localValueInfo;
			
			for ( iIndex = 0; iIndex < iValues; iIndex++ )
			{
				// Value:
				//System.out.println("["+iIndex+"] ------------------------------------------");

				bModified = false;				
				
				// Get the Key for this Value..
				frameSlot = new FrameSlot();
				frameSlot = (FrameSlot)ADev.FrameSlotAr.get(iIndex);
				iSlot = frameSlot.iSlot;

				// Search for matching slot..
				for ( iVarIndex = 0; iVarIndex < ADev.VariableTableAr.size(); iVarIndex++ )
				{
					variableTableInfo = (VariableTableInfo)ADev.VariableTableAr.get(iVarIndex);
					if ( iSlot == variableTableInfo.iSlot )
						break;
				}
				
				localValueInfo = new LocalValueInfo();
				localValueInfo.iSlot = iSlot;
				localValueInfo.sName = variableTableInfo.sName;
				//System.out.println("variableTableInfo.sName: "+variableTableInfo.sName);
				localValueInfo.sSignature = variableTableInfo.sSignature;
				//System.out.println("variableTableInfo.sSignature: "+variableTableInfo.sSignature);
				localValueInfo.value = Utils.getNextValueAsValue(index, replyPacket);
				
				ADev.LocalValueAr.add((LocalValueInfo)localValueInfo);
				
			}
		}
	}	//}}}

	//{{{	command_CreateString()
	static long command_CreateString(String sUtfString)
	{
		//System.out.println("\ncommand_CreateString()");
		//System.out.println("sUtfString: '"+sUtfString+"'");
		// Creates a new string object in the target VM and returns its id.
		// Construct the Data packet..
		byte[] dataPacket = new byte[64];
		for ( int g = 0; g < 64; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..

		Utils.setNextValueAsString(sUtfString, index, dataPacket);
		
		int iDataLength = index[0];
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_CREATE_STRING,		// Command
			Constants.COMMAND_SET_VIRTUAL_MACHINE,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..

		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(performCommand())Exception: "+ie.toString());
		}
		
		long lStringId = 0;

		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}
		
		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			index[0] = 11;	// Reset starting location..
			
			lStringId = Utils.getNextValueAsObjectID(index, replyPacket);
		}

		return lStringId;		
	}	//}}}
	
	//{{{	command_Value()		String	
	static String command_Value(long lObjectId)
	{
		//System.out.println("\n** command_Value() **");
		//System.out.println("lObjectId: "+lObjectId+"  "+Long.toHexString(lObjectId));
		// Returns the characters contained in the string.
		
		// Construct the Data packet..
		byte[] dataPacket = new byte[64];
		for ( int g = 0; g < 64; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..
		
		// Load the 'ObjectId'..		
		Utils.setNextValueAsObjectID(lObjectId, index, dataPacket);
		
		int iDataLength = index[0];
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_VALUE,		// Command
			Constants.COMMAND_SET_STRING_REFERENCE,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..

		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(performCommand())Exception: "+ie.toString());
		}

		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}
		
		String sStringValue = "";
		
		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			index[0] = 11;	// Reset starting location..
			
			sStringValue = Utils.getNextValueAsString(index, replyPacket);
			//System.out.println("(Return)sStringValue: '"+sStringValue+"'");
		}

		return sStringValue;		
	}	//}}}

	//{{{	command_Instances()
	static void command_Instances(long lReferenceTypeId, int iMaxInstances)
	{
		// Returns instances of this reference type.
		//System.out.println("command_Instances()");
		
		// Construct the Data packet..
		byte[] dataPacket = new byte[32];
		for ( int g = 0; g < 32; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..

		Utils.setNextValueAsReferenceTypeID(lReferenceTypeId, index, dataPacket);
		
		// Maximum number of instances to return. Must be non-negative.
		// If zero, all instances are returned.
		Utils.setNextValueAsInt(iMaxInstances, index, dataPacket);

		int iDataLength = index[0];
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_INSTANCES,			// Command
			Constants.COMMAND_SET_REFERENCE_TYPE,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..

		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(performCommand())Exception: "+ie.toString());
		}
		
		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}

		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			index[0] = 11;	// Starting location..
			
			int iInstances = Utils.getNextValueAsInt(index, replyPacket);
			//System.out.println("iInstances: "+iInstances);
			
			int iIndex;
			byte bTag;
			long lObjectId;
			
			for ( iIndex = 0; iIndex < iInstances; iIndex++ )
			{
				//System.out.println("-----------------------");
				// Get the tagged-objectID..
				bTag = Utils.getNextValueAsByte(index, replyPacket);
				//System.out.println("bTag: "+bTag);
				lObjectId = Utils.getNextValueAsObjectID(index, replyPacket);
				//System.out.println("lObjectId: "+lObjectId+"  "+Long.toHexString(lObjectId));
				
			}
		}
	}	//}}}
	
	//{{{	command_ThisObject()
	static TaggedObject command_ThisObject(long lThreadId, long lFrameId)
	{
		//System.out.println("\n** command_ThisObject() **");
		// Returns the value of the 'this' reference for this frame.
		
		// Construct the Data packet..
		byte[] dataPacket = new byte[32];
		for ( int g = 0; g < 32; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..
		
		Utils.setNextValueAsObjectID(lThreadId, index, dataPacket);	// Load the 'threadId'..
		Utils.setNextValueAsFrameID(lFrameId, index, dataPacket);	// Load FrameId, (Uses iFrameIdSize)
		
		int iDataLength = index[0];
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_THIS_OBJECT,		// Command
			Constants.COMMAND_SET_STACK_FRAME,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..


		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(performCommand())Exception: "+ie.toString());
		}
		
		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}

		TaggedObject taggedObject = null;
		
		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			index[0] = 11;	// Reset starting location..
			taggedObject = Utils.getNextValueAsTaggedObject(index, replyPacket);
		}
		
		return taggedObject;
	}	//}}}
	
	//{{{	command_Frames()
	static void command_Frames(
		long lThreadId,
		int iStartFrame,
		int iLength)
	{
		//System.out.println("\n** command_Frames() **");
		//System.out.println("lThreadId: "+lThreadId+"   "+Long.toHexString(lThreadId));
		//System.out.println("iStartFrame: "+iStartFrame);
		//System.out.println("iLength: "+iLength);
		// Returns the current call stack of a suspended thread.
		
		// Construct the Data packet..
		byte[] dataPacket = new byte[64];
		for ( int g = 0; g < 64; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..
		
		Utils.setNextValueAsObjectID(lThreadId, index, dataPacket);
		Utils.setNextValueAsInt(iStartFrame, index, dataPacket);
		Utils.setNextValueAsInt(iLength, index, dataPacket);
		
		int iDataLength = index[0];
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_FRAMES,					// Command
			Constants.COMMAND_SET_THREAD_REFERENCE,	// CommandSet
			iPacketId,
			dataPacket,			// byte[]  Data
			iDataLength);		// Data length..

		
		/*
		 * Get ready to send..
		 */

		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(command_Frames())(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(command_Frames())(performCommand())Exception: "+ie.toString());
		}
		
		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}

		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			index[0] = 11;	// Starting location..
	
			long lFrameId;
			long lClassId;
			long lMethodId;
			long lLocationIndex;
			byte bTypeTag;
			
			ADev.FramesAr = new ArrayList();
			FramesInfo framesInfo;
			
			int iIndex;
			int iFrames = Utils.getNextValueAsInt(index, replyPacket);
			//System.out.println("iFrames: "+iFrames);
	
			for ( iIndex = 0; iIndex < iFrames; iIndex++ )
			{
				framesInfo = new FramesInfo();
				
				//System.out.println("---------------------------------------------");
	
				lFrameId = Utils.getNextValueAsFrameID(index, replyPacket);
				framesInfo.lFrameId = lFrameId;
				//System.out.println("lFrameId: "+lFrameId+"   "+Long.toHexString(lFrameId));
				
				// Location..
				bTypeTag = Utils.getNextValueAsByte(index, replyPacket);
				//System.out.println("bTypeTag: "+bTypeTag);
				framesInfo.bTypeTag = bTypeTag;
				
				lClassId = Utils.getNextValueAsReferenceTypeID(index, replyPacket);
				//System.out.println("lClassId: "+lClassId+"   "+Long.toHexString(lClassId));
				framesInfo.lClassId = lClassId;
				
				lMethodId = Utils.getNextValueAsMethodID(index, replyPacket);
				//System.out.println("lMethodId: "+lMethodId+"   "+Long.toHexString(lMethodId));
				framesInfo.lMethodId = lMethodId;
				
				lLocationIndex = Utils.getNextValueAsLong(index, replyPacket);
				//System.out.println("lLocationIndex: "+lLocationIndex);
				framesInfo.lLocationIndex = lLocationIndex;
				
				ADev.FramesAr.add((FramesInfo)framesInfo);
				
			}
		}
	}	//}}}

	//{{{	command_FrameCount()	
	static int command_FrameCount(long lThreadId)
	{
		//System.out.println("\n** command_FrameCount() **");
		//System.out.println("lThreadId: "+lThreadId+"   "+Long.toHexString(lThreadId));
		// Returns the count of frames on this thread's stack.
		
		// Construct the Data packet..
		byte[] dataPacket = new byte[32];
		for ( int g = 0; g < 32; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..
		
		// Load the 'threadId'..		
		Utils.setNextValueAsObjectID(lThreadId, index, dataPacket);
		
		int iDataLength = index[0];
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_FRAME_COUNT,		// Command
			Constants.COMMAND_SET_THREAD_REFERENCE,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..


		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(performCommand())Exception: "+ie.toString());
		}
		
		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}

		int iFrameCount = 0;
		
		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			index[0] = 11;	// Reset starting location..
	
			iFrameCount = Utils.getNextValueAsInt(index, replyPacket);
			//System.out.println("iFrameCount: "+iFrameCount);
		}

		return iFrameCount;	
	}	//}}}

	//{{{	command_Set_Step()
	static void command_Set_Step(
		long lThreadRefType,
		byte bStepSize,			// STEP_SIZE_MIN, STEP_SIZE_LINE 
		byte bStepDepth)		// STEP_DEPTH_INTO, STEP_DEPTH_OVER, STEP_DEPTH_OUT 
	{
		// Special version that tries to copy what jdb sends..
		// Set an event request.
		// Construct packet..
		//System.out.println("\n** command_Set_Step() **");

/*		
		if ( bStepSize == (byte)Constants.STEP_SIZE_MIN )
			System.out.println("STEP_SIZE_MIN");
		else if ( bStepSize == (byte)Constants.STEP_SIZE_LINE )
			System.out.println("STEP_SIZE_LINE");

		if ( bStepDepth == (byte)Constants.STEP_DEPTH_INTO )
			System.out.println("STEP_DEPTH_INTO");
		else if ( bStepDepth == (byte)Constants.STEP_DEPTH_OVER )
			System.out.println("STEP_DEPTH_OVER");
		else if ( bStepDepth == (byte)Constants.STEP_DEPTH_OUT )
			System.out.println("STEP_DEPTH_OUT");
/**/

		// Construct the Data packet..
		byte[] dataPacket = new byte[512];
		for ( int g = 0; g < 512; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..
		int iDataLength;
		
		Utils.setNextValueAsByte((byte)Constants.EVENT_KIND_SINGLE_STEP, index, dataPacket);		// eventKind
		Utils.setNextValueAsByte((byte)Constants.SUSPEND_THREAD_ALL, index, dataPacket);	// suspendPolicy
		//Utils.setNextValueAsInt(6, index, dataPacket);			// modifiers
		Utils.setNextValueAsInt(2, index, dataPacket);			// modifiers
		//Utils.setNextValueAsInt(1, index, dataPacket);			// modifiers
		
		Utils.setNextValueAsByte((byte)Constants.MOD_KIND_STEP, index, dataPacket);			// modKind
		Utils.setNextValueAsObjectID(lThreadRefType, index, dataPacket);	// threadId
		Utils.setNextValueAsInt(bStepSize, index, dataPacket);				// size
		Utils.setNextValueAsInt(bStepDepth, index, dataPacket);			// depth

		Utils.setNextValueAsByte((byte)Constants.MOD_KIND_COUNT, index, dataPacket);			// modKind
		Utils.setNextValueAsInt(1, index, dataPacket);			// Count

/*		
		Utils.setNextValueAsByte((byte)Constants.MOD_KIND_CLASS_EXCLUDE, index, dataPacket);			// modKind
		Utils.setNextValueAsString("java.*", index, dataPacket);
		
		Utils.setNextValueAsByte((byte)Constants.MOD_KIND_CLASS_EXCLUDE, index, dataPacket);			// modKind
		Utils.setNextValueAsString("javax.*", index, dataPacket);

		Utils.setNextValueAsByte((byte)Constants.MOD_KIND_CLASS_EXCLUDE, index, dataPacket);			// modKind
		Utils.setNextValueAsString("sun.*", index, dataPacket);

		Utils.setNextValueAsByte((byte)Constants.MOD_KIND_CLASS_EXCLUDE, index, dataPacket);			// modKind
		Utils.setNextValueAsString("com.sun.*", index, dataPacket);

		Utils.setNextValueAsByte((byte)Constants.MOD_KIND_COUNT, index, dataPacket);			// modKind
		Utils.setNextValueAsInt(1, index, dataPacket);			// Count
/**/

		iDataLength = index[0];

		int[] iPacketId = new int[1];
		
		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_SET,					// Command
			Constants.COMMAND_SET_EVENT_REQUEST,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..
		

		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(performCommand())Exception: "+ie.toString());
		}
		
		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}

		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			/**
			 *	Get the Reply RequestId..
			 */
	
			index[0] = 11;	// Reset starting location..
			
			int iRequestId = Utils.getNextValueAsInt(index, replyPacket);
			//System.out.println("(EventReply)iRequestId: "+iRequestId+"  "+Integer.toHexString(iRequestId));
	
			// Save for clear..		
			ADev.lStepRequestId = iRequestId;
			//System.out.println("lStepRequestId: "+ADev.lStepRequestId+"   "+Long.toHexString(ADev.lStepRequestId));
			
			// Set Event Key..
			ADev.iEventKey = iRequestId;
			ADev.lPendingRequestId = iRequestId;
			//System.out.println("lPendingRequestId: "+ADev.lPendingRequestId);
		}

		// Resume after we get the returned RequestId..
		// Get Suspend Count..
		int iSuspendCount = JDWPCommands.command_SuspendCount(ADev.lCurrentThreadId);

		for ( int iG = 0; iG < iSuspendCount; iG++ )
		{
			JDWPCommands.command_Resume();
		}

	}	//}}}

	//{{{	command_Set_Breakpoint()
	static void command_Set_Breakpoint(
		long lClassId,
		long lMethodId,
		long lIndex)	// The actual LineCodeIndex..
	{
		// Set an event request.
		// Construct packet..
		//System.out.println("\n** command_Set_Breakpoint() **");
		//System.out.println("lClassId: "+lClassId+"  lMethodId: "+lMethodId+"  lIndex: "+lIndex);

		// Construct the Data packet..
		byte[] dataPacket = new byte[1024];
		for ( int g = 0; g < 1024; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..

		Utils.setNextValueAsByte((byte)Constants.EVENT_KIND_BREAKPOINT, index, dataPacket);		// eventKind
		Utils.setNextValueAsByte((byte)Constants.SUSPEND_THREAD_ALL, index, dataPacket);	// suspendPolicy
		Utils.setNextValueAsInt(1, index, dataPacket);			// modifiers
		
		Utils.setNextValueAsByte((byte)Constants.MOD_KIND_LOCATION_ONLY, index, dataPacket);			// modKind

		// Location		
		Utils.setNextValueAsByte((byte)Constants.TYPE_TAG_CLASS, index, dataPacket);	// Type Tag
		Utils.setNextValueAsObjectID(lClassId, index, dataPacket);	// ClassId
		Utils.setNextValueAsMethodID(lMethodId, index, dataPacket);	// MethodId
		Utils.setNextValueAsLong(lIndex, index, dataPacket);		// Index location

		int iDataLength = index[0];
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_SET,					// Command
			Constants.COMMAND_SET_EVENT_REQUEST,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..


		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(performCommand())Exception: "+ie.toString());
		}
		
		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}
		
		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			/**
			 *	Get the Reply RequestId..
			 */
			 
			index[0] = 11;	// Reset starting location..
			
			int iRequestId = Utils.getNextValueAsInt(index, replyPacket);
			ADev.iBreakpointRequestId = iRequestId;
			//System.out.println("(Reply)iRequestId: "+iRequestId+"  "+Integer.toHexString(iRequestId));
			
			// Set Event Key..
			ADev.iEventKey = iRequestId;
			ADev.lPendingRequestId = iRequestId;
			//System.out.println("lPendingRequestId: "+ADev.lPendingRequestId);
		}
		
	}	//}}}

	//{{{	command_Set()
	static void command_Set(byte[] packetData, int iPacketDataLength)
	{
		// Set an Event request.
		// A version where we pre-construct our packet data..
		//System.out.println("\n** command_Set() **");

		int iDataLength = iPacketDataLength;
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_SET,					// Command
			Constants.COMMAND_SET_EVENT_REQUEST,	// CommandSet
			iPacketId,
			packetData,			// byte[] Data
			iDataLength);		// Data length..

		
/*		
		System.out.println("\n\npacket:\n");
		int iJ = 0;
		for ( int j = 0; j < packet.length; j++ )
		{
			System.out.print(Integer.toHexString((int)packet[j])+" ");
			iJ++;
			if ( iJ > 20 )
			{
				System.out.print("\n");
				iJ = 0;
			}
		}
		System.out.println("\n");
/**/		
		
		
		
		
		
		
		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(performCommand())Exception: "+ie.toString());
		}
		
		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}

/*		
		if ( replyPacket == null )
			System.out.println("replyPacket null");
		else
			System.out.println("replyPacket.length: "+replyPacket.length);
/**/		
		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));	
		//System.out.println("iErrorCode: "+iErrorCode);
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			/**
			 *	Get the Reply RequestId..
			 */
	
			int[] index = new int[1];		 
			index[0] = 11;	// Reset starting location..
			
			int iRequestId = Utils.getNextValueAsInt(index, replyPacket);
			//System.out.println("(Reply)iRequestId: "+iRequestId+"  "+Integer.toHexString(iRequestId));
			
			// Set Event Key..
			ADev.iEventKey = iRequestId;
			ADev.lPendingRequestId = iRequestId;
		}
		
	}	//}}}

	//{{{	command_LineTable()
	static void command_LineTable(long lClassId, long lMethodId)
	{
		// Returns line number information for the method, if present.
		// Construct packet..
		//System.out.println("\n** command_LineTable() **");
		//System.out.println("lClassId: "+lClassId+"   lMethodId: "+lMethodId);

		// Construct the Data packet..
		byte[] dataPacket = new byte[32];
		for ( int g = 0; g < 32; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..

		Utils.setNextValueAsReferenceTypeID(lClassId, index, dataPacket);
		Utils.setNextValueAsMethodID(lMethodId, index, dataPacket);

		int iDataLength = index[0];
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_LINE_TABLE,		// Command
			Constants.COMMAND_SET_METHOD,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..

		
		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;
		ADev.iErrorCode = Constants.ERROR_NONE;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
			//reply = PacketDispatcher.performCommand(command, Constants.REPLY_VERY_LONG_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(command_LineTable())(performCommand())Exception: "+ioe.toString());
			ADev.iErrorCode = Constants.ERROR_INTERNAL;
		}
		catch (InterruptedException ie)
		{
			System.out.println("(command_LineTable())(performCommand())Exception: "+ie.toString());
			ADev.iErrorCode = Constants.ERROR_INTERNAL;
		}
/*
		if ( reply == null )
			System.out.println("reply null");
		else
			System.out.println("reply: "+reply);
/**/

		//int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			ADev.iErrorCode = reply.getErrorCode();
		}
		
		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (ADev.iErrorCode == Constants.ERROR_NONE) )
		{
			index[0] = 11;	// Reset starting location..
			
			long lStart;
			long lEnd;
			long lLineCodeIndex;
			int iLineNumber;
			int iLines;
			int iLineTableIndex;
			
			ADev.LineTableAr = new ArrayList();
			LineTableInfo lineTableInfo;
	
	
			lStart = Utils.getNextValueAsLong(index, replyPacket);
			//System.out.println("lStart: "+lStart);
	
			lEnd = Utils.getNextValueAsLong(index, replyPacket);
			//System.out.println("lEnd: "+lEnd);
			
			iLines = Utils.getNextValueAsInt(index, replyPacket);
			//System.out.println("iLines: "+iLines);
	
			for ( iLineTableIndex = 0; iLineTableIndex < iLines; iLineTableIndex++ )
			{
				//System.out.println("---------------------------------------------");
	
				lLineCodeIndex = Utils.getNextValueAsLong(index, replyPacket);
				//System.out.println("lLineCodeIndex: "+lLineCodeIndex);
				
				iLineNumber = Utils.getNextValueAsInt(index, replyPacket);
				//System.out.println("iLineNumber: "+iLineNumber);

				lineTableInfo = new LineTableInfo();
				lineTableInfo.lStart = lStart;	// Common to all
				lineTableInfo.lEnd = lEnd;
				lineTableInfo.iLines = iLines;
				lineTableInfo.lLineCodeIndex = lLineCodeIndex;
				lineTableInfo.iLineNumber = iLineNumber;
				
				ADev.LineTableAr.add((LineTableInfo)lineTableInfo);
			}
		}
		
		//System.out.println("Exiting command_LineTable()");
	}	//}}}

	//{{{	command_ClassesBySignature()
	static long command_ClassesBySignature(String signature)
	{
		// Returns reference types for all the classes loaded by the target VM which match the given signature.
		// For it to match the class it needs to look like:   'Ljava/lang/NullPointerException;'
		//System.out.println("** command_ClassesBySignature() **");

		// Construct the Data packet..
		byte[] dataPacket = new byte[256];
		for ( int g = 0; g < 256; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..
		int iDataLength;
		
		Utils.setNextValueAsString(signature, index, dataPacket);

		iDataLength = index[0];

		int[] iPacketId = new int[1];


		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_CLASSES_BY_SIGNATURE,	// Command
			Constants.COMMAND_SET_VIRTUAL_MACHINE,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..

		
		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(performCommand())Exception: "+ie.toString());
		}
		
		long lTypeId = 0;
		
		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}

		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			index[0] = 11;	// Reset starting location..

			ADev.ClassesBySignatureAr = new ArrayList();
			ClassesBySignatureInfo classesBySignatureInfo;
			
			int iClassIndex;
			byte byte_RefTagType;
			int iStatus;
			
			int iNumClasses = Utils.getNextValueAsInt(index, replyPacket);
			//System.out.println("iNumClasses: "+iNumClasses);
			
			for ( iClassIndex = 0; iClassIndex < iNumClasses; iClassIndex++ )
			{
				//System.out.println("---------------------------------------------");
				
				// CLASS, INTERFACE or ARRAY..
				byte_RefTagType = Utils.getNextValueAsByte(index, replyPacket);
				//System.out.println("byte_RefTagType: "+byte_RefTagType);
				
				lTypeId = Utils.getNextValueAsReferenceTypeID(index, replyPacket);
				//System.out.println("lTypeId: "+lTypeId);
	
				iStatus = Utils.getNextValueAsInt(index, replyPacket);
				//System.out.println("iStatus: "+iStatus);
				
				classesBySignatureInfo = new ClassesBySignatureInfo();
				classesBySignatureInfo.bRefTypeTag = byte_RefTagType;
				classesBySignatureInfo.lReferenceTypeID = lTypeId;
				classesBySignatureInfo.iStatus = iStatus;
				ADev.ClassesBySignatureAr.add((ClassesBySignatureInfo)classesBySignatureInfo);
				
			}
		}
		
		return lTypeId;
	}	//}}}

	//{{{	command_VariableTableWithGeneric()
	static void command_VariableTableWithGeneric(
		long lRefType,		// ClassId
		long lMethodId)		// MethodId
	{
		// Returns variable information for the method.
		// Construct packet..
		//System.out.println("\n** command_VariableTableWithGeneric() **");
		//System.out.println("lRefType: "+lRefType+"   "+Long.toHexString(lRefType)+
			//"   lMethodId: "+lMethodId+"   "+Long.toHexString(lMethodId));

		// Construct the Data packet..
		byte[] dataPacket = new byte[64];
		for ( int g = 0; g < 64; g++ )
			dataPacket[g] = (byte)0x00;
		
		int[] index = new int[1];
		index[0] = 0;	// Starting location..

		Utils.setNextValueAsReferenceTypeID(lRefType, index, dataPacket);	// Load 'refType'..
		Utils.setNextValueAsMethodID(lMethodId, index, dataPacket);			// Load 'methodId'..

		int iDataLength = index[0];
		int[] iPacketId = new int[1];

		byte[] packet = Utils.buildHeaderWithData(
			Constants.COMMAND_VARIABLE_TABLE_WITH_GENERIC,		// Command
			Constants.COMMAND_SET_METHOD,	// CommandSet
			iPacketId,
			dataPacket,			// byte[] Data
			iDataLength);		// Data length..

		
		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(packet);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("command_VariableTableWithGeneric())(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("command_VariableTableWithGeneric())(performCommand())Exception: "+ie.toString());
		}
		
		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}
		
		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			index[0] = 11;	// Reset starting location..
			
			ADev.VariableTableAr = new ArrayList();
			
			int iArgCount;
			int iSlots;
			long lCodeIndex;
			String sName;
			String sSignature;
			String sGenericSignature;
			int iLength;
			int iSlot;
			int iIndex;

			// Temp locals..
			HashMap localHm = new HashMap();
			ArrayList localAr = new ArrayList();
			
			VariableTableInfo variableTableInfo;
			
			iArgCount = Utils.getNextValueAsInt(index, replyPacket);
			//System.out.println("iArgCount: "+iArgCount);
	
			iSlots = Utils.getNextValueAsInt(index, replyPacket);
			//System.out.println("iSlots: "+iSlots);
	
			//System.out.println("\n\ncommand_VariableTableWithGeneric():");		
			for ( iIndex = 0; iIndex < iSlots; iIndex++ )
			{
				//System.out.println("---------------------------------------------");
				
				// First code index at which the variable is visible.
				lCodeIndex = Utils.getNextValueAsLong(index, replyPacket);
				//System.out.println("lCodeIndex: "+lCodeIndex);
				
				// The variable's name. 
				sName = Utils.getNextValueAsString(index, replyPacket);
				//System.out.println("sName: '"+sName+"'");
	
				// The variable type's JNI signature.
				sSignature = Utils.getNextValueAsString(index, replyPacket);
				//System.out.println("sSignature: '"+sSignature+"'");
				
				sGenericSignature = Utils.getNextValueAsString(index, replyPacket);
				//System.out.println("sGenericSignature: '"+sGenericSignature+"'");
				
				// Unsigned value used in conjunction with codeIndex.
				iLength = Utils.getNextValueAsInt(index, replyPacket);
				//System.out.println("iLength: "+iLength);
				
				// The local variable's index in its frame 
				iSlot = Utils.getNextValueAsInt(index, replyPacket);
				//System.out.println("iSlot: "+iSlot);
	
				variableTableInfo = new VariableTableInfo();
				variableTableInfo.lCodeIndex = lCodeIndex;
				variableTableInfo.sName = sName; 
				variableTableInfo.sSignature = sSignature;
				variableTableInfo.iLength = iLength;
				variableTableInfo.iSlot = iSlot;
				variableTableInfo.lObjectId = 0;
				
				ADev.VariableTableAr.add((VariableTableInfo)variableTableInfo);
					
			}	// End for..
		}
	}	//}}}

	//{{{	command_Version()
	static void command_Version()
	{
		// Returns the JDWP version implemented by the target VM.
		// Construct packet..
		int iPacketDataLength = 0;
		int iPacketLength = 0;

		iPacketLength = iPacketDataLength + Constants.HEADER_SIZE;
		
		int[] iPacketId = new int[1];
		
		byte[] header = Utils.buildHeader(
			Constants.COMMAND_VERSION,			// Command
			Constants.COMMAND_SET_VIRTUAL_MACHINE,	// CommandSet
			iPacketId,
			iPacketDataLength);		// Packet data length..

		/*
		 * Get ready to send..
		 */
		
		CommandPacket command = new CommandPacket(header);

		ReplyPacket reply = null;

		try
		{		
			reply = PacketDispatcher.performCommand(command, Constants.REPLY_NORMAL_TIMEOUT);
		}
		catch (IOException ioe)
		{
			System.out.println("(performCommand())Exception: "+ioe.toString());
		}
		catch (InterruptedException ie)
		{
			System.out.println("(performCommand())Exception: "+ie.toString());
		}
		
		int iErrorCode = 0;		
		byte[] replyPacket = null;
		if ( reply != null )
		{
			replyPacket = reply.toBytesArray();
			iErrorCode = reply.getErrorCode();
		}

		//System.out.println("ErrorCode: "+Utils.getErrorCode(iErrorCode));		
		if ( (replyPacket != null) && (iErrorCode == Constants.ERROR_NONE) )
		{
			int[] index = new int[1];
			index[0] = 11;	// Starting location..
			
			String descriptionS = Utils.getNextValueAsString(index, replyPacket);
			//System.out.println("descriptionS: '"+descriptionS+"'");
			
			int iVersionMajor = Utils.getNextValueAsInt(index, replyPacket);
			//System.out.println("iVersionMajor: "+iVersionMajor);
			
			int iVersionMinor = Utils.getNextValueAsInt(index, replyPacket);
			//System.out.println("iVersionMinor: "+iVersionMinor);
	
			String versionS = Utils.getNextValueAsString(index, replyPacket);
			//System.out.println("versionS: '"+versionS+"'");
	
			String nameS = Utils.getNextValueAsString(index, replyPacket);
			//System.out.println("nameS: '"+nameS+"'");
		}
		
	}	//}}}
	
}

