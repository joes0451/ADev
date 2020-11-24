
You can use the latest Android SDK for Gradle, Kotlin and Flutter projects.

The latest SDK version: 

https://developer.android.com/studio/#downloads

Note:
    It looks like every new SDK version requires the --sdk_root command option
    be on every command line using the sdkmanager.
	If you used a directory 'android-sdk' you would run 'sdkmanager' like:
	
	sdkmanager --list --sdk_root=c:\android-sdk 
	
Scroll down to "Command line tools only" and choose the Windows, Mac or Linux
version of the Android SDK tools package.

- Create a directory for your Android SDK, with no embedded spaces in the path,
	like: C:\android-sdk

- Unzip into your directory.

- CD into your tools/bin directory and run:     sdkmanager --list [--include_obsolete]
	to show all available packages.

- Choose the latest version of build-tools, like "build-tools;30.0.0-rc3"
	and run:    sdkmanager "platform-tools" "build-tools;30.0.0-rc3"
	
- You should also install at least one target,
	the minimum is one of the 'platforms;..' like:   sdkmanager "platforms;android-29"
	but if you want to run that Emulator, select the additional ones you need, like:
	
system-images;android-26;default;x86
system-images;android-26;google_apis;x86
system-images;android-26;google_apis;x86_64

- When finished downloading all the packages you want, run:    sdkmanager --licenses 
	and agree with all the licenses.

	
Ant builds:

For Ant builds you need to use an older Android SDK that has an
android.bat that supports 'android create project' and 'android update project',
and has a tools/ant directory.

Windows:
https://dl.google.com/android/repository/tools_r25.2.5-windows.zip

Mac:
https://dl.google.com/android/repository/tools_r25.2.5-macosx.zip

Linux:
https://dl.google.com/android/repository/tools_r25.2.5-linux.zip


Install as above, but you can CD into the tools directory and run the
	SDK Manager GUI with:   android sdk



How to use ADev:

- It works on Windows, Linux, and Mac.
  
- In config.properties, fill in paths to Java,
	Ant, Android SDK, Gradle, Flutter, and any additional paths
	needed for your builds.
  
- To build an existing project, from the menu choose Project->Home, and select
	your project's Home directory.  The current Project Home is shown in the lower
	status bar.
	
	Note:
	For Gradle based projects, it will modify app/build.gradle
	to allow for signing.

- To be able to build a sample Android Ant project, or one that
	does not have a build.xml, from the menu choose Project->Update.
	The 'android' tool will generate any files or folders that need to be updated,
	as needed for the Android project.
	If the project already has a target defined in it's project.properties file,
	leave the Target SDK, in the Update Dialog, blank.
	Or you can check the project's 'project.properties' file and try to match the target Id.

- To create a new project, select the build environment switches "Use Flutter", "Use Gradle", etc.
	and from the menu choose Project->Create.
 
  
Add <uses-sdk>:
		If selected it will add a statement, like:
		
		<uses-sdk android:minSdkVersion="14" android:targetSdkVersion="28" />
		
		to the AndroidManifest.xml for a Gradle or Android Ant project, but not for Flutter.
		
		For builds that use Gradle it will also add 'minSdkVersion' and 'targetSdkVersion'
		to build.gradle.
		

Ant Create options:
	Build-tools Version:
			Select the SDK Build-tools version to use.


Logcat: Logcat output can be enabled by pressing the "Logcat" toggle button, press again to
		disable output.  If you hit another command button while Logcat is running
		it will automatically be disabled.
		
		You can edit the "logcat_filter" property in config.properties which will
		help to block the output of the selected tags.
		
		All warning and error messages are color highlighted in the output.
		
		You can also easily do a Copy from the output.

Select Device:
		Allows you to select the target device, or Emulator, for Logcat output,
		Uninstall and Install, if you are running more than one.
		At this time, you can only connect a single running
		physical device to the debugger, but you can select between
		multiple Emulators.  The currently selected device is shown in the
		lower status bar.
		

Search: Search Dialog for searching through long Logcat or other output
		in the console window.  'Reset Next' starts the search over from the top.
		
		You can select part of a line where you want to start the
		search and use 'Reset Next'.

		
Select All:
		Allows you to select all the logcat or other console window text.
		

Gradle builds:
		Make sure that you have 'android_sdk_path', 'gradle_path' and 'java_path' paths
		defined	in 'config.properties'.
		Be sure that the 'gradle_path' points to the 'bin' Gradle install directory.
		
		Option in config.properties to use 'gradle' or 'gradlew'.
		It also modifies the default Gradle version to use, in gradle/wrapper/gradle-wrapper.properties,
		from '1.12' to a newer '3.5'.  You can modify it to a newer version if you want.

		When it tries to do a build for a Gradle project
		it checks the Gradle version and tries to select a compatible
		Android Plugin Version.

        ====================================================================		
		From what I've found, the highest Android Gradle Plugin version that will build using
		the Java JDK is 'com.android.tools.build:gradle:3.3.3'.
		To use higher versions, or the latest, you have to use the OpenJDK.
		====================================================================
		
        Android Gradle Plugin:		
		See:	http://tools.android.com/tech-docs/new-build-system
				https://developer.android.com/studio/releases/gradle-plugin.html#updating-plugin
		
		*Note*:
		At this time, Gradle versions: 3.0, 3.1, 3.2 and 3.2.1
		all have build problems using any combination of Android Plugin Versions
		and Android SDK Build-tools versions.  Gradle versions past those build fine.
		
		If you are getting errors like:
		"Gradle version 1.10 is required. Current version is 2.0."
		It needs a different Android Plugin Version.
		
		When it builds, if it doesn't like 'ANDROID_HOME', that it tries to set, create an 'sdk.dir'
		entry in 'local.properties' pointing to your SDK, like:
		
		sdk.dir=C:\\Program Files (x86)\\Android\\android-sdk

Release builds:
		For Gradle, you can define your Keystore path, Key Alias, Keystore password
		and Key Alias passwords in
		config.properties, or let it prompt you for them
		with the Keystore Password Dialog..
		
		For Linux, make sure that the build.gradle file has read and write permissions.
		It tries to modify strings.xml so that might need it as well.
		
		For the Ant build you can add the Keystore path, Key Alias, Keystore password
		and Key Alias passwords to config.properties, or define them in ant.properties using
		'key.store', 'key.alias', 'key.store.password' and 'key.alias.password',
		or let it prompt you for them with the Keystore Password Dialog.

App Bundle:
		Support for Gradle, Kotlin and Flutter.
		Recommended to use Gradle version 5.5.1 or higher.

Use Flutter:
		Install, Android Studio not required:
		https://flutter.dev/docs/development/tools/sdk/releases
		
		Select the version of Flutter from the desired Channel on your platform.
		The latest version on the Stable channel is recommended.
		
		Download into, or create, a directory with no embedded spaces in the path,
		like C:/Dev
		
		Configure Gradle and Android SDK for Flutter:
		CD into your  flutter/bin  and run:
		
		flutter config --android-sdk [path to Android SDK]
		
		Note:
			On Flutter 1.9.1, and later, it doesn't seem to support '--gradle-dir'
			but it does list it under 'Settings:' after you run the command.
			
		flutter config --gradle-dir [path to Gradle]
		
		Flutter requires the Android SDK to have android-28.

		Support for creating and building Flutter projects.
		It relies on using Gradle for the builds, so the 'Use Gradle'
		checkbox is automatically selected.
		
		"Run", "Stop" and "Hot Reload" buttons are available.
		"Hot Reload" is only enabled if you select "Run" and the
		build type is set to "debug" in config.properties.
		
		When using Run it's important to use Stop to kill the
		background daemon Thread when you're finished.
		
		A Command Option for adding to 'build apk', like "--split-per-abi" or "--flavor app2"
		is available in config.properties.
		
		An Emulator, or device, must be running before you select 'Run'.
		
		For "Create", if the Target and Minimum SDK are blank, it will use the defaults.
		It will not create a "<uses-sdk  />" in AndroidManifest.xml.

		
Use Kotlin:
		Support for creating and building Kotlin projects.
		It relies on using Gradle for the builds, so the 'Use Gradle'
		checkbox is automatically selected.

        The minimum required Gradle version is 4.10.1.		
		
		
Use NDK:
		Note:  This only works with the older NDKs that use Android.mk,
		it will not work with the newer versions that use Gradle and CMake.
		
		This is the last step in the process of creating your JNI using the NDK.
		You should have already created your 'jni' directory, makefile, C/C++ source
		file, and generated your .h file.
		Select your project's Home directory using Project->Home, and select 'Use NDK'.
		The Clean button will do 'ndk-build clean' and the Build button 'ndk-build'.
		
		
Keystore passwords:
		For Gradle, Kotlin and Flutter builds it now uses a key.properties
		file to hold the Keystore passwords.
		
Clean:
		Clean also deletes the key.properties file, used for signing, so that you can safely
		archive your project.  And for older projects, that are not set up
		for the key.properties file, it will modify the app/build.gradle file to support it.
		
Pull Files:
		Pulls a file from your Emulator or your device.
		If 'sdcard_path' is defined in your config.properties file, it will append
		it to the default 'sdcard/' path to create the path
		and Pull the file from that directory on your SD card.
		See the notes on it's use in config.properties.
		
		If 'sdcard_path' is not defined, it will do a Pull from the
		/data/data/[packageName]/files directory on your Emulator.
		If more than one file is found it will put up a List Dialog so you can
		select which file to copy.
		The file is copied to the download directory
		specified in your config.properties.
		
Send location:
		Sends Latitude and Longitude settings, in config.properties, to the emulator
		for GPS.  Usually you run this before you start your application.

Wireless debugging:
		Allows you to use adb wireless debugging over Wi-Fi, no root required.
		You can optionally add your device's IP address in config.properties.
		Ideally, you should use the USB driver from your device's manufacturer.
		If you loose your wireless connection you can reconnect by
		selecting Wireless->Re/Connect.
		It should also work with both debuggers.
		
		You can check if your device is still connected by hitting the 'Devices' button
		and see if it's listed, or it's status.

		- Attach your Android device to your computer with USB cable.
		
		- Wait for the indication that the OS has detected and connected with
		your device.
		
		- Select Wireless->Re/Connect.
		
		- After you see the Wireless Connect dialog, unplug your USB cable
		and hit 'OK'.
		
		- When finished with your session, select Wireless->Disconnect.
		

Java Debug Wire Protocol debugger:

		Generally, you should run the debugger on a version of your application
		that has a Debug build.

		Eclipse and Android Studio internally run DDMS and 'adb', and when trying to connect to
		an Android device with the debugger, it can mess up the connection, so before you run
		the debugger, run Task Manager and try to kill any 'adb' processes.  Also, see the
		note below about the BlueStacks Emulator.  Occasionally the
		first attempt at a connection will fail, sometimes 'adb' is slow to respond,
		so try it one more time.
		
		Before you start the debugger, you should start the application that you want to debug.
		
		If you want to debug an (SDK) Gradle project or an Android Studio project
		select 'Use Gradle', for an Android Ant project leave it unchecked, and the application's
		Home Directory should be selected in Project->Home.
		
		
Breakpoints:

        Breakpoints can be set by selecting a source line.  If the line highlights
        you can then hit the "Breakpoint" button to set it.
		The current line, and any set breakpoints, will be highlighted.
		There is a Breakpoints Menu to look at or clear any selected breakpoints.
		You can select a line, where a breakpoint is set, and a Dialog will pop-up asking
		if you want to clear it.
		
Stepping:

		When possible, it will try to follow the source of it's current location,
		and when you use Step-Into and Step-Out.
		
Dump Stack:

		Dumps the thread's stack.  Only works when the thread is suspended.

SDK Source:

		It checks what SDK version your Emulator, or device, is using, and if
		you have the matching SDK Source in your SDK "sources" directory, it will
		follow and show it so you can step through it.
		
		If the source isn't available it will put up a Dialog with
		information about the new location:
		
		Thread                                 Method                              Location Index
		(<1> main) android.app.ActivityThread  performResumeActivity()  Line: 2118 (79)
		
		
Variable Window:

		The variable Window shows all the local variables, any Method arguments,
		and shows the static and instance variables of the class with a darker background.
		It will show the values of any primitives, and Strings.
		It shows array variable values in the pop-up Dialog.
		You can select a variable from the List and the Variable Dialog will pop-up, which shows
		the variable's signature, and you can change it's value using "Set".
		To set the value of a String to quote quote use two double quotes like: "".
		Optionally, enter hex values with a leading '0x' like: 0x3a

		
Flutter debugger:

        Select Run, then after application launches select Window->Debug.
        
		You can expand Class and nested Class variables.
		List is now fully supported.
		
		There is a delay when the debugger first starts,
		as it's setting things up in the background.
		

Build Errors:
		If you get any strange build errors, search for it on Google.
		With the latest versions of the Build-tools you rarely have problems
		but sometimes the fix might be to use an earlier version of the Build-tools.
		Also, you can check 'Add <uses-sdk>' and ensure that your "Target SDK"
		matches the 'target' in project.properties.

		For errors like:

		UnsupportedClassVersionError: ... :
		Unsupported major.minor version 52.0


BlueStacks Emulator:
		If you have the BlueStacks Emulator on your machine, and you want to
		use a different Emulator or device, you have to stop the Services that BlueStacks
		automatically runs, or they will interfere with uninstalls, installs and debuging.

		

Release notes:
	
ADev-2.9.6:
    Improvements to project level and app/build.gradle for Android Gradle builds.
    Now supports latest versions of Android Gradle Plugin using the OpenJdk.
    Some Kotlin build.gradle improvements.

ADev-2.9.8:  
    Many improvements to the Flutter debugger.

ADev-3.0.0:
    Many improvements to the Flutter and JDWP debuggers.
    Other improvements.
    

I use it for all of my own development, and try to fix what issues I see,
but please let me know of any issues that you find so that I can fix them.

joes0451@outlook.com


