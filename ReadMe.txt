
You can use the latest Android SDK for Gradle, Kotlin and Flutter projects.

You can use my SDK Manager, if you want, to manage the SDK:

https://sourceforge.net/projects/sdk-manager/

How to use ADev:

- It works on Windows, Linux, and Mac.
  
- In config.properties, fill in paths to Java,
	Ant, Android SDK, Gradle, Flutter, and any additional paths
	needed for your builds.

Project->Home:
    To build an existing project, from the menu choose Project->Home, and select
	your project's Home directory.  The current Project Home is shown in the lower
	status bar.
	
	Note:
	For Gradle based projects, it will normally modify the module-level build.gradle
	to allow for signing.
	It will look at the settings in config.properties, like 'use_key_properties', to determine
	how to set up signingConfigs and other things.
	If you want, you can turn off modifying your projects by setting
	'dont_modify_build_gradle' to "true" in config properties.
	

- To create a new project, select the build environment switches "Use Flutter", "Use Gradle", etc.
	and from the menu choose Project->Create.

Ant:
    To be able to build a sample Android Ant project, or one that
	does not have a build.xml, from the menu choose 'Project->Update'.
	The 'android' tool will generate any files or folders that need to be updated,
	as needed for the Android project.
	If the project already has a target defined in its project.properties file,
	leave the Target SDK, in the Update Dialog, blank.
	Or you can check the project's 'project.properties' file and try to match the target Id.
 
	Also, Ant builds don't work well with the OpenJdk, use the older regular Java JDK.
	
Add <uses-sdk>:
		If selected it will add a statement, like:
		
		<uses-sdk android:minSdkVersion="14" android:targetSdkVersion="28" />
		
		to the AndroidManifest.xml for a Gradle or Android Ant project, but not for Flutter.
		
		For builds that use Gradle it will also add 'minSdkVersion' and 'targetSdkVersion'
		to build.gradle.
		

Ant Create options:
	Build-tools Version:
			Select the SDK Build-tools version to use.


Logcat:
        Logcat output can be enabled by pressing the "Logcat" toggle button, press again to
		disable output.  If you hit another command button while Logcat is running
		it will automatically be disabled.
		
		You can also edit the "logcat_filter" property in config.properties which will
		help to block the output of the selected tags.
		
		You can also easily do a Copy from the output.
		
		All warning and error messages are color highlighted in the output.
		
PID Logcat:		
		You can choose to just view log output from the running Process Id
		by setting 'use_pid_logcat' to "true" in config properties.

		
Select Device:
		Allows you to select the target device, or Emulator, for Logcat output,
		Uninstall and Install, if you are running more than one.
		At this time, you can only connect a single running
		physical device to the debugger, but you can select between
		multiple Emulators.  The currently selected device is shown in the
		lower status bar.
		

Search: Search Dialog for searching through long Logcat or other output
		in the console window.  'Reset Next' starts the search from the top.
		
		At any point you can select part of a line and when you hit "Reset Next"
		in the Search Dialog it will begin searching from there.
		This is useful for skipping large parts of the output.
		
Refresh Properties:
        Refreshes the settings in config.properties.
		
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
		
		If your build fails, you can try using a higher	or lower Gradle version,
		and that can sometimes get it to successfully build the project.

		
Release builds:
SingingConfigs:
        For Gradle and Kotlin, but not Flutter, you can use the option in config.properties:
        'use_key_properties' to use a key.properties file for the signingConfigs,
        or have the keystore password information go through the command line
        so no key.properties file is needed.  If the keystore password information
        in config.properties is empty it will prompt you for them with the Keystore Password Dialog.
		
		For Linux, make sure that the build.gradle file has read and write permissions.
		It tries to modify strings.xml so that might need it as well.
		
		For the Ant build you can add the Keystore path, Key Alias, Keystore password
		and Key Alias passwords to config.properties, or define them in ant.properties using
		'key.store', 'key.alias', 'key.store.password' and 'key.alias.password',
		or let it prompt you for them with the Keystore Password Dialog.
		
Gradlew:
        With 'use_gradlew' enabled in config.properties, you'll have a Commands
        menu with standard gradlew tasks, and you can add tasks with 'additional_commands'
        in config.properties and run them from there.
        Combined with the 'dont_modify_build_gradle' option, you can run gradlew commands
        in projects without modifying them, useful when trying to build projects you
        download from GitHub.        

Gradle clean, Unable to delete file '...\build'
        If you have problems with Gradle not being able to delete the build directory.
        There are other optional ways to do a "Clean" in config.properties.

        
App Bundle:
		For best results it is recommended to use Gradlew by setting "use_gradlew" to "true"
		in config.properties.

		Support for Gradle, Kotlin and Flutter.
		Recommended to use Gradle version 5.5.1 or higher.

		Generate your Keystore .jks file using Java 'keytool' or use this:

Generate Key Store:
        In config.properties, fill in the ..keystore_path, ..key_alias, ..key_store_password
        and ..key_alias_password entries for either the App Bundle or APK.
        Select 'Project->Generate Key Store', fill in all the fields
        and hit 'Submit'.  If the fields are empty it will put up a Dialog for
        you to enter them.  A certificate will be generated in the ..keystore_path directory.
        Gradle will use this to sign your App Bundle or APK.
        It will not overwrite an existing certificate of the same name and type.
		
		If you are changing an existing project to use app bundle
		make sure that you delete the 'key.properties'
		file in the project directory.
		
		You can learn more about app signing here:
		https://developer.android.com/studio/build/building-cmdline#gradle_signing
		https://developer.android.com/studio/publish/app-signing
		
App Bundle Install:
        If you are using App Bundle, when you hit the Install button, it will
        figure out the path to the .aab file and then use bundletool commands
        to load the connected device.  If it can't find the path it will put up a Dialog
        where you can point to it.  Also works with Emulator.
        There is usually a delay before you see all the output.

        
Use Flutter:
        Flutter can have issues with the latest changes, so
        to insure it has the best chance of working:

        Many things in Flutter depend on Android Studio.       
        If you have Android Studio, make sure it is up to date with the latest
        version and has the latest Android SDK and Java versions.
        
        If you don't have Android Studio make sure Flutter is up to date
        with it's latest version and has the latest Dart SDK and you are using the latest Android SDK and
        have a new enough Java OpenJDK.
        
        Run this to check things:
        flutter doctor -v
        
		Support for creating and building Flutter projects.
		It relies on using Gradle for the builds, so the 'Use Gradle'
		checkbox is automatically selected.
		
		"Run", "Attach", "Stop" and "Hot Reload" buttons are available.
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
		
		Kotlin DSL .kts is supported for existing projects.

        The minimum required Gradle version is 4.10.1.		
		
		
Use NDK:
		Note:  This only works with the older NDKs that use Android.mk,
		it will not work with the newer versions that use Gradle and CMake.
		
		This is the last step in the process of creating your JNI using the NDK.
		You should have already created your 'jni' directory, makefile, C/C++ source
		file, and generated your .h file.
		Select your project's Home directory using Project->Home, and select 'Use NDK'.
		The Clean button will do 'ndk-build clean' and the Build button 'ndk-build'.
		
		
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
		If you lose your wireless connection you can reconnect by
		selecting Wireless->Re/Connect.
		It should also work with both debuggers.
		
		You can check if your device is still connected by hitting the 'Devices' button
		and see if it's listed, or its status.

Connect:
        It will now automatically do a Disconnect if there was a previous connection.

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
		
		Before you start the debugger, you should start the application that you want to debug.
		
		Once the application is running select Window->Debug and slect the source you want to use.
		
		*Note*:
		Often you have to navigate around in the app till you are near the part you want to debug
		and select 'Debug->Refresh Classes' to get the source you want to show.

		Eclipse and Android Studio internally run DDMS and 'adb', and when trying to connect to
		an Android device with the debugger, it can mess up the connection, so before you run
		the debugger, run Task Manager and try to kill any 'adb' processes.  Also, see the
		note below about the BlueStacks Emulator.  Occasionally the
		first attempt at a connection will fail, sometimes 'adb' is slow to respond,
		so try it one more time.
		
		If you want to debug an (SDK) Gradle project or an Android Studio project
		select 'Use Gradle', for an Android Ant project leave everything unchecked, and the application's
		Home Directory should be selected in Project->Home.
		
		
Breakpoints:

        Breakpoints can be set by selecting a source line.  If the line highlights
        you can then hit the "Breakpoint" button to set it.
		The current line, and any set breakpoints, will be highlighted.
		There is a Breakpoints Menu to look at or clear any selected breakpoints.
		You can select a line, where a breakpoint is set, and a Dialog will pop-up asking
		if you want to clear it.
		
Stepping:

		When possible, it will try to follow the source of its current location,
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

        There are two ways you can use the Flutter debugger,
        both require a debug build of the application:

Run
        Select Run and wait for it to build and run the application and the progress bar to stop.
        Then select Window->Debug and click on the name of the source file that you want to debug.
        
Attach
        The project of the application you want to run should be the selected project.
        Start the Flutter application on the emulator or device.
        
        *Note*:
        If the application was running from a previous debugging session, always restart it
        to give Attach the best chance of working.        
        Once the application is running, select Attach and wait for the progress bar to stop.
        Then select Window->Debug and click on the name of the source file that you want to debug.
		

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
		automatically runs, or they will interfere with uninstalls, installs and debugging.
		

Release notes:
    
ADev-3.3.2:
    Greatly improved wireless connect and disconnect.
    Some Flutter improvements.
    Other improvements. 
    
ADev-3.3.3:
    Fixed issue with Release and Debug builds.

ADev-3.3.4:
    Improved getting package name, fixed 'namespace' issue.
    Tried to improve PID logcat.
    

I use it for all of my own development, and try to fix what issues I see,
but please let me know of any issues that you find so that I can fix them.

joes0451@outlook.com


