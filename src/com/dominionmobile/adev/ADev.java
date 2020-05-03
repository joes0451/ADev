

/*
 * :folding=explicit:collapseFolds=1:
 */

	/**
	 *	  ADev is a lightweight Android development tool
	 *
	 *	  Copyright (c) 2013 - 2020 Joseph Siebenmann
	 *
	 *    This program is free software: you can redistribute it and/or modify
	 *    it under the terms of the GNU General  Public License as published by
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

import java.awt.Color;
import java.awt.event.*;
import java.awt.Container;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JToggleButton;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.SpinnerListModel;
import javax.swing.SingleSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.JFileChooser;
import javax.swing.JScrollBar;
import javax.swing.BorderFactory;
import javax.swing.UIManager;
import javax.swing.DefaultListModel;
import javax.swing.UIDefaults;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ListCellRenderer;
import javax.swing.WindowConstants;
import javax.swing.ListSelectionModel;
import javax.swing.ListCellRenderer;
import javax.swing.ButtonModel;
import javax.swing.JViewport;
import javax.swing.border.Border;
import javax.swing.SwingWorker;
import javax.swing.JTabbedPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;
import javax.swing.BoundedRangeModel;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Window;
import java.awt.Point;
import java.awt.FontMetrics;
import javax.swing.AbstractButton;
import javax.swing.JViewport;
import java.awt.FlowLayout;
import javax.swing.JComponent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.InputStreamReader;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.net.SocketAddress;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URLConnection;
import java.net.URL;
import java.nio.file.StandardCopyOption;
import java.nio.file.Files;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.net.*;
import javax.swing.text.*;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.Enumeration;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Queue;
import java.util.LinkedList;
import javax.swing.border.LineBorder;
import javax.swing.text.BadLocationException;
import java.lang.reflect.InvocationTargetException;
import java.util.NoSuchElementException;
import java.util.EmptyStackException;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.plaf.ColorUIResource;
import javax.swing.border.EtchedBorder;
import java.util.concurrent.Semaphore;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeNode;
import javax.swing.plaf.TabbedPaneUI;
import javax.swing.text.Highlighter;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import java.awt.CardLayout;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import com.dominionmobile.adev.SocketTransport;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;


public class ADev
{
	
	//{{{	Data
	private static JFrame mainJFrame;
	private static JFrame frame;
	private static JFrame progressJFrame;
	private JFrame createFrame;
	private JFrame updateFrame;
	private JFrame searchFrame;
	private JFrame pullFrame;
	private JFrame selectDeviceFrame;
	private JFrame sdkFrame;
	private JFrame setBreakpointFrame;
	private JFrame emulatorFrame;
	private JFrame informationFrame;
	private static JFrame releaseFrame;
	private static JFrame waitJFrame;
	private static JFrame variableFrame;
	private static JFrame breakpointFrame;
	private static JPanel mainPanel;
	private JTextPane textPane;
	private static JTextArea jTextArea;
	private JTree jTree;
	private JTree variableJTree;
	private JProgressBar jProgressBar;
	private static JList jList;
	private static JList breakpointDialogJList;
	private JList pullDialogJList;
	private static JScrollPane textScrollPane;
	private static JScrollPane tabScrollPane;
	private JScrollPane treeScrollPane;
	private JScrollPane variableTreeScrollPane;
	private JScrollPane listScrollPane;
	private JSplitPane horzSplitPane;
	private static JTabbedPane tabbedPane;
	private StyledDocument doc;
	private Style normalStyle;
	private Style warningStyle;
	private Style errorStyle;
	private DefaultListModel defListModel;
	private static ADev aDev;
	static JList variableDialogJList;
	
	Icon build24Icon;
	Icon debug24Icon;
	
	static CountDownLatch completeLatch;
	static CountDownLatch requestLatch;
	static CountDownLatch progressLatch;
	//static Object messageObject;
	
	static Queue eventQueue;
	
	static WebSocket websocket;
	WebSocketObject webSocketObject;
	
	static volatile int iLineMode;
	static final int MODE_BREAKPOINT_ADDED = 1;
	//static final int MODE_BREAKPOINT_HIT = 2;
	static final int MODE_PAUSE_BREAKPOINT = 2;

	static volatile int iDebugCommand;
	static final int DEBUG_COMMAND_SET_BREAKPOINT = 1;
	static final int DEBUG_COMMAND_STEP = 2;
	static final int DEBUG_COMMAND_RESUME = 3;

	
	static boolean bIsReply;
	
	static Object EventReplyObject;
	static DefaultMutableTreeNode topNode;
	
	ShowProgressTask showProgressTask;
	
	private JTextArea jtAreaOutput;
	
	private JPasswordField keyAliasPasswordField;
	private JPasswordField keystorePasswordField;
	
	private JTextField keyAliasField;
	private JTextField keystorePathField;
	
	private JTextField setBreakpoint;
	private JTextField packageNameField;
	private JSpinner targetSdkSpinner;
	private JSpinner minSdkSpinner;
	private JSpinner updateTargetSdkSpinner;
	private JSpinner emulatorsSpinner;
	private JSpinner deviceSpinner;
	private JSpinner buildToolsSpinner;
	private JSpinner sourceCSpinner;
	private JSpinner targetCSpinner;
	
	private JTextField appNmField;
	private JTextField activityField;
	private JTextField organizationField;
	private JTextField packageField;
	private JTextField projectPathField;
	private JTextField updateProjectPathField;
	private JTextField libraryPathField;
	private JTextField pluginVersionField;
	private JTextField kotlinVersionField;
	private JTextField searchField;
	private JTextField setBreakpointField;
	private JRadioButton projectRadioButton;
	private JRadioButton libProjectRadioButton;
	private JRadioButton appRadioButton;
	private JRadioButton packageRadioButton;
	private JRadioButton pluginRadioButton;
	private JLabel activityLbl;
	private JLabel libraryPathLbl;
	private JLabel organizationLbl;
	private JCheckBox subprojectsCheckBox;
	private JCheckBox emulatorDefaultCheckBox;
	private ButtonGroup sdkButtonGroup;
	
	private static JTextField variableNameField;
	private static JLabel setLbl; 
	private static JTextField signatureField;
	private static JTextField variableSetField;
	private JCheckBoxMenuItem uSdkMenuItem;
	private JCheckBoxMenuItem uGradleMenuItem;
	private JCheckBoxMenuItem uKotlinMenuItem;
	private JCheckBoxMenuItem uNDKMenuItem;
	private JCheckBoxMenuItem uFlutterMenuItem;
	private JMenuItem updateMenuItem;
	
	private JRadioButtonMenuItem buildMenuItem;
	private JRadioButtonMenuItem debugMenuItem;
	private JRadioButtonMenuItem localMenuItem;
	private JRadioButtonMenuItem staticMenuItem;
	private JToggleButton logcatToggleButton;
	private JButton sdkSubmitButton;
	private JButton cleanButton;
	private JButton debugButton;
	private JButton releaseButton;
	private JButton runButton;
	private JButton reloadButton;
	private JButton variableSubmitButton;
	private JButton breakpointRemoveButton;
	private JButton setBreakpointButton;
	private JButton setBreakpointCancelButton;
	private JButton killButton;
	private JButton stopButton;
	private JButton libraryChooseButton;

	private JLabel statusLabel;
	private JLabel deviceLabel;
	private JLabel statusPath;
	CardLayout cardLayout;
	JPanel cardPanel;
	JMenu subMenu;
	
	static DefaultMutableTreeNode currentNode;

	static volatile String sVariableName;
	static volatile String sVariableSignature;
	static volatile String sVariableValue;
	
	static CheckListItem[] checkListItems;
	 
	//static volatile boolean bLoadFinished;
	static volatile boolean bKotlinVersionFinished;
	static volatile boolean bMoveCursorToTop;
	static volatile boolean bShowCurrentLine;
	static volatile boolean bDefaultTabShowing;
	static volatile boolean bTabCreated;
	static volatile boolean bTabSelected;
	static volatile boolean bIsBreakpointStepEvent;
	static volatile boolean bRefreshFinished;
	static volatile boolean bDidUpdateSource;
	static volatile boolean bNeedsUpdate;
	static volatile boolean bHaveSDKSource;
	static volatile boolean bHitClose;
	static volatile boolean bDidAddTab;
	static volatile boolean bGotStateChanged;
	static volatile boolean bGetDevices;
	static volatile boolean bIsDebug;
	//static volatile boolean bDevicesFinished;
	//static volatile boolean bClearTabs;
	static volatile boolean bGradleConfigFinished;
	//static volatile boolean bConnectWirelessFinished;
	static volatile boolean bSelectFinished;
	static volatile boolean bDidUpdate;
	static volatile boolean bGetAndroidPluginVersion;
	static volatile boolean bEmulatorsFinished;
	static volatile boolean bProcessResultFinished;
	static volatile boolean bDoingProcessCommand;
	static volatile boolean bWirelessConnected;
	static volatile boolean bKillLogcat;
	static volatile boolean bEnableStoreFile;
	static volatile boolean bEnableBuildTypesDebug;
	static volatile boolean bEnableBuildTypesRelease;
	static volatile boolean bDebugReleaseFinished;
	static volatile boolean bKillVMService;
	static volatile boolean bGradleSelected;
	static volatile boolean bNDKSelected;
	static volatile boolean bFlutterSelected;
	static volatile boolean bKotlinSelected;
	static volatile boolean bInitBuildGradleFinished;
	static volatile boolean bModifyGradleWrapperBgThread;
	static volatile boolean bDoGradleCleanup;
	static volatile boolean bKillDaemonOutput;
	static volatile boolean bSendReload;
	static volatile boolean bRunSelected;
	static volatile boolean bKillDaemonThread;
	static volatile boolean bDaemonStdInFinished;
	static volatile boolean bReleaseCheckFinished;
	static volatile boolean bOkayToDoRelease;
	static volatile boolean bHomeJustSet;
	static volatile boolean bDeletedKeyProperties;
	static volatile boolean bDeleteKeyPropertiesFinished;
	static volatile boolean bUsingAppProject;
	static volatile boolean bShowProgressBar;
	static volatile boolean bCreateProgressFinished;
	static volatile boolean bCreateGradleProjectFinished;
	static volatile boolean bCreateBuildGradleFinished;
	//static volatile boolean bSDKDataFinished;
	static volatile boolean bRunIOBgThread;
	static volatile boolean bCaretDirty;
	static volatile boolean bOrgCaretDirty;
	static volatile boolean bMessageReceived;
	static volatile boolean bResponseReceived;
	static volatile boolean bHaveWsUri;
	static volatile boolean bGotPauseBreakpoint;
	static volatile boolean bStepFinished;
	static volatile boolean bBuildChildNodes;
	static volatile boolean bVariableNodeSelected;
	static volatile boolean bProcessEventFinished;
	static volatile boolean bUpdateVariableJTreeFinished;
	static volatile boolean bDebugRan;
	static volatile boolean bFlutterSetLibraryDebuggableStarted;
	//static volatile boolean bKillVMService;
	volatile boolean bKeyBreakOut;
	
	volatile boolean bHaveSource;
	volatile boolean bCreateFinished;
	volatile boolean bJSONFinished;
	volatile boolean bIOBgThreadFinished;
	volatile boolean bCleanFinished;
	volatile boolean bIsDirty;
	volatile boolean bIsCleanDebug;
	static volatile boolean bProgressBarFinished;
	
	static volatile int iRemoveKey;
	static volatile int iEventKey;
	static volatile int iPacketId;
	static volatile int iVariableMode;
	static volatile int iVariableTableKey;
	static volatile int iBreakpointRequestId;
	static volatile int iProjectDialog;
	static volatile int iCardShowing;
	static volatile int iSearchIndex;
	static volatile int iPreviousIndex;
	static volatile int iEndIndex;
	static volatile int iVariableTableIndex;
	static volatile int iLocalVariableKey;
	static volatile int iVariableType;
	static volatile int iTabCount;
	static volatile int iTabArIndex;
	static volatile int iCurrentSelectedTabIndex;
	static volatile int iSelectedIndex;
	static volatile int iMethodIndex;
	static volatile int iErrorCode;
	static volatile int iRemoveIndex;
	static volatile int iTabLevel;
	static volatile int iPrevTabCount;
	static volatile int iSelectMode;
	static volatile int iRequestId;
	static volatile int iDaemonCommand;
	static volatile int iMessageId;
	static volatile int iParamArIndex;
	static volatile int iTokenPos;
	static volatile int iResumeTokenPos;
	static volatile int iPauseBreakpointTokenPos;
	static volatile int iPreviousLine;
	static volatile int iWaitForId;
	static volatile int iPathCount;
	static volatile int iTokenPosLine;
	static volatile int iLibraryStartIndex;
	static volatile int iSelectedElement;
	static int iPort;
	
	static volatile long lMainThreadId;
	static volatile long lCurrentThreadId;
	static volatile long lCurrentFrameId;
	static volatile long lThisObjectId;
	static volatile long lBreakpointLocationIndex;
	static volatile long lStepRequestId;
	static volatile long lPendingRequestId;
	static volatile long lThrowableRefTypeId;
	static volatile long lCurrentMethodId;
	static volatile long lMethodSelection;
	static volatile long lCurrentSelectedMethod;
	static volatile long lLocationMethod;
	static volatile long lMethodId;
	static volatile long lEventClassId;
	static volatile long lEventMethodId;
	static volatile long lCurrentlyShowingClassId;
	static volatile long lCurrentlyShowingMethodId;
	static volatile long lClassVariableKey;
	static volatile long lMethodIdSave;
	static volatile long lClassIdSave;
	
	static volatile String sThreadName;
	static volatile String sClassSignature;
	static volatile String commandPhrase;
	static volatile String sFullSourcePath;
	static volatile String sDeviceIPAddress;
	
	//static volatile String[] sTokenPosTableAr;
	static volatile String sKeystorePassword;
	static volatile String sKeyAliasPassword;
	static volatile String sKeystorePath;
	static volatile String sKeyAlias;
	
	static volatile String sSdkDir;
	static volatile String sDeviceName;
	static volatile int iReplyKey;
	static volatile String sSdkVersion;
	static volatile String sKotlinVersion;
	static volatile String sLatestAndroidPluginVersion;
	static volatile String sGPSLatitude;
	static volatile String sGPSLongitude;
	static volatile String sBuildToolsVersion;
	static volatile String sMinSdk;
	static volatile String sTargetSdk;
	static volatile String sWirelessID;
	static volatile String sProcessResult;
	static volatile String sGradleType;
	static volatile String sGradleCommandOption;
	static volatile String sShowSourceAndTargetCompatibility;
	static volatile String sOrganization;
	static volatile String sAndroidLanguage;
	static volatile String sIosLanguage;
	static volatile String sBuildTarget;
	static volatile String sAndroidTargetPlatform;
	static volatile String sRunBuildType;
	static volatile String sDartSdkPath;
	static volatile String sDartProgramName;
	static volatile String sAppId;
	static volatile String sDebugUri;
	static volatile String androidSdkPathAntS;
	static volatile String androidSdkPathGradleS;
	static volatile String sUseAppBundle;
	static volatile String sUseGradlew;
	static volatile String ASSEMBLE_RELEASE;
	static volatile String ASSEMBLE_DEBUG;
	static volatile String sBuildApkOption;
	static volatile String sIsolateId;
	static volatile String sScriptId;
	static volatile String sScriptsSearchName;
	static volatile String sResultMessage;
	static volatile String sBreakpointId;
	static volatile String sBreakpointScriptId;
	static volatile String g_sMessage;
	static volatile String sSourceFilePath;
	static volatile String sPropertiesClassId;
	static volatile String sStreamMessage;
	static volatile String sVariablesScriptId;
	static volatile String sParentClassName;
	static volatile String sSelectedScriptId;
	static volatile String sEnableSoftwareRendering;
	static volatile String sGlobalTestClassId;
	static volatile String sGlobalTestObjectId;
	static volatile String sTreeSelectionName;
	static volatile String g_sName;
	static volatile String g_sClassId;
	static volatile String g_sClassName;
	static volatile String g_sObjectId;
	static volatile String sSolarBodyObjectId;
	static volatile String sOrgSelected;
	static volatile String sOrgClassId;
	static volatile String sOrgObjectId;
	//static volatile String sCurrentScriptId;
	
	static String sDebugPackageName;
	static String sApplicationName;
	static String sJVMVersion;
	static String sJavaVersion;
	static String sTargetC;
	static String sSourceC;
	static String sKPackageName;
	static String sFlutterSdkPath;
	static String sKActivityName;
	static String sDialogTitle;
	static String sWirelessMessage;
	
	static StringBuffer filePathSb;
	
	static int iSourceLineAdjust;
	static int iSelectedLine;
	static int iWirelessErrorCode;
	static volatile boolean bLineSelected;
	static volatile boolean bMethodChanged;
	static volatile boolean bDoBuildGradleUpdate;
	static volatile boolean bUpgradeBuildGradleFinished;
	static volatile boolean bGhostVariables;
	static volatile boolean bInternalFinished;
	static volatile boolean bAdbThreadFinished;
	static volatile boolean bSourceExists;
	static volatile boolean bAppNameFinished;
	static volatile boolean bInitWirelessFinished;
	static volatile boolean bDisconnectWirelessFinished;
	
	String sSourceDirectory = "";
	String sProjectPathLead = "";
	String sMethodSourceName = "";
	String sSourceFileName = "";
	static long currentClassId;
	
	static DefaultListModel defaultListModel;

	static byte[] buildBuf = new byte[128];
	static byte[] jsonBuf = null;
	volatile byte[] sourceBuf;
	
	static volatile byte[] receivePacket;
	static volatile byte[] eventPacket;
	
	DefaultMutableTreeNode root;
	static VariableTableInfo thisTableInfo;
	
	private static Semaphore commandControl = new Semaphore(1);
	private static Semaphore eventArControl = new Semaphore(1);
	private static Semaphore processControl = new Semaphore(1);
	
	static volatile Process daemonProcess = null;
	static volatile OutputStream daemonOutputStream = null;
	
	static BlockingQueue queue = null;
	
	// Variably sized data types..
	// Returned from IDSizes command (7)..
	static int iFieldIdSize;
	static int iMethodIdSize;
	static int iObjectIdSize;
	static int iReferenceTypeIdSize;
	static int iFrameIdSize;
	
	static ArrayList AllThreadsAr;
	static ArrayList AllClassesAr;
	static ArrayList AllMethodsAr;
	static ArrayList LineTableAr;
	static ArrayList FieldsAr;
	static ArrayList EventAr;
	static ArrayList FrameSlotAr;
	static ArrayList FramesAr;
	static ArrayList TreeClassesAr;
	static ArrayList BreakpointAr;
	static ArrayList EventPacketAr;
	static ArrayList ArrayFrameSlotAr;
	static ArrayList VariableTableAr;
	static ArrayList ClassVarAr;
	static ArrayList StaticValueAr;
	static ArrayList NonStaticValueAr;
	static ArrayList LocalValueAr;
	static ArrayList DevicesAr;
	static ArrayList EmulatorsAr;
	//static ArrayList TabTextAreaAr;
	static ArrayList TabInfoAr;
	static ArrayList ClassMethodAr;
	static ArrayList LsOutAr;
	static ArrayList FileAr;
	static ArrayList ClassesBySignatureAr;
	static ArrayList ConnectDevicesAr;
	static ArrayList ParamAr;
	//static ArrayList LibFileAr;
	static ArrayList ScriptsAr;
	static ArrayList VariableInfoAr;
	static ArrayList LibraryAr;
	
	//static Hashtable EventInfoHt;
	static volatile LinkedHashMap VariableInfoLHm;
	//static volatile Hashtable LineTableHt;
	static volatile LinkedHashMap ClassVariableLHm;
	static volatile LinkedHashMap LocalVariableLHm;
	static volatile LinkedHashMap SelectedNodesLHm;
	
	static volatile Vector localVariableVector;
	static volatile Vector staticVariableVector;
	static volatile Vector jListVariableVector;
	static volatile Vector variableDialogVector;
	static volatile Vector variableArrayVector;
	static String[] SdkDirs;
	
	private static volatile String projectHomeS = null;
	private String createProjectHomeS;
	
	private static String logcatFilterS = null;
	private static String androidSdkPathS;
	private static String javaPathS;
	private static String antPathS;
	private static String gradlePathS;
	private static String ndkPathS;
	private static String gradleOfflineS;
	private static volatile String commandResultS;
	
	private String internalCommandS;
	private boolean bBreakOut;
	private volatile boolean bLogcatOn;
	private volatile boolean bLogcatWasOn;
	private volatile boolean bDoKill;
	
	private boolean bReIssueRelease;
	private int iOS;
	private String apkNameS;
	private String packageNameS;
	private String downloadPathS;
	private String sdCardPathS;
	private String commandS;
	private volatile String actionCommandS;
	private volatile String buildFilenameS;
	private String outputEndS;
	private String packageS;
	private String sPackageName;
	
	private volatile boolean bFinished;
	private volatile boolean bKillFinished;
	private volatile boolean bReleaseFinished;
	private volatile boolean bCommandFinished;
	private volatile int iTarget;
	private volatile int iMinSdk;
	private volatile int iBuildType;
	private volatile int iFontSize;
	private volatile String targetApiS;
	private ArrayList targetDescAr = null;
	private ArrayList targetApiAr = null;
	
	private byte[] tempBuf = new byte[4096];
	private StringBuffer lineSb = new StringBuffer(4096);
	private OutputStream processOutputStream;

	static final int WINDOWS = 0;
	static final int LINUX = 1;
	static final int LINUX_MAC = 2;

	static final int NORMAL = 0;
	static final int WARNING = 1;
	static final int ERROR = 2;
	
	static final int DEBUG_BUILD = 0;
	static final int RELEASE_BUILD = 1;
	
	static final int CREATE_DIALOG = 0;
	static final int UPDATE_DIALOG = 1;
	
	static final int BUILD_CARD = 0;
	static final int DEBUG_CARD = 1;
	
	static final int SELECT_NORMAL = 0;
	static final int SELECT_CONNECT = 1;
	
	static final int DAEMON_RELOAD = 0;	// Flutter daemon commands..
	static final int DAEMON_STOP = 1;
	
	//static final int DISPLAY_WIDTH = 85;
	static final int DISPLAY_WIDTH = 105;
	static final int DISPLAY_BREAK_WIDTH = DISPLAY_WIDTH - 5;
	
	static final String CLEAN = "Clean";
	static final String DEBUG = "Debug";
	static final String BUILD = "Build";
	static final String RELEASE = "Release";
	static final String PRE_RELEASE = "Pre_Release";
	static final String RUN = "Run";
	static final String HOT_RELOAD = "Hot Reload";
	static final String KILL_SERVER = "Kill-Server";
	static final String STOP = "Stop";
	static final String UNINSTALL = "Uninstall";
	static final String INSTALL = "Install";
	static final String HOME = "Home";
	static final String DEVICES = "Devices";
	static final String PULL_FILES = "Pull Files";
	static final String RELEASE_PW = "Release Passwords";
	static final String SUBMIT = "Submit";
	static final String CANCEL = "Cancel";
	static final String LOGCAT = "Logcat";
	static final String CREATE = "Create";
	static final String UPDATE = "Update";
	static final String LAUNCH = "Launch Emulator";

	static final String CREATE_SUBMIT = "create_submit";
	static final String CREATE_CANCEL = "create_cancel";
	static final String UPDATE_SUBMIT = "update_submit";
	static final String UPDATE_CANCEL = "update_cancel";
	static final String PROJECT_PATH_CHOOSER = "project_path_chooser";
	static final String BREAKPOINT_SUBMIT = "breakpoint_submit";
	static final String BREAKPOINT_CANCEL = "breakpoint_cancel";
	static final String CLOSE_DIALOG = "close_information_dialog";

	static final String BREAKPOINT_ADDED = "BREAKPOINT_ADDED";
	//static final String BREAKPOINT_HIT = "BREAKPOINT_HIT";
	static final String PAUSE_BREAKPOINT = "PAUSE_BREAKPOINT";
	
	static final String BREAKPOINT = "Breakpoint";
	static final String STEP_INTO = "Step Into";
	static final String STEP_OVER = "Step Over";
	static final String STEP_OUT = "Step Out";
	static final String RESUME = "Resume";
	static final String PACKAGE_NAME = "Package Name";
	static final String SEARCH = "Search";
	static final String SELECT_ALL = "Select All";
	static final String REFRESH_CLASSES = "Refresh Classes";
	static final String SDK_SOURCE = "SDK Source";
	static final String SDK_SOURCE_SUBMIT = "sdkSource_submit";
	static final String SDK_SOURCE_CANCEL = "sdkSource_cancel";
	static final String BREAKPOINTS = "Breakpoints";
	static final String CLASS_FIELDS = "Class variables";
	static final String THIS_OBJECT = "This Object";
	static final String DISCONNECT = "Disconnect";
	static final String VARIABLE_SUBMIT = "variable_submit";
	static final String VARIABLE_CANCEL = "variable_cancel";
	static final String LIBRARY_CHOOSER = "library_chooser";
	static final String DUMP_STACK = "Dump Stack";
	static final String WIRELESS_CONNECT = "wireless_connect";
	static final String WIRELESS_DISCONNECT = "wireless_disconnect";
	static final String CLEAR_LOGCAT = "Clear Logcat";
	static final String SEARCH_NEXT = "search_next";
	static final String SEARCH_CANCEL = "search_cancel";
	static final String SEARCH_RESET_NEXT = "search_reset_next";
	static final String SELECT_DEVICE = "Select Device";
	static final String DEVICE_SUBMIT = "select_device_submit";
	static final String DEVICE_CANCEL = "select_device_cancel";
	static final String SEND_LOCATION = "Send location";
	static final String SET_BREAKPOINT = "Set Breakpoint";
	static final String PULL_SUBMIT = "pull_submit";
	static final String PULL_CANCEL = "pull_cancel";
	static final String RELEASE_DIALOG_SUBMIT = "release_dialog_submit";
	static final String RELEASE_DIALOG_CANCEL = "release_dialog_cancel";
	static final String KEYSTORE_PATH_CHOOSER = "keystore_path_chooser";
	static final String VARIABLES = "VARIABLES";
	
	private static IOBgThread ioBgThread;
	private ReleaseBgThread releaseBgThread;
	private KillAdbBgThread killAdbBgThread;
	private CommandBgThread commandBgThread;
	private UpdateAppNameBgThread updateAppNameBgThread;
	private GradleConfigBgThread gradleConfigBgThread;
	private ProjectPropertiesBgThread projectPropertiesBgThread;
	private ModifyGradleWrapperBgThread modifyGradleWrapperBgThread;
	private DebugReleaseBgThread debugReleaseBgThread;
	private FlutterDaemonBgThread flutterDaemonBgThread;
	private FlutterDaemonStdInBgThread flutterDaemonStdInBgThread;
	private DeleteKeyPropertiesBgThread deleteKeyPropertiesBgThread;
	private InitializeBuildGradleBgThread initializeBuildGradleBgThread;
	private ReleaseCheckBgThread releaseCheckBgThread;
	private CreateGradleProjectBgThread createGradleProjectBgThread;
	private CreateBuildGradleBgThread createBuildGradleBgThread;
	private GetSDKDataBgThread getSDKDataBgThread;
	private CreateBgThread createBgThread;
	private LoadSourceBgThread loadSourceBgThread;
	private UpdateVariableJTreeBgThread updateVariableJTreeBgThread;
	private CheckPubBgThread checkPubBgThread;
	
	private LoadMethodSourceBgThread loadMethodSourceBgThread;
	private static EventThread eventThread;
	private AdbBgThread adbBgThread;
    private static PacketDispatcher packetDispatcher;
	private GetDevicesBgThread getDevicesBgThread;
	private InitWirelessBgThread initWirelessBgThread;
	private DisconnectWirelessBgThread disconnectWirelessBgThread;
	private ConnectWirelessBgThread connectWirelessBgThread;
	private ModifyAndroidManifestBgThread modifyAndroidManifestBgThread;
	//private PauseBreakpointBgThread pauseBreakpointBgThread;
	private ProcessEventBgThread processEventBgThread;
	private UpdateNodesBgThread updateNodesBgThread;
	private ExpandBgThread expandBgThread;

	
	static byte[] idbytes = {(byte)0x22, (byte)'i', (byte)'d', (byte)0x22};
	static final String ID_STRING = new String(idbytes);
	
	static byte[] errorBytes = {(byte)0x22, (byte)'e', (byte)'r', (byte)'r', (byte)'o', (byte)'r', (byte)0x22};
	static final String ERROR_STRING = new String(errorBytes);

	static byte[] kindBytes = {(byte)0x22, (byte)'k', (byte)'i', (byte)'n', (byte)'d', (byte)0x22};
	static final String KIND_STRING = new String(kindBytes);
	
	static byte[] typeClassBytes = {(byte)0x22, (byte)'f', (byte)'u', (byte)'n', (byte)'c', (byte)'t',
		(byte)'i', (byte)'o', (byte)'n', (byte)'s', (byte)0x22};
	static final String FUNCTIONS_STRING = new String(typeClassBytes);

	static byte[] functionsBytes = {(byte)0x22, (byte)'t', (byte)'y', (byte)'p', (byte)'e', (byte)'C',
		(byte)'l', (byte)'a', (byte)'s', (byte)'s', (byte)0x22};
	static final String TYPECLASS_STRING = new String(functionsBytes);
	
	static byte[] nameBytes = {(byte)0x22, (byte)'n', (byte)'a', (byte)'m', (byte)'e', (byte)0x22};
	static final String NAME_STRING = new String(nameBytes);

	static byte[] fieldsBytes = {(byte)0x22, (byte)'f', (byte)'i', (byte)'e', (byte)'l', (byte)'d', (byte)'s', (byte)0x22};
	static final String FIELDS_STRING = new String(fieldsBytes);

	static byte[] valueBytes = {(byte)0x22, (byte)'v', (byte)'a', (byte)'l', (byte)'u', (byte)'e', (byte)0x22};
	static final String VALUE_STRING = new String(valueBytes);
	
	static byte[] typeBytes = {(byte)0x22, (byte)'t', (byte)'y', (byte)'p', (byte)'e', (byte)0x22};
	static final String TYPE_STRING = new String(typeBytes);

	static byte[] eventBytes = {(byte)0x22, (byte)'e', (byte)'v', (byte)'e', (byte)'n', (byte)'t', (byte)0x22};
	static final String EVENT_STRING = new String(eventBytes);

	static byte[] lengthBytes = {(byte)0x22, (byte)'l', (byte)'e', (byte)'n', (byte)'g', (byte)'t', (byte)'h', (byte)0x22};
	static final String LENGTH_STRING = new String(lengthBytes);

	static byte[] staticBytes = {(byte)0x22, (byte)'s', (byte)'t', (byte)'a', (byte)'t', (byte)'i', (byte)'c', (byte)0x22};
	static final String STATIC_STRING = new String(staticBytes);
	
	static byte[] superTypeBytes = {(byte)0x22, (byte)'s', (byte)'u', (byte)'p', (byte)'e', (byte)'r',
		(byte)'T', (byte)'y', (byte)'p', (byte)'e', (byte)0x22};
	static final String SUPERTYPE_STRING = new String(superTypeBytes);

	static byte[] elementBytes = {(byte)0x22, (byte)'e', (byte)'l', (byte)'e', (byte)'m', (byte)'e',
		(byte)'n', (byte)'t', (byte)'s', (byte)0x22};
	static final String ELEMENTS_STRING = new String(elementBytes);

	static byte[] valueAsStringBytes = {(byte)0x22, (byte)'v', (byte)'a', (byte)'l', (byte)'u', (byte)'e',
		(byte)'A', (byte)'s', (byte)'S', (byte)'t', (byte)'r', (byte)'i', (byte)'n', (byte)'g', (byte)0x22};
	static final String VALUE_AS_STRING_STRING = new String(valueAsStringBytes);
	
	static byte[] tokenPosBytes = {(byte)0x22, (byte)'t', (byte)'o', (byte)'k', (byte)'e', (byte)'n',
		(byte)'P', (byte)'o', (byte)'s', (byte)0x22};
	static final String TOKENPOS_STRING = new String(tokenPosBytes);
	
	static byte[] frameBytes = {(byte)0x22, (byte)'F', (byte)'r', (byte)'a', (byte)'m', (byte)'e', (byte)0x22};
	static final String FRAME_STRING = new String(frameBytes);

	static byte[] varsBytes = {(byte)0x22, (byte)'v', (byte)'a', (byte)'r', (byte)'s', (byte)0x22};
	static final String VARS_STRING = new String(varsBytes);
	
	static byte[] uriBytes = {(byte)0x22, (byte)'u', (byte)'r', (byte)'i', (byte)0x22};
	static final String URI_STRING = new String(uriBytes);
	
	
	private String[] fullSDKSa = {
	"Android 1.0 (API level 1)",
	"Android 1.1 (API level 2)",
	"Android 1.5 CUPCAKE (API level 3)",
	"Android 1.6 DONUT (API level 4)",
	"Android 2.0 ECLAIR (API level 5)",
	"Android 2.0.1 ECLAIR (API level 6)",
	"Android 2.1 ECLAIR (API level 7)",
	"Android 2.2 FROYO (API level 8)",
	"Android 2.3 GINGERBREAD (API level 9)",
	"Android 2.3.3 GINGERBREAD (API level 10)",
	"Android 3.0 HONEYCOMB (API level 11)",
	"Android 3.1 HONEYCOMB (API level 12)",
	"Android 3.2 HONEYCOMB (API level 13)",
	"Android 4.0 ICE CREAM SANDWICH (API level 14)",
	"Android 4.0.3 ICE CREAM SANDWICH (API level 15)",
	"Android 4.1 JELLY BEAN (API level 16)",
	"Android 4.2 JELLY BEAN (API level 17)",
	"Android 4.3 JELLY BEAN (API level 18)",
	"Android 4.4 KITKAT (API level 19)",
	"Android 4.4W KITKAT (API level 20)",
	"Android 5.0 LOLLIPOP (API level 21)",
	"Android 5.1 LOLLIPOP (API level 22)",
	"Android 6.0 MARSHMALLOW (API level 23)",
	"Android 7.0 NOUGAT (API level 24)",
	"Android 7.1.1 NOUGAT (API level 25)",
	"Android 8.0 OREO (API level 26)",
	"Android 8.1 OREO (API level 27)",
	"Android 9.0 PIE (API level 28)",
	"Android 10.0 Q (API level 29)"};

	//}}}
	
	//{{{	ADev()  constructor
	/**
     * ADev Constructor
     */
	public ADev()
	{
		// Determine OS..
		String osS = System.getProperty("os.name").toLowerCase();
		if ( osS.indexOf("win") >= 0 )
			iOS = WINDOWS;
		else if ( (osS.indexOf("nix") >= 0) ||
				(osS.indexOf("nux") >= 0) ||
				(osS.indexOf("mac") >= 0) )
			iOS = LINUX_MAC;
			
		bGradleSelected = false;
		bNDKSelected = false;
		bFlutterSelected = false;
		bKotlinSelected = false;
		
		// Initialize..
		bIsReply = false;
		bMethodChanged = false;
		variableDialogVector = new Vector();
		bUpgradeBuildGradleFinished = false;
		bDoBuildGradleUpdate = false;
		bGhostVariables = false;
		lCurrentMethodId = 0;
		lMethodSelection = 0;
		lCurrentSelectedMethod = 0;
		lLocationMethod = 0;
		bShowCurrentLine = true;
		sSdkDir = "";
		bIsDirty = false;
		iCardShowing = BUILD_CARD;
		iPreviousIndex = -1;
		lCurrentlyShowingClassId = 0;
		lCurrentlyShowingMethodId = 0;
		sDeviceName = "";
		sLatestAndroidPluginVersion = "";
		iTabCount = 0;
		bTabCreated = false;
		bTabSelected = false;	// Tab Panel Selected
		bNeedsUpdate = false;
		bHaveSDKSource = false;
		bDidAddTab = false;
		bGotStateChanged = false;
		sApplicationName = "";
		bGetDevices = false;
		bIsDebug = false;
		//bClearTabs = false;
		bDidUpdate = false;
		sBuildToolsVersion = "";
		bGetAndroidPluginVersion = true;
		sDeviceIPAddress = "";
		bWirelessConnected = false;
		bKillLogcat = false;
		bDoGradleCleanup = false;
		sGradleCommandOption = "";
		bKeyBreakOut = false;
		sDartSdkPath = "";
		bKillVMService = false;
		bSendReload = false;
		bRunSelected = false;
		bHomeJustSet = false;
		bShowProgressBar = false;
		bBuildChildNodes = false;
		bVariableNodeSelected = false;
		bLineSelected = false;
		sBreakpointScriptId = "";
		//bDebugRan = false;
		
		//messageObject = new Object();
		
		ioBgThread = null;
		bIsBreakpointStepEvent = false;
		bDidUpdateSource = false;
		iRemoveIndex = -1;
		bHitClose = false;
		iPrevTabCount = 0;
		bDoingProcessCommand = false;
		iSelectMode = SELECT_NORMAL;
		bUsingAppProject = false;
		iMessageId = 0;
		bHaveWsUri = false;
		
		iTabLevel = 0;
		
		//TabTextAreaAr = new ArrayList();
		TabInfoAr = new ArrayList();
		
		ClassMethodAr = new ArrayList();
		
		bDefaultTabShowing = true;
		sWirelessID = "";
		
		// Event related..
		EventReplyObject = new Object();		
		EventPacketAr = new ArrayList();

		RefreshProperties();

		// Note:
		// Some things in createGui()
		// can use these initial settings..
		//init();
		
		createGui();
		
		// Hide Flutter buttons..
		if ( runButton != null )
			runButton.setVisible(false);
		
		if ( reloadButton != null )
			reloadButton.setVisible(false);
		
		init();

		// Select SDK..
		//System.out.println("androidSdkPathAntS: '"+androidSdkPathAntS+"'");
		//System.out.println("androidSdkPathGradleS: '"+androidSdkPathGradleS+"'");
		//System.out.println("bGradleSelected: "+bGradleSelected);
		//System.out.println("bKotlinSelected: "+bKotlinSelected);
		//System.out.println("bFlutterSelected: "+bFlutterSelected);
		if ( (bGradleSelected == false) &&
			(bKotlinSelected == false) &&
			(bFlutterSelected == false) )
		{
			androidSdkPathS = androidSdkPathAntS;
		}
		else
		{
			androidSdkPathS = androidSdkPathGradleS;
		}

/*
		try
		{
			Properties prop = new Properties();
			prop.load(new FileInputStream("wireless.properties"));
			
			String sT = prop.getProperty("wireless_device");
			System.out.println("(wireless_device): '"+sT+"'");
			
			sWirelessID = sT;
			
			//bConnectWirelessFinished = false;
			completeLatch = new CountDownLatch(1);
			
			connectWirelessBgThread = new ConnectWirelessBgThread();
			connectWirelessBgThread.start();
			
			try
			{
				completeLatch.await();
			}
			catch (InterruptedException ie)
			{
			}

			
		}
		catch (IOException ioe)
		{
			System.out.println("prop.load() Exception");
			ioe.printStackTrace();
		}
/**/


		
		//System.out.println("(Selected)androidSdkPathS: '"+androidSdkPathS+"'");
		// Defaults..		
		bBreakOut = false;
		bLogcatOn = false;
		bReIssueRelease = false;
		bLogcatWasOn = false;
		apkNameS = "";
		iBuildType = DEBUG_BUILD;

		/**
         * Get number of running Emulators or devices..
         */

		// Don't show the Progress Bar,
		// so just run it directly..   
		//bDevicesFinished = false;
		completeLatch = new CountDownLatch(1);
		
		getDevicesBgThread = new GetDevicesBgThread();
		getDevicesBgThread.start();

		try
		{
			completeLatch.await();
		}
		catch (InterruptedException ie)
		{
		}

		if ( (DevicesAr	!= null) && (DevicesAr.size() > 0) )
		{
			if ( DevicesAr.size() > 1 )
			{
				// Open Dialog..
				selectDeviceDialog();
			}
			else
			{
				// Single device, show it..
				deviceLabel.setText((String)DevicesAr.get(0));
			}
		}
		
		
		if ( (projectHomeS != null) && (projectHomeS.length() > 0) )
		{
			StringBuffer sB = new StringBuffer(projectHomeS);
			sB.append("/app");
			File tFile = new File(sB.toString());
			if ( tFile.exists() )
				bUsingAppProject = true;
			else
				bUsingAppProject = false;
			
		}
	}	//}}}

	//{{{	CreateGradleProjectBgThread
	class CreateGradleProjectBgThread extends Thread
	{
		public void run()
		{
			//System.out.println("\nCreateGradleProjectBgThread");
			String sTrail;
			int iLoc;
			StringBuffer outSb;
			StringBuffer conSb;
			StringBuffer tSb;
			byte[] zeroDzeroA = {(byte)0x0d, (byte)0x0a};
			byte[] zeroA = {(byte)0x0a};
			byte[] buildBuf = null;
			
			if ( iOS == LINUX_MAC )
				sTrail = new String(zeroA);
			else
				sTrail = new String(zeroDzeroA);

			
			String sAppName = appNmField.getText();
			sAppName = sAppName.trim();
			//System.out.println("sAppName: '"+sAppName+"'");
			
			sApplicationName = sAppName;	// Save..
			
			String sActivityName = activityField.getText();
			sActivityName = sActivityName.trim();
			//System.out.println("sActivityName: '"+sActivityName+"'");
			
			String sPackageName = packageField.getText();
			sPackageName = sPackageName.trim();
			//System.out.println("sPackageName: '"+sPackageName+"'");
			//System.out.println("projectHomeS: '"+projectHomeS+"'");

			// Flip slashes..
			createProjectHomeS = Utils.processPath(createProjectHomeS);
			//System.out.println("createProjectHomeS: '"+createProjectHomeS+"'");

			boolean bUsesSdk = false;
			if ( uSdkMenuItem != null )
				bUsesSdk = uSdkMenuItem.getState();
			//System.out.println("bUsesSdk: "+bUsesSdk);

			boolean bLibrarySelected = false;
			if ( libProjectRadioButton != null )
				bLibrarySelected = libProjectRadioButton.isSelected();
			
			File tFile = new File(createProjectHomeS);
			tFile.mkdir();

			while ( true )
			{
				try
				{
					Thread.sleep(100);
				}
				catch (InterruptedException ie)
				{
				}
				
				if ( tFile.exists() )
					break;
			}
			
			// Run 'gradle init'..
			StringBuffer commandSb = new StringBuffer();
			if ( iOS == LINUX_MAC )
			{
				commandSb.append("export PATH=${PATH}:");
				commandSb.append(gradlePathS);
				commandSb.append(":");
				commandSb.append(javaPathS);
				
				commandSb.append(";export JAVA_HOME=");
				commandSb.append(javaPathS);

				commandSb.append(";cd ");
				commandSb.append(createProjectHomeS);
			
				commandSb.append(";gradle init");
			}
			else
			{
				commandSb.append("SET PATH=");
				commandSb.append(gradlePathS);
				commandSb.append(";");
				commandSb.append(javaPathS);
				commandSb.append(";%PATH%");
				
				commandSb.append("&&SET JAVA_HOME=");
				commandSb.append(javaPathS);
					
				commandSb.append("&&CD ");
				commandSb.append(createProjectHomeS);

				commandSb.append("&&gradle init\n");
			}
			
			bInternalFinished = false;		
			internalCommandS = commandSb.toString();
			commandBgThread = new CommandBgThread();
			commandBgThread.start();
	
			// Wait for Thread to finish..
			while ( true )
			{
				try
				{
					Thread.sleep(100);
				}
				catch (InterruptedException ie)
				{
				}
				
				//Thread.yield();
	
				if ( bInternalFinished )
					break;
			}

			//System.out.println("bLibrarySelected: "+bLibrarySelected);
			
			// 'createProjectHomeS':  'C:\Android\dev\G_SDKTest'
			StringBuffer projectSb = new StringBuffer();
			projectSb.append(createProjectHomeS);
			
			if ( bLibrarySelected )
				projectSb.append("/src/main/java");
			else
			{
				bUsingAppProject = true;
				projectSb.append("/app/src/main/java");
			}

			StringBuffer pkgSb = new StringBuffer();
			StringTokenizer st = new StringTokenizer(sPackageName, ".");
			int iCount = st.countTokens();
			String sTok;
			
			for ( int iG = 0; iG < iCount; iG++ )
			{
				sTok = st.nextToken();
				pkgSb.append("/");
				pkgSb.append(sTok);				
			}
			
			projectSb.append(pkgSb.toString());
			//System.out.println("projectSb: '"+projectSb.toString()+"'");

			try
			{
				Path path = Paths.get(projectSb.toString());
				Files.createDirectories(path);
			}
			catch (IOException ioe)
			{
				System.out.println("createDirectories() Exception");
				ioe.printStackTrace();
			}

			// Wait till directories are created..
			File file = new File(projectSb.toString());
			
			while ( true )
			{
				try
				{
					Thread.sleep(100);
				}
				catch (InterruptedException ie)
				{
				}
				
				if ( file.exists() )
					break;
				
			}
			
			conSb = new StringBuffer();
			conSb.append("Created directory ");
			conSb.append(projectSb.toString());
			consoleOutput(conSb.toString());
			
			if ( bLibrarySelected )
			{
				outSb = new StringBuffer();
				outSb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
				outSb.append(sTrail);
				outSb.append("<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"");
				outSb.append(sTrail);
				outSb.append("    package=\"");
				outSb.append(sPackageName);
				outSb.append("\"/>");
				outSb.append(sTrail);
				
				tSb = new StringBuffer(createProjectHomeS);
				tSb.append("/src/main/AndroidManifest.xml");
				writeFile(outSb.toString().getBytes(), tSb.toString()); 
				
				conSb = new StringBuffer();
				conSb.append("Added file ");
				conSb.append(tSb.toString());
				consoleOutput(conSb.toString());
				
			}
			else
			{
				StringBuffer resSb = new StringBuffer(createProjectHomeS);
				resSb.append("/app/src/main/res");
				//System.out.println("resSb: '"+resSb.toString()+"'");
				File resFile = new File(resSb.toString());
				resFile.mkdir();
				
				while ( true )
				{
					try
					{
						//Thread.sleep(500);
						Thread.sleep(100);
					}
					catch (InterruptedException ie)
					{
					}
					
					if ( resFile.exists() )
						break;
				}
				
				conSb = new StringBuffer();
				conSb.append("Created directory ");
				conSb.append(resSb.toString());
				consoleOutput(conSb.toString());
	
	
				//System.out.println("resSb: '"+resSb.toString()+"'");
				File layoutFile = new File(resSb.toString() + "/layout");
				layoutFile.mkdir();
	
				conSb = new StringBuffer();
				conSb.append("Created directory ");
				conSb.append(resSb.toString() + "/layout");
				consoleOutput(conSb.toString());
	
				File valuesFile = new File(resSb.toString() + "/values");
				valuesFile.mkdir();
	
				conSb = new StringBuffer();
				conSb.append("Created directory ");
				conSb.append(resSb.toString() + "/values");
				consoleOutput(conSb.toString());
			}

			if ( bLibrarySelected == false )
			{
/*				
				if ( sApplicationName == null )
					System.out.println("sApplicationName null");
				else
					System.out.println("sApplicationName: '"+sApplicationName+"'");
/**/
				// /values/strings.xml..
				outSb = new StringBuffer();
				outSb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
				outSb.append(sTrail);
				outSb.append("<resources>");
				outSb.append(sTrail);
				//outSb.append("    <string name=\"app_name\">Hello World</string>");  
				outSb.append("    <string name=\"app_name\">");
				outSb.append(sApplicationName);
				outSb.append("</string>");
				outSb.append(sTrail);
				outSb.append("</resources>");
				outSb.append(sTrail);
				
				tSb = new StringBuffer(createProjectHomeS);
				tSb.append("/app/src/main/res/values/strings.xml");
				writeFile(outSb.toString().getBytes(), tSb.toString()); 
				
				conSb = new StringBuffer();
				conSb.append("Added file ");
				conSb.append(tSb.toString());
				consoleOutput(conSb.toString());
				
				// /layout/main.xml..			
				outSb = new StringBuffer();
				outSb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
				outSb.append(sTrail);
				outSb.append("<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"");
				outSb.append(sTrail);
				outSb.append("    android:orientation=\"vertical\"");
				outSb.append(sTrail);
				outSb.append("    android:layout_width=\"fill_parent\"");
				outSb.append(sTrail);
				outSb.append("    android:layout_height=\"fill_parent\" >");
				outSb.append(sTrail);
				outSb.append(sTrail);
				outSb.append("    <TextView");
				outSb.append(sTrail);
				outSb.append("        android:layout_width=\"fill_parent\"");  
				outSb.append(sTrail);
				outSb.append("        android:layout_height=\"wrap_content\"");
				outSb.append(sTrail);
				outSb.append("        android:text=\"Hello World, ");
				outSb.append(sActivityName);
				outSb.append("\" />");
				outSb.append(sTrail);
				outSb.append(sTrail);
				outSb.append("</LinearLayout>");
				outSb.append(sTrail);
				
				tSb = new StringBuffer(createProjectHomeS);
				tSb.append("/app/src/main/res/layout/main.xml");
				writeFile(outSb.toString().getBytes(), tSb.toString());
	
				conSb = new StringBuffer();
				conSb.append("Added file ");
				conSb.append(tSb.toString());
				consoleOutput(conSb.toString());
				
				
				if ( bKotlinSelected )
				{
					// Create Kotlin source..
					outSb = new StringBuffer();
					outSb.append("package ");
					outSb.append(sPackageName);
					outSb.append(sTrail);
					outSb.append(sTrail);
	
					outSb.append("import android.app.Activity");
					outSb.append(sTrail);
					outSb.append("import android.os.Bundle");
					outSb.append(sTrail);
					outSb.append(sTrail);
					
					outSb.append("class ");
					outSb.append(sActivityName);
					outSb.append(" : Activity() {");
					outSb.append(sTrail);
					outSb.append(sTrail);
					
					outSb.append("    override fun onCreate(savedInstanceState: Bundle?) {");
					outSb.append(sTrail);
					outSb.append("        super.onCreate(savedInstanceState)");
					outSb.append(sTrail);
					outSb.append("        setContentView(R.layout.main)");
					outSb.append(sTrail);
					outSb.append("    }");
					outSb.append(sTrail);
					outSb.append("}");
					outSb.append(sTrail);
					
					tSb = new StringBuffer(createProjectHomeS);
					tSb.append("/app/src/main/java");
					tSb.append(pkgSb.toString());
					tSb.append("/");
					tSb.append(sActivityName);
					tSb.append(".kt");
					writeFile(outSb.toString().getBytes(), tSb.toString()); 
	
					conSb = new StringBuffer();
					conSb.append("Added file ");
					conSb.append(tSb.toString());
					consoleOutput(conSb.toString());
	
				}
				else
				{
					// Create Gradle source..			
					outSb = new StringBuffer();
					outSb.append("package ");
					outSb.append(sPackageName);
					outSb.append(";");
					outSb.append(sTrail);
					outSb.append(sTrail);
					
					outSb.append("import android.app.Activity;");
					outSb.append(sTrail);
					outSb.append("import android.os.Bundle;");
					outSb.append(sTrail);
					outSb.append(sTrail);
					outSb.append("public class ");
					outSb.append(sActivityName);
					outSb.append(" extends Activity");
					outSb.append(sTrail);
					outSb.append("{");
					outSb.append(sTrail);
					outSb.append("    @Override"); 
					outSb.append(sTrail);
					outSb.append("     public void onCreate(Bundle savedInstanceState)");
					outSb.append(sTrail);
					outSb.append("    {");
					outSb.append(sTrail);
					outSb.append("        super.onCreate(savedInstanceState);");
					outSb.append(sTrail);
					outSb.append("        setContentView(R.layout.main);");
					outSb.append(sTrail);
					outSb.append("    }");
					outSb.append(sTrail);
					outSb.append("}");
					outSb.append(sTrail);
		
					tSb = new StringBuffer(createProjectHomeS);
					tSb.append("/app/src/main/java");
					tSb.append(pkgSb.toString());
					tSb.append("/");
					tSb.append(sActivityName);
					tSb.append(".java");
					writeFile(outSb.toString().getBytes(), tSb.toString()); 
					
					conSb = new StringBuffer();
					conSb.append("Added file ");
					conSb.append(tSb.toString());
					consoleOutput(conSb.toString());
	
				}
	
				
				// main/AndroidManifest.xml..			
				outSb = new StringBuffer();
				outSb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
				outSb.append(sTrail);
				outSb.append("<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\"");
				outSb.append(sTrail);
				outSb.append("    package=\"");
				outSb.append(sPackageName);
				outSb.append("\"");
				outSb.append(sTrail);
				outSb.append("    android:versionCode=\"1\"");
				outSb.append(sTrail);
				outSb.append("    android:versionName=\"1.0\">");
				outSb.append(sTrail);
/*	
				if ( sMinSdk == null )
					System.out.println("sMinSdk null");
				else
					System.out.println("sMinSdk: '"+sMinSdk+"'");
/**/

/*
				if ( sTargetSdk == null )
					System.out.println("sTargetSdk null");
				else
					System.out.println("sTargetSdk: '"+sTargetSdk+"'");
/**/	
				
				if ( bUsesSdk && (bFlutterSelected == false) )
				{
					if ( ((sMinSdk != null) && (sMinSdk.length() > 0)) &&
						((sTargetSdk != null) && (sTargetSdk.length() > 0)) )
					{
						outSb.append(sTrail);
						outSb.append("    <uses-sdk android:minSdkVersion=\"");
						outSb.append(sMinSdk);
						outSb.append("\" android:targetSdkVersion=\""); 
						outSb.append(sTargetSdk);
						outSb.append("\" />");
						outSb.append(sTrail);
						outSb.append(sTrail);
					}
				}

				//System.out.println("sActivityName: '"+sActivityName+"'");
				
				outSb.append("    <application android:label=\"@string/app_name\" >");
				outSb.append(sTrail);	
				outSb.append("        <activity android:name=\"");
				outSb.append(sActivityName);
				outSb.append("\"");
				outSb.append(sTrail);	
				outSb.append("            android:label=\"@string/app_name\">");	
				outSb.append(sTrail);
				outSb.append("        <intent-filter>");
				outSb.append(sTrail);
				outSb.append("            <action android:name=\"android.intent.action.MAIN\" />");                
				outSb.append(sTrail);
				outSb.append("            <category android:name=\"android.intent.category.LAUNCHER\" />");
				outSb.append(sTrail);
				outSb.append("            </intent-filter>");
				outSb.append(sTrail);
				outSb.append("        </activity>");
				outSb.append(sTrail);
				outSb.append("    </application>");
				outSb.append(sTrail);
				outSb.append("</manifest>");
				outSb.append(sTrail);
	
				tSb = new StringBuffer(createProjectHomeS);
				tSb.append("/app/src/main/AndroidManifest.xml");
				writeFile(outSb.toString().getBytes(), tSb.toString());
	
				conSb = new StringBuffer();
				conSb.append("Added file ");
				conSb.append(tSb.toString());
				conSb.append((char)0x0a);
				consoleOutput(conSb.toString());
	
				
				// Modify settings.gradle..
				tSb = new StringBuffer(createProjectHomeS);
				tSb.append("/settings.gradle");
				
				buildBuf = readFile(
					512,				// iInitialSize
					tSb.toString());	// fileName
	
				if ( (buildBuf != null) && (buildBuf.length > 0) )
				{
					outSb = new StringBuffer(new String(buildBuf));
					outSb.append("include ':app'");
					outSb.append(sTrail);
				}
				
				writeFile(outSb.toString().getBytes(), tSb.toString());	
			}

			//System.out.println("\nFinished GradleProject");
			bCreateGradleProjectFinished = true;			
		}
	}	//}}}

	//{{{	GetSDKDataBgThread
	class GetSDKDataBgThread extends Thread
	{
		public void run()
		{
			//System.out.println("\nGetSDKDataBgThread");
			
			targetDescAr = new ArrayList();
			String[] dirObjSa = null;
			String[] objSa;
			StringBuffer sb;
			sb = new StringBuffer();
			sb.append(androidSdkPathS);
			sb.append("/build-tools");
			
			File file = new File(sb.toString());
			if ( file.exists() )
			{
				FileAr = new ArrayList();
				dirObjSa = file.list();
				Arrays.sort(dirObjSa);	// Sort..
				
				for ( int iJ = 0; iJ < dirObjSa.length; iJ++ )
				{
					// Like: '28.0.0'
					//System.out.println("["+iJ+"]: '"+dirObjSa[iJ]+"'");
					FileAr.add((String)dirObjSa[iJ]);
				}
			}


			sb = new StringBuffer();
			StringBuffer tSb;
			StringBuffer lineSb;
			boolean bHasIni;
			sb.append(androidSdkPathS);
			sb.append("/platforms");
			int iId = 1;
			int iLoc;
			byte[] buf;
			String sT;
			String sBuf;
			File tFile;
			
			file = new File(sb.toString());
			if ( file.exists() )
			{
				dirObjSa = file.list();

				// Add leading '0' to any single digits
				// to fix the sort order..				
				StringBuffer Sb;
				int iLoc2;
				for ( int j = 0; j < dirObjSa.length; j++ )
				{
					Sb = new StringBuffer(dirObjSa[j]);
					iLoc2 = Sb.indexOf("-");
					if ( iLoc2 != -1 )
					{
						sT = Sb.substring(iLoc2 + 1);
						if ( sT.length() == 1 )
						{
							Sb.insert(iLoc2 + 1, "0");
						}
					}
					
					dirObjSa[j] = Sb.toString();
				}
				
				Arrays.sort(dirObjSa);
				
				//for ( int j = 0; j < dirObjSa.length; j++ )
					//System.out.println("["+j+"]: '"+dirObjSa[j]+"'");

				objSa = new String[dirObjSa.length];

				// Note:
				// For the sort to work
				// we put the 'android-10' first
				// so that the sort order will be correct
				// then remove it..
				
				for ( int iJ = 0; iJ < dirObjSa.length; iJ++ )
				{
					//System.out.println("--TOP--");
					tSb = new StringBuffer();
					tSb.append(sb.toString());
					tSb.append("/");
					tSb.append(dirObjSa[iJ]);
					tSb.append("/source.properties");
					
					buf = readFile(1024, tSb.toString());
					if ( (buf != null) && (buf.length > 0) )
					{
						sBuf = new String(buf);
						lineSb = new StringBuffer();
						lineSb.append(dirObjSa[iJ]);
						lineSb.append(" ");
						lineSb.append("Android ");
						
						iLoc = sBuf.indexOf("Platform.Version");
						if ( iLoc != -1 )
						{
							int j = iLoc;
							for ( ; sBuf.charAt(j) != (char)0x0a; j++ );
							sT = sBuf.substring((iLoc + 17), j);
							sT = sT.trim();
							lineSb.append(sT);
							lineSb.append(" (API level ");
						}
						
						iLoc = sBuf.indexOf("ApiLevel");
						if ( iLoc != -1 )
						{
							sT = sBuf.substring((iLoc + 9), (iLoc + 11));
							sT = sT.trim();
							//System.out.println("sT: '"+sT+"'");
							lineSb.append(sT);		// '15'
							lineSb.append(")");
							objSa[iJ] = (String)lineSb.toString();
							//System.out.println("objSa["+iJ+"]: '"+objSa[iJ]+"'");
						}
					}
				}	// End for..

/*
				if ( objSa == null )
					System.out.println("objSa null");
				else
					System.out.println("objSa.length: "+objSa.length);
/**/				

				for ( int j = 0; j < objSa.length; j++ )
				{
/*
					if ( objSa[j] == null )
						System.out.println("objSa[j] null");
					else
						System.out.println("objSa[j]: '"+objSa[j]+"'");
/**/

					// Remove the leading 'android-21'
					// that helped the order..
					if ( objSa[j] != null )
					{
						sT = objSa[j];
						iLoc2 = sT.indexOf(" ");
						if ( iLoc2 != -1 )
						{
							sT = sT.substring(iLoc2 + 1);
						}
						
						targetDescAr.add((String)sT);
					}
				}
			}

			//bSDKDataFinished = true;
			completeLatch.countDown();
			
		}
	}	//}}}
	
	//{{{	CreateBuildGradleBgThread	
	class CreateBuildGradleBgThread extends Thread
	{
		public void run()
		{
			//System.out.println("\nCreateBuildGradleBgThread");
			String sTrail;
			StringBuffer outSb;
			StringBuffer tSb;
			byte[] zeroDzeroA = {(byte)0x0d, (byte)0x0a};
			byte[] zeroA = {(byte)0x0a};

			if ( iOS == LINUX_MAC )
				sTrail = new String(zeroA);
			else
				sTrail = new String(zeroDzeroA);
			
			tSb = new StringBuffer(createProjectHomeS);
			tSb.append("/build.gradle");
			
			// Delete existing file..
			File delFile = new File(tSb.toString());
			if ( delFile.exists() )
			{
				delFile.delete();
			}

			boolean bLibraryProject = false;
			if ( libProjectRadioButton != null )
				bLibraryProject = libProjectRadioButton.isSelected();
			
			if ( bLibraryProject == false )
			{
				// Create app/build.gradle..
				String sBuildToolsVersion = "";
				if ( buildToolsSpinner != null )
				{
					sBuildToolsVersion = (String)buildToolsSpinner.getValue();
				}
				
				outSb = new StringBuffer();
				outSb.append("def keystoreProperties = new Properties()");
				outSb.append(sTrail);
				outSb.append("def keystorePropertiesFile = rootProject.file('key.properties')");
				outSb.append(sTrail);
				outSb.append("if (keystorePropertiesFile.exists()) {");
				outSb.append(sTrail);
				outSb.append("    keystoreProperties.load(new FileInputStream(keystorePropertiesFile))");
				outSb.append(sTrail);
				outSb.append("}");
				outSb.append(sTrail);
				outSb.append(sTrail);

				//System.out.println("bKotlinSelected: "+bKotlinSelected);
				if ( bKotlinSelected )
				{
					outSb.append("apply plugin: 'com.android.application'");
					outSb.append(sTrail);
					outSb.append(sTrail);
					
					outSb.append("apply plugin: 'kotlin-android'");
					outSb.append(sTrail);
					outSb.append(sTrail);

					// Add 'allprojects'..
					outSb.append("allprojects {");
					outSb.append(sTrail);
					outSb.append("    repositories {");  
					outSb.append(sTrail);
					outSb.append("        google()");
					outSb.append(sTrail);
					outSb.append("        jcenter()");
					outSb.append(sTrail);
					outSb.append("    }");
					outSb.append(sTrail);
					outSb.append("}");
					outSb.append(sTrail);
					outSb.append(sTrail);
					
				}
				else
				{
					outSb.append("apply plugin: 'android'");
					outSb.append(sTrail);
					outSb.append(sTrail);
				}
				
				outSb.append("android {");
				outSb.append(sTrail);
				outSb.append("    compileSdkVersion ");
				outSb.append(sTargetSdk);
				outSb.append(sTrail);
				
				if ( (sBuildToolsVersion != null) && (sBuildToolsVersion.length() > 0) )
				{
					outSb.append("    buildToolsVersion '");
					outSb.append(sBuildToolsVersion);
					outSb.append("'");
					outSb.append(sTrail);
				}
				
				outSb.append(sTrail);
				
				outSb.append("    signingConfigs {");
				outSb.append(sTrail);
				outSb.append("        release {");
				outSb.append(sTrail);
				outSb.append("            keyAlias keystoreProperties['keyAlias']");
				outSb.append(sTrail);
				outSb.append("            keyPassword keystoreProperties['keyPassword']");
				outSb.append(sTrail);
				outSb.append("            storeFile file(keystoreProperties['storeFile'])");
				outSb.append(sTrail);
				outSb.append("            storePassword keystoreProperties['storePassword']");
				outSb.append(sTrail);
				outSb.append("        }");
				outSb.append(sTrail);
				outSb.append("    }");
				outSb.append(sTrail);
				outSb.append(sTrail);
				
				outSb.append("    defaultConfig {");
				outSb.append(sTrail);
/*	
				if ( sMinSdk == null )
					System.out.println("sMinSdk null");
				else
					System.out.println("sMinSdk: '"+sMinSdk+"'");
/**/
						
				if ( (sMinSdk != null) && (sMinSdk.length() > 0) )
				{
					outSb.append("        minSdkVersion ");
					outSb.append(sMinSdk);
					outSb.append(sTrail);
				}
	
				outSb.append("        targetSdkVersion ");
				outSb.append(sTargetSdk);
				outSb.append(sTrail);
				outSb.append("    }");
				outSb.append(sTrail);
				outSb.append(sTrail);
				
				outSb.append("    buildTypes {");
				outSb.append(sTrail);
				outSb.append("        release {");
				outSb.append(sTrail);
				outSb.append("            minifyEnabled false");
				outSb.append(sTrail);
				outSb.append("            signingConfig signingConfigs.debug");
				outSb.append(sTrail);
				outSb.append("            signingConfig signingConfigs.release");
				outSb.append(sTrail);
				outSb.append("            proguardFile getDefaultProguardFile('proguard-android.txt')");
				outSb.append(sTrail);
				outSb.append("        }");
				outSb.append(sTrail);
				outSb.append("    }");
				outSb.append(sTrail);

				//System.out.println("bFlutterSelected: "+bFlutterSelected);				
				if ( (sUseAppBundle.equals("true")) &&
					(bFlutterSelected == false) )
				{
					outSb.append(sTrail);
					outSb.append("    bundle {");
					outSb.append(sTrail);
					outSb.append("        density {");
					outSb.append(sTrail);
					outSb.append("            enableSplit true");
					outSb.append(sTrail);
					outSb.append("        }");
					outSb.append(sTrail);
					outSb.append("        abi {");
					outSb.append(sTrail);
					outSb.append("            enableSplit true");
					outSb.append(sTrail);
					outSb.append("        }");
					outSb.append(sTrail);
					outSb.append("        language {");
					outSb.append(sTrail);
					outSb.append("            enableSplit false");
					outSb.append(sTrail);
					outSb.append("        }");
					outSb.append(sTrail);
					outSb.append("    }");
					outSb.append(sTrail);
					outSb.append(sTrail);
				}
				
				outSb.append("}");
				outSb.append(sTrail);
	
				tSb = new StringBuffer(createProjectHomeS);
				tSb.append("/app/build.gradle");
				writeFile(outSb.toString().getBytes(), tSb.toString()); 
			}
	
			String sAndriodPluginVersion = pluginVersionField.getText();
			sAndriodPluginVersion = sAndriodPluginVersion.trim();
			
			outSb = new StringBuffer();
			outSb.append("buildscript {");
			outSb.append(sTrail);
			outSb.append("    repositories {");
			outSb.append(sTrail);
			outSb.append("        google()");
			outSb.append(sTrail);
			outSb.append("        mavenCentral()");
			outSb.append(sTrail);
			outSb.append("    }");
			outSb.append(sTrail);
			outSb.append("    dependencies {");
			outSb.append(sTrail);
			outSb.append("        classpath 'com.android.tools.build:gradle:");
			outSb.append(sAndriodPluginVersion);
			outSb.append("'");
			outSb.append(sTrail);
			
			if ( bKotlinSelected )
			{
				String sKotlinVersion = kotlinVersionField.getText();
				sKotlinVersion = sKotlinVersion.trim();
				
				outSb.append("        classpath \"org.jetbrains.kotlin:kotlin-gradle-plugin:");
				outSb.append(sKotlinVersion);
				outSb.append("\"");
				outSb.append(sTrail);
			}
			
			outSb.append("    }");
			outSb.append(sTrail);
			outSb.append("}");
			outSb.append(sTrail);
			outSb.append(sTrail);
			
			outSb.append("allprojects {");
			outSb.append(sTrail);
			outSb.append("    repositories {");
			outSb.append(sTrail);
			outSb.append("        google()");
			outSb.append(sTrail);
			outSb.append("        jcenter()");
			outSb.append(sTrail);
			outSb.append("    }");
			outSb.append(sTrail);
			outSb.append("}");
			outSb.append(sTrail);
			outSb.append(sTrail);
			
			outSb.append("task clean(type: Delete) {");
			outSb.append(sTrail);
			outSb.append("    delete rootProject.buildDir");
			outSb.append(sTrail);
			outSb.append("}");
			outSb.append(sTrail);

			tSb = new StringBuffer(createProjectHomeS);
			tSb.append("/build.gradle");
			
			writeFile(outSb.toString().getBytes(), tSb.toString());
			
			bCreateBuildGradleFinished = true;
		}
	}	//}}}

	//{{{	CreateBgThread
	class CreateBgThread extends Thread
	{
		public void run()
		{
			//System.out.println("\nCreateBgThread run()");
			// Ant only, add <uses-sdk /> to AndroidManifest.xml..
			byte[] windowsLead =
			{(byte)0x0d, (byte)0x0a, (byte)0x0d, (byte)0x0a,
			(byte)0x20, (byte)0x20, (byte)0x20, (byte)0x20};

			byte[] linuxLead =
			{(byte)0x0a, (byte)0x0a, (byte)0x20, (byte)0x20, (byte)0x20, (byte)0x20};
			
			String leadS;
			String sTrail;
			
			byte[] zeroDzeroA = {(byte)0x0d, (byte)0x0a};
			byte[] zeroA = {(byte)0x0a};
			
			if ( iOS == LINUX_MAC )
			{
				leadS = new String(linuxLead);
				sTrail = new String(zeroA);
			}
			else
			{
				leadS = new String(windowsLead);
				sTrail = new String(zeroDzeroA);
			}
			
			// Wait for IOBgThread to finish..
			while ( true )
			{
				Thread.yield();
				
				if ( bIOBgThreadFinished )
					break;
			}
			
			// Construct for AndroidManifest.xml..
			StringBuffer sb = new StringBuffer();
			sb.append(leadS);
			sb.append("<uses-sdk android:minSdkVersion=\"");
			sb.append(iMinSdk);
			sb.append("\" android:targetSdkVersion=\"");
			sb.append(targetApiS);		// API Level..
			sb.append("\" />");
			sb.append(sTrail);
			sb.append(sTrail);
			
			byte[] manifestBuf = null;
			byte[] outBuf;
			
			// Construct filename..
			StringBuffer fNmSb = new StringBuffer();
			fNmSb.append(createProjectHomeS);
			fNmSb.append("/AndroidManifest.xml");

			//System.out.println("readFile()fNmSb: '"+fNmSb.toString()+"'");
			File file = new File(fNmSb.toString());

			// Wait till it's created..
			while ( true )
			{
				try
				{
					Thread.sleep(1000);
				}
				catch (InterruptedException ie)
				{
				}

				if ( file.exists() )
					break;
			}
			
			manifestBuf = readFile(512, fNmSb.toString());
			if ( (manifestBuf != null) && (manifestBuf.length > 0) )
			{
				StringBuffer outSb = new StringBuffer(new String(manifestBuf));
				int iLoc = outSb.indexOf("<application");
				if ( iLoc != -1 )
				{
					// Scan back to 0x0a..
					for ( ; outSb.charAt(iLoc) != 0x0a; iLoc-- );
					iLoc++;
					
					outSb.insert(iLoc, sb.toString());
					outBuf = outSb.toString().getBytes();				

					writeFile(outBuf, fNmSb.toString());  
				}
			}
			
			bCreateFinished = true;
		}
	}	//}}}

	//{{{	EventThread
	protected class EventThread extends Thread
	{
		public void run()
		{
			synchronized ( EventReplyObject )
			{
				long lClassId;
				long lThreadId;
				long lFrameId;
				long lChangedMethodId = 0;
				int iKey = 0;
				int iRequestId;
				byte bSigByte;
				byte bSig;
				boolean bDoContinue = true;
				boolean bContainsMethodId = false;
				Integer IVal;
				FramesInfo framesInfo;
				VariableTableInfo variableTableInfo;
				FrameSlot frameSlot;
				ClassMethodInfo classMethodInfo;
				
				while ( ! isInterrupted() )
				{
					try
					{
						EventReplyObject.wait();
						//System.out.println("\n*** EventThread dropped out of wait() ***");
						
						// Get Event packet..						
						byte[] eventPacket = getPutEventPacketAr(Constants.GET, null);

						if ( (eventPacket != null) && (eventPacket.length > 0) )
						{
							// Process Event packet..
							EventInfo eventInfo = InterpretEvent(eventPacket);
							
							lMethodId = eventInfo.lMethodId;
							//System.out.println("lMethodId: "+lMethodId+"  "+Long.toHexString(lMethodId));
							lClassId = eventInfo.lClassId;
							//System.out.println("lClassId: "+lClassId+"  "+Long.toHexString(lClassId));
							lThreadId = eventInfo.lThreadId;
							//System.out.println("lThreadId: "+lThreadId+"  "+Long.toHexString(lThreadId));
							
							// Set defaults..
							lMethodSelection = lMethodId;
							currentClassId = lClassId;

/*
							if ( eventInfo.bEventKind != Constants.EVENT_KIND_CLASS_PREPARE	)
							{
								// Note:
								// If we have Exceptions turned on
								// and we do this, command_AllClassesWithGeneric()
								// will time out and get an Exception..
								
								// Check for MethodId change..
								//System.out.println("lCurrentMethodId: "+lCurrentMethodId+"   "+
									//Long.toHexString(lCurrentMethodId));
								if ( lCurrentMethodId != lMethodId )
								{
									// MethodId changed..
									System.out.println("From EventThread, EVENT_KIND_CLASS_PREPARE");
									getTreeClasses();
								}
							}
/**/

							// Update the current Thread..
							lCurrentThreadId = lThreadId;
							//System.out.println("(Updated)lCurrentThreadId: "+
								//lCurrentThreadId+"  "+Long.toHexString(lCurrentThreadId));

/*								
							if ( eventInfo.bEventKind == Constants.EVENT_KIND_EXCEPTION )
							{
								//System.out.println("\n(EVENT_KIND_EXCEPTION)");
								
							}
/**/

							if ( (eventInfo.bEventKind == Constants.EVENT_KIND_BREAKPOINT) ||
								(eventInfo.bEventKind == Constants.EVENT_KIND_SINGLE_STEP) )
							{
								bIsBreakpointStepEvent = true;
								//System.out.println("EVENT_KIND_BREAKPOINT / EVENT_KIND_SINGLE_STEP");
								
								// Show current line..
								bShowCurrentLine = true;
								
								// Reset..
								bTabSelected = false;
								
								lLocationMethod = lMethodId;
								
								// Get Thread name..
								sThreadName = JDWPCommands.command_Name(lThreadId);
								
								// Get current FrameId..								
								JDWPCommands.command_Frames(
									lCurrentThreadId,
									0,				// startFrame
									1);			// length, count of frames to retrieve (-1 = all remaining)
								
								framesInfo = (FramesInfo)FramesAr.get(0);
								lFrameId = (long)framesInfo.lFrameId;
								lCurrentFrameId = lFrameId;

/*
								if ( ClassMethodAr == null )
									System.out.println("ClassMethodAr null");
								else
								{
									System.out.println("\nClassMethodAr.size(): "+ClassMethodAr.size());
									for ( int j = 0; j < ClassMethodAr.size(); j++ )
									{
										System.out.println("------------------------  "+j);
										classMethodInfo = (ClassMethodInfo)ClassMethodAr.get(j);
										System.out.println("classMethodInfo.sMethodName: "+classMethodInfo.sMethodName);
										if ( classMethodInfo.jScrollPane == null )
											System.out.println("classMethodInfo.jScrollPane null");
										else
											System.out.println("classMethodInfo.jScrollPane not null");
									}
									System.out.println();
								}
/**/								
								
								/*
								 * Check if Method/Class has changed
								 */
								 
								// If Method/Class changed, get a new VariableTable..
								int iMethod;
								boolean bDoVariableTable = false;
								bMethodChanged = false;
/*
								if ( FramesAr == null )
									System.out.println("FramesAr null");
								else
									System.out.println("FramesAr.size(): "+FramesAr.size());
/**/

								FramesInfo frameInfo;
								if ( (FramesAr != null) && (FramesAr.size() > 0) )
								{
									frameInfo = new FramesInfo();
									frameInfo = (FramesInfo)FramesAr.get(0);
									iMethod = (int)frameInfo.lMethodId;

									//System.out.println("lCurrentMethodId: "+lCurrentMethodId):
									//System.out.println("lMethodId: "+lMethodId):
									if ( lCurrentMethodId != lMethodId )
									{
										// Different..
										//System.out.println("\n--Method Changed--");
										lChangedMethodId = lMethodId;
										
										bDoVariableTable = true;
										bMethodChanged = true;
										if ( lCurrentMethodId != 0 )
										{
											bDoVariableTable = true;
										}
										
										lCurrentMethodId = lMethodId;
										lCurrentSelectedMethod = lMethodId;
									}
								}

								boolean bMethodMatched = false;
								
								//System.out.println("bMethodChanged: "+bMethodChanged);								
								if ( bMethodChanged )
								{
									// Check to see if it matches any
									// of the Methods..
									int iMIndex = 0;
									
									if ( ClassMethodAr != null )
									{
										for ( ; iMIndex < ClassMethodAr.size(); iMIndex++ )
										{
											//System.out.println("---------------------------------  "+iMIndex);
											classMethodInfo = (ClassMethodInfo)ClassMethodAr.get(iMIndex);
											//System.out.println("classMethodInfo.lMethodId: "+classMethodInfo.lMethodId);
											if ( lMethodId == classMethodInfo.lMethodId )
											{
												//System.out.println("--Method Matched--");
												bMethodMatched = true;
												break;
											}
										}
										//System.out.println("\n");
									}
									
									String sMethodNm = "";
									MethodInfo methodInfo;

									//System.out.println("bMethodMatched: "+bMethodMatched);
									if ( ! bMethodMatched )
									{
										// Reset so tab can be created..
										bIsBreakpointStepEvent = false;
										
										// The Method changed so we need to
										// get new variables..
										bDoContinue = true;
									}
								}

								//System.out.println("bDoContinue: "+bDoContinue);
								if ( bDoContinue )
								{
									//System.out.println("bDoVariableTable: "+bDoVariableTable);
									if ( bDoVariableTable )
									{
										// Get the Variable table..								
										JDWPCommands.command_VariableTableWithGeneric(
											lClassId,	// ClassId
											lMethodId);	// MethodId
									}
		
									FrameSlotAr = new ArrayList();
									ArrayFrameSlotAr = new ArrayList();
									
									String sName;
									String sSignature;
									int iStringLoc;
									int iVarSize;
									int iLength = 0;
									int iVarIndex;
									long lObjectId;

/*									
									if ( VariableTableAr == null )
										System.out.println("VariableTableAr null");
									else
										System.out.println("VariableTableAr.size(): "+VariableTableAr.size());
/**/									
									// Construct info for GetValues()..
									if ( (VariableTableAr != null) && (VariableTableAr.size() > 0) ) 
									{
										iVarSize = VariableTableAr.size();
										
										for ( iVarIndex = 0; iVarIndex < iVarSize; iVarIndex++ )
										{
											//System.out.println("----------------------------  "+iVarIndex);
											variableTableInfo =
												(VariableTableInfo)VariableTableAr.get(iVarIndex);
											
											// Filter out ones we don't want to try to show..
											sName = variableTableInfo.sName;
											//System.out.println("sName: '"+sName+"'");
											
											sSignature = variableTableInfo.sSignature;
											bSig = (byte)sSignature.charAt(0);
											
											iLength = (int)variableTableInfo.iLength;
											lObjectId = (long)variableTableInfo.lObjectId;
											
											// Check if any variables are visible..
											int iIndex = (int)variableTableInfo.lCodeIndex;
											
											if ( (lBreakpointLocationIndex >= iIndex) &&
												(lBreakpointLocationIndex < (iIndex + iLength)) )
											{
												// Variables that are visible..
												frameSlot = new FrameSlot();
												frameSlot.iSlot = variableTableInfo.iSlot;
												frameSlot.bSigByte = (byte)bSig;
												frameSlot.lObjectId = (long)lObjectId;
	
												FrameSlotAr.add((FrameSlot)frameSlot);
											}
										}	// End while..
										
										int iSlots = 0;
/*
										if ( FrameSlotAr == null )
											System.out.println("FrameSlotAr null");
										else
											System.out.println("FrameSlotAr.size(): "+FrameSlotAr.size());
/**/
										if ( (FrameSlotAr != null) && (FrameSlotAr.size() > 0) )
										{
											// Get local variable info..
											iSlots = FrameSlotAr.size();
											
											JDWPCommands.command_GetValuesFrame(
												lCurrentThreadId,
												lFrameId,
												iSlots);
										}
/*										
										if ( LocalValueAr == null )
											System.out.println("LocalValueAr null");
										else
											System.out.println("LocalValueAr.size(): "+LocalValueAr.size());
/**/
										if ( (LocalValueAr != null) && (LocalValueAr.size() > 0) )
										{
											LocalVariableLHm = new LinkedHashMap();
											LocalValueInfo localValueInfo;
											LocalVariableInfo localVariableInfo;
											int iLocalIndex;
											
											for ( iLocalIndex = 0; iLocalIndex < LocalValueAr.size(); iLocalIndex++ )
											{
												//System.out.println("--TOP-- iLocalIndex: "+iLocalIndex);
												
												localValueInfo = (LocalValueInfo)LocalValueAr.get(iLocalIndex);
/*												
												if ( localValueInfo == null )
													System.out.println("localValueInfo null");
												else
													System.out.println("localValueInfo not null");
/**/

												localVariableInfo = new LocalVariableInfo();
												localVariableInfo.sName = localValueInfo.sName;
												//System.out.println("localValueInfo.sName: '"+localValueInfo.sName+"'");
												localVariableInfo.sSignature = localValueInfo.sSignature;
												//System.out.println("localValueInfo.sSignature: '"+localValueInfo.sSignature+"'");
												localVariableInfo.iSlot = localValueInfo.iSlot;
												localVariableInfo.bType = 0;
												localVariableInfo.sStringValue = new String[1];
												localVariableInfo.sStringValue[0] = "";
	
												LocalVariableLHm.put(
													(Integer)new Integer(localValueInfo.iSlot),
													(LocalVariableInfo)localVariableInfo);
											}
											
											//System.out.println("Dropped out");
										}
									}
								}
								
								// Update classes..
								getTreeClasses();

								long lClassReferenceTypeId = currentClassId;
								lThisObjectId = 0;
								
								ClassVariableInfo classVariableInfo;
								LocalVariableInfo localVariableInfo;

								TaggedObject taggedObject;

								taggedObject = JDWPCommands.command_ThisObject(
									lCurrentThreadId,	// threadId
									lCurrentFrameId);	// frameId
								
								lThisObjectId = taggedObject.objectID;
								
								JDWPCommands.command_FieldsWithGeneric(lClassReferenceTypeId);
								
								ClassVarAr = new ArrayList();
								
								FieldsInfo fieldsInfo;
								String sNameX;
								String sSignatureX;
								long[] nonStaticFields;
								long[] staticFields;
								ArrayList staticFieldAr = new ArrayList();
								ArrayList nonStaticFieldAr = new ArrayList();
								
								Value value = null;
								String sValueResult;
								long lObjectIdX;
								
								if ( (FieldsAr != null) && (FieldsAr.size() > 0) )
								{
									int iFSz = FieldsAr.size();
									long lFieldId;
									int iModBits;
									
									ClassVariableLHm = new LinkedHashMap();
									
									int iResult = 0;
									int iStart = 0;
									byte bType;
									boolean bIsPrimitive = false;
									boolean bIsString = false;
									boolean bIsArray = false;
									char cChr;
									boolean bGetValue = true;
									
									for ( int fIndex = 0; fIndex < iFSz; fIndex++ )
									{
										//System.out.println("==============================");
										classVariableInfo = new ClassVariableInfo();
										classVariableInfo.sName = "";
										classVariableInfo.sSignature = "";
										classVariableInfo.lFieldId = 0;
										classVariableInfo.iModBits = 0;
										classVariableInfo.bType = 0;
										classVariableInfo.sStringValue = new String[1];
										classVariableInfo.sStringValue[0] = "";
										
										fieldsInfo = (FieldsInfo)FieldsAr.get(fIndex);
										sNameX = fieldsInfo.sName;
										classVariableInfo.sName = sNameX;
										
										sSignatureX = fieldsInfo.sSignature;
										classVariableInfo.sSignature = sSignatureX;
										
										lFieldId = fieldsInfo.lFieldId;
										classVariableInfo.lFieldId = lFieldId;
										
										iModBits = fieldsInfo.iModBits;
										classVariableInfo.iModBits = iModBits;

										
										iResult = 0;
										iStart = 0;
										bIsPrimitive = false;
										bIsString = false;
										bIsArray = false;

										// Check Signature..
										if ( sSignatureX.charAt(0) == '[' )
										{
											bIsArray = true;
											iStart++;
										}
										
										if ( sSignatureX.substring(iStart).equals("Ljava/lang/String;") )
											bIsString = true;

										cChr = sSignatureX.charAt(iStart);
										if ( (cChr == 'I') ||
											(cChr == 'B') ||
											(cChr == 'Z') ||
											(cChr == 'J') ||
											(cChr == 'C') ||
											(cChr == 'F') ||
											(cChr == 'D') ||
											(cChr == 'S') )
										{
											bIsPrimitive = true;
										}
										
										iResult = iModBits & Constants.ACC_STATIC;
										if ( iResult == 0 )
										{
											// Non static..
											if ( (bIsPrimitive) ||
												(bIsString) ||
												((bIsArray) && (bIsPrimitive)) ||
												((bIsArray) && (bIsString)) )
											{
												ClassVariableLHm.put(
													(Long)new Long(lFieldId), (ClassVariableInfo)classVariableInfo);

												nonStaticFieldAr.add(new Long((long)fieldsInfo.lFieldId));
											}
										}
										else
										{
											// Static..
											if ( (bIsPrimitive) ||
												(bIsString) ||
												((bIsArray) && (bIsPrimitive)) ||
												((bIsArray) && (bIsString)) )
											{
												ClassVariableLHm.put(
													(Long)new Long(lFieldId), (ClassVariableInfo)classVariableInfo);

												staticFieldAr.add(new Long((long)fieldsInfo.lFieldId));
											}
										}
									}	// End for..
									
									int iSz;
									Long LVal;
									long lVal;
									
									if ( (nonStaticFieldAr != null) && (nonStaticFieldAr.size() > 0) )
									{
										// Load instance FieldIds..
										//System.out.println("In instance FieldIds");
										iSz = nonStaticFieldAr.size();
										lVal = 0;
										nonStaticFields = new long[iSz];
										for ( int g = 0; g < iSz; g++ )
										{
											LVal = (Long)nonStaticFieldAr.get(g);
											if ( LVal != null )
												lVal = LVal.longValue();
											
											nonStaticFields[g] = lVal;
										}
										
										// Get their Values..
										JDWPCommands.command_GetValuesObject(
											lThisObjectId,
											nonStaticFields);
									}
									
									if ( (staticFieldAr != null) && (staticFieldAr.size() > 0) )
									{
										// Load static FieldIds..
										iSz = staticFieldAr.size();
										lVal = 0;
										staticFields = new long[iSz];
										for ( int g = 0; g < iSz; g++ )
										{
											LVal = (Long)staticFieldAr.get(g);
											if ( LVal != null )
												lVal = LVal.longValue();
											
											staticFields[g] = lVal;
										}
										
										// Get their Values..
										JDWPCommands.command_GetValues(
											lThisObjectId,
											staticFields);
									}
								}
								
								ClassValueInfo classValueInfo = null;
								LocalValueInfo localValueInfo = null;
								boolean bDoValues;
								boolean bLocal;
								int iIndex;
								int iSize = 0;
								int iLoop;
								int iArrayLength = 0;
								byte bType;
								Value classValue = null;
								String[] stringValueSa = null;
								
								for ( iLoop = 0; iLoop < 3; iLoop++ )
								{
									bDoValues = false;
									bLocal = false;
									if ( (iLoop == 0) &&
										((StaticValueAr != null) && (StaticValueAr.size() > 0)) )
									{
										// Static..
										bDoValues = true;
										iSize = StaticValueAr.size();
									}
									else if ( (iLoop == 1) &&
										((NonStaticValueAr != null) && (NonStaticValueAr.size() > 0)) )
									{
										// Non static..
										bDoValues = true;
										iSize = NonStaticValueAr.size();
									}
									else if ( (iLoop == 2) &&
										((LocalValueAr != null) && (LocalValueAr.size() > 0)) )
									{
										// Local..
										bDoValues = true;
										bLocal = true;
										iSize = LocalValueAr.size();
									}
									
									if ( bDoValues )
									{
										for ( iIndex = 0; iIndex < iSize; iIndex++ )
										{
											//System.out.println("--------------------------  "+iIndex);
											value = null;
											if ( (iLoop == 0) &&
												((StaticValueAr != null) && (StaticValueAr.size() > 0)) )
											{
												classValueInfo = (ClassValueInfo)StaticValueAr.get(iIndex);
												value = classValueInfo.value;
											}
											else if ( (iLoop == 1) &&
												((NonStaticValueAr != null) && (NonStaticValueAr.size() > 0)) )
											{
												classValueInfo = (ClassValueInfo)NonStaticValueAr.get(iIndex);
												value = classValueInfo.value;
											}
											else if ( (iLoop == 2) &&
												((LocalValueAr != null) && (LocalValueAr.size() > 0)) )
											{
												localValueInfo = (LocalValueInfo)LocalValueAr.get(iIndex);
												value = localValueInfo.value;
											}

											if ( value != null )
											{
												bType = value.getTag();
												
												stringValueSa = new String[1];
												stringValueSa[0] = "";
												
												if ( bType == (byte)Constants.TAG_BOOLEAN )
												{
													stringValueSa[0] =
														String.valueOf((boolean)value.getBooleanValue());
												}
												else if ( bType == (byte)Constants.TAG_BYTE )
												{
													//System.out.println("TAG_BYTE");
													stringValueSa[0] =
														String.valueOf((int)value.getByteValue());
													//System.out.println("(String value): '"+stringValueSa[0]+"'");
												}
												else if ( bType == (byte)Constants.TAG_SHORT )
												{
													//System.out.println("TAG_SHORT");
													stringValueSa[0] =
														String.valueOf((int)value.getShortValue());
													//System.out.println("(String value): '"+stringValueSa[0]+"'");
												}
												else if ( bType == (byte)Constants.TAG_INT )
												{
													//System.out.println("TAG_INT");
													stringValueSa[0] =
														String.valueOf((int)value.getIntValue());
													//System.out.println("(String value): '"+stringValueSa[0]+"'");
												}
												else if ( bType == (byte)Constants.TAG_LONG )
												{
													//System.out.println("TAG_LONG");
													stringValueSa[0] =
														String.valueOf((long)value.getLongValue());
													//System.out.println("(String value): '"+stringValueSa[0]+"'");
												}
												else if ( bType == (byte)Constants.TAG_FLOAT )
												{
													//System.out.println("TAG_FLOAT");
													stringValueSa[0] =
														String.valueOf((float)value.getFloatValue());
													//System.out.println("(String value): '"+stringValueSa[0]+"'");
												}
												else if ( bType == (byte)Constants.TAG_DOUBLE )
												{
													//System.out.println("TAG_DOUBLE");
													stringValueSa[0] =
														String.valueOf((double)value.getDoubleValue());
													//System.out.println("(String value): '"+stringValueSa[0]+"'");
												}
												else if ( bType == (byte)Constants.TAG_CHAR )
												{
													//System.out.println("TAG_CHAR");
													stringValueSa[0] =
														String.valueOf((char)value.getCharValue());
													//System.out.println("(String value): '"+stringValueSa[0]+"'");
												}
												else if ( bType == (byte)Constants.TAG_STRING )
												{
													//System.out.println("(TAG_STRING)");
													long lObjectID = (long)value.getLongValue();
													//System.out.println("(lObjectId): "+lObjectID+"  "+Long.toHexString(lObjectID));

													if ( lObjectID != 0 )
													{
														sValueResult = JDWPCommands.command_Value(lObjectID);
														if ( sValueResult != null )
															stringValueSa[0] = sValueResult;
														else
															stringValueSa[0] = "null";
													}
													else
														stringValueSa[0] = "null";
												}
												else if ( bType == (byte)Constants.TAG_ARRAY )
												{
													//System.out.println("TAG_ARRAY");
													long lObjectID = (long)value.getLongValue();
													//System.out.println("(lObjectId): "+lObjectID+"  "+Long.toHexString(lObjectID));
													
													// Get the length of the Array..
													iArrayLength = JDWPCommands.command_Length(lObjectID);
													//System.out.println("iArrayLength: "+iArrayLength);
													
													JDWPCommands.command_GetValuesArray(
														lObjectID,		// Array ObjectId
														0,				// First index
														iArrayLength);	// Number of components to retrieve
		
													// Load..
													stringValueSa = new String[iArrayLength];
													
													String sValue;
													int iVIndex = 0;
													
													Iterator vectIterator = ADev.variableArrayVector.iterator();
													while ( vectIterator.hasNext() )
													{
														sValue = (String)vectIterator.next();
														stringValueSa[iVIndex] = (String)sValue;
														
														//System.out.println("variableTableInfo.sStringValue["+iVIndex+"]: '"+
															//variableTableInfo.sStringValue[iVIndex]+"'");
														
														iVIndex++;
													}
												}
												
												if ( bLocal )
												{
													if ( (LocalVariableLHm != null) && (LocalVariableLHm.size() > 0) )
													{
														localVariableInfo =
															(LocalVariableInfo)LocalVariableLHm.get((Integer)new Integer(localValueInfo.iSlot));
															
														if ( localVariableInfo != null )
														{
															localVariableInfo.sStringValue = stringValueSa;
															localVariableInfo.bType = bType;
															localVariableInfo.sName = localValueInfo.sName;
															localVariableInfo.sSignature = localValueInfo.sSignature;
															
															// Update..
															LocalVariableLHm.put((Integer)new Integer(localValueInfo.iSlot),
																(LocalVariableInfo)localVariableInfo);
														}
													}
												}
												else
												{
/*
													if ( ClassVariableLHm == null )
														System.out.println("ClassVariableLHm null");
													else
														System.out.println("ClassVariableLHm.size(): "+ClassVariableLHm.size());
/**/

													if ( (ClassVariableLHm != null) && (ClassVariableLHm.size() > 0) )
													{
														//System.out.println("(index): "+(Long)new Long(classValueInfo.lFieldId));
														classVariableInfo =
															(ClassVariableInfo)ClassVariableLHm.get((Long)new Long(classValueInfo.lFieldId));
/*															
														if ( classVariableInfo == null )
															System.out.println("classVariableInfo null");
														else
															System.out.println("classVariableInfo not null");
/**/

														if ( classVariableInfo != null )
														{
															classVariableInfo.sStringValue = stringValueSa;
															classVariableInfo.bType = bType;
															
															// Update..
															ClassVariableLHm.put(
																(Long)new Long(classValueInfo.lFieldId), (ClassVariableInfo)classVariableInfo);
														}
													}
												}
											}
										}	// End for..
									}
								}	// End for..

								updateVariables();

								
								//System.out.println("\n====================================");
								//System.out.println("=== Bottom of EventThread ==============");
								//System.out.println("lCurrentlyShowingClassId: "+lCurrentlyShowingClassId);
								//System.out.println("lCurrentlyShowingMethodId: "+lCurrentlyShowingMethodId);
								if ( (lClassId != lCurrentlyShowingClassId) &&
									(lMethodId != lCurrentlyShowingMethodId) )
								{
									// Set that we want to update the source..
									bIsDirty = true;
									lCurrentSelectedMethod = lMethodId;
								}

								// Check if entry with 'lChangedMethodId' already exists..
								if ( ClassMethodAr != null )
								{
									int iIdx = 0;
									for ( ; iIdx < ClassMethodAr.size(); iIdx++ )
									{
										classMethodInfo = (ClassMethodInfo)ClassMethodAr.get(iIdx);
										if ( (classMethodInfo.lMethodId == lChangedMethodId) &&
											(ClassMethodAr.size() != 1) )
										{
											bContainsMethodId = true;
											break;
										}
									}
								}
								
								
								int iMethodIndex = 0;	// Used below
								if ( ClassMethodAr != null )
								{
									for ( ; iMethodIndex < ClassMethodAr.size(); iMethodIndex++ )
									{
										//System.out.println("---------------------------------  iMethodIndex: "+iMethodIndex);
										classMethodInfo = (ClassMethodInfo)ClassMethodAr.get(iMethodIndex);
										//System.out.println("classMethodInfo.lMethodId: "+classMethodInfo.lMethodId);
										if ( lMethodId == classMethodInfo.lMethodId )
										{
											break;
										}
									}
									//System.out.println("\n");
								}

								
								// Get current Tab..
								int iTabSel = 0;
								boolean bChangeTab = false;
								if ( tabbedPane != null )
								{
									iTabSel = tabbedPane.getSelectedIndex();
								}
								
								if ( iMethodIndex != iTabSel )
								{
									bChangeTab = true;
								}
								
								
								//System.out.println("\nbIsDirty: "+bIsDirty);
								//System.out.println("bMethodChanged: "+bMethodChanged);
								//System.out.println("bSourceExists: "+bSourceExists);
								//System.out.println("bChangeTab: "+bChangeTab);
								
								if ( bMethodChanged || (! bSourceExists) || bIsDirty ||
									bChangeTab )
								{
									//System.out.println("bMethodMatched: "+bMethodMatched);
									if ( bMethodMatched == false )
									{
										String sMethodNm = "";
										MethodInfo methodInfo;
										
										// Get Methods for that Class..		
										JDWPCommands.command_MethodsWithGeneric(lClassId);
										
										// Find Method..
										if ( (AllMethodsAr != null) && (AllMethodsAr.size() > 0) )
										{
											for ( int iG = 0; iG < AllMethodsAr.size(); iG++ )
											{
												methodInfo = (MethodInfo)AllMethodsAr.get(iG);
												if ( lMethodId == methodInfo.lMethodId )
												{
													sMethodNm = methodInfo.sName;
													//System.out.println("sMethodNm: '"+sMethodNm+"'");
													break;
												}
											}
										}

										//System.out.println("bContainsMethodId: "+bContainsMethodId);
										
										// If true the Method is already in ClassMethodAr
										// so don't create another one..
										if ( bContainsMethodId == false )
										{
											// Save information..
											//System.out.println("\n== Creating new ClassMethodAr ==");
											classMethodInfo = new ClassMethodInfo();
											classMethodInfo.lMethodId = lMethodId;
											classMethodInfo.sMethodName = sMethodNm;
											classMethodInfo.lClassId = lClassId;
	
											ClassMethodAr.add((ClassMethodInfo)classMethodInfo);
										}
									}

									updateSource(lClassId, lMethodId);
									bIsDirty = false;
								}

								if ( bDidUpdate )
								{
									bDidUpdate = false;
								}
								else
								{
									if ( bNeedsUpdate || bSourceExists )
									{
										updateSourceLines(lBreakpointLocationIndex);
									}
								}
							}
						}
					}
					catch (InterruptedException ie)
					{
						System.out.println("EventThread Exception: "+ie.toString());
						break;
					}
				}	// End while..
			}
		}
	}	//}}}

	//{{{	LoadSourceBgThread
	protected class LoadSourceBgThread extends Thread
	{
		public void run()
		{
			//System.out.println("LoadSourceBgThread run()");
			
			bSourceExists = false;
			sourceBuf = null;
			StringBuffer statusPathSb;
/*			
			if ( sFullSourcePath == null )
				System.out.println("sFullSourcePath null");
			else
				System.out.println("sFullSourcePath: '"+sFullSourcePath+"'");
/**/
			// Like:  'C:\Android\Dev\ClockApp-master\lib\clock\hand_second.dart'
			// Check if it exisits..
			File fileS = new File(sFullSourcePath);
			if ( fileS.exists() )
			{
				//System.out.println("Exists");

				// Load source path on Status bar..
				statusPathSb = new StringBuffer();
				statusPathSb.append(sFullSourcePath);
				
				//statusPath.setText(Utils.processPath(statusPathSb.toString()));		// Flip '\' -> '/'
				statusPath.setText(Utils.processPath(sFullSourcePath));		// Flip '\' -> '/'
				
				bSourceExists = true;
				sourceBuf = Utils.readFile(2048, sFullSourcePath);	// iInitialSize..
				
			}

			//bLoadFinished = true;
			completeLatch.countDown();
		}
	}	//}}}
	
	//{{{	LoadMethodSourceBgThread
	protected class LoadMethodSourceBgThread extends Thread
	{
		public void run()
		{
			//System.out.println("\nLoadMethodSourceBgThread run()");
			// Construct full Source path..
			StringBuffer sb = new StringBuffer();
			StringBuffer statusPathSb;
			String sSignature = "";
			String sStatusSignature = "";
			
			bSourceExists = false;
			sourceBuf = null;
			
			// Like: 'com/android/spritemethodtest/opengl/SimpleGLRenderer'
			sSignature = fixSignature(sClassSignature);
			//System.out.println("(Org)sSignature: '"+sSignature+"'");

			int iLoc = sSignature.lastIndexOf('/');
			if ( iLoc != -1 )
				sSignature = sSignature.substring(0, iLoc);
/*			
			if ( sSignature == null )
				System.out.println("(New)sSignature null");
			else
				System.out.println("(New)sSignature: '"+sSignature+"'");
/**/

/*
			if ( sSourceDirectory == null )
				System.out.println("sSourceDirectory null");
			else
				System.out.println("sSourceDirectory: '"+sSourceDirectory+"'");
/**/			


			findSourcePath();
			
			// Like:    'C:/Android/Dev/android-kotlin-samples-master/KotlinTest/app/src/main/java'
/*			
			if ( sSourceDirectory == null )
				System.out.println("sSourceDirectory null");
			else
				System.out.println("sSourceDirectory: '"+sSourceDirectory+"'");
/**/			

			
			// Note:
			// As is, it can be wrong.
			
			// From: .../src
			// To:   .../app/src/main/java/
			
			// .../app/src/main/java/[package name]/[sSourceFileName]
			
			// Like:    .../app/src/main/java/  nisrulz/github/example/radiobutton/  MainActivity.java
			
			// Like: 'C:\Android\Dev\WeatherMenuDebug\src'
			sb.append(sSourceDirectory);

			// Note:
			// We want to use the signature path.
			// The package name might not be the same
			// as the path in the signature
			sb.append("/");
			sb.append(Utils.convertToSlashes(sSignature));

			// Add Source file name..
			sb.append("/");
			sb.append(sSourceFileName);
			sFullSourcePath = Utils.processPath(sb.toString());
/**/			

			//System.out.println("sFullSourcePath: '"+sFullSourcePath+"'");


			//sFullSourcePath = sSourceDirectory;
			

			// Add Source Path..
			if ( (ClassMethodAr != null) && (ClassMethodAr.size() > 0) )
			{
				//System.out.println("\nAdding source path");
				int iTIndex;
				ClassMethodInfo classMethodInfo;
				
				// Get tab index..
				iTIndex = tabbedPane.getSelectedIndex();
				iTIndex--;
				if ( iTIndex < 0 )
					iTIndex = 0;
				
				classMethodInfo = (ClassMethodInfo)ClassMethodAr.get(iTIndex);
			}
/*			
			if ( sFullSourcePath == null )
				System.out.println("sFullSourcePath null");
			else
				System.out.println("sFullSourcePath: '"+sFullSourcePath+"'");
/**/				

// Like: 
//  'C:/Android/Dev/android-kotlin-samples-master/KotlinTest/app/src/main/java/com/irontec/examples/kotlintest/adapters/ActivityAdapter.kt'

			// !! TESTING !!
			//sFullSourcePath = "C:/Android/Dev/android-examples-develop/RadioButton/app/src/main/java/nisrulz/github/example/radiobutton/MainActivity.java";
			
			
			// Check if it exisits..
			File fileS = new File(sFullSourcePath);
			if ( fileS.exists() )
			{
/*				
				if ( sSourceFileName == null )
					System.out.println("sSourceFileName null");
				else
					System.out.println("sSourceFileName: '"+sSourceFileName+"'");
/**/				

				// It can be way too long
				// so keep it as this..
				statusPathSb = new StringBuffer();
				statusPathSb.append(sPackageName);
				statusPathSb.append("/");
				statusPathSb.append(sSourceFileName);
				
				statusPath.setText(statusPathSb.toString());
				
				bSourceExists = true;
				bHaveSDKSource = true;
				sourceBuf = Utils.readFile(2048, sFullSourcePath);
			}
			else
			{
				// Check if we have the SDK source..
				if ( (! sSdkDir.equals("")) && (sSdkDir.length() > 0) )
				{
					StringBuffer pathSb = new StringBuffer();
					
					// Try to construct path..
					pathSb.append(androidSdkPathS);
					pathSb.append("/sources/");
					pathSb.append(sSdkDir);
					pathSb.append("/");
					pathSb.append(sSignature);
					pathSb.append("/");
					pathSb.append(sSourceFileName);
					//System.out.println("pathSb: '"+pathSb.toString()+"'");
					
					File fileSystem = new File(pathSb.toString());
					if ( fileSystem.exists() )
					{
						statusPathSb = new StringBuffer();
						statusPathSb.append(sSignature);
						
						for ( int iG = 0; iG < statusPathSb.length(); iG++ )
						{
							if ( statusPathSb.charAt(iG) == '/' )
								statusPathSb.setCharAt(iG, '.');
						}
						
						statusPathSb.append("/");
						statusPathSb.append(sSourceFileName);
						statusPath.setText(statusPathSb.toString());
						
						bSourceExists = true;
						bHaveSDKSource = true;
						sourceBuf = Utils.readFile(2048, pathSb.toString());
					}
				}
				else
				{
					/**
					 * We don't have the SDK source..
					 */

					bHaveSDKSource = false;
					bSourceExists = false;
				}
			}
			
			//bLoadFinished = true;
			completeLatch.countDown();
			
		}
	}	//}}}

	//{{{	IOBgThread
	/**
     * Handle commands and console output 
     */
	class IOBgThread extends Thread
	{
		public void run()
		{
			//System.out.println("\nIOBgThread run()");
			Process proc = null;			
			OutputStream os = null;
			
			InputStream error_is = null;
			InputStream out_is = null;
			BufferedInputStream error_bis = null;
			BufferedInputStream out_bis = null;
			
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			byte[] writeBuf;

			int iBytesRead = 0;
			int iCount;
			int iExitVal;
			int iTotalBytes;
			int iG;
			int iLoc;
			int iLen;
			int iLEnd = -1;
			int iLenSave = 0;
			int iCurrentType = NORMAL;
			int iTmpLength = tempBuf.length;
			int iIndex;
			int iType;
			int iLineLen;
			int iLnLength;
			int iStart;
			int iLen2;
			
			int iBlockIndex = 0;
			int iBlockCharCount = 0;
			int iIdx;
			int iG3;
			int iT;
			int iZ;
			int iY;
			int iBIndex;
			int iClosest;
			int iInsertLoc;
			int iHalf;
			int iChunkLen;
			int iArrayIndex = 0;
			int iPartialLength = 0;
			int iBlockCount = 0;	// TESTING
			int[] iBlock = new int[128];

			char cChr;
			
			Integer IVal;
			
			boolean bCompletePartialLine = false;
			boolean bLineBreakOut;
			boolean bSaveLen = false;
			boolean bContinued;
			boolean bOver;
			boolean bHitTrailing;
			boolean bBytesAvailable;
			boolean bFoundPhrase = false;
			boolean bCheckBlock;
			boolean bFirst = true;
			boolean bSplit = false;
			boolean bDoBreak = false;
			boolean bBlockSplit = false;
			boolean bStart;
			
			String outLineS;
			String inLineS;
			String lineS = "";
			String outS;
			
			
			ArrayList locAr = new ArrayList(384);
			

			// Note:
			//
			// If we use: exec(new String[] {})
			// we can detect when the I/O is finished
			// using exitValue(), but we don't get any
			// command lines from the system.
			//
			// if we use exec(), exitValue() doesn't
			// work but we get the command lines from the system
			// which show useful information

			//System.out.println("\n\n(IOBgThread)commandS: '"+commandS+"'");
			//System.out.println("\nIOBgThread run()");

/*
			if ( commandS == null )
				System.out.println("commandS null");
			else
				System.out.println("commandS: '"+commandS+"'");
/**/

			try
			{
				Runtime rt = Runtime.getRuntime();
				
				if ( iOS == LINUX_MAC )
				{
					proc = rt.exec(new String[] {"/bin/bash", "-c", commandS});
				}
				else
				{
					proc = rt.exec("cmd.exe");
					
					writeBuf = commandS.getBytes();
					
					// Command..				
					os = proc.getOutputStream();
					os.write(writeBuf);
					os.flush();
				}
					
				error_is = proc.getErrorStream();
				out_is = proc.getInputStream();
				
				error_bis = new BufferedInputStream(error_is);
				out_bis = new BufferedInputStream(out_is);	
				
				if ( iOS == WINDOWS )
				{
					StringBuffer tSb = new StringBuffer();
					iLoc = projectHomeS.lastIndexOf('/');
					if ( iLoc != -1 )
						tSb.append(projectHomeS.substring(iLoc + 1));
					
					tSb.append(">");
					//System.out.println("(outputEndS)tSb: '"+tSb.toString()+"'");
					
					// Get current directory prompt..
					StringBuffer currDirSb = new StringBuffer();
					String currDirS = System.getProperty("user.dir");
					//System.out.println("currDirS: '"+currDirS+"'");

					iLoc = currDirS.lastIndexOf('\\');
					if ( iLoc != -1 )
					{
						currDirSb.append(currDirS.substring(iLoc + 1));
						currDirSb.append(">");
					}
					
					//System.out.println("currDirSb: '"+currDirSb.toString()+"'");
/*
					if ( actionCommandS == null )
						System.out.println("actionCommandS null");
					else
						System.out.println("actionCommandS: '"+actionCommandS+"'");
/**/

					// Construct output end test..
					if ( actionCommandS.equals(CLEAN) )
					{
						if ( bFlutterSelected )
							outputEndS = currDirSb.toString();
						else
							outputEndS = tSb.toString();
					}
					else if ( (actionCommandS.equals(DEBUG)) || 
						(actionCommandS.equals(RELEASE)) )
					{
						outputEndS = tSb.toString();
					}
					else if ( actionCommandS.equals(BUILD) )
					{
						outputEndS = tSb.toString();
					}
					else if ( actionCommandS.equals(KILL_SERVER) )
					{
						outputEndS = currDirSb.toString();
					}
					else if ( actionCommandS.equals(DEVICES) )
					{
						outputEndS = currDirSb.toString();
					}
					else if ( actionCommandS.equals(SEND_LOCATION) )
					{
						outputEndS = currDirSb.toString();
					}
					else if ( actionCommandS.equals(INSTALL) ||
						actionCommandS.equals(UNINSTALL) )
					{
						outputEndS = currDirSb.toString();
					}
					else if ( actionCommandS.equals(CREATE_SUBMIT) ||
						actionCommandS.equals(UPDATE_SUBMIT) )
					{
						if ( bFlutterSelected )
							outputEndS = currDirSb.toString();
						else
							outputEndS = "tools>";
					}
					
					//System.out.println("\noutputEndS: '"+outputEndS+"'");
				}

				iTotalBytes = 0;
				int iWordLength = 0;
				int iWordStart = 0;
				int iSIdx;
				int iBlockIdx;
				int iSplitBlockCount;
				int iChrLoc = 0;
				int iBreakLength = DISPLAY_WIDTH / 2;
				boolean bInWord;
				
				long lCTM1;
				long lCTM2;
				long lDif = 0;
				

				
				while ( ! isInterrupted() )
				{
					//System.out.println("--TOP--");
					// Kill for Logcat..					
					if ( bBreakOut )
						break;
					
					if ( out_bis.available() > 0 )	// Check Output Stream..
					{
						lCTM1 = System.currentTimeMillis();
						iBytesRead = out_bis.read(tempBuf, 0, iTmpLength);
						//System.out.println("(Output Stream)iBytesRead: "+iBytesRead);
						if ( iBytesRead == -1 )
						{
							// Never gets this..
							break;
						}

						baos.write(tempBuf, 0, iBytesRead);

						lineSb.insert(0, baos.toString());
						lineSb.setLength(iBytesRead);
						
						baos.reset();
						
						iTotalBytes += iBytesRead;
						lCTM2 = System.currentTimeMillis();
						lDif = lCTM2 - lCTM1;
						//System.out.println("Diff: "+lDif);
					}
					else if ( error_bis.available() > 0 )	// Check Error Stream..
					{
						iBytesRead = error_bis.read(tempBuf, 0, iTmpLength);
						//System.out.println("(Error Stream)iBytesRead: "+iBytesRead);
						if ( iBytesRead == -1 )
						{
							// Never gets this..
							break;
						}
						
						baos.write(tempBuf, 0, iBytesRead);

						lineSb.insert(0, baos.toString());
						lineSb.setLength(iBytesRead);

						baos.reset();						
						
						iTotalBytes += iBytesRead;
					}

/*					
					if ( (lineSb != null) && (iBytesRead > 0) )
					{
						System.out.println();
						char cTChr;

						//if ( lineSb.length() > 500 )
						//{
							for ( int g = 0; g < lineSb.length(); g++ )
							//for ( int g = 0; g < 500; g++ )
							{
								cTChr = (char)lineSb.charAt(g);
								if ( (cTChr < 0x20) || (cTChr > 0x7e) )
									System.out.print("["+Integer.toHexString((int)cTChr)+"]");
								else
									System.out.print(cTChr);
							}
						//}
						System.out.println("\n");
					}
/**/

					// Without this, console output
					// can get really laggy and unresponsive..
					if ( lineSb.length() < 4096 )
						Thread.sleep(10);
					else
					{
						if ( lDif > 0 )
							Thread.sleep(40);
							//Thread.sleep(45);
						else
							//Thread.sleep(30);
							Thread.sleep(20);
					}

					if ( (lineSb != null) && (iBytesRead > 0) )
					{
						// Start of new block..
						//System.out.println("=== NEW BLOCK ===");
						bInWord = false;
						iWordStart = 0;
						
						//System.out.println("bBlockSplit: "+bBlockSplit);
						if ( bBlockSplit )
						{
							// Continue processing from previous block..
						}
						else
						{
							// New block..
							iWordLength = 0;
						}
							
						iIdx = 0;
						bDoBreak = false;
						bSplit = false;
						iChunkLen = lineSb.length();
						//System.out.println("bBlockSplit: "+bBlockSplit);
						//System.out.println("iWordLength: "+iWordLength);
						//System.out.println("iWordStart: "+iWordStart);
						
						for ( ; ; iIdx++ ) 
						{
							//System.out.println("--TOP--");
							if ( bDoBreak )
							{
								//System.out.println("--Breaking--");
								break;
							}
							
							if ( iIdx >= iChunkLen )
							{
								// Hit end of block..
								cChr = lineSb.charAt(lineSb.length() - 1);
								if ( (cChr == (char)0x0a) || (cChr == (char)0x0d) )
									;
								else
								{
									bBlockSplit = true;
								}
								
								bDoBreak = true;
							}
							else
							{
								cChr = lineSb.charAt(iIdx);
								if ( Character.isWhitespace(cChr) )
								{
									// Whitespace..
									iWordLength = 0;	// Reset..
									bInWord = false;	// Reset..
								}
								else
								{
									// Character..
									if ( bInWord == false )
									{
										bInWord = true;
										iWordStart = iIdx;
									}
										
									iWordLength++;
									if ( iWordLength >= DISPLAY_BREAK_WIDTH )
									{
										bSplit = true;
									}
								}
							}
							
							if ( bSplit )
							{
								// Split..
								//System.out.println("\n== SPLIT ==");
								bSplit = false;		// Reset..
								iSIdx = iWordStart;
								
								iSplitBlockCount = iWordLength;
								iWordLength = 0;	// Reset..
								
								//System.out.println("iSplitBlockCount: "+iSplitBlockCount);
								iChrLoc = 0;
								
								for ( ; ; iSIdx++, iSplitBlockCount++ )
								{
									if ( iSIdx >= iChunkLen )
									{
										// Hit end..
										cChr = lineSb.charAt(lineSb.length() - 1);
										if ( (cChr == (char)0x0a) || (cChr == (char)0x0d) )
											;
										else
										{
											iWordLength = iSplitBlockCount;
										}

										bDoBreak = true;
										break;
									}
									
									cChr = lineSb.charAt(iSIdx);
									if ( Character.isWhitespace(cChr) )
									{
										// Done..
										break;
									}
									
									if ( ! Character.isLetterOrDigit(cChr) )
									{
										// Special character..
										iChrLoc = iSIdx;
										//System.out.println("(Special)iChrLoc: "+iChrLoc);
									}
									
									if ( iSplitBlockCount > iBreakLength )
									{
										//System.out.println("iSplitBlockCount > iBreakLength");
										//System.out.println("iChrLoc: "+iChrLoc);
										//System.out.println("iSIdx: "+iSIdx);
										if ( iChrLoc > (iSIdx - (iBreakLength / 2) ) )
										{
											//System.out.println("insert(iChrLoc)");
											lineSb.insert((iChrLoc + 1), ' ');
										}
										else
										{
											//System.out.println("insert(iSIdx)");
											// No special characters found..
											lineSb.insert((iSIdx + 1), ' ');
										}
										
										iChunkLen++;	// Adjust for added space..
										iSIdx += 1;		// Adjust past insert, plus loop increment..
										iChrLoc = 0;	// Reset..
										iSplitBlockCount = 0;
										
									}
								}	// End for..
								
								//System.out.println("Dropped out");
							}
						}	// End for..
					}
/**/					
					
					// Note:
					//
					// Sometimes it can catch the end prompt early,
					// so we need an end test..
					if ( iBytesRead > 0 )
					{
						if ( ! bLogcatOn )
						{
							if ( iOS == WINDOWS )
							{
								if ( (commandPhrase != null) && (commandPhrase.length() > 0) )
								{
									//System.out.println("commandPhrase: '"+commandPhrase+"'");
									if ( lineSb.indexOf(commandPhrase) != -1 )
									{
										//System.out.println("--Found Phrase--");
										bFoundPhrase = true;
									}
								}

								if ( lineSb.charAt(lineSb.length() - 1) == '>' )
								{
									lineS = lineSb.substring(0, lineSb.length());

									
/*
									System.out.println("+++++++++++++++");
									System.out.println("lineS: '"+lineS+"'");
									System.out.println("+++++++++++++++");
									System.out.println("bFoundPhrase: "+bFoundPhrase);
									System.out.println("commandPhrase: '"+commandPhrase+"'");
									System.out.println("outputEndS: '"+outputEndS+"'");
									System.out.println("lineS.endsWith(outputEndS): "+(lineS.endsWith(outputEndS)));
/**/

									if ( actionCommandS.equals(CLEAN) ||  
										actionCommandS.equals(DEBUG) ||
										actionCommandS.equals(BUILD) ||
										actionCommandS.equals(RELEASE) ||
										actionCommandS.equals(DEVICES) ||
										actionCommandS.equals(KILL_SERVER) ||
										actionCommandS.equals(UNINSTALL) ||
										actionCommandS.equals(CREATE_SUBMIT) ||
										actionCommandS.equals(UPDATE_SUBMIT) ||
										actionCommandS.equals(INSTALL) ||
										actionCommandS.equals(SEND_LOCATION) )
									{
										if ( (lineS.endsWith(outputEndS)) &&
											(bFoundPhrase) )
										{
											//System.out.println("End matched, breaking out..");
											bBreakOut = true;	// Signal to break out..
										}
									}
								}
							}
							
							if ( bGradleSelected && (! bFinished) )
							{
								if ( (lineSb.indexOf("preBuild") != -1) ||
									(lineSb.indexOf(":clean") != -1) )
								{
									// Finish Progress Bar early..
									bFinished = true;
								}
							}
						}

						outLineS = "";	// Final line to be inserted..
						bContinued = false;
						iType = NORMAL;
						iLineLen = lineSb.length();

						try
						{
							doc = textPane.getStyledDocument();

							if ( bLogcatOn )
							{
								bLineBreakOut = false;
								iIndex = 0;
								
								while ( true )
								{
									if ( bCompletePartialLine )
									{
										// Reset..
										bCompletePartialLine = false;
										
										// Capture rest of line..
										iStart = iIndex;
										bHitTrailing = false;
										
										for ( ;; iIndex++ )
										{
											if ( iIndex >= iLineLen )
												break;
											
											if ( bHitTrailing )
											{
												if ( Character.isWhitespace(lineSb.charAt(iIndex)) )
													;
												else
													break;
											}
				
											if ( (lineSb.charAt(iIndex) == 0x0d) ||
													(lineSb.charAt(iIndex) == 0x0a) )
												bHitTrailing = true;
										}

										// Set up for output..
										if ( bHitTrailing )
											bSaveLen = false;	// Reset..
											
										iType = iCurrentType;
										outLineS = lineSb.substring(iStart, iIndex);
									}
									else
									{
										// Process line from Start..
										iLenSave = 0;	// Reset..
										
										// Set Type..
										if ( ((iIndex + 1) < iLineLen) &&
											(lineSb.charAt(iIndex + 1) == '/') )
										{
											// Start Characters, X/..
											if ( lineSb.charAt(iIndex) == 'E' )
												iType = ERROR;												
											else if ( lineSb.charAt(iIndex) == 'W' )
												iType = WARNING;
											else
												iType = NORMAL;
										}
										else
										{
											// Not a "Start"..
											iType = NORMAL;
										}
										
										iStart = iIndex;
										bOver = false;
										bHitTrailing = false;
										
										for ( ;; iIndex++ )
										{
											if ( iIndex >= iLineLen )
											{
												bOver = true;
												break;
											}
											
											if ( bHitTrailing )
											{
												if ( Character.isWhitespace(lineSb.charAt(iIndex)) )
													;
												else
													break;	// Start of next line..
											}

											if ( (lineSb.charAt(iIndex) == 0x0d) ||
													(lineSb.charAt(iIndex) == 0x0a) )
												bHitTrailing = true;
										}
										
										if ( bOver )
										{
											// Set up to draw what we have..
											outLineS = lineSb.substring(iStart);
											iCurrentType = iType;	// Save for next draw..
											
											if ( ! bHitTrailing )
											{
												bCompletePartialLine = true;
												bSaveLen = true;
											}
											
											// Signal to break..
											bLineBreakOut = true;
										}
										else
										{
											outLineS = lineSb.substring(iStart, iIndex);
										}
									}
									
									// We should now have the full line
									// including any trailing 0x0d 0x0a
									iLen = doc.getLength();

									// Try to back up over any trailing 0x0d 0x0a
									// to append the partial string..									
									if ( (iLenSave > 0) && (iLen > 0) )
									{
										int iJ;
										String xS = "";
										for ( iJ = iLenSave; ; iJ-- )
										{
											xS = doc.getText(iJ, 1);
											if ( xS.equals(0x0d) || xS.equals(0x0a) )
												;
											else
												break;
										}
										
										iLen = iJ;
									}
									
									if ( iType == NORMAL )
										doc.insertString(iLen, outLineS, normalStyle);
									else if ( iType == WARNING )
										doc.insertString(iLen, outLineS, warningStyle);
									else if ( iType == ERROR )
										doc.insertString(iLen, outLineS, errorStyle);
									
									if ( bSaveLen )
										iLenSave = doc.getLength();
										
									if ( iLen > 0 )
									{
										// Keep all output in view..
										textPane.setCaretPosition(doc.getLength() - 1);
									}
									
									if ( bLineBreakOut )
										break;
									
								}	// End while..
								
								//System.out.println("Dropped out");
							}
							else
							{
								//System.out.println("Normal Output, iBytesRead: "+iBytesRead);
								//System.out.println("lineSb.length(): "+lineSb.length());
								// Normal output..
								if ( iBytesRead > 0 ) 
								{
									outS = lineSb.substring(0, lineSb.length());
									
									
									iLen = doc.getLength();
									
									// This can have issues.
									// It's most noticable when you do a Gradle 'Release'.
									// It gets the output strings, but doesn't do anything with them
									// until the end, when it dumps everything.
									// With the new SwingWorker it seems to be better.

									doc.insertString(iLen, outS, normalStyle);
									
									if ( iLen > 0 )
									{
										textPane.setCaretPosition(doc.getLength() - 1);
										textPane.repaint();
									}
								}
							}
						}
						catch (IllegalArgumentException iae)
						{
							iae.printStackTrace();
						}
						catch (BadLocationException ble)
						{
							ble.printStackTrace();
						}
					}
					else
					{
						// No output..
						if ( iOS == LINUX_MAC )
						{
							// If still getting data
							// gets Exception:
							// 'Exception: java.lang.IllegalThreadStateException: process hasn't exited'
							// When I/O is finished, does exitValue()..
							try
							{
								iExitVal = proc.exitValue();
								//System.out.println("iExitVal: "+iExitVal);
								break;
							}
							catch (IllegalThreadStateException itse)
							{
								//System.out.println(itse.toString());
							}
						}
					}
					
					iBytesRead = 0;
					
				}	// End while..
				
				//System.out.println("Dropped out");
			}
			catch (Exception e)
			{
				System.out.println("Exception: "+e.toString());
				e.printStackTrace();
			}
			finally
			{
				try
				{
					if ( error_bis != null )
						error_bis.close();
					
					if ( out_bis != null )
						out_bis.close();
					
					if ( error_is != null )
						error_is.close();
					
					if ( out_is != null )
						out_is.close();
 				}
				catch (IOException ioe)
				{
				}
			}

			//System.out.println("Calling destroy()");
			proc.destroy();

			while ( true )
			{
				try
				{
					iExitVal = proc.waitFor();
					//System.out.println("iExitVal: "+iExitVal);
					break;
				}
				catch (InterruptedException ie)
				{
					System.out.println(ie.toString());
				}
			}

			if ( bKillLogcat )
			{
				if ( bKillLogcat )
					bKillLogcat = false;	// Reset..
				
				killAdbBgThread = new KillAdbBgThread();
				killAdbBgThread.start();
			}

			//System.gc();

			bIOBgThreadFinished = true;
			
			// Reset..
			bBreakOut = false;
			bLogcatOn = false;
			bFinished = true;

			//System.out.println("\nExiting IOBgThread run()");
			
		}
	}	//}}}

	//{{{	InitializeBuildGradleBgThread
	class InitializeBuildGradleBgThread extends Thread
	{
		public void run()
		{
			// Make sure that signingConfigs storeFile is commented out..
			//System.out.println("InitializeBuildGradleBgThread run()");
			byte[] buildBuf = null;
			StringBuffer outSb;
			int iLoc;
			
			// Construct path..
			StringBuffer fileNameSb = new StringBuffer(projectHomeS);
			
			if ( bFlutterSelected )
				fileNameSb.append("/android/app/build.gradle");
			else
			{
				//System.out.println("bUsingAppProject: "+bUsingAppProject);
				if ( bUsingAppProject )
					fileNameSb.append("/app/build.gradle");
				else
					fileNameSb.append("/build.gradle");
			}

			//System.out.println("fileNameSb: '"+fileNameSb.toString()+"'");
			File buildFile = new File(fileNameSb.toString());
			if ( buildFile.exists() )
			{
				buildBuf = readFile(
					1024,					// iInitialSize
					fileNameSb.toString());	// fileName
				
				if ( (buildBuf != null) && (buildBuf.length > 0) )
				{
					outSb = new StringBuffer(new String(buildBuf));
					iLoc = outSb.indexOf("storeFile");
					if ( iLoc != -1 )
					{
						if ( outSb.charAt(iLoc - 1) == '/' )
							;
						else
						{
							// Comment it out..
							outSb.insert(iLoc, "//");
							
							writeFile(outSb.toString().getBytes(), fileNameSb.toString());	
						}
					}
				}
			}
			
			bInitBuildGradleFinished = true;
		}
	}	//}}}
	
	//{{{	ProjectPropertiesBgThread
	class ProjectPropertiesBgThread	extends Thread
	{
		public void run()
		{
			byte[] buildBuf = null;
			int iLoc;
			String sProjectPropertiesFilename;
			boolean bHaveFile = false;
			
			byte[] zeroAzeroA = {(byte)0x0a, (byte)0x0a};
			String sZeroA = new String(zeroAzeroA);
			byte[] zeroA = {(byte)0x0a};
			String sLead = new String(zeroA);
			
			String sToolsVersion = (String)buildToolsSpinner.getValue();
			if ( (sToolsVersion != null) && (sToolsVersion.length() > 0) )
			{
			
				// Construct filename..
				StringBuffer fileNameSb = new StringBuffer(createProjectHomeS);
				fileNameSb.append("/project.properties");
				sProjectPropertiesFilename = fileNameSb.toString();
				
				// Wait till it gets created..
				long lStartTime = System.currentTimeMillis();
				long lCurrTime;
				File ProjectPropertiesFile = new File(sProjectPropertiesFilename);
				
				while ( true )
				{
					try
					{
						Thread.sleep(1000);
					}
					catch (InterruptedException ie)
					{
					}
					
					lCurrTime = System.currentTimeMillis();
					if ( (lCurrTime - lStartTime) > 15000 )
						break;
					
					if ( ProjectPropertiesFile.exists() )
					{
						bHaveFile = true;
						break;
					}
				}
	
				if ( bHaveFile )
				{
					try
					{
						Thread.sleep(2000);
					}
					catch (InterruptedException ie)
					{
					}

					buildBuf = readFile(
						512,							// iInitialSize
						sProjectPropertiesFilename);	// fileName
					
					if ( (buildBuf != null) && (buildBuf.length > 0) )
					{
						StringBuffer outSb = new StringBuffer(new String(buildBuf));
						
						// Construct line..
						StringBuffer sb = new StringBuffer();
						sb.append(sLead);
						sb.append("sdk.buildtools=");
						sb.append(sToolsVersion);
						sb.append(sZeroA);
						
						outSb.append(sb.toString());
						
						writeFile(outSb.toString().getBytes(), sProjectPropertiesFilename);
					}
				}
			}
		}
	}	//}}}

	//{{{	DebugReleaseBgThread
	class DebugReleaseBgThread extends Thread
	{
		// Handle commenting and un-commenting 'storeFile', 'debug' and 'release'
		// in build.gradle..
		public void run()
		{
			//System.out.println("DebugReleaseBgThread run()");
			byte[] buildBuf = null;
			int iLoc = 0;
			
			StringBuffer fileNameSb = new StringBuffer(projectHomeS);
			if ( bFlutterSelected )
				fileNameSb.append("/android/app/build.gradle");
			else
			{
				if ( bUsingAppProject )
					fileNameSb.append("/app/build.gradle");
				else
					fileNameSb.append("/build.gradle");
			}
			
			buildBuf = readFile(
				512,					// iInitialSize
				fileNameSb.toString());	// fileName
			
			if ( (buildBuf != null) && (buildBuf.length > 0) )
			{
				StringBuffer outSb = new StringBuffer(new String(buildBuf));
				
				// Set signingConfigs 'storeFile'..
				if ( bEnableStoreFile )
				{
					// Enable..
					iLoc = outSb.indexOf("storeFile");
					if ( iLoc != -1 )
					{
						// Check if disabled..
						if ( outSb.charAt((iLoc - 1)) == '/' )
						{
							outSb.delete((iLoc - 2), iLoc);
						}
					}
				}
				else
				{
					// Disable..
					iLoc = outSb.indexOf("storeFile");
					if ( iLoc != -1 )
					{
						// Check if not disabled..
						if ( outSb.charAt((iLoc - 1)) != '/' )
						{
							outSb.insert(iLoc, "//");
						}
					}
				}
				
				// Set buildTypes 'debug'..
				if ( bEnableBuildTypesDebug )
				{
					// Enable..
					iLoc = outSb.indexOf("signingConfig signingConfigs.debug");
					if ( iLoc != -1 )
					{
						// Check if disabled..
						if ( outSb.charAt((iLoc - 1)) == '/' )
						{
							outSb.delete((iLoc - 2), iLoc);
						}
					}
				}
				else
				{
					// Disable..
					iLoc = outSb.indexOf("signingConfig signingConfigs.debug");
					if ( iLoc != -1 )
					{
						// Check if not disabled..
						if ( outSb.charAt((iLoc - 1)) != '/' )
						{
							outSb.insert(iLoc, "//");
						}
					}
				}

				// Set buildTypes 'release'..
				if ( bEnableBuildTypesRelease )
				{
					// Enable..
					iLoc = outSb.indexOf("signingConfig signingConfigs.release");
					if ( iLoc != -1 )
					{
						// Check if disabled..
						if ( outSb.charAt((iLoc - 1)) == '/' )
						{
							outSb.delete((iLoc - 2), iLoc);
						}
					}
				}
				else
				{
					// Disable..
					iLoc = outSb.indexOf("signingConfig signingConfigs.release");
					if ( iLoc != -1 )
					{
						// Check if not disabled..
						if ( outSb.charAt((iLoc - 1)) != '/' )
						{
							outSb.insert(iLoc, "//");
						}
					}
				}
				
				writeFile(outSb.toString().getBytes(), fileNameSb.toString());
			}
			
			bDebugReleaseFinished = true;
		}
	}	//}}}

	//{{{	UpdateAppNameBgThread
	class UpdateAppNameBgThread	extends Thread
	{
		public void run()
		{
			// Update Application name for Ant and Gradle..
			byte[] buildBuf = null;
			int iLoc;
			int iLoc2;
			int iStart;
			String sAppFilename;
			boolean bHaveFile = false;
			boolean bDoWrite = false;
			
			//System.out.println("\nUpdateAppNameBgThread run()");
			//System.out.println("createProjectHomeS: '"+createProjectHomeS+"'");
			
			// Construct filename..
			StringBuffer fileNameSb = new StringBuffer(createProjectHomeS);
			
			if ( bGradleSelected )
			{
				// Adjust path for Gradle, Kotlin..
				if ( bUsingAppProject )
					fileNameSb.append("/app/src/main");
				else
					fileNameSb.append("/src/main");
			}
			
			fileNameSb.append("/res/values/strings.xml");
			//System.out.println("(Final)fileNameSb: '"+fileNameSb.toString()+"'");
			sAppFilename = fileNameSb.toString();
			
			// Wait till it gets created..
			long lStartTime = System.currentTimeMillis();
			long lCurrTime;
			File AppNameFile = new File(sAppFilename);
			
			while ( true )
			{
				try
				{
					Thread.sleep(1000);
				}
				catch (InterruptedException ie)
				{
				}
				
				lCurrTime = System.currentTimeMillis();
				if ( (lCurrTime - lStartTime) > 15000 )
					break;

				if ( AppNameFile.exists() )
				{
					bHaveFile = true;
					break;
				}
			}

			//System.out.println("bHaveFile: "+bHaveFile);
			if ( bHaveFile )
			{
				try
				{
					Thread.sleep(3000);
				}
				catch (InterruptedException ie)
				{
				}

/*				
				if ( sAppFilename == null )
					System.out.println("sAppFilename null");
				else
					System.out.println("sAppFilename: '"+sAppFilename+"'");
/**/


				buildBuf = readFile(
					512,			// iInitialSize
					sAppFilename);	// fileName

/*				
				if ( buildBuf == null )
					System.out.println("buildBuf null");
				else
					System.out.println("buildBuf.length: "+buildBuf.length);
/**/
				
				if ( (buildBuf != null) && (buildBuf.length > 0) )
				{
					// Replace "@string/app_name"..
					StringBuffer outSb = new StringBuffer(new String(buildBuf));
					//System.out.println("outSb: '"+outSb.toString()+"'");
					iLoc = outSb.indexOf("app_name");
					if ( iLoc != -1 )
					{
						iLoc2 = outSb.indexOf("<", iLoc);
						if ( iLoc2 != -1 )
						{
							sApplicationName = sApplicationName.trim();
							//System.out.println("sApplicationName: '"+sApplicationName+"'");
							outSb.replace((iLoc + 10), iLoc2, sApplicationName);
							
							bDoWrite = true;
						}
					}

					if ( bDoWrite )
					{
						writeFile(outSb.toString().getBytes(), sAppFilename);						
					}
				}
			}
			
			bAppNameFinished = true;
		}
	}	//}}}

	//{{{	DaemonOutputBgThread
	class DaemonOutputBgThread extends Thread
	{
		public void run()
		{
			//System.out.println("DaemonOutputBgThread run()");
			String sOut = "";
			StringBuffer outSb = new StringBuffer();
			int iLen;

			while ( true )
			{
				if ( bKillDaemonOutput )
					break;
				
				try
				{
					// Retrieves and removes the head of this queue, waiting if necessary
					// until an element becomes available..
					outSb = new StringBuffer();
					outSb.append((String)queue.take());
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}

				try
				{				
					doc = textPane.getStyledDocument();	
					iLen = doc.getLength();
					
					doc.insertString(iLen, outSb.toString(), normalStyle);
					if ( iLen > 0 )
					{
						textPane.setCaretPosition(doc.getLength() - 1);
						textPane.repaint();
					}
				}
				catch (IllegalArgumentException iae)
				{
					iae.printStackTrace();
				}
				catch (BadLocationException ble)
				{
					ble.printStackTrace();
				}
			}
		}
	}	//}}}
	
	//{{{	FlutterDaemonBgThread
	class FlutterDaemonBgThread extends Thread
	{
		public void run()
		{
			//System.out.println("FlutterDaemonBgThread run()");
			InputStream out_is = null;
			InputStream error_is = null;

			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			byte[] tempBuf = new byte[1024];
			
			int iBytesRead = 0;
			int iTmpLength = tempBuf.length;
			int iExitVal = 0;
			int iLoc = 0;
			int iLoc2 = 0;
			int iLoc3 = 0;
			int iLoc4 = 0;
			int iLoc5 = 0;
			int iLen;
			String sT = "";
			String sT2 = "";
			String sMessage = "";
			String sErrorMessage = "";
			StringBuffer outSb;
			StringBuffer tSb;
			boolean bAppIdFound = false;
			boolean bLookForEnd = false;
			boolean bError = false;
			boolean bProgressFinished = false;
			boolean bHitStart = false;
			bHaveWsUri = false;

			// Set initial Id..			
			iRequestId = 0;
			
			Properties prop = new Properties();
			
			try
			{
				prop.load(new FileInputStream("config.properties"));
			}
			catch (IOException ioe)
			{
				System.out.println("Daemon prop.load() Exception");
				ioe.printStackTrace();
			}

			// Set up build.gradle for debug or release..
			if ( (sRunBuildType != null) && (sRunBuildType.length() > 0) )
			{
				if ( sRunBuildType.equals("debug") )
				{
					bEnableStoreFile = false;
					bEnableBuildTypesDebug = true;
					bEnableBuildTypesRelease = false;
				}
				else if ( sRunBuildType.equals("release") )
				{
					bEnableStoreFile = true;
					bEnableBuildTypesDebug = false;
					bEnableBuildTypesRelease = true;
				}
			}
			
			bDebugReleaseFinished = false;
			debugReleaseBgThread = new DebugReleaseBgThread();
			debugReleaseBgThread.start();

			while ( true )
			{
				if ( bDebugReleaseFinished )
					break;
				
				try
				{
					Thread.sleep(250);
				}
				catch (InterruptedException ie)
				{
				}
			}
			
			// Construct command..
			StringBuffer cmdSb = new StringBuffer();
			
			if ( iOS == LINUX_MAC )
			{
				cmdSb.append("export PATH=${PATH}:");
				cmdSb.append(sFlutterSdkPath);
				
				cmdSb.append(";cd ");
				cmdSb.append(projectHomeS);

				cmdSb.append(";flutter run ");	

				if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
				{
					cmdSb.append("--device-id ");
					cmdSb.append(sDeviceName);
					cmdSb.append(" ");
				}
				
				if ( (sRunBuildType != null) && (sRunBuildType.length() > 0) )
				{
					if ( sRunBuildType.equals("release") )
						cmdSb.append("--release ");
				}
					
				if ( (sBuildTarget != null) && (sBuildTarget.length() > 0) )
				{
					if ( sBuildTarget.equals("apk") )
					{
						if ( (sAndroidLanguage != null) && (sAndroidLanguage.length() > 0) )
						{
							if ( sAndroidLanguage.equals("java") )
								;	// Default, don't use..
							else
							{
								cmdSb.append("-a ");
								cmdSb.append(sAndroidLanguage);
							}
						}
					}
					else if ( sBuildTarget.equals("ios") )
					{
						if ( (sIosLanguage != null) && (sIosLanguage.length() > 0) )
						{
							if ( sIosLanguage.equals("objc") )
								;	// Default, don't use..
							else
							{
								cmdSb.append("-a ");
								cmdSb.append(sIosLanguage);
							}
						}
					}
				}
				
				if ( (sEnableSoftwareRendering != null) && (sEnableSoftwareRendering.length() > 0) )
					cmdSb.append("--enable-software-rendering");
				
				cmdSb.append(" --machine");
			}
			else
			{
				cmdSb.append("SET PATH=");
				cmdSb.append(sFlutterSdkPath);
				cmdSb.append(";%PATH%");

				cmdSb.append("&&CD ");
				cmdSb.append(projectHomeS);

				cmdSb.append("&&flutter run ");
				
/*
				if ( sDeviceName == null )
					System.out.println("sDeviceName null");
				else
					System.out.println("sDeviceName: '"+sDeviceName+"'");
/**/				
				
				if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
				{
					cmdSb.append("--device-id ");
					cmdSb.append(sDeviceName);
					cmdSb.append(" ");
				}
				
				if ( (sRunBuildType != null) && (sRunBuildType.length() > 0) )
				{
					if ( sRunBuildType.equals("release") )
						cmdSb.append("--release ");
				}
					
				if ( (sBuildTarget != null) && (sBuildTarget.length() > 0) )
				{
					if ( sBuildTarget.equals("apk") )
					{
						if ( (sAndroidLanguage != null) && (sAndroidLanguage.length() > 0) )
						{
							if ( sAndroidLanguage.equals("java") )
								;	// Default, don't use..
							else
							{
								cmdSb.append("-a ");
								cmdSb.append(sAndroidLanguage);
							}
						}
					}
				}
				
				if ( (sEnableSoftwareRendering != null) && (sEnableSoftwareRendering.length() > 0) )
					cmdSb.append("--enable-software-rendering");
					
				cmdSb.append(" --machine");
				cmdSb.append("\n");
			}

			//System.out.println("cmdSb: '"+cmdSb.toString()+"'");
			
			try
			{
				Runtime rt = Runtime.getRuntime();
				
				if ( iOS == LINUX_MAC )
				{
					daemonProcess = rt.exec(new String[] {"/bin/bash", "-c", cmdSb.toString()});
				}
				else
				{
					//daemonProcess = rt.exec(new String[] {"cmd.exe", "/C", cmdSb.toString()});
					daemonProcess = rt.exec("cmd.exe");
					
					// Command..				
					daemonOutputStream = daemonProcess.getOutputStream();
					daemonOutputStream.write(cmdSb.toString().getBytes());
					daemonOutputStream.flush();
				}

/*
				if ( daemonProcess == null )
					System.out.println("daemonProcess null");
				else
					System.out.println("daemonProcess not null");
/**/

				error_is = daemonProcess.getErrorStream();
				out_is = daemonProcess.getInputStream();
				
				
				bProgressBarFinished = false;
				SwingWorker swingWorker = new SwingWorker()
				{
					@Override
					public Void doInBackground()
					{
						progressJFrame = new JFrame();
						jProgressBar = new JProgressBar();
						jProgressBar.setIndeterminate(true);
						jProgressBar.setPreferredSize(new Dimension(200, 30));
						
						progressJFrame.setUndecorated(true);
						progressJFrame.add(jProgressBar);
						progressJFrame.pack();
						progressJFrame.setVisible(true);
						progressJFrame.setLocationRelativeTo(mainJFrame);
						progressJFrame.setAlwaysOnTop(true);

						while ( true )
						{
							try
							{
								Thread.sleep(250);
							}
							catch (InterruptedException ie)
							{
							}
							
							if ( bProgressBarFinished )
							{
								break;
							}
						}
						
						return null;
					}
					
					@Override
					public void done()
					{
						//System.out.println("SwingWorker done()");
						progressJFrame.dispose();
					}
				};
				
				swingWorker.execute();
				
				
				while ( true )
				{
					iBytesRead = 0;
					
					if ( bKillDaemonThread )
					{
						break;
					}
					
					if ( error_is.available() > 0 )	// Check Error Stream..
					{
						iBytesRead = error_is.read(tempBuf, 0, iTmpLength);
						//System.out.println("(error_is)iBytesRead: "+iBytesRead);
						if ( iBytesRead == -1 )
						{
							// Never gets this..
							break;
						}
						
						baos.write(tempBuf, 0, iBytesRead);
					}
					else if ( out_is.available() > 0 )	// Check Input Stream..
					{
						iBytesRead = out_is.read(tempBuf, 0, iTmpLength);
						//System.out.println("(out_is)iBytesRead: "+iBytesRead);
						if ( iBytesRead == -1 )
						{
							// Never gets this..
							break;
						}
						
						baos.write(tempBuf, 0, iBytesRead);
					}
					else
					{
						// Didn't get anything..
						
/*
						// If still getting data
						// gets Exception:
						// 'Exception: java.lang.IllegalThreadStateException: process hasn't exited'
						// When I/O is finished, does exitValue()..
						try
						{
							iExitVal = daemonProcess.exitValue();
							//System.out.println("iExitVal: "+iExitVal);
							//break;
						}
						catch (IllegalThreadStateException itse)
						{
						}
/**/
					}

					if ( iBytesRead > 1 )
					{
						
						sT = new String(baos.toByteArray());

/*						
						// ------ Debugging from here ------
						if ( (sT != null) && (sT.length() > 0) && (bLookForEnd == false) )
						{
							System.out.println("sT:");
							System.out.println();
							char cTChr;
							
							for ( int g = 0; g < sT.length(); g++ )
							{
								cTChr = (char)sT.charAt(g);
								if ( (cTChr < 0x20) || (cTChr > 0x7e) )
									//System.out.print("["+Integer.toHexString((int)cTChr)+"]");
									System.out.print("<"+Integer.toHexString((int)cTChr)+">");
								else
									System.out.print(cTChr);
							}
							System.out.println("\n");
						}
/**/

/*
						// Look for "app.started"..
						iLoc3 = sT.indexOf(EVENT_STRING);
						if ( iLoc3 != -1 )
						{
							iLoc4 = sT.indexOf((int)0x22, iLoc3 + 9);
							if ( iLoc4 != -1 )
							{
								if ( sT.substring(iLoc3 + 9, iLoc4).equals("app.started") )
								{
									bDebugRan = true;
									DebugInit();
								}
							}
						}
/**/

						if ( bHitStart == false )
						{
							//System.out.println("sT.length(): "+sT.length());
							//System.out.println("sT: '"+sT+"'");
							// Kill any leading path output..
							
							if ( iOS == LINUX_MAC )
							{
								iLoc = sT.indexOf("export");
								if ( iLoc != -1 )
								{
									bHitStart = true;
									sT = sT.substring(iLoc);
								}
								else
									continue;
							}
							else
							{
								iLoc = sT.indexOf("SET");
								if ( iLoc != -1 )
								{
									bHitStart = true;
									sT = sT.substring(iLoc);
								}
								else
									continue;
							}
						}

						sT2 = "";
						
						iLoc = sT.indexOf("[");
						if ( iLoc != -1 )
						{
							iLoc2 = sT.indexOf("]");
							if ( iLoc2 != -1 )
							{
								if ( bAppIdFound == false )
								{
									iLoc3 = sT.indexOf("appId");
									if ( iLoc3 != -1 )
									{
										iLoc4 = sT.indexOf((char)0x22, (iLoc3 + 8));
										if ( iLoc4 != -1 )
										{
											sAppId = sT.substring((iLoc3 + 8), iLoc4);
											//System.out.println("sAppId: '"+sAppId+"'");
											bAppIdFound = true;
										}
									}
								}
								
								iLoc3 = sT.indexOf("message");
								if ( iLoc3 != -1 )
								{
									iLoc4 = sT.indexOf((char)0x22, (iLoc3 + 10));
									if ( iLoc4 != -1 )
									{
										sMessage = sT.substring((iLoc3 + 10), iLoc4);
										iLoc5 = sMessage.indexOf("Syncing files");
										if ( iLoc5 != -1 )
										{
											// Signal finished..
											bProgressBarFinished = true;
										}
										
										//System.out.println("sMessage: '"+sMessage+"'");
										sT2 = sMessage;
									}
								}

								iLoc3 = sT.indexOf(ERROR_STRING);
								if ( iLoc3 != -1 )
								{
									iLoc4 = sT.indexOf((char)0x22, (iLoc3 + 9));
									if ( iLoc4 != -1 )
									{
										bError = true;
										sErrorMessage = sT.substring((iLoc3 + 9), iLoc4);
										//System.out.println("sErrorMessage: '"+sErrorMessage+"'");
										sT2 = sErrorMessage;
									}
								}
								
								iLoc3 = sT.indexOf("wsUri");
								if ( iLoc3 != -1 )
								{
									iLoc4 = sT.indexOf((char)0x22, (iLoc3 + 8));	// Get end "..
									if ( iLoc4 != -1 )
									{
										sDebugUri = sT.substring((iLoc3 + 8), iLoc4);
										//System.out.println("sDebugUri: '"+sDebugUri+"'");
									}
									
									bHaveWsUri = true;
								}
								
							}
							else
							{
								// Couldn't find end ']'..
								bLookForEnd = true;
								
								iLoc3 = sT.indexOf(ERROR_STRING);
								if ( iLoc3 != -1 )
								{
									// Signal finished..
									bProgressBarFinished = true;

									iLoc4 = sT.indexOf((char)0x22, (iLoc3 + 9));
									if ( iLoc4 != -1 )
									{
										sErrorMessage = sT.substring((iLoc3 + 9), iLoc4);
										//System.out.println("\nsErrorMessage: '"+sErrorMessage+"'");
									}
								}
							}
						}
						else
						{
/*							
							if ( sT == null )
								System.out.println("sT null");
							else
							{
								System.out.println("sT.length(): "+sT.length());
								System.out.println("sT: '"+sT+"'");
							}
/**/

							// No lead '['..
							//System.out.println("bLookForEnd: "+bLookForEnd);
							if ( bLookForEnd )
							{
								iLoc4 = sT.indexOf("]");
								if ( iLoc4 != -1 )
								{
									// Found end ']'..
									//System.out.println("Found block with end");
									bLookForEnd = false;
									if ( (sErrorMessage != null) && (sErrorMessage.length() > 0) )
										sT2 = sErrorMessage;
								}
							}
							else
							{
								// Note:
								// Error messages can also come through here:
								// 'Error launching application on sdk phone armv7.'
								
								// Kill new version text..
								tSb = new StringBuffer(sT);
								
								// Skip any leading spaces..
								int iX = 0;
								for ( ; iX < tSb.length(); iX++ )
								{
									if ( tSb.charAt(iX) != (char)0x20 )
										break;
								}
								
								if ( tSb.charAt(iX) == (char)0xe2 )
								{
									if ( tSb.charAt(iX + 1) == (char)0x2c6 )
									{
										// Kill weird leading characters..								
										int iJ = 0;
										
										while ( true )
										{
											if ( (tSb.charAt(iJ) >= (char)0x21) &&
													(tSb.charAt(iJ) <= (char)0x7e) )
											{
												sT = tSb.toString();
												sT = sT.trim();
												break;
											}
											else
												tSb.deleteCharAt(iJ);
										}
										
										sT2 = sT;
									}
									else
									{
										// Don't use any of it..
										sT2 = "";
									}
								}
								else
								{
									sT = sT.trim();
	
									// Kill weird leading characters..								
									tSb = new StringBuffer(sT);
									int iJ = 0;
									
									while ( true )
									{
										if ( (tSb.charAt(iJ) >= (char)0x21) &&
												(tSb.charAt(iJ) <= (char)0x7e) )
										{
											sT = tSb.toString();
											break;
										}
										else
											tSb.deleteCharAt(iJ);
									}
									
									iLoc4 = sT.indexOf("SET PATH");
									if ( iLoc4 != -1 )
									{
										// Don't let it use..
									}
									else
									{
									
	
									//if ( (sT.length() >= 2) && (sT.charAt(1) == (char)0x2f) )	// '/'								
										//;	// Don't show logcat-like output..
									//else
									//{
										//System.out.println("sT: '"+sT+"'");
										iLoc2 = sT.indexOf("Error");
										if ( iLoc2 != -1 )
										{
											// Signal finished..
											bProgressBarFinished = true;
										}
										
										sT2 = sT;
									//}
									
									}
								}
							}
						}

						if ( (sT2 != null) && (sT2.length() > 0) )
						{
							// Output to console..
							//System.out.println("(Out)sT2: '"+sT2+"'");
							outSb = new StringBuffer(sT2);
							outSb.append((char)0x0a);
							
							try
							{				
								doc = textPane.getStyledDocument();	
								iLen = doc.getLength();
								doc.insertString(iLen, outSb.toString(), normalStyle);
								if ( iLen > 0 )
								{
									textPane.setCaretPosition(doc.getLength() - 1);
									textPane.repaint();
								}
							}
							catch (IllegalArgumentException iae)
							{
								iae.printStackTrace();
							}
							catch (BadLocationException ble)
							{
								ble.printStackTrace();
							}
						}
					}
					
					baos.reset();
					
				}	// End while..
				
			}
			catch (Exception e)
			{
				System.out.println("Daemon Exception");
				e.printStackTrace();
			}
			finally
			{
				try
				{
					if ( daemonOutputStream != null )
						daemonOutputStream.close();
					
					if ( out_is != null )
						out_is.close();

					if ( error_is != null )
						error_is.close();
				}
				catch (IOException ioe)
				{
					System.out.println("Daemon finally Exception");
					ioe.printStackTrace();
				}
			}

			daemonProcess.destroy();
			
			while ( true )
			{
				try
				{
					iExitVal = daemonProcess.waitFor();
					break;
				}
				catch (InterruptedException ie)
				{
				}
			}
			
		}
	}	//}}}

	//{{{	FlutterDaemonStdInBgThread	
	class FlutterDaemonStdInBgThread extends Thread
	{
		public void run()
		{
			//System.out.println("FlutterDaemonStdInBgThread run()");
			//OutputStream outputStream;
			OutputStream outputStream = null;
			StringBuffer outSb = new StringBuffer();
			String sReq = "";

/*			
			if ( daemonProcess == null )
				System.out.println("daemonProcess null");
			else
				System.out.println("daemonProcess not null");
/**/

			if ( daemonProcess != null )
			{
				try
				{
					outputStream = daemonProcess.getOutputStream();
/*
					if ( outputStream == null )
						System.out.println("outputStream null");
					else
						System.out.println("outputStream: "+outputStream);
/**/


// [{"method":"app.restart","params":{"appId":"89653f72-87bc-40d6-a2d9-4627757b687a","fullRestart":false},"id":1}]
// [{"method":"app.stop","params":{"appId":"89653f72-87bc-40d6-a2d9-4627757b687a"},"id":2}]

					//System.out.println("sAppId: '"+sAppId+"'");

					if ( iDaemonCommand == DAEMON_STOP )
					{
						outSb.append("[");
						
						ParamAr = new ArrayList();
						ParamAr.add((String)Utils.filterObject(sAppId));
				
						String[] getAppStopMsg = {
							"method", "app.stop",
							"params",
							"appId", "[]",
							"}"};
				
						sReq = ConstructMessage(getAppStopMsg);
						outSb.append(sReq);
						outSb.append("]");
						
						//System.out.println("outSb: '"+outSb.toString()+"'");

					}
					else if ( iDaemonCommand == DAEMON_RELOAD )
					{
						//System.out.println("DAEMON_RELOAD");
						
						outSb.append("[");
						
						ParamAr = new ArrayList();
						ParamAr.add((String)Utils.filterObject(sAppId));
						ParamAr.add((String)"false");
				
						String[] getAppRestartMsg = {
							"method", "app.restart",
							"params",
							"appId", "[]",
							"fullRestart", "[d",
							"}"};
				
						sReq = ConstructMessage(getAppRestartMsg);
						outSb.append(sReq);
						outSb.append("]");
						
						//System.out.println("outSb: '"+outSb.toString()+"'");
						
					}

					//System.out.println("outSb: '"+outSb.toString()+"'");
					
					PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));					
					printWriter.write(outSb.toString());
					printWriter.write("\n");
					printWriter.flush();
					
					iRequestId++;
					
				}
				catch (Exception e)
				{
					System.out.println("StdIn Exception");
					e.printStackTrace();
				}
				finally
				{
/*
					System.out.println("In finally..");
					
					try
					{
						if ( outputStream != null )
							outputStream.close();
					}
					catch (IOException ioe)
					{
						System.out.println("StdIn finally Exception");
						ioe.printStackTrace();

					}
/**/
				}
				
				bDaemonStdInFinished = true;
			}
		}
	}	//}}}

	//{{{	CheckPubBgThread
	class CheckPubBgThread extends Thread
	{
		public void run()
		{

			StringBuffer sB = new StringBuffer();
			sB.append(projectHomeS);
			sB.append("/pubspec.lock");
			//System.out.println("sB: '"+sB.toString()+"'");
			
			File file = new File(sB.toString());	
			if ( file.exists() == false )
			{
				int iChoice = JOptionPane.showConfirmDialog(
					frame,
					(String)"Run: flutter pub get?",
					"Question",
					(int)JOptionPane.YES_NO_OPTION);

				if ( iChoice == JOptionPane.YES_OPTION )
				{
					sB = new StringBuffer();
					
					if ( iOS == LINUX_MAC )
					{
						sB.append("export PATH=${PATH}:");
						sB.append(sFlutterSdkPath);
						
						sB.append(";cd ");
						sB.append(projectHomeS);
						
						sB.append(";flutter pub get");
					}
					else
					{
						sB.append("SET PATH=");
						sB.append(sFlutterSdkPath);
						sB.append(";%PATH%");
						
						sB.append("&&CD ");
						sB.append(projectHomeS);
						
						sB.append("&&flutter pub get");
						sB.append("\n");
					}
					
					bInternalFinished = false;		
					internalCommandS = sB.toString();
					commandBgThread = new CommandBgThread();
					commandBgThread.start();
			
					// Wait for Thread to finish..
					while ( true )
					{
						try
						{
							Thread.sleep(100);
						}
						catch (InterruptedException ie)
						{
						}
		
						if ( bInternalFinished )
							break;
					}
				}
			}
		}
	}	//}}}

	//{{{	AdbBgThread
	class AdbBgThread extends Thread
	{
		public void run()
		{
			//System.out.println("\nAdbBgThread run()");
			StringBuffer sb = new StringBuffer();
			String pidS = "";
			
			sb = new StringBuffer();		
			if ( iOS == LINUX_MAC )
			{
				sb.append("export PATH=${PATH}:");
				sb.append(androidSdkPathS);
				sb.append("/platform-tools");
				
				if ( bWirelessConnected )
					;
				else
				{
					sb.append(";adb kill-server");
					sb.append(";adb start-server");
				}
				
				sb.append(";adb ");

				if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
				{
					sb.append("-s ");
					sb.append(sDeviceName);
					sb.append(" ");
				}
				
				sb.append("shell ps");

				sb.append(";adb ");

				if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
				{
					sb.append("-s ");
					sb.append(sDeviceName);
					sb.append(" ");
				}
				
				sb.append("shell getprop ro.build.version.sdk");
			}
			else
			{
				sb.append("SET PATH=");
				sb.append(androidSdkPathS);
				sb.append("/platform-tools");
				sb.append(";%PATH%");

				//System.out.println("bWirelessConnected: "+bWirelessConnected);
				if ( bWirelessConnected )
					;
				else
				{
					sb.append("&&adb kill-server");
					sb.append("&&adb start-server");
				}
				
				sb.append("&&adb ");
/*
				if ( sDeviceName == null )
					System.out.println("sDeviceName null");
				else
					System.out.println("sDeviceName: '"+sDeviceName+"'");
/**/					
				if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
				{
					sb.append("-s ");
					sb.append(sDeviceName);
					sb.append(" ");
				}
				
				sb.append("shell ps");

				sb.append("&&adb ");

				if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
				{
					sb.append("-s ");
					sb.append(sDeviceName);
					sb.append(" ");
				}
				
				sb.append("shell getprop ro.build.version.sdk");
				sb.append("\n");
			}
	
			//System.out.println("sb: '"+sb.toString()+"'");
			
			bInternalFinished = false;		
			internalCommandS = sb.toString();
			commandBgThread = new CommandBgThread();
			commandBgThread.start();
	
			// Wait for Thread to finish..
			while ( true )
			{
/*
				try
				{
					Thread.sleep(100);
				}
				catch (InterruptedException ie)
				{
				}
/**/				
				Thread.yield();

				if ( bInternalFinished )
					break;
			}

/*
			if ( commandResultS == null )
				System.out.println("commandResultS null");
			else
				//System.out.println("commandResultS not null");
				System.out.println("commandResultS: '"+commandResultS+"'");
/**/

/*
			if ( packageNameS == null )
				System.out.println("\npackageNameS null");
			else
				System.out.println("\npackageNameS: '"+packageNameS+"'");
/**/

			//System.out.println("bFlutterSelected: "+bFlutterSelected);
			if ( bFlutterSelected == false )
			{
				// Grab package name..
				if ( (commandResultS != null) && (commandResultS.length() > 0) )
				{
					int iLoc = 0;
					int iLoc2 = 0;
					int iLoc3 = 0;
					int iStart;
					int iEnd;
					int iLen = commandResultS.length();
					String sTmpPid;
		
					boolean bFoundPackageName = false;
					int iLocX = 0;
					iLoc2 = 0;
					
					// Find package name..
					for ( ; iLoc2 < iLen; )
					{
						// Grab package name..
						iLoc2 = commandResultS.indexOf((char)0x0a, iLoc2);
						if ( iLoc2 != -1 )
						{
							iLocX = iLoc2;
							for ( ; Character.isWhitespace(commandResultS.charAt(iLoc2)); iLoc2-- );	// Skip whitespace
							iEnd = iLoc2;
							for ( ; ! Character.isWhitespace(commandResultS.charAt(iLoc2)); iLoc2-- );	// Skip to start
							sPackageName = commandResultS.substring(iLoc2 + 1, iEnd + 1);
							if ( sPackageName.equals(packageNameS) )
							{
								bFoundPackageName = true;
								iLoc3 = iLoc2;	// Save..
								break;
							}
						}
						
						iLoc2 = iLocX + 1;
					}	// End for..

/*
					if ( sPackageName == null )
						System.out.println("\nsPackageName null");
					else
						System.out.println("\nsPackageName: '"+sPackageName+"'");
/**/				
					
					iLoc2 = iLen - 2;
					for ( ; commandResultS.charAt(iLoc2) != 0x0a; iLoc2-- );
					iLoc2++;
					iStart = iLoc2;
					for ( ; ! Character.isWhitespace(commandResultS.charAt(iLoc2)); iLoc2++ );
					sSdkVersion = commandResultS.substring(iStart, iLoc2);
					//System.out.println("sSdkVersion: '"+sSdkVersion+"'");

					//System.out.println("bFoundPackageName: "+bFoundPackageName);
					if ( bFoundPackageName )
					{
						// Grab PID..
						for ( ; commandResultS.charAt(iLoc3) != (char)0x0a; iLoc3-- );
		
						iLoc3++;
						for ( ; ! Character.isWhitespace(commandResultS.charAt(iLoc3)); iLoc3++ );
						for ( ; Character.isWhitespace(commandResultS.charAt(iLoc3)); iLoc3++ );
						iStart = iLoc3;
						for ( ; ! Character.isWhitespace(commandResultS.charAt(iLoc3)); iLoc3++ );
						pidS = commandResultS.substring(iStart, iLoc3);
					}
					else
					{
						// Package name not found, put up Dialog..
						JOptionPane.showMessageDialog(
							frame,
							"Package name not found.\nPlease start your application.",
							"Package name",
							JOptionPane.WARNING_MESSAGE);
						
						// Reset..
						buildMenuItem.setSelected(true);
		
						return;				
					}
				}
			}
			
			//System.out.println("pidS: '"+pidS+"'");
	
			sb = new StringBuffer();
			
			if ( iOS == LINUX_MAC )
			{
				sb.append("export PATH=${PATH}:");
				sb.append(androidSdkPathS);
				sb.append("/platform-tools");
				sb.append(";adb ");

				if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
				{
					sb.append("-s ");
					sb.append(sDeviceName);
					sb.append(" ");
				}

				sb.append("forward tcp:");
				sb.append(Constants.PORT_NUMBER);
				sb.append(" jdwp:");
				sb.append(pidS);
			}
			else
			{
				sb.append("SET PATH=");
				sb.append(androidSdkPathS);
				sb.append("/platform-tools");
				sb.append(";%PATH%");
				
				sb.append("&&adb ");

				if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
				{
					sb.append("-s ");
					sb.append(sDeviceName);
					sb.append(" ");
				}
				
				sb.append("forward ");
				sb.append("tcp:");
				sb.append(Constants.PORT_NUMBER);
				sb.append(" jdwp:");
				sb.append(pidS);
				sb.append("\n");
			}

			//System.out.println("sb: '"+sb.toString()+"'");
			internalCommandS = sb.toString();
			commandBgThread = new CommandBgThread();
			commandBgThread.start();
			
			bAdbThreadFinished = true;
		}
	}	//}}}

	//{{{	UpdateNodesBgThread
	class UpdateNodesBgThread extends Thread
	{
		public void run()
		{
			//System.out.println("\nUpdateNodesBgThread run()");
			//DefaultMutableTreeNode root = null;
			DefaultMutableTreeNode node = null;
			//DefaultTreeModel model = null;
			Object nodeObject;
			NodeFVInfo nodeFVInfo;
			VariableInfo variableInfo;
			String sName = "";
			String sTargetId = "";
			String sValueAsString = "";
			String sDisplayClassName = "";
			String sT = "";
			String sReq;
			int iLoc3;
			int iLoc4;
			int iLoc6;
			boolean bIsClass;

			if ( variableJTree != null )	
			{
/*
				if ( topNode == null )
					System.out.println("topNode null");
				else
					System.out.println("topNode not null");
/**/

				node = topNode;
				
				while ( true )
				{
					//System.out.println("~~TOP~~");
					if ( node == null )
					{
						//System.out.println("node null, breaking");
						break;
					}

					try
					{					
/*						
						if ( node == null )
							System.out.println("node null");
						else
							System.out.println("node not null");
/**/						
						nodeObject = (Object)node.getUserObject();

/*						
						if ( nodeObject == null )
							System.out.println("nodeObject null");
						else
							System.out.println("nodeObject not null");
/**/
						if ( nodeObject != null )
						{
							nodeFVInfo = (NodeFVInfo)nodeObject;
							sName = nodeFVInfo.sName;
							bIsClass = nodeFVInfo.bIsClass;
							sTargetId = nodeFVInfo.sTargetId;
							sValueAsString = nodeFVInfo.sValueAsString;
							sDisplayClassName = nodeFVInfo.sDisplayClassName;
							
							
/*							
							if ( sName == null )
								System.out.println("sName null");
							else
								System.out.println("sName: '"+sName+"'");
/**/
/*							
							if ( sDisplayClassName == null )
								System.out.println("sDisplayClassName null");
							else
								System.out.println("sDisplayClassName: '"+sDisplayClassName+"'");
/**/

							//System.out.println("bIsClass: "+bIsClass);
/*							
							if ( sTargetId == null )
								System.out.println("sTargetId null");
							else
								System.out.println("sTargetId: '"+sTargetId+"'");
/**/							
							// Note:
							// For variables we get the values of in "PauseBreakpoint"
							// the targetId will be null, so don't try to get those..
							
							//if ( bIsClass == false )
							if ( (bIsClass == false) && (sTargetId != null)  )
							{
								try
								{
									//
									// evaluate
									//
									
									requestLatch = new CountDownLatch(1);
											
									ParamAr = new ArrayList();
									ParamAr.add((String)Utils.filterObject(sIsolateId));
									ParamAr.add((String)Utils.filterObject(sTargetId));	// targetId, like: 'objects\/41'
									ParamAr.add((String)sName);	// expression, like: 'aspectRatio'
									ParamAr.add((String)"true");		// disableBreakpoints 
									
									String[] evaluateThreeMsg = {
										"method", "evaluate",
										"params",
										"isolateId", "[]",
										"targetId", "[]",
										"expression", "[]",
										"disableBreakpoints ", "[d",
										"}"};
							
									sReq = ConstructMessage(evaluateThreeMsg);
									websocket = webSocketObject.getWebSocket();
									websocket.send(sReq);
							
									try
									{
										requestLatch.await();
									}
									catch (InterruptedException ie)
									{
									}

								}
								catch (WebSocketException wse)
								{
									wse.printStackTrace();
								}

								// Check for error..
								iLoc6 = g_sMessage.indexOf(ERROR_STRING);
								if ( iLoc6 != -1 )
								{
									// Error..
									//System.out.println("*** Evaluate response error ***");
								}
								else
								{
									// Get value..						
									iLoc3 = g_sMessage.indexOf("valueAsString");
									if ( iLoc3 != -1 )
									{
										iLoc4 = g_sMessage.indexOf((int)0x22, iLoc3 + 16);
										if ( iLoc4 != -1 )
										{
											sT = g_sMessage.substring(iLoc3 + 16, iLoc4);
											//System.out.println("(sValueAsString): '"+sT+"'");

											// Update if changed..											
											if ( ! sValueAsString.equals(sT) )
											{
												nodeFVInfo.sValueAsString = sT;
												node.setUserObject(nodeFVInfo);
											}
											
										}
									}
								}
							}
							else
							{
								// Try to update from PauseBreakpoint..
								variableInfo = (VariableInfo)VariableInfoLHm.get((String)sName);
								//System.out.println("variableInfo.sName: '"+variableInfo.sName+"'");
								//System.out.println("variableInfo.sValueAsString: '"+variableInfo.sValueAsString+"'");
								//System.out.println("variableInfo.sDisplayClassName: '"+variableInfo.sDisplayClassName+"'");
								
								nodeObject = (Object)node.getUserObject();
								if ( nodeObject != null )
								{
									nodeFVInfo = (NodeFVInfo)nodeObject;

									if ( (variableInfo.sDisplayClassName != null) && (variableInfo.sDisplayClassName.length() > 0)
										&& (! variableInfo.sDisplayClassName.equals("null")) )
									{
										nodeFVInfo.sValueAsString = variableInfo.sDisplayClassName;
										//System.out.println("(if)nodeFVInfo.sValueAsString: '"+nodeFVInfo.sValueAsString+"'");
									}
									else if ( (variableInfo.sValueAsString != null) && (variableInfo.sValueAsString.length() > 0)
										&& (! variableInfo.sValueAsString.equals("null")) )
									{
										nodeFVInfo.sValueAsString = variableInfo.sValueAsString;
										//System.out.println("(else)nodeFVInfo.sValueAsString: '"+nodeFVInfo.sValueAsString+"'");
									}
									
									node.setUserObject(nodeFVInfo);
								}
							}
						}
					}
					catch (NoSuchElementException nsee)
					{
						System.out.println("NoSuchElementException");
						break;
					}
					catch (EmptyStackException ese)
					{
						System.out.println("EmptyStackException");
						break;
					}
					
					// Next node..
					if ( node.isLeaf() )
					{
						// Node has no children..
						node = node.getNextLeaf();
					}
					else
					{
						// Node has children..
						node = node.getNextSibling();
					}
				}	// End while..
				
				DefaultTreeModel model = (DefaultTreeModel)variableJTree.getModel();
				model.reload();
			}

			//System.out.println("Exiting UpdateNodesBgThread");
		}
	}	//}}}

	//{{{	ExpandBgThread
	class ExpandBgThread extends Thread
	{
		public void run()
		{
			//System.out.println("\nExpandBgThread run()");
			String sSelectedName = "";
			String sSelectedObjectId = "";
			String sSelectedClassId = "";
			String sURI;
			String sKind = "";
			String sPropertyName;
			String sReq;
			String sName = "";
			String sClassId = "";
			String sObjectId = "";
			String sClassName = "";
			String sGetId = "";
			String sType = "";
			String sValueAsString = "";
			String sDisplayClassName = "";
			String sLength;
			String sExpression = "";
			String sStackObjectId = "";
			String sTypeName = "";
			String sTarget = "";
			String sVmType;
			String sT;
			String sKey;
			StringBuffer sB;
			
			boolean bIsSystemClass = false;
			boolean bPastFields = false;
			boolean bElements = false;
			boolean bIsList;
			boolean bIsClass = false;
			boolean bIsObjectList = false;
			boolean bBoundFieldFinished = false;
			boolean bFunctionFinished = false;
			boolean bFromPropertyName;
			
			int iLoc2 = 0;
			int iLoc3 = 0;
			int iLoc4;
			int iLoc5;
			int iLoc6;
			int iLoc7 = 0;
			int iLoc8;
			int iLoc9;
			int iLoc10;
			int iLoc11;
			int iLoc12;
			int iFieldEnd = -1;
			int iNextBoundField = 0;
			int iNextFunction = 0;
			int iSize = 0;
			int iArrayIndex = 0;
			int iExpandRow;
			int iFunctionsEnd = 0;
			
			LinkedHashMap ExpandedNodeLHm = new LinkedHashMap();
			Set set;
			Iterator iterator;
			
			NodeFVInfo nodeFVInfo;
			NodeFVInfo tNodeFVInfo = null;
			NodeFVInfo newNodeFVInfo;
			Object nodeObject;
			DefaultMutableTreeNode childNode;
			

			if ( currentNode != null )
			{
				nodeObject = (Object)currentNode.getUserObject();
				nodeFVInfo = (NodeFVInfo)nodeObject;
				
				sSelectedName = nodeFVInfo.sName;
				//System.out.println("sSelectedName: '"+sSelectedName+"'");
				sSelectedObjectId = nodeFVInfo.sObjectId;
				//System.out.println("sSelectedObjectId: '"+sSelectedObjectId+"'");
				sSelectedClassId = nodeFVInfo.sClassId;
				//System.out.println("sSelectedClassId: '"+sSelectedClassId+"'");
			}
			
			sGetId = sSelectedClassId;

			for ( int iIndex = 0; iIndex <= 1; iIndex++ )
			{
				//System.out.println("~~TOP~~  iIndex: "+iIndex);
				try
				{	
					//
					// getObject
					//
					
					requestLatch = new CountDownLatch(1);
		
					ParamAr = new ArrayList();
					ParamAr.add((String)Utils.filterObject(sIsolateId));
					ParamAr.add((String)Utils.filterObject(sGetId));
			
					String[] getObjectDMsg = {
						"method", "getObject",
						"params",
						"isolateId", "[]",
						"objectId", "[]",
						"}"};
			
					sReq = ConstructMessage(getObjectDMsg);
					websocket = webSocketObject.getWebSocket();
					websocket.send(sReq);
				}
				catch (WebSocketException wse)
				{
					wse.printStackTrace();
				}
				
				try
				{
					requestLatch.await();
				}
				catch (InterruptedException ie)
				{
				}


				if ( iIndex == 0 )
				{
					iLoc2 = g_sMessage.indexOf(URI_STRING);
					if ( iLoc2 != -1 )
					{
						iLoc3 = g_sMessage.indexOf((int)0x22, iLoc2 + 7);
						if ( iLoc3 != -1 )
						{
							sURI = g_sMessage.substring(iLoc2 + 7, iLoc3);
							//System.out.println("\nsURI: '"+sURI+"'");
							if ( sURI.startsWith("dart:") )
							{
								bIsSystemClass = true;
							}
						}
					}
				}

				iLoc2 = g_sMessage.indexOf(FUNCTIONS_STRING);
				if ( iLoc2 != -1 )
				{
					iFunctionsEnd = g_sMessage.indexOf("]", iLoc2);					
				}

				// Skip @Field..				
				iLoc2 = g_sMessage.indexOf(FIELDS_STRING);
				if ( iLoc2 != -1 )
				{
					iFieldEnd = g_sMessage.indexOf("]", iLoc2);	
					if ( sGetId.startsWith("classes") )
					{
						if ( iFieldEnd != -1 )
						{
							iLoc2 = iFieldEnd;
						}
					}
				}
				
				bPastFields = false;
				bBoundFieldFinished = false;

				while ( true )
				{
					//System.out.println("--TOP--");
					
					if ( sGetId.startsWith("object") )
					{
						// Adjust to end..
						//System.out.println("bBoundFieldFinished: "+bBoundFieldFinished);
						if ( bBoundFieldFinished )
						{
							iLoc2 = iFieldEnd;
						}
					}
					else if ( sGetId.startsWith("classes") )
					{
						// Adjust to end..
						//System.out.println("bBoundFieldFinished: "+bBoundFieldFinished);
						if ( bFunctionFinished )
						{
							iLoc2 = iFunctionsEnd;
						}
					}
					
					
					if ( sGetId.startsWith("object") )
					{
						iLoc3 = g_sMessage.indexOf("BoundField", iLoc2);
						if ( iLoc3 != -1 )
						{
							;
						}
						iLoc3 = g_sMessage.indexOf("Instance", iLoc2);
						if ( iLoc3 != -1 )
						{
							;
						}
						else
						{
							break;
						}
					}
					
					iLoc2 = g_sMessage.indexOf(TYPE_STRING, iLoc2);
					if ( iLoc2 > iFunctionsEnd )
					{
						break;
					}
					
					if ( iLoc2 != -1 )
					{
						iLoc8 = g_sMessage.indexOf((int)0x22, iLoc2 + 8);
						if ( iLoc8 != -1 )
						{
							sType = g_sMessage.substring(iLoc2 + 8, iLoc8);
							//System.out.println("sType: '"+sType+"'");
						}
					}
					else
					{
						break;
					}
					
					if ( iLoc2 > iFieldEnd )
					{
						//System.out.println("bPastFields <- true");
						bPastFields = true;
					}

					if ( (sType.equals("@Function")) && (bPastFields) )
					{
						
						// {"type":"@Function","fixedId":true,"id":"classes
						// \/1039\/functions\/get%3Aalpha","name":"alpha","_vmName":"get:alpha","owner":{"t
						// ype":"@Class","fixedId":true,"id":"classes\/1039","name":"Color"},"_kind":"Gette
						// rFunction","static":false,"const":false,"_intrinsic":false,"_native":false},

						// Find next one..
						iNextFunction = g_sMessage.indexOf("@Function", iLoc2 + 12);
						if ( iNextFunction == -1 )
						{
							// Not found..
							bFunctionFinished = true;
						}

						// Check if we should ignore..						
						iLoc7 = g_sMessage.indexOf("get:", iLoc2);
						if ( iLoc7 != -1 )
						{
							iLoc8 = g_sMessage.indexOf((int)0x22, iLoc7);
							if ( iLoc8 != -1 )
							{
								sT = g_sMessage.substring(iLoc7, iLoc8);
								iLoc11 = sT.indexOf("@");
								if ( iLoc11 != -1 )
								{
									// Find next..
									if ( iNextFunction != -1 )
									{
										// There is a next Function..
										iLoc2 = iNextFunction - 10;
									}
									
									continue;
								}
							}
						}
								
						iLoc6 = g_sMessage.indexOf(NAME_STRING, iLoc2);
						if ( iLoc6 != -1 )
						{
							iLoc7 = g_sMessage.indexOf((int)0x22, iLoc6 + 8);
							if ( iLoc7 != -1 )
							{
								sName = g_sMessage.substring(iLoc6 + 8, iLoc7);
								//System.out.println("(@Function)sName: '"+sName+"'");
							}
						}

						iLoc9 = g_sMessage.indexOf("_kind", iLoc6);
						if ( iLoc9 != -1 )
						{
							iLoc5 = g_sMessage.indexOf((int)0x22, iLoc9 + 8);
							if ( iLoc5 != -1 )
							{
								sKind = g_sMessage.substring(iLoc9 + 8, iLoc5);
								if ( sKind.equals("GetterFunction") )
								{
									//System.out.println("(@Function)sName: '"+sName+"'");
									//System.out.println("sKind: '"+sKind+"'");

									tNodeFVInfo = new NodeFVInfo(sName);
									tNodeFVInfo.sPropertyName = sName;
									//System.out.println("(@Function put())sName: '"+sName+"'");
									ExpandedNodeLHm.put((String)sName, (NodeFVInfo)tNodeFVInfo);

								}
							}
						}
						
						// Find next..
						if ( iNextFunction != -1 )
						{
							// There is a next Function..
							iLoc2 = iNextFunction - 10;
						}

					}
					//else if ( (sType.equals("BoundField")) && (bPastFields == false) )
					else if ( (sType.equals("BoundField")) )
					{
						// Find next one..
						iNextBoundField = g_sMessage.indexOf("BoundField", iLoc2 + 19);
						if ( iNextBoundField == -1 )
						{
							// Not found..
							//System.out.println("No more BoundField");
							bBoundFieldFinished = true;
						}
						
						// "name":"center"
						iLoc6 = g_sMessage.indexOf(NAME_STRING, iLoc2);
						if ( iLoc6 != -1 )
						{
							iLoc7 = g_sMessage.indexOf((int)0x22, iLoc6 + 8);
							if ( iLoc7 != -1 )
							{
								sName = g_sMessage.substring(iLoc6 + 8, iLoc7);
								//System.out.println("(BoundField)sName: '"+sName+"'");
								tNodeFVInfo = new NodeFVInfo(sName);
							}
						}

						// Note:
						// In object pass, it often doesn't have 'typeClass'
						// Like: 'classes\/221'
						iLoc9 = g_sMessage.indexOf(TYPECLASS_STRING, iLoc6);	// Help locate the correct one..
						if ( iLoc9 != -1 )
						{
							iLoc10 = g_sMessage.indexOf("@Class", iLoc9);
							if ( iLoc10 != -1 )
							{
								iLoc4 = g_sMessage.indexOf("classes", iLoc10);
								if ( iLoc4 != -1 )
								{
									iLoc5 = g_sMessage.indexOf((int)0x22, iLoc4);
									if ( iLoc5 != -1 )
									{
										sClassId = g_sMessage.substring(iLoc4, iLoc5);
										//System.out.println("sClassId: '"+sClassId+"'");
										tNodeFVInfo.sClassId = sClassId;
									}
								}
							}
						}

						// "kind":"List"
						iLoc4 = g_sMessage.indexOf(KIND_STRING, iLoc9);
						if ( iLoc4 != -1 )
						{
							iLoc5 = g_sMessage.indexOf((int)0x22, iLoc4 + 8);
							if ( iLoc5 != -1 )
							{
								sKind = g_sMessage.substring(iLoc4 + 8, iLoc5);
								//System.out.println("sKind: '"+sKind+"'");
							}

							if ( sKind.equals("List") )	
							{
								bIsList = true;
								
								// Get "length"..
								iLoc12 = g_sMessage.indexOf(LENGTH_STRING, iLoc4);
								if ( iLoc12 != -1 )
								{
									iLoc5 = g_sMessage.indexOf("}", iLoc12 + 9);
									if ( iLoc5 != -1 )
									{
										sLength = g_sMessage.substring(iLoc12 + 9, iLoc5);
										sLength = sLength.trim();
										//System.out.println("sLength: '"+sLength+"'");
										
										// Construct List display info..
										sB = new StringBuffer();
										sB.append("List (");
										sB.append(sLength);
										sB.append(" item");
										if ( sLength.equals("1") )
											;
										else
											sB.append("s");
										
										sB.append(")");
										sDisplayClassName = sB.toString();
										//System.out.println("sDisplayClassName: '"+sDisplayClassName+"'");
										tNodeFVInfo.sDisplayClassName = sDisplayClassName;
									}
								}
							}
						}

						// Like: 'objects\/63'
						// Note:
						// Not all have 'PlainInstance'
						// so use "id"..
						iLoc9 = g_sMessage.indexOf(ID_STRING, iLoc4);
						if ( iLoc9 != -1 )
						{
							iLoc10 = g_sMessage.indexOf("objects", iLoc9);
							if ( iLoc10 != -1 )
							{
								iLoc11 = g_sMessage.indexOf((int)0x22, iLoc10);
								if ( iLoc11 != -1 )
								{
									sObjectId = g_sMessage.substring(iLoc10, iLoc11);
									//System.out.println("sObjectId: '"+sObjectId+"'");
									tNodeFVInfo.sObjectId = sObjectId;
								}
							}
						}

						// Note:
						// This works for most, but not all..							
						// Get Class name..
						iLoc11 = g_sMessage.indexOf(TYPECLASS_STRING, iLoc6);
						if ( iLoc11 != -1 )
						{
							iLoc12 = g_sMessage.indexOf(NAME_STRING, iLoc11);
							if ( iLoc12 != -1 )
							{
								iLoc7 = g_sMessage.indexOf((int)0x22, iLoc12 + 8);
								if ( iLoc7 != -1 )
								{
									sClassName = g_sMessage.substring(iLoc12 + 8, iLoc7);
									//System.out.println("sClassName: '"+sClassName+"'");
									tNodeFVInfo.sClassName = sClassName;
								}
							}
						}

						// Class:		"@Instance","class"
						// Non Class: 	"@Instance","_vmType"
						iLoc8 = g_sMessage.indexOf(VALUE_STRING, iLoc6);	// Help locate..
						if ( iLoc8 != -1 )
						{
							iLoc10 = g_sMessage.indexOf("@Instance", iLoc8);
							if ( iLoc10 != -1 )
							{
								iLoc11 = g_sMessage.indexOf((int)0x22, iLoc10 + 12);
								if ( iLoc11 != -1 )
								{
									sT = g_sMessage.substring(iLoc10 + 12, iLoc11);
									//System.out.println("(_vmType): '"+sT+"'");
									if ( sT.equals("_vmType") )
										;
									else
									{
										//System.out.println("tNodeFVInfo.bIsClass <- true");
										tNodeFVInfo.bIsClass = true;
									}
								}
							}
						}
						
						// Like: '"valueAsString":"6600233167816000"'
						iLoc8 = g_sMessage.indexOf(VALUE_AS_STRING_STRING, iLoc6);
						if ( iLoc8 != -1 )
						{
							//System.out.println("Found valueAsString");
							// Note:
							// if there is no "valueAsString"
							// we need to prevent it from finding the
							// wrong one..
							
							//System.out.println("iNextBoundField: "+iNextBoundField);
							//System.out.println("iLoc8: "+iLoc8);
							if ( (iNextBoundField == -1) || (iLoc8 < iNextBoundField) )
							{
								// Note:
								// If it has "valueAsString"
								// it's not a Class..
								
								// Note:
								// In some cases it IS a Class
								// but it can also have a "valueAsString"
								// usually "null"..
								iLoc7 = g_sMessage.indexOf((int)0x22, iLoc8 + 17);
								if ( iLoc7 != -1 )
								{
									sValueAsString = g_sMessage.substring(iLoc8 + 17, iLoc7);
									//System.out.println("sValueAsString: '"+sValueAsString+"'");
									tNodeFVInfo.sValueAsString = sValueAsString;
								}
							}
						}
						
						//System.out.println("(BoundField put())sName: '"+sName+"'");
						ExpandedNodeLHm.put((String)sName, (NodeFVInfo)tNodeFVInfo);
						
						// Find end..
						if ( iNextBoundField != -1 )
						{
							// There is a next BoundField..
							iLoc2 = iNextBoundField - 10;
						}
					}
					else if ( (sType.equals("@Instance")) )
					{
						// List
						
						// {"type":"@Instance","class":{"type":"@Class","fixedId":true,"id":"classes\/3887",
						// "name":"PlanetWidget"},"kind":"PlainInstance","id":"objects\/300"},

						// Construct array index..
						sB = new StringBuffer();
						sB.append("[");
						sB.append(iArrayIndex);
						sB.append("]");
						iArrayIndex++;
						
						tNodeFVInfo = new NodeFVInfo(sB.toString());
							
						// Process List..
						iLoc7 = g_sMessage.indexOf("classes", iLoc2);		// <- Next pointer..
						if ( iLoc7 != -1 )
						{
							iLoc5 = g_sMessage.indexOf((int)0x22, iLoc7);
							if ( iLoc5 != -1 )
							{
								sClassId = g_sMessage.substring(iLoc7, iLoc5);
								//System.out.println("(@Instance)sClassId: '"+sClassId+"'");
								tNodeFVInfo.sClassId = sClassId;
							}
						}

						// Note:
						// We want to search for "valueAsString"
						// If we searched for "objects", next, we might get
						// "objects\/int-14"					
						iLoc4 = g_sMessage.indexOf(VALUE_AS_STRING_STRING, iLoc2);
						if ( iLoc4 != -1 )
						{
							iLoc5 = g_sMessage.indexOf((int)0x22, iLoc4 + 17);
							if ( iLoc5 != -1 )
							{
								sValueAsString = g_sMessage.substring(iLoc4 + 17, iLoc5);
								//System.out.println("sValueAsString: '"+sValueAsString+"'");
								tNodeFVInfo.sValueAsString = sValueAsString;
							}
						}
						else
						{
							bIsObjectList = true;
							
							// "name":"PlanetWidget"
							iLoc4 = g_sMessage.indexOf(NAME_STRING, iLoc2);
							if ( iLoc4 != -1 )
							{
								iLoc5 = g_sMessage.indexOf((int)0x22, iLoc4 + 8);
								if ( iLoc5 != -1 )
								{
									sClassName = g_sMessage.substring(iLoc4 + 8, iLoc5);
									//System.out.println("sClassName: '"+sClassName+"'");
									tNodeFVInfo.sClassName = sClassName;
								}
							}
							
							iLoc4 = g_sMessage.indexOf("objects", iLoc4);
							if ( iLoc4 != -1 )
							{
								iLoc5 = g_sMessage.indexOf((int)0x22, iLoc4);
								if ( iLoc5 != -1 )
								{
									sObjectId = g_sMessage.substring(iLoc4, iLoc5);
									//System.out.println("sObjectId: '"+sObjectId+"'");
									tNodeFVInfo.sObjectId = sObjectId;
								}
							}
						}
						
						//System.out.println("(@Instance put())sB: '"+sB.toString()+"'");
						ExpandedNodeLHm.put((String)sB.toString(), (NodeFVInfo)tNodeFVInfo);
						
						iLoc2 = iLoc4;
						
					}
				}	// End while..
				
				if ( sGetId.startsWith("classes") )
					sGetId = sSelectedObjectId;
				
			}	// End for..

			//System.out.println("\nDropped out");
			
			set = ExpandedNodeLHm.keySet();
			iterator = set.iterator();
			
			while ( true )
			{
				//System.out.println("\n**TOP**");
				if ( iterator.hasNext() )
				{
					sKey = (String)iterator.next();
					//System.out.println("sKey: '"+sKey+"'");
					
					nodeFVInfo = (NodeFVInfo)ExpandedNodeLHm.get((String)sKey);

					//System.out.println("\nnodeFVInfo.sName: '"+nodeFVInfo.sName+"'");
					//System.out.println("nodeFVInfo.sPropertyName: '"+nodeFVInfo.sPropertyName+"'");
					//System.out.println("nodeFVInfo.sClassName: '"+nodeFVInfo.sClassName+"'");
					//System.out.println("nodeFVInfo.sObjectId: '"+nodeFVInfo.sObjectId+"'");
					//System.out.println("nodeFVInfo.sClassId: '"+nodeFVInfo.sClassId+"'");
					//System.out.println("nodeFVInfo.sValueAsString: '"+nodeFVInfo.sValueAsString+"'");
					//System.out.println("nodeFVInfo.sDisplayClassName: '"+nodeFVInfo.sDisplayClassName+"'");
					//System.out.println("nodeFVInfo.bIsClass: "+nodeFVInfo.bIsClass);

					sValueAsString = "";
					bFromPropertyName = false;
					
					// Process 'sPropertyName'..					
					if ( (nodeFVInfo.sPropertyName != null) && (nodeFVInfo.sPropertyName.length() > 0) )
					{
				
						sExpression = nodeFVInfo.sName;

/*
						if ( sExpression == null )
							System.out.println("sExpression null");
						else
							System.out.println("sExpression: '"+sExpression+"'");
/**/

						sObjectId = sSelectedObjectId;

/*						
						if ( sObjectId == null )
							System.out.println("sObjectId null");
						else
							System.out.println("sObjectId: '"+sObjectId+"'");
/**/					
		
		
		
						try
						{				
							//
							// evaluate
							//
							
							requestLatch = new CountDownLatch(1);
									
							ParamAr = new ArrayList();
							ParamAr.add((String)Utils.filterObject(sIsolateId));
							ParamAr.add((String)Utils.filterObject(sObjectId));	// targetId, like: 'objects\/41'
							ParamAr.add((String)sExpression);	// expression, like: 'aspectRatio'
							ParamAr.add((String)"true");		// disableBreakpoints 
							
							String[] evaluateMsg = {
								"method", "evaluate",
								"params",
								"isolateId", "[]",
								"targetId", "[]",
								"expression", "[]",
								"disableBreakpoints ", "[d",
								"}"};
					
							sReq = ConstructMessage(evaluateMsg);
							websocket = webSocketObject.getWebSocket();
							websocket.send(sReq);
		
						}
						catch (WebSocketException wse)
						{
							wse.printStackTrace();
						}
		
						try
						{
							requestLatch.await();
						}
						catch (InterruptedException ie)
						{
						}
		
						// Check for error..
						iLoc6 = g_sMessage.indexOf(ERROR_STRING);
						if ( iLoc6 != -1 )
						{
							// Error..
							//System.out.println("*** Evaluate response error ***");
							iArrayIndex++;
						}
						else
						{
							bFromPropertyName = true;
							
							// {"jsonrpc":"2.0", "result":{"type":"@Instance","class":{"type":"@Class","fixedId":true,
							// "id":"classes\/222","name":"Duration"},"kind":"PlainInstance","id":"objects\/127"},"id":"497"}
							
							// {"jsonrpc":"2.0", "result":{"type":"@Instance","_vmType":"
							// Smi","class":{"type":"@Class","fixedId":true,"id":"classes\/48","name":"_Smi",
							// "_vmName":"_Smi@0150898"},"kind":"Int","fixedId":true,"id":"objects\/int-2179",
							// "valueAsString":"2179"},"id":"498"}
							
							//sValueAsString = "";
							bIsClass = false;
		
							// Check for 'class' / '_vmType'
							iLoc3 = g_sMessage.indexOf("@Instance");
							if ( iLoc3 != -1 )
							{
								iLoc4 = g_sMessage.indexOf((int)0x22, iLoc3 + 12);
								if ( iLoc4 != -1 )
								{
									sType = g_sMessage.substring(iLoc3 + 12, iLoc4);
									//System.out.println("sType: '"+sType+"'");
									if ( sType.equals("class") )
									{
										bIsClass = true;
										
										// Get type/name..
										iLoc5 = g_sMessage.indexOf(NAME_STRING);
										if ( iLoc5 != -1 )
										{
											iLoc6 = g_sMessage.indexOf((int)0x22, iLoc5 + 8);
											if ( iLoc6 != -1 )
											{
												// Like:  'Duration'
												sTypeName = g_sMessage.substring(iLoc5 + 8, iLoc6);
												//System.out.println("(PropertyName)sTypeName: '"+sTypeName+"'");
											}
										}
									}
									else
									{
										bIsClass = false;
									}
								}
								
								//System.out.println("(PropertyName)bIsClass: "+bIsClass);
							}
							
							// Get value..	
							iLoc5 = g_sMessage.indexOf(KIND_STRING, iLoc3);		// Help locate '}'..
							if ( iLoc5 != -1 )
							{
								iLoc6 = g_sMessage.indexOf("}", iLoc5);
								if ( iLoc6 != -1 )
								{
									iLoc3 = g_sMessage.indexOf("valueAsString");
									if ( iLoc3 != -1 )
									{
										if ( iLoc3 < iLoc6 )
										{
											iLoc4 = g_sMessage.indexOf((int)0x22, iLoc3 + 16);
											if ( iLoc4 != -1 )
											{
												sValueAsString = g_sMessage.substring(iLoc3 + 16, iLoc4);
												//System.out.println("(PropertyName)sValueAsString: '"+sValueAsString+"'");
											}
										}
									}
								}
							}
							
							iLoc7 = g_sMessage.indexOf("classes", iLoc3);
							if ( iLoc7 != -1 )
							{
								iLoc6 = g_sMessage.indexOf((int)0x22, iLoc7);
								if ( iLoc6 != -1 )
								{
									sClassId = g_sMessage.substring(iLoc7, iLoc6);
									//System.out.println("(PropertyName)sClassId: '"+sClassId+"'");
								}
							}
							
							iLoc5 = g_sMessage.indexOf("objects", iLoc5);
							if ( iLoc5 != -1 )
							{
								iLoc6 = g_sMessage.indexOf((int)0x22, iLoc5);
								if ( iLoc6 != -1 )
								{
									sObjectId = g_sMessage.substring(iLoc5, iLoc6);
									//System.out.println("(PropertyName)sObjectId: '"+sObjectId+"'");
								}
							}
						}
					}
					
					if ( currentNode != null )
					{
						//System.out.println("--Create--");
						//System.out.println("sGetId: '"+sGetId+"'");
						if ( sGetId.startsWith("objects") )
						{
							// These are from BoundField and @Instance..
							sExpression = nodeFVInfo.sName;
							
							if ( bFromPropertyName )
							{
								;
							}
							else
							{
								bIsClass = nodeFVInfo.bIsClass;
								sValueAsString = nodeFVInfo.sValueAsString;
								sTypeName = nodeFVInfo.sClassName;
								sObjectId = nodeFVInfo.sObjectId;
								sClassId = nodeFVInfo.sClassId;
							}
							
							//System.out.println("(Final)sValueAsString: '"+sValueAsString+"'");
							
							sDisplayClassName = nodeFVInfo.sDisplayClassName;
	
						}
						
						//System.out.println("\nsExpression: '"+sExpression+"'");
						//System.out.println("sObjectId: '"+sObjectId+"'");
						//System.out.println("sClassId: '"+sClassId+"'");
						//System.out.println("sValueAsString: '"+sValueAsString+"'");
						//System.out.println("sClassName: '"+sClassName+"'");
						//System.out.println("(sClassName)sTypeName: '"+sTypeName+"'");
						//System.out.println("sDisplayClassName: '"+sDisplayClassName+"'");
						//System.out.println("sType: '"+sType+"'");
						//System.out.println("bIsClass: "+bIsClass);
						//System.out.println("sObjectId: '"+sObjectId+"'");
						//System.out.println("sObjectId: '"+sObjectId+"'");
						//System.out.println("sTypeName: '"+sTypeName+"'");
						//System.out.println("\n");
						
						newNodeFVInfo = new NodeFVInfo(sExpression);
						newNodeFVInfo.sTargetId = sTarget;
						newNodeFVInfo.sObjectId = sObjectId;
						newNodeFVInfo.sClassId = sClassId;
	
						//System.out.println("bIsClass: "+bIsClass);	
						//System.out.println("bIsObjectList: "+bIsObjectList);
						//if ( bIsClass )
						if ( bIsClass || bIsObjectList )
						{
							newNodeFVInfo.bIsClass = true;

							// Note:
							// Even if it's a Class
							// it can sometimes have a valid "valueAsString"
							// of "null"..
/*							
							if ( sValueAsString == null )
								System.out.println("sValueAsString null");
							else
							{
								System.out.println("sValueAsString.length(): "+sValueAsString.length());
								System.out.println("sValueAsString: '"+sValueAsString+"'");
							}
/**/							
							if ( (sValueAsString != null) && (sValueAsString.length() > 0) )
								newNodeFVInfo.sValueAsString = sValueAsString;
							else
								newNodeFVInfo.sValueAsString = sTypeName;
							
							//System.out.println("newNodeFVInfo.sValueAsString: '"+newNodeFVInfo.sValueAsString+"'");
							
							newNodeFVInfo.sClassName = sTypeName;
						}
						else
						{
							newNodeFVInfo.bIsClass = false;
/*							
							if ( sDisplayClassName == null )
								System.out.println("sDisplayClassName null");
							else
								System.out.println("sDisplayClassName: '"+sDisplayClassName+"'");
/**/	
	
/*
							if ( sValueAsString == null )
								System.out.println("sValueAsString null");
							else
								System.out.println("sValueAsString: '"+sValueAsString+"'");
/**/								
	
							if ( (sDisplayClassName != null) && (sDisplayClassName.length() > 0) &&
									(! sDisplayClassName.equals("null")) )
							{
								newNodeFVInfo.sValueAsString = sDisplayClassName;
							}
							else if ( (sValueAsString != null) && (sValueAsString.length() > 0) )
							{
								newNodeFVInfo.sValueAsString = sValueAsString;
							}
							else
							{
								// Note:
								// This is the case where it wouldn't
								// have a value..
								newNodeFVInfo.sValueAsString = sTypeName;
							}
	
						}
	
						//System.out.println("Final ----------------------------");
						//System.out.println("newNodeFVInfo.sName: '"+newNodeFVInfo.sName+"'");
						//System.out.println("newNodeFVInfo.sClassName: '"+newNodeFVInfo.sClassName+"'");
						//System.out.println("nodeFVInfo.sClassId: '"+nodeFVInfo.sClassId+"'");
						//System.out.println("newNodeFVInfo.sObjectId: '"+newNodeFVInfo.sObjectId+"'");
						//System.out.println("nodeFVInfo.sTargetId: '"+nodeFVInfo.sTargetId+"'");
						//System.out.println("newNodeFVInfo.sValueAsString: '"+newNodeFVInfo.sValueAsString+"'");
						//System.out.println("nodeFVInfo.bIsClass: "+nodeFVInfo.bIsClass);
/**/
	
						childNode = new DefaultMutableTreeNode(newNodeFVInfo);
						currentNode.add(childNode);
					}
				}
				else
					break;
				
			}	// End while..

				
			//
			// Expand the row..
			//
			
			TreePath treePath = variableJTree.getSelectionPath();
			iExpandRow = variableJTree.getRowForPath(treePath);
			
			//System.out.println("iExpandRow: "+iExpandRow);
			variableJTree.expandRow(iExpandRow);	// Zero based..
			
			//System.out.println("Exiting ExpandBgThread");
		}
	}	//}}}

	//{{{	UpdateVariableJTreeBgThread
	class UpdateVariableJTreeBgThread extends Thread
	{
		public void run()
		{
			//System.out.println("\n--------------------------------");
			//System.out.println("UpdateVariableJTreeBgThread run()");
			
			// Needs: nodeObject
			String sT;
			String sReq;
			String sClass = "";
			String sClassId = "";
			String sName = "";
			String sClassName = "";
			String sClassObjectId = "";
			String sKind;
			String sPropertyName;
			String sValueAsString = "";
			String sObjectId = "";
			String sExpression = "";
			String sInfoName = "";
			String sFieldName = "";
			String sFieldClassId = "";
			String sType = "";
			String sTypeName = "";
			String sClassTargetId = "";
			String sIterKey = "";
			String sNextKey = "";
			String sKey = "";
			String sEvalTargetId = "";
			String sTargetName = "";
			String sLibNm = "";
			String sLib = "";
			String sSourceName = "";
			String sKindName = "";
			String sLength = "";
			String sDisplayClassName = "";

			boolean bProcess;
			boolean bCreateChildren = false;
			boolean bInExpansion = false;
			boolean bIsClass = false;
			boolean bDoGetStack = false;
			boolean bFound;
			boolean bFirst = true;
			boolean bMatched;
			
			int iLoc2 = 0;
			int iLoc3 = 0;
			int iLoc4;
			int iLoc5;
			int iLoc6;
			int iLoc7;
			int iLoc8;
			int iLoc9;
			int iLoc10;
			int iLoc11;
			int iLoc12;
			int iLoc14;
			int iArrayIndex = 0;
			int iRowCount = 0;
			int iLevelZeroIndex = 0;
			int iExpandRow = 0;
			int iEndFrame = 0;
			int iSave;
			int iCount;
			
			ArrayList tAr = null;
			VariableInfo variableInfo = null;
			Set set;
			Iterator iterator;
			
			
			NodeFVInfo nodeFVInfo = null;
			NodeFVInfo nodeFVInfoTwo;
			NodeFVInfo tNodeFVInfo;
			DefaultMutableTreeNode node = null;
			DefaultMutableTreeNode childNode;
			DefaultMutableTreeNode root = null;
			DefaultMutableTreeNode child = null;
			DefaultTreeModel model = null;
			Enumeration enumeration = null;
			Object nodeObject;
			Object rootObject;
			Object dataObject;
			TreeModel treeModel;
			
			// Like: 'libraries\/@477433113\/scripts\/package%3Aflutter%2Fsrc
			// %2Fwidgets%2Fvalue_listenable_builder.dart\/16f0547fbd8'
			if ( (sSelectedScriptId != null) && (sSelectedScriptId.length() > 0)
				&& (! sSelectedScriptId.equals("null")) )
			{
				//System.out.println("sSelectedScriptId: '"+sSelectedScriptId+"'");
				iLoc3 = sSelectedScriptId.lastIndexOf((int)0x5c);
				if ( iLoc3 != -1 )
				{
					iSave = iLoc3;
					for ( ; sSelectedScriptId.charAt(iLoc3) != 'F'; iLoc3-- );
					sSourceName = sSelectedScriptId.substring(iLoc3 + 1, iSave);
					//System.out.println("sSourceName: '"+sSourceName+"'");
					
				}
			}
			
			
/*			
			if ( variableJTree == null )
				System.out.println("variableJTree null");
			else
				System.out.println("variableJTree not null");
/**/			

/*
			if ( VariableInfoLHm == null )
				System.out.println("VariableInfoLHm null");
			else
				System.out.println("VariableInfoLHm.size(): "+VariableInfoLHm.size());
/**/

			if ( variableJTree != null )	
			{
				boolean bAddChild;
				model = (DefaultTreeModel)variableJTree.getModel();
				root = (DefaultMutableTreeNode)model.getRoot();
				
				//System.out.println("(root.getChildCount()): "+root.getChildCount());
/*				
				if ( root == null )
					System.out.println("root null");
				else
					System.out.println("root not null");
/**/

				tAr = new ArrayList();
				treeModel = variableJTree.getModel();
				rootObject = treeModel.getRoot();
		
				iCount = treeModel.getChildCount(rootObject);
				
				for ( int iJ = 0; iJ < iCount; iJ++ )
				{
					//System.out.println("--TOP-- iJ: "+iJ);
					nodeObject = treeModel.getChild(rootObject, iJ);
					dataObject = ((DefaultMutableTreeNode)nodeObject).getUserObject();
					tNodeFVInfo = (NodeFVInfo)dataObject;
					//System.out.println("tNodeFVInfo.sName: '"+tNodeFVInfo.sName+"'");
					tAr.add((NodeFVInfo)tNodeFVInfo);
				}
				
				
				enumeration = root.children();
				set = VariableInfoLHm.keySet();
				iterator = set.iterator();
				
				while ( true )
				{
					//System.out.println("--TOP--");
					if ( iterator.hasNext() )
					{
						sKey = (String)iterator.next();
						//System.out.println("(next())sKey: '"+sKey+"'");
						bAddChild = false;
						bMatched = false;
						
						try
						{
							node = (DefaultMutableTreeNode)enumeration.nextElement();
							
							if ( bFirst )
							{
								topNode = node;
/*								
								if ( topNode == null )
									System.out.println("topNode null");
								else
									System.out.println("topNode not null");
/**/								
								bFirst = false;
							}
							
							if ( (tAr != null) && (tAr.size() > 0) )
							{
								for ( int iZ = 0; iZ < tAr.size(); iZ++ )
								{
									tNodeFVInfo = (NodeFVInfo)tAr.get(iZ);
									//System.out.println("tNodeFVInfo.sName: '"+tNodeFVInfo.sName+"'");
									if ( sKey.equals(tNodeFVInfo.sName) )
									{
										//System.out.println("--MATCHED--");
										bMatched = true;
										break;
									}
								}
							}
							
							if ( bMatched )
							{
								continue;
							}
						}
						catch (NoSuchElementException nsee)
						{
							// No matching node, so add it..
							//System.out.println("NoSuchElementException");
						}
						
						if ( bMatched == false )
							bAddChild = true;

						//System.out.println("bAddChild: "+bAddChild);						
						if ( bAddChild )
						{
							//System.out.println("\n--- Add Child ---");
							variableInfo = (VariableInfo)VariableInfoLHm.get((String)sKey);
							//System.out.println("(get())sKey: '"+sKey+"'");
							
							//System.out.println("variableInfo.sName: '"+variableInfo.sName+"'");
							//System.out.println("variableInfo.sClassName: '"+variableInfo.sClassName+"'");
							//System.out.println("variableInfo.sDisplayClassName: '"+variableInfo.sDisplayClassName+"'");
							
							nodeFVInfo = new NodeFVInfo(variableInfo.sName);
							//System.out.println("variableInfo.sName: '"+variableInfo.sName+"'");
							nodeFVInfo.sClassName = variableInfo.sClassName;
							nodeFVInfo.sClassId = variableInfo.sClassId;
							nodeFVInfo.bIsClass = variableInfo.bIsClass;
							nodeFVInfo.sObjectId = variableInfo.sObjectId;

							// Note:
							// In the case of 'List'
							// it identifies it as "_vmType", and not a "Class"..

							//System.out.println("variableInfo.bIsClass: "+variableInfo.bIsClass);
							if ( variableInfo.bIsClass == false )
							{
								// Update non-class variable..
								sDisplayClassName = variableInfo.sDisplayClassName;
								sValueAsString = variableInfo.sValueAsString;
/*								
								if ( sDisplayClassName == null )
									System.out.println("sDisplayClassName null");
								else
									System.out.println("sDisplayClassName: '"+sDisplayClassName+"'");
/**/								
								if ( (sDisplayClassName != null) && (sDisplayClassName.length() > 0) &&
										(! sDisplayClassName.equals("null")) )
								{
									nodeFVInfo.sValueAsString = sDisplayClassName;
								}
								else if ( (sValueAsString != null) && (sValueAsString.length() > 0) &&
									(! sValueAsString.equals("null")) )
								{
									nodeFVInfo.sValueAsString = sValueAsString;
								}
							}
							else
							{
								// Class variable..
								// Signal that we have a new Class
								// and we should do a getStack..
								bDoGetStack = true;
							}
							
							//System.out.println("(Final)nodeFVInfo.sValueAsString: '"+nodeFVInfo.sValueAsString+"'");
							
							child = new DefaultMutableTreeNode(nodeFVInfo);
								
							((DefaultTreeModel)variableJTree.getModel()).
								insertNodeInto(
									child,		// newChild
									root,		// parent
									root.getChildCount());	// index
							
						}
					}
					else
					{
						//System.out.println("iterator breaking");
						break;
					}
					
				}	// End while..
				
				//System.out.println("Dropped out");
			}
			

			// Note:
			// If we have a new variable,
			// and it's a Class,
			// we should do a getStack..
			
			// Children already created..

			
			try
			{
				// We should only do this if a node is
				// expanded,
				// or if we have a new Class..
				
				// What we could do is have an ArrayList of
				// all the names we have, and after getStack runs
				// search for all the names and get the 'objects' for each
				// That way we should only have to call getStack once for everything..
				
				// All the class names are in the top 'vars' section,
				// and we just have to get the 'objects' for each..

				//
				// Get Property values
				//

				//System.out.println("bDoGetStack: "+bDoGetStack);
				if ( bDoGetStack )
				{
					//
					// getStack
					//
					
					bFirst = true;
					int iEnd = 0;
					
					requestLatch = new CountDownLatch(1);
							
					ParamAr = new ArrayList();
					ParamAr.add((String)Utils.filterObject(sIsolateId));
					
					String[] getStackMsg = {
						"method", "getStack",
						"params",
						"isolateId", "[]",
						"}"};
			
					sReq = ConstructMessage(getStackMsg);
					websocket = webSocketObject.getWebSocket();
					websocket.send(sReq);
			
					try
					{
						requestLatch.await();
					}
					catch (InterruptedException ie)
					{
					}
					
					iLoc2 = g_sMessage.indexOf(FRAME_STRING);
					if ( iLoc2 != -1 )
					{
						// Find start of next Frame, end..
						iEndFrame = g_sMessage.indexOf(FRAME_STRING, iLoc2 + 2);
					}
					
					ProcessBoundVariables(
						g_sMessage,
						true,		// Just update the information in VariableInfo..
						iEndFrame);

				}	// End if, bDoGetStack


				//System.out.println("sEvalTargetId: '"+sEvalTargetId+"'");
				
				TreeNode[] treeNodeAr;
				
				while ( true )
				{
					//System.out.println("**TOP**");
/*					
					if ( enumeration == null )
						System.out.println("enumeration null");
					else
						System.out.println("enumeration not null");
/**/
					// Get next child..
					if ( enumeration.hasMoreElements() )
					{
						node = (DefaultMutableTreeNode)enumeration.nextElement();
						//System.out.println("node.isLeaf(): "+node.isLeaf());
						
						treeNodeAr = node.getPath();
						//System.out.println("(Column)treeNodeAr.length: "+treeNodeAr.length);
						
						nodeObject = (Object)node.getUserObject();
						nodeFVInfo = (NodeFVInfo)nodeObject;

						//System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
						//System.out.println("nodeFVInfo.sName: '"+nodeFVInfo.sName+"'");
						//System.out.println("nodeFVInfo.sObjectId: '"+nodeFVInfo.sObjectId+"'");
						//System.out.println("nodeFVInfo.sTargetId: '"+nodeFVInfo.sTargetId+"'");
						//System.out.println("nodeFVInfo.sValueAsString: '"+nodeFVInfo.sValueAsString+"'");
						
						// Note:
						// If level 1 node, and
						// not a Class, we should already
						// have the value from PauseBreakpoint..
						if ( (treeNodeAr.length == 2) && (nodeFVInfo.bIsClass == false) )
						{
							//System.out.println("Doing continue");
							continue;
						}
						
						sExpression = nodeFVInfo.sName;
						sEvalTargetId = nodeFVInfo.sTargetId;
						//sObjectId = nodeFVInfo.sTargetId;
					}
					else
					{
						//System.out.println("enumeration breaking");
						break;
					}
					
/*
					if ( sExpression == null )
						System.out.println("sExpression null");
					else
						System.out.println("sExpression: '"+sExpression+"'");
/**/

/*
					if ( sEvalTargetId == null )
						System.out.println("sEvalTargetId null");
					else
						System.out.println("sEvalTargetId: '"+sEvalTargetId+"'");
/**/					
					

					// Note:
					// It looks like the 'targetId' parameter
					// is the Classes "id", like: "id":"objects\/124",
					// from the getStack result
					
					if ( (sExpression != null) && (sExpression.length() > 0)
						&& (sEvalTargetId != null) && (sEvalTargetId.length() > 0) )
					{
						//
						// evaluate
						//
						
						requestLatch = new CountDownLatch(1);
								
						ParamAr = new ArrayList();
						ParamAr.add((String)Utils.filterObject(sIsolateId));
						ParamAr.add((String)Utils.filterObject(sEvalTargetId));	// targetId, like: 'objects\/41'
						ParamAr.add((String)sExpression);	// expression, like: 'aspectRatio'
						ParamAr.add((String)"true");		// disableBreakpoints 
						
						String[] evaluateMsg = {
							"method", "evaluate",
							"params",
							"isolateId", "[]",
							"targetId", "[]",
							"expression", "[]",
							"disableBreakpoints ", "[d",
							"}"};
				
						sReq = ConstructMessage(evaluateMsg);
						websocket = webSocketObject.getWebSocket();
						websocket.send(sReq);
				
						try
						{
							requestLatch.await();
						}
						catch (InterruptedException ie)
						{
						}
	
						// Check for error..
						iLoc6 = g_sMessage.indexOf(ERROR_STRING);
						if ( iLoc6 != -1 )
						{
							// Error..
							//System.out.println("*** Evaluate response error ***");
						}
						else
						{
							// Note:
							// It looks like the way to tell that 'flipped'
							// is a Class, it to look at the result here.
							
							// Variables will have:
							// {"type":"@Instance","_vmType"
							
							// And 'flipped' has:
							// {"type":"@Instance","class"
		
							// Check for Class..
							iLoc3 = g_sMessage.indexOf("@Instance");
							if ( iLoc3 != -1 )
							{
								iLoc4 = g_sMessage.indexOf((int)0x22, iLoc3 + 12);
								if ( iLoc4 != -1 )
								{
									sType = g_sMessage.substring(iLoc3 + 12, iLoc4);
									//System.out.println("sType: '"+sType+"'");
									if ( sType.equals("class") )
									{
										// Get type/name..
										iLoc5 = g_sMessage.indexOf(NAME_STRING);
										if ( iLoc5 != -1 )
										{
											iLoc6 = g_sMessage.indexOf((int)0x22, iLoc5 + 8);
											if ( iLoc6 != -1 )
											{
												sTypeName = g_sMessage.substring(iLoc5 + 8, iLoc6);
												//System.out.println("sTypeName: '"+sTypeName+"'");
											}
										}
									}
								}
							}
							
							// Get value..						
							iLoc3 = g_sMessage.indexOf("valueAsString");
							if ( iLoc3 != -1 )
							{
								iLoc4 = g_sMessage.indexOf((int)0x22, iLoc3 + 16);
								if ( iLoc4 != -1 )
								{
									sValueAsString = g_sMessage.substring(iLoc3 + 16, iLoc4);
									//System.out.println("sValueAsString: '"+sValueAsString+"'");
								}
							}
							
							// Update child..
							//System.out.println("--Update--");
							//System.out.println("sValueAsString: '"+sValueAsString+"'");
							//System.out.println("nodeFVInfo.sName: '"+nodeFVInfo.sName+"'");
							//System.out.println("nodeFVInfo.sTargetId: '"+nodeFVInfo.sTargetId+"'");
							//System.out.println("nodeFVInfo.sClassName: '"+nodeFVInfo.sClassName+"'");
	
							if ( nodeFVInfo.bIsClass )
								nodeFVInfo.sValueAsString = nodeFVInfo.sClassName;
							else
								nodeFVInfo.sValueAsString = sValueAsString;
							
							node.setUserObject(nodeFVInfo);
								
						}
					}
				}	// End while..
				
			}
			catch (WebSocketException wse)
			{
				wse.printStackTrace();
			}
			
			TreePath rootPath = new TreePath(root.getPath());
			
			if ( bCreateChildren )
			{
				
				TreePath treePath = variableJTree.getSelectionPath();
				iExpandRow = variableJTree.getRowForPath(treePath);
				
				// We've finished creating the children
				// so expand that node..
				//System.out.println("iExpandRow: "+iExpandRow);
				variableJTree.expandRow(iExpandRow);	// Zero based..
			}
			
			
			variableJTree.setExpandsSelectedPaths(true);
			variableJTree.expandPath(rootPath);
			variableJTree.scrollPathToVisible(rootPath);
			variableJTree.setRootVisible(false);
			
			bVariableNodeSelected = false;	// Reset..
			bUpdateVariableJTreeFinished = true;
			
			//System.out.println("Exiting UpdateVariableJTreeBgThread run()");

		}
	}	//}}}

	//{{{	ReleaseCheckBgThread
	class ReleaseCheckBgThread extends Thread
	{
		public void run()
		{
			while ( true )
			{
				if ( bReleaseCheckFinished )
					break;
				
				try
				{
					Thread.sleep(250);					
				}
				catch (InterruptedException ie)
				{
				}
			}
/*			
			if ( releaseButton == null )
				System.out.println("releaseButton null");
			else
				System.out.println("releaseButton not null");
/**/			
			ActionEvent ae = new ActionEvent(
				(Object)releaseButton,	// source
				1234,					// id
				"Release");				// command
/*			
			if ( ae == null )
				System.out.println("ae null");
			else
				System.out.println("ae not null");
/**/
			actListener.actionPerformed(ae);

		}
	}	//}}}

	//{{{	WalkTree()	
	public void WalkTree()
	{
		System.out.println("\nWalkTree()");
		Object nodeObject;
		Object rootObject;
		Object dataObject;
		int iCount;
		TreeModel treeModel;
		NodeFVInfo nodeFVInfo;
		
		treeModel = variableJTree.getModel();
		rootObject = treeModel.getRoot();
/*		
		if ( rootObject == null )
			System.out.println("rootObject null");
		else
			System.out.println("rootObject not null");
/**/		
		iCount = treeModel.getChildCount(rootObject);
		System.out.println("iCount: "+iCount);
		
		for ( int iJ = 0; iJ < iCount; iJ++ )
		{
			System.out.println("--TOP-- iJ: "+iJ);
			nodeObject = treeModel.getChild(rootObject, iJ);

			if ( nodeObject == null )
				System.out.println("nodeObject null");
			else
				System.out.println("nodeObject not null");
			
			dataObject = ((DefaultMutableTreeNode)nodeObject).getUserObject();
			nodeFVInfo = (NodeFVInfo)dataObject;
			
			System.out.println("nodeFVInfo.sName: '"+nodeFVInfo.sName+"'");
			System.out.println("nodeFVInfo.sClassName: '"+nodeFVInfo.sClassName+"'");
			System.out.println("nodeFVInfo.sClassId: '"+nodeFVInfo.sClassId+"'");
			System.out.println("nodeFVInfo.sObjectId: '"+nodeFVInfo.sObjectId+"'");
			
		}
		
		
	}	//}}}
	
	//{{{	CheckKeystorePasswords
	public void CheckKeystorePasswords()
	{
		//System.out.println("\nCheckKeystorePasswords");
		sKeystorePassword = "";
		sKeyAliasPassword = "";
		sKeystorePath = "";
		sKeyAlias = "";
		
		keyAliasField = null;
		keystorePathField = null;
		keyAliasPasswordField = null;
		keystorePasswordField = null;
		
		boolean bShowDialog = false;
		boolean bShowKeystorePassword = false;
		boolean bShowKeyAliasPassword = false;
		boolean bShowKeystorePath = false;
		boolean bShowKeyAlias = false;
		int iGridY = 0;
		JPanel panel;
		GridBagConstraints gbc;

		// Note:
		// We need to call Utils.processPath() to
		// remove any surrounding double quotes..
		
		try
		{
			Properties prop = new Properties();	
			prop.load(new FileInputStream("config.properties"));
			sKeystorePath = Utils.processPath(prop.getProperty("keystore_path"));
			sKeyAlias = Utils.processPath(prop.getProperty("key_alias"));
			sKeystorePassword = Utils.processPath(prop.getProperty("key_store_password"));
			sKeyAliasPassword = Utils.processPath(prop.getProperty("key_alias_password"));
		}
		catch (IOException ioe)
		{
			//System.out.println("Exception: "+ioe.toString());
		}

		//System.out.println("bGradleSelected: "+bGradleSelected);
		if ( bGradleSelected == false )
		{
			// Android Ant..
			Properties antProp = new Properties();
			StringBuffer pSb = new StringBuffer();
			pSb.append(projectHomeS);
			pSb.append("/ant.properties");
			
			try
			{
				// Get what's in ant.properties, not overwriting what was in config.properties..
				antProp.load(new FileInputStream(pSb.toString()));
				
				if ( (sKeystorePath == null) || (sKeystorePath.equals("null")) || (sKeystorePath.equals("")) )
					sKeystorePath = Utils.processPath(antProp.getProperty("key.store"));
				
				if ( (sKeyAlias == null) || (sKeyAlias.equals("null")) || (sKeyAlias.equals("")) )
					sKeyAlias = Utils.processPath(antProp.getProperty("key.alias"));
				
				if ( (sKeystorePassword == null) || (sKeystorePassword.equals("null")) || (sKeystorePassword.equals("")) )
					sKeystorePassword = Utils.processPath(antProp.getProperty("key.store.password"));
			
				if ( (sKeyAliasPassword == null) || (sKeyAliasPassword.equals("null")) || (sKeyAliasPassword.equals("")) )
					sKeyAliasPassword = Utils.processPath(antProp.getProperty("key.alias.password"));
			}
			catch (IOException ioe)
			{
				//System.out.println("Exception: "+ioe.toString());
			}
		}
		
		if ( (sKeystorePassword != null) && (sKeystorePassword.length() > 0) &&
				(!sKeystorePassword.equals("null")) )
			;
		else
		{
			bShowKeystorePassword = true;
			bShowDialog = true;
		}
		
		if ( (sKeyAliasPassword != null) && (sKeyAliasPassword.length() > 0) &&
				(!sKeyAliasPassword.equals("null")) )
			;
		else
		{
			bShowKeyAliasPassword = true;
			bShowDialog = true;
		}

		if ( (sKeystorePath != null) && (sKeystorePath.length() > 0) &&
				(!sKeystorePath.equals("null")) )
			;
		else
		{
			bShowKeystorePath = true;
			bShowDialog = true;
		}

		if ( (sKeyAlias != null) && (sKeyAlias.length() > 0) &&
				(!sKeyAlias.equals("null")) )
			;
		else
		{
			bShowKeyAlias = true;
			bShowDialog = true;
		}

		//System.out.println("bShowDialog: "+bShowDialog);			
		if ( bShowDialog )
		{
			releaseFrame = new JFrame();
			releaseFrame.setLayout(new BorderLayout());		
			releaseFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			releaseFrame.setTitle("Release Passwords");
			
			panel = new JPanel(new GridBagLayout());
			panel.setVisible(true);
			
			gbc = new GridBagConstraints();
			gbc.fill = GridBagConstraints.HORIZONTAL;
			gbc.insets = new Insets(4, 4, 4, 4);	// External padding of the component
	
			//System.out.println("bShowKeyAlias: "+bShowKeyAlias);				
			if ( bShowKeyAlias )
			{
				JLabel keyAliasLbl = new JLabel("Key Alias: ");
				gbc.gridx = 0;
				gbc.gridy = iGridY;
				gbc.gridwidth = 1;
				panel.add(keyAliasLbl, gbc);
		
				keyAliasField = new JTextField(30);	
				gbc.gridx = 1;
				gbc.gridy = iGridY;
				gbc.gridwidth = 3;
				panel.add(keyAliasField, gbc);
				
				iGridY++;
			}
			
			//System.out.println("bShowKeystorePath: "+bShowKeystorePath);
			if ( bShowKeystorePath )
			{
				JLabel keystorePathLbl = new JLabel("Keystore Path: ");
				gbc.gridx = 0;
				gbc.gridy = iGridY;
				gbc.gridwidth = 1;
				panel.add(keystorePathLbl, gbc);
		
				keystorePathField = new JTextField(30);		
				gbc.gridx = 1;
				gbc.gridy = iGridY;
				gbc.gridwidth = 2;
				
				// Try to load Project Home..		
				if ( (sProjectPathLead != null) && (! sProjectPathLead.equals("")) )
				{
					StringBuffer ppSb = new StringBuffer();
					ppSb.append(sProjectPathLead);
					ppSb.append("/");
					
					keystorePathField.setText(ppSb.toString());
				}

				panel.add(keystorePathField, gbc);
				
				JButton chooseButton = new JButton("...");
				chooseButton.setActionCommand("keystore_path_chooser");
				chooseButton.addActionListener(actListener);
				
				gbc = new GridBagConstraints();
				gbc.fill = GridBagConstraints.HORIZONTAL;
				gbc.insets = new Insets(4, 4, 4, 4);	// bottom, left, right, top
				gbc.gridx = 3;
				gbc.gridy = iGridY;
				gbc.gridwidth = 1;
				panel.add(chooseButton, gbc);
				
				iGridY++;
			}

			//System.out.println("bShowKeyAliasPassword: "+bShowKeyAliasPassword);
			if ( bShowKeyAliasPassword )
			{
				JLabel keyAliasPasswordLbl = new JLabel("Key Alias Password: ");
				gbc.gridx = 0;
				gbc.gridy = iGridY;
				gbc.gridwidth = 1;
				panel.add(keyAliasPasswordLbl, gbc);
		
				keyAliasPasswordField = new JPasswordField(30);		
				gbc.gridx = 1;
				gbc.gridy = iGridY;
				gbc.gridwidth = 3;
				panel.add(keyAliasPasswordField, gbc);
				
				iGridY++;
			}

			//System.out.println("bShowKeystorePassword: "+bShowKeystorePassword);
			if ( bShowKeystorePassword )
			{
				JLabel keystorePasswordLbl = new JLabel("Keystore Password: ");
				gbc.gridx = 0;
				gbc.gridy = iGridY;
				gbc.gridwidth = 1;
				panel.add(keystorePasswordLbl, gbc);
		
				keystorePasswordField = new JPasswordField(30);		
				gbc.gridx = 1;
				gbc.gridy = iGridY;
				gbc.gridwidth = 3;
				panel.add(keystorePasswordField, gbc);
			}

			panel.setBorder(new LineBorder(Color.GRAY));
			
			JButton submitButton = new JButton("Submit");
			submitButton.setActionCommand("release_dialog_submit");
			submitButton.addActionListener(actListener);
			
			JButton cancelButton = new JButton("Cancel");
			cancelButton.setActionCommand("release_dialog_cancel");
			cancelButton.addActionListener(actListener);
			
			JPanel buttonPanel = new JPanel();
			buttonPanel.add(submitButton);
			buttonPanel.add(cancelButton);
	
			releaseFrame.getContentPane().add(panel, BorderLayout.CENTER);
			releaseFrame.getContentPane().add(buttonPanel, BorderLayout.PAGE_END);
			
			releaseFrame.pack();
			releaseFrame.setVisible(true);
			releaseFrame.setResizable(false);
		}
		else
		{
			// Signal finished..	
			bReleaseCheckFinished = true;
		}
	}	//}}}
	
	//{{{	GradleConfigBgThread
	class GradleConfigBgThread extends Thread
	{
		public void run()
		{
			//System.out.println("\nGradleConfigBgThread run()");
			byte[] zeroATab = {(byte)0x0a, (byte)0x20, (byte)0x20, (byte)0x20, (byte)0x20};
			String zeroATabS = new String(zeroATab);
			byte[] zeroDzeroATab = {(byte)0x0d, (byte)0x0a, (byte)0x20, (byte)0x20, (byte)0x20, (byte)0x20};
			String zeroDzeroATabS = new String(zeroDzeroATab);

			byte[] zeroA = {(byte)0x0a};
			String zeroAS = new String(zeroA);
			byte[] zero9 = {(byte)0x09};
			String zero9S = new String(zero9);
			byte[] zeroDzeroA = {(byte)0x0d, (byte)0x0a};
			String zeroDzeroAS = new String(zeroDzeroA);
			
			byte[] buildBuf = null;
			StringBuffer outSb;
			StringBuffer insertSb = null;
			StringBuffer signingConfigSb;
			int iLoc = 0;
			int iLoc2 = 0;
			int iLoc3;
			int iEnd;
			String sEnd;
			String sTabEnd;
			
			if ( iOS == WINDOWS )
			{
				sEnd = zeroDzeroAS;
				sTabEnd = zeroDzeroATabS;
			}
			else
			{
				sEnd = zeroAS;
				sTabEnd = zeroATabS;
			}
			
			sMinSdk = Integer.toString(iMinSdk);
			
			// For old projects, 'sTargetSdk' is 'null'..
			sTargetSdk = targetApiS;
			//System.out.println("sMinSdk: '"+sMinSdk+"'");
			//System.out.println("sTargetSdk: '"+sTargetSdk+"'");

			if ( buildToolsSpinner != null )
			{
				sBuildToolsVersion = (String)buildToolsSpinner.getValue();
				//System.out.println("sBuildToolsVersion: '"+sBuildToolsVersion+"'");
			}

/*			
			if ( projectHomeS == null )
				System.out.println("projectHomeS null");
			else
				System.out.println("projectHomeS: '"+projectHomeS+"'");
/**/

			// Construct filename..
			StringBuffer fileNameSb = new StringBuffer(projectHomeS);
			
			if ( bFlutterSelected )
				fileNameSb.append("/android/app/build.gradle");
			else
				fileNameSb.append("/app/build.gradle");


			//System.out.println("fileNameSb: '"+fileNameSb.toString()+"'");
			buildFilenameS = fileNameSb.toString();	// Save original name..
			
			File buildFile = new File(fileNameSb.toString());

/*
			if ( buildFile == null )
				System.out.println("buildFile null");
			else
				System.out.println("buildFile not null");
/**/

			while ( true )
			{
				try
				{
					Thread.sleep(500);
				}
				catch (InterruptedException ie)
				{
				}

				if ( buildFile.exists() )
				{
					//System.out.println("Exists, breaking..");
					break;
				}
			}

			buildBuf = readFile(
				512,					// iInitialSize
				fileNameSb.toString());	// fileName

/*			
			if ( buildBuf == null )
				System.out.println("buildBuf null");
			else
				System.out.println("buildBuf.length: "+buildBuf.length);
/**/

			if ( (buildBuf != null) && (buildBuf.length > 0) )
			{
				//System.out.println("(GradleConfigBgThread)buildBuf: '"+(new String(buildBuf))+"'");
				outSb = new StringBuffer(new String(buildBuf));

				// Check if it's already defined..				
				iLoc2 = outSb.indexOf("keystoreProperties");
				if ( iLoc2 == -1 )
				{
					// Add def..
					StringBuffer defSb = new StringBuffer();

					iLoc = outSb.indexOf("apply plugin");
/*					
					if ( bFlutterSelected )
						iLoc = outSb.indexOf("apply plugin");
					else
					{
						if ( bUsingAppProject )
							iLoc = outSb.indexOf("apply plugin");
						else
							iLoc = outSb.indexOf("buildscript");
						
					}
/**/	

					if ( iLoc != -1 )
					{
						defSb.append("def keystoreProperties = new Properties()");
						defSb.append(sEnd);
						defSb.append("def keystorePropertiesFile = rootProject.file('key.properties')");
						defSb.append(sEnd);
						defSb.append("if (keystorePropertiesFile.exists()) {");
						defSb.append(sEnd);
						defSb.append("    keystoreProperties.load(new FileInputStream(keystorePropertiesFile))");  
						defSb.append(sEnd);
						defSb.append("}");
						defSb.append(sEnd);
						defSb.append(sEnd);
						
						outSb.insert(iLoc, defSb.toString());
					}
					
					// Add signingConfigs..					
					StringBuffer signSb = new StringBuffer();
					
					// Note:
					// 'buildTypes' just helps place it..
					iLoc = outSb.indexOf("buildTypes");
					if ( iLoc != -1 )
					{
						signSb.append(sEnd);
						signSb.append(zero9S);
						signSb.append("signingConfigs {");
						signSb.append(sEnd);
						signSb.append(zero9S);
						signSb.append(zero9S);
						signSb.append("release {");
						signSb.append(sEnd);
						signSb.append(zero9S);
						signSb.append(zero9S);
						signSb.append(zero9S);
						signSb.append("keyAlias keystoreProperties['keyAlias']");
						signSb.append(sEnd);
						signSb.append(zero9S);
						signSb.append(zero9S);
						signSb.append(zero9S);
						signSb.append("keyPassword keystoreProperties['keyPassword']");  
						signSb.append(sEnd);
						signSb.append(zero9S);
						signSb.append(zero9S);
						signSb.append(zero9S);
						signSb.append("//storeFile file(keystoreProperties['storeFile'])");
						signSb.append(sEnd);
						signSb.append(zero9S);
						signSb.append(zero9S);
						signSb.append(zero9S);
						signSb.append("storePassword keystoreProperties['storePassword']");
						signSb.append(sEnd);
						signSb.append(zero9S);
						signSb.append(zero9S);
						signSb.append("}");
						signSb.append(sEnd);
						signSb.append(zero9S);
						signSb.append("}");
						signSb.append(sEnd);
						signSb.append(sEnd);
						
						outSb.insert((iLoc - 4), signSb.toString());
					}

					//System.out.println("bFlutterSelected: "+bFlutterSelected);
					if ( bFlutterSelected )
					{
						// Note:
						// In the default it already has:
						
						// buildTypes {
						//     release {
						//         signingConfig signingConfigs.debug
						
						// Add release..					
						StringBuffer releaseSb = new StringBuffer();
						iLoc2 = outSb.indexOf("buildTypes");
						if ( iLoc2 != -1 )
						{
							iLoc3 = outSb.indexOf("release", iLoc2);
							if ( iLoc3 != -1 )
							{
								//iLoc = outSb.indexOf(".debug");
								iLoc = outSb.indexOf(".debug", iLoc3);
								if ( iLoc != -1 )
								{
									releaseSb.append("            signingConfig signingConfigs.release");
									releaseSb.append(sEnd);
									
									outSb.insert((iLoc + 8), releaseSb.toString());
								}
							}
						}

/*
						if ( targetSdkSpinner == null )
							System.out.println("targetSdkSpinner null");
						else
							System.out.println("targetSdkSpinner not null");
/**/						
						if ( targetSdkSpinner != null )
						{
							// Like: 'Android 8.0.0 (API level 26)  Id: 4'
							String sT = (String)targetSdkSpinner.getValue();
							//System.out.println("(targetSdkSpinner.getValue()): '"+sT+"'");
							if ( (sT != null) && (sT.length() > 0) )
							{
								iLoc2 = sT.indexOf("level");
								if ( iLoc2 != -1 )
								{
									iLoc3 = sT.indexOf(")", iLoc2);
									if ( iLoc3 != -1 )
									{
										sTargetSdk = sT.substring((iLoc2 + 5), iLoc3);
										sTargetSdk = sTargetSdk.trim();
									}
								}
							}
						}
						
/*					
						if ( sT == null )
							System.out.println("(Spinner)sT null");
						else
							System.out.println("(Spinner)sT: '"+sT+"'");
/**/
/*
						if ( sTargetSdk == null )
							System.out.println("sTargetSdk null");
						else
							System.out.println("sTargetSdk: '"+sTargetSdk+"'");
/**/
	
						// Don't modify if Min or Target SDK are blank..
						if ( (sTargetSdk != null) && (sTargetSdk.length() > 0) )
						{
							iLoc2 = outSb.indexOf("compileSdkVersion");
							if ( iLoc2 != -1 )
							{
								outSb.replace((iLoc2 + 18), (iLoc2 + 20), sTargetSdk);
							}
							
							iLoc2 = outSb.indexOf("targetSdkVersion");
							if ( iLoc2 != -1 )
							{
								outSb.replace((iLoc2 + 17), (iLoc2 + 19), sTargetSdk);
							}
						}
					}
					else
					{
						iLoc3 = outSb.indexOf("buildTypes");
						if ( iLoc3 != -1 )
						{
							iLoc = outSb.indexOf("release", iLoc3);
							if ( iLoc != -1 )
							{
								iLoc2 = outSb.indexOf("{", iLoc);
								if ( iLoc2 != -1 )
								{
									for ( ; outSb.charAt(iLoc2) != ' '; iLoc2++ );	// Skip past 0x0a to space..
									signingConfigSb = new StringBuffer();
									signingConfigSb.append("            ");
									signingConfigSb.append("signingConfig signingConfigs.debug");
									signingConfigSb.append(sEnd);
									signingConfigSb.append("            ");
									signingConfigSb.append("signingConfig signingConfigs.release");
									signingConfigSb.append(sEnd);
									
									outSb.insert(iLoc2, signingConfigSb.toString());
								}
							}
						}
					}

					if ( (sBuildToolsVersion != null) && (sBuildToolsVersion.length() > 0) )
					{
						// Update Build-tools..
						if ( bFlutterSelected )
						{
							int iInsertLoc;
							iLoc2 = outSb.indexOf("compileSdkVersion");
							if ( iLoc2 != -1 )
							{
								if ( outSb.charAt(iLoc2 + 20) == 0x0d )
								{
									// Windows
									//System.out.println("Found 0x0d");
									iInsertLoc = iLoc2 + 22;
								}
								else
								{ 
									// Nix end..
									//System.out.println("Nix");
									iInsertLoc = iLoc2 + 21;
								}
	
								StringBuffer insSb = new StringBuffer();
								insSb.append("    buildToolsVersion '");
								insSb.append(sBuildToolsVersion);
								insSb.append("'");
								
								outSb.insert(iInsertLoc, insSb.toString());
							}
						}
					}

					writeFile(outSb.toString().getBytes(), buildFilenameS);						
				}
			}
			
			bGradleConfigFinished = true;
			//System.out.println("Exiting GradleConfigBgThread");

		}
	}	//}}}

	//{{{	ModifyAndroidManifestBgThread
	class ModifyAndroidManifestBgThread extends Thread
	{
		public void run()
		{
			// Remove 'android:configChanges' for Flutter
			// Causing build issues..
			//System.out.println("ModifyAndroidManifestBgThread()");
			byte[] buildBuf = null;
			byte[] doubleQuote = {(byte)0x22};
			String sDoubleQuote = new String(doubleQuote);
			StringBuffer outSb;
			int iLoc;
			int iLoc2;
			
			// Construct filename..
			StringBuffer fileNameSb = new StringBuffer(projectHomeS);
			fileNameSb.append("/android/app/src/main/AndroidManifest.xml");
			//System.out.println("fileNameSb: '"+fileNameSb.toString()+"'");
			
			File buildFile = new File(fileNameSb.toString());

			while ( true )
			{
				try
				{
					Thread.sleep(1000);
				}
				catch (InterruptedException ie)
				{
				}

				if ( buildFile.exists() )
					break;
			}

			buildBuf = readFile(
				512,					// iInitialSize
				fileNameSb.toString());	// fileName

			if ( (buildBuf != null) && (buildBuf.length > 0) )
			{
				outSb = new StringBuffer(new String(buildBuf));
				iLoc = outSb.indexOf("android:configChanges");
				if ( iLoc != -1 )
				{
					iLoc2 = outSb.indexOf(sDoubleQuote, (iLoc + 25));
					if ( iLoc2 != -1 )
					{
						for ( iLoc-- ; outSb.charAt(iLoc) == ' '; iLoc-- );
						iLoc++;

						for ( ; outSb.charAt(iLoc2) != ' '; iLoc2++ );
						outSb.delete(iLoc, iLoc2);
					}
				}
				
				writeFile(outSb.toString().getBytes(), fileNameSb.toString());						
			}
		}
	}	//}}}
	
	//{{{	ModifyGradleWrapperBgThread
	class ModifyGradleWrapperBgThread extends Thread
	{
		public void run()
		{
			//System.out.println("\nModifyGradleWrapperBgThreadrun()");
			byte[] buildBuf = null;
			StringBuffer outSb;
			int iLoc;
			
			// Construct filename..
			StringBuffer fileNameSb = new StringBuffer(projectHomeS);
			fileNameSb.append("/gradle/wrapper/gradle-wrapper.properties");
			//System.out.println("fileNameSb: '"+fileNameSb.toString()+"'");
			
			File buildFile = new File(fileNameSb.toString());

			while ( true )
			{
				try
				{
					Thread.sleep(1000);
				}
				catch (InterruptedException ie)
				{
				}

				if ( buildFile.exists() )
					break;
			}

			buildBuf = readFile(
				512,					// iInitialSize
				fileNameSb.toString());	// fileName

			if ( (buildBuf != null) && (buildBuf.length > 0) )
			{
				outSb = new StringBuffer(new String(buildBuf));
				iLoc = outSb.indexOf("1.12");
				if ( iLoc != -1 )
				{
					// Replace with newer '3.5'..
					outSb.replace(iLoc, (iLoc + 4), "3.5");
				}
				
				writeFile(outSb.toString().getBytes(), fileNameSb.toString());						
				
				bModifyGradleWrapperBgThread = true;
			}
		}
	}	//}}}

	//{{{	DeleteKeyPropertiesBgThread
	class DeleteKeyPropertiesBgThread extends Thread
	{
		public void run()
		{
			//System.out.println("DeleteKeyPropertiesBgThread run()");
			// Construct file name..
			StringBuffer fNameSb = new StringBuffer(projectHomeS);
			fNameSb.append("/");
			//System.out.println("(Org)fNameSb: '"+fNameSb.toString()+"'");
			
			if ( bFlutterSelected )
				fNameSb.append("android/");
			
			fNameSb.append("key.properties");
			//System.out.println("fNameSb: '"+fNameSb.toString()+"'");
			
			File KeyPropertiesFile = new File(fNameSb.toString());
			if ( KeyPropertiesFile.exists() )
			{
				bDeletedKeyProperties = true;
				KeyPropertiesFile.delete();
			}
			
			bDeleteKeyPropertiesFinished = true;
		}
	}	//}}}
	
	//{{{	ReleaseBgThread
	class ReleaseBgThread extends Thread
	{
		public void run()
		{
			// Create: Flutter: /android/key.properties  Gradle: /key.properties
			//System.out.println("\nReleaseBgThread run()");
			byte[] zeroATab = {(byte)0x0a, (byte)0x20, (byte)0x20, (byte)0x20, (byte)0x20};
			String zeroATabS = new String(zeroATab);
			byte[] zeroDzeroATab = {(byte)0x0d, (byte)0x0a, (byte)0x20, (byte)0x20, (byte)0x20, (byte)0x20};
			String zeroDzeroATabS = new String(zeroDzeroATab);

			byte[] zeroA = {(byte)0x0a};
			String zeroAS = new String(zeroA);
			byte[] zeroDzeroA = {(byte)0x0d, (byte)0x0a};
			String zeroDzeroAS = new String(zeroDzeroA);
			String sEnding;
			String sTabEnd;
			
			byte[] buildBuf = null;
			
			StringBuffer insertSb = null;
			
			int iLoc;
			int iLoc2;
			int iLoc3;
			boolean bFound;
			
			if ( iOS == LINUX_MAC )
			{
				sEnding = zeroAS;
				sTabEnd = zeroATabS;
			}
			else
			{
				sEnding = zeroDzeroAS;
				sTabEnd = zeroDzeroATabS;
			}

			boolean bFlutterEnabled = uFlutterMenuItem.getState();
			boolean bGradleEnabled = uGradleMenuItem.getState();
			
			// Create key.properties file..
			StringBuffer keyFileSb = new StringBuffer(projectHomeS);
			
			if ( bFlutterEnabled )
			{
				keyFileSb.append("/android/key.properties");
			}
			else if ( (bFlutterEnabled == false) && (bGradleEnabled) )
			{
				keyFileSb.append("/key.properties");
			}
			//System.out.println("keyFileSb: '"+keyFileSb.toString()+"'");
			
			File checkFile = new File(keyFileSb.toString());
			boolean bExists = checkFile.exists();
			if ( bExists == false )
			{
				StringBuffer keysSb = new StringBuffer();

				keysSb.append("storePassword=");
				keysSb.append(sKeystorePassword);
				keysSb.append(sEnding);
				keysSb.append("keyPassword=");
				keysSb.append(sKeyAliasPassword);
				keysSb.append(sEnding);
				keysSb.append("keyAlias=");
				keysSb.append(sKeyAlias);
				keysSb.append(sEnding);
				keysSb.append("storeFile=");
				keysSb.append(sKeystorePath);
				keysSb.append(sEnding);

				//System.out.println("keyFileSb: '"+keyFileSb.toString()+"'");
				writeFile(keysSb.toString().getBytes(), keyFileSb.toString());
			}

			bReleaseFinished = true;
			//System.out.println("Exiting ReleaseBgThread run()");
		}
	}	//}}}
	
	//{{{	ShowProgressTask
	class ShowProgressTask extends SwingWorker
	{
		@Override
		public Integer doInBackground() throws Exception
		{
			//System.out.println("\nShowProgressTask  doInBackground()");
			//System.out.println("isEventDispatchThread(): "+
				//SwingUtilities.isEventDispatchThread());

			progressJFrame = new JFrame();

			jProgressBar = new JProgressBar();
			jProgressBar.setIndeterminate(true);
			jProgressBar.setPreferredSize(new Dimension(200, 30));

			progressJFrame.setUndecorated(true);
			progressJFrame.add(jProgressBar);
			progressJFrame.pack();
			progressJFrame.setVisible(true);
			progressJFrame.setLocationRelativeTo(mainJFrame);
			progressJFrame.setAlwaysOnTop(true);

			if ( bIsCleanDebug )
			{
				bFinished = false;
				ioBgThread = new IOBgThread();
				ioBgThread.start();
				
				// Wait for Thread to finish..
				while ( true )
				{
					try
					{
						Thread.sleep(20);
					}
					catch (InterruptedException ie)
					{
					}

					//Thread.yield();

					if ( bFinished )
						break;
				}
			}
			else if ( bIsDebug )
			{
				bIsDebug = false;
				initDebug();
			}

			//System.out.println("doInBackground() returning");
			return 0;
		}
		
		@Override
		public void done()
		{
			//System.out.println("done()");
			progressJFrame.dispose();
		}
	}	//}}}

	//{{{	pullDialog()
	public void pullDialog()
	{
		//System.out.println("\npullDialog()");
		pullFrame = new JFrame();
		pullFrame.setLayout(new BorderLayout());		
		pullFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		pullFrame.setTitle("Pull");
		
		JPanel panel = new JPanel(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		DefaultListModel defaultListModel = new DefaultListModel();
		for ( int g = 0; g < LsOutAr.size(); g++ )
		{
			defaultListModel.addElement((String)LsOutAr.get(g));
		}
		
		pullDialogJList = new JList(defaultListModel);
		pullDialogJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		pullDialogJList.setSelectedIndex(0);
		pullDialogJList.setVisibleRowCount(5);
		
		JScrollPane jScrollPane = new JScrollPane(pullDialogJList);

		gbc = new GridBagConstraints();
		gbc.insets = new Insets(4, 4, 4, 4);	// bottom, left, right, top		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 3;
		
		panel.add(jScrollPane, gbc);
		
		panel.setBorder(new LineBorder(Color.GRAY));

		JButton submitButton = new JButton("Submit");
		submitButton.setActionCommand("pull_submit");
		submitButton.addActionListener(actListener);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setActionCommand("pull_cancel");
		cancelButton.addActionListener(actListener);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(submitButton);
		buttonPanel.add(cancelButton);

		pullFrame.getContentPane().add(panel, BorderLayout.CENTER);
		pullFrame.getContentPane().add(buttonPanel, BorderLayout.PAGE_END);
		
		pullFrame.pack();
		pullFrame.setVisible(true);
		
	}	//}}}
	
	//{{{	searchDialog()
	/**
     * Construct Dialog for Search
     */
	public void searchDialog()
	{
		searchFrame = new JFrame();
		searchFrame.setLayout(new BorderLayout());		
		searchFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		searchFrame.setTitle("Search");
		
		JPanel panel = new JPanel(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		JLabel searchLbl = new JLabel("Search for: ");

		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(4, 4, 4, 4);	// bottom, left, right, top		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		panel.add(searchLbl, gbc);

		searchField = new JTextField(30);

		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(4, 4, 4, 4);	// bottom, left, right, top
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		panel.add(searchField, gbc);

		panel.setBorder(new LineBorder(Color.GRAY));

		JButton resetNextButton = new JButton("Reset Next");
		resetNextButton.setActionCommand("search_reset_next");
		resetNextButton.addActionListener(actListener);
		
		JButton nextButton = new JButton("Next");
		nextButton.setActionCommand("search_next");
		nextButton.addActionListener(actListener);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setActionCommand("search_cancel");
		cancelButton.addActionListener(actListener);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(resetNextButton);
		buttonPanel.add(nextButton);
		buttonPanel.add(cancelButton);

		searchFrame.getContentPane().add(panel, BorderLayout.CENTER);
		searchFrame.getContentPane().add(buttonPanel, BorderLayout.PAGE_END);
		
		searchFrame.pack();
		searchFrame.setVisible(true);
		
	}	//}}}

	//{{{	BreakpointDialog()
	public void BreakpointDialog()
	{
		// Construct List..
		//System.out.println("BreakpointDialog()");
		long lMethodID;
		long lClassId;
		long lRefTypeId;
		int iRequsetId;
		int iLoc2;
		boolean bClassMatched = false;
		String sMethodName;
		String sSignature = "";
		String sClassName = "";
		String sSourceName = "";
		String sBreakpointId;
		StringBuffer sb;
		BreakpointInfo breakpointInfo;
		ClassInfo classInfo;
		CheckListItem checkListItem = null;
		
		if ( (BreakpointAr != null) && (BreakpointAr.size() > 0) )
		{
			
			breakpointFrame = new JFrame();
			breakpointFrame.setLayout(new BorderLayout());		
			breakpointFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			breakpointFrame.setTitle("Breakpoints");
			
			JPanel panel = new JPanel(new GridBagLayout());
			GridBagConstraints gbc = new GridBagConstraints();
			gbc.fill = GridBagConstraints.HORIZONTAL;
			gbc.insets = new Insets(4, 4, 4, 4);	// External padding of the component
	
			/*
			 * JList
			 */
			
			int iSize = BreakpointAr.size();
			int iClassSize;
			checkListItems = new CheckListItem[iSize];
			
			for ( int iB = 0; iB < iSize; iB++ )
			{
				//System.out.println("-------------------------");
				breakpointInfo = (BreakpointInfo)BreakpointAr.get(iB);
				lMethodID = breakpointInfo.lMethodId;
				//System.out.println("lMethodID: "+lMethodID);
				lClassId = breakpointInfo.lClassId;
				//System.out.println("lClassId: "+lClassId);
				sMethodName = breakpointInfo.sMethodName;
				//System.out.println("sMethodName: '"+sMethodName+"'");
				iRequsetId = breakpointInfo.iRequestId;
				//System.out.println("iRequsetId: "+iRequsetId);
	
				// Flutter..
				sBreakpointId = breakpointInfo.sBreakpointId;
				
				// Like:      'libraries\/@27117998\/scripts\/package%3Aclock_app%2Fclock%2Fhand_minute.dart\/16f513e828f'
				sScriptId = breakpointInfo.sScriptId;
				
				
				if ( bFlutterSelected )
				{
					iLoc2 = sScriptId.lastIndexOf((int)0x5c);
					if ( iLoc2 != -1 )
					{
						int iX = iLoc2;
						for ( ; sScriptId.charAt(iX) != (char)'F'; iX-- );
						
						// Like: 'hand_minute.dart'
						sSourceName = sScriptId.substring(iX + 1, iLoc2);
						//System.out.println("sSourceName: '"+sSourceName+"'");
					}
					
					sb = new StringBuffer();
					sb.append("   ");
					sb.append(sSourceName);
					sb.append("   Line   ");
					sb.append(breakpointInfo.iLineNumber);
					sb.append("  ");
					
				}
				else
				{
					if ( (AllClassesAr != null) && (AllClassesAr.size() > 0) )
					{
						iClassSize = AllClassesAr.size();
						for ( int iG = 0; iG < iClassSize; iG++ )
						{
							classInfo = (ClassInfo)AllClassesAr.get(iG);
							lRefTypeId = classInfo.lTypeId;
							sSignature = classInfo.sSignature;
							
							if ( lRefTypeId == lClassId )
							{
								bClassMatched = true;
								break;
							}
						}
					}
					
					// Construct Class name..
					if ( bClassMatched )
					{
						//System.out.println("sSignature: '"+sSignature+"'");
						int iLoc = sSignature.lastIndexOf((int)'/');
						if ( iLoc != -1 )
						{
							sClassName = sSignature.substring((iLoc + 1), (sSignature.length() - 1));
							//System.out.println("sClassName: '"+sClassName+"'");
						}
					}
					
					sb = new StringBuffer();
					sb.append("   ");
					sb.append(sClassName);
					sb.append(".");
					sb.append(sMethodName);
					sb.append("()  Line   ");
					sb.append(breakpointInfo.iLineNumber);
					sb.append("  ");
					
				}
				
				checkListItem = new CheckListItem(sb.toString());
				if ( bFlutterSelected )
					checkListItem.setBreakpointId(sBreakpointId);
				else
					checkListItem.setRequestId(iRequsetId);
				
				checkListItems[iB] = checkListItem;
				
			}	// End for..
		
			breakpointDialogJList = new JList(checkListItems);
			breakpointDialogJList.setCellRenderer((ListCellRenderer)new CheckListRenderer());
			breakpointDialogJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
			breakpointDialogJList.addMouseListener(breakpointsMouseListener);
			
			breakpointDialogJList.setVisibleRowCount(4);
	
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setViewportView(breakpointDialogJList);
			gbc.gridx = 0;
			gbc.gridy = 0;
			gbc.gridwidth = 3;
			panel.add(scrollPane, gbc);
			panel.setBorder(new LineBorder(Color.GRAY));
	
			/*
			 * Buttons
			 */
	
			breakpointRemoveButton = new JButton("Clear");
			breakpointRemoveButton.setActionCommand("breakpoint_submit");
			breakpointRemoveButton.addActionListener(actListener);
			
			JButton cancelButton = new JButton("Cancel");
			cancelButton.setActionCommand("breakpoint_cancel");
			cancelButton.addActionListener(actListener);
			
			JPanel buttonPanel = new JPanel();
			buttonPanel.add(breakpointRemoveButton);
			buttonPanel.add(cancelButton);
	
			breakpointFrame.getContentPane().add(panel, BorderLayout.CENTER);
			breakpointFrame.getContentPane().add(buttonPanel, BorderLayout.PAGE_END);
			
			breakpointFrame.pack();
			breakpointFrame.setVisible(true);
		}
		
	}	//}}}
	
	//{{{	variableDialog()
	public void variableDialog()
	{
		//System.out.println("\n-- variableDialog() --");
		Font defaultFont = new Font("Monospaced", Font.BOLD, 13);
		
		variableFrame = new JFrame();
		variableFrame.setLayout(new BorderLayout());		
		variableFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		variableFrame.setTitle("Variable");
		
		JPanel panel = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(4, 4, 4, 4);	// External padding of the component
		
		JLabel NmLbl = new JLabel("Name: ");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		panel.add(NmLbl, gbc);

		//System.out.println("sVariableName.length(): "+sVariableName.length());
		variableNameField = new JTextField(30);
		variableNameField.setFont(defaultFont);
		variableNameField.setText(sVariableName);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		panel.add(variableNameField, gbc);
		
		JLabel signatureLbl = new JLabel("Signature: ");		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		panel.add(signatureLbl, gbc);

		//System.out.println("sVariableSignature.length(): "+sVariableSignature.length());
		signatureField = new JTextField(30);
		signatureField.setFont(defaultFont);
		signatureField.setText(sVariableSignature);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		panel.add(signatureField, gbc);

		setLbl = new JLabel("Set: ");	// So we can ghost it..
		if ( bGhostVariables )
			setLbl.setEnabled(false);
			
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		panel.add(setLbl, gbc);

		variableSetField = new JTextField(30);
		variableSetField.setFont(defaultFont);
		if ( bGhostVariables )
			variableSetField.setEnabled(false);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		panel.add(variableSetField, gbc);
		
		/*
		 * JList
		 */

		JLabel valueLbl = new JLabel("Value: ");		
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		panel.add(valueLbl, gbc);

		variableDialogJList = new JList(variableDialogVector);
		variableDialogJList.setVisibleRowCount(5);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(variableDialogJList);
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 2;
		panel.add(scrollPane, gbc);
		panel.setBorder(new LineBorder(Color.GRAY));

		/*
		 * Buttons
		 */
		
		variableSubmitButton = new JButton("Submit");	// So we can ghost it..
		if ( bGhostVariables )
			variableSubmitButton.setEnabled(false);

		variableSubmitButton.setActionCommand("variable_submit");
		variableSubmitButton.addActionListener(actListener);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setActionCommand("variable_cancel");
		cancelButton.addActionListener(actListener);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(variableSubmitButton);
		buttonPanel.add(cancelButton);

		variableFrame.getContentPane().add(panel, BorderLayout.CENTER);
		variableFrame.getContentPane().add(buttonPanel, BorderLayout.PAGE_END);
		
		variableFrame.pack();
		variableFrame.setVisible(true);
		
	}	//}}}
	
	
	//{{{	DebugInit()
	public void DebugInit()
	{
		//System.out.println("DebugInit()");	
		String sAppName = "";
		String sPackageString = "";
		int iLoc2;
		int iLoc3;
		int iLoc4;
		int iLoc5;
		int iLoc6;
		
		VariableInfoLHm = new LinkedHashMap();
		SelectedNodesLHm = new LinkedHashMap();
		eventQueue = new LinkedList();
		sVariablesScriptId = "";
		iPauseBreakpointTokenPos = 0;
		iTokenPosLine = 0;
		iPreviousLine = 0;
		sTreeSelectionName = "";
		bFlutterSetLibraryDebuggableStarted = false;
		iLibraryStartIndex = 0;
		
		
		try
		{
			URI url = new URI(sDebugUri);
			
			WebSocket websocket = new WebSocket(url);
				
			// Register Event Handlers
			websocket.setEventHandler(new WebSocketEventHandler()
			{
				public void onOpen()
				{
					//System.out.println("(WebSocketEventHandler()) onOpen()");
				}
				
				public void onMessage(WebSocketMessage message)
				{
					
					//System.out.println("(WebSocketEventHandler()) onMessage() message: " + message.getText());
					//System.out.println("WebSocketEventHandler() onMessage()");
					
					processMessage(message.getText());
				}
				
				public void onClose()
				{
					//System.out.println("(WebSocketEventHandler()) onClose()");
				}
				
				public void onError(IOException exception)
				{
					//System.out.println("(WebSocketEventHandler()) onError()");
				}
				
				public void onPing()
				{
					//System.out.println("onPing()");
				}
				
				public void onPong()
				{
					//System.out.println("onPong()");
				}
			});
				
			// Establish WebSocket Connection
			websocket.connect();
			
			webSocketObject = new WebSocketObject(websocket);
			
			//
			// getVersion
			// 
			
			String[] getVersionMsg = {
				"method", "getVersion",
				"params{}"};
				
			String sReq = ConstructMessage(getVersionMsg);
			websocket = webSocketObject.getWebSocket();
			websocket.send(sReq);


			//
			// streamListen, Debug
			//
	
			
			ParamAr = new ArrayList();
			ParamAr.add((String)"Debug");
	
			String[] getStreamListen1Msg = {
				"method", "streamListen",
				"params",
				"streamId", "[]",
				"}"};
	
			sReq = ConstructMessage(getStreamListen1Msg);
			websocket = webSocketObject.getWebSocket();
			websocket.send(sReq);
			
			//
			// streamListen, Isolate
			//
			
			ParamAr = new ArrayList();
			ParamAr.add((String)"Isolate");
	
			String[] getStreamListen2Msg = {
				"method", "streamListen",
				"params",
				"streamId", "[]",
				"}"};
	
			sReq = ConstructMessage(getStreamListen2Msg);
			websocket = webSocketObject.getWebSocket();
			websocket.send(sReq);
			
			//
			// getVM, get isolateId
			//
			
			requestLatch = new CountDownLatch(1);
	
			String[] getVMMsg = {
				"method", "getVM",
				"params{}"};

			sReq = ConstructMessage(getVMMsg);
			websocket = webSocketObject.getWebSocket();
			websocket.send(sReq);
	
			try
			{
				requestLatch.await();
			}
			catch (InterruptedException ie)
			{
			}

			iLoc2 = g_sMessage.indexOf(ID_STRING);
			if ( iLoc2 != -1 )
			{
				iLoc3 = g_sMessage.indexOf((int)0x22, iLoc2 + 6);
				if ( iLoc3 != -1 )
				{
					sIsolateId = g_sMessage.substring(iLoc2 + 6, iLoc3);
					//System.out.println("sIsolateId: '"+sIsolateId+"'");
				}
			}
			
			//
			// getIsolate
			//
			
			requestLatch = new CountDownLatch(1);
					
			ParamAr = new ArrayList();
			ParamAr.add((String)Utils.filterObject(sIsolateId));
			
			String[] getIsoMsg = {
				"method", "getIsolate",
				"params",
				"isolateId", "[]",
				"}"};
	
			sReq = ConstructMessage(getIsoMsg);
			websocket = webSocketObject.getWebSocket();
			websocket.send(sReq);
	
			try
			{
				requestLatch.await();
			}
			catch (InterruptedException ie)
			{
			}

			// Get the package info..
			iLoc2 = g_sMessage.indexOf("package:", iLoc2);
			if ( iLoc2 != -1 )
			{
				iLoc3 = g_sMessage.indexOf((int)0x5c, iLoc2);	// '\'
				if ( iLoc3 != -1 )
				{
					// Like: 'minesweeper_flutter'
					sPackageString = g_sMessage.substring(iLoc2 + 8, iLoc3);
					//System.out.println("sPackageString: '"+sPackageString+"'");
				}
			}
			
			
			// Collect libraries..
			LibraryAr = new ArrayList();
			LibraryInfo libraryInfo;
			String sLibraryId = "";
			String sT2;
			
			iLoc2 = g_sMessage.indexOf("libraries");
			if ( iLoc2 != -1 )
			{
				while ( true )
				{
					iLoc3 = g_sMessage.indexOf("@Library", iLoc2);
					if ( iLoc3 != -1 )
					{
						iLoc4 = g_sMessage.indexOf(ID_STRING, iLoc3);
						if ( iLoc4 != -1 )
						{
							iLoc5 = g_sMessage.indexOf((char)0x22, iLoc4 + 6);
							if ( iLoc5 != -1 )
							{
								sLibraryId = g_sMessage.substring(iLoc4 + 6, iLoc5);
								//System.out.println("sLibraryId: '"+sLibraryId+"'");
							}
						
							iLoc4 = g_sMessage.indexOf("uri", iLoc4);
							if ( iLoc4 != -1 )
							{
								iLoc5 = g_sMessage.indexOf((char)0x22, iLoc4 + 6);
								if ( iLoc5 != -1 )
								{
									libraryInfo = new LibraryInfo();
									
									sT2 = g_sMessage.substring(iLoc4 + 6, iLoc5);
									iLoc6 = sT2.indexOf("package:");
									if ( iLoc6 != -1 )
										libraryInfo.bIsPackage = true;
									else
										libraryInfo.bIsPackage = false;
									
									libraryInfo.sLibraryId = sLibraryId;
									LibraryAr.add((LibraryInfo)libraryInfo);
								}
							}
						}
					}
					else
						break;
					
					iLoc2 = iLoc3 + 1;	// Next..
					
				}	// End while..
			}

			
			if ( (LibraryAr != null) && (LibraryAr.size() > 0) )
			{
				try
				{
					for ( int iZ = 0; iZ < LibraryAr.size(); iZ++ )
					{
						libraryInfo = (LibraryInfo)LibraryAr.get(iZ);
					
						//
						// setLibraryDebuggable
						//
						
						ParamAr = new ArrayList();
						ParamAr.add((String)Utils.filterObject(sIsolateId));
						ParamAr.add((String)Utils.filterObject(libraryInfo.sLibraryId));
						if ( libraryInfo.bIsPackage )
							ParamAr.add((String)"true");
						else
							ParamAr.add((String)"false");
						
						String[] setLibraryDebuggableMsg = {
							"method", "setLibraryDebuggable",
							"params",
							"isolateId", "[]",
							"libraryId", "[]",
							"isDebuggable", "[d",
							"}"};
				
						sReq = ConstructMessage(setLibraryDebuggableMsg);
						websocket = webSocketObject.getWebSocket();
						websocket.send(sReq);
						
					}	// End for..
				}
				catch (WebSocketException wse)
				{
					wse.printStackTrace();
				}
			}

			
			//
			// getScripts, get scriptId(s)
			//
			
			requestLatch = new CountDownLatch(1);
					
			ParamAr = new ArrayList();
			ParamAr.add((String)Utils.filterObject(sIsolateId));
			
			String[] getScriptsMsg = {
				"method", "getScripts",
				"params",
				"isolateId", "[]",
				"}"};
	
			sReq = ConstructMessage(getScriptsMsg);
			websocket = webSocketObject.getWebSocket();
			websocket.send(sReq);
	
			try
			{
				requestLatch.await();
			}
			catch (InterruptedException ie)
			{
			}

			
			// Note:
			// It looks like the package name found
			// doesn't always match with what's in the
			// getScripts result!

			iLoc2 = 0;
			String sTScript = "";
			Scripts scripts;
			ScriptsAr = new ArrayList();
			
			while ( true )
			{
				iLoc2 = g_sMessage.indexOf("@Script", iLoc2);
				if ( iLoc2 != -1 )
				{
					iLoc3 = g_sMessage.indexOf(ID_STRING, iLoc2);
					if ( iLoc3 != -1 )
					{
						iLoc4 = g_sMessage.indexOf((int)0x22, iLoc3 + 6);
						if ( iLoc4 != -1 )
						{
							sTScript = g_sMessage.substring(iLoc3 + 6, iLoc4);
							iLoc5 = sTScript.indexOf("package");
							if ( iLoc5 != -1 )
							{
								scripts = new Scripts();
								scripts.sScriptId = sTScript;
								//System.out.println("(Add)sScriptId: '"+scripts.sScriptId+"'");
								ScriptsAr.add((Scripts)scripts);
							}
						}
					}
				}
				else
					break;
				
				iLoc2 = iLoc3;	// Next..
				
			}	// End while..
			


		}
		catch (WebSocketException wse)
		{
			wse.printStackTrace();
		}
		catch (URISyntaxException use)
		{
			use.printStackTrace();
		}

		//
		// Setup variable JTree..
		//
		
		Font defaultFont = new Font("Monospaced", Font.BOLD, 13);
		FontMetrics fontMetrics = mainPanel.getFontMetrics(defaultFont);
		int iChrW = fontMetrics.charWidth('X');

		DefaultMutableTreeNode root = new DefaultMutableTreeNode();
		DefaultTreeModel treeModel = new DefaultTreeModel(root);
		variableJTree = new JTree(treeModel);
/*		
		if ( variableJTree == null )
			System.out.println("variableJTree null");
		else
			System.out.println("variableJTree not null");
/**/		
		
		variableJTree.setEditable(false);
		variableJTree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		variableJTree.setShowsRootHandles(false);
		variableJTree.addTreeSelectionListener(variableSelectionListener);
		
		variableTreeScrollPane = new JScrollPane(variableJTree,
			JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		// Need to set the size before it gets added..
		Rectangle rect = variableJTree.getRowBounds(0);
		
		variableTreeScrollPane.setPreferredSize(new Dimension((int)(iChrW * 42), (int)((rect.height + 1) * 8)));
		variableJTree.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));		// top, left, bottom, right
		
		horzSplitPane.setRightComponent(variableTreeScrollPane);

		//System.out.println("Exiting DebugInit()");
		
	}	//}}}
	
	//{{{	ConstructMessage()
	private String ConstructMessage(String[] paramAr)
	{
		int iZ;
		String sT;
		StringBuffer outSb = new StringBuffer();
		//System.out.println("ConstructMessage()");
		iParamArIndex = 0;
		boolean bFirstPair = true;


/*
		if ( paramAr == null )
			System.out.println("paramAr null");
		else
		{
			System.out.println("paramAr.length: "+paramAr.length);
			for ( int iJ = 0; iJ < paramAr.length; iJ++ )
				System.out.println("["+iJ+"]: '"+paramAr[iJ]+"'");
		}
/**/

		outSb.append("{");

		outSb.append((char)0x22);
		outSb.append("id");
		outSb.append((char)0x22);
		outSb.append(":");
		outSb.append((char)0x22);
		outSb.append(iMessageId);
		outSb.append((char)0x22);
		outSb.append(",");

		iWaitForId = iMessageId;
		
		boolean bFirst = true;
		boolean bIsString;
		
		// Process paired tokens..
		for ( int iJ = 0; iJ < paramAr.length; )
		{
			//System.out.println("--TOP-- iJ: "+iJ);
			//System.out.println("paramAr["+iJ+"]: '"+paramAr[iJ]+"'");
			
			if ( paramAr[iJ].equals("params") )
			{
				// Handle 'params'..
				outSb.append(",");
				
				outSb.append((char)0x22);
				outSb.append("params");
				outSb.append((char)0x22);
				outSb.append(":{");
				
				for ( iZ = iJ + 1; iZ < paramAr.length; )
				{
					//System.out.println("--TOP-- iZ: "+iZ);
					if ( paramAr[iZ].equals("}") )
					{
						// End of 'params'..
						outSb.append("}");
						break;
					}
					
					if ( bFirst )
						bFirst = false;
					else
						outSb.append(",");
					
					if ( paramAr[iZ].equals("[") )
					{
						sT = paramAr[iZ + 1];
						sT = sT.trim();
						
						outSb.append((char)0x22);
						outSb.append(sT);
						outSb.append((char)0x22);
						outSb.append(":[");
						iZ += 2;
						bFirst = true;
						continue;
						
					}
					else if ( paramAr[iZ].equals("]") )
					{
						outSb.append("]");
						iZ += 1;
						continue;
					}
					
					outSb.append((char)0x22);
					outSb.append(paramAr[iZ]);
					outSb.append((char)0x22);
					outSb.append(":");

					bIsString = true;
					if ( paramAr[iZ + 1].equals("[d") )
					{
						bIsString = false;
					}
						
					if ( bIsString )						
						outSb.append((char)0x22);
				
					if ( (iZ + 1) < paramAr.length )
					{
						if ( paramAr[iZ + 1].equals("[]") || paramAr[iZ + 1].equals("[d") )
						{
							if ( iParamArIndex < ParamAr.size() )
							{
								outSb.append((String)ParamAr.get(iParamArIndex));
								iParamArIndex++;
							}
						}
						else
							outSb.append(paramAr[iZ + 1]);
					}
					
					if ( bIsString )
						outSb.append((char)0x22);
					
					iZ += 2;
					
				}	// End for..
				
				//System.out.println("Dropped out of params");
				iJ = iZ + 1;
				//System.out.println("(Updated)iJ: "+iJ);
			}
			else if ( paramAr[iJ].equals("params{}") )
			{
				outSb.append(",");
				
				outSb.append((char)0x22);
				outSb.append("params");
				outSb.append((char)0x22);
				outSb.append(":");
				outSb.append("{}");
				
				iJ++;
			}
			else
			{
				// Pair..
				if ( bFirstPair )
					bFirstPair = false;
				else
					outSb.append(",");
					
				outSb.append((char)0x22);
				outSb.append(paramAr[iJ]);
				outSb.append((char)0x22);
				outSb.append(":");
				
				outSb.append((char)0x22);
				if ( (iJ + 1) < paramAr.length )
					outSb.append(paramAr[iJ + 1]);
				
				outSb.append((char)0x22);
				
				iJ += 2;
			}
		}

		//System.out.println("Dropped out");
		
		outSb.append("}");
		
		iMessageId++;
		
		//System.out.println("outSb: '"+outSb.toString()+"'");
		//System.out.println("Exiting ConstructMessage()");
		return outSb.toString();
		
	}	//}}}

	//{{{	processMessage()
	public void processMessage(String sMessage)
	{
/*		
		try
		{
			processControl.acquire();			
		}
		catch (InterruptedException ie)
		{
		}
/**/

/*
		if ( sMessage == null )
			System.out.println("sMessage null");
		else
			System.out.println("sMessage.length(): "+sMessage.length());
/**/

		if ( (sMessage != null) && (sMessage.length() > 0) )
		{
			g_sMessage = sMessage;
			
			//if ( sMessage.length() < 7000 ) 
				//System.out.println("sMessage: "+sMessage);
			//else
				//System.out.println("sMessage: "+sMessage.substring(0, 7000)+"'");
		}
		else
			return;
		
		boolean bIsStreamNotify = false;
		boolean bUpdateSource = false;

/*		
		if ( completeLatch == null )
			System.out.println("completeLatch null");
		else
			System.out.println("completeLatch not null");
/**/
		//System.out.println("processMessage()");
		String sKind = "";
		String sProjectName = "";
		String sId;
		String sT2 = "";
		sBreakpointId = "";
		int iLoc2;
		int iLoc3;
		int iLoc4;
		int iLoc6;
		int iLoc7;
		int iLoc8;
		int iLoc9;
		int iX;
		int iZ;

		StringBuffer sB = new StringBuffer();
		
		// Get as early as possible..
		iLoc6 = sMessage.indexOf("streamNotify");
		if ( iLoc6 != -1 )
		{
			bIsStreamNotify = true;
			//System.out.println("In streamNotify");
			
			// Save message..
			eventQueue.add((String)sMessage);

			bProcessEventFinished = false;
			processEventBgThread = new ProcessEventBgThread();
			processEventBgThread.start();					

		}

		//		
		//	'error'..	
		//
		
		// Note:
		// For getScripts this can be an issue!
		// It's not defined in the result, above,
		// so it drops through to here, and it
		// can find 'error' in the text!

		iLoc3 = sMessage.indexOf(ERROR_STRING);
		if ( iLoc3 != -1 )
		{
			if ( iLoc3 < 30 )
			{
				//System.out.println("--- Error ---");
				sResultMessage = sMessage;
			}
		}

		if ( bIsStreamNotify == false )
		{
			int iNum = 0;
			boolean bIsGood = true;
			
			// Note:
			// Sometimes the "id" is at the front
			// and other times it's at the rear..
			
			// Note:
			// In this one weird case it "strung together"
			// two responses:
			
			// 
			// [java] sMessage: {"jsonrpc":"2.0","id":"2","result":{"type":"Success"}}?~?
			// {"jsonrpc":"2.0", "result":{"type":"VM","n			
			// Check end first..			
			iLoc2 = sMessage.lastIndexOf(ID_STRING);
			if ( iLoc2 != -1 )
			{
				iLoc3 = sMessage.indexOf((int)0x22, iLoc2 + 6);
				if ( iLoc3 != -1 )
				{
					try
					{
						iNum = Integer.parseInt(sMessage.substring(iLoc2 + 6, iLoc3));
						//System.out.println("iNum: "+iNum);
					}
					catch (NumberFormatException nfe)
					{
						System.out.println("Exception: "+nfe.toString());
					}
				}
			}
			
			if ( bIsGood == false )
			{
				iLoc2 = sMessage.indexOf(ID_STRING);
				if ( iLoc2 != -1 )
				{
					if ( iLoc2 < 20 )
					{
						iLoc3 = sMessage.indexOf((int)0x22, iLoc2 + 6);
						if ( iLoc3 != -1 )
						{
							try
							{
								iNum = Integer.parseInt(sMessage.substring(iLoc2 + 6, iLoc3));
								//System.out.println("iNum: "+iNum);
								
							}
							catch (NumberFormatException nfe)
							{
								System.out.println("Exception: "+nfe.toString());
								bIsGood = false;
							}
						}
					}
					else
						bIsGood = false;
				}
			}
			
			//System.out.println("bIsGood: "+bIsGood);
			//System.out.println("(id): "+iNum);
			//System.out.println("iWaitForId: "+iWaitForId);
			if ( iNum == iWaitForId )
			{
				if ( requestLatch != null )
					requestLatch.countDown();
			}
		}
/**/		

		//System.out.println("\nExiting processMessage()");
			
			
		//processControl.release();
		
	}	//}}}

	//{{{	ProcessEventBgThread
	class ProcessEventBgThread extends Thread
	{
		public void run()
		{
			//System.out.println("\nProcessEventBgThread run()");
			VariableInfo variableInfo;
			TabInfo tabInfo;
			VariableInfoAr = new ArrayList();
			String sReq;
			String sT;
			String sTokenPos = "";
			String sKind = "";
			String sMessage = "";
			boolean bMatched;
			//String sMessage = g_sMessage;
			//String sMessage = sStreamMessage;	// Use our saved version..

			//System.out.println("eventStack.size(): "+eventStack.size());
			//System.out.println("eventQueue.size(): "+eventQueue.size());
			
			//String sMessage = (String)eventStack.pop();
			
			try
			{
				sMessage = (String)eventQueue.remove();
			}
			catch (NoSuchElementException nsee)
			{
				System.out.println("Exception: "+nsee.toString());
			}
			
			//String sId = "";
			int iLoc;
			int iLoc2 = 0;
			int iLoc3;
			int iLoc4 = 0;
			int iLoc5;
			int iEndBrace = 0;
/*			
			if ( sMessage == null )
				System.out.println("sMessage null");
			else
				System.out.println("sMessage.length(): "+sMessage.length());
/**/

			iLoc = sMessage.indexOf("kind");
			if ( iLoc != -1 )
			{
				iLoc4 = sMessage.indexOf((int)0x22, iLoc + 7);
				if ( iLoc4 != -1 )
				{
					sKind = sMessage.substring(iLoc + 7, iLoc4);
					//System.out.println("sKind: '"+sKind+"'");
				}
			}
			
			iResumeTokenPos = 0;

			if ( sKind.equals("Resume") )
			{
				
				iPauseBreakpointTokenPos = 0;
				iLoc3 = sMessage.indexOf(TOKENPOS_STRING);
				if ( iLoc3 != -1 )
				{
					iLoc4 = sMessage.indexOf("}", iLoc3 + 10);
					if ( iLoc4 != -1 )
					{
						try
						{
							iResumeTokenPos = Integer.parseInt(sMessage.substring(iLoc3 + 10, iLoc4));
							//System.out.println("iResumeTokenPos: "+iResumeTokenPos);
						}
						catch (NumberFormatException nfe)
						{
						}
					}
				}
			}
			else if ( sKind.equals("BreakpointAdded") )
			{
				iLineMode = MODE_BREAKPOINT_ADDED;
				
				// Grab Breakpoint Id, like: 'breakpoints\/1'
				int iJ;
				iLoc3 = sMessage.indexOf("breakpoints");
				if ( iLoc3 != -1 )
				{
					for ( iJ = iLoc3; sMessage.charAt(iJ) != '"'; iJ++ );
					sBreakpointId = sMessage.substring(iLoc3, iJ);
					//System.out.println("sBreakpointId: '"+sBreakpointId+"'");
				}
				
				// Grab Script Id, like:
				// 'libraries\/@28388411\/scripts\/package%3Aclock_app%2Fclock%2Fhand_second.dart\/16f29762040'
				iLoc3 = sMessage.indexOf("libraries");
				if ( iLoc3 != -1 )
				{
					for ( iJ = iLoc3; sMessage.charAt(iJ) != '"'; iJ++ );
					sBreakpointScriptId = sMessage.substring(iLoc3, iJ);
					//System.out.println("sBreakpointScriptId: '"+sBreakpointScriptId+"'");
				}

				// Add Breakpoint..
				BreakpointInfo breakpointInfo = new BreakpointInfo();
				
				//System.out.println("iSelectedLine: "+iSelectedLine);
				//System.out.println("sBreakpointId: '"+sBreakpointId+"'");
				//System.out.println("sBreakpointScriptId: '"+sBreakpointScriptId+"'");
				
				breakpointInfo.iLineNumber = iSelectedLine;
				breakpointInfo.sBreakpointId = sBreakpointId;
				breakpointInfo.sScriptId = sBreakpointScriptId;
				
				BreakpointAr.add((BreakpointInfo)breakpointInfo);
				
			}
			else if ( sKind.equals("PauseBreakpoint") )
			{
				// Grab Breakpoint Id, like: 'breakpoints\/1'
				iLoc3 = sMessage.indexOf("breakpoints");
				if ( iLoc3 != -1 )
				{
					iLoc4 = sMessage.indexOf((int)0x22, iLoc3);
					if ( iLoc4 != -1 )
					{
						sBreakpointId = sMessage.substring(iLoc3, iLoc4);
						//System.out.println("sBreakpointId: '"+sBreakpointId+"'");
					}
				}
		
				// Grab Script Id
				// like: "libraries\/@27117998\/scripts\/package%3Aclock_app%2Fclock%2Fhand_minute.dart\/17006a99bdc"
				iLoc3 = sMessage.indexOf("libraries");
				if ( iLoc3 != -1 )
				{
					iLoc4 = sMessage.indexOf((int)0x22, iLoc3);
					if ( iLoc4 != -1 )
					{
						sBreakpointScriptId = sMessage.substring(iLoc3, iLoc4);
						//System.out.println("sBreakpointScriptId: '"+sBreakpointScriptId+"'");
					}
				}
				
				// Get first 'tokenPos'..
				iLoc3 = sMessage.indexOf(TOKENPOS_STRING);
				if ( iLoc3 != -1 )
				{
					iLoc4 = sMessage.indexOf("}", iLoc3);
					if ( iLoc4 != -1 )
					{
						sTokenPos = sMessage.substring(iLoc3 + 11, iLoc4);
						//System.out.println("sTokenPos: '"+sTokenPos+"'");
					}
					
					try
					{
						iPauseBreakpointTokenPos = Integer.parseInt(sTokenPos);
						//System.out.println("iPauseBreakpointTokenPos: "+iPauseBreakpointTokenPos);
					}
					catch (NumberFormatException nfe)
					{
						System.out.println("Exception: "+nfe.toString());
					}
				}
		

				// Determine if we should clear and
				// reset the variables..
				//System.out.println("sVariablesScriptId: '"+sVariablesScriptId+"'");
				//if ( sVariablesScriptId.equals(sBreakpointScriptId) )
				if ( (sVariablesScriptId.equals(sBreakpointScriptId)) || (sVariablesScriptId.equals("")) )
				{
					// No changes needed..
					//System.out.println("No changes");
				}
				else
				{
					//System.out.println("Possible changes");
					// Try to match with another tab..
					if ( (TabInfoAr != null) && (TabInfoAr.size() > 0) )
					{
						bMatched = false;
						for ( int iX = 0; iX < TabInfoAr.size(); iX++ )
						{
							tabInfo = (TabInfo)TabInfoAr.get(iX);
							//System.out.println("tabInfo.sScriptId: '"+tabInfo.sScriptId+"'");
							if ( sBreakpointScriptId.equals(tabInfo.sScriptId) )
							{
								bMatched = true;
								break;
							}
						}
						
						if ( bMatched )
						{
							// Reset variables..
							//System.out.println("\nMatched, resetting..");							
							VariableInfoLHm.clear();
							
							DefaultTreeModel model = (DefaultTreeModel)variableJTree.getModel();
							DefaultMutableTreeNode root = (DefaultMutableTreeNode)model.getRoot();
							root.removeAllChildren();
							model.reload();
							
							sVariablesScriptId = sBreakpointScriptId;
						}
					}
				}
				
				// Get variable info..
				iLoc3 = sMessage.indexOf(VARS_STRING);
				if ( iLoc3 != -1 )
				{
					iLoc4 = sMessage.indexOf("]", iLoc3);
					if ( iLoc4 != -1 )
					{
					}
				}
				
				ProcessBoundVariables(
					sMessage,
					false,		// Add all the information to VariableInfo..
					iLoc4);
				
			}

			updateSourceLines((long)0);			
			bProcessEventFinished = true;
			//System.out.println("Exiting ProcessEventBgThread");
		}
	}	//}}}

	//{{{	ProcessBoundVariables()
	public void	ProcessBoundVariables(String sMessage, boolean bDoUpdate, int iEndLoc)
	{
		//System.out.println("\nProcessBoundVariables()");
		String sClassName = "";
		String sName = "";
		String sDisplayClassName = "";
		String sClassId = "";
		String sObjectId = "";
		String sClassTargetId = "";
		String sKindName = "";
		String sLength = "";
		String sT = "";
		
		StringBuffer sB;
		VariableInfo variableInfo;
		
		int iLoc2 = 0;
		int iLoc3 = 0;
		int iLoc4 = 0;
		int iLoc5 = 0;
		int iLoc6 = 0;
		int iLoc7 = 0;
		int iLoc8 = 0;
		int iLoc9 = 0;
		int iLoc10 = 0;
		int iLoc11 = 0;
		int iLoc12 = 0;
		int iLoc14 = 0;
		int iEndBrace = 0;

		iLoc7 = 0;
		
		// Get variables in this Frame..											
		while ( true )
		{
			//System.out.println("++TOP++ BoundVariable");
			sDisplayClassName = "";
			
			// This should collect all Classes
			// and get their targetId used for evaluate..
			iLoc7 = sMessage.indexOf("BoundVariable", iLoc7);
			if ( iLoc7 != -1 )
			{
				if ( iLoc7 > iEndLoc )
					break;

				variableInfo = new VariableInfo();				
				iLoc8 = sMessage.indexOf(NAME_STRING, iLoc7);
				if ( iLoc8 != -1 )
				{
					iLoc9 = sMessage.indexOf((int)0x22, iLoc8 + 8);
					if ( iLoc9 != -1 )
					{
						// Like: 'time'
						g_sName = sMessage.substring(iLoc8 + 8, iLoc9);
						//System.out.println("g_sName: '"+g_sName+"'");
						
						if ( bDoUpdate == false )
						{
							variableInfo.sName = g_sName;
						}
					}

					iLoc6 = sMessage.indexOf("classes", iLoc8);
					if ( iLoc6 != -1 )
					{
						iLoc7 = sMessage.indexOf((int)0x22, iLoc6);
						if ( iLoc7 != -1 )
						{
							g_sClassId = sMessage.substring(iLoc6, iLoc7);
							//System.out.println("g_sClassId: '"+g_sClassId+"'");
							
							if ( bDoUpdate == false )
							{
								variableInfo.sClassId = g_sClassId;
							}
						}
					}
					
					iLoc3 = sMessage.indexOf(NAME_STRING, iLoc8 + 2);
					if ( iLoc3 != -1 )
					{
						iLoc4 = sMessage.indexOf((int)0x22, iLoc3 + 8);
						if ( iLoc4 != -1 )
						{
							// Like: 'DateTime'
							g_sClassName = sMessage.substring(iLoc3 + 8, iLoc4);
							//System.out.println("g_sClassName: '"+g_sClassName+"'");
							
							if ( bDoUpdate == false )
							{
								variableInfo.sClassName = g_sClassName;
							}
						}
					}
					
					iLoc10 = sMessage.indexOf("objects", iLoc8);
					if ( iLoc10 != -1 )
					{
						iLoc11 = sMessage.indexOf((int)0x22, iLoc10);
						if ( iLoc11 != -1 )
						{
							// We use this as the 'targetId' for
							// the evaluate for the Class..
							// Like: 'objects\/41'
							g_sObjectId = sMessage.substring(iLoc10, iLoc11);
							//System.out.println("g_sObjectId: '"+g_sObjectId+"'");
							
							iEndBrace = sMessage.indexOf("}", iLoc10);
							
							if ( bDoUpdate == false )
							{
								//variableInfo.sId = sObjectId;
								variableInfo.sObjectId = g_sObjectId;
							}
						}
					}

					// Note:
					// In the case of 'List'
					// it identifies it as "_vmType", and not a "Class"..
					
					// Is class..
					iLoc3 = sMessage.indexOf(VALUE_STRING, iLoc8);	// Locate the correct @Instance..
					if ( iLoc3 != -1 )
					{
						iLoc4 = sMessage.indexOf("@Instance", iLoc3);
						if ( iLoc4 != -1 )
						{
							iLoc5 = sMessage.indexOf((int)0x22, iLoc4 + 12);
							if ( iLoc5 != -1 )
							{
								sT = sMessage.substring(iLoc4 + 12, iLoc5);
								
								if ( bDoUpdate == false )
								{
									if ( sT.equals("class") )
										variableInfo.bIsClass = true;	// 'class' It's a class..
									else
										variableInfo.bIsClass = false;	// '_vmType'
								}
							}
						}
					}

					// 'valueAsString'..
					iLoc3 = sMessage.indexOf(VALUE_AS_STRING_STRING, iLoc3);
					if ( iLoc3 < iEndBrace )
					{
						if ( iLoc3 != -1 )
						{
							iLoc4 = sMessage.indexOf((int)0x22, iLoc3 + 17 );
							if ( iLoc4 != -1 )
							{
								// Like: '240.46946742441236'
								//if ( bDoUpdate == false )
								//{
									variableInfo.sValueAsString = sMessage.substring(iLoc3 + 17, iLoc4);
									//System.out.println("variableInfo.sValueAsString: '"+variableInfo.sValueAsString+"'");
								//}
							}
						}
					}

					// Look for List..								
					iLoc10 = sMessage.indexOf(KIND_STRING, iLoc8);
					if ( iLoc10 != -1 )
					{
						iLoc11 = sMessage.indexOf((int)0x22, iLoc10 + 8);
						if ( iLoc11 != -1 )
						{
							sKindName = sMessage.substring(iLoc10 + 8, iLoc11);
							//System.out.println("sKindName: '"+sKindName+"'");
							if ( sKindName.equals("List") )
							{
								// Use 'List' as the Class name..
								if ( bDoUpdate == false )
								{
									variableInfo.sClassName = sKindName;
								}
								
								// Get "length"..
								iLoc12 = sMessage.indexOf(LENGTH_STRING, iLoc10);
								if ( iLoc12 != -1 )
								{
									iLoc5 = sMessage.indexOf("}", iLoc12 + 9);
									if ( iLoc5 != -1 )
									{
										sLength = sMessage.substring(iLoc12 + 9, iLoc5);
										sLength = sLength.trim();
										//System.out.println("sLength: '"+sLength+"'");
										
										// Construct List display info..
										sB = new StringBuffer();
										sB.append("List (");
										sB.append(sLength);
										sB.append(" item");
										if ( sLength.equals("1") )
											;
										else
											sB.append("s");
										
										sB.append(")");
										sDisplayClassName = sB.toString();
										//System.out.println("sDisplayClassName: '"+sDisplayClassName+"'");
										
										//if ( bDoUpdate == false )
										//{
											variableInfo.sDisplayClassName = sDisplayClassName;
										//}
									}
								}
							}
						}
					}

				}
				
				//System.out.println("variableInfo.sName: '"+variableInfo.sName+"'");
				//System.out.println("variableInfo.sClassName: '"+variableInfo.sClassName+"'");
				//System.out.println("variableInfo.sClassId: '"+variableInfo.sClassId+"'");
				//System.out.println("variableInfo.sObjectId: '"+variableInfo.sObjectId+"'");
				//System.out.println("variableInfo.sDisplayClassName: '"+variableInfo.sDisplayClassName+"'");

				//System.out.println("bDoUpdate: "+bDoUpdate);				
				if ( bDoUpdate == false )
				{
					// Load everything..
/*
					if ( VariableInfoLHm.containsKey((String)variableInfo.sName) )
					{
						System.out.println("Not updating");
						;
					}
					else
					{
/**/
						//System.out.println("(put())variableInfo.sDisplayClassName: '"+variableInfo.sDisplayClassName+"'");
						VariableInfoLHm.put((String)variableInfo.sName, (VariableInfo)variableInfo);
						//System.out.println("(Full)(put())variableInfo.sName: '"+variableInfo.sName+"'");
					//}
				}
				else
				{
					variableInfo = (VariableInfo)VariableInfoLHm.get((String)g_sName); 
					if ( variableInfo != null )
					{
						variableInfo.sObjectId = g_sObjectId;
						variableInfo.sDisplayClassName = sDisplayClassName;
						//System.out.println("(Update)(put())variableInfo.sName: '"+variableInfo.sName+"'");
						VariableInfoLHm.put((String)variableInfo.sName, (VariableInfo)variableInfo);
					}
				}
				
			}
			else
				break;
			
			iLoc7 = iLoc8;	// Next..
			
		}	// End while..
		
		//System.out.println("Exiting ProcessBoundVariables()");
	}	//}}}
	
	//{{{	selectDeviceDialog()
	public void selectDeviceDialog()
	{
		//System.out.println("\n-- selectDeviceDialog() --");
		selectDeviceFrame = new JFrame();
		selectDeviceFrame.setLayout(new BorderLayout());		
		selectDeviceFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		selectDeviceFrame.setTitle("Select Device");
		selectDeviceFrame.setAlwaysOnTop(true);
		
		
		JPanel panel = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		JLabel deviceLbl = new JLabel("Device: ");

		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(4, 25, 4, 4);	// bottom, left, right, top
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		panel.add(deviceLbl, gbc);

/*
		if ( DevicesAr == null )
			System.out.println("DevicesAr null");
		else
			System.out.println("DevicesAr.size(): "+DevicesAr.size());
/**/		
				
		// Construct choices..
		String[] tSa;
		boolean bOk = false;
		boolean bConnect = false;
		int iSz = 0;
		
		if ( iSelectMode == SELECT_CONNECT )
		{
			if ( (ConnectDevicesAr != null) && (ConnectDevicesAr.size() > 0) )
			{
				iSz = ConnectDevicesAr.size();
				bOk = true;
				bConnect = true;
			}
		}
		else
		{
			if ( (DevicesAr != null) && (DevicesAr.size() > 0) )
			{
				iSz = DevicesAr.size();
				bOk = true;
			}
		}
		
		if ( bOk )
		{
			tSa = new String[iSz];
			for ( int g = 0; g < tSa.length; g++ )
			{
				if ( bConnect )
					tSa[g] = (String)ConnectDevicesAr.get(g);
				else
					tSa[g] = (String)DevicesAr.get(g);
			}

			SpinnerListModel deviceModel = new SpinnerListModel(tSa);		
			deviceSpinner = new JSpinner(deviceModel);
			
			deviceSpinner.setEditor(new JSpinner.DefaultEditor(deviceSpinner));	// Set as non-editable..
			deviceSpinner.setAlignmentX(Component.LEFT_ALIGNMENT);
			
			gbc = new GridBagConstraints();
			gbc.fill = GridBagConstraints.HORIZONTAL;
			gbc.insets = new Insets(4, 4, 4, 4);	// bottom, left, right, top
			
			gbc.gridx = 1;
			gbc.gridy = 0;
			gbc.gridwidth = 3;
			panel.add(deviceSpinner, gbc);
		}

		panel.setBorder(new LineBorder(Color.GRAY));
		
		JButton submitButton = new JButton("Submit");
		submitButton.setActionCommand("select_device_submit");
		submitButton.addActionListener(actListener);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setActionCommand("select_device_cancel");
		cancelButton.addActionListener(actListener);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(submitButton);
		buttonPanel.add(cancelButton);

		selectDeviceFrame.getContentPane().add(panel, BorderLayout.CENTER);
		selectDeviceFrame.getContentPane().add(buttonPanel, BorderLayout.PAGE_END);
		
		selectDeviceFrame.pack();
		selectDeviceFrame.setVisible(true);
		selectDeviceFrame.setResizable(false);
		
	}	//}}}
	
	//{{{	updateDialog()
	/**
     * Construct Dialog for Update
     */
	public void updateDialog()
	{
		//System.out.println("updateDialog()");
		iProjectDialog = UPDATE_DIALOG;
		
		updateFrame = new JFrame();
		updateFrame.setLayout(new BorderLayout());		
		updateFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		updateFrame.setTitle("Update");
		
		Color red = new Color((int)0xe4, (int)0x1b, (int)0x17, (int)255);		// Love Red
		
		JPanel panel = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		projectRadioButton = new JRadioButton("  Project");
		projectRadioButton.setSelected(true);
		projectRadioButton.addItemListener(projectItemListener);
		
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.insets = new Insets(4, 4, 4, 4);	// bottom, left, right, top
		panel.add(projectRadioButton, gbc);
		
		libProjectRadioButton = new JRadioButton("  Lib-Project");
		libProjectRadioButton.addItemListener(projectItemListener);

		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.insets = new Insets(4, 4, 4, 4);	// bottom, left, right, top
		panel.add(libProjectRadioButton, gbc);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(projectRadioButton);
		buttonGroup.add(libProjectRadioButton);
		
		JLabel targetSdkLbl = new JLabel("Target SDK: ");

		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(4, 4, 4, 4);	// bottom, left, right, top
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		panel.add(targetSdkLbl, gbc);

/*
		if ( targetDescAr == null )
			System.out.println("targetDescAr null");
		else
			System.out.println("targetDescAr not null");
/**/		
		// Construct Target API choices..
		String[] tSa;
		if ( (targetDescAr != null) && (targetDescAr.size() > 0) )
		{
			int iSz = targetDescAr.size();
			tSa = new String[iSz + 1];
			tSa = new String[iSz];
			for ( int g = 0; g < tSa.length; g++ )
			{
				if ( g == 0 )
					tSa[g] = "";
				else
					tSa[g] = (String)targetDescAr.get(g - 1);
			}

			SpinnerListModel targetSdkModel = new SpinnerListModel(tSa);		
			updateTargetSdkSpinner = new JSpinner(targetSdkModel);
			
			gbc = new GridBagConstraints();
			gbc.fill = GridBagConstraints.HORIZONTAL;
			gbc.insets = new Insets(4, 4, 4, 4);	// bottom, left, right, top
			gbc.gridx = 1;
			gbc.gridy = 1;
			gbc.gridwidth = 3;
			panel.add(updateTargetSdkSpinner, gbc);
		}
		
		JLabel projectPathLbl = new JLabel("Project Path: ");
		projectPathLbl.setForeground(red);	// Required..

		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(4, 4, 4, 4);	// bottom, left, right, top		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		panel.add(projectPathLbl, gbc);

		updateProjectPathField = new JTextField(30);

		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(4, 4, 4, 4);	// bottom, left, right, top
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 2;

		
		// Try to load Project Home..
		if ( (sProjectPathLead != null) && (! sProjectPathLead.equals("")) )
		{
			StringBuffer sb = new StringBuffer(sProjectPathLead);
			sb.append("/");
			
			updateProjectPathField.setText(sb.toString());
		}

		panel.add(updateProjectPathField, gbc);
		
		JButton chooseButton = new JButton("...");
		chooseButton.setActionCommand("project_path_chooser");
		chooseButton.addActionListener(actListener);
		
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(4, 4, 4, 4);	// bottom, left, right, top
		gbc.gridx = 3;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		panel.add(chooseButton, gbc);
		
		libraryPathLbl = new JLabel("Library:");

		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(4, 4, 4, 4);	// bottom, left, right, top
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		panel.add(libraryPathLbl, gbc);

		libraryPathField = new JTextField(30);

		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(4, 4, 4, 4);	// bottom, left, right, top
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.gridwidth = 2;

		panel.add(libraryPathField, gbc);
		
		libraryChooseButton = new JButton("...");
		libraryChooseButton.setActionCommand("library_chooser");
		libraryChooseButton.addActionListener(actListener);
		
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(4, 4, 4, 4);	// bottom, left, right, top
		gbc.gridx = 3;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		panel.add(libraryChooseButton, gbc);
		
		subprojectsCheckBox = new JCheckBox("    Subprojects");
		
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 3;
		gbc.insets = new Insets(4, 20, 4, 4);	// bottom, left, right, top
		panel.add(subprojectsCheckBox, gbc);
		
		panel.setBorder(new LineBorder(Color.GRAY));
		
		JButton submitButton = new JButton("Submit");
		submitButton.setActionCommand("update_submit");
		submitButton.addActionListener(actListener);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setActionCommand("update_cancel");
		cancelButton.addActionListener(actListener);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(submitButton);
		buttonPanel.add(cancelButton);

		updateFrame.getContentPane().add(panel, BorderLayout.CENTER);
		updateFrame.getContentPane().add(buttonPanel, BorderLayout.PAGE_END);
		
		updateFrame.pack();
		updateFrame.setVisible(true);
		updateFrame.setResizable(false);
		
	}	//}}}
	
	//{{{	createDialog()
	/**
     * Construct Dialog for Create 
     */
	public void createDialog()
	{
		//System.out.println("createDialog()");
/*
		if ( targetDescAr == null )
			System.out.println("targetDescAr null");
		else
			System.out.println("targetDescAr.size(): "+targetDescAr.size());
/**/

		if ( (targetDescAr != null) && (targetDescAr.size() == 0) )
		{
			JOptionPane.showMessageDialog(
				frame,
				"No Android SDK targets where found.\nAdd some with: tools/ android sdk or tools/bin/sdkmanager.",
				"Android SDK targets",
				JOptionPane.ERROR_MESSAGE);
			
			return;
		}
		
		minSdkSpinner = null;	// Reset..
		targetSdkSpinner = null;
		
		iProjectDialog = CREATE_DIALOG;
		Calendar cal = Calendar.getInstance();
		int iMonth = cal.get(Calendar.MONTH);

		String sAndroidPluginVersion = "";
		String sKotlinV = "";
		String sMonth = "";
		String sAPV = "";
		boolean bDoJSON = false;
		//boolean bUpdateProperties = false;
		int iPropMonth = 0;
		ObjectOutputStream out = null;
		FileInputStream fis = null;
		//Object objectHm = null;
		
		
		RefreshProperties();
		
		createFrame = new JFrame();
		createFrame.setLayout(new BorderLayout());		
		createFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		createFrame.setTitle("Create");
		
		Color red = new Color((int)0xe4, (int)0x1b, (int)0x17, (int)255);
		
		int iGridY;
		int iLocKp;
		int iLocKp2;
		String sJSON = "";
		String[] tSa = null;
		
		JPanel panel = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(4, 4, 4, 4);	// External padding of the component

		iGridY = 0;

		// Test if 'Use Flutter' is selected..
		boolean bFlutterSelected = uFlutterMenuItem.getState();
		if ( bFlutterSelected )
		{
			appRadioButton = new JRadioButton("  App");
			appRadioButton.setSelected(true);
			
			gbc.gridx = 0;
			gbc.gridy = iGridY;
			gbc.gridwidth = 1;
			panel.add(appRadioButton, gbc);

			packageRadioButton = new JRadioButton(" Package");
	
			gbc.gridx = 1;
			gbc.gridy = iGridY;
			gbc.gridwidth = 1;
			panel.add(packageRadioButton, gbc);

			pluginRadioButton = new JRadioButton(" Plugin");
	
			gbc.gridx = 2;
			gbc.gridy = iGridY;
			gbc.gridwidth = 1;
			panel.add(pluginRadioButton, gbc);
			
			ButtonGroup buttonGroup = new ButtonGroup();
			buttonGroup.add(appRadioButton);
			buttonGroup.add(packageRadioButton);
			buttonGroup.add(pluginRadioButton);
			
			iGridY++;
		}
		else
		{
			projectRadioButton = new JRadioButton("  Project");
			projectRadioButton.setSelected(true);
			projectRadioButton.addItemListener(projectItemListener);
			
			gbc.gridx = 0;
			gbc.gridy = iGridY;
			gbc.gridwidth = 1;
			panel.add(projectRadioButton, gbc);
			
			libProjectRadioButton = new JRadioButton("  Lib-Project");
			libProjectRadioButton.addItemListener(projectItemListener);
	
			gbc.gridx = 1;
			gbc.gridy = iGridY;
			gbc.gridwidth = 1;
			panel.add(libProjectRadioButton, gbc);
			
			ButtonGroup buttonGroup = new ButtonGroup();
			buttonGroup.add(projectRadioButton);
			buttonGroup.add(libProjectRadioButton);
			
			iGridY++;
		}

		//System.out.println("Application Name, iGridY: "+iGridY);	
		JLabel appNmLbl = new JLabel("Application Name: ");
		gbc.gridx = 0;
		gbc.gridy = iGridY;
		gbc.gridwidth = 1;
		panel.add(appNmLbl, gbc);

		if ( bFlutterSelected )
		{
			appNmField = new JTextField("hello_world", 30);
			appNmField.addFocusListener(appFocusListener);
			appNmField.addCaretListener(appCaretListener);
		}
		else
		{
			appNmField = new JTextField(30);
			appNmField.addFocusListener(appFocusListener);
		}
		
		gbc.gridx = 1;
		gbc.gridy = iGridY;
		gbc.gridwidth = 3;
		panel.add(appNmField, gbc);
		
		iGridY++;
		
		if ( bFlutterSelected )
		{
			organizationLbl = new JLabel("Organization: ");
			organizationLbl.setForeground(red);	// Required..
			gbc.gridx = 0;
			gbc.gridy = iGridY;
			gbc.gridwidth = 1;
			panel.add(organizationLbl, gbc);
	
			organizationField = new JTextField("com.example", 30);	
			organizationField.addCaretListener(orgCaretListener);
			gbc.gridx = 1;
			gbc.gridy = iGridY;
			gbc.gridwidth = 3;
			panel.add(organizationField, gbc);
			
			iGridY++;
		}

		if ( bFlutterSelected == false )
		{
			activityLbl = new JLabel("Activity Name: ");
			activityLbl.setForeground(red);	// Required..
			gbc.gridx = 0;
			gbc.gridy = iGridY;
			gbc.gridwidth = 1;
			panel.add(activityLbl, gbc);
	
			activityField = new JTextField(30);		
			gbc.gridx = 1;
			gbc.gridy = iGridY;
			gbc.gridwidth = 3;
			panel.add(activityField, gbc);
			
			iGridY++;
		}

		if ( bFlutterSelected == false )
		{
			//System.out.println("Package Name, iGridY: "+iGridY);
			JLabel packageLbl = new JLabel("Package Name: ");
			packageLbl.setForeground(red);	// Required..		
			gbc.gridx = 0;
			gbc.gridy = iGridY;
			gbc.gridwidth = 1;
			panel.add(packageLbl, gbc);
	
			packageField = new JTextField(30);
			packageField.addFocusListener(appFocusListener);
			gbc.gridx = 1;
			gbc.gridy = iGridY;
			gbc.gridwidth = 3;
			panel.add(packageField, gbc);
			
			iGridY++;
		}

		// Test if 'Use Gradle' is selected..
		// Note:
		// Flutter uses it's own Gradle Android Plugin Version,
		// so it doesn't need it..
		boolean bGradleSelected = uGradleMenuItem.getState();
		//System.out.println("bUseGradle: "+bUseGradle);
		if ( (bGradleSelected) && (bFlutterSelected == false) )
		{
			// Get Gradle version..
			StringBuffer sb = new StringBuffer();
			
			if ( iOS == LINUX_MAC )
			{
				sb.append("export PATH=${PATH}:");
				sb.append(gradlePathS);
				
				sb.append(";export JAVA_HOME=");
				sb.append(javaPathS);

				sb.append(";gradle -v");
			}
			else
			{
				sb.append("SET PATH=");
				sb.append(gradlePathS);
				sb.append(";%PATH%");

				// Need to specify JAVA_HOME for possible errors with
				// it not matching the JAVA_HOME Environment variable..
				sb.append("&&SET JAVA_HOME=");
				sb.append(javaPathS);
				
				sb.append("&&gradle -v");
				sb.append("\n");
			}
			
			internalCommandS = sb.toString();

			bCommandFinished = false;					
			commandBgThread = new CommandBgThread();
			commandBgThread.start();
			
			// Wait for Thread to end..
			while ( true )
			{
/*
				try
				{
					Thread.sleep(100);
				}
				catch (InterruptedException ie)
				{
				}
/**/
				
				Thread.yield();

				if ( bCommandFinished )
					break;
			}
			
			//System.out.println("commandResultS: '"+commandResultS+"'");	
			
			// gradle -version  Like:
			// ------------------------------------------------------------
			// Gradle 1.12
			// ------------------------------------------------------------
			
			int iLoc = commandResultS.indexOf("Gradle");
			int iLoc6;
			int iStart;
			boolean bGetLatestVersion = false;
			
			// Get JVM..
			iLoc6 = commandResultS.indexOf("JVM:");
			if ( iLoc6 != -1 )
			{
				iLoc6 = commandResultS.indexOf(".", iLoc6);
				if ( iLoc6 != -1 )
				{
					sJVMVersion = commandResultS.substring((iLoc6 + 1), (iLoc6 + 2));
					//System.out.println("sJVMVersion: '"+sJVMVersion+"'");
				}
			}
			
			String gradleVersionS = "";
			if ( iLoc != -1 )
			{
				int iG3;
				iStart = iLoc + 6;
				for ( iG3 = iStart; Character.isWhitespace(commandResultS.charAt(iG3)); iG3++ );
				iStart = iG3;
				for ( ; ! Character.isWhitespace(commandResultS.charAt(iG3)); iG3++ );
				gradleVersionS = commandResultS.substring(iStart, iG3);
				//System.out.println("gradleVersionS: '"+gradleVersionS+"'");

				if ( gradleVersionS.equals("2.10") ||
					gradleVersionS.equals("2.11") ||
					gradleVersionS.equals("2.12") ||
					gradleVersionS.equals("2.13") ||
					gradleVersionS.equals("2.14.1") )
				{
					sAndroidPluginVersion = "2.1.2";
					bDoBuildGradleUpdate = true;
				}
				else if ( gradleVersionS.equals("3.0") ||
					gradleVersionS.equals("3.1") ||
					gradleVersionS.equals("3.2") ||
					gradleVersionS.equals("3.2.1") )
				{
					// Note:
					// All these versions have problems..
					sAndroidPluginVersion = "2.1.3";
					bDoBuildGradleUpdate = true;
				}
				else if ( gradleVersionS.equals("3.3") ||
					gradleVersionS.equals("3.4") ||
					gradleVersionS.equals("3.4.1") ||
					gradleVersionS.equals("3.5") ||
					gradleVersionS.equals("3.5.1") ||
					gradleVersionS.equals("4.0") ||
					gradleVersionS.equals("4.0.1") ||
					gradleVersionS.equals("4.0.2") )
				{
					sAndroidPluginVersion = "2.3.0";
					bDoBuildGradleUpdate = true;
				}
				else if ( gradleVersionS.equals("4.1") ||
					gradleVersionS.equals("4.2") ||
					gradleVersionS.equals("4.2.1") ||
					gradleVersionS.equals("4.3") ||
					gradleVersionS.equals("4.3.1") )
				{
					//sAndroidPluginVersion = "3.0.0";	// Had issues..
					sAndroidPluginVersion = "2.3.0";
					bDoBuildGradleUpdate = true;
				}
				else if ( gradleVersionS.equals("4.4") ||
					gradleVersionS.equals("4.4.1") ||
					gradleVersionS.equals("4.5") ||
					gradleVersionS.equals("4.5.1") )
				{
					sAndroidPluginVersion = "3.1.0";
					bDoBuildGradleUpdate = true;
				}
				else if ( gradleVersionS.equals("4.6") ||
					gradleVersionS.equals("4.7") ||
					gradleVersionS.equals("4.8") ||
					gradleVersionS.equals("4.8.1") ||
					gradleVersionS.equals("4.9") ||
					gradleVersionS.equals("4.10") )
				{
					sAndroidPluginVersion = "3.2.0";
					bDoBuildGradleUpdate = true;
				}
				else if ( gradleVersionS.equals("4.10.1") ||
					gradleVersionS.equals("4.10.2") ||
					gradleVersionS.equals("4.10.3") ||
					gradleVersionS.equals("5.0") ||
					gradleVersionS.equals("5.1") )
				{
					sAndroidPluginVersion = "3.3.0";
					bDoBuildGradleUpdate = true;
				}
				else if ( gradleVersionS.equals("5.1.1") ||
					gradleVersionS.equals("5.2") ||
					gradleVersionS.equals("5.2.1") ||
					gradleVersionS.equals("5.3") ||
					gradleVersionS.equals("5.3.1") ||
					gradleVersionS.equals("5.4") )
				{
					sAndroidPluginVersion = "3.3.0";
					//sAndroidPluginVersion = "3.4.0";	// Had issues..
					bDoBuildGradleUpdate = true;
				}
				else if ( gradleVersionS.equals("5.4.1") ||
					gradleVersionS.equals("5.5") ||
					gradleVersionS.equals("5.5.1") ||
					gradleVersionS.equals("5.6") )
				{
					//sAndroidPluginVersion = "3.5.0";	// Had issues..
					sAndroidPluginVersion = "3.3.0";
					//sAndroidPluginVersion = "3.3.2";
					//sAndroidPluginVersion = "3.4.0";
					//sAndroidPluginVersion = "3.4.1";
					//sAndroidPluginVersion = "3.4.0";	// Had issues..
					bDoBuildGradleUpdate = true;
				}
				else if ( gradleVersionS.equals("5.6.1") ||
					gradleVersionS.equals("5.6.2") ||
					gradleVersionS.equals("5.6.3") )
				{
					sAndroidPluginVersion = "3.3.0";
					//sAndroidPluginVersion = "3.3.2";
					//sAndroidPluginVersion = "3.4.0";
					//sAndroidPluginVersion = "3.4.1";
					//sAndroidPluginVersion = "3.5.0";
					//sAndroidPluginVersion = "3.5.3";
					bDoBuildGradleUpdate = true;
					
				}
				else if ( gradleVersionS.equals("5.6.4") ||
					gradleVersionS.equals("6.0") ||
					gradleVersionS.equals("6.0.1") ||
					gradleVersionS.equals("6.1") ||
					gradleVersionS.equals("6.1.1") ||
					gradleVersionS.equals("6.2") ||
					gradleVersionS.equals("6.2.1") ||
					gradleVersionS.equals("6.2.2") )
				{
					sAndroidPluginVersion = "3.3.0";
					//sAndroidPluginVersion = "3.3.2";
					//sAndroidPluginVersion = "3.4.0";
					//sAndroidPluginVersion = "3.4.1";
					//sAndroidPluginVersion = "3.5.0";
					//sAndroidPluginVersion = "3.5.3";
					//sAndroidPluginVersion = "3.6.0";	// Says, requires Gradle 5.6.4
					bDoBuildGradleUpdate = true;
				}
				else if ( gradleVersionS.equals("2.4") ||
					gradleVersionS.equals("2.5") ||
					gradleVersionS.equals("2.6") ||
					gradleVersionS.equals("2.7") ||
					gradleVersionS.equals("2.8") ||
					gradleVersionS.equals("2.9") )
				{
					sAndroidPluginVersion = "1.5.0";
					bDoBuildGradleUpdate = true;
				}
				else if ( gradleVersionS.equals("2.3") )
				{
					sAndroidPluginVersion = "1.1.3";
					bDoBuildGradleUpdate = true;
				}
				else if ( gradleVersionS.equals("2.2.1") )
				{
					sAndroidPluginVersion = "1.0.0";
					bDoBuildGradleUpdate = true;
				}
				else if ( gradleVersionS.equals("2.2") )
				{
					sAndroidPluginVersion = "1.0.0";
					bDoBuildGradleUpdate = true;
				}
				else
				{
					//sAndroidPluginVersion = "3.4.0";
					sAndroidPluginVersion = "3.3.0";
				}
			}
		}

		//System.out.println("\nbKotlinSelected: "+bKotlinSelected);
		if ( bKotlinSelected )
		{
			//sKotlinVersion = "1.3.50";	// Issues..
			sKotlinVersion = "1.3.30";
			//sKotlinVersion = "1.3.70";
		}
		
		
/*
		if ( sKotlinVersion == null )
			System.out.println("sKotlinVersion null");
		else
			System.out.println("sKotlinVersion: '"+sKotlinVersion+"'");
/**/

/*
		if ( sAndroidPluginVersion == null )
			System.out.println("sAndroidPluginVersion null");
		else
			System.out.println("sAndroidPluginVersion: '"+sAndroidPluginVersion+"'");
/**/
		
		//System.out.println("bGradleSelected: "+bGradleSelected);
		if ( (bGradleSelected) && (bFlutterSelected == false) )
		{
			//System.out.println("Android Plugin Version, iGridY: "+iGridY);
			JLabel pluginVersionLbl = new JLabel("Android Plugin Version: ");
			pluginVersionLbl.setForeground(red);	// Required..
			gbc.gridx = 0;
			gbc.gridy = iGridY;
			gbc.gridwidth = 1;

			//System.out.println("(Set Field)sAndroidPluginVersion: '"+sAndroidPluginVersion+"'");
			if ( ! bGradleSelected )
				pluginVersionLbl.setEnabled(false);
			
			panel.add(pluginVersionLbl, gbc);
	
			pluginVersionField = new JTextField(30);		
			gbc.gridx = 1;
			gbc.gridy = iGridY;
			gbc.gridwidth = 3;
				
			if ( bGradleSelected )
				pluginVersionField.setText(sAndroidPluginVersion);
			else
				pluginVersionField.setEnabled(false);
	
			panel.add(pluginVersionField, gbc);
			
			iGridY++;

			//System.out.println("bKotlinSelected: "+bKotlinSelected);
			if ( bKotlinSelected )
			{
				//System.out.println("Kotlin Version, iGridY: "+iGridY);
				JLabel kotlinVersionLbl = new JLabel("Kotlin Version: ");
				gbc.gridx = 0;
				gbc.gridy = iGridY;
				gbc.gridwidth = 1;
				
				if ( ! bGradleSelected )
					kotlinVersionLbl.setEnabled(false);
				
				panel.add(kotlinVersionLbl, gbc);
		
				kotlinVersionField = new JTextField(30);		
				gbc.gridx = 1;
				gbc.gridy = iGridY;
				gbc.gridwidth = 3;

				//System.out.println("(Set Field)sKotlinVersion: '"+sKotlinVersion+"'");						
				kotlinVersionField.setText(sKotlinVersion);

				panel.add(kotlinVersionField, gbc);
			}
	
			iGridY++; // (5)


			//System.out.println("Build-tools Version, iGridY: "+iGridY);			
			JLabel buildToolsLbl = new JLabel("Build-tools Version: ");
			gbc.gridx = 0;
			gbc.gridy = iGridY;
			gbc.gridwidth = 1;
			panel.add(buildToolsLbl, gbc);
			
			String[] fileSa = null;
			
			if ( (FileAr != null) && (FileAr.size() > 0) )
			{
				fileSa = new String[FileAr.size()];
				for ( int j = 0; j < FileAr.size(); j++ )
				{
					fileSa[j] = (String)FileAr.get(j);
					//System.out.println("fileSa["+j+"]: '"+fileSa[j]+"'");
				}
			}
			
			SpinnerListModel buildToolsModel = new SpinnerListModel(fileSa);
			buildToolsSpinner = new JSpinner(buildToolsModel);

			// Default to latest..
			buildToolsSpinner.setValue((String)fileSa[FileAr.size() - 1]);
			
			gbc.gridx = 1;
			gbc.gridy = iGridY;
			gbc.gridwidth = 3;
			panel.add(buildToolsSpinner, gbc);
			
			iGridY++;

/*
			if ( (sShowSourceAndTargetCompatibility != null) && (sShowSourceAndTargetCompatibility.equals("true")) &&
				(bFlutterSelected == false) )
			{
				// Get Java version..
				// 'C:/Program Files/Java/jdk1.7.0_45'
				String sVersion = "";
				int iStart;
				int iVVal = 0;
				int iLoc6;
	
				iLoc6 = javaPathS.indexOf(".");
				if ( iLoc6 != -1 )
				{
					sJavaVersion = javaPathS.substring((iLoc6 + 1), (iLoc6 + 2));
				}
				
				try
				{
					iVVal = Integer.parseInt(sJavaVersion);
				}
				catch (NumberFormatException nfe)
				{
				}
				
				// Create ArrayList..
				ArrayList SourceAr = new ArrayList();
				StringBuffer sSb = new StringBuffer();
				String[] versionsSa;
	
				SourceAr.add((String)"");	// Empty choice..
				
				for ( ; iVVal >= 6; iVVal-- )
				{
					sSb = new StringBuffer("1.");
					sSb.append(iVVal);
	
					SourceAr.add((String)sSb.toString());
				}
	
				versionsSa = new String[SourceAr.size()];
				for ( int j = 0; j < SourceAr.size(); j++ )
					versionsSa[j] = (String)SourceAr.get(j);
	
				//System.out.println("sourceCompatibility, iGridY: "+iGridY);	
				JLabel sourceCLbl = new JLabel("sourceCompatibility: ");
				gbc.gridx = 0;
				gbc.gridy = iGridY;
				gbc.gridwidth = 1;
				panel.add(sourceCLbl, gbc);
				 
				SpinnerListModel sourceCModel = new SpinnerListModel(versionsSa);
				sourceCSpinner = new JSpinner(sourceCModel);
				gbc.gridx = 1;
				gbc.gridy = iGridY;
				gbc.gridwidth = 3;
				panel.add(sourceCSpinner, gbc);
	
				iGridY++;
	
				//System.out.println("targetCompatibility, iGridY: "+iGridY);
				JLabel targetCLbl = new JLabel("targetCompatibility: ");
				gbc.gridx = 0;
				gbc.gridy = iGridY;
				gbc.gridwidth = 1;
				panel.add(targetCLbl, gbc);
				 
				SpinnerListModel targetCModel = new SpinnerListModel(versionsSa);
				targetCSpinner = new JSpinner(targetCModel);
				gbc.gridx = 1;
				gbc.gridy = iGridY;
				gbc.gridwidth = 3;
				panel.add(targetCSpinner, gbc);
				
				iGridY++;
			}
/**/
		}
		else
		{
			// 'Build-tools Version' for Ant builds..
			//System.out.println("Build-tools Version, iGridY: "+iGridY);
			JLabel buildToolsLbl = new JLabel("Build-tools Version: ");
			gbc.gridx = 0;
			gbc.gridy = iGridY;
			gbc.gridwidth = 1;
			panel.add(buildToolsLbl, gbc);
			
			String[] fileSa = null;

			// Create array..
			if ( (FileAr != null) && (FileAr.size() > 0) )
			{
				fileSa = new String[FileAr.size()];
				
				for ( int j = 0; j < FileAr.size(); j++ )
				{
					fileSa[j] = (String)FileAr.get(j);
					//System.out.println("fileSa["+j+"]: '"+fileSa[j]+"'");
				}
			}
			 
			SpinnerListModel buildToolsModel = new SpinnerListModel(fileSa);
			buildToolsSpinner = new JSpinner(buildToolsModel);
			
			// Default to latest..
			buildToolsSpinner.setValue((String)fileSa[FileAr.size() - 1]);
			
			gbc.gridx = 1;
			gbc.gridy = iGridY;
			gbc.gridwidth = 3;
			panel.add(buildToolsSpinner, gbc);
			
			iGridY++;
		}
		
		// Check <uses-sdk>..
		boolean bUses = uSdkMenuItem.getState();
		//System.out.println("bUses: "+bUses);
		if ( bUses )
		{
			//System.out.println("Minimum SDK, iGridY: "+iGridY);
			//System.out.println("Minimum SDK");
			if ( bFlutterSelected )
			{
				int iSz = fullSDKSa.length;
				int i = 1;
				int j = 0;
				//System.out.println("iSz: "+iSz);
				tSa = new String[iSz + 1];
				tSa[0] = "";
				for ( ; j < iSz; i++, j++ )
				{
					//System.out.println("i: "+i+"   j: "+j);
					tSa[i] = fullSDKSa[j];
				}
			}
			
			// Show..
			JLabel minSdkLbl = new JLabel("Minimum SDK: ");
			minSdkLbl.setForeground(red);	// Required..
			gbc.gridx = 0;
			gbc.gridy = iGridY;
			gbc.gridwidth = 1;
			panel.add(minSdkLbl, gbc);
			 
			SpinnerListModel minSdkModel;
			if ( bFlutterSelected )
				minSdkModel = new SpinnerListModel(tSa);
			else
				minSdkModel = new SpinnerListModel(fullSDKSa);
			
			minSdkSpinner = new JSpinner(minSdkModel);
			gbc.gridx = 1;
			gbc.gridy = iGridY;
			gbc.gridwidth = 3;
			panel.add(minSdkSpinner, gbc);
			
			iGridY++;
		}
			
		//System.out.println("Target SDK, iGridY: "+iGridY);
		JLabel targetSdkLbl = new JLabel("Target SDK: ");
		targetSdkLbl.setForeground(red);	// Required..
		gbc.gridx = 0;
		gbc.gridy = iGridY;
		gbc.gridwidth = 1;
		panel.add(targetSdkLbl, gbc);
		
		// Construct Target API choices..
		int iSz = targetDescAr.size();
		int i = 0;
		int j = 0;

		if ( bFlutterSelected )
		{
			i = 1;
			iSz++;
		}
		
		//System.out.println("iSz: "+iSz);
		tSa = new String[iSz];
		
		//if ( (bFlutterSelected) || (bEmpty) )
		if ( bFlutterSelected )
			tSa[0] = "";
		
		for ( ; j < targetDescAr.size(); i++, j++ )
		{
			//System.out.println("i: "+i+"   j: "+j);
			tSa[i] = (String)targetDescAr.get(j);
			//System.out.println("tSa["+i+"]: '"+tSa[i]+"'");
		}
		
		SpinnerListModel targetSdkModel = new SpinnerListModel(tSa);
		targetSdkSpinner = new JSpinner(targetSdkModel);
		gbc.gridx = 1;
		gbc.gridy = iGridY;
		gbc.gridwidth = 3;
		panel.add(targetSdkSpinner, gbc);
		
		iGridY++;

		//System.out.println("Project Path, iGridY: "+iGridY);
		JLabel projectPathLbl = new JLabel("Project Path: ");
		projectPathLbl.setForeground(red);	// Required..		
		gbc.gridx = 0;
		gbc.gridy = iGridY;
		gbc.gridwidth = 1;
		panel.add(projectPathLbl, gbc);

		projectPathField = new JTextField(30);		
		gbc.gridx = 1;
		gbc.gridy = iGridY;
		gbc.gridwidth = 2;

/*		
		if ( sProjectPathLead == null )
			System.out.println("sProjectPathLead null");
		else
			System.out.println("sProjectPathLead: '"+sProjectPathLead+"'");
/**/

		// Try to load Project Home..		
		if ( (sProjectPathLead != null) && (! sProjectPathLead.equals("")) )
		{
			StringBuffer ppSb = new StringBuffer();
			ppSb.append(sProjectPathLead);
			ppSb.append("/");
			
			projectPathField.setText(ppSb.toString());
		}

		panel.add(projectPathField, gbc);
		
		JButton chooseButton = new JButton("...");
		chooseButton.setActionCommand("project_path_chooser");
		chooseButton.addActionListener(actListener);
		
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(4, 4, 4, 4);	// bottom, left, right, top
		gbc.gridx = 3;
		gbc.gridy = iGridY;
		gbc.gridwidth = 1;
		panel.add(chooseButton, gbc);


		panel.setBorder(new LineBorder(Color.GRAY));
		
		JButton submitButton = new JButton("Submit");
		submitButton.setActionCommand("create_submit");
		submitButton.addActionListener(actListener);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setActionCommand("create_cancel");
		cancelButton.addActionListener(actListener);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(submitButton);
		buttonPanel.add(cancelButton);

		createFrame.getContentPane().add(panel, BorderLayout.CENTER);
		createFrame.getContentPane().add(buttonPanel, BorderLayout.PAGE_END);
		
		createFrame.pack();
		createFrame.setVisible(true);
		createFrame.setResizable(false);
		
	}	//}}}

	//{{{	createGui()
	public void createGui()
	{
		//System.out.println("createGui()");
		Icon clean24Icon = new ImageIcon("images/clean24.png");
		Icon stepinto24Icon = new ImageIcon("images/stepinto24.png");
		Icon stepout24Icon = new ImageIcon("images/stepout24.png");
		Icon stepover24Icon = new ImageIcon("images/stepover24.png");
		Icon resume24Icon = new ImageIcon("images/resume24.png");
		Icon breakpoint24Icon = new ImageIcon("images/breakpoint24.png");
		Icon killserver24Icon = new ImageIcon("images/killserver24.png");
		Icon logcat24Icon = new ImageIcon("images/logcat24.png");
		Icon install24Icon = new ImageIcon("images/install24.png");
		Icon uninstall24Icon = new ImageIcon("images/uninstall24.png");
		Icon release24Icon = new ImageIcon("images/release24.png");
		Icon devices24Icon = new ImageIcon("images/devices24.png");
		debug24Icon = new ImageIcon("images/debug24.png");
		build24Icon = new ImageIcon("images/build24.png");
		Icon run24Icon = new ImageIcon("images/run24.png");
		Icon reload24Icon = new ImageIcon("images/reload24.png");
		Icon stop24Icon = new ImageIcon("images/stop24.png");
		
		iVariableMode = Constants.LOCAL;
		JMenu wirelessSubMenu;
		JMenuItem wirelessSubMenuItem;
		
		// Use BorderLayout..
		mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.addComponentListener(componentListener);

		GridBagLayout gridbag = new GridBagLayout();
		
		JPanel topPanel = new JPanel();
		topPanel.setLayout(gridbag);

		GridBagConstraints toolBarGbc = new GridBagConstraints();
		JToolBar toolBar = new JToolBar();
		
		cleanButton = new JButton();
		cleanButton.setIcon(clean24Icon);
		cleanButton.setActionCommand("Clean");
		cleanButton.setToolTipText("Clean");
		cleanButton.addActionListener(actListener);
		toolBar.add(cleanButton);
		
		debugButton = new JButton();
		if ( bNDKSelected )
		{
			debugButton.setIcon(build24Icon);
			debugButton.setActionCommand("Build");
			debugButton.setToolTipText("Build");
		}
		else
		{
			debugButton.setIcon(debug24Icon);
			debugButton.setActionCommand("Debug");
			debugButton.setToolTipText("Debug");
		}
		
		debugButton.addActionListener(actListener);
		toolBar.add(debugButton);
		
		releaseButton = new JButton();
		releaseButton.setIcon(release24Icon);
		releaseButton.setActionCommand("Pre_Release");
		releaseButton.setToolTipText("Release");
		releaseButton.addActionListener(actListener);
		toolBar.add(releaseButton);
		
		if ( bNDKSelected )
			releaseButton.setVisible(false);
		else
			releaseButton.setVisible(true);	
		
		toolBar.add(new JSeparator());

		JButton devicesButton = new JButton();
		devicesButton.setIcon(devices24Icon);
		devicesButton.setActionCommand("Devices");
		devicesButton.setToolTipText("Devices");
		devicesButton.addActionListener(actListener);
		toolBar.add(devicesButton);

		logcatToggleButton = new JToggleButton();
		logcatToggleButton.setIcon(logcat24Icon);
		logcatToggleButton.setActionCommand("Logcat");
		logcatToggleButton.setToolTipText("Logcat");
		logcatToggleButton.addActionListener(actListener);
		toolBar.add(logcatToggleButton);
		
		killButton = new JButton();
		killButton.setIcon(killserver24Icon);
		killButton.setActionCommand("Kill-Server");
		killButton.setToolTipText("Kill-Server");
		killButton.addActionListener(actListener);
		toolBar.add(killButton);

		stopButton = new JButton();
		stopButton.setIcon(stop24Icon);
		stopButton.setActionCommand("Stop");
		stopButton.setToolTipText("Stop");
		stopButton.addActionListener(actListener);
		toolBar.add(stopButton);

		JButton uninstallButton = new JButton();
		uninstallButton.setIcon(uninstall24Icon);
		uninstallButton.setActionCommand("Uninstall");
		uninstallButton.setToolTipText("Uninstall");
		uninstallButton.addActionListener(actListener);
		toolBar.add(uninstallButton);

		JButton installButton = new JButton();
		installButton.setIcon(install24Icon);
		installButton.setActionCommand("Install");
		installButton.setToolTipText("Install");
		installButton.addActionListener(actListener);
		toolBar.add(installButton);

		runButton = new JButton();
		runButton.setIcon(run24Icon);
		runButton.setActionCommand("Run");
		runButton.setToolTipText("Run");
		runButton.addActionListener(actListener);
		toolBar.add(runButton);

		reloadButton = new JButton();
		reloadButton.setIcon(reload24Icon);
		reloadButton.setActionCommand("Hot Reload");
		reloadButton.setToolTipText("Hot Reload");
		reloadButton.addActionListener(actListener);
		toolBar.add(reloadButton);

		Dimension sepDim = new Dimension(50, 0);
		toolBar.addSeparator(sepDim);

		/**
		 *		Debug Buttons
		 */

		JButton breakpointButton = new JButton();
		breakpointButton.setIcon(breakpoint24Icon);
		breakpointButton.setActionCommand("Breakpoint");
		breakpointButton.setToolTipText("Breakpoint");
		breakpointButton.addActionListener(actListener);
		toolBar.add(breakpointButton);

		JButton stepOverButton = new JButton();
		stepOverButton.setIcon(stepover24Icon);
		stepOverButton.setActionCommand("Step Over");
		stepOverButton.setToolTipText("Step Over");
		stepOverButton.addActionListener(actListener);
		toolBar.add(stepOverButton);
		
		JButton stepIntoButton = new JButton();
		stepIntoButton.setIcon(stepinto24Icon);
		stepIntoButton.setActionCommand("Step Into");
		stepIntoButton.setToolTipText("Step Into");
		stepIntoButton.addActionListener(actListener);
		toolBar.add(stepIntoButton);
		
		JButton stepOutButton = new JButton();
		stepOutButton.setIcon(stepout24Icon);
		stepOutButton.setActionCommand("Step Out");
		stepOutButton.setToolTipText("Step Out");
		stepOutButton.addActionListener(actListener);
		toolBar.add(stepOutButton);
		
		JButton resumeButton = new JButton();
		resumeButton.setIcon(resume24Icon);
		resumeButton.setActionCommand("Resume");
		resumeButton.setToolTipText("Resume");
		resumeButton.addActionListener(actListener);
		toolBar.add(resumeButton);

		toolBar.setFloatable(false);

		toolBarGbc.gridy = 1;		
		toolBarGbc.gridheight = 1;
		toolBarGbc.gridwidth = GridBagConstraints.REMAINDER;
		toolBarGbc.fill = GridBagConstraints.HORIZONTAL;
		toolBarGbc.anchor = GridBagConstraints.WEST;

		/**
		 *		Menus
		 */

		GridBagConstraints menuBarGbc = new GridBagConstraints();
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu menu = new JMenu("Project");
		JMenuItem homeMenuItem = new JMenuItem("Home");
		homeMenuItem.addActionListener(actListener);
		
		subMenu = new JMenu("Recent Projects");
		JMenuItem subMenuItem = null;
		
		// Construct Submenu..
		// 'C:/Android/Dev/GT_Six~GRADLE'...
		String sOut = readStorage("recent.tmp");
		if ( (sOut != null) && (sOut.length() > 0) )
		{
			StringTokenizer st = new StringTokenizer(sOut, "~");
			int iCount = st.countTokens();
			int iLoc;
			String sTok;
			String sTitle;
			for ( int iG = 0; iG < iCount; iG++ )
			{
				sTok = st.nextToken();
				if ( (iG & 1) == 0 )
				{
					// Get title..
					iLoc = sTok.lastIndexOf('/');
					if ( iLoc != -1 )
					{
						sTitle = sTok.substring(iLoc + 1);
						//System.out.println("sTitle: '"+sTitle+"'");
						subMenuItem = new JMenuItem(sTitle);
						subMenuItem.addActionListener(actListener);
						subMenu.add(subMenuItem);
					}
				}
			}
		}
		
		JMenuItem createMenuItem = new JMenuItem("Create");
		createMenuItem.addActionListener(actListener);
		updateMenuItem = new JMenuItem("Update");
		updateMenuItem.addActionListener(actListener);
		JMenuItem selectDeviceMenuItem = new JMenuItem("Select Device");
		selectDeviceMenuItem.addActionListener(actListener);
		JMenuItem pullMenuItem = new JMenuItem("Pull Files");
		pullMenuItem.addActionListener(actListener);

		wirelessSubMenu = new JMenu("Wireless");
		wirelessSubMenuItem = new JMenuItem("Re/Connect");
		wirelessSubMenuItem.setActionCommand("wireless_connect");
		wirelessSubMenuItem.addActionListener(actListener);
		wirelessSubMenu.add(wirelessSubMenuItem);
		wirelessSubMenuItem = new JMenuItem("Disconnect");
		wirelessSubMenuItem.setActionCommand("wireless_disconnect");
		wirelessSubMenuItem.addActionListener(actListener);
		wirelessSubMenu.add(wirelessSubMenuItem);

		JMenuItem gpsMenuItem = new JMenuItem("Send location");
		gpsMenuItem.addActionListener(actListener);
		JMenuItem searchMenuItem = new JMenuItem("Search");
		searchMenuItem.addActionListener(actListener);
		JMenuItem selectAllMenuItem = new JMenuItem("Select All");
		selectAllMenuItem.addActionListener(actListener);

		uSdkMenuItem = new JCheckBoxMenuItem("Add <uses-sdk>");		// Doesn't use a Listener..
		uGradleMenuItem = new JCheckBoxMenuItem("Use Gradle", bGradleSelected);
		uGradleMenuItem.addItemListener(itemListener);
		uFlutterMenuItem = new JCheckBoxMenuItem("Use Flutter", bFlutterSelected);
		uFlutterMenuItem.addItemListener(itemListener);
		uKotlinMenuItem = new JCheckBoxMenuItem("Use Kotlin", bKotlinSelected);
		uKotlinMenuItem.addItemListener(itemListener);
		uNDKMenuItem = new JCheckBoxMenuItem("Use NDK", bNDKSelected);
		uNDKMenuItem.addItemListener(itemListener);

		menu.add(homeMenuItem);
		menu.add(subMenu);
		menu.add(createMenuItem);
		menu.add(updateMenuItem);
		menu.add(selectDeviceMenuItem);
		menu.add(pullMenuItem);
		menu.add(wirelessSubMenu);
		menu.add(gpsMenuItem);
		menu.add(searchMenuItem);
		menu.add(selectAllMenuItem);
		menu.addSeparator();
		menu.add(uSdkMenuItem);
		menu.add(uGradleMenuItem);
		menu.add(uFlutterMenuItem);
		menu.add(uKotlinMenuItem);
		menu.add(uNDKMenuItem);
		menuBar.add(menu);

		/**
		 *		Debug Menu
		 */

		JMenu debugMenu = new JMenu("Debug");
		JMenuItem breakpointsMenuItem = new JMenuItem("Breakpoints");
		breakpointsMenuItem.addActionListener(actListener);
		JMenuItem refreshMenuItem = new JMenuItem("Refresh Classes");
		if ( bFlutterSelected ) 
			refreshMenuItem.setEnabled(false);
		else
			refreshMenuItem.addActionListener(actListener);
		
		JMenuItem stackMenuItem = new JMenuItem("Dump Stack");
		stackMenuItem.addActionListener(actListener);
		JMenuItem disconnectMenuItem = new JMenuItem("Disconnect");
		disconnectMenuItem.addActionListener(actListener);
		
		debugMenu.add(breakpointsMenuItem);
		debugMenu.add(refreshMenuItem);
		debugMenu.add(stackMenuItem);
		debugMenu.add(disconnectMenuItem);
		menuBar.add(debugMenu);

		/**
		 *		Window
		 */

		JMenu windowMenu = new JMenu("Window");
		ButtonGroup paneButtonGroup = new ButtonGroup();
		
		buildMenuItem = new JRadioButtonMenuItem("Build");
		buildMenuItem.setSelected(true);	// Default..
		paneButtonGroup.add(buildMenuItem);
		buildMenuItem.addItemListener(windowItemListener);
		debugMenuItem = new JRadioButtonMenuItem("Debug");
		paneButtonGroup.add(debugMenuItem);
		debugMenuItem.addItemListener(windowItemListener);

		windowMenu.add(buildMenuItem);
		windowMenu.add(debugMenuItem);
		menuBar.add(windowMenu);

		menuBarGbc.gridy = 0;		
		menuBarGbc.gridheight = 1;
		menuBarGbc.weightx = 1.0;
		menuBarGbc.gridwidth = GridBagConstraints.REMAINDER;
		menuBarGbc.fill = GridBagConstraints.HORIZONTAL;
		menuBarGbc.anchor = GridBagConstraints.WEST;

		topPanel.add(menuBar, menuBarGbc);
		topPanel.add(toolBar, toolBarGbc);

		// Our CardLayout..
		cardLayout = new CardLayout();
		
		/**
		 *		Create JPanel that contains the cards..
		 */
		
		cardPanel = new JPanel();
		cardPanel.setLayout(cardLayout);


		/**
		 *		Build Pane
		 */

		iFontSize = 13;

		Dimension dim = new Dimension();
		dim = topPanel.getPreferredSize();

		Font defaultFont = new Font("Monospaced", Font.BOLD, iFontSize);
		FontMetrics fontMetrics = mainPanel.getFontMetrics(defaultFont);
		
		int iChrW = fontMetrics.charWidth('X');
		int iHgt = fontMetrics.getHeight();
		
		topPanel.setPreferredSize(new Dimension(iChrW * DISPLAY_WIDTH, (int)dim.getHeight()));	// Original
		mainPanel.add(topPanel, BorderLayout.NORTH);	// Original

		UIDefaults defs = UIManager.getDefaults();
		defs.put("TextPane.background", new ColorUIResource(Color.BLACK));
		defs.put("TextPane.inactiveBackground", new ColorUIResource(Color.BLACK));
		
		//defs.put("TextPane.foreground", new ColorUIResource(Color.GREEN));

		StyleContext sc = new StyleContext();
		doc = new DefaultStyledDocument(sc);
		
		textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setPreferredSize(new Dimension(iChrW * DISPLAY_WIDTH, iHgt * 20));
		textPane.setBorder(BorderFactory.createEmptyBorder());	// Remove default (white) margin..
		
		normalStyle = sc.addStyle("Normal", null);
		normalStyle.addAttribute(StyleConstants.Foreground, new Color(224, 224, 224));
		normalStyle.addAttribute(StyleConstants.FontSize, new Integer(iFontSize));
		normalStyle.addAttribute(StyleConstants.FontFamily, "Monospaced");
		normalStyle.addAttribute(StyleConstants.Bold, new Boolean(true));

		warningStyle = sc.addStyle("Warning", null);
		warningStyle.addAttribute(StyleConstants.Foreground, new Color(255, 158, 13));
		warningStyle.addAttribute(StyleConstants.FontSize, new Integer(iFontSize));
		warningStyle.addAttribute(StyleConstants.FontFamily, "Monospaced");
		warningStyle.addAttribute(StyleConstants.Bold, new Boolean(true));

		errorStyle = sc.addStyle("Error", null);
		errorStyle.addAttribute(StyleConstants.Foreground, new Color(255, 25, 25));
		errorStyle.addAttribute(StyleConstants.FontSize, new Integer(iFontSize));
		errorStyle.addAttribute(StyleConstants.FontFamily, "Monospaced");
		errorStyle.addAttribute(StyleConstants.Bold, new Boolean(true));
		
		JScrollPane scrollPane = new JScrollPane(textPane,
			JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
			JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		scrollPane.setPreferredSize(new Dimension(iChrW * DISPLAY_WIDTH, iHgt * 20));

		cardPanel.add(scrollPane, (String)"BUILD_CARD");
		

		/**
		 *		Debug Pane
		 */

		JSplitPane vertSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		horzSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		horzSplitPane.setBorder(null);	// Don't let Borders accumulate..		

		// Left JTree component..
		DefaultMutableTreeNode root = new DefaultMutableTreeNode();
		DefaultTreeModel treeModel = new DefaultTreeModel(root);

		jTree = new JTree(treeModel);
		jTree.setEditable(false);
		jTree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		
		if ( bFlutterSelected )
			jTree.setShowsRootHandles(false);
		else
			jTree.setShowsRootHandles(true);
		
		jTree.addTreeSelectionListener(treeSelectionListener);
		
		treeScrollPane = new JScrollPane(jTree);

		// Need to set the size before it gets added..
		Rectangle rect = jTree.getRowBounds(0);
		treeScrollPane.setPreferredSize(new Dimension((int)(iChrW * 42), (int)((rect.height + 1) * 8)));
		//treeScrollPane.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
		jTree.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));		// top, left, bottom, right
		
		horzSplitPane.setLeftComponent(treeScrollPane);

		// JList component..
		jListVariableVector = new Vector();
		jList = new JList(jListVariableVector);
		ListCellRenderer renderer = new VariableListRenderer();
		jList.setCellRenderer(renderer);
		
		jList.addMouseListener(jListMouseListener);
		jList.setFont(defaultFont);
		listScrollPane = new JScrollPane(jList);
	
		horzSplitPane.setRightComponent(listScrollPane);

		// 	JTextPane component..
		defs = UIManager.getDefaults();
		defs.put("TextArea.background", new ColorUIResource(Color.BLACK));
		defs.put("TextArea.foreground", new ColorUIResource(Color.WHITE));
		defs.put("TextArea.inactiveBackground", new ColorUIResource(Color.BLACK));
		
		
		/**
		 * Create TabbedPane..
		 */
		 
		tabbedPane = new JTabbedPane();
		tabbedPane.addChangeListener(tabChangeListener);
/*		
		if ( tabbedPane == null )
			System.out.println("tabbedPane null");
		else
			System.out.println("tabbedPane: "+tabbedPane);
/**/				

		 addTab("  ");
		
		vertSplitPane.setBottomComponent(tabbedPane);
		vertSplitPane.setTopComponent(horzSplitPane);

		// Add to CardLayout..
		cardPanel.add(vertSplitPane, (String)"DEBUG_CARD");		
		 
		mainPanel.add(cardPanel, BorderLayout.CENTER);

		/**
		 *		Status Bar..
		 */
		
		Border loweredBevel = BorderFactory.createLoweredBevelBorder();
		
		JPanel statusBar = new JPanel();
		statusBar.setLayout(gridbag);
		GridBagConstraints gbc = new GridBagConstraints();
		
		statusLabel = new JLabel(" ");			// <-- (Set)
		statusLabel.setBorder(loweredBevel);

		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridx = 0;
		gbc.weightx = 1.0;
		gbc.insets = new Insets(2, 2, 2, 2);	// top left bottom right
		
		statusBar.add(statusLabel, gbc);
		
		deviceLabel = new JLabel(" ");			// <-- (Set)
		deviceLabel.setBorder(loweredBevel);

		if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
			statusLabel.setText(sDeviceName);
		
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridx = 1;
		gbc.weightx = 0.1;
		gbc.insets = new Insets(2, 2, 2, 2);	// top left bottom right
		
		statusBar.add(deviceLabel, gbc);
		
		statusPath = new JLabel(" ");			// <-- (Set)
		statusPath.setBorder(loweredBevel);
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.EAST;
		gbc.gridx = 2;
		gbc.weightx = 1.0;
		gbc.insets = new Insets(2, 2, 2, 2);	// top left bottom right
		
		statusBar.add(statusPath, gbc);
		
		dim = statusBar.getPreferredSize();
		statusBar.setPreferredSize(new Dimension(iChrW, (int)dim.getHeight()));
		statusBar.setMaximumSize(new Dimension(iChrW, (int)dim.getHeight()));
		
		mainPanel.add(statusBar, BorderLayout.SOUTH);
		
		cardLayout.show(cardPanel, "BUILD_CARD");	// Default..
		iCardShowing = BUILD_CARD;
	}	//}}}

	//{{{	initDebug()
	private void initDebug()
	{
		//System.out.println("\n== initDebug() ==");
		//System.out.println("bFlutterSelected: "+bFlutterSelected);
		
		if ( ioBgThread != null )
		{
			try
			{
				ioBgThread.interrupt();
			}
			catch (SecurityException se)
			{
			}
		}

		if ( bFlutterSelected == false )
		{
			bAdbThreadFinished = false;
			adbBgThread = new AdbBgThread();
			adbBgThread.start();
		}
/**/		
		//EventInfoHt = new Hashtable();
		defaultListModel = new DefaultListModel();
		 
		bMoveCursorToTop = false;
		lStepRequestId = 0;
		lCurrentMethodId = 0;
		
		BreakpointAr = new ArrayList();
		
		jTextArea.setText("");
		
		statusPath.setText(" ");

		StringBuffer sb = new StringBuffer();
		String pidS = "";

		if ( bFlutterSelected == false )
		{
			// Wait for Thread to finish..
			while ( true )
			{
				try
				{
					Thread.sleep(100);				
				}
				catch (InterruptedException ie)
				{
				}
	
				if ( bAdbThreadFinished )
				{
					break;
				}
			}
/**/
		}
		
		//System.out.println("Past bAdbThreadFinished");

		if ( bFlutterSelected == false )
		{
			try
			{
				SocketTransport.attach(Constants.REPLY_NORMAL_TIMEOUT,
					Constants.REPLY_NORMAL_TIMEOUT);
				//SocketTransport.attach(Constants.REPLY_REALLY_LONG_TIMEOUT,
					//Constants.REPLY_REALLY_LONG_TIMEOUT);
			}
			catch (IOException ioe)
			{
				System.out.println("(attach)Exception: "+ioe.toString());
				ioe.printStackTrace();
			}
			
			packetDispatcher = new PacketDispatcher();
	
			eventThread = new EventThread();
			eventThread.start();
	
			byte[] dataPacket;	// Common Packet data buffer used for EventRequest Set..
			int[] index = new int[1];
			
			JDWPCommands.command_IDSizes();
	
			// Try to get Main ThreadId..
			JDWPCommands.command_AllThreads();
	
			int iSz = AllThreadsAr.size();
			String sThreadNm = "";
			for ( int g = 0; g < iSz; g++ )
			{
				Long LVal = (Long)AllThreadsAr.get(g);
				long lThreadId = LVal.longValue();
				
				sThreadNm = JDWPCommands.command_Name(lThreadId);
				if ( (sThreadNm != null) && (sThreadNm.length() > 0) )
				{
					int iLoc = sThreadNm.indexOf("main");
					if ( iLoc != -1 )
					{
						lMainThreadId = lThreadId;
						break;
					}
				}
			}
		}

/*
		// Construct EventRequest Set for CLASS_PREPARE..
		// Construct the Data packet..
		dataPacket = new byte[256];
		for ( int g = 0; g < 256; g++ )
			dataPacket[g] = (byte)0x00;
		
		index[0] = 0;	// Starting location..
		
		Utils.setNextValueAsByte((byte)Constants.EVENT_KIND_CLASS_PREPARE, index, dataPacket);	// eventKind
		//Utils.setNextValueAsByte((byte)Constants.SUSPEND_THREAD_NONE, index, dataPacket);		// suspendPolicy
		Utils.setNextValueAsByte((byte)Constants.SUSPEND_THREAD_ALL, index, dataPacket);		// suspendPolicy
		//Utils.setNextValueAsInt(0, index, dataPacket);			// modifiers
		//Utils.setNextValueAsInt(2, index, dataPacket);			// modifiers
		Utils.setNextValueAsInt(1, index, dataPacket);
		
		Utils.setNextValueAsByte((byte)Constants.MOD_KIND_CLASS_MATCH, index, dataPacket);	// modKind
		Utils.setNextValueAsString("java.lang.NullPointerException", index, dataPacket);	//classPattern
		//Utils.setNextValueAsString("java.lang.Throwable", index, dataPacket);
		
		//Utils.setNextValueAsByte((byte)Constants.MOD_KIND_COUNT, index, dataPacket);	// modKind
		//Utils.setNextValueAsInt(1, index, dataPacket);		// count, Count before event.  One for one-off

		JDWPCommands.command_Set(dataPacket, index[0]);
/**/		

/*
		//String sT = Utils.convertSignature("java.lang.NullPointerException");
		//System.out.println("sT: '"+sT+"'");
		//long lRefType = JDWPCommands.command_ClassesBySignature("java.lang.NullPointerException");
		//long lRefType = JDWPCommands.command_ClassesBySignature("Ljava/lang/NullPointerException;");
		//long lRefType = JDWPCommands.command_ClassesBySignature("Ljava/lang/RuntimeException;");
		long lRefType = JDWPCommands.command_ClassesBySignature("Ljava/lang/Throwable;");
		//long lRefType = JDWPCommands.command_ClassesBySignature(sT);
		System.out.println("lRefType: "+lRefType);
/**/

/*
		dataPacket = new byte[256];
		for ( int g = 0; g < 256; g++ )
			dataPacket[g] = (byte)0x00;
		
		index[0] = 0;	// Starting location..
		
		Utils.setNextValueAsByte((byte)Constants.EVENT_KIND_EXCEPTION, index, dataPacket);	// eventKind
		Utils.setNextValueAsByte((byte)Constants.SUSPEND_THREAD_ALL, index, dataPacket);	// suspendPolicy
		//Utils.setNextValueAsByte((byte)Constants.SUSPEND_THREAD_NONE, index, dataPacket);
		Utils.setNextValueAsInt(1, index, dataPacket);			// modifiers

		Utils.setNextValueAsByte((byte)Constants.MOD_KIND_EXCEPTION_ONLY, index, dataPacket);	// modKind
		
		// java/lang/Throwable  ClassRefTypeId..
		//lThrowableRefTypeId = 0;	// Exception to report, null (0) means report exceptions of all types.
		lThrowableRefTypeId = lRefType;
		
		//System.out.println("lThrowableRefTypeId: "+lThrowableRefTypeId+"   "+Long.toHexString(lThrowableRefTypeId));
		Utils.setNextValueAsReferenceTypeID(lThrowableRefTypeId, index, dataPacket);	// referenceTypeID, Exception to report
		Utils.setNextValueAsByte((byte)Constants.FALSE, index, dataPacket);		// Report caught exceptions.
		//Utils.setNextValueAsByte((byte)Constants.TRUE, index, dataPacket);	// Report caught exceptions.
		Utils.setNextValueAsByte((byte)Constants.TRUE, index, dataPacket);		// Report uncaught exceptions.
		
		JDWPCommands.command_Set(dataPacket, index[0]);
/**/		


/*
		// This is what we where using!
		dataPacket = new byte[256];
		for ( int g = 0; g < 256; g++ )
			dataPacket[g] = (byte)0x00;
		
		index[0] = 0;	// Starting location..
		
		Utils.setNextValueAsByte((byte)Constants.EVENT_KIND_EXCEPTION, index, dataPacket);	// eventKind
		//Utils.setNextValueAsByte((byte)Constants.SUSPEND_THREAD_ALL, index, dataPacket);	// suspendPolicy
		Utils.setNextValueAsByte((byte)Constants.SUSPEND_THREAD_NONE, index, dataPacket);
		Utils.setNextValueAsInt(0, index, dataPacket);			// modifiers
		//Utils.setNextValueAsInt(1, index, dataPacket);
/**/

/*
		Utils.setNextValueAsByte((byte)Constants.MOD_KIND_EXCEPTION_ONLY, index, dataPacket);	// modKind
		
		// java/lang/Throwable  ClassRefTypeId..
		//lThrowableRefTypeId = 0;	// Exception to report, null (0) means report exceptions of all types.
		//lThrowableRefTypeId = lRefType;
		
		System.out.println("lThrowableRefTypeId: "+lThrowableRefTypeId+"   "+Long.toHexString(lThrowableRefTypeId));
		//Utils.setNextValueAsReferenceTypeID(lThrowableRefTypeId, index, dataPacket);	// referenceTypeID, Exception to report
		Utils.setNextValueAsReferenceTypeID(0, index, dataPacket);	// referenceTypeID, Exception to report

		Utils.setNextValueAsByte((byte)Constants.FALSE, index, dataPacket);		// Report caught exceptions.
		//Utils.setNextValueAsByte((byte)Constants.TRUE, index, dataPacket);	// Report caught exceptions.
		Utils.setNextValueAsByte((byte)Constants.TRUE, index, dataPacket);		// Report uncaught exceptions.
/**/

		//JDWPCommands.command_Set(dataPacket, index[0]);


/*
		// Construct EventRequest Set for CLASS_UNLOAD..
		// Construct the Data packet..
		dataPacket = new byte[128];
		for ( int g = 0; g < 128; g++ )
			dataPacket[g] = (byte)0x00;
		
		index[0] = 0;	// Starting location..
		
		Utils.setNextValueAsByte((byte)Constants.EVENT_KIND_CLASS_UNLOAD, index, dataPacket);		// eventKind
		Utils.setNextValueAsByte((byte)Constants.SUSPEND_THREAD_NONE, index, dataPacket);	// suspendPolicy
		Utils.setNextValueAsInt(0, index, dataPacket);			// modifiers

		JDWPCommands.command_Set(dataPacket, index[0]);
/**/		

/*
		// Construct EventRequest Set for EXCEPTION..
		// Construct the Data packet..
		System.out.println("\nConstructing Exception");
		dataPacket = new byte[256];
		for ( int g = 0; g < 256; g++ )
			dataPacket[g] = (byte)0x00;
		
		index[0] = 0;	// Starting location..
		
		Utils.setNextValueAsByte((byte)Constants.EVENT_KIND_EXCEPTION, index, dataPacket);	// eventKind
		Utils.setNextValueAsByte((byte)Constants.SUSPEND_THREAD_ALL, index, dataPacket);	// suspendPolicy
		Utils.setNextValueAsInt(1, index, dataPacket);			// modifiers

		Utils.setNextValueAsByte((byte)Constants.MOD_KIND_EXCEPTION_ONLY, index, dataPacket);	// modKind
		
		// java/lang/Throwable  ClassRefTypeId..
		lThrowableRefTypeId = 0;	// Exception to report, null (0) means report exceptions of all types.
		
		//System.out.println("lThrowableRefTypeId: "+lThrowableRefTypeId+"   "+Long.toHexString(lThrowableRefTypeId));
		Utils.setNextValueAsReferenceTypeID(lThrowableRefTypeId, index, dataPacket);	// referenceTypeID, Exception to report
		Utils.setNextValueAsByte((byte)Constants.FALSE, index, dataPacket);		// Report caught exceptions.
		//Utils.setNextValueAsByte((byte)Constants.TRUE, index, dataPacket);	// Report caught exceptions.
		Utils.setNextValueAsByte((byte)Constants.TRUE, index, dataPacket);		// Report uncaught exceptions.
		
		JDWPCommands.command_Set(dataPacket, index[0]);
/**/		

		//System.out.println("bFlutterSelected: "+bFlutterSelected);
		if ( bFlutterSelected )
			getDartSourceTree();
		else
		{
			getTreeClasses();
			findSourcePath();
		}

		if ( bFlutterSelected == false )
		{
			// Check SDK Source directory..
			StringBuffer nmSb = new StringBuffer("android-");
			nmSb.append(sSdkVersion);
			
			StringBuffer pathSb = new StringBuffer();
			pathSb.append(androidSdkPathS);
			pathSb.append("/sources/");
			pathSb.append(nmSb.toString());
			//System.out.println("\npathSb: '"+pathSb.toString()+"'");
			
			File file = new File(pathSb.toString());
			if ( file.exists() )
			{
				sSdkDir = nmSb.toString();
			}
		}
		
		//System.out.println("Exiting initDebug()");
	}	//}}}

	//{{{	InitWirelessBgThread
	class InitWirelessBgThread extends Thread
	{
		public void run()
		{
			//System.out.println("InitWirelessBgThread run()");

			StringBuffer internalSb = new StringBuffer();
			StringBuffer wIdSb = new StringBuffer();
			StringBuffer mSb;
			String sT = "";
			String sDevName = "";
			int iLoc1;
			int iLoc2;
			int iLoc3;
			int iEnd;
			int iStart;
			int iIndex;
			int iLongest = 0;
			
			ConnectDevicesAr = new ArrayList();

			boolean bOK = false;
			
			// Check devices..
			bOK = false;
			internalSb = new StringBuffer();
			
			if ( iOS == LINUX_MAC )
			{
				internalSb.append("export PATH=${PATH}:");
				internalSb.append(androidSdkPathS);
				internalSb.append("/platform-tools");

				internalSb.append(";adb devices");
			}
			else
			{
				internalSb.append("SET PATH=");
				internalSb.append(androidSdkPathS);
				internalSb.append("/platform-tools");
				internalSb.append(";%PATH%");
				
				internalSb.append("&&adb devices");
				internalSb.append("\n");
			}

			bInternalFinished = false;		
			internalCommandS = internalSb.toString();
			commandBgThread = new CommandBgThread();
			commandBgThread.start();
	
			// Wait for Thread to finish..
			while ( true )
			{
				try
				{
					Thread.sleep(200);
				}
				catch (InterruptedException ie)
				{
				}

				if ( bInternalFinished )
					break;
			}

			// Mix:
			// YT910A2GPY      device
			// emulator-5554   device
/*			
			if ( commandResultS == null )
				System.out.println("commandResultS null");
			else
				System.out.println("commandResultS: '"+commandResultS+"'");
/**/
			
			if ( (commandResultS != null) && (commandResultS.length() > 0) )
			{
				iIndex = 0;
				DevicesAr = new ArrayList();
				iLoc2 = commandResultS.indexOf("attached");
				if ( iLoc2 != -1 )
				{
					while ( true )
					{
						iLoc1 = commandResultS.indexOf("device", iLoc2);
						if ( iLoc1 != -1 )
						{
							// Scan back and get device name..
							for ( iLoc3 = iLoc1 - 1; Character.isWhitespace(commandResultS.charAt(iLoc3)); iLoc3-- );
							iEnd = iLoc3 + 1;
							
							for ( ; ! Character.isWhitespace(commandResultS.charAt(iLoc3)); iLoc3-- );
							iStart = iLoc3 + 1;
							sDevName = commandResultS.substring(iStart, iEnd);
							sDevName = sDevName.trim();
							//System.out.println("sDevName: '"+sDevName+"'");
							
							if ( sDevName.startsWith("emulator") )
								;
							else
							{
								// Device..
								bOK = true;
								ConnectDevicesAr.add((String)sDevName);
								//System.out.println("(Add): '"+sDevName+"'");
							}

							// All, longest first..
							if ( sDevName.length() > iLongest )
							{
								DevicesAr.add(0, (String)sDevName);
								iLongest = sDevName.length();
							}
							else
							{
								DevicesAr.add(iIndex, (String)sDevName);
							}
							
							iIndex++;
						}
						else
							break;
						
						iLoc1++;
						iLoc2 = iLoc1;
					}
				}
			}

			//System.out.println("bOK: "+bOK);
			if ( bOK )
			{
				bOK = false;
				
				if ( (ConnectDevicesAr != null) && (ConnectDevicesAr.size() > 0) )
				{
					if ( ConnectDevicesAr.size() == 1 )
					{
						// Single device..
						iWirelessErrorCode = 0;
						sDeviceName = (String)ConnectDevicesAr.get(0);
						sDeviceName = sDeviceName.trim();
						//System.out.println("(Single device)sDeviceName: '"+sDeviceName+"'");
					}
					else
					{
						// More than one device,
						// put up Select Dialog..
						iSelectMode = SELECT_CONNECT;
						bSelectFinished = false;
						selectDeviceDialog();
						
						// Wait for selection..
						while ( true )
						{
							try
							{
								Thread.sleep(200);
							}
							catch (InterruptedException ie)
							{
							}
			
							if ( bSelectFinished )
								break;
						}
					}
/*					
					if ( sDeviceName == null )
						System.out.println("(Selected device)sDeviceName null");
					else
						System.out.println("(Selected device)sDeviceName: '"+sDeviceName+"'");
/**/

				}
				
				// Get IP address..
				// Check if we have it..
				if ( (sDeviceIPAddress != null) && (sDeviceIPAddress.length() > 0) )
				{
					// Construct Wireless Id..
					wIdSb = new StringBuffer();
					sDeviceIPAddress = sDeviceIPAddress.trim();
					wIdSb.append(sDeviceIPAddress);
					wIdSb.append(":5555");
					sWirelessID = wIdSb.toString();
					bOK = true;
				}
				else
				{
					internalSb = new StringBuffer();
					if ( iOS == LINUX_MAC )
					{
						internalSb.append("export PATH=${PATH}:");
						internalSb.append(androidSdkPathS);
						internalSb.append("/platform-tools");
						
						//internalSb.append(";adb shell ip addr");
						internalSb.append(";adb -s ");
						internalSb.append(sDeviceName);
						internalSb.append(" shell ip addr");
						
						//internalSb.append(";adb shell ip addr show");
					}
					else
					{
						internalSb.append("SET PATH=");
						internalSb.append(androidSdkPathS);
						internalSb.append("/platform-tools");
						internalSb.append(";%PATH%");
						
						//internalSb.append("&&adb shell ip -f inet addr show");
						//internalSb.append("&&adb shell ip addr\"");
						internalSb.append("&&adb -s ");
						internalSb.append(sDeviceName);
						internalSb.append(" shell ip addr");
						internalSb.append("\n");

						//internalSb.append("&&adb shell ip addr show\"");
					}
			
					//System.out.println("internalSb: '"+internalSb.toString()+"'");
					
					bInternalFinished = false;		
					internalCommandS = internalSb.toString();
					commandBgThread = new CommandBgThread();
					commandBgThread.start();
			
					// Wait for Thread to finish..
					while ( true )
					{
						try
						{
							Thread.sleep(200);
						}
						catch (InterruptedException ie)
						{
						}
		
						if ( bInternalFinished )
							break;
					}
/*					
					if ( commandResultS == null )
						System.out.println("commandResultS null");
					else
						System.out.println("commandResultS: '"+commandResultS+"'");
/**/
	
					if ( (commandResultS != null) && (commandResultS.length() > 0) )
					{
						iLoc1 = commandResultS.indexOf("error");
						if ( iLoc1 != -1 )
						{
							// Error..
							iWirelessErrorCode = 1;
							sWirelessMessage = "Error: Could not get IP address.";
						}
						else
						{
							// Get inet address not depending on 'wlan0'..
							
							// Note:
							// It will also match with:
							// 'inet6 fe80::e263:e5ff:fe66:a576/64 scope link'
							
							// It can also not get 'error',
							// but still not find the inet IP address..
							
							iLoc1 = 0;
							while ( true )
							{
								iLoc1 = commandResultS.indexOf("inet", iLoc1);
								if ( iLoc1 != -1 )
								{
									// Check for 'inetn'..
									if ( Character.isWhitespace(commandResultS.charAt(iLoc1 + 4)) )
									{
										iLoc2 = commandResultS.indexOf(".", iLoc1);
										if ( iLoc2 != -1 )
										{
											iEnd = iLoc2;
											iStart = iLoc2 - 3;
											sT = commandResultS.substring(iStart, iEnd);
											//System.out.println("sT: '"+sT+"'");
											if ( sT.equals("127") )
												;
											else
											{
												iLoc2 = commandResultS.indexOf((int)0x2f, iLoc1);	// '/'
												iEnd = iLoc2;
												
												// Construct Wireless Id..
												wIdSb = new StringBuffer();
												wIdSb.append(commandResultS.substring(iStart, iEnd));
												wIdSb.append(":5555");
												sWirelessID = wIdSb.toString();
												//System.out.println("sWirelessID: '"+sWirelessID+"'");
												bOK = true;
												break;
											}
										}
									}
								}
								else
									break;
								
								iLoc1++;
							}	// End while..
							
							if ( bOK == false )
							{
								// Did not find IP address..
								// Error..
								iWirelessErrorCode = 1;
								sWirelessMessage = "Error: Could not get IP address.";
							}
						}
					}
				}

				internalSb = new StringBuffer();
				mSb = new StringBuffer();
				
				if ( iOS == LINUX_MAC )
				{
					internalSb.append("export PATH=${PATH}:");
					internalSb.append(androidSdkPathS);
					internalSb.append("/platform-tools");

					mSb = new StringBuffer();
					if ( (ConnectDevicesAr != null) && (ConnectDevicesAr.size() > 1) )
					{
						mSb.append(";adb -s ");
						mSb.append(sDeviceName);
						mSb.append(" tcpip 5555");
					}
					else
					{
						//mSb.append(";adb -s ");
						//mSb.append(sDeviceName);
						//mSb.append(" tcpip 5555");
						mSb.append(";adb tcpip 5555");
					}
	
					internalSb.append(mSb.toString());
				}
				else
				{
					internalSb.append("SET PATH=");
					internalSb.append(androidSdkPathS);
					internalSb.append("/platform-tools");
					internalSb.append(";%PATH%");

					mSb = new StringBuffer();
					if ( (ConnectDevicesAr != null) && (ConnectDevicesAr.size() > 1) )
					{
						mSb.append("&&adb -s ");
						mSb.append(sDeviceName);
						mSb.append(" tcpip 5555");
					}
					else
					{
						//mSb.append("&&adb -s ");
						//mSb.append(sDeviceName);
						//mSb.append(" tcpip 5555\"");
						mSb.append("&&adb tcpip 5555");
					}
					
					mSb.append("\n");
					
					internalSb.append(mSb.toString());
				}
				
				//System.out.println("internalSb: '"+internalSb.toString()+"'");
	
				bInternalFinished = false;		
				internalCommandS = internalSb.toString();
				commandBgThread = new CommandBgThread();
				commandBgThread.start();
		
				// Wait for Thread to finish..
				while ( true )
				{
					try
					{
						Thread.sleep(200);
					}
					catch (InterruptedException ie)
					{
					}
	
					if ( bInternalFinished )
						break;
				}
/*				
				if ( commandResultS == null )
					System.out.println("commandResultS null");
				else
					System.out.println("commandResultS: '"+commandResultS+"'");
/**/

/*
				if ( commandResultS != null )
				{
					System.out.println();
					char cTChr;
					
					for ( int g = 0; g < commandResultS.length(); g++ )
					{
						cTChr = (char)commandResultS.charAt(g);
						if ( (cTChr < 0x20) || (cTChr > 0x7e) )
							System.out.print("["+Integer.toHexString((int)cTChr)+"]");
						else
							System.out.print(cTChr);
					}
					System.out.println();
				}
/**/

				if ( (commandResultS != null) && (commandResultS.length() > 0) )
				{
					iLoc2 = commandResultS.indexOf("restarting in TCP mode");
					if ( iLoc2 != -1 )
					{
						bOK = true;
					}
				}
			}
			else
			{
				// Error..
				iWirelessErrorCode = 1;
				sWirelessMessage = "Error: No device found.";
			}
			
			bInitWirelessFinished = true;
			//System.out.println("Exiting InitWirelessBgThread run()");
		}
	}	//}}}
	
	//{{{	ConnectWirelessBgThread
	class ConnectWirelessBgThread extends Thread
	{
		public void run()
		{
			//System.out.println("ConnectWirelessBgThread run()");
			StringBuffer internalSb = new StringBuffer();
			StringBuffer wIdSb;
			StringBuffer mSb;
			
			int iLoc1;
			int iLoc2;
			boolean bOK;
			iWirelessErrorCode = 0;
/*			
			if ( sWirelessID == null )
				System.out.println("sWirelessID null");
			else
				System.out.println("sWirelessID: '"+sWirelessID+"'");
/**/

			if ( (sWirelessID != null) && (sWirelessID.length() > 0) )
			{
				if ( iOS == LINUX_MAC )
				{
					internalSb.append("export PATH=${PATH}:");
					internalSb.append(androidSdkPathS);
					internalSb.append("/platform-tools");

					mSb = new StringBuffer();
					if ( (ConnectDevicesAr != null) && (ConnectDevicesAr.size() > 1) )
					{
						mSb.append(";adb -s ");
						
						// For initial Connect, original device name
						// for ReConnect, wirelessId..
						mSb.append(sDeviceName);
						mSb.append(" connect ");
						mSb.append(sWirelessID);
					}
					else
					{
						mSb.append(";adb connect ");
						mSb.append(sWirelessID);
					}

					internalSb.append(mSb.toString());
				}
				else
				{
					internalSb.append("SET PATH=");
					internalSb.append(androidSdkPathS);
					internalSb.append("/platform-tools");
					internalSb.append(";%PATH%");

					mSb = new StringBuffer();
					if ( (ConnectDevicesAr != null) && (ConnectDevicesAr.size() > 1) )
					{
						mSb.append("&&adb -s ");
						
						// For initial Connect, original device name
						// for ReConnect, wirelessId..
						mSb.append(sDeviceName);
						mSb.append(" connect ");
						mSb.append(sWirelessID);
					}
					else
					{
						mSb.append("&&adb connect ");
						mSb.append(sWirelessID);
					}

					mSb.append("\n");
					internalSb.append(mSb.toString());
				}
		
				//System.out.println("internalSb: '"+internalSb.toString()+"'");
				
				bInternalFinished = false;		
				internalCommandS = internalSb.toString();
				commandBgThread = new CommandBgThread();
				commandBgThread.start();
		
				// Wait for Thread to finish..
				while ( true )
				{
					try
					{
						Thread.sleep(500);
					}
					catch (InterruptedException ie)
					{
					}
	
					//Thread.yield();
		
					if ( bInternalFinished )
						break;
				}
				
				bOK = false;
/*				
				if ( commandResultS == null )
					System.out.println("commandResultS null");
				else
					System.out.println("commandResultS: '"+commandResultS+"'");
/**/

				if ( (commandResultS != null) && (commandResultS.length() > 0) )
				{
					iLoc1 = commandResultS.indexOf("connected to");
					if ( iLoc1 != -1 )
					{
						// Success..
						// Set to use 'sWirelessID' as the new device name for -s..
						sDeviceName = sWirelessID;
						//System.out.println("sDeviceName: '"+sDeviceName+"'");
						
/*						
						if ( (DevicesAr != null) && (DevicesAr.size() > 1) )
						{
							// Update status bar..
							deviceLabel.setText(sDeviceName);
						}
/**/						
						bWirelessConnected = true;	// Signal connected..
						bOK = true;
					}
					
					if ( bOK )
					{
						// Success..
					}
					else
					{
						// Error..
						//System.out.println("Connect failed");
						iWirelessErrorCode = 1;
						sWirelessMessage = "Error: Connect failed.";
					}
				}
			}
/*			
			if ( sDeviceName == null )
				System.out.println("sDeviceName null");
			else
				System.out.println("sDeviceName: '"+sDeviceName+"'");
/**/

			if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
				deviceLabel.setText(sDeviceName);
			else
				deviceLabel.setText(" ");
				
				
			//bConnectWirelessFinished = true;
			completeLatch.countDown();
		}
	}	//}}}
			
	//{{{	DisconnectWirelessBgThread
	class DisconnectWirelessBgThread extends Thread
	{
		public void run()
		{
			//System.out.println("DisconnectWirelessBgThread run()");
			StringBuffer internalSb = new StringBuffer();

			if ( (sWirelessID != null) && (sWirelessID.length() > 0) )
			{
				if ( iOS == LINUX_MAC )
				{
					internalSb.append("export PATH=${PATH}:");
					internalSb.append(androidSdkPathS);
					internalSb.append("/platform-tools");

					internalSb.append(";adb disconnect ");
					internalSb.append(sWirelessID);
					internalSb.append(";adb usb");	// No device/Id options for 'usb'..
				}
				else
				{
					internalSb.append("SET PATH=");
					internalSb.append(androidSdkPathS);
					internalSb.append("/platform-tools");
					internalSb.append(";%PATH%");

					internalSb.append("&&adb disconnect ");
					internalSb.append(sWirelessID);
					internalSb.append("&&adb usb");	// No device/Id options for 'usb'..
					internalSb.append("\n");
				}
		
				bInternalFinished = false;		
				internalCommandS = internalSb.toString();
				commandBgThread = new CommandBgThread();
				commandBgThread.start();
		
				// Wait for Thread to finish..
				while ( true )
				{
/*
					try
					{
						Thread.sleep(100);
					}
					catch (InterruptedException ie)
					{
					}
/**/
	
					Thread.yield();
		
					if ( bInternalFinished )
						break;
				}
			}

			bWirelessConnected = false;	// Reset..
			bDisconnectWirelessFinished = true;
		}
	}	//}}}
	
	//{{{	GetDevicesBgThread
	class GetDevicesBgThread extends Thread
	{
		public void run()
		{
			//System.out.println("GetDevicesBgThread run()");
			int iLoc;
			int iLoc2;
			int iLoc3;
			int iStart;
			int iEnd;
			int iIndex = 0;
			int iLongest = 0;
			String sDevice = "";
			
			DevicesAr = new ArrayList();
	
			StringBuffer internalSb = new StringBuffer();
			
			//System.out.println("androidSdkPathS: '"+androidSdkPathS+"'");
			
			if ( iOS == LINUX_MAC )
			{
				internalSb.append("export PATH=${PATH}:");
				internalSb.append(androidSdkPathS);
				internalSb.append("/platform-tools");
				
				internalSb.append(";adb kill-server");
				internalSb.append(";adb start-server");
				internalSb.append(";adb devices");
			}
			else
			{
				internalSb.append("SET PATH=");
				internalSb.append(androidSdkPathS);
				internalSb.append("/platform-tools");
				internalSb.append(";%PATH%");
				
				internalSb.append("&&adb kill-server");
				internalSb.append("&&adb start-server");
				internalSb.append("&&adb devices");
				internalSb.append("\n");
			}
	
			
			bInternalFinished = false;		
			internalCommandS = internalSb.toString();
			commandBgThread = new CommandBgThread();
			commandBgThread.start();
	
			// Wait for Thread to finish..
			while ( true )
			{
/*
				try
				{
					Thread.sleep(100);
				}
				catch (InterruptedException ie)
				{
				}
/**/

				Thread.yield();
	
				if ( bInternalFinished )
					break;
			}

/*
				System.out.println();
				char cTChr;
				
				for ( int g = 0; g < commandResultS.length(); g++ )
				{
					cTChr = (char)commandResultS.charAt(g);
					if ( (cTChr < 0x20) || (cTChr > 0x7e) )
						System.out.print("["+Integer.toHexString((int)cTChr)+"]");
					else
						System.out.print(cTChr);
				}
				System.out.println();
/**/

/*
			if ( commandResultS == null )
				System.out.println("(devices)commandResultS null");
			else
				System.out.println("(devices)commandResultS: '"+commandResultS+"'");
/**/
				
			int iG;
			if ( (commandResultS != null) && (commandResultS.length() > 0) )
			{
				iLoc = commandResultS.indexOf("attached");
				if ( iLoc != -1 )
				{
					iLoc2 = iLoc;
					while ( true )
					{
						iLoc2 = commandResultS.indexOf("device", iLoc2);
						if ( iLoc2 != -1 )
						{
							for ( iG = (iLoc2 - 1); Character.isWhitespace(commandResultS.charAt(iG)); iG--);
							iEnd = iG + 1;
							
							for ( ; ! Character.isWhitespace(commandResultS.charAt(iG)); iG-- );
							iStart = iG + 1;
							
							sDevice = commandResultS.substring(iStart, iEnd);
							sDevice = sDevice.trim();
							
							//System.out.println("(ADD)sDevice: '"+sDevice+"'");
							// Longest first..
							if ( sDevice.length() > iLongest )
							{
								DevicesAr.add(0, (String)sDevice);
								iLongest = sDevice.length();
							}
							else
							{
								DevicesAr.add(iIndex, (String)sDevice);
							}
							
							iIndex++;
						}
						else
							break;
						
						iLoc2++;
					}
				}
			}

			//for ( int iJ = 0; iJ < DevicesAr.size(); iJ++ )
				//System.out.println("["+iJ+"]: '"+(String)DevicesAr.get(iJ)+"'");

			//bDevicesFinished = true;
			completeLatch.countDown();
			
		}
	}	//}}}
	
	//{{{	getTypeId()
	private long getTypeId(byte bTypeTag)
	{
		long lRefTypeId = 0;
		
		// command_ClassesBySignature() should be called first..
		ClassesBySignatureInfo classesBySignatureInfo;
		
		if ( (ClassesBySignatureAr != null) && (ClassesBySignatureAr.size() > 0) )
		{
			byte bTTag;
			for ( int j = 0; j < ClassesBySignatureAr.size(); j++ )
			{
				classesBySignatureInfo = (ClassesBySignatureInfo)ClassesBySignatureAr.get(j);
				bTTag = classesBySignatureInfo.bRefTypeTag;		// CLASS, INTERFACE or ARRAY..
				if ( bTTag == bTypeTag )
				{
					lRefTypeId = classesBySignatureInfo.lReferenceTypeID;
					break;
				}
			}
		}
		
		return lRefTypeId;
	}	//}}}
	
	//{{{	pullFile()
	private void pullFile()
	{
		//System.out.println("\npullFile()");
		StringBuffer commandSb = new StringBuffer();
		int iSelectedIndex = 0;

/*
		if ( sdCardPathS == null )
			System.out.println("sdCardPathS null");
		else
			System.out.println("sdCardPathS: '"+sdCardPathS+"'");
/**/		

/*
		if ( pullDialogJList == null )
			System.out.println("pullDialogJList null");
		else
			System.out.println("pullDialogJList not null");
/**/

		if ( pullDialogJList != null )
		{
			iSelectedIndex = pullDialogJList.getSelectedIndex();
			//System.out.println("(getSelectedIndex()): "+iSelectedIndex);
		}
		
		
		if ( iOS == LINUX_MAC )
		{
			commandSb.append("export PATH=${PATH}:");
			commandSb.append(androidSdkPathS);
			commandSb.append("/platform-tools");
			
			commandSb.append(";");
		}
		else
		{
			commandSb.append("CD \"");
			commandSb.append(androidSdkPathS);
			commandSb.append("/platform-tools\"");
			
			commandSb.append("&&");
		}

		if ( (sdCardPathS != null) &&
			((sdCardPathS.equals("")) || ((sdCardPathS.length() > 0))) ) 
		{
			// Pull from SD Card..
			commandSb.append("adb ");

			if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
			{
				commandSb.append("-s ");
				commandSb.append(sDeviceName);
				commandSb.append(" ");
			}

			commandSb.append("pull ");
			commandSb.append(filePathSb.toString());
			commandSb.append((String)LsOutAr.get(iSelectedIndex));
			commandSb.append(" \"");
			commandSb.append(downloadPathS);	// 'download_path' Property
			commandSb.append("\"");
		}
		else
		{
			// Pull from Emulator..

/*			
			if ( LsOutAr == null )
				System.out.println("LsOutAr null");
			else
				System.out.println("LsOutAr.size(): "+LsOutAr.size());
/**/

			commandSb.append("adb ");

			if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
			{
				commandSb.append("-s ");
				commandSb.append(sDeviceName);
				commandSb.append(" ");
			}
			
			commandSb.append("pull /data/data/");
			commandSb.append(packageNameS);
			commandSb.append("/files/");
			commandSb.append((String)LsOutAr.get(iSelectedIndex));
			commandSb.append(" \"");
			commandSb.append(downloadPathS);	// 'download_path' Property
			commandSb.append("\"");
		}
		
		if ( iOS == WINDOWS )
		{
			commandSb.append("\n");
			commandPhrase = "pull";
		}
		
		//System.out.println("commandSb: '"+commandSb.toString()+"'");
		
		commandS = commandSb.toString();

		ioBgThread = new IOBgThread();
		ioBgThread.start();
		
	}	//}}}
	
	//{{{	RefreshProperties()
	private void RefreshProperties()
	{
		// Read Properties..
		Properties prop = new Properties();
		
		try
		{
			prop.load(new FileInputStream("config.properties"));
			
			// Get Property Values..
			antPathS = Utils.processPath(prop.getProperty("ant_path"));
			javaPathS = Utils.processPath(prop.getProperty("java_path"));
			androidSdkPathAntS = Utils.processPath(prop.getProperty("android_sdk_path_ant"));
			androidSdkPathGradleS = Utils.processPath(prop.getProperty("android_sdk_path_gradle"));
			sFlutterSdkPath = Utils.processPath(prop.getProperty("flutter_sdk_path"));
			sAndroidLanguage = Utils.processPath(prop.getProperty("android_language"));
			sIosLanguage = Utils.processPath(prop.getProperty("ios_language"));
			sBuildTarget = Utils.processPath(prop.getProperty("build_target"));
			sAndroidTargetPlatform = Utils.processPath(prop.getProperty("target_platform"));
			sRunBuildType = Utils.processPath(prop.getProperty("run_build_type"));
			sBuildApkOption = Utils.processPath(prop.getProperty("build_apk_option"));
			gradlePathS = Utils.processPath(prop.getProperty("gradle_path"));
			ndkPathS = Utils.processPath(prop.getProperty("ndk_path"));
			logcatFilterS = Utils.processPath(prop.getProperty("logcat_filter"));
			downloadPathS = Utils.processPath(prop.getProperty("download_path"));
			sdCardPathS = Utils.processPath(prop.getProperty("sdcard_path"));
			sDeviceIPAddress = Utils.processPath(prop.getProperty("device_ip_address"));
			gradleOfflineS = Utils.processPath(prop.getProperty("gradle_offline"));
			sGPSLatitude = Utils.processPath(prop.getProperty("gps_latitude"));
			sUseGradlew = Utils.processPath(prop.getProperty("use_gradlew"));
			sUseAppBundle = Utils.processPath(prop.getProperty("use_app_bundle"));
			sGradleCommandOption = Utils.processPath(prop.getProperty("gradle_command_option"));
			sEnableSoftwareRendering = Utils.processPath(prop.getProperty("enable_software_rendering"));
			
			if ( sUseGradlew.equals("true") )
				sGradleType = "gradlew";
			else
				sGradleType = "gradle";
			
			if ( sUseAppBundle.equals("true") )
			{
				ASSEMBLE_DEBUG = "bundleDebug";
				ASSEMBLE_RELEASE = "bundleRelease";
			}
			else
			{
				ASSEMBLE_DEBUG = "assembleDebug";
				ASSEMBLE_RELEASE = "assembleRelease";
			}
			
			
			int iLoc = javaPathS.lastIndexOf('/');
			if ( iLoc != -1 )
			{
				String sT = javaPathS.substring(iLoc);
				if ( sT.equalsIgnoreCase("/bin") )
				{
					javaPathS = javaPathS.substring(0, iLoc);
				}
			}
			
		}
		catch (IOException ioe)
		{
			System.out.println("RefreshProperties() Exception");
			ioe.printStackTrace();
		}
	}	//}}}
	
	//{{{	CheckListRenderer
	// Handles rendering cells in the List using a check box
	class CheckListRenderer extends JCheckBox
		implements ListCellRenderer
	{
		public Component getListCellRendererComponent(
			JList list, Object value, int index, 
			boolean isSelected, boolean hasFocus)
		{
			setEnabled(list.isEnabled());
			setSelected(((CheckListItem)value).isSelected());
			setFont(list.getFont());
			setBackground(list.getBackground());
			setForeground(list.getForeground());
			setText(value.toString());
			return this;
		}
	}	//}}}

	//{{{	VariableListRenderer
	class VariableListRenderer implements ListCellRenderer
	{
		protected DefaultListCellRenderer defaultRenderer = new DefaultListCellRenderer(); 
		
		//@Override
		public Component getListCellRendererComponent(
			JList list, Object value, int index, boolean isSelected, boolean cellHasFocus)
		{
			JLabel renderer = (JLabel)defaultRenderer.getListCellRendererComponent(
				list, value, index,	isSelected, cellHasFocus);
/*
			System.out.println("--------------------------");
			System.out.println("(Object) value: "+value);
			System.out.println("index: "+index);
			System.out.println("isSelected: "+isSelected);
			System.out.println("cellHasFocus: "+cellHasFocus);
/**/

			Color classBackground = new Color((int)188, (int)198, (int)204);	// Metallic Silver
			
			if ( index >= iEndIndex )
				renderer.setBackground(classBackground);
			else
				renderer.setBackground(Color.WHITE);

			return renderer;
		}
	}	//}}}

	//{{{	addTab()
	private void addTab(String sTitle)
	{
		//System.out.println("\n=== addTab() ===");
		
		JPanel tabPanel;
		JComponent jComponent;
		
		bTabCreated = true;

		// Get Tab component..
		tabPanel = getTabPanel(sTitle);	// (JPanel)

/*
		if ( tabPanel == null )
			System.out.println("\ntabPanel null");
		else
			System.out.println("\ntabPanel: "+tabPanel);
/**/

		// Get JTextArea..		
		jComponent = addPane();	// (textScrollPane)

/*
		if ( jComponent == null )
			System.out.println("jComponent null");
		else
			System.out.println("jComponent not null");
/**/

		bDidAddTab = true;


		tabbedPane.addTab(
			null,				// title, the title to be displayed in this tab
			jComponent);		// component, the component to be displayed when this tab is clicked
		
		
		// Calc tab index..
		int iTabIndex = 0;
		
		iTabCount = tabbedPane.getTabCount();
		//System.out.println("(getTabCount())iTabCount: "+iTabCount);
		iTabCount--;	// Adjust to zero based..
		if ( iTabCount < 0 )
			iTabCount = 0;
		
		//System.out.println("(setTabComponentAt())iTabCount: "+iTabCount);
		//System.out.println("(zero based)iTabCount: "+iTabCount);
		
		tabbedPane.setTabComponentAt(
			iTabCount,	// index	works
			tabPanel);	// component


		//System.out.println("(setSelectedIndex())iTabCount: "+iTabCount);
		tabbedPane.setSelectedIndex(iTabCount);		// works

	}	//}}}
	
	//{{{	addPane()
	private JComponent addPane()
	{
		//System.out.println("\naddPane()");
		Font defaultFont = new Font("Monospaced", Font.BOLD, 13);
		
		//TabTextAreaInfo tabTextAreaInfo;
		TabInfo tabInfo;

		int iTabIndex = 0;

		if ( tabbedPane != null )
		{
			iTabIndex = tabbedPane.getTabCount();
		}
		
		// Get JTextArea..		
		jTextArea = new JTextArea();

		//TabTextAreaAr.add((JTextArea)jTextArea);
		
/*		
		System.out.println("\n(addPane()):");					
		for ( int g = 0; g < TabTextAreaAr.size(); g++ )
		{
			System.out.println("===============================");
			System.out.println("TabTextAreaAr["+g+"]: "+TabTextAreaAr.get(g));
		}
		System.out.println("\n");
/**/
		
		
		jTextArea.setLineWrap(false);
		jTextArea.setFont(defaultFont);
		jTextArea.setTabSize(4);
		jTextArea.addMouseListener(mouseListener);

		textScrollPane = new JScrollPane(jTextArea);
/*		
		if ( sSourceFilePath == null )
			System.out.println("sSourceFilePath null");
		else
			System.out.println("sSourceFilePath: '"+sSourceFilePath+"'");
/**/		
		//tabTextAreaInfo = new TabTextAreaInfo();
		//tabTextAreaInfo.jTextArea = jTextArea;
		//tabTextAreaInfo.jScrollPane = textScrollPane;
		tabInfo = new TabInfo();
		tabInfo.jTextArea = jTextArea;
		tabInfo.jScrollPane = textScrollPane;
		
		// Load as early as possible..
		tabInfo.sSourcePath = sSourceFilePath;
		
		//TabTextAreaAr.add((TabTextAreaInfo)tabTextAreaInfo);
		TabInfoAr.add((TabInfo)tabInfo);
		
		
		// Save..
		tabScrollPane = textScrollPane;
		
/*		
		if ( tabScrollPane == null )
			System.out.println("tabScrollPane null");
		else
			System.out.println("tabScrollPane not null");
/**/		
		return textScrollPane;
	}	//}}}

	//{{{	getTabPanel()
	private JPanel getTabPanel(String sTitle)
	{
		//System.out.println("getTabPanel()");
		Icon closeIcon = new ImageIcon("images/close.png");
		
		JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
		jPanel.setOpaque(false);
		
		JLabel jLabel = new JLabel(sTitle);
		jLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
		jPanel.add(jLabel);
		
		JButton jButton = new JButton();
		jButton.setIcon(closeIcon);
		
		jButton.setPreferredSize(new Dimension(
			12,		// width
			12));	// height
		
		jButton.addActionListener(tabActionListener);
		
		jPanel.add(jButton);

		return jPanel;		
	}	//}}}
	
	//{{{	getApk()
	/**
     * Get the current .apk 
     */
	private void getApk()
	{
		//System.out.println("getApk()");
		// Get the name of the .apk file..
		StringBuffer sb = new StringBuffer(projectHomeS);
		//System.out.println("sb: '"+sb.toString()+"'");

		//System.out.println("bGradleSelected: "+bGradleSelected);
		if ( bGradleSelected )
		{
			// Note:
			// Flutter either has an added 'release' or 'debug'
			// directory inside of 'outputs/apk'..

			if ( bFlutterSelected )
			{
				// Flutter..
				sb.append("/build/app/outputs/apk");
					
				if ( iBuildType == RELEASE_BUILD )
					sb.append("/release");
				else if ( iBuildType == DEBUG_BUILD )
					sb.append("/debug");
			}
			else
			{
				// Gradle and Kotlin..
				//System.out.println("bUsingAppProject: "+bUsingAppProject);
				if ( bUsingAppProject )
					sb.append("/app/build/outputs/apk");
				else
					sb.append("/build/outputs/apk");
				
				if ( iBuildType == RELEASE_BUILD )
					sb.append("/release");
				else if ( iBuildType == DEBUG_BUILD )
					sb.append("/debug");
			}
		}
		else
		{
			// Android Ant..
			sb.append("/bin");
		}

		//System.out.println("(Final)sb: '"+sb.toString()+"'");
		
		File folder = new File(sb.toString());
		String altS = "";
		apkNameS = "";

		if ( folder.exists() )
		{
			//System.out.println("Folder exists");
			File[] listOfFiles = folder.listFiles();
			File file;
			
			String fNameS;		
			for ( int g = 0; g < listOfFiles.length; g++ )
			{
				file = listOfFiles[g];
				fNameS = file.getName();
				//System.out.println("fNameS: '"+fNameS+"'");
				if ( ((iBuildType == RELEASE_BUILD) && (fNameS.endsWith("release.apk"))) ||
					((iBuildType == DEBUG_BUILD) && (fNameS.endsWith("debug.apk"))) )
				{
					//System.out.println("Found file");
					apkNameS = fNameS;
					break;
				}
				else
				{
					// Save alternate..
					if ( fNameS.endsWith("release.apk") ||
						fNameS.endsWith("debug.apk") )
						altS = fNameS;
				}
			}

/*
			if ( apkNameS == null )
				System.out.println("(Final)apkNameS null");
			else
				System.out.println("(Final)apkNameS: '"+apkNameS+"'");
/**/
			
			if ( apkNameS.equals("") )
				apkNameS = altS;
		}
	}	//}}}

	//{{{	createChildren()
	void createChildren(File fileRoot, DefaultMutableTreeNode node)
	{
		//System.out.println("createChildren()");
		File[] files = fileRoot.listFiles();
		String sName;
		String sPath;
		if ( files == null )
			return;
		
		for ( int iZ = 0; iZ < files.length; iZ++ )
		{
			sName = files[iZ].getName();
			sPath = files[iZ].getAbsolutePath();
			//System.out.println("(getName()): '"+sName+"'");
			//System.out.println("(getAbsolutePath()): '"+sPath+"'");
			DefaultMutableTreeNode childNode = 
				new DefaultMutableTreeNode(
					new NodeInfo(0, sPath, sName, false));
					
			node.add(childNode);
			if ( files[iZ].isDirectory() )
			{
				createChildren(files[iZ], childNode);
			}
		}
	}	//}}}
	
	//{{{	getTreeClasses()	
	private void getTreeClasses()
	{
		//System.out.println("== getTreeClasses() ==");
		String sOut = Utils.convertToSlashes(sPackageName);

/*		
		if ( sOut == null )
			System.out.println("sOut null");
		else
			System.out.println("sOut: '"+sOut+"'");
/**/				
				
		JDWPCommands.command_AllClassesWithGeneric(sOut);

		TreeClassesAr = new ArrayList();
		ClassInfo classInfo = null;
		TreeClass treeClass = null;
		int iLoc;
		int iLoc2;
		int iSize;
		long lClassId = 0;
		String sSig;
		String sFixedString;

/*		
		if ( AllClassesAr == null )
			System.out.println("AllClassesAr null");
		else
			System.out.println("AllClassesAr.size(): "+AllClassesAr.size());
/**/				
		
		if ( (AllClassesAr != null) && (AllClassesAr.size() > 0) )
		{
			iSize = AllClassesAr.size();
			for ( int g = 0; g < iSize; g++ )
			{
				//System.out.println("--TOP--");
				classInfo = new ClassInfo();
				classInfo = (ClassInfo)AllClassesAr.get(g);
					
				treeClass = new TreeClass();
				
				sSig = classInfo.sSignature;
				//System.out.println("sSig: '"+sSig+"'");
				
				//System.out.println("byte_refTypeTag: "+classInfo.byte_refTypeTag);
				//System.out.println("lTypeId: "+classInfo.lTypeId);
				
				
				
				iLoc = sSig.lastIndexOf('/');
				if ( iLoc != -1 )
				{
					sFixedString = sSig.substring((iLoc + 1), (sSig.length() - 1));
					//System.out.println("sFixedString: '"+sFixedString+"'");

					// Check for 'R$drawable'..
					if ( sFixedString.equals("R$drawable") )
						continue;	// Skip..
					
/*					
					// Check for xxx$n
					// First check for any '$'..
					iLoc2 = sFixedString.indexOf("$");
					if ( iLoc2 != -1 )
					{
						if ( (sFixedString.length() - 2) >= 0 )
						{
							if ( sFixedString.charAt(sFixedString.length() - 2) == '$' )
							{
								if ( Character.isDigit(sFixedString.charAt(sFixedString.length() - 1)) )
								{
									// Skip..
									continue;
								}
							}
						}
					}
/**/					
					treeClass.sSignature = sFixedString;
					treeClass.lTypeId = classInfo.lTypeId;
	
					//System.out.println("ADD(sFixedString): '"+sFixedString+"'");
					TreeClassesAr.add((TreeClass)treeClass);
				}
			}	// End for..

/*			
			if ( TreeClassesAr == null )
				System.out.println("TreeClassesAr null");
			else
				System.out.println("TreeClassesAr.size(): "+TreeClassesAr.size());
/**/

			// Sort..
			int iLen = TreeClassesAr.size();
			int iI;
			int iJ;
			boolean bSwapped = false;
			TreeClass treeClassA;
			TreeClass treeClassB;
			
			for ( iI = 0; iI < iLen; iI++ )
			{
				bSwapped = false;			
				for ( iJ = 1; iJ < iLen; iJ++ )
				{
					treeClassA = (TreeClass)TreeClassesAr.get(iJ - 1);
					treeClassB = (TreeClass)TreeClassesAr.get(iJ);
					int iX = treeClassA.sSignature.compareTo(treeClassB.sSignature);
					if ( iX > 0 )
					{
						// Swap..
						bSwapped = true;
						TreeClassesAr.set(iJ - 1, (TreeClass)treeClassB);
						TreeClassesAr.set(iJ, (TreeClass)treeClassA);
					}
				}
				
				if ( ! bSwapped )
					break;
			}
			
			DefaultMutableTreeNode child;
			DefaultMutableTreeNode root = null;
			DefaultTreeModel model = (DefaultTreeModel)jTree.getModel();
			root = (DefaultMutableTreeNode)model.getRoot();
			
			// Clear..		
			root.removeAllChildren();
			model.reload();
			
/*			
			if ( TreeClassesAr == null )
				System.out.println("TreeClassesAr null");
			else
				System.out.println("TreeClassesAr.size(): "+TreeClassesAr.size());
/**/

			for ( iI = 0; iI < TreeClassesAr.size(); iI++ )
			{
				treeClass = new TreeClass();
				treeClass = (TreeClass)TreeClassesAr.get(iI);

				child = new DefaultMutableTreeNode(
					//new NodeInfo(treeClass.lTypeId, treeClass.sSignature, true));
					new NodeInfo(treeClass.lTypeId, "", treeClass.sSignature, true));
					
				// Notify the model, which will add it and create an event..
				((DefaultTreeModel)jTree.getModel()).
					insertNodeInto(
						child,		// newChild
						root,		// parent
						root.getChildCount());	// index
			}
			
			TreePath rootPath = new TreePath(root.getPath());
			
			jTree.setExpandsSelectedPaths(true);
			jTree.expandPath(rootPath);
			jTree.scrollPathToVisible(rootPath);
			jTree.setRootVisible(false);
		}
	}	//}}}
	
	//{{{	getDartSourceTree()
	private void getDartSourceTree()
	{
		//System.out.println("getDartSourceTree()");

		// Get source files..
		StringBuffer sB = new StringBuffer();
		if ( (projectHomeS != null) && (projectHomeS.length() > 0) )
			sB.append(projectHomeS);
		
		sB.append("/lib");
		
		//String sLibDir = "C:/Android/Dev/ClockApp-master/lib";
		
		// projectHomeS: 'C:/Android/Dev/ClockApp-master'
		//System.out.println("projectHomeS: '"+projectHomeS+"'");
		// 'C:/Android/Dev/ClockApp-master/lib'
		String sLibDir = sB.toString();
		//System.out.println("sLibDir: '"+sLibDir+"'");
		//LibFileAr = new ArrayList();
		
		//DefaultMutableTreeNode root;
		
		DefaultTreeModel treeModel = null;
		
		DefaultMutableTreeNode parentNode = null;
		DefaultMutableTreeNode rootNode = null;
		
		DefaultMutableTreeNode child;
		DefaultMutableTreeNode dirNode = null;
		DefaultMutableTreeNode sourceNode = null;
		DefaultMutableTreeNode root = null;
		
		DefaultTreeModel model = (DefaultTreeModel)jTree.getModel();
		root = (DefaultMutableTreeNode)model.getRoot();
		
		root.setUserObject("lib");
		
		// Clear..		
		root.removeAllChildren();
		model.reload();

		
		File fileObject = new File(sLibDir);
		if ( fileObject.exists() && fileObject.isDirectory() )
		{
			
			createChildren(fileObject, root);
			//File[] fileAr = fileObject.listFiles();
			//RecursivePrint(fileAr);
		}

		
		// Expand all..
		for ( int iJ = 0; iJ < jTree.getRowCount(); iJ++ )
			jTree.expandRow(iJ);
		
		jTree.setEditable(false);
		jTree.setExpandsSelectedPaths(true);
		//jTree.expandPath(rootPath);
		//jTree.scrollPathToVisible(rootPath);
		//jTree.setRootVisible(false);
		jTree.setShowsRootHandles(false);
		//jTree.setShowsRootHandles(true);
		jTree.setRootVisible(true);
/**/		
	}	//}}}
	
	//{{{	findSourcePath()
	private void findSourcePath()
	{
		//System.out.println("\nfindSourcePath()");
		String sPath = "";
/*		
		if ( sPackageName == null )
			System.out.println("sPackageName null");
		else
			System.out.println("sPackageName: '"+sPackageName+"'");
/**/
		// Grab first part of package name..
		String sPackageStart = "";
		int iLoc = sPackageName.indexOf(".");
		if ( iLoc != -1 )
		{
			sPackageStart = sPackageName.substring(0, iLoc);
		}

/*		
		if ( projectHomeS == null )
			System.out.println("projectHomeS null");
		else
			System.out.println("projectHomeS: '"+projectHomeS+"'");
/**/		
		
		File tFile;
		File tFile2;
		File projectFile = new File(projectHomeS);
		String[] fileObjSa = projectFile.list();
		String[] dirObjSa;
		
		StringBuffer sb;
		StringBuffer tSb = null;
		boolean bIsDirectory;
		//String sLeadDir = "";
		
		StringBuffer currentPathSb = new StringBuffer();
		currentPathSb.append(projectHomeS);
		//currentPathSb.append("/");
		//currentPathSb.append(sLeadDir);

		//System.out.println("currentPathSb: '"+currentPathSb.toString()+"'");
/*		
		if ( sPackageStart == null )
			System.out.println("sPackageStart null");
		else
			System.out.println("sPackageStart: '"+sPackageStart+"'");
/**/		
		// Construct path till we reach start of package name..
While_Break:
		for ( int iL = 0; iL < 30; iL++ )
		{
			// Construct new path..
			sb = new StringBuffer(currentPathSb);
			
			tFile = new File(sb.toString());
			bIsDirectory = tFile.isDirectory();
			
			//System.out.println("bIsDirectory: "+bIsDirectory);
			if ( bIsDirectory )
			{
				// File objects in directory..
				dirObjSa = tFile.list();

				for ( int iJ = 0; iJ < dirObjSa.length; iJ++ )
				{
					if ( dirObjSa[iJ].equals("app") )
					{
						// Update current path..
						currentPathSb.append("/");
						currentPathSb.append("app");
						
						break;
					}
					
					if ( dirObjSa[iJ].equals("src") )
					{
						// Update current path..
						currentPathSb.append("/");
						currentPathSb.append("src");
						
						break;
					}
					
					if ( dirObjSa[iJ].equals("java") )
					{
						// Should find package name..
						// Update current path..
						currentPathSb.append("/");
						currentPathSb.append("java");
						
						break;
					}
					else if ( dirObjSa[iJ].equals("main") )
					{
						// Update current path..
						currentPathSb.append("/");
						currentPathSb.append("main");
						
						break;
					}
					else if ( dirObjSa[iJ].equals(sPackageStart) )
					{
						break While_Break;
					}
					
				}	// End for..
				
				//System.out.println("Dropped out");
			}
		}	// End while..

		//System.out.println("(Final)currentPathSb: '"+currentPathSb.toString()+"'");		
		sPath = currentPathSb.toString();
		
		// Like:  'C:/Android/Dev/android-examples-develop/RadioButton/app/src/main/java'
		sSourceDirectory = sPath;

	}	//}}}
	
	//{{{	fixSignature()
	static String fixSignature(String sIn)
	{
		//System.out.println("fixSignature()");
/*		
		if ( sIn == null )
			System.out.println("sIn null");
		else
			System.out.println("sIn: '"+sIn+"'");
/**/

		String sRet = "";
		boolean bIsArray = false;
		boolean bIsString = false;
		StringBuffer sb = new StringBuffer();
		
		if ( (sIn != null) && (! sIn.equals("")) )
		{
			char cChr = (char)sIn.charAt(0);
			
			// Check for String..
			if ( sIn.indexOf("java/lang/String") != -1 )
				bIsString = true;
			
			if ( cChr == (char)Constants.TAG_ARRAY )
			{
				bIsArray = true;
				cChr = sIn.charAt(1);	// Reset to next character..
			}
			
			if ( cChr == (char)Constants.TAG_BYTE )
			{
				sb.append("byte");
			}
			else if ( cChr == (char)Constants.TAG_CHAR )
			{
				sb.append("char");
			}
			else if ( cChr == (char)Constants.TAG_FLOAT )
			{
				sb.append("float");
			}
			else if ( cChr == (char)Constants.TAG_DOUBLE )
			{
				sb.append("double");
			}
			else if ( cChr == (char)Constants.TAG_INT )
			{
				sb.append("int");			
			}
			else if ( cChr == (char)Constants.TAG_LONG )
			{
				sb.append("long");
			}
			else if ( cChr == (char)Constants.TAG_SHORT )
			{
				sb.append("short");
			}
			else if ( cChr == (char)Constants.TAG_BOOLEAN )
			{
				sb.append("boolean");
			}
			else if ( cChr == (char)Constants.TAG_STRING )
			{
				sb.append("String");
			}
			else
			{
				// Object..
				if ( (bIsString) && (bIsArray) )
					sb.append("String");
				else
				{
					bIsArray = false;
				
					int iLoc = sIn.indexOf("/");
					if ( iLoc != -1 )
					{
						// Kill leading Tag byte and trailing ';'..
						sb.append(sIn.substring(1, sIn.length() - 1));
					}
				}
			}
			
			if ( bIsArray )
			{
				sb.append("[]");
			}
		}
		
		return sb.toString();		
	}	//}}}

	//{{{	convertString()
	private String convertString(String sIn)
	{

		byte[] bStr = {(byte)0x5c, (byte)0x2f};
		String sBStr = new String(bStr);
		
		StringBuffer sB = new StringBuffer(sIn);
		String sT;
		int iLoc2;
		
		// Remove all '\'..
/*
		for ( int iX = 0; iX < sB.length(); iX++ )
		{
			if ( sB.charAt(iX) == (char)0x5c )
			{
				sB.deleteCharAt(iX);
			}
		}
/**/
		// Convert all '%3A' and '%2F'..
		iLoc2 = 0;
		while ( true )
		{
			iLoc2 = sB.indexOf("%", iLoc2);	
			if ( iLoc2 != -1 )
			{
				sT = sB.substring((iLoc2 + 1), (iLoc2 + 3));
				if ( sT.equals("2F") )
				{
					//sB.replace(iLoc2, (iLoc2 + 3), "/");
					sB.replace(iLoc2, (iLoc2 + 3), sBStr);
				}
				else if ( sT.equals("3A") )
				{
					sB.replace(iLoc2, (iLoc2 + 3), ":");
				}
			}
			else
				break;
		}
		
		return sB.toString();
		
	}	//}}}
	
	//{{{	getPutEventPacketAr()
	static byte[] getPutEventPacketAr(int iGetPut, byte[] packet)
	{
		// ==================
		// THREAD MUTEX
		// ==================
		try
		{
			eventArControl.acquire();			
		}
		catch (InterruptedException ie)
		{
		}
		
		byte[] outPacket = null;
		int iEnd;

		if ( iGetPut == Constants.GET )
		{
			iEnd = EventPacketAr.size() - 1;
			if ( iEnd < 0 )
				iEnd = 0;
			
			outPacket = (byte[])EventPacketAr.remove(iEnd);
		}
		else if ( iGetPut == Constants.PUT )
		{
			EventPacketAr.add(0, (byte[])packet);
		}
		
		// ==================
		// THREAD MUTEX
		// ==================
		eventArControl.release();
		
		return outPacket;
	}	//}}}

	//{{{	updateSource(String)
	private void updateSource(String sSourceFile)
	{
		//System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		//System.out.println("updateSource()");
/*		
		if ( sSourceFile == null )
			System.out.println("sSourceFile null");
		else
			System.out.println("sSourceFile: '"+sSourceFile+"'");
/**/		
		sSourceFilePath = sSourceFile;
				
		String sReq;
		//String sScriptId = "";
		sScriptId = "";
		String sSourceText = "";
		String[] tSAr = null;
		int iLoc2;
		int iStart;
		int iScriptIndex;
		int iSourceIndex = 0;
		int iTextLen;
		Scripts scripts = null;
		//TabTextAreaInfo tabTextAreaInfo;
		TabInfo tabInfo;
		ArrayList tAr;
		String[] sTokenPosTableAr = null;
		boolean bTabAdded = false;

		// Get name to search..		
		if ( (sSourceFile != null) && (sSourceFile.length() > 0) )
		{
			sFullSourcePath = sSourceFile;
			
			iLoc2 = sSourceFile.lastIndexOf((int)0x5c);		// '\'
			if ( iLoc2 != -1 )
			{
				// Like: 'clock_hands.dart'
				sScriptsSearchName = sSourceFile.substring(iLoc2 + 1);
				//System.out.println("sScriptsSearchName: '"+sScriptsSearchName+"'");
				
				// Note:
				// To prevent false matches
				// we add 'F' (2F)..
				// 'libraries\/@477272952\/scripts\/package%3Aplanets%2Fmodel.dart\/170a6a8d06e'
				
				StringBuffer sB = new StringBuffer();
				sB.append("F");
				sB.append(sScriptsSearchName);

				// Get scriptId..				
				if ( (ScriptsAr != null) && (ScriptsAr.size() > 0) )
				{
					for ( iScriptIndex = 0; iScriptIndex < ScriptsAr.size(); iScriptIndex++ )
					{
						scripts = (Scripts)ScriptsAr.get(iScriptIndex);
						sScriptId = scripts.sScriptId;
						//System.out.println("sScriptId: '"+sScriptId+"'");
						//iLoc2 = sScriptId.indexOf(sScriptsSearchName);
						iLoc2 = sScriptId.indexOf(sB.toString());
						if ( iLoc2 != -1 )
						{
							//System.out.println("--MATCHED--");
							break;
						}
					}
					
					//System.out.println("Dropped out");
				}
			}
		}
	
		try
		{

			//
			// getObject, get source and tokenPosTable
			//
			
			//completeLatch = new CountDownLatch(1);
			requestLatch = new CountDownLatch(1);
/*					
			if ( sScriptId == null )
				System.out.println("sScriptId null");
			else
				System.out.println("sScriptId: '"+sScriptId+"'");
/**/

			ParamAr = new ArrayList();
			ParamAr.add((String)Utils.filterObject(sIsolateId));
			ParamAr.add((String)Utils.filterObject(sScriptId));
	
			String[] getObjectMsg = {
				"method", "getObject",
				"params",
				"isolateId", "[]",
				"objectId", "[]",
				"}"};
	
			sReq = ConstructMessage(getObjectMsg);
			websocket = webSocketObject.getWebSocket();
			websocket.send(sReq);
			
			try
			{
				//completeLatch.await();
				requestLatch.await();
			}
			catch (InterruptedException ie)
			{
			}


/*
			if ( sResultMessage == null )
				System.out.println("sResultMessage null");
			else
				System.out.println("sResultMessage.length(): "+sResultMessage.length());
/**/				
			
			// Grab 'tokenPosTable' contents..
			if ( (g_sMessage != null) && (g_sMessage.length() > 0) )
			{
				tAr = new ArrayList();
				int iX;
				iLoc2 = g_sMessage.indexOf("tokenPosTable");
				if ( iLoc2 != -1 )
				{
					iLoc2 += 16;
					while ( true )
					{
						iStart = iLoc2 + 1;
						for ( iX = iStart; g_sMessage.charAt(iX) != ']'; iX++ );
						//System.out.println("(tokenPosTable): '"+sResultMessage.substring(iStart, iX)+"'");
						tAr.add((String)g_sMessage.substring(iStart, iX));
						if ( g_sMessage.charAt(iX + 1) == ']' )
							break;
						
						iLoc2 = iX + 2;
					}
					
					// Convert to String[]..
					sTokenPosTableAr = new String[tAr.size()];
					//String[] tSAr = new String[tAr.size()];
					tSAr = new String[tAr.size()];
					for ( int iZ = 0; iZ < tAr.size(); iZ++ )
					{
						tSAr[iZ] = (String)tAr.get(iZ);
						
						// Load sTokenPosTableAr..
						sTokenPosTableAr[iZ] = (String)tAr.get(iZ);
						
						//System.out.println("["+iZ+"]: '"+tSAr[iZ]+"'");
					}
					
					scripts.sTokenPosTable = tSAr;
				}
			}
		}
		catch (WebSocketException wse)
		{
			wse.printStackTrace();
		}

		// Check if source file exists..
		// Read source file..
		// This should also update the status bar path..
		//bLoadFinished = false;
		completeLatch = new CountDownLatch(1);
		
		loadSourceBgThread = new LoadSourceBgThread();
		loadSourceBgThread.start();

		try
		{
			completeLatch.await();
		}
		catch (InterruptedException ie)
		{
		}

/*		
		// Wait for Thread to finish..
		while ( true )
		{
			if ( bLoadFinished )
				break;

			try
			{
				Thread.sleep(100);
			}
			catch (InterruptedException ie)
			{
			}
		}
/**/		
		// Source in 'sourceBuf'..
		sSourceText = new String(sourceBuf);
		
		//String sTabMethodName = "";

		//System.out.println("bIsBreakpointStepEvent: "+bIsBreakpointStepEvent);
		//System.out.println("bTabSelected: "+bTabSelected);
		
		if ( bIsBreakpointStepEvent || bTabSelected )
		{
			// Tab Panel Selected
			//System.out.println("== Panel Selected ==");
			
			// Tab was selected so
			// don't do addTab()..
			
		}
		else
		{
			//System.out.println("== Creating new tab ==");

			//
			// Create new tab..
			//
			
			bTabAdded = true;
			addTab(sScriptsSearchName);
			
		}
		
		
		int iTCount = 0;

		//System.out.println("bDefaultTabShowing: "+bDefaultTabShowing);		
		if ( bDefaultTabShowing )
		{
			// Remove default tab..
			bDefaultTabShowing = false;	// Reset..
			
			int iRemoveIndex = 0;
			
			// Remove the tab and component which corresponds to the specified index
			if ( (tabbedPane != null) && (tabbedPane.getTabCount() > 0) )
			{
				//System.out.println("Doing remove(0)");
				// We're doing a remove() so
				// simulate a Close..
				bHitClose = true;
				
				tabbedPane.remove(0);
			}
			
			iTCount = tabbedPane.getTabCount();
/*			
			if ( TabInfoAr == null )
				System.out.println("TabInfoAr null");
			else
				System.out.println("TabInfoAr.size(): "+TabInfoAr.size());
/**/			

			//if ( (TabTextAreaAr != null) && (TabTextAreaAr.size() > 0) )
			if ( (TabInfoAr != null) && (TabInfoAr.size() > 0) )
			{
				//TabTextAreaAr.remove(0);
				TabInfoAr.remove(0);
			}
			
		}
		
		
		
		
		// Try to get current Tab..
		int iSelect = tabbedPane.getSelectedIndex();
		//System.out.println("(getSelectedIndex())iSelect: "+iSelect);
		
		iTabCount = tabbedPane.getTabCount();
		//System.out.println("iTabCount: "+iTabCount);
		
		//System.out.println("iSourceIndex: "+iSourceIndex);
		
		if ( iSourceIndex == iSelect )
		{
			// Source is on same Tab..
			//System.out.println("Same tab");
		}
		else
		{
			//System.out.println("Source on different tab");
			// Source is on different Tab..
			//if ( iMethodIndex < iTabCount )
			if ( iSourceIndex < iTabCount )
			{
				//System.out.println("Selecting tab with source on (iSourceIndex): "+iSourceIndex);
				// Select Tab with Method..						
				//tabbedPane.setSelectedIndex(iMethodIndex);
				tabbedPane.setSelectedIndex(iSourceIndex);
			}
		}

		
		// Get JTextArea from selected tab..
		iTabCount = tabbedPane.getTabCount();	// Refresh..
		//System.out.println("(Updated)iTabCount: "+iTabCount);

		int iGetIndex = iTabCount - 1;
		if ( iGetIndex < 0 )
			iGetIndex = 0;

		//System.out.println("iGetIndex: "+iGetIndex);
		
		// Note:
		// By the time it gets here, it's already
		// selected the 0th Tab, and the below
		// getSelectedIndex() returns '0'

		if ( bTabAdded )
		{
			// Note:
			// if tab was added, iGetIndex is now at the
			// proper, last, position..
			tabbedPane.setSelectedIndex(iGetIndex);
		}
		else
		{
			if ( bIsBreakpointStepEvent )
			{
				//iGetIndex = iMethodIndex;
				iGetIndex = iSourceIndex;
			}
			else
			{
				// If Tab was selected use it's
				// selected index..
				if ( bTabSelected )
				{
					iGetIndex = tabbedPane.getSelectedIndex();
				}
			}
		}

		//System.out.println("(Updated)iGetIndex: "+iGetIndex);
		//if ( iGetIndex >= TabTextAreaAr.size() )
		if ( iGetIndex >= TabInfoAr.size() )
		{
			// Wrong size, adjust..
			//iGetIndex = TabTextAreaAr.size() - 1;
			iGetIndex = TabInfoAr.size() - 1;
		}
		
		//System.out.println("(Adjusted)iGetIndex: "+iGetIndex);
/*		
		if ( TabInfoAr == null )
			System.out.println("TabInfoAr null");
		else
			System.out.println("TabInfoAr.size(): "+TabInfoAr.size());
/**/
		
		//if ( (TabTextAreaAr != null) && (TabTextAreaAr.size() > 0) )
		if ( (TabInfoAr != null) && (TabInfoAr.size() > 0) )
		{
			//jTextArea = (JTextArea)TabTextAreaAr.get(iGetIndex);	// (iTabCount - 1)
			//tabTextAreaInfo = (TabTextAreaInfo)TabTextAreaAr.get(iGetIndex);
			//jTextArea = tabTextAreaInfo.jTextArea;
			tabInfo = (TabInfo)TabInfoAr.get(iGetIndex);
			jTextArea = tabInfo.jTextArea;
			
			// Load 'sScriptId'..
			//System.out.println("(Load)sScriptId: '"+sScriptId+"'");
			tabInfo.sScriptId = sScriptId;

/*			
			if ( tSAr == null )
				System.out.println("(Load)tSAr null");
			else
			{
				//System.out.println("(Load)tSAr.length: "+tSAr.length);
				System.out.println("(Load):");
				for ( int iJ = 0; iJ < tSAr.length; iJ++ )
					System.out.println("["+iJ+"]: '"+tSAr[iJ]+"'");
			}
/**/

/*
			if ( sFullSourcePath == null )
				System.out.println("sFullSourcePath null");
			else
				System.out.println("sFullSourcePath: '"+sFullSourcePath+"'");
/**/
			// Now already loaded..
			// Load source path..
			//tabInfo.sSourcePath = sFullSourcePath;
			
			// Load 'sTokenPosTable'..
			tabInfo.sTokenPosTable = tSAr;
			
			// Update..
			TabInfoAr.set(iGetIndex, (TabInfo)tabInfo);

		}
/*		
		if ( jTextArea == null )
			System.out.println("jTextArea null");
		else
			System.out.println("jTextArea not null");
/**/

		if ( jTextArea != null )
		{
			iTextLen = jTextArea.getText().length();
			//System.out.println("iTextLen: "+iTextLen);
			
			if ( iTextLen == 0 )
			{
				//System.out.println("Doing insert()");
				jTextArea.insert(sSourceText, 0);
			}
			else
			{
				//System.out.println("Doing replaceRange()");
				jTextArea.replaceRange(sSourceText, 0, iTextLen);	// Replace any previous text..
			}
			
			// Scroll to top..		
			jTextArea.setCaretPosition(0);
			
			bDidUpdate = true;
			//updateSourceLines(lBreakpointLocationIndex);
		}
		
		//System.out.println("Exiting updateSource()");

	}	//}}}
	
	//{{{	updateSource(long, long)  Add tab
	private void updateSource(long lClassId, long lMethodId)
	{
		//System.out.println("\n== updateSource() ==");
		//System.out.println("lClassId: "+lClassId);
		//System.out.println("lMethodId: "+lMethodId);
		
		bDidUpdateSource = true;
		
		lCurrentlyShowingClassId = lClassId;
		lCurrentlyShowingMethodId = lMethodId;

		byte[] wRet = {(byte)0x0d, (byte)0x0a};
		byte[] lRet = {(byte)0x0a};
		
		int iTabCount;
		boolean bAddClassMethodInfo = false;
		String sMName = "";

		iTabCount = tabbedPane.getTabCount();
		
		ClassMethodInfo classMethodInfo;	
		//TabTextAreaInfo tabTextAreaInfo;
		TabInfo tabInfo;
		
		iMethodIndex = 0;
		
/*
		if ( ClassMethodAr == null )
			System.out.println("ClassMethodAr null");
		else
		{
			System.out.println("\nClassMethodAr.size(): "+ClassMethodAr.size());
			for ( int j = 0; j < ClassMethodAr.size(); j++ )
			{
				System.out.println("----------------------------  "+j);
				classMethodInfo = (ClassMethodInfo)ClassMethodAr.get(j);
				System.out.println("classMethodInfo.sMethodName: "+classMethodInfo.sMethodName);
				
				if ( classMethodInfo.jScrollPane == null )
					System.out.println("classMethodInfo.jScrollPane null");
				else
					System.out.println("classMethodInfo.jScrollPane not null");
				
			}
			System.out.println("\n\n");
		}
/**/		

		// At this point, the classMethodInfo was
		// created, but a tab hasn't been created yet.. 		
		if ( ClassMethodAr != null )
		{
			for ( ; iMethodIndex < ClassMethodAr.size(); iMethodIndex++ )
			{
				classMethodInfo = (ClassMethodInfo)ClassMethodAr.get(iMethodIndex);
				if ( lMethodId == classMethodInfo.lMethodId )
				{
					sMName = classMethodInfo.sMethodName;
					break;
				}
			}
		}
		
		// Like: 'ActivityAdapter.kt'
		sSourceFileName = JDWPCommands.command_SourceFile(lClassId);
		//System.out.println("sSourceFileName: '"+sSourceFileName+"'");
		
		boolean bDoError = false;
		boolean bAdjusted = false;
		StringBuffer sSb;
		StringBuffer srcSb;
		String sT;
		int iLoc40;

		// Try to get the Class's signature..
		// Like: 'Lcom/irontec/examples/kotlintest/adapters/ActivityAdapter;'		
		sClassSignature = JDWPCommands.command_Signature(lClassId);
		//System.out.println("sClassSignature: '"+sClassSignature+"'");
		
		// Get Methods for that Class..		
		JDWPCommands.command_MethodsWithGeneric(lClassId);

		if ( lBreakpointLocationIndex != -1 )
		{
			// Initialize so we can detect an error..
			LineTableAr = new ArrayList();
			
			JDWPCommands.command_LineTable((long)lClassId, (long)lMethodId);
		}

		LineTableInfo lineTableInfo;
		long lLineIndex = 0;
		int iTextLen;

		if ( (LineTableAr != null) && (LineTableAr.size() > 0) )
		{
			lineTableInfo = (LineTableInfo)LineTableAr.get(0);

			lLineIndex = lineTableInfo.lLineCodeIndex;
		
			// Check if source file exists..
			// Read source file..
			//bLoadFinished = false;
			completeLatch = new CountDownLatch(1);
			
			loadMethodSourceBgThread = new LoadMethodSourceBgThread();
			loadMethodSourceBgThread.start();

			try
			{
				completeLatch.await();
			}
			catch (InterruptedException ie)
			{
			}
			
/*
			// Wait for Thread to finish..
			while ( true )
			{
				//Thread.yield();
				//try
				//{
					//Thread.sleep(100);
				//}
				//catch (InterruptedException ie)
				//{
				//}
				
				Thread.yield();
				
				if ( bLoadFinished )
				{
					break;
				}
			}
/**/

			String sTabMethodName = "";
			
			//System.out.println("bSourceExists: "+bSourceExists);
/*			
			if ( sourceBuf == null )
				System.out.println("sourceBuf null");
			else
				System.out.println("sourceBuf.length: "+sourceBuf.length);
/**/

			if ( (bSourceExists) && (sourceBuf != null) && (sourceBuf.length > 0) )
			{
				//System.out.println("Inside");
				int[] iMethodScope = Utils.GetSourceScope(sourceBuf, LineTableAr);
				
				//System.out.println("iMethodScope[0]: "+iMethodScope[0]);
				//System.out.println("iMethodScope[1]: "+iMethodScope[1]);

				if ( (iMethodScope[0] == 0) && (iMethodScope[1] == 0) )
				{
					//System.out.println("Error");
					bDoError = true;
				}
				else
				{
					// Grab source text..
					String sSourceText = new String(
						sourceBuf,			// byte[]
						iMethodScope[0],	// offset
						(iMethodScope[1] - iMethodScope[0]));	// length
			

					// Get Method name..					
					MethodInfo methodInfo;

					int iSz = AllMethodsAr.size();
					if ( (AllMethodsAr != null) && (iSz > 0) )
					{
						for ( int iG = 0; iG < iSz; iG++ )
						{
							methodInfo = (MethodInfo)AllMethodsAr.get(iG);
							if ( methodInfo.lMethodId == lMethodId )
							{
								//System.out.println("(Method) --Matched--");
								sTabMethodName = methodInfo.sName;

								break;
							}
						}
					}
					
					if ( bIsBreakpointStepEvent || bTabSelected )
					{
						// Tab Panel Selected
						//System.out.println("Panel Selected");
						
						// Tab was selected so
						// don't do addTab()..
						
					}
					else
					{
						
						//System.out.println("Creating tab");

						/**
						 * Create new tab..
						 */
	
						 addTab(sTabMethodName);

						 bAddClassMethodInfo = true;
						 

						// Note:
						// In certain cases we don't
						// want to add this, it's already
						// created for the tab, we just want to
						// update the 'classMethodInfo.jScrollPane'..

						// Since we now created the Tab
						// try to create the new ClassMethodAr now
						// instead ahead of time..


						if ( bMethodChanged )
							bAddClassMethodInfo = false;
							
						if ( tabbedPane.getTabCount() != ClassMethodAr.size() )
						{
							bAddClassMethodInfo = true;
						}

						if ( bAddClassMethodInfo )
						{
							classMethodInfo = new ClassMethodInfo();
							classMethodInfo.lMethodId = lMethodId;
							classMethodInfo.lClassId = lClassId;
							classMethodInfo.sMethodName = sTabMethodName;
							classMethodInfo.jScrollPane = tabScrollPane;
	
							ClassMethodAr.add((ClassMethodInfo)classMethodInfo);
						}
					}

					int iTCount = 0;
					
					if ( bDefaultTabShowing )
					{
						// Remove default tab..
						bDefaultTabShowing = false;	// Reset..
						
						int iRemoveIndex = 0;
						
						// Remove the tab and component which corresponds to the specified index
						if ( (tabbedPane != null) && (tabbedPane.getTabCount() > 0) )
						{
							//System.out.println("Doing remove(0)");
							// We're doing a remove() so
							// simulate a Close..
							bHitClose = true;
							
							tabbedPane.remove(0);
						}
						
						iTCount = tabbedPane.getTabCount();

						//if ( (TabTextAreaAr != null) && (TabTextAreaAr.size() > 0) )
						if ( (TabInfoAr != null) && (TabInfoAr.size() > 0) )
						{
							//TabTextAreaAr.remove(0);
							TabInfoAr.remove(0);
						}
						
						// Since we did a remove() from
						// TabTextAreaAr, try to also remove
						// ClassMethodAr..

						// If it's at 1 we don't want to do a remove()
						// taking it to 0..
						
						if ( (ClassMethodAr != null) && (ClassMethodAr.size() > 1) )
						{
							ClassMethodAr.remove(0);
						}
					}

					if ( bAddClassMethodInfo )
						;
					else
					{
						int iIndex = ClassMethodAr.size() - 1;
						if ( (ClassMethodAr != null) && (ClassMethodAr.size() > 0) )
						{
							// Update classMethodInfo.jScrollPane..
							classMethodInfo = (ClassMethodInfo)ClassMethodAr.get(iIndex);
							classMethodInfo.jScrollPane = tabScrollPane;	// Update..
							
							ClassMethodAr.set(iIndex, (ClassMethodInfo)classMethodInfo);
						}
					}

					// Try to get current Tab..
					int iSelect = tabbedPane.getSelectedIndex();
					
					iTabCount = tabbedPane.getTabCount();
					
					if ( iMethodIndex == iSelect )
					{
						// Method is on same Tab..
					}
					else
					{
						// Method is on different Tab..
						if ( iMethodIndex < iTabCount )
						{
							// Select Tab with Method..						
							tabbedPane.setSelectedIndex(iMethodIndex);
						}
					}

					
					// Get JTextArea from selected tab..
					iTabCount = tabbedPane.getTabCount();	// Refresh..

					int iGetIndex = iTabCount - 1;
					if ( iGetIndex < 0 )
						iGetIndex = 0;
					
					// Note:
					// By the time it gets here, it's already
					// selected the 0th Tab, and the below
					// getSelectedIndex() returns '0'

					if ( bIsBreakpointStepEvent )
					{
						iGetIndex = iMethodIndex;
					}
					else
					{
						// If Tab was selected use it's
						// selected index..
						if ( bTabSelected )
						{
							iGetIndex = tabbedPane.getSelectedIndex();
						}
					}

					//if ( iGetIndex >= TabTextAreaAr.size() )
					if ( iGetIndex >= TabInfoAr.size() )
					{
						// Wrong size, adjust..
						//iGetIndex = TabTextAreaAr.size() - 1;
						iGetIndex = TabInfoAr.size() - 1;
					}
					
					//if ( (TabTextAreaAr != null) && (TabTextAreaAr.size() > 0) )
					if ( (TabInfoAr != null) && (TabInfoAr.size() > 0) )
					{
						//jTextArea = (JTextArea)TabTextAreaAr.get(iGetIndex);	// (iTabCount - 1)
						//tabTextAreaInfo = (TabTextAreaInfo)TabTextAreaAr.get(iGetIndex);
						//jTextArea = tabTextAreaInfo.jTextArea;
						tabInfo = (TabInfo)TabInfoAr.get(iGetIndex);
						jTextArea = tabInfo.jTextArea;
					}

					if ( jTextArea != null )
					{
						iTextLen = jTextArea.getText().length();
						if ( iTextLen == 0 )
						{
							jTextArea.insert(sSourceText, 0);
						}
						else
						{
							jTextArea.replaceRange(sSourceText, 0, iTextLen);	// Replace any previous text..
						}
						
						// Scroll to top..		
						jTextArea.setCaretPosition(0);
						
						bDidUpdate = true;
						updateSourceLines(lBreakpointLocationIndex);
					}
				}
			}
			else
			{
				// Show Dialog with source info..
				StringBuffer msgSb = new StringBuffer();
				
				msgSb.append("(");
				msgSb.append(sThreadName);
				msgSb.append(")  ");
				
				String sSignature = fixSignature(sClassSignature);
				msgSb.append(sSignature);
				for ( int j = 0; j < msgSb.length(); j++ )
				{
					if ( msgSb.charAt(j) == '/' )
						msgSb.setCharAt(j, '.');
				}

				MethodInfo methodInfo;
				String sMethodName = "";
				
				// Get Methods for that Class..
				JDWPCommands.command_MethodsWithGeneric(lClassId);

				if ( (AllMethodsAr != null) && (AllMethodsAr.size() > 0) )
				{
					for ( int iM = 0; iM < AllMethodsAr.size(); iM++ )
					{
						methodInfo = (MethodInfo)AllMethodsAr.get(iM);
						if ( methodInfo.lMethodId == lMethodId )
						{
							sMethodName = methodInfo.sName;
							break;
						}
					}
				}

				if ( (sMethodName != null) && (sMethodName.length() > 0) )
				{
					msgSb.append("  ");
					msgSb.append(sMethodName);
					msgSb.append("()");
				}

				
				long lLineCodeIndex = -1;
				int iLineNumber = 0;
				
				if ( lBreakpointLocationIndex != -1 )
				{
					iLineNumber = -1;
					lLineCodeIndex = lBreakpointLocationIndex;
					bAdjusted = false;
							
					if ( (LineTableAr != null) && (LineTableAr.size() > 0) )
					{
						while ( true )
						{
							for ( int iG = 0; iG < LineTableAr.size(); iG++ )
							{
								lineTableInfo = (LineTableInfo)LineTableAr.get(iG);
								if ( lLineCodeIndex == lineTableInfo.lLineCodeIndex )
								{
									iLineNumber = lineTableInfo.iLineNumber;
									break;
								}
							}
							
							if ( iLineNumber == -1 )
							{
								bAdjusted = true;
								lLineCodeIndex--;
							}
							else
								break;
						}
					}
				}
				
				if ( lBreakpointLocationIndex == -1 )
				{
					msgSb.append("  (native method)");
				}
				else
				{
					msgSb.append("  Line: ");
					msgSb.append(iLineNumber);
					
					msgSb.append("  (");
					msgSb.append(lLineCodeIndex);
					msgSb.append(")");
				}

				
				JOptionPane.showMessageDialog(
					frame,				// parentComponent
					msgSb.toString(),	// message
					"Source",							// title
					JOptionPane.INFORMATION_MESSAGE);	// messageType
				
			}
		}
		else
		{
			// Source error..
			bDoError = true;
		}
		
		if ( bDoError )
		{
			// Could not find source or not available..
			StringBuffer sb = new StringBuffer();
			sb.append("Could not find source or not available:\n");
			sb.append(new String(sSourceFileName));

			JOptionPane.showMessageDialog(
				frame,
				sb.toString(),
				"Source file",
				JOptionPane.ERROR_MESSAGE);
			
		}
	}	//}}}

	//{{{	updateVariables()
	private void updateVariables()
	{
		//System.out.println("\n== updateVariables() ==");
		VariableTableInfo variableTableInfo;
		ClassVariableInfo classVariableInfo;
		LocalVariableInfo localVariableInfo;
		iEndIndex = 0;
		
		StringBuffer sb;
		String sName;
		String sValue;
		String sSignature;
		Integer IVal;
		int iListIteratorIndex;
		int iStrIndex;
		int iPos;
		int iNmLength;
		int iLength;
		int iKey = 0;
		int iLoc2;
		byte bSig;
		boolean bFoundWhitespace;
		boolean bUpdated;
		boolean bIsPrimitive;
		boolean bSlotVisible;
		boolean bJListUpdated = false;
		String sIterValue;
		String sNewValue;
		String sCheckNm;
		String sClass = "";
		
		FrameSlot frameSlot;
		int iSlot;
		int iFrameSlot;
		int iIndex = 0;
		int iVarIndex;
		boolean bDoAdd;
		boolean bAddClass;

		// Clear..		
		jListVariableVector.clear();

		if ( (LocalVariableLHm != null) && (LocalVariableLHm.size() > 0) )
		{
			Set setLocalKeys = LocalVariableLHm.keySet();
			Iterator localIterator = setLocalKeys.iterator();
			String[] sValueSa;
			byte bType;
			iKey = 0;
			
			while ( localIterator.hasNext() )
			{
				// Get Key..				
				IVal = (Integer)localIterator.next();
				if ( IVal != null )
					iKey = IVal.intValue();

				localVariableInfo = (LocalVariableInfo)LocalVariableLHm.get(new Integer(iKey));
				
				sName = localVariableInfo.sName;
				sSignature = localVariableInfo.sSignature;
				iSlot = localVariableInfo.iSlot;
				bType = localVariableInfo.bType;
				sValueSa = localVariableInfo.sStringValue;

				//System.out.println("--------------------------------");
				//System.out.println("sName: '"+sName+"'");
				//System.out.println("sSignature: '"+sSignature+"'");
				//System.out.println("iSlot: "+iSlot);
				//System.out.println("bType: "+bType);
				//System.out.println("sValueSa[0]: '"+sValueSa[0]+"'");
/**/
				bAddClass = false;
				
				// Process signature..
				if ( sSignature.charAt(0) == (char)'L' )
				{
					bAddClass = true;
					iLoc2 = sSignature.lastIndexOf((int)0x2f);	// '/'
					if ( iLoc2 != -1 )
					{
						sClass = sSignature.substring(iLoc2 + 1, sSignature.length() - 1);
						//System.out.println("sClass: '"+sClass+"'");
					}
				}
				
				sb = new StringBuffer();
				sb.append("  ");
				sb.append(sName);
				
				iNmLength = sName.length();
				
				for ( iPos = 16; ; iPos += 4 )
				{
					if ( iNmLength + 4 < iPos )
						break;
				}
				
				for ( int g = 0; g < (iPos - (iNmLength + 4)); g++ )
					sb.append(" ");
				
				if ( bAddClass )
					sb.append(sClass);
				
				if ( sSignature.charAt(0) != '[' )
				{
					if ( sSignature.indexOf("java/lang/String;") != -1 )
					{
						if ( sValueSa[0].equals("null") )
							sb.append(sValueSa[0]);
						else
						{
							sb.append("'");
							sb.append(sValueSa[0]);
							sb.append("'");
						}
					}
					else
						sb.append(sValueSa[0]);
				}

				//System.out.println("(addElement())sb: '"+sb.toString()+"'");				
				jListVariableVector.addElement((String)sb.toString());
				iEndIndex++;
				
			}	// End while..
		}

		if ( (ClassVariableLHm != null) && (ClassVariableLHm.size() > 0) )
		{
			Set setClassKeys = ClassVariableLHm.keySet();
			Iterator classIterator = setClassKeys.iterator();
			String[] sValueSa;
			long lFieldId;
			long lKey = 0;
			byte bType;
			Long LVal;
			
			while ( classIterator.hasNext() )
			{
				// Get Key..				
				LVal = (Long)classIterator.next();
				if ( LVal != null )
					lKey = LVal.longValue();

				classVariableInfo = (ClassVariableInfo)ClassVariableLHm.get(new Long(lKey));
				
				sName = classVariableInfo.sName;
				sSignature = classVariableInfo.sSignature;
				lFieldId = classVariableInfo.lFieldId;
				bType = classVariableInfo.bType;
				sValueSa = classVariableInfo.sStringValue;

/*					
				System.out.println("--------------------------------");
				System.out.println("sName: '"+sName+"'");
				System.out.println("sSignature: '"+sSignature+"'");
				System.out.println("lFieldId: "+Long.toHexString(lFieldId));
				System.out.println("bType: "+bType);
				System.out.println("sValueSa[0]: '"+sValueSa[0]+"'");
/**/

				sb = new StringBuffer();
				sb.append("  ");
				sb.append(sName);
				
				iNmLength = sName.length();
				
				for ( iPos = 16; ; iPos += 4 )
				{
					if ( iNmLength + 4 < iPos )
						break;
				}
				
				for ( int g = 0; g < (iPos - (iNmLength + 4)); g++ )
					sb.append(" ");
				
				if ( sSignature.charAt(0) != '[' )
				{
					if ( sSignature.indexOf("java/lang/String;") != -1 )
					{
						if ( sValueSa[0].equals("null") )
							sb.append(sValueSa[0]);
						else
						{
							sb.append("'");
							sb.append(sValueSa[0]);
							sb.append("'");
						}
					}
					else
						sb.append(sValueSa[0]);
				}
				
				jListVariableVector.addElement((String)sb.toString());
				
			}	// End while..
		}

		jList.setListData(jListVariableVector);

		SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				JScrollBar vertical = listScrollPane.getVerticalScrollBar();
				int iMin = vertical.getMinimum();
				vertical.setValue(iMin);
			}
		});
	}	//}}}

	//{{{	updateSourceLines()
	//private static void updateSourceLines(long lLocationIndex)
	private void updateSourceLines(long lLocationIndex)
	{
		// Where 'lLocationIndex' is the LineCodeIndex..
		//System.out.println("\n== updateSourceLines() ==");
		//System.out.println("lLocationIndex: "+lLocationIndex);
		//System.out.println("lLocationMethod: "+lLocationMethod);
		//System.out.println("lCurrentSelectedMethod: "+lCurrentSelectedMethod);
		//System.out.println("lCurrentMethodId: "+lCurrentMethodId);
		//System.out.println("iPauseBreakpointTokenPos: "+iPauseBreakpointTokenPos);
		
		// Note:
		// Line numbers, for getLineStartOffset(), are zero based.
		// Flutter source line numbers are one based..

		LineTableInfo lineTableInfo = null;
		//TabTextAreaInfo tabTextAreaInfo;
		TabInfo tabInfo = null;
		
		int iLineNumber = 0;
		int iAdjustedLine = 0;
		int iUnadjustedLineNumber = 0;
		int iAdjustedStartOffset = 0;
		int iStartOffset = 0;
		int iEndTokenPos = 0;
		int iLine = 0;
		int iTab;
		String[] sTokenPosTableAr = null;
		//String sScriptId = "";
		String sTScript;
		
		int iScrollValue = 0;
		int iScrollMax = 0;
		int iScrollMin = 0;
		int iStart = 0;
		JViewport viewport = null;
		Rectangle viewRectangle = null;
		
		long lLineCodeIndex = 0;
		int iLen;
		boolean bMatchedIndex;
		boolean bMethodMatched = false;
		Rectangle visRect;
		Highlighter highlighter;
		BreakpointInfo breakpointInfo;

		
		Integer IKeyVal;
		Integer IValue;
		Rectangle rect = null;
		Color green = new Color((int)0x3d, (int)0x8c, (int)0x1e, (int)255);
		Color darkGreen = new Color((int)0x3d, (int)0x71, (int)0x1e, (int)255);
		Color lightGreen = new Color((int)0x3d, (int)0xc4, (int)0x1c, (int)255);
		Color red = new Color((int)0xe4, (int)0x1b, (int)0x17, (int)255);

		// Reset..
		bNeedsUpdate = false;		
		
		bTabCreated = false;	// Reset..
		
		ClassMethodInfo classMethodInfo;
		iMethodIndex = 0;
		
		//System.out.println("At A");
		if ( bFlutterSelected )
		{
			
		}
		else
		{
			if ( ClassMethodAr != null )
			{
				for ( ; iMethodIndex < ClassMethodAr.size(); iMethodIndex++ )
				{
					classMethodInfo = (ClassMethodInfo)ClassMethodAr.get(iMethodIndex);
					if ( lMethodId == classMethodInfo.lMethodId )
					{
						bMethodMatched = true;
						break;
					}
				}
			}
		}
		
		//System.out.println("At B");
		// Get current Tab..
		int iTabSel = 0;
		if ( tabbedPane != null )
		{
			iTabSel = tabbedPane.getSelectedIndex();
		}
		
		if ( iTabSel == -1 )
			iTabSel = 0;
		
		//System.out.println("(getSelectedIndex())iTabSel: "+iTabSel);
		
		long lRefreshMethodId;
		long lRefreshClassId;
		
		//System.out.println("\nbHaveSDKSource: "+bHaveSDKSource);

/*		
		if ( TabInfoAr == null )
			System.out.println("TabInfoAr null");
		else
			System.out.println("TabInfoAr.size(): "+TabInfoAr.size());
/**/

		if ( bFlutterSelected )
		{
			// Check if source is on different tab..
			if ( (TabInfoAr != null) && (TabInfoAr.size() > 0) )
			{
				tabInfo = (TabInfo)TabInfoAr.get(iTabSel);
				sScriptId = tabInfo.sScriptId;
/*				
				if ( sScriptId == null )
					System.out.println("sScriptId null");
				else
					System.out.println("sScriptId: '"+sScriptId+"'");
/**/						
/*
				if ( sBreakpointScriptId == null )
					System.out.println("sBreakpointScriptId null");
				else
					System.out.println("sBreakpointScriptId: '"+sBreakpointScriptId+"'");
/**/						

				if ( sBreakpointScriptId.equals(sScriptId) )
				{
					//System.out.println("--- On same tab ---");
					;
				}
				else
				{
					// Tab changed..
					//System.out.println("--- On different tab ---");
					// Find tab that matches scritId..
					for ( iTab = 0; iTab < TabInfoAr.size(); iTab++ )
					{
						tabInfo = (TabInfo)TabInfoAr.get(iTab);
						sTScript = tabInfo.sScriptId;
						if ( sBreakpointScriptId.equals(sTScript) )
						{
							iTabSel = iTab;
							tabbedPane.setSelectedIndex(iTabSel);
							break;
						}
					}
				}
			}
		}
		else
		{
			if ( bHaveSDKSource == false )
			{
				tabbedPane.setSelectedIndex(iTabSel);
				
				// Get updated LineTableInfo..
				classMethodInfo = (ClassMethodInfo)ClassMethodAr.get(iTabSel);
				lRefreshMethodId = classMethodInfo.lMethodId;
				lRefreshClassId = classMethodInfo.lClassId;
	
				// Update the Method..
				lCurrentSelectedMethod = lRefreshMethodId;
				
				JDWPCommands.command_LineTable(lRefreshClassId, lRefreshMethodId); 
			}
		}
		
		//System.out.println("At B1");
/*
		if ( TabInfoAr == null )
			System.out.println("TabInfoAr null");
		else
			System.out.println("TabInfoAr.size(): "+TabInfoAr.size());
/**/

		JScrollBar scrollbar = null;
		JScrollPane scrollPane = null;
		
		//System.out.println("(Updated)iTabSel: "+iTabSel);

		// Update..
		// Get 'scrollPane' and 'scrollbar'..
		//if ( (TabTextAreaAr != null) && (TabTextAreaAr.size() > 0) )
		if ( (TabInfoAr != null) && (TabInfoAr.size() > 0) )
		{
			//jTextArea = (JTextArea)TabTextAreaAr.get(iTabSel);
			//tabTextAreaInfo = (TabTextAreaInfo)TabTextAreaAr.get(iTabSel);
			tabInfo = (TabInfo)TabInfoAr.get(iTabSel);
			//jTextArea = tabTextAreaInfo.jTextArea;
			//scrollPane = tabTextAreaInfo.jScrollPane;
			jTextArea = tabInfo.jTextArea;
			scrollPane = tabInfo.jScrollPane;
			 
			scrollbar = scrollPane.getVerticalScrollBar();
		}
/*
		if ( jTextArea == null )
			System.out.println("jTextArea null");
		else
			System.out.println("jTextArea not null");
/**/
/*
		if ( scrollPane == null )
			System.out.println("scrollPane null");
		else
			System.out.println("scrollPane not null");
/**/


		//System.out.println("At C");
		// Get Tab's JScrollPane
		// This is critical for it to be able to
		// adjust the scrolling to keep the
		// current line in view
		
		//System.out.println("At D");
		
		if ( scrollbar != null )
		{
			iScrollValue = scrollbar.getValue();
			iScrollMax = scrollbar.getMaximum();
			iScrollMin = scrollbar.getMinimum();
		}

		if ( scrollPane != null )
		{
			//JViewport viewport = scrollPane.getViewport();
			viewport = scrollPane.getViewport();
			
			// 'y' is the top of the View
			viewRectangle = viewport.getViewRect();
		}
		
		// 'y' is the top of the View		
		//Rectangle viewRectangle = viewport.getViewRect();

		highlighter = jTextArea.getHighlighter();

		if ( bFlutterSelected )
		{
			
		}
		else
		{
			// Note:
			// If Location is at '0', jdb sets to first line.
			// Find matching LineCodeIndex, and get Unadjusted line number..
			if ( (LineTableAr != null) && (LineTableAr.size() > 0) )
			{
				iLen = LineTableAr.size();
				long lTempLocation = lLocationIndex;
				bMatchedIndex = false;
				
				while ( true )
				{
					for ( int iG = 0; iG < iLen; iG++ )
					{
						lineTableInfo = (LineTableInfo)LineTableAr.get(iG);
						if ( lineTableInfo != null )
						{
							if ( (lineTableInfo.lLineCodeIndex == lTempLocation) ||
								((lTempLocation == 0) && (iG == 0)) )
							{
								iUnadjustedLineNumber = lineTableInfo.iLineNumber;
								bMatchedIndex = true;
								break;
							}
						}
					}
					
					if ( bMatchedIndex )
						break;
					else
					{
						// No matches, so try to find the closest one..
						lTempLocation--;
					}
				}	// End while..
			}
		}
		
		//
		// Highlight current line..
		//
		
		try
		{
			String sText = jTextArea.getText();
			byte[] bytes = sText.getBytes();
			
			highlighter.removeAllHighlights();

			visRect = jTextArea.getVisibleRect();
			jTextArea.repaint(visRect);

			if ( bFlutterSelected )
			{
				// Search for matching 'tokenPos' and
				// get assc. line number..
				
				if ( (TabInfoAr != null) && (TabInfoAr.size() > 0) )
				{
					tabInfo = (TabInfo)TabInfoAr.get(iTabSel);
					sTokenPosTableAr = tabInfo.sTokenPosTable;
				}
				
				StringTokenizer st;
				String[] tSa;
				int iTokCount;
				//int iLine = 0;
				int iTokIndex = 0;
				boolean bFound = false;
				String sLine = "";
				String sT;
				String sTokenPos = "";
				//String sTokenPos = Integer.toString(iTokenPos);
				
				//System.out.println("iPauseBreakpointTokenPos: "+iPauseBreakpointTokenPos);
				//System.out.println("iResumeTokenPos: "+iResumeTokenPos);


				if ( iResumeTokenPos != 0 )
					sTokenPos = Integer.toString(iResumeTokenPos);
				else if ( iPauseBreakpointTokenPos != 0 )
					sTokenPos = Integer.toString(iPauseBreakpointTokenPos);
					
					
				//System.out.println("sTokenPos: '"+sTokenPos+"'");
				
				try
				{
					iEndTokenPos = Integer.parseInt(sTokenPos);
					//System.out.println("iEndTokenPos: "+iEndTokenPos);
				}
				catch (NumberFormatException nfe)
				{
				}

/*				
				if ( sTokenPosTableAr == null )
					System.out.println("sTokenPosTableAr null");
				else
				{
					System.out.println("sTokenPosTableAr.length: "+sTokenPosTableAr.length);
					//for ( int iJ = 0; iJ < sTokenPosTableAr.length; iJ++ )
						//System.out.println("["+iJ+"]: "+sTokenPosTableAr[iJ]);
				}
/**/ 
				
				
				if ( (sTokenPosTableAr != null) && (sTokenPosTableAr.length > 0) )
				{
					for ( int iJ = 0; iJ < sTokenPosTableAr.length; iJ++ )
					{
						//System.out.println("--TOP-- iJ: "+iJ);
						sT = sTokenPosTableAr[iJ];
						//System.out.println("sT: '"+sT+"'");
						
						st = new StringTokenizer(sT, ",");
						iTokCount = st.countTokens();
						tSa = new String[iTokCount];
	
						for ( iTokIndex = 0; st.hasMoreTokens(); iTokIndex++ )  
							tSa[iTokIndex] = st.nextToken();
						
						for ( int iX = 0; iX < tSa.length; iX++ )
						{
							if ( iX == 0 )
							{
								sLine = tSa[iX];
								continue;
							}
							
							if ( iX % 2 == 0 )
								continue;	// Column, skip..
							
							if ( tSa[iX].equals(sTokenPos) )
							{
								//System.out.println("--FOUND TokenPos--");
								//System.out.println("(sT): "+sT);
								bFound = true;
								
								try
								{
									iLine = Integer.parseInt(sLine);
									//System.out.println("iLine: "+iLine);
									iLine--;	// Adjust for zero based..
									iTokenPosLine = iLine;	// Save adjusted line..
									//System.out.println("iTokenPosLine: "+iTokenPosLine);
									
									//System.out.println("(Adjusted)iLine: "+iLine);
								}
								catch (NumberFormatException nfe)
								{
								}
								
								break;
							}
						}	// End for..
						//System.out.println("Dropped out of line");
					}	// End for..
				}

				//System.out.println("iLine: "+iLine);	
				//System.out.println("iPreviousLine: "+iPreviousLine);
				if ( (iLine != 0) && (iLine != iPreviousLine) )
				{
					// Line changed, update variables..
					//System.out.println("\n---- Line changed ----");

					// Note:
					// PauseBreakpoint should have
					// already been processed, so we should be
					// able to do this now..
					
					bUpdateVariableJTreeFinished = false;
					updateVariableJTreeBgThread = new UpdateVariableJTreeBgThread();
					updateVariableJTreeBgThread.start();
					
					while ( true )
					{
						if ( bUpdateVariableJTreeFinished )
							break;
						
						try
						{
							Thread.sleep(100);
						}
						catch (InterruptedException ie)
						{
						}
						
					}
					
					updateNodesBgThread = new UpdateNodesBgThread();
					updateNodesBgThread.start();
					
					//VariableJTree();
					
					iPreviousLine = iLine;
				}

				
				//System.out.println("(Line highlight)bFound: "+bFound);
				if ( bFound )
				{
					//System.out.println("\n----------- Line highlight --------------");
					
					//System.out.println("(To getLineStartOffset())iLine: "+iLine);	
					//System.out.println("iTokenPosLine: "+iTokenPosLine);
					iStartOffset = jTextArea.getLineStartOffset((int)iLine);
					//System.out.println("iStartOffset: "+iStartOffset);
		
					// Try to highlight line..
					rect = jTextArea.modelToView(iStartOffset);
					
					//System.out.println("rect.y: "+rect.y);
					
					//int iStart = jTextArea.viewToModel(new Point(0, rect.y));
					iStart = jTextArea.viewToModel(new Point(0, rect.y));
					//int iEnd = jTextArea.viewToModel(new Point(jTextArea.getWidth(), rect.y));
					int iLineEnd = jTextArea.viewToModel(new Point(jTextArea.getWidth(), rect.y));
					int iEnd = iEndTokenPos;
					//System.out.println("iStart: "+iStart+"  iEnd: "+iEnd+"  iLineEnd: "+iLineEnd);
					
					// Highlight current line..
					highlighter.addHighlight(
						iStart,
						iEnd,
						new DefaultHighlighter.DefaultHighlightPainter((Color)lightGreen));

					highlighter.addHighlight(
						iStart,
						iLineEnd,
						new DefaultHighlighter.DefaultHighlightPainter((Color)darkGreen));
					
				}
			}
			else
			{
				if ( (bMethodMatched) &&
					((lLocationMethod != 0) && (lLocationMethod == lCurrentSelectedMethod)) )
				{
					
					if ( bMethodChanged )
					{
						// When the Method changes it seems to
						// need a little delay here before
						// 'iStart' and 'iEnd' values will
						// consistantly work..
						try
						{
							//Thread.sleep(75);
							Thread.sleep(125);
						}
						catch (InterruptedException ie)
						{
						}
					}
					
					// Get adjusted line number..
					// Zero based display line number..
					iAdjustedLine = iUnadjustedLineNumber - iSourceLineAdjust;
		
					// Get adjusted..
					iAdjustedStartOffset = jTextArea.getLineStartOffset((int)iAdjustedLine);
		
					// Try to highlight line..
					rect = jTextArea.modelToView(iAdjustedStartOffset);
					
					//int iStart = jTextArea.viewToModel(new Point(0, rect.y));
					iStart = jTextArea.viewToModel(new Point(0, rect.y));
					int iEnd = jTextArea.viewToModel(new Point(jTextArea.getWidth(), rect.y));
					//System.out.println("iStart: "+iStart+"    iEnd: "+iEnd);
					
					if ( bShowCurrentLine )
					{
						// Highlight current line..
						highlighter.addHighlight(
							iStart,
							iEnd,
							new DefaultHighlighter.DefaultHighlightPainter((Color)green));
					}
				}
				else
				{
					// Doesn't match..
					;
				}
			}
			
			//BreakpointInfo breakpointInfo;

/*			
			if ( BreakpointAr == null )
				System.out.println("BreakpointAr null");
			else
				System.out.println("BreakpointAr.size(): "+BreakpointAr.size());
/**/

			//System.out.println("At G");
			
			//
			// Highlight Breakpoints..
			//
			
			if ( (BreakpointAr != null) && (BreakpointAr.size() > 0) )
			{
				int iBLen = BreakpointAr.size();
				int iLLen;
				int iAdjLn = 0;
				int iLineTableLineNumber;
				int iHStart;
				int iHEnd;
				int iAdjustedStartOff;
				int iStartOff;
				int iLoc3;
				int iLineNum;
				long lMethodID;
				long lBpLineIndex;
				long lLnCodeIndex;
				boolean bMatched;
				//String sScriptId;
				String sPath;
				String sName;
				//String sTScript;
				
				if ( bFlutterSelected )
				{
					//System.out.println("\n----------- Breakpoint highlight --------------");

					for ( int iZ = 0; iZ < BreakpointAr.size(); iZ++ )
					{
						//System.out.println("--TOP-- iZ: "+iZ);
						breakpointInfo = (BreakpointInfo)BreakpointAr.get(iZ);
						//sScriptId = breakpointInfo.sScriptId;
						sTScript = breakpointInfo.sScriptId;
						//System.out.println("sScriptId: '"+sScriptId+"'");
						sPath = tabInfo.sSourcePath;
						//System.out.println("sPath: '"+sPath+"'");
						
						// Note:
						// At this point sPath looks like:
						// 'C:\Android\Dev\ClockApp-master\lib\clock\hand_minute.dart'
						//iLoc3 = sPath.lastIndexOf((int)0x2f);	// '/'
						iLoc3 = sPath.lastIndexOf((int)0x5c);	// '\'
						if ( iLoc3 != -1 )
						{
							sName = sPath.substring(iLoc3 + 1);
							//System.out.println("sName: '"+sName+"'");
							//iLoc3 = sScriptId.indexOf(sName);
							iLoc3 = sTScript.indexOf(sName);
							if ( iLoc3 != -1 )
							{
								// Do highlight..
								iLineNum = breakpointInfo.iLineNumber;
								//System.out.println("(breakpointInfo.iLineNumber)iLineNum: "+iLineNum);
								
								// Adjust for zero based..
								iLineNum--;
								//System.out.println("(Adjusted)(To getLineStartOffset())iLineNum: "+iLineNum);
								//System.out.println("iTokenPosLine: "+iTokenPosLine);
								
								// getLineStartOffset() takes zero based line number..
								iStartOff = jTextArea.getLineStartOffset((int)iLineNum);	// Offset of the start of the given line
								//System.out.println("iStartOff: "+iStartOff);
					
								// Try to highlight line..
								Rectangle bRect = jTextArea.modelToView(iStartOff);
								
								//System.out.println("bRect.y: "+bRect.y);
								
								iHStart = jTextArea.viewToModel(new Point(0, bRect.y));
								iHEnd = jTextArea.viewToModel(new Point(jTextArea.getWidth(), bRect.y));
								//System.out.println("iHStart: "+iHStart+"    iHEnd: "+iHEnd);
								
								// Note:
								// In some cases the Breakpoint higlight was
								// being drawn "over" the green Step highlight
								// and didn't "show up", and this test
								// seems to fix it..
								//System.out.println("iStart: "+iStart);
								
								//if ( iHStart != iStart )
								if ( iLineNum != iTokenPosLine )
								{
									//System.out.println("- Drawing breakpoint highlight - @ iHStart: "+iHStart);
									//System.out.println("- Drawing breakpoint highlight - @ iLineNum: "+iLineNum);
									highlighter.addHighlight(
										iHStart,
										iHEnd,
										new DefaultHighlighter.DefaultHighlightPainter((Color)red));
								}
								
							}
						}
					}	// End for..
				}
				else
				{

					if ( (LineTableAr != null) && (LineTableAr.size() > 0) )
					{
						iLLen = LineTableAr.size();					
						for ( int iB = 0; iB < iBLen; iB++ )
						{
							breakpointInfo = (BreakpointInfo)BreakpointAr.get(iB);
							lMethodID = breakpointInfo.lMethodId;
							lBpLineIndex = breakpointInfo.lLineCodeIndex;
	
							bMatched = false;						
							for ( int iL = 0; iL < iLLen; iL++ )
							{
								lineTableInfo = (LineTableInfo)LineTableAr.get(iL);
								lLnCodeIndex = lineTableInfo.lLineCodeIndex;
								
								if ( (lMethodID == lCurrentSelectedMethod) &&
									(lLnCodeIndex == lBpLineIndex) )
								{
									// Matched..
									bMatched = true;
									iLineTableLineNumber = lineTableInfo.iLineNumber;
									
									// Get adjusted line number..
									iAdjLn = iLineTableLineNumber - iSourceLineAdjust;
									
									// Get adjusted..
									iAdjustedStartOff = jTextArea.getLineStartOffset((int)iAdjLn);
						
									// Try to highlight line..
									Rectangle bRect = jTextArea.modelToView(iAdjustedStartOff);
									
									iHStart = jTextArea.viewToModel(new Point(0, bRect.y));
									iHEnd = jTextArea.viewToModel(new Point(jTextArea.getWidth(), bRect.y));
									//System.out.println("iHStart: "+iHStart+"    iHEnd: "+iHEnd);
									
									highlighter.addHighlight(
										iHStart,
										iHEnd,
										new DefaultHighlighter.DefaultHighlightPainter((Color)red));
								}
							}	// End for..
						}	// End for..
					}
				}
			}
/**/
			
			int iScrollY;
			int iQuarter = viewRectangle.height / 4;

			//System.out.println("At H");
			if ( rect != null )
			{
				if ( (rect.y <= viewRectangle.y) ||
					(rect.y >= (viewRectangle.y + (iQuarter * 3))) )
				{
					iScrollY = rect.y - (viewRectangle.height / 2);
						
					if ( iScrollY < iScrollMin )
						iScrollY = iScrollMin;
					if ( iScrollY > iScrollMax )
						iScrollY = iScrollMax;

					if ( scrollbar != null )
						scrollbar.setValue(iScrollY);

					// Upper UI was getting trashed sometimes
					// so now we do this..					
					visRect = jTextArea.getVisibleRect();
					jTextArea.repaint(visRect);
				}
			}
		}
		catch (BadLocationException ble)
		{
			System.out.println("Exception: "+ble.toString());
		}

		//System.out.println("Exiting updateSourceLines()");
		
	}	//}}}
	
	//{{{	init()
	/**
     * Read Project Home from Persistent storage
     * Get package name from AndroidManifest.xml
     */
	private void init()
	{
		//String inS;
		String tokS = "";
		String tS = "";
		int iLoc;
		//int iLoc2;
		//System.out.println("\ninit()");
		
		if ( bRunSelected == false )
		{
			if ( stopButton != null )
				stopButton.setVisible(false);
			
			if ( killButton != null )
				killButton.setVisible(true);
		}
		
		// Try to read from Persistent storage..
		// Like: C:/Android/Dev/flutter_fivez~true~false~false~true
		tokS = readStorage("store.tmp");
		//System.out.println("tokS: '"+tokS+"'");

		// Save the state of each..		
		// [Home]~[Use Gradle]~[Use NDK]~[Use Kotlin]~[UseFlutter]		
		if ( (tokS != null) && (! tokS.equals("")) )
		{
			StringTokenizer st = new StringTokenizer(tokS, "~");
			int iCount = st.countTokens();
			
			for ( int iG = 0; iG < iCount; iG++ )
			{
				if ( iG == 0 )
				{
					// Home..
					bHomeJustSet = true;
					projectHomeS = st.nextToken();
					//System.out.println("projectHomeS: '"+projectHomeS+"'");

					if ( statusLabel != null )
						statusLabel.setText(projectHomeS);
					
					iLoc = projectHomeS.lastIndexOf('/');
					if ( iLoc != -1 )
						sProjectPathLead = projectHomeS.substring(0, iLoc);
				}
				else if ( iG == 1 )
				{
					// Gradle..
					tS = st.nextToken();
					if ( tS.equals("true") )
					{
						if ( uGradleMenuItem != null )						
							uGradleMenuItem.setSelected(true);
						
						bGradleSelected = true;
					}
					else if ( tS.equals("false") )
					{
						if ( uGradleMenuItem != null )						
							uGradleMenuItem.setSelected(false);
						
						bGradleSelected = false;
					}
				}
				else if ( iG == 2 )
				{
					// NDK..
					tS = st.nextToken();
					if ( tS.equals("true") )
					{
						if ( uNDKMenuItem != null )
							uNDKMenuItem.setSelected(true);
						
						bNDKSelected = true;
					}
					else if ( tS.equals("false") )
					{
						if ( uNDKMenuItem != null )
							uNDKMenuItem.setSelected(false);
						
						bNDKSelected = false;
					}
				}
				else if ( iG == 3 )
				{
					// Kotlin..
					tS = st.nextToken();
					if ( tS.equals("true") )
					{
						if ( uKotlinMenuItem != null )
							uKotlinMenuItem.setSelected(true);
						
						bKotlinSelected = true;
					}
					else if ( tS.equals("false") )
					{
						if ( uKotlinMenuItem != null )
							uKotlinMenuItem.setSelected(false);
						
						bKotlinSelected = false;
					}
				}
				else if ( iG == 4 )
				{
					// Flutter..
					tS = st.nextToken();
					//System.out.println("(Flutter)tS: '"+tS+"'");
					if ( tS.equals("true") )
					{
						if ( uFlutterMenuItem != null )
							uFlutterMenuItem.setSelected(true);
						
						bFlutterSelected = true;
					}
					else if ( tS.equals("false") )
					{
						if ( uFlutterMenuItem != null )
							uFlutterMenuItem.setSelected(false);
						
						bFlutterSelected = false;
					}
				}
			}	// End for..

			// Get Package name..
			getPackageName();
			
			// Reset..			
			bHomeJustSet = false;

		}
	}	//}}}

	//{{{	consoleOutput()
	private void consoleOutput(String sMsg)
	{
		int iLen;
		StringBuffer outSb = new StringBuffer(sMsg);
		outSb.append((char)0x0a);

		try
		{				
			doc = textPane.getStyledDocument();	
			iLen = doc.getLength();
			doc.insertString(iLen, outSb.toString(), normalStyle);
			if ( iLen > 0 )
			{
				textPane.setCaretPosition(doc.getLength() - 1);
				textPane.repaint();
			}
		}
		catch (IllegalArgumentException iae)
		{
		}
		catch (BadLocationException ble)
		{
		}

	}	//}}}
	
	//{{{	readFile()
	/**
     * Utility to read file 
     */
	private byte[] readFile(int iInitialSize, String fileName)
	{
		//System.out.println("readFile()");
		ByteArrayOutputStream baos = new ByteArrayOutputStream(iInitialSize);
		byte[] tempBuf = new byte[768];
		
		int iBufLength = tempBuf.length;		
    	int bytes_read = 0;

		FileInputStream fis = null;

		try
		{
			File file = new File(fileName);
			if ( file.exists() )
			{
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
		}
		catch (Exception e)
		{
			System.out.println("Exception: "+e.toString());
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

	//{{{	writeFile()
	/**
     * Utility to write file 
     */
	private void writeFile(byte[] outBuf, String fileNameS)
	{
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		File writeFile = new File(fileNameS);
		
		try
		{
			fos = new FileOutputStream(writeFile);
			dos = new DataOutputStream(fos);
			
			dos.write(outBuf, 0, outBuf.length);
			dos.flush();
		}
		catch (IOException ioe)
		{
			System.out.println("writeFile() Exception");
			ioe.printStackTrace();
		}
		finally
		{
			try
			{
				if ( fos != null )
					fos.close();
				
				if ( dos != null )
					dos.close();
			}
			catch (IOException ioe)
			{
			}
		}
	}	//}}}

	//{{{	readStorage()
	private String readStorage(String sFileName)
	{
		String retS = "";
		
		// Try to read from Persistent storage..
		File file = new File(sFileName);
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try
		{
			if ( file.exists() )
			{
				fis = new FileInputStream(file);
				ois = new ObjectInputStream(fis);
				
				retS = (String)ois.readObject();
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
		catch (ClassNotFoundException cnfe)
		{
			cnfe.printStackTrace();
		}
		finally
		{
			try
			{
				if ( fis != null )
					fis.close();

				if ( ois != null )
					ois.close();
			}
			catch (IOException ioe)
			{
			}
		}

		return retS;		
	}	//}}}

	//{{{	writeStorage()	
	private void writeStorage(String inS, String sFileName)
	{
		// Try to write to Persistent storage..
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try
		{				
			fos = new FileOutputStream(sFileName);
			oos = new ObjectOutputStream(fos);
		
			oos.writeObject((String)inS);
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
		finally
		{
			try
			{
				if ( fos != null )
					fos.close();

				if ( oos != null )
					oos.close();
			}
			catch (IOException ioe)
			{
			}
		}
	}	//}}}

	//{{{	updateStorage()
	private void updateStorage()
	{
		//System.out.println("updateStorage()");
		// C:/Android/Dev/Weather_FreeV2G~true~false~false
		//                     bGradleSelected  bNDKSelected  bKotlinSelected  bFlutterSelected 
		StringBuffer sb = new StringBuffer();
		
		if ( (projectHomeS == null) || (projectHomeS.equals("")) )
			sb.append("");
		else
			sb.append(projectHomeS);
		
		sb.append("~");
		if ( uGradleMenuItem.getState() )
		{
			sb.append("true");
		}
		else
		{
			sb.append("false");
		}

		sb.append("~");
		if ( uNDKMenuItem.getState() )
		{
			sb.append("true");
		}
		else
		{
			sb.append("false");
		}

		sb.append("~");
		if ( uKotlinMenuItem.getState() )
		{
			sb.append("true");
		}
		else
		{
			sb.append("false");
		}

		sb.append("~");
		if ( uFlutterMenuItem.getState() )
		{
			sb.append("true");
		}
		else
		{
			sb.append("false");
		}

		writeStorage(sb.toString(), "store.tmp");
		
	}	//}}}
	
	//{{{	CommandBgThread
	class CommandBgThread extends Thread
	{
		public void run()
		{
			// ==================
			// THREAD MUTEX
			// ==================
			try
			{
				commandControl.acquire();			
			}
			catch (InterruptedException ie)
			{
			}

			//System.out.println("== CommandBgThread run() ==");
			//System.out.println("internalCommandS: '"+internalCommandS+"'");
			
			Process proc = null;
			InputStream out_is = null;
			InputStream error_is = null;

			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			byte[] tempBuf = new byte[4096];
			
			int iBytesRead = 0;
			
			int iTmpLength = tempBuf.length;
			int iExitVal = 0;

			try
			{
				Runtime rt = Runtime.getRuntime();
				
				if ( iOS == LINUX_MAC )
				{
					proc = rt.exec(new String[] {"/bin/bash", "-c", internalCommandS});
				}
				else
				{
					proc = rt.exec(new String[] {"cmd.exe", "/C", internalCommandS});
				}

				error_is = proc.getErrorStream();
				out_is = proc.getInputStream();

				while ( true )
				{
					if ( error_is.available() > 0 )	// Check Error Stream..
					{
						iBytesRead = error_is.read(tempBuf, 0, iTmpLength);
						//System.out.println("(error_is)iBytesRead: "+iBytesRead);
						if ( iBytesRead == -1 )
						{
							// Never gets this..
							break;
						}
						
						baos.write(tempBuf, 0, iBytesRead);
					}
					else if ( out_is.available() > 0 )	// Check Output Stream..
					{
						iBytesRead = out_is.read(tempBuf, 0, iTmpLength);
						//System.out.println("(out_is)iBytesRead: "+iBytesRead);
						if ( iBytesRead == -1 )
						{
							// Never gets this..
							break;
						}
						
						baos.write(tempBuf, 0, iBytesRead);
					}
					else
					{
						// Didn't get anything..

						// If still getting data
						// gets Exception:
						// 'Exception: java.lang.IllegalThreadStateException: process hasn't exited'
						// When I/O is finished, does exitValue()..
						try
						{
							iExitVal = proc.exitValue();
							//System.out.println("iExitVal: "+iExitVal);
							break;
						}
						catch (IllegalThreadStateException itse)
						{
						}
					}
				}	// End while..
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				try
				{
					if ( out_is != null )
						out_is.close();

					if ( error_is != null )
						error_is.close();
				}
				catch (IOException ioe)
				{
				}
			}

			proc.destroy();
			
			while ( true )
			{
				try
				{
					iExitVal = proc.waitFor();
					break;
				}
				catch (InterruptedException ie)
				{
				}
			}
			
			commandResultS = new String(baos.toByteArray());

/*			
			if ( commandResultS != null )
			{
				System.out.println();
				char cTChr;
				for ( int g = 0; g < commandResultS.length(); g++ )
				{
					cTChr = (char)commandResultS.charAt(g);
					if ( (cTChr < 0x20) || (cTChr > 0x7e) )
						System.out.print("["+Integer.toHexString((int)cTChr)+"]");
					else
						System.out.print(cTChr);
				}
				System.out.println();
			}
/**/
			
			bCommandFinished = true;
			bInternalFinished = true;
			//bAdbThreadFinished = true;
			

			// ==================
			// THREAD MUTEX
			// ==================
			commandControl.release();
			
		}
	}	//}}}

	//{{{	InterpretEvent()
	private EventInfo InterpretEvent(byte[] event)
	{
		//System.out.println("\n== InterpretEvent() ==");
		//System.out.println("iEventKey: "+iEventKey+"   "+Integer.toHexString(iEventKey));
		byte bSuspendPolicy;
		int iEvents;
		int iIndex;
		byte bEventKind = 0;
		
		int iRequestId;
		byte bTypeTag;
		byte bCatchTypeTag;
		byte bRefTypeTag;
		int iFieldId;
		int iStatus;
		long lThreadId;
		long lClassId;
		long lCatchClassId;
		long lMethodId;
		long lCatchMethodId;
		long lLocationIndex;
		long lCatchLocationIndex;
		long lTaggedObjectId = 0;
		long lTypeId;
		String sSignature;
		
		// As Command packet:
		// length (4 bytes)   id (4 bytes)   flags (1 byte)   command set (1 byte) 0x40   command (1 byte) 0x64
		// Then follow composite Event Data, which all these are based on..
		
		int[] index = new int[1];
		index[0] = 11;

		EventInfo eventInfo = null;		
		
		bSuspendPolicy = Utils.getNextValueAsByte(index, event);
		//System.out.println("bSuspendPolicy: "+bSuspendPolicy);
/*
		if ( bSuspendPolicy == (byte)Constants.SUSPEND_THREAD_NONE )
			System.out.println("SUSPEND_THREAD_NONE");
		else if ( bSuspendPolicy == (byte)Constants.SUSPEND_THREAD_EVENT_THREAD )
			System.out.println("SUSPEND_THREAD_EVENT_THREAD");
		else if ( bSuspendPolicy == (byte)Constants.SUSPEND_THREAD_ALL )
			System.out.println("SUSPEND_THREAD_ALL");
/**/
		iEvents	= Utils.getNextValueAsInt(index, event);
		//System.out.println("iEvents: "+iEvents);
		
		for ( iIndex = 0; iIndex < iEvents; iIndex++ )
		{
			//System.out.println("--TOP-- iIndex: "+iIndex);
			eventInfo = new EventInfo();
			
			// Clear everything..
			eventInfo.iRequestId = 0;		
			eventInfo.lThreadId = 0;
			eventInfo.bEventKind = 0;
			eventInfo.bTypeTag = 0;
			eventInfo.bCatchTypeTag = 0;
			eventInfo.bRefTypeTag = 0;
			eventInfo.iFieldId = 0;
			eventInfo.iStatus = 0;
			eventInfo.lClassId = 0;
			eventInfo.lCatchClassId = 0;
			eventInfo.lMethodId = 0;
			eventInfo.lCatchMethodId = 0;
			eventInfo.lLocationIndex = 0;
			eventInfo.lCatchLocationIndex = 0;
			eventInfo.lTaggedObjectId = 0;
			eventInfo.lTypeId = 0;
			eventInfo.sSignature = "";

			
			bEventKind = Utils.getNextValueAsByte(index, event);
			//System.out.println("bEventKind: "+bEventKind);
			
			eventInfo.bEventKind = bEventKind;
			
			if ( bEventKind == Constants.EVENT_KIND_VM_START )
			{
				//System.out.println("EVENT_KIND_VM_START");
				
				iRequestId = Utils.getNextValueAsInt(index, event);
				//System.out.println("iRequestId: "+iRequestId);
				
				lThreadId = Utils.getNextValueAsObjectID(index, event);
				//System.out.println("lThreadId: "+lThreadId);
				
				eventInfo.iRequestId = iRequestId;
				eventInfo.lThreadId = lThreadId;
				//EventAr.add((EventInfo)eventInfo);
				//EventInfoHt.put((Integer)new Integer(iEventKey), (EventInfo)eventInfo);
				//return (EventInfo)eventInfo;
			}
			else if ( bEventKind == Constants.EVENT_KIND_SINGLE_STEP )
			{
				//System.out.println("EVENT_KIND_SINGLE_STEP");

				iRequestId = Utils.getNextValueAsInt(index, event);
				//System.out.println("iRequestId: "+iRequestId+"    "+Integer.toHexString(iRequestId));
				
				lThreadId = Utils.getNextValueAsObjectID(index, event);
				//System.out.println("lThreadId: "+lThreadId+"   "+Long.toHexString(lThreadId));
				
				// Location..
				//System.out.println("\nLocation:");
				bTypeTag = Utils.getNextValueAsByte(index, event);
				//System.out.println("bTypeTag: "+bTypeTag);		// (TYPE_TAG_CLASS = 1)
				lClassId = Utils.getNextValueAsReferenceTypeID(index, event);	// (as in Location reference)
				//System.out.println("lClassId: "+lClassId+"   "+Long.toHexString(lClassId));
				lMethodId = Utils.getNextValueAsMethodID(index, event);
				//System.out.println("lMethodId: "+lMethodId+"   "+Long.toHexString(lMethodId));
				lLocationIndex = Utils.getNextValueAsLong(index, event);
				//System.out.println("lLocationIndex: "+lLocationIndex+"   "+Long.toHexString(lLocationIndex));
				//System.out.println();
				
				lEventClassId = lClassId;	// Save..
				lEventMethodId = lMethodId;
				
				// Save Index to test visibility..
				lBreakpointLocationIndex = lLocationIndex;
				//System.out.println("\n(lLocationIndex)lBreakpointLocationIndex: "+lBreakpointLocationIndex);
				
				eventInfo.iRequestId = iRequestId;
				eventInfo.lThreadId = lThreadId;
				eventInfo.bTypeTag = bTypeTag;
				eventInfo.lClassId = lClassId;
				eventInfo.lMethodId = lMethodId;
				eventInfo.lLocationIndex = lLocationIndex;
			}
			else if ( bEventKind == Constants.EVENT_KIND_BREAKPOINT )
			{
				//System.out.println("\nEVENT_KIND_BREAKPOINT");
				
				iRequestId = Utils.getNextValueAsInt(index, event);
				//System.out.println("iRequestId: "+iRequestId+"    "+Integer.toHexString(iRequestId));
				
				lThreadId = Utils.getNextValueAsObjectID(index, event);
				//System.out.println("lThreadId: "+lThreadId+"   "+Long.toHexString(lThreadId));

				// Location..
				//System.out.println("\nLocation:");
				bTypeTag = Utils.getNextValueAsByte(index, event);	// TYPE_TAG_CLASS (1), TYPE_TAG_INTERFACE (2), TYPE_TAG_ARRAY (3)
				//System.out.println("bTypeTag: "+bTypeTag);
				lClassId = Utils.getNextValueAsReferenceTypeID(index, event);	// (as in Location reference)
				//System.out.println("lClassId: "+lClassId+"   "+Long.toHexString(lClassId));
				lMethodId = Utils.getNextValueAsMethodID(index, event);
				//System.out.println("lMethodId: "+lMethodId+"   "+Long.toHexString(lMethodId));
				lLocationIndex = Utils.getNextValueAsLong(index, event);
				//System.out.println("lLocationIndex: "+lLocationIndex);

				lEventClassId = lClassId;	// Save..
				lEventMethodId = lMethodId;
				
				// Save Index to test visibility..
				lBreakpointLocationIndex = lLocationIndex;
				//System.out.println("\n(lLocationIndex)lBreakpointLocationIndex: "+lBreakpointLocationIndex);
				
				eventInfo.iRequestId = iRequestId;
				eventInfo.lThreadId = lThreadId;
				eventInfo.bTypeTag = bTypeTag;
				eventInfo.lClassId = lClassId;
				eventInfo.lMethodId = lMethodId;
				eventInfo.lLocationIndex = lLocationIndex;
				
			}
			else if ( bEventKind == Constants.EVENT_KIND_METHOD_ENTRY )
			{
				//System.out.println("EVENT_KIND_METHOD_ENTRY");

				iRequestId = Utils.getNextValueAsInt(index, event);
				//System.out.println("iRequestId: "+iRequestId);
				
				lThreadId = Utils.getNextValueAsObjectID(index, event);
				//System.out.println("lThreadId: "+lThreadId);

				// Location..
				bTypeTag = Utils.getNextValueAsByte(index, event);
				lClassId = Utils.getNextValueAsReferenceTypeID(index, event);
				lMethodId = Utils.getNextValueAsMethodID(index, event);
				lLocationIndex = Utils.getNextValueAsLong(index, event);
				
				eventInfo.iRequestId = iRequestId;
				eventInfo.lThreadId = lThreadId;
				eventInfo.bTypeTag = bTypeTag;
				eventInfo.lClassId = lClassId;
				eventInfo.lMethodId = lMethodId;
				eventInfo.lLocationIndex = lLocationIndex;
			}
			else if ( bEventKind == Constants.EVENT_KIND_METHOD_EXIT )
			{
				//System.out.println("EVENT_KIND_METHOD_EXIT");

				iRequestId = Utils.getNextValueAsInt(index, event);
				//System.out.println("iRequestId: "+iRequestId);
				
				lThreadId = Utils.getNextValueAsObjectID(index, event);
				//System.out.println("lThreadId: "+lThreadId);

				// Location..
				bTypeTag = Utils.getNextValueAsByte(index, event);
				lClassId = Utils.getNextValueAsReferenceTypeID(index, event);
				lMethodId = Utils.getNextValueAsMethodID(index, event);
				lLocationIndex = Utils.getNextValueAsLong(index, event);
				
				eventInfo.iRequestId = iRequestId;
				eventInfo.lThreadId = lThreadId;
				eventInfo.bTypeTag = bTypeTag;
				eventInfo.lClassId = lClassId;
				eventInfo.lMethodId = lMethodId;
				eventInfo.lLocationIndex = lLocationIndex;
			}
			else if ( bEventKind == Constants.EVENT_KIND_EXCEPTION )
			{
				//System.out.println("\nEVENT_KIND_EXCEPTION");

/*				
				System.out.println("\n");
				String sByte;
				int iL = 0;               
				for ( int j = 0; j < event.length; j++ )
				{
					sByte = Integer.toHexString((int)event[j]);
					if ( sByte.length() == 1 )
						System.out.print("0");
					else if ( sByte.length() > 2 )
						sByte = sByte.substring(6);
					
					System.out.print(sByte);
					System.out.print(" ");

					iL++;					
					if ( iL > 20 )
					{
						System.out.print("\n");
						iL = 0;
					}
				}
				System.out.println("\n");
/**/				
				
				
				iRequestId = Utils.getNextValueAsInt(index, event);		// Request that generated event
				//System.out.println("iRequestId: "+iRequestId+"    "+Integer.toHexString(iRequestId));
				
				lThreadId = Utils.getNextValueAsObjectID(index, event);	// Thread with exception
				//System.out.println("lThreadId: "+lThreadId+"    "+Long.toHexString(lThreadId));

				// Location of exception throw..
				//System.out.println("\nLocation:");
				bTypeTag = Utils.getNextValueAsByte(index, event);
				//System.out.println("bTypeTag: "+bTypeTag);
				lClassId = Utils.getNextValueAsReferenceTypeID(index, event);
				//System.out.println("lClassId: "+lClassId+"    "+Long.toHexString(lClassId));
				lMethodId = Utils.getNextValueAsMethodID(index, event);
				//System.out.println("lMethodId: "+lMethodId+"    "+Long.toHexString(lMethodId));
				lLocationIndex = Utils.getNextValueAsLong(index, event);
				//System.out.println("lLocationIndex: "+lLocationIndex);


				
				TaggedObject taggedObject = Utils.getNextValueAsTaggedObject(index, event);	// Thrown exception 
				
				long lObjectId = taggedObject.objectID;
				//System.out.println("lObjectId: "+Long.toHexString(lObjectId));

				
				//System.out.println("\nCatch location:");
				// Catch Location or 0 if not caught..
				bCatchTypeTag = Utils.getNextValueAsByte(index, event);
				//System.out.println("bCatchTypeTag: "+bCatchTypeTag);
				lCatchClassId = Utils.getNextValueAsReferenceTypeID(index, event);
				//System.out.println("lCatchClassId: "+lCatchClassId+"    "+Long.toHexString(lCatchClassId));
				lCatchMethodId = Utils.getNextValueAsMethodID(index, event);
				//System.out.println("lCatchMethodId: "+lCatchMethodId+"    "+Long.toHexString(lCatchMethodId));
				lCatchLocationIndex = Utils.getNextValueAsLong(index, event);
				//System.out.println("lCatchLocationIndex: "+lCatchLocationIndex);
				//System.out.println("");

				eventInfo.iRequestId = iRequestId;
				eventInfo.lThreadId = lThreadId;
				eventInfo.bTypeTag = bTypeTag;
				eventInfo.lClassId = lClassId;
				eventInfo.lMethodId = lMethodId;
				eventInfo.lLocationIndex = lLocationIndex;
				eventInfo.lTaggedObjectId = lTaggedObjectId;
				eventInfo.bCatchTypeTag = bCatchTypeTag;
				eventInfo.lCatchClassId = lCatchClassId;
				eventInfo.lCatchMethodId = lCatchMethodId;
				eventInfo.lLocationIndex = lCatchLocationIndex;
			}
			else if ( bEventKind == Constants.EVENT_KIND_THREAD_START )
			{
				//System.out.println("EVENT_KIND_THREAD_START");

				iRequestId = Utils.getNextValueAsInt(index, event);
				//System.out.println("iRequestId: "+iRequestId);
				
				lThreadId = Utils.getNextValueAsObjectID(index, event);
				//System.out.println("lThreadId: "+lThreadId);

				eventInfo.iRequestId = iRequestId;
				eventInfo.lThreadId = lThreadId;
			}
			else if ( bEventKind == Constants.EVENT_KIND_THREAD_DEATH )
			{
				//System.out.println("EVENT_KIND_THREAD_DEATH");

				iRequestId = Utils.getNextValueAsInt(index, event);
				//System.out.println("iRequestId: "+iRequestId);
				
				lThreadId = Utils.getNextValueAsObjectID(index, event);
				//System.out.println("lThreadId: "+lThreadId);
				
				eventInfo.iRequestId = iRequestId;
				eventInfo.lThreadId = lThreadId;
			}
			else if ( bEventKind == Constants.EVENT_KIND_CLASS_PREPARE )
			{
				//System.out.println("EVENT_KIND_CLASS_PREPARE");

				iRequestId = Utils.getNextValueAsInt(index, event);
				//System.out.println("iRequestId: "+iRequestId);
				
				lThreadId = Utils.getNextValueAsObjectID(index, event);
				//System.out.println("lThreadId: "+lThreadId);
				
				bRefTypeTag = Utils.getNextValueAsByte(index, event);
				//System.out.println("bRefTypeTag: "+bRefTypeTag);
				
				lTypeId = Utils.getNextValueAsReferenceTypeID(index, event);
				//System.out.println("lTypeId: "+lTypeId);
				
				sSignature = Utils.getNextValueAsString(index, event);
				//System.out.println("sSignature: '"+sSignature+"'");
				
				iStatus = Utils.getNextValueAsInt(index, event);
				//System.out.println("iStatus: "+iStatus);
				
				eventInfo.iRequestId = iRequestId;
				eventInfo.lThreadId = lThreadId;
				eventInfo.bRefTypeTag = bRefTypeTag;
				eventInfo.lTypeId = lTypeId;
				eventInfo.sSignature = sSignature;
				eventInfo.iStatus = iStatus;
			}
			else if ( bEventKind == Constants.EVENT_KIND_CLASS_UNLOAD )
			{
				//System.out.println("EVENT_KIND_CLASS_UNLOAD");

				iRequestId = Utils.getNextValueAsInt(index, event);
				//System.out.println("iRequestId: "+iRequestId);

				sSignature = Utils.getNextValueAsString(index, event);
				//System.out.println("sSignature: '"+sSignature+"'");

				eventInfo.iRequestId = iRequestId;
				eventInfo.sSignature = sSignature;
			}
/*
			else if ( bEventKind == Constants.EVENT_KIND_FIELD_ACCESS )
			{
				System.out.println("EVENT_KIND_FIELD_ACCESS");

				iRequestId = Utils.getNextValueAsInt(index, event);
				System.out.println("iRequestId: "+iRequestId);
				
				lThreadId = Utils.getNextValueAsObjectID(index, event);
				System.out.println("lThreadId: "+lThreadId);

				// Location..
				bTypeTag = Utils.getNextValueAsByte(index, event);
				lClassId = Utils.getNextValueAsReferenceTypeID(index, event);
				lMethodId = Utils.getNextValueAsMethodID(index, event);
				lLocationIndex = Utils.getNextValueAsLong(index, event);
				
				bRefTypeTag = Utils.getNextValueAsByte(index, event);
				
				lTypeId = Utils.getNextValueAsReferenceTypeID(index, event);
				
				iFieldId = Utils.getNextValueAsInt(index, event);
				
				lTaggedObjectId = Utils.getNextValueAsObjectID(index, event);
				
				eventInfo.iRequestId = iRequestId;
				eventInfo.lThreadId = lThreadId;
				eventInfo.bTypeTag = bTypeTag;
				eventInfo.lClassId = lClassId;
				eventInfo.lMethodId = lMethodId;
				eventInfo.lLocationIndex = lLocationIndex;
				eventInfo.bRefTypeTag = bRefTypeTag;
				eventInfo.lTypeId = lTypeId;
				eventInfo.iFieldId = iFieldId;
				eventInfo.lTaggedObjectId = lTaggedObjectId;
				EventAr.add((EventInfo)eventInfo);
				
			}
			else if ( bEventKind == Constants.EVENT_KIND_FIELD_MODIFICATION )
			{
				System.out.println("EVENT_KIND_FIELD_MODIFICATION");

				iRequestId = Utils.getNextValueAsInt(index, event);
				System.out.println("iRequestId: "+iRequestId);
				
				iThreadId = Utils.getNextValueAsObjectID(index, event);
				System.out.println("iThreadId: "+iThreadId);

				// Location..
				bTypeTag = Utils.getNextValueAsByte(index, event);
				
				lClassId = Utils.getNextValueAsReferenceTypeID(index, event);
				
				lMethodId = Utils.getNextValueAsMethodID(index, event);
				
				lLocationIndex = Utils.getNextValueAsLong(index, event);
				
				
				bRefTypeTag = Utils.getNextValueAsByte(index, event);
				
				lTypeId = Utils.getNextValueAsReferenceTypeID(index, event);
				
				iFieldId = Utils.getNextValueAsInt(index, event);
				
				lTaggedObjectId = getNextValueAsObjectID(index, event);

				// Value..
				bSignatureByte = Utils.getNextValueAsByte(index, event);

				eventInfo.iRequestId = iRequestId;
				eventInfo.iThreadId = iThreadId;
				eventInfo.bTypeTag = bTypeTag;
				eventInfo.lClassId = lClassId;
				eventInfo.lMethodId = lMethodId;
				eventInfo.lLocationIndex = lLocationIndex;
				eventInfo.bRefTypeTag = bRefTypeTag;
				eventInfo.lTypeId = lTypeId;
				eventInfo.iFieldId = iFieldId;
				eventInfo.lTaggedObjectId = lTaggedObjectId;
				EventAr.add((EventInfo)eventInfo);
				
			}
/**/
			else if ( bEventKind == Constants.EVENT_KIND_VM_DEATH )
			{
				//System.out.println("EVENT_KIND_VM_DEATH");
				
				iRequestId = Utils.getNextValueAsInt(index, event);
				//System.out.println("iRequestId: "+iRequestId);
				
				eventInfo.iRequestId = iRequestId;
			}
		}
		
		//System.out.println("\nExiting InterpretEvent()");
		return (EventInfo)eventInfo;
	}	//}}}
	
	//{{{	ActionListener  actListener
	/**
     * Handle Events 
     */
	private ActionListener actListener = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			//System.out.println("== ActionListener ==");
/*			
			if ( e == null )
				System.out.println("e null");
			else
				System.out.println("e not null");
/**/			
			actionCommandS = e.getActionCommand();
			//System.out.println("actionCommandS: '"+actionCommandS+"'");
			
			StringBuffer commandSb = null;

/*			
			if ( projectHomeS == null )
				System.out.println("projectHomeS null");
			else
				System.out.println("projectHomeS: '"+projectHomeS+"'");
/**/
				
			
			// Check Project Home..
			if ( HOME.equals(actionCommandS) ||
					UPDATE.equals(actionCommandS) ||
					UPDATE_SUBMIT.equals(actionCommandS) ||
					UPDATE_CANCEL.equals(actionCommandS) ||
					CREATE.equals(actionCommandS) ||
					CREATE_SUBMIT.equals(actionCommandS) ||
					CREATE_CANCEL.equals(actionCommandS) ||
					PROJECT_PATH_CHOOSER.equals(actionCommandS) ||
					RELEASE_PW.equals(actionCommandS) )
				;
			else
			{
				if ( (projectHomeS != null) && (projectHomeS.length() > 0) )
				{
					int iLoc = projectHomeS.lastIndexOf('/');
					String sIn = projectHomeS.substring(iLoc + 1);
					if ( sIn.equals(actionCommandS) )
						;	// Same project..
					else
					{
						// Select project from submenu..
						//System.out.println("Select Project");
						// 'C:/Android/Dev/GT_Three~GRADLE'...
						String sOut = readStorage("recent.tmp");
						if ( (sOut != null) && (sOut.length() > 0) )
						{
							//System.out.println("sOut: '"+sOut+"'");
							StringTokenizer st = new StringTokenizer(sOut, "~");
							int iCount = st.countTokens();
							String sTok;
							String sTitle;
							for ( int iG = 0; iG < iCount; iG++ )
							{
								sTok = st.nextToken();
								//System.out.println("sTok: '"+sTok+"'");
								if ( (iG & 1) == 0 )
								{
									iLoc = sTok.lastIndexOf('/');
									if ( iLoc != -1 )
									{
										sTitle = sTok.substring(iLoc + 1);
										//System.out.println("sTitle: '"+sTitle+"'");
										if ( sTitle.equals(actionCommandS) )
										{
											// Get project type..
											sTitle = sTok;	// Save..
											sTok = st.nextToken();
											if ( sTok.equals("ANT") )
											{
												uGradleMenuItem.setState(false);
												uKotlinMenuItem.setState(false);
												uFlutterMenuItem.setState(false);
			 								}
											else if ( sTok.equals("KOTLIN") )
											{
												uGradleMenuItem.setState(true);
												uKotlinMenuItem.setState(true);
												uFlutterMenuItem.setState(false);
											}
											else if ( sTok.equals("GRADLE") )
											{
												uGradleMenuItem.setState(true);
												uKotlinMenuItem.setState(false);
												uFlutterMenuItem.setState(false);
											}
											else if ( sTok.equals("FLUTTER") )
											{
												uGradleMenuItem.setState(true);
												uKotlinMenuItem.setState(false);
												uFlutterMenuItem.setState(true);
											}
											
											projectHomeS = sTitle;
											statusLabel.setText(projectHomeS);
											statusPath.setText(" ");	// Clear status..
	
											updateStorage();
											init();		// Reset..
											break;
										}
									}
								}
							}
						}
					}
				}
				else
				{
					// Put up Dialog..
					JOptionPane.showMessageDialog(
						frame,
						"Please set Project Home.",
						"Project Home",
						JOptionPane.WARNING_MESSAGE);
					
					return;
				}
			}

			if ( CLEAN.equals(actionCommandS) )
			{
				// Clean..
				//System.out.println("\nCLEAN");
				//System.out.println("isEventDispatchThread(): "+
					//SwingUtilities.isEventDispatchThread());
				
				if ( bLogcatOn )
				{
					// Reset..
					logcatToggleButton.doClick();
					
					// Set to kill IOBgThread..
					bBreakOut = true;
					
					// Wait for IOBgThread to end..
					while ( true )
					{
						Thread.yield();
						if ( ! bLogcatOn )
							break;
					}

					// Restore..
					actionCommandS = CLEAN;
				}

				init();
				RefreshProperties();

				//System.out.println("bGradleSelected: "+bGradleSelected);
				if ( bGradleSelected )	
				{
					// Delete key.properties file..
					bDeleteKeyPropertiesFinished = false;
					bDeletedKeyProperties = false;
					deleteKeyPropertiesBgThread = new DeleteKeyPropertiesBgThread();
					deleteKeyPropertiesBgThread.start();

					while ( true )
					{
						if ( bDeleteKeyPropertiesFinished )
							break;
						
						try
						{
							Thread.sleep(250);						
						}
						catch (InterruptedException ie)
						{
						}
					}

					// Comment out signingConfigs storeFile
					bInitBuildGradleFinished = false;
					initializeBuildGradleBgThread = new InitializeBuildGradleBgThread();
					initializeBuildGradleBgThread.start();
					
					while ( true )
					{
						if ( bInitBuildGradleFinished )
							break;
						
						try
						{
							Thread.sleep(250);						
						}
						catch (InterruptedException ie)
						{
						}
					}
				}

				commandSb = new StringBuffer();
				
				if ( iOS == LINUX_MAC )
				{
					if ( bGradleSelected )
					{
						if ( bFlutterSelected )
						{
							//commandPhrase = "Deleting";
							commandPhrase = "flutter clean";
							
							commandSb.append(";export PATH=${PATH}:");						
							commandSb.append(sFlutterSdkPath);
							
							commandSb.append(";cd ");
							commandSb.append(projectHomeS);
							
							//commandSb.append(";flutter clean\n");
							commandSb.append(";flutter clean");
						}
						else
						{
							commandSb.append("export ANDROID_HOME=");
							commandSb.append(androidSdkPathS);

							if ( sGradleType.equals("gradle") )
							{
								commandSb.append(";export PATH=${PATH}:");						
								commandSb.append(gradlePathS);
							}
							
							commandSb.append(";export JAVA_HOME=");
							commandSb.append(javaPathS);
	
							commandSb.append(";cd ");
							commandSb.append(projectHomeS);
							
							commandSb.append(";");
							commandSb.append(sGradleType);
							commandSb.append(" ");

							if ( (gradleOfflineS != null) && (gradleOfflineS.equals("true")) )
								commandSb.append("--offline ");
							
							if ( (sGradleCommandOption != null) && (sGradleCommandOption.length() > 0) )
							{
								commandSb.append(sGradleCommandOption);
								commandSb.append(" ");
							}
							
							//commandSb.append("clean\n");
							commandSb.append("clean");
						}
					}
					else if ( bNDKSelected )
					{
						commandSb.append("export PATH=${PATH}:");
						commandSb.append(ndkPathS);
						
						commandSb.append(";cd ");
						commandSb.append(projectHomeS);
						
						commandSb.append(";ndk-build clean");
					}
					else
					{
						commandSb.append("export PATH=${PATH}:");
						commandSb.append(antPathS);
						commandSb.append(":");
						commandSb.append(javaPathS);
						
						commandSb.append(";export JAVA_HOME=");
						commandSb.append(javaPathS);

						commandSb.append(";cd ");
						commandSb.append(projectHomeS);
					
						commandSb.append(";ant clean");
					}
				}
				else
				{
					if ( bGradleSelected )
					{
						if ( bFlutterSelected )
						{
							commandPhrase = "flutter clean";
							
							commandSb.append("SET PATH=");
							commandSb.append(sFlutterSdkPath);
							commandSb.append(";%PATH%");
							
							commandSb.append("&&CD ");
							commandSb.append(projectHomeS);
							
							commandSb.append("&&flutter clean\n");
						}
						else
						{
							StringBuffer tSb = new StringBuffer(sGradleType);
							tSb.append(" ");
							commandPhrase = tSb.toString();
							
							commandSb.append("SET ANDROID_HOME=");
							commandSb.append(androidSdkPathS);

							if ( sGradleType.equals("gradle") )
							{
								commandSb.append("&&SET PATH=");
								commandSb.append(gradlePathS);
								commandSb.append(";%PATH%");
							}
							
							commandSb.append("&&SET JAVA_HOME=");
							commandSb.append(javaPathS);
							
							commandSb.append("&&cd ");
							commandSb.append(projectHomeS);
	
							commandSb.append("&&");
							commandSb.append(sGradleType);
							commandSb.append(" ");
							
							if ( (gradleOfflineS != null) && (gradleOfflineS.equals("true")) )
								commandSb.append("--offline ");
	
							if ( (sGradleCommandOption != null) && (sGradleCommandOption.length() > 0) )
							{
								commandSb.append(sGradleCommandOption);
								commandSb.append(" ");
							}
	
							commandSb.append("clean\n");
						}
					}
					else if ( bNDKSelected )
					{
						commandPhrase = "build clean";
						
						commandSb.append("SET PATH=");
						commandSb.append(ndkPathS);
						commandSb.append(";%PATH%");
						
						commandSb.append("&&cd ");
						commandSb.append(projectHomeS);

						commandSb.append("&&ndk-build clean\n");						
					}
					else
					{
						commandPhrase = "ant clean";
						
						commandSb.append("SET PATH=");
						commandSb.append(antPathS);
						commandSb.append(";");
						commandSb.append(javaPathS);
						commandSb.append(";%PATH%");
						
						commandSb.append("&&SET JAVA_HOME=");
						commandSb.append(javaPathS);

						commandSb.append("&&CD ");
						commandSb.append(projectHomeS);
					
						commandSb.append("&&ant clean");
						commandSb.append("\n");
						
						//bDoKill = true;
					}
				}
				
				commandS = commandSb.toString();
				//System.out.println("commandS: '"+commandS+"'");
				
				if ( (bGradleSelected) && (bFlutterSelected == false) )
				{
					bIsCleanDebug = true;

					// Note:
					// ShowProgressTask() runs IOBgThread()..
					showProgressTask = new ShowProgressTask();
					showProgressTask.execute();
				}
				else
				{
					ioBgThread = new IOBgThread();
					ioBgThread.start();
				}
			}
			else if ( DEBUG.equals(actionCommandS) ||
				BUILD.equals(actionCommandS) )
			{
				//System.out.println("\nDEBUG/BUILD");
				// Debug..
				boolean bRegularBuild;
				iBuildType = DEBUG_BUILD;
				String saveS = actionCommandS;
				
				if ( bLogcatOn )
				{
					// Reset..
					logcatToggleButton.doClick();

					// Set to kill IOBgThread..
					bBreakOut = true;
					
					// Wait for IOBgThread to end..
					while ( true )
					{
						Thread.yield();
						if ( ! bLogcatOn )
							break;
					}
					
					// Restore..
					actionCommandS = saveS;
				}

				//bKillAdb = true;	// Set to kill adb..
				
				init();
				
				if ( bFlutterSelected || bGradleSelected )
				{
					// Select 'debug' in buildTypes..
					bDebugReleaseFinished = false;
					bEnableStoreFile = false;
					bEnableBuildTypesDebug = true;
					bEnableBuildTypesRelease = false;
					debugReleaseBgThread = new DebugReleaseBgThread();
					debugReleaseBgThread.start();

					while ( true )
					{
						if ( bDebugReleaseFinished )
							break;
						
						try
						{
							Thread.sleep(250);
						}
						catch (InterruptedException ie)
						{
						}
					}
				}
				
				commandSb = new StringBuffer();

				if ( iOS == LINUX_MAC )
				{
					if ( bGradleSelected )
					{
						if ( bFlutterSelected )
						{
							//commandPhrase = "Built";
							commandPhrase = "Gradle task";
							commandSb.append(";export PATH=${PATH}:");						
							commandSb.append(sFlutterSdkPath);
							
							commandSb.append(";cd ");
							commandSb.append(projectHomeS);

							bRegularBuild = true;
							if ( (sUseAppBundle != null) && (sUseAppBundle.length() > 0) )
							{
								if ( sUseAppBundle.equals("true") )
								{
									bRegularBuild = false;
									commandSb.append(";flutter build appbundle --debug");
	
									if ( (sAndroidTargetPlatform != null) && (sAndroidTargetPlatform.length() > 0) )
									{
										if ( sAndroidTargetPlatform.equals("android-arm") )
											commandSb.append(" --target-platform android-arm");
										else if ( sAndroidTargetPlatform.equals("android-arm64") )
											commandSb.append(" --target-platform android-arm64");
									}
								}
							}
							
							if ( bRegularBuild )
							{
								commandSb.append(";flutter build ");
							
								if ( (sBuildTarget != null) && (sBuildTarget.length() > 0) )
								{
									if ( sBuildTarget.equals("apk") )
										commandSb.append("apk --debug");
									else if ( sBuildTarget.equals("ios") )
										commandSb.append("ios --debug");
									
									if ( (sBuildApkOption != null) && (sBuildApkOption.length() > 0) )
									{
										sBuildApkOption = sBuildApkOption.trim();
										commandSb.append(" ");
										commandSb.append(sBuildApkOption);
									}
								}
							}
						}
						else
						{
							// Gradle, Kotlin..
							commandSb.append("export ANDROID_HOME=");
							commandSb.append(androidSdkPathS);

							if ( sGradleType.equals("gradle") )
							{
								commandSb.append(";export PATH=${PATH}:");
								commandSb.append(gradlePathS);
								commandSb.append(":");
								commandSb.append(javaPathS);
							}
							else
							{
								commandSb.append(";export PATH=${PATH}:");
								commandSb.append(javaPathS);
							}
							
							commandSb.append(";export JAVA_HOME=");
							commandSb.append(javaPathS);
							
							commandSb.append(";cd ");
							commandSb.append(projectHomeS);
						
							commandSb.append(";");
							commandSb.append(sGradleType);
							commandSb.append(" ");

							if ( (gradleOfflineS != null) && (gradleOfflineS.equals("true")) )
								commandSb.append("--offline ");
	
							if ( (sGradleCommandOption != null) && (sGradleCommandOption.length() > 0) )
							{
								commandSb.append(sGradleCommandOption);
								commandSb.append(" ");
							}
	
							commandSb.append(ASSEMBLE_DEBUG);
							//commandSb.append("\n");
						}
					}
					else if ( bNDKSelected )
					{
						commandSb.append("export PATH=${PATH}:");
						commandSb.append(ndkPathS);
						
						commandSb.append(";cd ");
						commandSb.append(projectHomeS);
					
						commandSb.append(";ndk-build");
					}
					else
					{
						// Android Ant..
						commandSb.append("export PATH=${PATH}:");
						commandSb.append(antPathS);
						commandSb.append(":");
						commandSb.append(javaPathS);
						
						commandSb.append(";export JAVA_HOME=");
						commandSb.append(javaPathS);
						
						commandSb.append(";cd ");
						commandSb.append(projectHomeS);
					
						commandSb.append(";ant debug");
						
						//bDoKill = true;
					}
				}
				else
				{
					// Windows..
					if ( bGradleSelected )
					{
						if ( bFlutterSelected )
						{
							// Debug build..
							commandPhrase = "Gradle task";
							
							commandSb.append("SET PATH=");
							commandSb.append(sFlutterSdkPath);
							commandSb.append(";%PATH%");
							
							commandSb.append("&&cd ");
							commandSb.append(projectHomeS);

							bRegularBuild = true;
							if ( (sUseAppBundle != null) && (sUseAppBundle.length() > 0) )
							{
								if ( sUseAppBundle.equals("true") )
								{
									bRegularBuild = false;
									commandSb.append("&&flutter build appbundle --debug");
	
									if ( (sAndroidTargetPlatform != null) && (sAndroidTargetPlatform.length() > 0) )
									{
										if ( sAndroidTargetPlatform.equals("android-arm") )
											commandSb.append(" --target-platform android-arm");
										else if ( sAndroidTargetPlatform.equals("android-arm64") )
											commandSb.append(" --target-platform android-arm64");
									}
									
									commandSb.append("\n");
								}
							}

							if ( bRegularBuild )
							{
								commandSb.append("&&flutter build ");
								commandSb.append("apk --debug");
								
								if ( (sBuildApkOption != null) && (sBuildApkOption.length() > 0) )
								{
									sBuildApkOption = sBuildApkOption.trim();
									commandSb.append(" ");
									commandSb.append(sBuildApkOption);
								}
								
								commandSb.append("\n");
							}
						}
						else
						{
							// Gradle, Kotlin..
							commandPhrase = ASSEMBLE_DEBUG;
							
							commandSb.append("SET ANDROID_HOME=");
							commandSb.append(androidSdkPathS);

							if ( sGradleType.equals("gradle") )
							{
								commandSb.append("&&SET PATH=");
								commandSb.append(gradlePathS);
								commandSb.append(";");
								commandSb.append(javaPathS);
								commandSb.append(";%PATH%");
							}
							else
							{
								commandSb.append("&&SET PATH=");
								commandSb.append(javaPathS);
								commandSb.append(";%PATH%");
							}
							
							commandSb.append("&&SET JAVA_HOME=");
							commandSb.append(javaPathS);
	
							commandSb.append("&&CD ");
							commandSb.append(projectHomeS);
	
							commandSb.append("&&");
							commandSb.append(sGradleType);
							commandSb.append(" ");

							if ( (gradleOfflineS != null) && (gradleOfflineS.equals("true")) )
								commandSb.append("--offline ");
							
							if ( (sGradleCommandOption != null) && (sGradleCommandOption.length() > 0) )
							{
								commandSb.append(sGradleCommandOption);
								commandSb.append(" ");
							}
							
							commandSb.append(ASSEMBLE_DEBUG);
							commandSb.append("\n");
						}
					}
					else if ( bNDKSelected )
					{
						commandPhrase = "ndk-build";
						
						commandSb.append("SET PATH=");
						commandSb.append(ndkPathS);
						commandSb.append(";%PATH%");

						commandSb.append("&&cd ");
						commandSb.append(projectHomeS);

						commandSb.append("&&ndk-build\n");						
					}
					else
					{
						// Android Ant..
						commandPhrase = "ant debug";
						
						commandSb.append("SET PATH=");
						commandSb.append(antPathS);
						commandSb.append(";%PATH%");
					
						commandSb.append("&&SET JAVA_HOME=");
						commandSb.append(javaPathS);
						
						commandSb.append("&&CD ");
						commandSb.append(projectHomeS);
					
						commandSb.append("&&ant debug\n");
						
						//bDoKill = true;
					}
				}

				commandS = commandSb.toString();
				
				//System.out.println("commandS: '"+commandS+"'");

				if ( bGradleSelected )
				{
					// Note:
					// ShowProgressTask() runs IOBgThread()..
					bIsCleanDebug = true;
					showProgressTask = new ShowProgressTask();
					showProgressTask.execute();
				}
				else
				{
					ioBgThread = new IOBgThread();
					ioBgThread.start();
				}
			}
			else if ( PRE_RELEASE.equals(actionCommandS) )
			{
				bOkayToDoRelease = false;
				bReleaseCheckFinished = false;
				releaseCheckBgThread = new ReleaseCheckBgThread();
				releaseCheckBgThread.start();
				
				CheckKeystorePasswords();
			}
			else if ( RELEASE.equals(actionCommandS) )
			{
				//System.out.println("RELEASE");
				boolean bRegularBuild;
				if ( bLogcatOn )
				{
					// Reset..
					logcatToggleButton.doClick();

					// Set to kill IOBgThread..
					bBreakOut = true;
					
					// Wait for IOBgThread to end..
					while ( true )
					{
						Thread.yield();
						if ( ! bLogcatOn )
							break;
					}
					
					// Restore..
					//actionCommandS = RELEASE;
				}
				
				init();
				
				iBuildType = RELEASE_BUILD;

				if ( bGradleSelected )
				{
					// Select 'release' in buildTypes..
					bDebugReleaseFinished = false;
					bEnableStoreFile = true;
					bEnableBuildTypesDebug = false;
					bEnableBuildTypesRelease = true;
					debugReleaseBgThread = new DebugReleaseBgThread();
					debugReleaseBgThread.start();

					while ( true )
					{
						if ( bDebugReleaseFinished )
							break;
						
						try
						{
							Thread.sleep(250);
						}
						catch (InterruptedException ie)
						{
						}
					}
				}

				commandSb = new StringBuffer();

				if ( iOS == LINUX_MAC )
				{
					if ( bGradleSelected )
					{
						if ( bFlutterSelected )
						{
							// Flutter..
							commandPhrase = "Gradle task";	// Allow for errors..
							
							commandSb.append(";export PATH=${PATH}:");						
							commandSb.append(sFlutterSdkPath);
							
							commandSb.append(";cd ");
							commandSb.append(projectHomeS);
						}
						else
						{
							// Gradle, Kotlin..
							commandSb.append("export ANDROID_HOME=");
							commandSb.append(androidSdkPathS);

							if ( sGradleType.equals("gradle") )
							{
								commandSb.append(";export PATH=${PATH}:");
								commandSb.append(gradlePathS);
								commandSb.append(":");
								commandSb.append(javaPathS);
							}
							else
							{
								commandSb.append(";export PATH=${PATH}:");
								commandSb.append(javaPathS);
							}
							
							commandSb.append(";export JAVA_HOME=");
							commandSb.append(javaPathS);
							
							commandSb.append(";cd ");
							commandSb.append(projectHomeS);
						}
					}
					else
					{
						// Android Ant..
						commandSb.append("export PATH=${PATH}:");
						commandSb.append(antPathS);
						commandSb.append(":");
						commandSb.append(javaPathS);
						
						commandSb.append(";export JAVA_HOME=");
						commandSb.append(javaPathS);
						
						commandSb.append(";cd ");
						commandSb.append(projectHomeS);
					}
					
					commandSb.append(";");
				}
				else
				{
					if ( bGradleSelected )
					{
						if ( bFlutterSelected )
						{
							// Flutter..
							commandPhrase = "Gradle task";	// Allow for errors..
							
							commandSb.append("SET PATH=");
							commandSb.append(sFlutterSdkPath);
							commandSb.append(";%PATH%");
							
							commandSb.append("&&CD ");
							commandSb.append(projectHomeS);
						}
						else
						{
							// Gradle, Kotlin..
							commandSb.append("SET ANDROID_HOME=");
							commandSb.append(androidSdkPathS);

							//System.out.println("sGradleType: '"+sGradleType+"'");
							if ( sGradleType.equals("gradle") )
							{
								commandSb.append("&&SET PATH=");
								commandSb.append(gradlePathS);
								commandSb.append(";");
								commandSb.append(javaPathS);
								commandSb.append(";%PATH%");
							}
							else
							{
								commandSb.append("&&SET PATH=");
								commandSb.append(javaPathS);
								commandSb.append(";%PATH%");
							}
							
							commandSb.append("&&SET JAVA_HOME=");
							commandSb.append(javaPathS);
	
							commandSb.append("&&CD ");
							commandSb.append(projectHomeS);
						}
					}
					else
					{
						// Android Ant..
						commandSb.append("SET PATH=");
						commandSb.append(antPathS);
						commandSb.append(";%PATH%");
						
						commandSb.append("&&SET JAVA_HOME=");
						commandSb.append(javaPathS);
						
						commandSb.append("&&CD ");
						commandSb.append(projectHomeS);
					}
					
					commandSb.append("&&");
				}

				/**
				 * Finish command with leading ';' or '&&'
				 * supplied above..
				 */

				if ( bGradleSelected )
				{
					if ( bFlutterSelected )
					{
						// Release..
						// Flutter..

						bRegularBuild = true;
						if ( (sUseAppBundle != null) && (sUseAppBundle.length() > 0) )
						{
							if ( sUseAppBundle.equals("true") )
							{
								bRegularBuild = false;
								commandSb.append("flutter build appbundle --release");
	
								if ( (sAndroidTargetPlatform != null) && (sAndroidTargetPlatform.length() > 0) )
								{
									if ( sAndroidTargetPlatform.equals("android-arm") )
										commandSb.append(" --target-platform android-arm");
									else if ( sAndroidTargetPlatform.equals("android-arm64") )
										commandSb.append(" --target-platform android-arm64");
								}
							}
						}
						
						if ( bRegularBuild )
						{
						
							commandSb.append("flutter build ");
						
/*
							if ( sBuildTarget == null )
								System.out.println("sBuildTarget null");
							else
								System.out.println("sBuildTarget: '"+sBuildTarget+"'");
/**/								
							if ( (sBuildTarget != null) && (sBuildTarget.length() > 0) )
							{
								if ( sBuildTarget.equals("apk") )
									commandSb.append("apk --release");
								else if ( sBuildTarget.equals("ios") )
									commandSb.append("ios --release");
								
								if ( (sAndroidTargetPlatform != null) && (sAndroidTargetPlatform.length() > 0) )
								{
									if ( sAndroidTargetPlatform.equals("android-arm64") )
									{
										if ( sAndroidTargetPlatform.equals("android-arm") )
											commandSb.append(" --target-platform android-arm");
										else if ( sAndroidTargetPlatform.equals("android-arm64") )
											commandSb.append(" --target-platform android-arm64");
									}
								}
								
								if ( (sBuildApkOption != null) && (sBuildApkOption.length() > 0) )
								{
									sBuildApkOption = sBuildApkOption.trim();
									commandSb.append(" ");
									commandSb.append(sBuildApkOption);
								}
							}
						}
					}
					else
					{
						// Gradle, Kotlin..
						commandPhrase = ASSEMBLE_RELEASE;
						
						commandSb.append(sGradleType);
						commandSb.append(" ");

						if ( (gradleOfflineS != null) && (gradleOfflineS.equals("true")) )
							commandSb.append("--offline ");

						if ( (sGradleCommandOption != null) && (sGradleCommandOption.length() > 0) )
						{
							commandSb.append(sGradleCommandOption);
							commandSb.append(" ");
						}

						commandSb.append(ASSEMBLE_RELEASE);
					}
				}
				else
				{
					// For Ant we still pass them through the command line..
					commandPhrase = "ant release";
					
					commandSb.append("ant release -Dkey.store.password=");
					commandSb.append(sKeystorePassword);

					commandSb.append(" -Dkey.alias.password=");
					commandSb.append(sKeyAliasPassword);

					commandSb.append(" -Dkey.store=");
					commandSb.append(sKeystorePath);
					
					commandSb.append(" -Dkey.alias=");
					commandSb.append(sKeyAlias);
				}
				
				if ( iOS == WINDOWS )
					commandSb.append("\n");

				//System.out.println("commandSb: '"+commandSb.toString()+"'");
				
				if ( bGradleSelected )
				{
					SwingWorker swingWorker = new SwingWorker()
					{
						@Override
						public Void doInBackground()
						{
							//System.out.println("SwingWorker doInBackground()");
							progressJFrame = new JFrame();
							jProgressBar = new JProgressBar();
							jProgressBar.setIndeterminate(true);
							jProgressBar.setPreferredSize(new Dimension(200, 30));
							
							progressJFrame.setUndecorated(true);
							progressJFrame.add(jProgressBar);
							progressJFrame.pack();
							progressJFrame.setVisible(true);
							progressJFrame.setLocationRelativeTo(mainJFrame);
							progressJFrame.setAlwaysOnTop(true);

							// Create /android/key.properties..
							bReleaseFinished = false;
							releaseBgThread = new ReleaseBgThread();
							releaseBgThread.start();
							
							// Wait for ReleaseBgThread to end..
							while ( true )
							{
								try
								{
									Thread.sleep(20);
								}
								catch (InterruptedException ie)
								{
								}
								
								//Thread.yield();

								if ( bReleaseFinished )
									break;
							}
							
							bFinished = false;
							ioBgThread = new IOBgThread();
							ioBgThread.start();

							// Wait for Thread to finish..
							while ( true )
							{
								Thread.yield();
								if ( bFinished )
									break;
							}
							
							return null;
						}
						
						@Override
						public void done()
						{
							progressJFrame.dispose();
						}
					};
					
					commandS = commandSb.toString();
					swingWorker.execute();
				}
				else
				{
					commandS = commandSb.toString();

					bFinished = false;
					ioBgThread = new IOBgThread();
					ioBgThread.start();
				}
			}
			else if ( RUN.equals(actionCommandS) )
			{
				//System.out.println("RUN");
				// Check for a device..				
				//bDevicesFinished = false;
				completeLatch = new CountDownLatch(1);
				
				getDevicesBgThread = new GetDevicesBgThread();
				getDevicesBgThread.start();
				
				try
				{
					completeLatch.await();
				}
				catch (InterruptedException ie)
				{
				}

/*
				if ( DevicesAr == null )
					System.out.println("DevicesAr null");
				else
					System.out.println("DevicesAr.size(): "+DevicesAr.size());
/**/				
				if ( (DevicesAr != null) && (DevicesAr.size() > 0) )
				{
					bRunSelected = true;
					
					if ( stopButton != null )
						stopButton.setVisible(true);
					
					if ( killButton != null )
						killButton.setVisible(false);
					
					bKillDaemonThread = false;
					flutterDaemonBgThread = new FlutterDaemonBgThread();
					flutterDaemonBgThread.start();

					
				}
				else
				{
					// No devices..
					//System.out.println("bWirelessConnected: "+bWirelessConnected);
					if ( bWirelessConnected )
					{
						// Try to re-start..
						
						//bConnectWirelessFinished = false;
						completeLatch = new CountDownLatch(1);
						
						connectWirelessBgThread = new ConnectWirelessBgThread();
						connectWirelessBgThread.start();
						
						try
						{
							completeLatch.await();
						}
						catch (InterruptedException ie)
						{
						}
						

						bRunSelected = true;
						
						if ( stopButton != null )
							stopButton.setVisible(true);
						
						if ( killButton != null )
							killButton.setVisible(false);
						
						bKillDaemonThread = false;
						flutterDaemonBgThread = new FlutterDaemonBgThread();
						flutterDaemonBgThread.start();

					}
					
					//System.out.println("iWirelessErrorCode: "+iWirelessErrorCode);
					//System.out.println("bWirelessConnected: "+bWirelessConnected);

/*					
					// Check success..
					if ( (iWirelessErrorCode == 0) || bWirelessConnected )
					{
						
					}
/**/					
					
				}
			}
			else if ( HOT_RELOAD.equals(actionCommandS) )
			{
				//System.out.println("HOT_RELOAD");
				iDaemonCommand = DAEMON_RELOAD;
/*				
				if ( daemonProcess == null )
					System.out.println("daemonProcess null");
				else
					System.out.println("daemonProcess not null");
/**/


				if ( daemonProcess == null )
				{
					flutterDaemonBgThread = new FlutterDaemonBgThread();
					flutterDaemonBgThread.start();
				}
				
				flutterDaemonStdInBgThread = new FlutterDaemonStdInBgThread();
				flutterDaemonStdInBgThread.start();
/**/

			}
			else if ( STOP.equals(actionCommandS) )
			{
				//System.out.println("STOP");
				
				iDaemonCommand = DAEMON_STOP;
				bDaemonStdInFinished = false;
				flutterDaemonStdInBgThread = new FlutterDaemonStdInBgThread();
				flutterDaemonStdInBgThread.start();

				while ( true )
				{
					if ( bDaemonStdInFinished )
						break;
					
					try
					{
						Thread.sleep(250);						
					}
					catch (InterruptedException ie)
					{
					}
				}
				
				bKillDaemonThread = true;
				bRunSelected = false;
				
				if ( stopButton != null )
					stopButton.setVisible(false);
				
				if ( killButton != null )
					killButton.setVisible(true);
				
			}
			else if ( LOGCAT.equals(actionCommandS) )
			{
				// Logcat..
				//System.out.println("LOGCAT");
				AbstractButton absButton = (AbstractButton)e.getSource();
				boolean bSelected = absButton.getModel().isSelected();

				//System.out.println("bSelected: "+bSelected);
				if ( bSelected )
				{
					// Not currently selected..
					bLogcatOn = true;
					commandSb = new StringBuffer();

					if ( iOS == LINUX_MAC )
					{
						commandSb.append("export PATH=${PATH}:");
						commandSb.append(androidSdkPathS);
						commandSb.append("/platform-tools");
						
						commandSb.append(";");
					}
					else
					{
						commandSb.append("SET PATH=");
						commandSb.append(androidSdkPathS);
						commandSb.append("/platform-tools");
						commandSb.append(";%PATH%");
						
						commandSb.append("&&");
					}
					
					bLogcatWasOn = true;
	
					String tS;
					StringTokenizer st = null;
					
					if ( (logcatFilterS != null) && (! logcatFilterS.equals("")) )
					{
						// Construct Logcat command..
						st = new StringTokenizer(logcatFilterS, ",");
						int iTokCount = st.countTokens();
					}

/*
					// The number of adb processes can build up
					// greatly affecting the speed of the app,
					// this helps to keep it under some control.				
					if ( iOS == LINUX_MAC )
					{
						commandSb.append(";adb kill-server");
						commandSb.append(";");
					}
					else
						commandSb.append("adb kill-server\n");
/**/

					commandSb.append("adb ");

					if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
					{
						commandSb.append("-s ");
						commandSb.append(sDeviceName);
						commandSb.append(" ");
					}
					
					commandSb.append("logcat");
					
	
					if ( (logcatFilterS != null) && (! logcatFilterS.equals("")) )
					{
						while ( st.hasMoreTokens() )
						{
							tS = st.nextToken();
							commandSb.append(" ");
							commandSb.append(tS);
							commandSb.append(":F");
						}
					}

					if ( iOS == WINDOWS )
					{
						commandSb.append("\n");
					}
					
					textPane.setText("");
				
					commandS = commandSb.toString();
					//System.out.println("commandS: '"+commandS+"'");
					
					ioBgThread = new IOBgThread();
					ioBgThread.start();
				}
				else
				{
					// Already selected..
					bBreakOut = true;	// Set to kill IOBgThread..
					bLogcatOn = false;
					bKillLogcat = true;	// Signal to kill for logcat..
				}					
			}
			else if ( KILL_SERVER.equals(actionCommandS) )
			{
				// Kill-Server..
				StringBuffer mSb;
				if ( bLogcatOn )
				{
					// Reset..
					logcatToggleButton.doClick();

					// Set to kill IOBgThread..
					bBreakOut = true;
					
					// Wait for IOBgThread to end..
					while ( true )
					{
						Thread.yield();
						if ( ! bLogcatOn )
							break;
					}
					
					// Restore..
					actionCommandS = KILL_SERVER;
				}
				
				commandSb = new StringBuffer();
				
				if ( iOS == LINUX_MAC )
				{
					commandSb.append("export PATH=${PATH}:");
					commandSb.append(androidSdkPathS);
					commandSb.append("/platform-tools");
					
					commandSb.append(";adb kill-server");
					
					if ( bWirelessConnected )
					{
						mSb = new StringBuffer();
						if ( (ConnectDevicesAr != null) && (ConnectDevicesAr.size() > 1) )
						{
							mSb.append(";adb -s ");
							
							// For initial Connect, original device name
							// for ReConnect, wirelessId..
							mSb.append(sDeviceName);
							mSb.append(" connect ");
							mSb.append(sWirelessID);
						}
						else
						{
							mSb.append(";adb connect ");
							mSb.append(sWirelessID);
						}
						
						commandSb.append(mSb.toString());
					}

				}
				else
				{
					commandPhrase = "adb kill-server";
					
					commandSb.append("SET PATH=");
					commandSb.append(androidSdkPathS);
					commandSb.append("/platform-tools");
					commandSb.append(";%PATH%");

					commandSb.append("&&adb kill-server");
					
					if ( bWirelessConnected )
					{
						mSb = new StringBuffer();
						if ( (ConnectDevicesAr != null) && (ConnectDevicesAr.size() > 1) )
						{
							mSb.append("&&adb -s ");
							
							// For initial Connect, original device name
							// for ReConnect, wirelessId..
							mSb.append(sDeviceName);
							mSb.append(" connect ");
							mSb.append(sWirelessID);
						}
						else
						{
							mSb.append("&&adb connect ");
							mSb.append(sWirelessID);
						}
						
						commandSb.append(mSb.toString());
					}
					
					commandSb.append("\n");
				}
				
				commandS = commandSb.toString();
				
				ioBgThread = new IOBgThread();
				ioBgThread.start();
			}
			else if ( DEVICES.equals(actionCommandS) )
			{
				// Devices..
				if ( bLogcatOn )
				{
					// Reset..
					logcatToggleButton.doClick();

					// Set to kill IOBgThread..
					bBreakOut = true;
					
					// Wait for IOBgThread to end..
					while ( true )
					{
						Thread.yield();
						if ( ! bLogcatOn )
							break;
					}
					
					// Restore..
					actionCommandS = DEVICES;
				}
				
				commandSb = new StringBuffer();
				
				if ( iOS == LINUX_MAC )
				{
					commandSb.append("export PATH=${PATH}:");
					commandSb.append(androidSdkPathS);
					commandSb.append("/platform-tools");
					
					commandSb.append(";adb devices -l");
				}
				else
				{
					commandPhrase = "adb devices";
					
					commandSb.append("SET PATH=");
					commandSb.append(androidSdkPathS);
					commandSb.append("/platform-tools");
					commandSb.append(";%PATH%");
				
					commandSb.append("&&adb devices -l");
					commandSb.append("\n");
				}
				
				commandS = commandSb.toString();
				
				ioBgThread = new IOBgThread();
				ioBgThread.start();
			}
			else if ( UNINSTALL.equals(actionCommandS) )
			{
				//System.out.println("\nUNINSTALL");
				// Uninstall..
				if ( bLogcatOn )
				{
					// Reset..
					logcatToggleButton.doClick();

					// Set to kill IOBgThread..
					bBreakOut = true;
					
					// Wait for IOBgThread to end..
					while ( true )
					{
						Thread.yield();
						if ( ! bLogcatOn )
						{
							break;
						}
					}
					
					// Restore..
					actionCommandS = UNINSTALL;
				}
				
				getPackageName();
/*
				if ( packageNameS == null )				
					System.out.println("packageNameS null");
				else
					System.out.println("packageNameS: '"+packageNameS+"'");
/**/

				//bKillAdb = true;
				commandSb = new StringBuffer();
				
				if ( iOS == LINUX_MAC )
				{
					commandSb.append("export PATH=${PATH}:");
					commandSb.append(androidSdkPathS);
					commandSb.append("/platform-tools");
					
					commandSb.append(";adb ");

					if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
					{
						commandSb.append("-s ");
						commandSb.append(sDeviceName);
						commandSb.append(" ");
					}
					
					commandSb.append("uninstall ");
					commandSb.append(packageNameS);
					
					//bDoKill = true;
				}
				else
				{
					commandPhrase = "adb uninstall";
					
					commandSb.append("SET PATH=");
					commandSb.append(androidSdkPathS);
					commandSb.append("/platform-tools");
					commandSb.append(";%PATH%");
					
					commandSb.append("&&adb ");

					if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
					{
						commandSb.append("-s ");
						commandSb.append(sDeviceName);
						commandSb.append(" ");
					}
					
					commandSb.append("uninstall ");
					commandSb.append(packageNameS);
					commandSb.append("\n");
					
					//bDoKill = true;		// Calls KillAdbBgThread() on IOBgThread exit..
				}

				if ( bWirelessConnected == false )
				{
					// Signal to kill adb..
					bKillLogcat = true;
				}

				commandS = commandSb.toString();
				
				ioBgThread = new IOBgThread();
				ioBgThread.start();
			}
			else if ( INSTALL.equals(actionCommandS) )
			{
				//System.out.println("\nINSTALL");
				//System.out.println("bLogcatOn: "+bLogcatOn);
				// Install..
				if ( bLogcatOn )
				{
					// Reset..
					logcatToggleButton.doClick();

					// Set to kill IOBgThread..
					bBreakOut = true;
					
					// Wait for IOBgThread to end..
					while ( true )
					{
						Thread.yield();
						if ( ! bLogcatOn )
							break;
					}
					
					// Restore..
					actionCommandS = INSTALL;
				}

/*
				if ( projectHomeS == null )
					System.out.println("projectHomeS null");
				else
					System.out.println("projectHomeS: '"+projectHomeS+"'");
/**/

				if ( (projectHomeS != null) && (! projectHomeS.equals("")) )
					;
				else
					init();

				commandSb = new StringBuffer();
				
				getApk();
				
				// Do the Install..
				//bKillAdb = true;
				commandSb = new StringBuffer();
				
				if ( iOS == LINUX_MAC )
				{
					commandSb.append("export PATH=${PATH}:");
					commandSb.append(androidSdkPathS);
					commandSb.append("/platform-tools");
					
					commandSb.append(";adb ");

					if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
					{
						commandSb.append("-s ");
						commandSb.append(sDeviceName);
						commandSb.append(" ");
					}
					
					//commandSb.append("install ");
					commandSb.append("install -r ");
					
					// Construct path to .apk..
					commandSb.append(projectHomeS);
					
					boolean bGradleSelected = uGradleMenuItem.getState();
					if ( bGradleSelected )
					{
						if ( bFlutterSelected )
						{
							commandSb.append("/build/app/outputs/apk");
								
							if ( iBuildType == RELEASE_BUILD )
								commandSb.append("/release/");
							else if ( iBuildType == DEBUG_BUILD )
								commandSb.append("/debug/");
						}
						else
						{
							if ( bUsingAppProject )
								commandSb.append("/app/build/outputs/apk/");
							else
								commandSb.append("/build/outputs/apk/");
							
							if ( iBuildType == RELEASE_BUILD )
								commandSb.append("release/");
							else if ( iBuildType == DEBUG_BUILD )
								commandSb.append("debug/");
						}
					}
					else
						commandSb.append("/bin/");
					
					commandSb.append(apkNameS);
					
					//bDoKill = true;
				}
				else
				{
					commandPhrase = "adb install";
					
					commandSb.append("SET PATH=");
					commandSb.append(androidSdkPathS);
					commandSb.append("/platform-tools");
					commandSb.append(";%PATH%");
					
					commandSb.append("&&adb ");

					if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
					{
						commandSb.append("-s ");
						commandSb.append(sDeviceName);
						commandSb.append(" ");
					}
					
					//commandSb.append("install ");
					commandSb.append("install -r ");
					commandSb.append(projectHomeS);
					
					boolean bGradleSelected = uGradleMenuItem.getState();
					if ( bGradleSelected )
					{
						if ( bFlutterSelected )
						{
							commandSb.append("/build/app/outputs/apk");
								
							if ( iBuildType == RELEASE_BUILD )
								commandSb.append("/release/");
							else if ( iBuildType == DEBUG_BUILD )
								commandSb.append("/debug/");
						}
						else
						{
							if ( bUsingAppProject )
								commandSb.append("/app/build/outputs/apk/");
							else
								commandSb.append("/build/outputs/apk/");
							
							if ( iBuildType == RELEASE_BUILD )
								commandSb.append("release/");
							else if ( iBuildType == DEBUG_BUILD )
								commandSb.append("debug/");
						}
					}
					else
						commandSb.append("/bin/");

/*
					if ( apkNameS == null )
						System.out.println("apkNameS null");
					else
						System.out.println("apkNameS: '"+apkNameS+"'");
/**/

					commandSb.append(apkNameS);
					commandSb.append("\n");

					//bDoKill = true;		// Calls KillAdbBgThread() on IOBgThread exit..
				}

				if ( bWirelessConnected == false )
				{
					// Signal to kill adb..
					bKillLogcat = true;
				}

				commandS = commandSb.toString();
				
				ioBgThread = new IOBgThread();
				ioBgThread.start();
				
			}
			else if ( (BREAKPOINT.equals(actionCommandS)) && (iCardShowing == DEBUG_CARD) )
			{
				// Breakpoint button hit..
				//System.out.println("\nBREAKPOINT");
				
				iDebugCommand = DEBUG_COMMAND_SET_BREAKPOINT;
				
				LineTableInfo lineTableInfo = null;
				long lLineCodeIndex = 0;
				long lMethodId = 0;
				long lClassId;
				int iLen;
				
				//System.out.println("currentClassId: "+currentClassId);
				BreakpointInfo breakpointInfo = new BreakpointInfo();

				
/*				
				if ( LineTableAr == null )
					System.out.println("LineTableAr null");
				else
					System.out.println("LineTableAr.size(): "+LineTableAr.size());
/**/						
				//System.out.println("bLineSelected: "+bLineSelected);
					
				// Try to detect if line was selected..
				if ( bLineSelected )
				{
					if ( bFlutterSelected )
					{
						// Note:
						// We set the Breakpoint info after it gets
						// the response, which has the Breakpoint Id..
					}
					else
					{
						breakpointInfo.lClassId = currentClassId;
						//System.out.println("breakpointInfo.lClassId: "+breakpointInfo.lClassId);
						lClassId = currentClassId;
						//System.out.println("lMethodSelection: "+lMethodSelection);
						breakpointInfo.lMethodId = lMethodSelection;
						//System.out.println("breakpointInfo.lMethodId: "+breakpointInfo.lMethodId);
						lMethodId = lMethodSelection;
					
						// Line..
						// Find match and get Index..
						if ( (LineTableAr != null) && (LineTableAr.size() > 0) )
						{
							iLen = LineTableAr.size();
							for ( int iG = 0; iG < iLen; iG++ )
							{
								lineTableInfo = (LineTableInfo)LineTableAr.get(iG);
								//System.out.println("lineTableInfo.iLineNumber: "+lineTableInfo.iLineNumber);
								if ( iSelectedLine == lineTableInfo.iLineNumber )
								{
									//System.out.println("--MATCHED--");
									lLineCodeIndex = lineTableInfo.lLineCodeIndex;
									//System.out.println("lLineCodeIndex: "+lLineCodeIndex);
									breakpointInfo.lLineCodeIndex = lLineCodeIndex;
									breakpointInfo.iLineNumber = lineTableInfo.iLineNumber;
									//System.out.println("lineTableInfo.iLineNumber: "+lineTableInfo.iLineNumber);
									break;
								}
							}
						}
					}
				}
				else
				{
					if ( bFlutterSelected )
					{
						
					}
					else
					{
						// Method..
						// Get first line Index..
						if ( (LineTableAr != null) && (LineTableAr.size() > 0) )
						{
							// Get first Line Index..
							lineTableInfo = (LineTableInfo)LineTableAr.get(0);
							lLineCodeIndex = lineTableInfo.lLineCodeIndex;
						}
	
						breakpointInfo.lLineCodeIndex = lLineCodeIndex;
						breakpointInfo.iLineNumber = lineTableInfo.iLineNumber;
					}
				}
				
				//System.out.println("** breakpointInfo.lLineCodeIndex: "+breakpointInfo.lLineCodeIndex);
				//System.out.println("** breakpointInfo.iLineNumber: "+breakpointInfo.iLineNumber);
				
				if ( bFlutterSelected )	
				{
					if ( bLineSelected )
					{
						try
						{
							bLineSelected = false;	// Reset selected..
							//System.out.println("Doing 'addBreakpoint'");
							
							//System.out.println("sIsolateId: '"+sIsolateId+"'");
							//System.out.println("sScriptId: '"+sScriptId+"'");
							//System.out.println("(iSelectedLine): '"+Integer.toString(iSelectedLine)+"'");
							
							//
							// addBreakpoint
							//
							
							//completeLatch = new CountDownLatch(1);
							requestLatch = new CountDownLatch(1);
									
							ParamAr = new ArrayList();
							ParamAr.add((String)Utils.filterObject(sIsolateId));
							ParamAr.add((String)Utils.filterObject(sScriptId));
							ParamAr.add((String)Integer.toString(iSelectedLine));
							
							String[] getAddBreakpointMsg = {
								"method", "addBreakpoint",
								"params",
								"isolateId", "[]",
								"scriptId", "[]",
								"line", "[d",
								"}"};
					
							String sReq = ConstructMessage(getAddBreakpointMsg);
							websocket = webSocketObject.getWebSocket();
							websocket.send(sReq);
							
							try
							{
								//completeLatch.await();
								requestLatch.await();
							}
							catch (InterruptedException ie)
							{
							}
							
							updateSourceLines((long)0);
							
							
							
/**/							
						}
						catch (WebSocketException wse)
						{
							wse.printStackTrace();
						}
					}
				}
				else
				{
					// Get Method name..
					MethodInfo methodInfo;
					if ( (AllMethodsAr != null) && (AllMethodsAr.size() > 0) )
					{
						for ( int iG = 0; iG < AllMethodsAr.size(); iG++ )
						{
							methodInfo = (MethodInfo)AllMethodsAr.get(iG);
							if ( lMethodId == methodInfo.lMethodId )
							{
								breakpointInfo.sMethodName = methodInfo.sName;
								break;
							}
						}
					}
	
					JDWPCommands.command_Set_Breakpoint(
						breakpointInfo.lClassId,
						breakpointInfo.lMethodId,
						breakpointInfo.lLineCodeIndex);
					
					// Get RequestId and finish setting up breakpoint..
					breakpointInfo.iRequestId = iBreakpointRequestId;
					
					// Add Breakpoint..
					BreakpointAr.add((BreakpointInfo)breakpointInfo);
					
					updateSourceLines(lBreakpointLocationIndex);	// Refresh.

				}

				//updateSourceLines(lBreakpointLocationIndex);	// Refresh..
			}
			else if ( (STEP_INTO.equals(actionCommandS)) && (iCardShowing == DEBUG_CARD) )
			{
				// Show current line..
				bShowCurrentLine = true;
				
				iDebugCommand = DEBUG_COMMAND_STEP;
				
				if ( bFlutterSelected )
				{
					try
					{
						//
						// resume, (Step) Into
						//
						
						//completeLatch = new CountDownLatch(1);
						//requestLatch = new CountDownLatch(1);
								
						ParamAr = new ArrayList();
						ParamAr.add((String)Utils.filterObject(sIsolateId));
						ParamAr.add((String)"Into");
						
						String[] getResumeMsg = {
							"method", "resume",
							"params",
							"isolateId", "[]",
							"step", "[]",
							"}"};
				
						String sReq = ConstructMessage(getResumeMsg);
						websocket = webSocketObject.getWebSocket();
						websocket.send(sReq);
						
/*						
						try
						{
							//completeLatch.await();	// Success
							requestLatch.await();
						}
						catch (InterruptedException ie)
						{
						}
/**/						
					}
					catch (WebSocketException wse)
					{
						wse.printStackTrace();
					}

/*					
					while ( true )
					{
						if ( bPauseBreakpointFinished )
							break;
						
						try
						{
							Thread.sleep(100);
						}
						catch (InterruptedException ie)
						{
						}
					}
					
					updateSourceLines(0);
/**/
				}
				else
				{
					// Try to Clear any previous STEP..
					if ( lStepRequestId != 0 )
					{
						JDWPCommands.command_Clear(
							(byte)Constants.EVENT_KIND_SINGLE_STEP,	// EventKind
							(int)lStepRequestId);	// RequestId
						
						lStepRequestId = 0;		// Reset..
					}
					
					JDWPCommands.command_Set_Step(
						lCurrentThreadId,
						(byte)Constants.STEP_SIZE_LINE,
						(byte)Constants.STEP_DEPTH_INTO);
				}

			}
			else if ( (STEP_OVER.equals(actionCommandS)) && (iCardShowing == DEBUG_CARD) )
			{
				// Show current line..
				//System.out.println("\nSTEP_OVER");
				bShowCurrentLine = true;
				
				iDebugCommand = DEBUG_COMMAND_STEP;
				
				if ( bFlutterSelected )
				{
					try
					{
						//
						// resume, (Step) Over
						//
						
						//completeLatch = new CountDownLatch(1);
						//requestLatch = new CountDownLatch(1);
						
						bStepFinished = false;
								
						ParamAr = new ArrayList();
						ParamAr.add((String)Utils.filterObject(sIsolateId));
						ParamAr.add((String)"Over");
						
						String[] getResumeMsg = {
							"method", "resume",
							"params",
							"isolateId", "[]",
							"step", "[]",
							"}"};
				
						String sReq = ConstructMessage(getResumeMsg);
						websocket = webSocketObject.getWebSocket();
						websocket.send(sReq);

/*						
						try
						{
							//completeLatch.await();	// Success
							requestLatch.await();
						}
						catch (InterruptedException ie)
						{
						}
/**/

/*
						// Create ActionEvent..
						ActionEvent actionEvent = new ActionEvent(
							(Object)releaseButton,	// source
							765,					// id
							"VARIABLES");	// command
						
						actListener.actionPerformed(actionEvent);
/**/						
						

						
						bStepFinished = true;
						
					}
					catch (WebSocketException wse)
					{
						wse.printStackTrace();
					}

/*					
					while ( true )
					{
						if ( bPauseBreakpointFinished )
							break;
						
						try
						{
							Thread.sleep(100);
						}
						catch (InterruptedException ie)
						{
						}
					}
/**/					
					//updateSourceLines(0);
				}
				else
				{
					// Try to Clear any previous STEP..
					//System.out.println("lStepRequestId: "+lStepRequestId);
					if ( lStepRequestId != 0 )
					{
						JDWPCommands.command_Clear(
							(byte)Constants.EVENT_KIND_SINGLE_STEP,	// EventKind
							(int)lStepRequestId);	// RequestId
						
						lStepRequestId = 0;		// Reset..
					}
					
					JDWPCommands.command_Set_Step(
						lCurrentThreadId,
						(byte)Constants.STEP_SIZE_LINE,
						(byte)Constants.STEP_DEPTH_OVER);
				}

			}
			else if ( (STEP_OUT.equals(actionCommandS)) && (iCardShowing == DEBUG_CARD) )
			{
				// Show current line..
				bShowCurrentLine = true;
				
				iDebugCommand = DEBUG_COMMAND_STEP;
				
				if ( bFlutterSelected )
				{
					try
					{
						//
						// resume, (Step) Out
						//
						
						//completeLatch = new CountDownLatch(1);
						//requestLatch = new CountDownLatch(1);
								
						ParamAr = new ArrayList();
						ParamAr.add((String)Utils.filterObject(sIsolateId));
						ParamAr.add((String)"Out");
						
						String[] getResumeMsg = {
							"method", "resume",
							"params",
							"isolateId", "[]",
							"step", "[]",
							"}"};
				
						String sReq = ConstructMessage(getResumeMsg);
						websocket = webSocketObject.getWebSocket();
						websocket.send(sReq);

/*						
						try
						{
							//completeLatch.await();	// Success
							requestLatch.await();
						}
						catch (InterruptedException ie)
						{
						}
/**/						
					}
					catch (WebSocketException wse)
					{
						wse.printStackTrace();
					}

/*					
					while ( true )
					{
						if ( bPauseBreakpointFinished )
							break;
						
						try
						{
							Thread.sleep(100);
						}
						catch (InterruptedException ie)
						{
						}
					}
					
					updateSourceLines(0);
/**/
				}
				else
				{
					// Try to Clear any previous STEP..
					if ( lStepRequestId != 0 )
					{
						JDWPCommands.command_Clear(
							(byte)Constants.EVENT_KIND_SINGLE_STEP,	// EventKind
							(int)lStepRequestId);	// RequestId
						
						lStepRequestId = 0;		// Reset..
					}
	
					JDWPCommands.command_Set_Step(
						lCurrentThreadId,
						(byte)Constants.STEP_SIZE_LINE,
						(byte)Constants.STEP_DEPTH_OUT);
				}
			}
			else if ( (RESUME.equals(actionCommandS)) && (iCardShowing == DEBUG_CARD) )
			{
				int[] iStatus = new int[2];
				
				iDebugCommand = DEBUG_COMMAND_RESUME;
				//System.out.println("\nRESUME");
				
				
				// Hide current line..
				bShowCurrentLine = false;
				
				if ( bFlutterSelected )
				{
					try
					{
						//
						// resume
						//
						
						//completeLatch = new CountDownLatch(1);
						//requestLatch = new CountDownLatch(1);
								
						ParamAr = new ArrayList();
						ParamAr.add((String)Utils.filterObject(sIsolateId));
						
						String[] getResumeMsg = {
							"method", "resume",
							"params",
							"isolateId", "[]",
							"}"};
				
						String sReq = ConstructMessage(getResumeMsg);
						websocket = webSocketObject.getWebSocket();
						websocket.send(sReq);
						
/*						
						try
						{
							//completeLatch.await();	// Success
							requestLatch.await();
						}
						catch (InterruptedException ie)
						{
						}
/**/						
					}
					catch (WebSocketException wse)
					{
						wse.printStackTrace();
					}
					
					// Clear variables..
					DefaultMutableTreeNode root = null;
					DefaultTreeModel model = (DefaultTreeModel)variableJTree.getModel();
					root = (DefaultMutableTreeNode)model.getRoot();
					
					root.removeAllChildren();
					model.reload();
					
					VariableInfoLHm.clear();
					
					//System.out.println("root.getChildCount(): "+root.getChildCount());
					//System.out.println("VariableInfoLHm.size(): "+VariableInfoLHm.size());
					
					
					//System.out.println("==At C==");
					//updateSourceLines((long)0);
				}
				else
				{
					// Reset so it'll get updated..
					lCurrentMethodId = 0;
					
					// Get Suspend Count..
					int iSuspendCount = JDWPCommands.command_SuspendCount(lCurrentThreadId);
	
					for ( int iG = 0; iG < iSuspendCount; iG++ )
					{
						JDWPCommands.command_Resume();
					}
					
					updateSourceLines(lBreakpointLocationIndex);
				}
			}
			else if ( HOME.equals(actionCommandS) )
			{
				// Project Home..
				//System.out.println("HOME");
				boolean bHaveDir = false;
				String inS;
				String sType = "";
				int iLoc;
				int iLoc2;
				
				File chosenFile;
				JFileChooser fChooser;
				
				if ( (sProjectPathLead != null) && (! sProjectPathLead.equals("")) )
					fChooser = new JFileChooser(sProjectPathLead);
				else
				{
					fChooser = new JFileChooser();
					fChooser.setCurrentDirectory(new java.io.File("."));
				}
					
				fChooser.setDialogTitle("Project Home");
				fChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				fChooser.setAcceptAllFileFilterUsed(false);
				
				if ( fChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION )
				{
					// Selected..
					bHaveDir = true;
					projectHomeS = fChooser.getSelectedFile().toString();
					projectHomeS = Utils.processPath(projectHomeS);
					//System.out.println("projectHomeS: '"+projectHomeS+"'");
					File file;
					byte[] buffer = null;
					StringBuffer fSb;

					fSb = new StringBuffer(projectHomeS);

					// Check for /app directory..
					StringBuffer tSb = new StringBuffer(projectHomeS);
					tSb.append("/app");
					File tFile = new File(tSb.toString());
					if ( tFile.exists() )
					{
						bUsingAppProject = true;
						fSb.append("/app/build.gradle");
					}
					else
					{
						bUsingAppProject = false;
						fSb.append("/build.gradle");
					}
					
					//System.out.println("fSb: '"+fSb.toString()+"'");
					
					file = new File(fSb.toString());
					if ( file.exists() )
					{
						//System.out.println("--Exists--");
						buffer = readFile(2048, fSb.toString());
						String tS = new String(buffer);
						iLoc2 = tS.indexOf("kotlin");
						if ( iLoc2 != -1 )
						{
							sType = "KOTLIN";
							
							uGradleMenuItem.setSelected(true);
							uNDKMenuItem.setSelected(false);
							uKotlinMenuItem.setSelected(true);
							uFlutterMenuItem.setSelected(false);
						}
						else
						{
							sType = "GRADLE";
							
							uGradleMenuItem.setSelected(true);
							uNDKMenuItem.setSelected(false);
							uKotlinMenuItem.setSelected(false);
							uFlutterMenuItem.setSelected(false);
						}

						// Modify app/build.gradle..	
						bGradleConfigFinished = false;
						gradleConfigBgThread = new GradleConfigBgThread();
						gradleConfigBgThread.start();
						
						while ( true )
						{
							try
							{
								Thread.sleep(250);
							}
							catch (InterruptedException ie)
							{
							}
							
							if ( bGradleConfigFinished )
								break;
						}
						
					}
					else
					{
						// Check Flutter..
						fSb = new StringBuffer(projectHomeS);
						fSb.append("/android/app/build.gradle");
						file = new File(fSb.toString());
						if ( file.exists() )
						{
							// Flutter..
							sType = "FLUTTER";
							
							uGradleMenuItem.setSelected(true);
							uNDKMenuItem.setSelected(false);
							uKotlinMenuItem.setSelected(false);
							uFlutterMenuItem.setSelected(true);
							
							// Modify app/build.gradle..	
							bGradleConfigFinished = false;
							gradleConfigBgThread = new GradleConfigBgThread();
							gradleConfigBgThread.start();
							
							while ( true )
							{
								try
								{
									Thread.sleep(250);
								}
								catch (InterruptedException ie)
								{
								}
								
								if ( bGradleConfigFinished )
									break;
							}
						}
						else
						{
							sType = "ANT";
							
							uGradleMenuItem.setSelected(false);
							uNDKMenuItem.setSelected(false);
							uKotlinMenuItem.setSelected(false);
							uFlutterMenuItem.setSelected(false);
						}
					}
					
					//System.out.println("sType: '"+sType+"'");	
					uSdkMenuItem.setSelected(false);
					
					// Add to storage..
					boolean bWrite = false;
					StringBuffer recentSb = new StringBuffer();
					String sOut = readStorage("recent.tmp");
					if ( (sOut != null) && (sOut.length() > 0) )
					{
						// Exists..
						// Check for dups..
						StringTokenizer st = new StringTokenizer(sOut, "~");
						int iCount = st.countTokens();
						String sTok;
						String sTitle;
						boolean bMatch = false;
						for ( int iG = 0; iG < iCount; iG++ )
						{
							sTok = st.nextToken();
							if ( sTok.equals(projectHomeS) )
							{
								bMatch = true;
								break;
							}
						}
						
						if ( ! bMatch )
						{
							// Add..
							recentSb.append(sOut);
							recentSb.append(projectHomeS);
							recentSb.append("~");
							recentSb.append(sType);
							recentSb.append("~");

							bWrite = true;
						}
					}
					else
					{
						// New..
						recentSb.append(projectHomeS);
						recentSb.append("~");
						recentSb.append(sType);
						recentSb.append("~");
						bWrite = true;
					}

					if ( bWrite )
						writeStorage(recentSb.toString(), "recent.tmp");
					
					JMenuItem subMenuItem;
					int iLoc3;
					String sTitle = "";
					iLoc3 = projectHomeS.lastIndexOf("/");
					if ( iLoc3 != -1 )
					{
						sTitle = projectHomeS.substring(iLoc3 + 1);
					}
					
					subMenuItem = new JMenuItem(sTitle);
					subMenuItem.addActionListener(actListener);
					subMenu.add(subMenuItem);

					statusLabel.setText(projectHomeS);
					statusPath.setText(" ");	// Clear status..
				}

				updateStorage();
				init();		// Reset..
			}
			else if ( CREATE.equals(actionCommandS) )
			{
				//System.out.println("CREATE");
				// Get Build-tools version info..
				String[] dirObjSa;
				
				// Initialize, these persisted between builds..
				sMinSdk = "";
				sTargetSdk = "";
				targetApiS = "";
				
				bCaretDirty = false;
				bOrgCaretDirty = false;
				
				// Select SDK..
				//System.out.println("androidSdkPathAntS: '"+androidSdkPathAntS+"'");
				//System.out.println("androidSdkPathGradleS: '"+androidSdkPathGradleS+"'");
				if ( (bGradleSelected == false) &&
					(bKotlinSelected == false) &&
					(bFlutterSelected == false) )
				{
					androidSdkPathS = androidSdkPathAntS;
				}
				else
				{
					androidSdkPathS = androidSdkPathGradleS;
				}
				
				//System.out.println("(Selected)androidSdkPathS: '"+androidSdkPathS+"'");

				//bSDKDataFinished = false;
				completeLatch = new CountDownLatch(1);
				
				getSDKDataBgThread = new GetSDKDataBgThread();
				getSDKDataBgThread.start();

				try
				{
					completeLatch.await();
				}
				catch (InterruptedException ie)
				{
				}
				
/*
				while ( true )
				{
					try
					{
						Thread.sleep(100);
					}
					catch (InterruptedException ie)
					{
					}
					
					if ( bSDKDataFinished )
						break;
				}
/**/
				// Create Project..
				createDialog();
			}
			else if ( UPDATE.equals(actionCommandS) )
			{
				//System.out.println("UPDATE");
				// Update Project..
/*
				if ( targetDescAr == null )
					System.out.println("targetDescAr null");
				else
					System.out.println("targetDescAr not null");
/**/				
				if ( targetDescAr == null )
				{
					//bSDKDataFinished = false;
					completeLatch = new CountDownLatch(1);
					
					getSDKDataBgThread = new GetSDKDataBgThread();
					getSDKDataBgThread.start();

					try
					{
						completeLatch.await();
					}
					catch (InterruptedException ie)
					{
					}
					
/*					
					while ( true )
					{
						try
						{
							Thread.sleep(100);
						}
						catch (InterruptedException ie)
						{
						}
						
						if ( bSDKDataFinished )
							break;
					}
/**/
				}
				
				updateDialog();
			}
			else if ( CREATE_SUBMIT.equals(actionCommandS) )
			{
				//System.out.println("CREATE_SUBMIT");

				int iG;
				int iLoc;
				int iLoc2;
				int iLoc3;
				bRunIOBgThread = false;
				String sMinSpinnerValue = "";
				String sTargetSpinnerValue = "";
				boolean bUpdateBuildGradleStarted = false;
				boolean bDoIOBgThread = false;

				createFrame.dispose();
				
				boolean bProjectSelected = false;
				if ( projectRadioButton != null )
					bProjectSelected = projectRadioButton.isSelected();
				
				boolean bAppSelected = false;
				if ( appRadioButton != null )
					bAppSelected = appRadioButton.isSelected();

				boolean bPackageSelected = false;
				if ( packageRadioButton != null )
					bPackageSelected = packageRadioButton.isSelected();

				boolean bPluginSelected = false;
				if ( pluginRadioButton != null )
					bPluginSelected = pluginRadioButton.isSelected();
				
				// Test if <uses-sdk> is selected..
				boolean bUsesSdk = false;
				if ( uSdkMenuItem != null )
					bUsesSdk = uSdkMenuItem.getState();
				
/*
				if ( minSdkSpinner == null )
					System.out.println("minSdkSpinner null");
				else
					System.out.println("minSdkSpinner not null");
/**/
				// Get Min and Target Spinner values..
				if ( minSdkSpinner != null )
				{
					// 'Android 2.0 ECLAIR (API level 5)'
					sMinSpinnerValue = (String)minSdkSpinner.getValue();
					//System.out.println("sMinSpinnerValue: '"+sMinSpinnerValue+"'");
					if ( (sMinSpinnerValue != null) && (sMinSpinnerValue.length() > 0) )
					{
						iLoc2 = sMinSpinnerValue.indexOf("level");
						if ( iLoc2 != -1 )
						{
							iLoc3 = sMinSpinnerValue.indexOf(")", iLoc2);
							if ( iLoc3 != -1 )
							{
								sMinSdk = sMinSpinnerValue.substring((iLoc2 + 5), iLoc3);
								sMinSdk = sMinSdk.trim();
								//System.out.println("sMinSdk: '"+sMinSdk+"'");
							}
						}
					}
				}

/*
				if ( targetSdkSpinner == null )
					System.out.println("targetSdkSpinner null");
				else
					System.out.println("targetSdkSpinner not null");
/**/

				if ( targetSdkSpinner != null )
				{
					// Like: 'Android 3.1 (API level 12)  Id: 6'
					sTargetSpinnerValue = (String)targetSdkSpinner.getValue();
/*					
					if ( sTargetSpinnerValue == null )
						System.out.println("sTargetSpinnerValue null");
					else
						System.out.println("sTargetSpinnerValue not null");
/**/					
					
					//System.out.println("sTargetSpinnerValue: '"+sTargetSpinnerValue+"'");
					if ( (sTargetSpinnerValue != null) && (sTargetSpinnerValue.length() > 0) )
					{
						iLoc2 = sTargetSpinnerValue.indexOf("level");
						if ( iLoc2 != -1 )
						{
							iLoc3 = sTargetSpinnerValue.indexOf(")", iLoc2);
							if ( iLoc3 != -1 )
							{
								sTargetSdk = sTargetSpinnerValue.substring((iLoc2 + 5), iLoc3);
								sTargetSdk = sTargetSdk.trim();
							}
						}
					}
				}
				
				// Test if 'Use Gradle' is selected..
				String sAndroidPluginVersion = "";
				
				commandSb = new StringBuffer();
				
				createProjectHomeS = projectPathField.getText();
				createProjectHomeS = createProjectHomeS.trim();
				//System.out.println("createProjectHomeS: '"+createProjectHomeS+"'");
				
				try
				{
					// Get actual path, with proper case..
					File file = new File(createProjectHomeS);
					createProjectHomeS = file.getCanonicalPath();
				}
				catch (IOException ioe)
				{
				}

				//System.out.println("(getCanonicalPath())createProjectHomeS: '"+createProjectHomeS+"'");
				
				
				if ( bFlutterSelected )
				{
					bDoIOBgThread = true;
					// What works:
					// flutter create -a java --org com.example C:/Android/dev/flutter_test_six
					// flutter create --template=app -a java --org com.example C:/android/dev/flutter_test_create

					if ( iOS == LINUX_MAC )
					{
						commandSb.append("export PATH=${PATH}:");
						commandSb.append(sFlutterSdkPath);
						
						commandSb.append(";");
					}
					else
					{
						commandSb.append("SET PATH=");
						commandSb.append(sFlutterSdkPath);
						commandSb.append(";%PATH%");
						
						commandSb.append("&&");
					}

					commandSb.append("flutter create ");
					
					commandSb.append("--template=");
					if ( bAppSelected )
					{
						commandPhrase = "Your application code";	// Flutter end signal..
						commandSb.append("app ");
					}
					else if ( bPackageSelected )
					{
						commandPhrase = "Your package code is in";	// Flutter end signal..
						commandSb.append("package ");
					}
					else if ( bPluginSelected )
					{
						commandPhrase = "Your plugin code is in";	// Flutter end signal..
						commandSb.append("plugin ");
					}

					if ( iOS == LINUX_MAC )
					{
						if ( (sBuildTarget != null) && (sBuildTarget.length() > 0) )
						{
							if ( sBuildTarget.equals("apk") )
							{
								if ( (sAndroidLanguage != null) && (sAndroidLanguage.length() > 0) )
								{
									if ( sAndroidLanguage.equals("java") )
										;	// Default, don't use..
									else
									{
										commandSb.append("-a ");
										commandSb.append(sAndroidLanguage);
									}
								}
							}
							else if ( sBuildTarget.equals("ios") )
							{
								if ( (sIosLanguage != null) && (sIosLanguage.length() > 0) )
								{
									if ( sIosLanguage.equals("objc") )
										;	// Default, don't use..
									else
									{
										commandSb.append("-a ");
										commandSb.append(sIosLanguage);
									}
								}
							}
						}
					}
					else
					{
/*
						if ( sAndroidLanguage == null )
							System.out.println("sAndroidLanguage null");
						else
							System.out.println("sAndroidLanguage: '"+sAndroidLanguage+"'");
/**/						
						if ( (sAndroidLanguage != null) && (sAndroidLanguage.length() > 0) )
						{
							if ( sAndroidLanguage.equals("java") )
								;	// Default, don't use..
							else
							{
								commandSb.append("-a ");
								commandSb.append(sAndroidLanguage);
							}
						}
					}
					
					// Organization..
					sOrganization = organizationField.getText();
					if ( (sOrganization != null) && (sOrganization.length() > 0) )
					{
						commandSb.append(" --org ");
						commandSb.append(sOrganization);
					}

					iLoc = createProjectHomeS.indexOf('\\');
					if ( iLoc != -1 )
						createProjectHomeS = Utils.processPath(createProjectHomeS);

					// 'C:/Android/Dev/flutter_create_three'
					createProjectHomeS = createProjectHomeS.trim();
					//System.out.println("(Final)createProjectHomeS: '"+createProjectHomeS+"'");

					commandSb.append(" ");
					commandSb.append(createProjectHomeS);
					
					if ( iOS == WINDOWS )
					{
						commandSb.append("\n");
					}
					
					//System.out.println("commandSb: '"+commandSb.toString()+"'");
					commandS = commandSb.toString();

				}
				else
				{
					// Ant, Gradle or Kotlin..
					if ( (bGradleSelected == false) && (bKotlinSelected == false) )
					{
						// Ant..
						bDoIOBgThread = true;
						
						if ( iOS == LINUX_MAC )
						{
							commandSb.append("export PATH=${PATH}:");
							commandSb.append(androidSdkPathS);
							commandSb.append("/tools");
							commandSb.append(";");
						}
						else
						{
							commandSb.append("CD ");
							commandSb.append(androidSdkPathS);
							commandSb.append("/tools");
							commandSb.append("&&");
						}
		
						commandPhrase = "android create";
						
						commandSb.append("android create ");
						
						if ( bProjectSelected )
							commandSb.append("project");
						else
							commandSb.append("lib-project");
		
						commandSb.append(" --target ");
		
						String sMin;
	
						// Like: 'Android 8.0.0 (API level 26)  Id: 4'
						String sT = (String)targetSdkSpinner.getValue();
						//System.out.println("(targetSdkSpinner.getValue())sT: '"+sT+"'");
						String sId;
						int iTargetId = 0;
						if ( (sT != null) && (sT.length() > 0) )
						{
							iLoc2 = sT.indexOf("level");
							if ( iLoc2 != -1 )
							{
								iLoc3 = sT.indexOf(")", iLoc2);
								if ( iLoc3 != -1 )
								{
									sTargetSdk = sT.substring((iLoc2 + 5), iLoc3);
									sTargetSdk = sTargetSdk.trim();
								}
							}
							
							iLoc2 = sT.indexOf("Id:");
							if ( iLoc2 != -1 )
							{
								sId = sT.substring(iLoc2 + 3);
								sId = sId.trim();
								
								try
								{
									iTargetId = Integer.parseInt(sId);
								}
								catch (NumberFormatException nfe)
								{
								}
							}
						}
						
						// Construct target, like: 'android-10'..
						StringBuffer aSb = new StringBuffer();
						aSb.append("android-");
						aSb.append(sTargetSdk);
	
						// Get matching API Level..
						targetApiS = sTargetSdk;
						//System.out.println("targetApiS: '"+targetApiS+"'");
						
						if ( bUsesSdk )
						{
							// Like: 'Android 2.0 ECLAIR (API level 5)'
							sT = (String)minSdkSpinner.getValue();
							iLoc = sT.indexOf("level");
							if ( iLoc != -1 )
							{
								sMin = sT.substring((iLoc + 5), (sT.length() - 1));
								sMin = sMin.trim();
								
								try
								{
									iMinSdk = Integer.parseInt(sMin);
								}
								catch (NumberFormatException nfe)
								{
								}
							}
						}
		
						//System.out.println("iTargetId: "+iTargetId);
						//commandSb.append(iTargetId);
						commandSb.append(aSb.toString());
						
						String nameS = appNmField.getText();
						nameS = nameS.trim();
						sApplicationName = nameS;
						
						if ( (nameS != null) && (nameS.length() > 0) )
						{
							commandSb.append(" --name ");
							commandSb.append(nameS);
						}
						
						commandSb.append(" --path \"");
		
						createProjectHomeS = projectPathField.getText();
						
						try
						{
							// Get actual path, with proper case..
							File file = new File(createProjectHomeS);
							createProjectHomeS = file.getCanonicalPath();
						}
						catch (IOException ioe)
						{
						}
						
						iLoc = createProjectHomeS.indexOf('\\');
						if ( iLoc != -1 )
							createProjectHomeS = Utils.processPath(createProjectHomeS);
		
						createProjectHomeS = createProjectHomeS.trim();
						commandSb.append(createProjectHomeS);
						commandSb.append("\"");
						
						iLoc = createProjectHomeS.lastIndexOf('/');
						if ( iLoc != -1 )
							sProjectPathLead = createProjectHomeS.substring(0, iLoc);
		
						if ( bProjectSelected )
						{
							commandSb.append(" --activity ");
							String activityS = activityField.getText();
							activityS = activityS.trim();
							
							sKActivityName = activityS;		// Save..
							
							commandSb.append(activityS);
						}
						
						if ( bGradleSelected )
						{
							// Use Gradle template, required for Gradle..
							commandSb.append(" --gradle ");
							
							// Gradle Android Plugin Version..
							commandSb.append(" --gradle-version ");
							sAndroidPluginVersion = pluginVersionField.getText();
							sAndroidPluginVersion = sAndroidPluginVersion.trim();
							commandSb.append(sAndroidPluginVersion);
						}
						
						commandSb.append(" --package ");
						packageS = packageField.getText();
						packageS = packageS.trim();
						
						sKPackageName = packageS;	// Save..
						
						commandSb.append(packageS);
					
						if ( iOS == WINDOWS )
							commandSb.append("\n");
		
						commandS = commandSb.toString();
						//System.out.println("commandS: '"+commandS+"'");
					
					}
					else
					{
						// Gradle and Kotlin..
						//System.out.println("Gradle Kotlin");						
						
						bCreateGradleProjectFinished = false;
						createGradleProjectBgThread = new CreateGradleProjectBgThread();
						createGradleProjectBgThread.start();
						
						while ( true )
						{
							try
							{
								//Thread.sleep(333);
								Thread.sleep(100);
							}
							catch (InterruptedException ie)
							{
							}
							
							if ( bCreateGradleProjectFinished )
								break;
						}

						// Create root and app level build.gradles..
						bCreateBuildGradleFinished = false;
						createBuildGradleBgThread = new CreateBuildGradleBgThread();
						createBuildGradleBgThread.start();
						
						while ( true )
						{
							try
							{
								//Thread.sleep(333);	
								Thread.sleep(100);
							}
							catch (InterruptedException ie)
							{
							}
							
							if ( bCreateBuildGradleFinished )
								break;
						}
					}
				}

				if ( bDoIOBgThread )
				{
					SwingWorker sWorker = new SwingWorker()
					{
						@Override
						public Void doInBackground()
						{
							//System.out.println("SwingWorker doInBackground()");
							jProgressBar = new JProgressBar();
							jProgressBar.setIndeterminate(true);
							jProgressBar.setPreferredSize(new Dimension(200, 30));
							
							progressJFrame = new JFrame();
							progressJFrame.setUndecorated(true);
							progressJFrame.add(jProgressBar);
							progressJFrame.pack();
							progressJFrame.setVisible(true);
							progressJFrame.setLocationRelativeTo(mainJFrame);
							progressJFrame.setAlwaysOnTop(true);
	
							bFinished = false;
							ioBgThread = new IOBgThread();
							ioBgThread.start();

							// Wait for Thread to finish..
							while ( true )
							{
								try
								{
									Thread.sleep(100);
								}
								catch (InterruptedException ie )
								{
								}
								
								//Thread.yield();
								if ( bFinished )
									break;
							}
							
							return null;
						}
						
						@Override
						public void done()
						{
							progressJFrame.dispose();
						}
					};
					
					sWorker.execute();
				}
				
				
				
				
				
				
				// Reset Project Home to this project..
				projectHomeS = createProjectHomeS;
				projectHomeS = projectHomeS.trim();

/*				
				if ( projectHomeS == null )
					System.out.println("projectHomeS null");
				else
					System.out.println("projectHomeS: '"+projectHomeS+"'");
/**/

				// Update store.tmp				
				updateStorage();

				// Update Status bar..
				statusLabel.setText(projectHomeS);
				statusPath.setText(" ");	// Clear status..
				
				init();		// Reset..

				if ( bUsesSdk &&
					((bGradleSelected == false) &&
					(bKotlinSelected == false) &&
					(bFlutterSelected == false)) )
				{
					// Ant only, add <uses-sdk> to AndroidManifest.xml..
					createBgThread = new CreateBgThread();
					createBgThread.start();
				}

				if ( bFlutterSelected == false )
				{
					// Update Application name for Ant, Gradle and Kotlin..
					bAppNameFinished = false;
					updateAppNameBgThread = new UpdateAppNameBgThread();
					updateAppNameBgThread.start();
				}

				// Flutter Package and Plugin don't
				// have a build.gradle, so skip..				
				//System.out.println("bGradleSelected: "+bGradleSelected);
				if ( (bGradleSelected) && (bPackageSelected == false) && (bPluginSelected == false) )
				{
					StringBuffer pSb = new StringBuffer();
					pSb.append(projectHomeS);
					
					if ( bFlutterSelected )
					{
						pSb.append("/android/app/build.gradle");
					
						//System.out.println("pSb: '"+pSb.toString()+"'");
						File tF = new File(pSb.toString());
	
						// Wait for file to be available..					
						while ( true )
						{
							try
							{
								Thread.sleep(1000);
							}
							catch (InterruptedException ie)
							{
							}
							
							if ( tF.exists() )
								break;
						}
	
						if ( bUpdateBuildGradleStarted )
						{
							while ( true )
							{
								try
								{
									Thread.sleep(100);
								}
								catch (InterruptedException ie)
								{
								}
								
								if ( bUpgradeBuildGradleFinished )
									break;
							}
						}
						
						bGradleConfigFinished = false;
						gradleConfigBgThread = new GradleConfigBgThread();
						gradleConfigBgThread.start();
						
						// Wait for Thread to finish..
						while ( true )
						{
							try
							{
								Thread.sleep(50);
							}
							catch (InterruptedException ie)
							{
							}
				
							if ( bGradleConfigFinished )
								break;
						}
					}

					// Note:
					// Flutter already has it updated..
					if ( bFlutterSelected == false )
					{
						// Update Gradle version to use..					
						bModifyGradleWrapperBgThread = false;
						modifyGradleWrapperBgThread = new ModifyGradleWrapperBgThread();
						modifyGradleWrapperBgThread.start();
						
						// Wait for Thread to finish..
						while ( true )
						{
							try
							{
								Thread.sleep(50);
							}
							catch (InterruptedException ie)
							{
							}
				
							if ( bModifyGradleWrapperBgThread )
								break;
						}
					}
				}
				else
				{
					// Ant, add 'sdk.buildtools' to project.properties..
					String sToolsVersion = (String)buildToolsSpinner.getValue();
					//System.out.println("sToolsVersion: '"+sToolsVersion+"'");
					if ( (sToolsVersion != null) && (sToolsVersion.length() > 0) )
					{
						projectPropertiesBgThread = new ProjectPropertiesBgThread();
						projectPropertiesBgThread.start();
					}
				}

				if ( bFlutterSelected )
				{
					// Remove 'android:configChanges' for Flutter
					// Causing build issues..
					modifyAndroidManifestBgThread = new ModifyAndroidManifestBgThread();
					modifyAndroidManifestBgThread.start();
				}

				uSdkMenuItem.setSelected(false);
				bDoBuildGradleUpdate = false;
				//System.out.println("Exiting CREATE_SUBMIT");
			}
			else if ( UPDATE_SUBMIT.equals(actionCommandS) )
			{
				//System.out.println("\nUPDATE_SUBMIT");
				updateFrame.dispose();
				
				commandSb = new StringBuffer();

				if ( iOS == LINUX_MAC )
				{
					commandSb.append("export PATH=${PATH}:");
					commandSb.append(androidSdkPathS);
					commandSb.append("/tools");
					
					commandSb.append(";");
				}
				else
				{
					commandSb.append("CD ");
					commandSb.append(androidSdkPathS);
					commandSb.append("/tools");
					
					commandSb.append("&&");
				}

				commandPhrase = "android update";
				
				boolean bProjectSelected = projectRadioButton.isSelected();
				
				commandSb.append("android update ");
				
				if ( bProjectSelected )
					commandSb.append("project");
				else
					commandSb.append("lib-project");

/*
				if ( updateTargetSdkSpinner == null )
					System.out.println("updateTargetSdkSpinner null");
				else
					System.out.println("updateTargetSdkSpinner not null");
/**/

				boolean bMatched = false;
				int iUpdateTarget = 0;
				
				if ( updateTargetSdkSpinner != null )
				{
					String tS = (String)updateTargetSdkSpinner.getValue();
					
					if ( (targetDescAr != null) && (targetDescAr.size() > 0) )
					{
						for ( iUpdateTarget = 0; iUpdateTarget < targetDescAr.size();
							iUpdateTarget++ )
						{
							if ( tS.equals((String)targetDescAr.get(iUpdateTarget)) )
							{
								bMatched = true;
								break;
							}
						}
					}
				}
				
				if ( bMatched )
				{
					commandSb.append(" --target ");
					commandSb.append(iUpdateTarget + 1);	// Make one based..
				}

				commandSb.append(" --path \"");

				String prjPathS = updateProjectPathField.getText();
				prjPathS = prjPathS.trim();
				
				commandSb.append(prjPathS);
				commandSb.append("\"");
				
				if ( bProjectSelected )
				{
					// Project..
					String sLibPath = libraryPathField.getText();
					sLibPath = sLibPath.trim();
					if ( (sLibPath != null) && (sLibPath.length() > 0) )
					{
						commandSb.append(" --library \"");
						commandSb.append(sLibPath);
						commandSb.append("\"");
					}
					
					if ( subprojectsCheckBox.isSelected() )
						commandSb.append(" --subprojects");
				}
				
				if ( iOS == WINDOWS )
					commandSb.append("\n");

				commandS = commandSb.toString();
				//System.out.println("commandS: '"+commandS+"'");

				ioBgThread = new IOBgThread();
				ioBgThread.start();

			}
			else if ( RELEASE_DIALOG_SUBMIT.equals(actionCommandS) )
			{
				//System.out.println("RELEASE_DIALOG_SUBMIT");
				// Note:
				// We need to call Utils.processPath()
				// to remove any surrounding double quotes..
				if ( keyAliasField != null )
				{
					sKeyAlias = Utils.processPath(keyAliasField.getText());
					sKeyAlias = sKeyAlias.trim();
				}
				
				if ( keystorePathField != null )
				{
					sKeystorePath = Utils.processPath(keystorePathField.getText());
					sKeystorePath = sKeystorePath.trim();
				}

				if ( keyAliasPasswordField != null )
				{
					sKeyAliasPassword = Utils.processPath(keyAliasPasswordField.getText());
					sKeyAliasPassword = sKeyAliasPassword.trim();
				}

				if ( keystorePasswordField != null )
				{
					sKeystorePassword = Utils.processPath(keystorePasswordField.getText());
					sKeystorePassword = sKeystorePassword.trim();
				}
				
				//System.out.println("sKeystorePath: '"+sKeystorePath+"'");
				//System.out.println("sKeyAlias: '"+sKeyAlias+"'");
				//System.out.println("sKeystorePassword: '"+sKeystorePassword+"'");
				//System.out.println("sKeyAliasPassword: '"+sKeyAliasPassword+"'");
				
				// Signal finished..
				bReleaseCheckFinished = true;
				bOkayToDoRelease = true;
				releaseFrame.dispose();
			}
			else if ( RELEASE_DIALOG_CANCEL.equals(actionCommandS) )
			{
				//System.out.println("RELEASE_DIALOG_CANCEL");
				
				// Signal finished..
				bReleaseCheckFinished = true;
				bOkayToDoRelease = false;
				releaseFrame.dispose();
			}
			else if ( PROJECT_PATH_CHOOSER.equals(actionCommandS) )
			{
				JFileChooser fChooser;
				
				if ( (sProjectPathLead != null) && (! sProjectPathLead.equals("")) )
					fChooser = new JFileChooser(sProjectPathLead);
				else
				{
					fChooser = new JFileChooser();
					fChooser.setCurrentDirectory(new java.io.File("."));
				}
					
				fChooser.setDialogTitle("Project Path");
				fChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				fChooser.setAcceptAllFileFilterUsed(false);
				
				if ( fChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION )
				{
					String tS = fChooser.getSelectedFile().toString();
					tS = Utils.processPath(tS);
					
					if ( iProjectDialog == CREATE_DIALOG )
						projectPathField.setText(tS);
					else if ( iProjectDialog == UPDATE_DIALOG )
						updateProjectPathField.setText(tS);
				}
			}
			else if ( KEYSTORE_PATH_CHOOSER.equals(actionCommandS) )
			{
				//System.out.println("KEYSTORE_PATH_CHOOSER");
				JFileChooser fChooser;
				
				if ( (sProjectPathLead != null) && (! sProjectPathLead.equals("")) )
					fChooser = new JFileChooser(sProjectPathLead);
				else
				{
					fChooser = new JFileChooser();
					fChooser.setCurrentDirectory(new java.io.File("."));
				}
					
				fChooser.setDialogTitle("Keystore Path");
				fChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				fChooser.setAcceptAllFileFilterUsed(false);
				
				if ( fChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION )
				{
					String tS = fChooser.getSelectedFile().toString();
					tS = Utils.processPath(tS);
					
					keystorePathField.setText(tS);
				}
			}
			else if ( LIBRARY_CHOOSER.equals(actionCommandS) )
			{
				JFileChooser fChooser;
				String sRelativePath = "";
				String sBasePath = "";

				if ( (sProjectPathLead != null) && (! sProjectPathLead.equals("")) )
					fChooser = new JFileChooser(sProjectPathLead);
				else
				{
					fChooser = new JFileChooser();
					fChooser.setCurrentDirectory(new java.io.File("."));
				}
					
				fChooser.setDialogTitle("Library Path");
				fChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				fChooser.setAcceptAllFileFilterUsed(false);
				
				if ( fChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION )
				{
					// Like:  'C:\Program Files\android-sdk-windows\extras\google\google_play_services'
					String sTarget = fChooser.getSelectedFile().toString();
					sTarget = Utils.processRelativePath(sTarget);
					sBasePath = Utils.processRelativePath(projectHomeS);
					
					sRelativePath = Utils.getRelativePath(
						sTarget,	// Target path..
						sBasePath,	// Base path..
						"/");		// Path separator..
					
					libraryPathField.setText(sRelativePath);
					
				}
			}
			else if ( (BREAKPOINTS.equals(actionCommandS)) && (iCardShowing == DEBUG_CARD) )
			{
				BreakpointDialog();
			}
			else if ( BREAKPOINT_SUBMIT.equals(actionCommandS) )
			{
				CheckListItem checkListItem;
				BreakpointInfo breakpointInfo;
				int iRequestId = 0;
				boolean bSelected;
				String sBreakpointId = "";
				
				if ( (checkListItems != null) && (checkListItems.length > 0) )
				{
					for ( int iG = 0; iG < checkListItems.length; iG++ )
					{
						checkListItem = checkListItems[iG];
						bSelected = checkListItem.getSelected();
						if ( bSelected )
						{
							if ( bFlutterSelected )
							{
								sBreakpointId = checkListItem.getBreakpointId();

								try
								{
									//
									// removeBreakpoint
									//
									
									requestLatch = new CountDownLatch(1);
											
									ParamAr = new ArrayList();
									ParamAr.add((String)Utils.filterObject(sIsolateId));
									ParamAr.add((String)Utils.filterObject(sBreakpointId));
									
									String[] removeBreakpointMsg = {
										"method", "removeBreakpoint",
										"params",
										"isolateId", "[]",
										"breakpointId", "[]",
										"}"};
							
									String sReq = ConstructMessage(removeBreakpointMsg);
									websocket = webSocketObject.getWebSocket();
									websocket.send(sReq);
									
									try
									{
										requestLatch.await();
									}
									catch (InterruptedException ie)
									{
									}
								}
								catch (WebSocketException wse)
								{
									wse.printStackTrace();
								}
							}
							else
							{
								iRequestId = checkListItem.getRequestId();
					
								// Clear Breakpoint..
								JDWPCommands.command_Clear(
									(byte)Constants.EVENT_KIND_BREAKPOINT,
									iRequestId);
							}
							
							// Clear..
							if ( (BreakpointAr != null) && (BreakpointAr.size() > 0) )
							{
								for ( int iB = 0; iB < BreakpointAr.size(); iB++ )
								{
									breakpointInfo = (BreakpointInfo)BreakpointAr.get(iB);
									if ( bFlutterSelected )
									{
										if ( breakpointInfo.sBreakpointId.equals(sBreakpointId) )
											BreakpointAr.remove(iB);
									}
									else
									{
										if ( breakpointInfo.iRequestId == iRequestId )
											BreakpointAr.remove(iB);
									}
								}
							}
						}
					}
				}

				updateSourceLines(lBreakpointLocationIndex);	// Refresh..				
				breakpointFrame.dispose();
				
			}
			else if ( (REFRESH_CLASSES.equals(actionCommandS)) && (iCardShowing == DEBUG_CARD) )
			{
				//System.out.println("From REFRESH_CLASSES");
				if ( bFlutterSelected == false )
					getTreeClasses();
			}
			else if ( PULL_FILES.equals(actionCommandS) )
			{
				//System.out.println("PULL_FILES");
				if ( bLogcatOn )
				{
					// Reset..
					logcatToggleButton.doClick();

					// Set to kill IOBgThread..
					bBreakOut = true;
					
					// Wait for IOBgThread to end..
					while ( true )
					{
						Thread.yield();
						if ( ! bLogcatOn )
							break;
					}
				}

				// Construct file path for ls command..
				filePathSb = new StringBuffer();

				String sFilePath = "";
				
				// Check 'sdcard_path' Property..
				if ( (sdCardPathS != null) &&
					((sdCardPathS.equals("")) || ((sdCardPathS.length() > 0))) ) 
				{
					// Path for sdcard is defined..
					filePathSb.append("sdcard/");
					
					// Adjust for any slashes..
					String sTmp = sdCardPathS.trim();	// From 'sdcard_path' Property
					
					StringBuffer tSb = null;
					
					if ( ! sTmp.equals("") )
					{
						tSb = new StringBuffer(sTmp);
						
						// Remove any leading slashes..
						for ( int iG = 0; iG < tSb.length(); )
						{
							if ( Character.isLetterOrDigit((char)tSb.charAt(iG)) )
								break;
							
							if ( (tSb.charAt(iG) == (char)0x5C) || (tSb.charAt(iG) == (char)0x2F) )
							{
								tSb.deleteCharAt(iG);
								continue;
							}
						}
						
						// Remove any trailing slashes..
						for ( int iG = tSb.length() - 1; iG >= 0; )
						{
							if ( Character.isLetterOrDigit((char)tSb.charAt(iG)) )
								break;
							
							if ( (tSb.charAt(iG) == 0x5C) || (tSb.charAt(iG) == 0x2F) )
							{
								tSb.deleteCharAt(iG);
								iG = tSb.length() - 1;	// Adjust for removed character..
								continue;
							}
						}
						
						filePathSb.append(tSb.toString());
						filePathSb.append("/");	// Add trailing slash..
					}
					else
					{
						filePathSb.append(sTmp);
					}
				}
				else
				{
					// Emulator..
					filePathSb.append("data/data/");
					filePathSb.append(packageNameS);
					filePathSb.append("/files");
				}
				
				
				//System.out.println("(Final)filePathSb: '"+filePathSb.toString()+"'");
				sFilePath = filePathSb.toString();

				// Check source directory..
				StringBuffer internalSb = new StringBuffer();
				
				if ( iOS == LINUX_MAC )
				{
					internalSb.append("export PATH=${PATH}:");
					internalSb.append(androidSdkPathS);
					internalSb.append("/platform-tools");

					internalSb.append(";adb shell ls ");
					internalSb.append(filePathSb.toString());
				}
				else
				{
					internalSb.append("SET PATH=");
					internalSb.append(androidSdkPathS);
					internalSb.append("/platform-tools");
					internalSb.append(";%PATH%");
					
					internalSb.append("&&adb shell ls ");
					internalSb.append(filePathSb.toString());
					internalSb.append("\n");
					//internalSb.append("\"");
				}
		
				//System.out.println("internalSb: '"+internalSb.toString()+"'");
				
				bInternalFinished = false;		
				internalCommandS = internalSb.toString();
				commandBgThread = new CommandBgThread();
				commandBgThread.start();
		
				// Wait for Thread to finish..
				while ( true )
				{
					try
					{
						Thread.sleep(500);
					}
					catch (InterruptedException ie)
					{
					}
					
					//Thread.yield();
		
					if ( bInternalFinished )
						break;
				}

/*
				if ( commandResultS == null )
					System.out.println("commandResultS null");
				else
					System.out.println("commandResultS: '"+commandResultS.toString()+"'");
/**/

				// Note:
				// We can have problems with adb starting up!
				// If it does, we can get results like this:

				// '* daemon not running; starting now at tcp:5037
				// * daemon started successfully
				// allGenOutRaw   (file)
				// allWindOutRaw  (file)
				// '
				
				// or:

				// 'allGenOutRaw
				// allWindOutRaw
				// * daemon not running; starting now at tcp:5037
				// * daemon started successfully
				// '
				
				int iLsArIndex;
				int iLsCount = 0;
				int iFLoc;
				int iStartIndex = 0;
				int iFileCount = 0;
				boolean bResultsOk = true;
				boolean bContainsError = false;
				boolean bWaitTill;
				
				// Grab results..
				if ( (commandResultS != null) && (commandResultS.length() > 0) )
				{
					// Check for errors..
					iFLoc = commandResultS.indexOf(sFilePath);
					if ( iFLoc != -1 )
					{
						// Error..
						bResultsOk = false;
					}

					if ( bResultsOk )
					{
						// ls results..
						StringTokenizer st = new StringTokenizer(commandResultS);
						iLsCount = st.countTokens();
						
						LsOutAr = new ArrayList();
						String sT;
						
						// Pre scan..
						bWaitTill = false;
						for ( int iG = 0; iG < iLsCount; iG++ )
						{
							sT = st.nextToken();
							sT = sT.trim();
							//System.out.println("["+iG+"]: '"+sT+"'");
							
							if ( sT.equals("successfully") )
							{
								// Set iStartIndex..
								iStartIndex = iG + 1;
								break;
							}
							else if ( sT.equals("*") )
							{
								if ( iG == 0 )
								{
									bWaitTill = true;
									continue;
								}

								if ( bWaitTill )
									continue;
								else
								{
									// Reset limit..
									iLsCount = iG;
									break;
								}
							}
						}
						
						//System.out.println("iStartIndex: "+iStartIndex);
						//System.out.println("iLsCount: "+iLsCount);
						
						st = new StringTokenizer(commandResultS);
						
						for ( int iG = 0; iG < iLsCount; iG++ )
						{
							sT = st.nextToken();
							sT = sT.trim();
							
							//System.out.println("["+iG+"]: '"+sT+"'");
							
							if ( (sT.indexOf("Error") != -1) ||
								(sT.indexOf("error") != -1) ||
								(sT.indexOf("failed") != -1) )
							{
								bContainsError = true;
								break;
							}
		
							if ( iG >= iStartIndex )
							{
								LsOutAr.add((String)sT);
								iFileCount++;
							}
						}
					}
				}
				
				if ( (iFileCount > 1) && (bContainsError == false) )
				{
					// More than one file..
					pullDialog();
				}
				else if ( iFileCount == 1 )
				{
					pullFile();
				}
			}
			else if ( PULL_SUBMIT.equals(actionCommandS) )
			{
				pullFrame.dispose();				
				pullFile();
			}
			else if ( SELECT_ALL.equals(actionCommandS) )
			{
				textPane.requestFocusInWindow();
				textPane.selectAll();
			}
			else if ( SEARCH_NEXT.equals(actionCommandS) ||
				SEARCH_RESET_NEXT.equals(actionCommandS) )
			{
				//System.out.println("\nSEARCH");
				// Get text from StyledDocument..
				int iLength = 0;
				int iStart = 0;
				int iEnd = 0;
				int iStartOffset = 0;
				int iSearchLength = 0;
				int iAdjustedStartOffset = 0;
				int iCaretPosition;
				boolean bIsNext = false;
				boolean bDoHighlight = true;
				
				Highlighter hiLite = null;
				Rectangle rect = null;
				Rectangle endRect = null;
				
				if ( SEARCH_NEXT.equals(actionCommandS) )
					bIsNext = true;
				
				StyledDocument dsDoc = textPane.getStyledDocument();
				
				String sDoctext = "";
				String sSearchText = "";

				try
				{
					iLength = dsDoc.getLength();
					sDoctext = dsDoc.getText(0, iLength);
				}
				catch (BadLocationException ble)
				{
				}
				
				//System.out.println("iLength: "+iLength);
				
				// Get caret position..
				iCaretPosition = textPane.getCaretPosition();
				//System.out.println("iCaretPosition: "+iCaretPosition);

				// Get Search text..
				sSearchText = searchField.getText();
				sSearchText = sSearchText.trim();
				iSearchLength = sSearchText.length();

				if ( bIsNext )
				{
					iSearchIndex = (iPreviousIndex + iSearchLength);
				}
				else
				{
					if ( iCaretPosition < (iLength - 10) )
						iSearchIndex = iCaretPosition;
					else
						iSearchIndex = 0;
				}

				iSearchIndex = sDoctext.indexOf(sSearchText, iSearchIndex);
				//System.out.println("iSearchIndex: "+iSearchIndex);
				if ( iSearchIndex != -1 )
				{
					iPreviousIndex = iSearchIndex;	// Save..
					iStartOffset = iSearchIndex;
				}
				else
				{
					// Didn't find..
					if ( bIsNext )
					{
						iStartOffset = iPreviousIndex;
						if ( iPreviousIndex == -1 )
							bDoHighlight = false;
					}
					else
					{
						bDoHighlight = false;
					}
				}
				
				Color granite = new Color((int)0x83, (int)0x7e, (int)0x7c, (int)255);
				Color lightRed = new Color((int)0xf4, (int)0x22, (int)0x04, (int)255);

				if ( bDoHighlight )
				{
					try
					{
						hiLite = textPane.getHighlighter();
						
						// Calculate offset..
						rect = textPane.modelToView(iStartOffset);
						endRect = textPane.modelToView(iStartOffset + iSearchLength);
						
						iStart = textPane.viewToModel(new Point(rect.x, rect.y));
						iEnd = textPane.viewToModel(new Point(endRect.x, endRect.y));
						
						hiLite.removeAllHighlights();
	
						if ( iSearchIndex != -1 )
						{
							// Found..
							hiLite.addHighlight(
								iStart,
								iEnd,
								new DefaultHighlighter.DefaultHighlightPainter((Color)granite));
						}
						else
						{
							// Not found..
							hiLite.addHighlight(
								iStart,
								iEnd,
								new DefaultHighlighter.DefaultHighlightPainter((Color)lightRed));
						}

						Rectangle visibleRectangle = textPane.getVisibleRect();
						textPane.scrollRectToVisible(new Rectangle(
							0,
							rect.y - 100,
							visibleRectangle.width,
							visibleRectangle.height));
						
						//textPane.setCaretPosition(iStartOffset);
					}
					catch (BadLocationException ble)
					{
					}
				}
			}
			else if ( CLOSE_DIALOG.equals(actionCommandS) )
			{
				informationFrame.dispose();
			}
			else if ( CREATE_CANCEL.equals(actionCommandS) )
			{
				createFrame.dispose();
			}
			else if ( UPDATE_CANCEL.equals(actionCommandS) )
			{
				updateFrame.dispose();
			}
			else if ( VARIABLE_CANCEL.equals(actionCommandS) )
			{
				//System.out.println("VARIABLE_CANCEL");
				variableFrame.dispose();
			}
			else if ( BREAKPOINT_CANCEL.equals(actionCommandS) )
			{
				breakpointFrame.dispose();
			}
			else if ( SEARCH_CANCEL.equals(actionCommandS) )
			{
				// Remove all highlights..
				Highlighter hiLite = textPane.getHighlighter();
				hiLite.removeAllHighlights();
				
				searchFrame.dispose();
			}
			else if ( DEVICE_CANCEL.equals(actionCommandS) )
			{
				selectDeviceFrame.dispose();
			}
			else if ( PULL_CANCEL.equals(actionCommandS) )
			{
				pullFrame.dispose();
			}
			else if ( SEARCH.equals(actionCommandS) )
			{
				// Search dialog..
				searchDialog();
			}
			else if ( (DUMP_STACK.equals(actionCommandS)) && (iCardShowing == DEBUG_CARD) )
			{
				FramesInfo framesInfo;
				MethodInfo methodInfo;
				LineTableInfo lineTableInfo;
				//TabTextAreaInfo tabTextAreaInfo;
				TabInfo tabInfo;
				
				FramesAr = null;
				
				long lClassId;
				long lMethodId;
				long lLineCodeIndex;
				long lLocationIndex;
				int iLineNumber = 0;
				boolean bFirst;
				boolean bContinue;
				String sSig;
				String sSrc = "";
				String sMethodName = "";
				StringBuffer outSb = new StringBuffer();
				StringBuffer sb;
				ArrayList t2Ar;
				
				if ( bFlutterSelected )
				{
					String sReq = "";
					String sUri = "";
					String sT = "";
					String sName = "";
					//String sMajorName = "";
					int iLoc2;
					int iLoc3;
					int iLoc4;
					int iLoc5;
					
					try
					{
						//
						// getStack
						//
						
						requestLatch = new CountDownLatch(1);
								
						ParamAr = new ArrayList();
						ParamAr.add((String)Utils.filterObject(sIsolateId));
						
						String[] callStackMsg = {
							"method", "getStack",
							"params",
							"isolateId", "[]",
							"}"};
				
						sReq = ConstructMessage(callStackMsg);
						websocket = webSocketObject.getWebSocket();
						websocket.send(sReq);
				
						try
						{
							requestLatch.await();
						}
						catch (InterruptedException ie)
						{
						}
							
					}
					catch (WebSocketException wse)
					{
						wse.printStackTrace();
					}
					
					iLoc2 = 0;
					outSb.append(" ");
					
					while ( true )
					{
						//System.out.println("--TOP--");
						t2Ar = new ArrayList();
						
						// Get 'Frame'..
						iLoc2 = g_sMessage.indexOf(FRAME_STRING, iLoc2);
						if ( iLoc2 != -1 )
						{
							//System.out.println("Found Frame");
							// Get 'uri'..
							iLoc3 = g_sMessage.indexOf(URI_STRING, iLoc2);
							if ( iLoc3 != -1 )
							{
								//System.out.println("Found uri");
								iLoc4 = g_sMessage.indexOf((int)0x22, iLoc3 + 7);
								if ( iLoc4 != -1 )
								{
									sT = g_sMessage.substring(iLoc3 + 7, iLoc4);
									if ( sT.startsWith("package:") )
									{
										sUri = sT;
										//System.out.println("sUri: '"+sUri+"'");
									}
								}
							}

							//iLoc3 = iLoc2;
							bContinue = false;
							
							while ( true )
							{
								iLoc4 = g_sMessage.indexOf(NAME_STRING, iLoc3);
								if ( iLoc4 != -1 )
								{
									iLoc5 = g_sMessage.indexOf((int)0x22, iLoc4 + 8);
									if ( iLoc5 != -1 )
									{
										sName = g_sMessage.substring(iLoc4 + 8, iLoc5);
										//System.out.println("sName: '"+sName+"'");
										if ( sName.startsWith("_Widgets") )
										{
											bContinue = true;
											break;
										}
										else if ( sName.startsWith("[Unop") )
										{
											// End of "name"s..
											break;
										}
										else
										{
											t2Ar.add((String)sName);
										}
									}
								}
								
								iLoc3 = iLoc4 + 1;	// Next..
							}
							
							if ( bContinue )
							{
								iLoc2 = iLoc3;	// Next..
								continue;
							}
							
							bFirst = true;
							
							for ( int iX = t2Ar.size() - 1; iX >= 0; iX-- )
							{
								sT = (String)t2Ar.get(iX);
								if ( sT.equals("") )
									continue;
								
								if ( bFirst )
									bFirst = false;
								else
									outSb.append(".");
								
								outSb.append(sT);
							}
							
							//outSb.append("\t\t");
							outSb.append("\t");
							outSb.append(Utils.filterObject(sUri));
							outSb.append("\n ");
							
						}
						else
							break;
						
						iLoc2 = iLoc3;	// Next..
						
					}	// End while..
				}
				else
				{
					//System.out.println("lCurrentThreadId: "+lCurrentThreadId);
					
					// Get all Frames..
					JDWPCommands.command_Frames(
						lCurrentThreadId,
						0,				// startFrame
						-1);			// length, count of frames to retrieve (-1 = all remaining)
/*
					if ( FramesAr == null )
						System.out.println("FramesAr null");
					else
						System.out.println("FramesAr.size(): "+FramesAr.size());
/**/

					if ( (FramesAr != null) && (FramesAr.size() > 0) )
					{
						//outSb = new StringBuffer();
						
						for ( int iG = 0; iG < FramesAr.size(); iG++ )
						{
							//System.out.println("-----------------------------------");
							framesInfo = (FramesInfo)FramesAr.get(iG);
							lClassId = framesInfo.lClassId;
							lMethodId = framesInfo.lMethodId;
							lLocationIndex = framesInfo.lLocationIndex;
							int iTextLen;
	
							// Get the Class's signature..						
							sSig = JDWPCommands.command_Signature(lClassId);
							//System.out.println("(Signature): '"+sSig+"'");
	
							if ( lLocationIndex != -1 )						
								sSrc = JDWPCommands.command_SourceFile(lClassId);
							
							// Get Methods for that Class..		
							JDWPCommands.command_MethodsWithGeneric(lClassId);
	
							if ( lLocationIndex != -1 )						
								JDWPCommands.command_LineTable((long)lClassId, (long)lMethodId);
							
							if ( (AllMethodsAr != null) && (AllMethodsAr.size() > 0) )
							{
								for ( int iM = 0; iM < AllMethodsAr.size(); iM++ )
								{
									methodInfo = (MethodInfo)AllMethodsAr.get(iM);
									if ( methodInfo.lMethodId == lMethodId )
									{
										sMethodName = methodInfo.sName;
										break;
									}
								}
							}
	
							if ( lLocationIndex != -1 )
							{
								iLineNumber = -1;
								lLineCodeIndex = lLocationIndex;
								
								if ( (LineTableAr != null) && (LineTableAr.size() > 0) )
								{
									while ( true )
									{
										for ( int iL = 0; iL < LineTableAr.size(); iL++ )
										{
											lineTableInfo = (LineTableInfo)LineTableAr.get(iL);
											if ( lLineCodeIndex == lineTableInfo.lLineCodeIndex )
											{
												iLineNumber = lineTableInfo.iLineNumber;
												break;
											}
										}
										
										if ( iLineNumber == -1 )
										{
											lLineCodeIndex--;
										}
										else
											break;
									}
								}
							}
							
							// Construct line..
							outSb.append("[");
							if ( iG < 9 )
								outSb.append("0");
								
							outSb.append(iG + 1);	// Make one based..
							outSb.append("] ");
							
							sSig = fixSignature(sSig);
							
							sb = new StringBuffer(sSig);
							for ( int iS = 0; iS < sb.length(); iS++ )
							{
								if ( sb.charAt(iS) == '/' )
									sb.setCharAt(iS, '.');
							}
							
							outSb.append(sb.toString());
							outSb.append(".");
							outSb.append(sMethodName);
							outSb.append("() (");
	
							if ( lLocationIndex == -1 )
								outSb.append("native method");
							else
							{
								outSb.append(sSrc);
								outSb.append(":");
								outSb.append(iLineNumber);
							}
							
							outSb.append(")");
							outSb.append("\n");
							
						}	// End for..
					}
				}

				int iTextLen;
				
				// Add tab..
				String sSourceName = "Dump Stack";
				
				// addPane() creates a new JTextArea..
				addTab(sSourceName);

				if ( bFlutterSelected )
					;
				else
				{
					// Set up ClassMethodInfo..
					ClassMethodInfo classMethodInfo = new ClassMethodInfo();
					classMethodInfo.lClassId = 0;
					classMethodInfo.lMethodId = 0;
					classMethodInfo.sMethodName = "";
					classMethodInfo.sSourcePath = "";
					classMethodInfo.jScrollPane = tabScrollPane;

					ClassMethodAr.add((ClassMethodInfo)classMethodInfo);
				}
				
				//if ( (TabTextAreaAr != null) && (TabTextAreaAr.size() > 0) )
				if ( (TabInfoAr != null) && (TabInfoAr.size() > 0) )
				{
					//jTextArea = (JTextArea)TabTextAreaAr.get(TabTextAreaAr.size() - 1);		// Get last..
					//tabTextAreaInfo = (TabTextAreaInfo)TabTextAreaAr.get(TabTextAreaAr.size() - 1);
					//jTextArea = tabTextAreaInfo.jTextArea;
					tabInfo = (TabInfo)TabInfoAr.get(TabInfoAr.size() - 1);
					jTextArea = tabInfo.jTextArea;

				}

				if ( jTextArea != null )
				{
					iTextLen = jTextArea.getText().length();
					
					if ( iTextLen == 0 )
					{
						jTextArea.insert(outSb.toString(), 0);
					}
					else
					{
						// Replace..
						jTextArea.replaceRange(outSb.toString(), 0, iTextLen);
					}
					
					// Scroll to top..		
					jTextArea.setCaretPosition(0);
					
					statusPath.setText(" ");
				}
			}
			else if ( WIRELESS_CONNECT.equals(actionCommandS) )
			{
				//System.out.println("WIRELESS_CONNECT");

				//System.out.println("bWirelessConnected: "+bWirelessConnected);
				if ( bWirelessConnected )
					;
				else
				{
				
					bInitWirelessFinished = false;
					initWirelessBgThread = new InitWirelessBgThread();
					initWirelessBgThread.start();
	
					while ( true )
					{
						try
						{
							Thread.sleep(20);
						}
						catch (InterruptedException ie)
						{
						}
					
						if ( bInitWirelessFinished )
							break;
					}
				}
				
				// Check success..
				if ( (iWirelessErrorCode == 0) || bWirelessConnected )
				{
					if ( bWirelessConnected )
						;
					else
					{
						// Success, put up dialog for Connect..
						JOptionPane.showMessageDialog(
							null,				// parentComponent 
							"Hit OK when USB is disconnected.",	// message
							"Wireless Connect",			// title
							JOptionPane.INFORMATION_MESSAGE);	// messageType
					}
					
					//bConnectWirelessFinished = false;
					completeLatch = new CountDownLatch(1);
					
					connectWirelessBgThread = new ConnectWirelessBgThread();
					connectWirelessBgThread.start();

					try
					{
						completeLatch.await();
					}
					catch (InterruptedException ie)
					{
					}

/*
					while ( true )
					{
						try
						{
							Thread.sleep(200);
						}
						catch (InterruptedException ie)
						{
						}
					
						if ( bConnectWirelessFinished )
							break;
					}
/**/
				}

				int iMessageType;
				if ( iWirelessErrorCode != 0 )
				{
					iMessageType = JOptionPane.ERROR_MESSAGE;

					JOptionPane.showMessageDialog(
						null,				// parentComponent 
						sWirelessMessage,	// message
						"Wireless",			// title
						iMessageType);	// messageType
				}
				
				//System.out.println("Exiting WIRELESS_CONNECT");
						
			}
			else if ( WIRELESS_DISCONNECT.equals(actionCommandS) )
			{
				//System.out.println("WIRELESS_DISCONNECT");
				
				bDisconnectWirelessFinished = false;
				disconnectWirelessBgThread = new DisconnectWirelessBgThread();
				disconnectWirelessBgThread.start();

				while ( true )
				{
					try
					{
						Thread.sleep(20);
					}
					catch (InterruptedException ie)
					{
					}
				
					if ( bDisconnectWirelessFinished )
						break;
				}
				
				if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
				{
					int iLoc = sDeviceName.indexOf(":");
					if ( iLoc != -1 )
					{
						// Disconnected, so prevent it
						// from using wireless Id with '-s'..
						sDeviceName = "";
					}
				}

				//bDevicesFinished = false;
				completeLatch = new CountDownLatch(1);
				
				getDevicesBgThread = new GetDevicesBgThread();
				getDevicesBgThread.start();
				
				try
				{
					completeLatch.await();
				}
				catch (InterruptedException ie)
				{
				}

/*
				while ( true )
				{
					try
					{
						Thread.sleep(20);
					}
					catch (InterruptedException ie)
					{
					}
		
					//Thread.yield();
				
					if ( bDevicesFinished )
						break;
				}
/**/

				if ( (DevicesAr != null) && (DevicesAr.size() > 1) )
				{
					// Open Dialog..
					selectDeviceDialog();
				}
				else
				{
					// Clear status bar..
					deviceLabel.setText(" ");
				}
				
			}
			else if ( VARIABLE_SUBMIT.equals(actionCommandS) )
			{
				//System.out.println("\nVARIABLE_SUBMIT");
				LocalVariableInfo localVariableInfo;
				ClassVariableInfo classVariableInfo;
				String sSig = "";
				String sStringValue = "";
				long lCodeIndex = 0;
				long lValue = 0;
				byte bTag;
				boolean bValue;
				Value[] value = new Value[1];
				int[] iSlot = new int[1];
				int[] fieldId = new int[1];
				int iRadix = 10;
				int iModBits = 0;
				int iResult = 0;
				int iStart;
				char cChr;
				long lStringObjectId;
				float fValue = 0.0f;
				double dValue = 0;
				
				// Set variable..
				String sFieldValue = variableSetField.getText();
				if ( (sFieldValue != null) && (sFieldValue.length() > 0) )
				{
					//System.out.println("sFieldValue: '"+sFieldValue+"'");
					sFieldValue = sFieldValue.trim();
					
					if ( iVariableType == Constants.CLASS_VARIABLE )
					{
						classVariableInfo =
							(ClassVariableInfo)ClassVariableLHm.get(new Long(lClassVariableKey));
						sSig = classVariableInfo.sSignature;
						iModBits = classVariableInfo.iModBits;
						fieldId[0] = (int)classVariableInfo.lFieldId;
					}
					else
					{
						localVariableInfo =
							(LocalVariableInfo)LocalVariableLHm.get(new Integer(iLocalVariableKey));
						sSig = localVariableInfo.sSignature;
						iSlot[0] = localVariableInfo.iSlot;
					}
					
					//System.out.println("sSig: '"+sSig+"'");
				
					// Check tag..
					bTag = (byte)sSig.charAt(0);
					//System.out.println("bTag: '"+(char)bTag+"'");
					iStart = 0;
					cChr = sSig.charAt(iStart);
					
					if ( cChr == '[' )
						iStart++;
					
					if ( cChr == (char)Constants.TAG_BOOLEAN )
					{
						value[0] = new Value((boolean)Boolean.parseBoolean(sFieldValue));
					}
					else if ( sSig.indexOf("java/lang/String;") != -1 )
					{
						if ( sFieldValue.equals("\"\"") )
							sFieldValue = "";
						
						lStringObjectId = JDWPCommands.command_CreateString(sFieldValue);
						value[0] = new Value((byte)bTag, (long)lStringObjectId);
					}
					else if ( cChr == (char)Constants.TAG_FLOAT )
					{
						try
						{						
							fValue = Float.parseFloat(sFieldValue);
						}
						catch (NumberFormatException nfe)
						{
						}
						
						value[0] = new Value((float)fValue);
					}
					else if ( cChr == (char)Constants.TAG_DOUBLE )
					{
						try
						{						
							dValue = Double.parseDouble(sFieldValue);
						}
						catch (NumberFormatException nfe)
						{
						}
						
						value[0] = new Value((double)dValue);
					}
					else
					{
						if ( sFieldValue.startsWith("0x") )
						{
							iRadix = 16;
							sFieldValue = sFieldValue.toLowerCase();
							sFieldValue = sFieldValue.substring(2);
						}

						try
						{						
							lValue = Long.parseLong(sFieldValue, iRadix);
						}
						catch (NumberFormatException nfe)
						{
						}
						
						value[0] = new Value((byte)bTag, (long)lValue);
					}

					if ( iVariableType == Constants.CLASS_VARIABLE )
					{
						iResult = iModBits & Constants.ACC_STATIC;
						if ( iResult == 0 )
						{
							// Non static..
							JDWPCommands.command_SetValuesInstance(
								lThisObjectId,	// ObjectId
								fieldId,		// fieldId[]
								value);		// Value[] value
						}
						else
						{
							// Static..
							JDWPCommands.command_SetValuesStatic(
								currentClassId,	// ClassId
								fieldId,		// fieldId[]
								value);		// Value[] value
						}
					}
					else
					{
						JDWPCommands.command_SetValuesLocal(
							lCurrentThreadId,	// ThreadId..
							lCurrentFrameId,	// FrameId,
							iSlot,				// int[] iSlots
							value);				// Value[] value
					}
				}
				
				variableFrame.dispose();
				
			}
			else if ( DEVICE_SUBMIT.equals(actionCommandS) )
			{
				// Set Device..
				//System.out.println("DEVICE_SUBMIT");				
				sDeviceName = (String)deviceSpinner.getValue();
				//System.out.println("sDeviceName: '"+sDeviceName+"'");
				
				// Load Status bar..
				if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
					deviceLabel.setText(sDeviceName);
				
				bSelectFinished = true;
				
				selectDeviceFrame.dispose();
				
			}
			else if ( SELECT_DEVICE.equals(actionCommandS) )
			{
				//System.out.println("SELECT_DEVICE");

				// Show the Progress Bar..
				DevicesAr = new ArrayList();				
				bGetDevices = true;
				//bDevicesFinished = false;
				completeLatch = new CountDownLatch(1);
				
				getDevicesBgThread = new GetDevicesBgThread();
				getDevicesBgThread.start();

				try
				{
					completeLatch.await();
				}
				catch (InterruptedException ie)
				{
				}

/*
				while ( true )
				{
					
					try
					{
						Thread.sleep(20);
					}
					catch (InterruptedException ie)
					{
					}
					
					//Thread.yield();
				
					if ( bDevicesFinished )
						break;
				}
/**/
						
/*						
				if ( DevicesAr == null )
					System.out.println("(Before selectDeviceDialog())DevicesAr null");
				else
					System.out.println("(Before selectDeviceDialog())DevicesAr.size(): "+DevicesAr.size());
/**/				
				if ( (DevicesAr != null) && (DevicesAr.size() > 0) )
					selectDeviceDialog();
				
			}
			else if ( SEND_LOCATION.equals(actionCommandS) )
			{
				//System.out.println("\nSEND_LOCATION");
				
				if ( bLogcatOn )
				{
					// Reset..
					logcatToggleButton.doClick();

					// Set to kill IOBgThread..
					bBreakOut = true;
					
					// Wait for IOBgThread to end..
					while ( true )
					{
						Thread.yield();
						if ( ! bLogcatOn )
							break;
					}
				}

				//StringBuffer internalSb = new StringBuffer();
				commandSb = new StringBuffer();

				if ( iOS == LINUX_MAC )
				{
					commandSb.append("export PATH=${PATH}:");
					commandSb.append(androidSdkPathS);
					commandSb.append("/platform-tools");
					
					commandSb.append(";adb ");

					if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
					{
						commandSb.append("-s ");
						commandSb.append(sDeviceName);
						commandSb.append(" ");
					}
					
					commandSb.append("emu geo fix ");
					commandSb.append(sGPSLongitude);
					commandSb.append(" ");
					commandSb.append(sGPSLatitude);
				}
				else
				{
					commandPhrase = "adb emu";
					
					commandSb.append("SET PATH=");
					commandSb.append(androidSdkPathS);
					commandSb.append("/platform-tools");
					commandSb.append(";%PATH%");
					
					commandSb.append("&&adb ");

					if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
					{
						commandSb.append("-s ");
						commandSb.append(sDeviceName);
						commandSb.append(" ");
					}

					commandSb.append("emu geo fix ");
					commandSb.append(sGPSLongitude);
					commandSb.append(" ");
					commandSb.append(sGPSLatitude);
					commandSb.append("\n");
				}

				
				commandS = commandSb.toString();

				ioBgThread = new IOBgThread();
				ioBgThread.start();
				
				// Wait for Thread to finish..
				while ( true )
				{
/*
					try
					{
						Thread.sleep(100);
					}
					catch (InterruptedException ie)
					{
					}
/**/					
					Thread.yield();

					if ( bIOBgThreadFinished )
						break;
				}
			}
			else if ( (DISCONNECT.equals(actionCommandS)) && (iCardShowing == DEBUG_CARD) )
			{
				//System.out.println("\nDISCONNECT");
				
				JDWPCommands.command_Dispose();
				
				// Clear all Breakpoints..
				BreakpointInfo breakpointInfo;
				if ( (BreakpointAr != null) && (BreakpointAr.size() > 0) )
				{
					for ( int iB = 0; iB < BreakpointAr.size(); iB++ )
					{
						breakpointInfo = (BreakpointInfo)BreakpointAr.get(iB);
						
						// Clear Breakpoint..
						JDWPCommands.command_Clear(
							(byte)Constants.EVENT_KIND_BREAKPOINT,
							breakpointInfo.iRequestId);

						BreakpointAr.remove(iB);
					}
				}

				// Disconnect..
				try
				{
					if ( eventThread != null )
						eventThread.interrupt();
					
					if ( packetDispatcher != null )
						packetDispatcher.interrupt();
					
					SocketTransport.close();
				}
				catch (SecurityException se)
				{
				}
			}
		}
	};	//}}}

	//{{{	KillAdbBgThread
	class KillAdbBgThread extends Thread
	{
		public void run()
		{
			//System.out.println("KillAdbBgThread run()");
			Process proc = null;
			Runtime rt = null;
			int iExitVal;
			int iWaitFor;
			int iLoc2 = 0;
			StringBuffer commandSb = new StringBuffer();
			StringBuffer internalSb = new StringBuffer();
			StringBuffer mSb;
			
			if ( iOS == LINUX_MAC )
			{
				commandSb.append("export PATH=${PATH}:");
				commandSb.append(androidSdkPathS);
				commandSb.append("/platform-tools");
				
				commandSb.append(";adb kill-server");
			}
			else
			{
				commandSb.append("CD ");
				commandSb.append(androidSdkPathS);
				commandSb.append("/platform-tools");

				commandSb.append("&&adb kill-server");
				commandSb.append("\n");
			}
			
			try
			{
				rt = Runtime.getRuntime();
				
				if ( iOS == LINUX_MAC )
					proc = rt.exec(new String[] {"/bin/bash", "-c", commandSb.toString()});
				else
					proc = rt.exec(new String[] {"cmd.exe", "/C", commandSb.toString()});

				while ( true )
				{
					try
					{
						iExitVal = proc.exitValue();
						break;
					}
					catch (IllegalThreadStateException itse)
					{
					}
				}
			}
			catch (Exception e)
			{
			}
			
			proc.destroy();

			while ( true )
			{
				try
				{
					iWaitFor = proc.waitFor();
					break;
				}
				catch (InterruptedException ie)
				{
				}
			}

			// If using wireless try to
			// re-connect..			
			if ( bWirelessConnected )
			{
				while ( true )
				{
					// Try to re-connect..
					internalSb = new StringBuffer();
					if ( iOS == LINUX_MAC )
					{
						internalSb.append("export PATH=${PATH}:");
						internalSb.append(androidSdkPathS);
						internalSb.append("/platform-tools");
						
						internalSb.append(";adb connect ");
						internalSb.append(sWirelessID);
						
					}
					else
					{
						internalSb.append("SET PATH=");
						internalSb.append(androidSdkPathS);
						internalSb.append("/platform-tools");
						internalSb.append(";%PATH%");

						internalSb.append("&&adb connect ");
						internalSb.append(sWirelessID);
						internalSb.append("\n");
						
					}
					
					//System.out.println("internalSb: '"+internalSb.toString()+"'");

					bInternalFinished = false;		
					internalCommandS = internalSb.toString();
					commandBgThread = new CommandBgThread();
					commandBgThread.start();
			
					// Wait for Thread to finish..
					while ( true )
					{
						try
						{
							Thread.sleep(500);
						}
						catch (InterruptedException ie)
						{
						}
			
						if ( bInternalFinished )
							break;
					}

/*
					if ( commandResultS == null )
						System.out.println("commandResultS null");
					else
						System.out.println("commandResultS: '"+commandResultS+"'");
/**/

					if ( commandResultS != null )
					{
						iLoc2 = commandResultS.indexOf("connected");
						if ( iLoc2 != -1 )
						{
							//System.out.println("Connected, breaking");
							break;
						}
					}
				}	// End while..				
			}
			
			bKillFinished = true;
		}
	}	//}}}

	//{{{	appCaretListener
	private CaretListener appCaretListener = new CaretListener()
	{
		public void caretUpdate(CaretEvent e)
		{
			//System.out.println("appCaretListener, caretUpdate()");
			String sT = appNmField.getText();
			if ( sT.equals("hello_world") )
			{
				if ( bCaretDirty )
					;	
				else
				{
					// First time through..
					bCaretDirty = true;
					//System.out.println("In hello_world");
					appNmField.setText("");
				}
			}
		}
	};	//}}}

	//{{{	getPackageName()
	private void getPackageName()
	{
		//System.out.println("getPackageName()");
/*		
		if ( projectHomeS == null )
			System.out.println("projectHomeS null");
		else
			System.out.println("projectHomeS: '"+projectHomeS+"'");
/**/				
				
		int iLoc;
		int iLoc2;
		String sIn = "";
		StringBuffer sb = new StringBuffer(projectHomeS);
		StringBuffer tSb;		
		File fileT3;

		while ( true )
		{
			// Flutter..
			try
			{
				tSb = new StringBuffer(projectHomeS);
				tSb.append("/android/app/src/main/AndroidManifest.xml");
				fileT3 = new File(tSb.toString());
				if ( fileT3.exists() )
				{
					sb.append("/android/app/src/main/AndroidManifest.xml");
					break;
				}
			}
			catch (Exception e)
			{
			}

			try
			{
				// Gradle..	
				tSb = new StringBuffer(projectHomeS);
				tSb.append("/app/src/main/AndroidManifest.xml");
				fileT3 = new File(tSb.toString());
				if ( fileT3.exists() )
				{
					sb.append("/app/src/main/AndroidManifest.xml");
					break;
				}
			}
			catch (Exception e)
			{
			}

			try
			{
				// Gradle..
				tSb = new StringBuffer(projectHomeS);
				tSb.append("/src/main/AndroidManifest.xml");
				fileT3 = new File(tSb.toString());
				if ( fileT3.exists() )
				{
					sb.append("/src/main/AndroidManifest.xml");
					break;
				}
			}
			catch (Exception e)
			{
			}

			// In Home..
			try
			{
				tSb = new StringBuffer(projectHomeS);
				tSb.append("/AndroidManifest.xml");
				fileT3 = new File(tSb.toString());
				if ( fileT3.exists() )
				{
					sb.append("/AndroidManifest.xml");
					break;
				}
			}
			catch (Exception e)
			{
			}

			try
			{
				// LibGdx..
				tSb = new StringBuffer(projectHomeS);
				tSb.append("/android/AndroidManifest.xml");
				fileT3 = new File(tSb.toString());
				if ( fileT3.exists() )
				{
					sb.append("/android/AndroidManifest.xml");
					break;
				}
			}
			catch (Exception e)
			{
			}

			try
			{
				// My LibGdx..
				tSb = new StringBuffer(projectHomeS);
				tSb.append("/app/AndroidManifest.xml");
				fileT3 = new File(tSb.toString());
				if ( fileT3.exists() )
				{
					sb.append("/app/AndroidManifest.xml");
					break;
				}
			}
			catch (Exception e)
			{
			}
			
			break;
		}
				
		//System.out.println("sb: '"+sb.toString()+"'");
			
		byte[] buf = null;

		buf = readFile(896, sb.toString());
		if ( (buf != null) && (buf.length > 0) )
		{
			sIn = new String(buf);

			iLoc = sIn.indexOf("package=");
			if ( iLoc != -1 )
			{
				iLoc2 = sIn.indexOf((int)0x22, (iLoc + 9));		// '"'
				if ( iLoc2 != -1 )
					packageNameS = sIn.substring((iLoc + 9), iLoc2);
			}
		}
/*		
		if ( packageNameS == null )
			System.out.println("packageNameS null");
		else
			System.out.println("packageNameS: '"+packageNameS+"'");
/**/	
		
	}	//}}}
	
	//{{{	orgCaretListener
	private CaretListener orgCaretListener = new CaretListener()
	{
		public void caretUpdate(CaretEvent e)
		{
			//System.out.println("orgCaretListener, caretUpdate()");
			String sT = organizationField.getText();
			if ( sT.equals("com.example") )
			{
				if ( bOrgCaretDirty )
					;	
				else
				{
					// First time through..
					bOrgCaretDirty = true;
					organizationField.setText("");
				}
			}
		}
	};	//}}}
	
	//{{{	appFocusListener
	private FocusListener appFocusListener = new FocusListener()
	{
		public void focusGained(FocusEvent e)
		{
		}
		
		public void focusLost(FocusEvent e)
		{
			//System.out.println("focusLost()");
			boolean bOK = true;
			char cChr;
/*			
			if ( appNmField == null )
				System.out.println("appNmField null");
			else
				System.out.println("appNmField not null");
/**/			
			String sAppNm = appNmField.getText();
			if ( (sAppNm != null) && (sAppNm.length() > 0) )
			{
				sAppNm = sAppNm.trim();
				//System.out.println("sAppNm: '"+sAppNm+"'");

				if ( bFlutterSelected )
				{
					// Check for valid Dart Package name..
					for ( int iG = 0; iG < sAppNm.length(); iG++ )
					{
						cChr = sAppNm.charAt(iG);
						if ( (cChr == '_') || ((Character.isLetter(cChr)) && (Character.isLowerCase(cChr))) )
							;
						else
						{
							// Error..
							bOK = false;
							break;
						}
					}
				}
				
				if ( bOK == false )
				{
					// Put up error dialog..
					JOptionPane.showMessageDialog(
						frame,
						"Application Name must be a valid Dart Package name\nusing only lowercase letters or underscores.",
						"Error: Application Name",
						JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					// We have something, so try to add it..
					String prjPathS = projectPathField.getText();
					
					// Check if it's okay to append..
					if ( prjPathS.endsWith("\\") || prjPathS.endsWith("/") )
					{
						// Okay to set..
						StringBuffer sb = new StringBuffer();
						sb.append(prjPathS);
						sb.append(sAppNm);
						
						projectPathField.setText(sb.toString());
					}
				}
			}
/*
			if ( packageField == null )
				System.out.println("packageField null");
			else
				System.out.println("packageField not null");
/**/

			if ( packageField != null )
			{
				String sPackageNm = packageField.getText();
				if ( (sPackageNm != null) && (sPackageNm.length() > 0) )
				{
					bOK = true;
					sPackageNm = sPackageNm.trim();
					//System.out.println("sPackageNm: '"+sPackageNm+"'");
	
					if ( bFlutterSelected )
						;
					else
					{
						// Check Package name..
						for ( int iG = 0; iG < sPackageNm.length(); iG++ )
						{
							cChr = sPackageNm.charAt(iG);
							if ( (cChr == '_') || (cChr == '.') || (Character.isLetterOrDigit(cChr)) )
								;
							else
							{
								// Error..
								bOK = false;
								break;
							}
						}
					}
					
					if ( bOK == false )
					{
						// Put up error dialog..
						JOptionPane.showMessageDialog(
							frame,
							"Package Name characters must be a letter, digit, '.' or underscore.",
							"Error: Package Name",
							JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		}
	};	//}}}

	//{{{	ActionListener tabActionListener   Close
	private ActionListener tabActionListener = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			// Handle Close..
			//System.out.println("actionPerformed()");

			bGotStateChanged = false;	// Reset..
			
			bHitClose = true;
			
			
			
			JButton jButton = (JButton)e.getSource();

/*			
			if ( jButton == null )
				System.out.println("jButton null");
			else
				System.out.println("jButton: "+jButton);
				//System.out.println("jButton not null");
/**/



			JTabbedPane jTabbedPane =
				(JTabbedPane)jButton.getParent().getParent().getParent();
/*
			if ( jTabbedPane == null )
				System.out.println("jTabbedPane null");
			else
				System.out.println("jTabbedPane: "+jTabbedPane);
/**/

			// javax.swing.plaf.basic.BasicTabbedPaneUI$TabContainer			
			Component tabContainer = (Component)jButton.getParent();	// javax.swing.JPanel

/*			
			if ( tabContainer == null )
				System.out.println("tabContainer null");
			else
				System.out.println("tabContainer: "+tabContainer);
/**/

			int iIndex = jTabbedPane.indexOfTabComponent(tabContainer);
			iRemoveIndex = iIndex;	// Index of Tab to be removed..
			//System.out.println("(remove())iIndex: "+iIndex);
			
			if ( iIndex != -1 )
			{
				// Check for default..
				Component component = jTabbedPane.getTabComponentAt(iIndex);


				// Note:
				// After doing the remove() the ChangeListener sometimes
				// will get the event late or not at all.
				// So soon after, we need to
				// clear the remove() switch so that it can get
				// the current event, like a select..
				
				//System.out.println("\nDoing remove("+iIndex+")");
				// Do remove()..
				jTabbedPane.remove(iIndex);
				//tabbedPane.remove(iIndex);
				
				//System.out.println("(After remove()) jTabbedPane.getTabCount(): "+jTabbedPane.getTabCount());				

				// Remove ClassMethodInfo for this Tab..
				if ( (ClassMethodAr != null) && (iIndex < ClassMethodAr.size()) )
				{
					ClassMethodAr.remove(iIndex);
				}

				//System.out.println("iTabLevel: "+iTabLevel);				
				if ( iTabLevel < 3 )
				{
					// Closed default..
					// Reset all TextAreas..
					//TabTextAreaAr = new ArrayList();
					TabInfoAr = new ArrayList();
					
					bDefaultTabShowing = false;
					
				}
				else
				{
					// Remove TextArea for this Tab..				
					//if ( (TabTextAreaAr != null) && (iIndex < TabTextAreaAr.size()) )
					if ( (TabInfoAr != null) && (iIndex < TabInfoAr.size()) )
					{
						//TabTextAreaAr.remove(iIndex);
						TabInfoAr.remove(iIndex);
					}
				}
			}
			

			int iCount = 0;			
			while ( true )
			{
				try
				{
					Thread.sleep(250);
				}
				catch (InterruptedException ie)
				{
				}
				
				if ( bGotStateChanged )
				{
					//System.out.println("Got StateChanged, iCount: "+iCount);
					break;
				}
				
				if ( iCount > 1 )
				{
					// Didn't get StateChanged..
					// Reset..
					//System.out.println("-- Didn't get StateChanged --");
					bHitClose = false;
					
					break;
				}
				
				iCount++;
			}
		}
	};	//}}}

	//{{{	MouseListener	Breakpoints
	static MouseListener breakpointsMouseListener = new MouseAdapter()
	{
		public void mouseClicked(MouseEvent e)
		{
            JList list = (JList)e.getSource();
            
            // Get index of item clicked
            int index = list.locationToIndex(e.getPoint());
            CheckListItem item = (CheckListItem)list.getModel().getElementAt(index);

			boolean bSelected = item.getSelected();
            // Toggle selected state
            item.setSelected(! item.isSelected());
            
            // Repaint cell
            list.repaint(list.getCellBounds(index, index));
		}
	};	//}}}

	//{{{	MouseListener	jListMouseListener  Variables 
	MouseListener jListMouseListener = new MouseAdapter()
	{
		public void mousePressed(MouseEvent e)
		{
			//System.out.println("\n-- mousePressed() --");
			int iIndex = jList.locationToIndex(e.getPoint());	// Zero based..
			//System.out.println("iIndex: "+iIndex);

			StringBuffer sb;
			VariableTableInfo variableTableInfo = null;
			ClassVariableInfo classVariableInfo = null;
			LocalVariableInfo localVariableInfo = null;
			bGhostVariables = false;	// Reset..
			boolean bIsArray = false;
			String sName = "";
			String sSignature = "";
			String sValue = "";
			String[] sValues = null;
			long lObjectId = 0;
			byte bTag = (byte)Constants.TAG_NO;
			int iKey = 0;
			int iVarIndex;
			int iModBits;
			
			variableDialogVector = new Vector();	// Reset..
			
			// Like:  '  sTestString         Testing'			
			String stringValue = (String)jList.getSelectedValue();
			//System.out.println("stringValue: '"+stringValue+"'");
			if ( (stringValue != null) && (! stringValue.equals("")) )
			{
				// Get variable name..
				stringValue = stringValue.trim();
				int iX = 0;
				boolean bHitEnd = true;
				//System.out.println("stringValue.length(): "+stringValue.length());
				for ( iX = 0; iX < stringValue.length(); iX++ )
				{
					if ( Character.isWhitespace(stringValue.charAt(iX)) )
					{
						bHitEnd = false;
						break;
					}
				}
				
				if ( bHitEnd )
					sVariableName = stringValue;
				else
					sVariableName = stringValue.substring(0, iX);
				
				//System.out.println("sVariableName: '"+sVariableName+"'");
				//System.out.println("iEndIndex: "+iEndIndex);
				
				if ( iIndex >= iEndIndex )
				{
					//System.out.println("Class variable");
					// Class variable..
					if ( (ClassVariableLHm != null) && (ClassVariableLHm.size() > 0) )
					{
						Set setClassKeys = ClassVariableLHm.keySet();
						Iterator classIterator = setClassKeys.iterator();
						long lKey = 0;
						Long LVal;
						
						while ( classIterator.hasNext() )
						{
							// Get Key..				
							LVal = (Long)classIterator.next();
							if ( LVal != null )
								lKey = LVal.longValue();
							
							classVariableInfo = (ClassVariableInfo)ClassVariableLHm.get(new Long(lKey));
							sName = classVariableInfo.sName;
							if ( sName.equals(sVariableName) )
							{
								sSignature = classVariableInfo.sSignature;
								iModBits = classVariableInfo.iModBits;
								sValues = classVariableInfo.sStringValue;
								
								lClassVariableKey = lKey;	// Key for Set..
								iVariableType = Constants.CLASS_VARIABLE;
								
								break;
							}
						}
					}
				}
				else
				{
					//System.out.println("Local variable");
					// Local variable..
					if ( (LocalVariableLHm != null) && (LocalVariableLHm.size() > 0) )
					{
						Set setLocalKeys = LocalVariableLHm.keySet();
						Iterator localIterator = setLocalKeys.iterator();
						Integer IVal;
						iKey = 0;
						
						while ( localIterator.hasNext() )
						{
							// Get Key..				
							IVal = (Integer)localIterator.next();
							if ( IVal != null )
								iKey = IVal.intValue();
							
							localVariableInfo = (LocalVariableInfo)LocalVariableLHm.get(new Integer(iKey));
							sName = localVariableInfo.sName;
							//System.out.println("sName: '"+sName+"'");
							if ( sName.equals(sVariableName) )
							{
								sSignature = localVariableInfo.sSignature;
								sValues = localVariableInfo.sStringValue;
								
								iLocalVariableKey = iKey;	// Key for Set..
								iVariableType = Constants.LOCAL_VARIABLE;
								
								break;
							}
						}
					}
				}
				
				// Set Name..
				sb = new StringBuffer();
				sb.append(sName);
				sVariableName = sb.toString();
				
				if ( (sSignature != null) && (sSignature.length() > 0) )
				{
					if ( sSignature.charAt(0) == '[' )
					{
						bGhostVariables = true;	// Ghost Set..
						bIsArray = true;
					}
					
					// Adjust for String, was getting 'L'..
					int iLoc = sSignature.indexOf("java/lang/String;");
					if ( iLoc != -1 )
					{
						if ( bIsArray )
						{
							// Classify as TAG_ARRAY to handle multiple values
							// TAG_STRING only handles single values..
							bTag = (byte)Constants.TAG_ARRAY;
						}
						else
							bTag = (byte)Constants.TAG_STRING;
					}
					else
						bTag = (byte)sSignature.charAt(0);	// Get Tag..
				
					//System.out.println("bTag: "+bTag+"  '"+(char)bTag+"'");
	
					// Get adjusted Signature..
					sb = new StringBuffer();
					sb.append(fixSignature(sSignature));
					sVariableSignature = sb.toString();
				}
				
				boolean bAdd = true;
				
				if ( Utils.isValuePrimitiveType(bTag) )
				{
					// Primitive..
					if ( (sValues != null) && (sValues.length > 0) )
						sValue = sValues[0];
				}
				else
				{
					// Non Primitive..
					if ( bTag == (byte)Constants.TAG_STRING )
					{
						// Overwrite Signature..
						if ( bIsArray )
							sVariableSignature = "String[]";
						else
							sVariableSignature = "String";

						if ( (sValues != null) && (sValues.length > 0) )
						{
							// Value..
							sb = new StringBuffer();
							if ( sValues[0].equals("null") )
								sb.append(sValues[0]);
							else
							{
								sb.append("'");
								sb.append(sValues[0]);
								sb.append("'");
							}
							
							sValue = sb.toString();
						}
					}
					else if ( bTag == (byte)Constants.TAG_ARRAY )
					{
						// Set JList Vector to show Array values..
						bAdd = false;

						if ( (sValues != null) && (sValues.length > 0) )
						{
							for ( int iG = 0; iG < sValues.length; iG++ )
							{
								//System.out.println("["+iG+"]: '"+sValues[iG]+"'");
								variableDialogVector.add((String)sValues[iG]);
							}
						}
					}
					else
					{
						// Object..
						if ( sSignature.indexOf("java/lang/StringBuffer;") != -1 )
							sVariableSignature = "StringBuffer";
						
						bGhostVariables = true;	// Ghost Set..
						sb = new StringBuffer();
						sb.append("ObjectId:  ");
						sb.append(Long.toHexString(lObjectId));
						sValue = sb.toString();
					}
				}

				if ( bAdd )
				{
					// Add to JList Vector..
					//System.out.println("(Add): '"+sValue+"'");
					variableDialogVector.add((String)sValue);
				}
				
				variableDialog();
			}
		}
	};	//}}}
	
	//{{{	MouseListener	Source JTextArea
	//static MouseListener mouseListener = new MouseAdapter()
	MouseListener mouseListener = new MouseAdapter()
	{
		public void mousePressed(MouseEvent e)
		{
			//System.out.println("\n~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+~+");
			//System.out.println("MouseListener mousePressed()");
			LineTableInfo lineTableInfo;
			TabInfo tabInfo;
			boolean bLineMatched = false;
			boolean bDoLineSelect;
			bLineSelected = false;
			long lMethodID;
			long lBpLineIndex;
			long lLnCodeIndex;
			int iLineTableLineNumber;
			int iLineNumber;
			int iRequestId;
			int iLoc2;
			String[] sTokenPosTableAr = null;
			String sBreakpointId;
			String sTScript;
			
			try
			{
				// Try to get current Tab..
				int iSelect = tabbedPane.getSelectedIndex();
				//System.out.println("(getSelectedIndex())iSelect: "+iSelect);
				
				if ( (TabInfoAr != null) && (TabInfoAr.size() > 0) )
				{
					tabInfo = (TabInfo)TabInfoAr.get(iSelect);
					jTextArea = tabInfo.jTextArea;
					sTokenPosTableAr = tabInfo.sTokenPosTable;	// String[]
/*					
					if ( sTokenPosTableAr != null )
					{
						System.out.println("[0]: '"+sTokenPosTableAr[0]+"'");
						System.out.println("[1]: '"+sTokenPosTableAr[1]+"'");
					}
/**/					
					sScriptId = tabInfo.sScriptId;
					//System.out.println("sScriptId: '"+sScriptId+"'");
					
				}
				
				
				String sText = jTextArea.getText();
				
				byte[] bytes = sText.getBytes();
				//System.out.println("bytes.length: "+bytes.length);
				
				int iAdjustedLine;
				int iActualLineNumber = 0;
				int iOffset = jTextArea.viewToModel(e.getPoint());
				//System.out.println("iOffset: "+iOffset);

				// Zero based line number..				
				int iZeroLineNumber = jTextArea.getLineOfOffset(iOffset);
				int iOneLineNumber = iZeroLineNumber + 1;
				//System.out.println("iZeroLineNumber: "+iZeroLineNumber);
				//System.out.println("iOneLineNumber: "+iOneLineNumber);
				
				// Convert into actual line number..
				iActualLineNumber = iZeroLineNumber + iSourceLineAdjust;
				//System.out.println("iActualLineNumber: "+iActualLineNumber);
				
				if ( bFlutterSelected )
				{
					String sT;
					int iLine = 0;
					boolean bMatched = false;
/*					
					if ( sTokenPosTableAr == null )
						System.out.println("sTokenPosTableAr null");
					else
						System.out.println("sTokenPosTableAr.length: "+sTokenPosTableAr.length);
/**/					

					if ( (sTokenPosTableAr != null) && (sTokenPosTableAr.length > 0) )
					{
						for ( int iJ = 0; iJ < sTokenPosTableAr.length; iJ++ )
						{
							// '42,1565,3,1566,4'
							sT = sTokenPosTableAr[iJ];
							iLoc2 = sT.indexOf(",");
							if ( iLoc2 != -1 )
							{
								sT = sT.substring(0, iLoc2);
								
								try
								{
									iLine = Integer.parseInt(sT);
									//System.out.println("iLine: "+iLine);
								}
								catch (NumberFormatException nfe)
								{
								}
								
								if ( iLine == iOneLineNumber )
								{
									// Matched..
									//System.out.println("(Matched)iOneLineNumber: "+iOneLineNumber);
									iSelectedLine = iOneLineNumber;
									bLineMatched = true;
									bLineSelected = true;	// Set selected..
									break;
								}
								else
								{
									if ( iLine > iOneLineNumber )
									{
										// Not in array..
										break;
									}
								}
							}
						}	// End for..
						
						//System.out.println("Dropped out");
					}
				}
				else
				{
					// Check if selected, actual, line is in LineTable..
					if ( (LineTableAr != null) && (LineTableAr.size() > 0) )
					{
						for ( int iG = 0; iG < LineTableAr.size(); iG++ )
						{
							lineTableInfo = (LineTableInfo)LineTableAr.get(iG);
							
							if ( lineTableInfo.iLineNumber == iActualLineNumber )
							{
								// !! Note:
								//
								// The 'iSelectedLine' needs to be the actual
								// line number, so it can look for a match in the LineTable
								// to get the LineCodeIndex..
								iSelectedLine = iActualLineNumber;
								bLineMatched = true;
								bLineSelected = true;
								break;
							}
						}
					}
				}
				
				bDoLineSelect = true;

				//System.out.println("bLineMatched: "+bLineMatched);				
				if ( bLineMatched )
				{
					// Check if line has a Breakpoint set..
					BreakpointInfo breakpointInfo;
					int iBLen;
					//int iLoc2;
					int iLine = 0;
					String sT;
/*					
					if ( BreakpointAr == null )
						System.out.println("BreakpointAr null");
					else
						System.out.println("BreakpointAr.size(): "+BreakpointAr.size());
/**/					
					
					if ( (BreakpointAr != null) && (BreakpointAr.size() > 0) )
					{
						iBLen = BreakpointAr.size();
Break_Out:
						for ( int iB = 0; iB < iBLen; iB++ )
						{
							//System.out.println("------------------------------");
							breakpointInfo = (BreakpointInfo)BreakpointAr.get(iB);
							
							lMethodID = breakpointInfo.lMethodId;
							lBpLineIndex = breakpointInfo.lLineCodeIndex;
							iRequestId = breakpointInfo.iRequestId;
							sBreakpointId = breakpointInfo.sBreakpointId;
							//System.out.println("sBreakpointId: '"+sBreakpointId+"'");
							
							iLineNumber = breakpointInfo.iLineNumber;	// Used by Flutter
							//System.out.println("iLineNumber: "+iLineNumber);
							
							//sScriptId = breakpointInfo.sScriptId;
							sTScript = breakpointInfo.sScriptId;
							//System.out.println("sTScript: '"+sTScript+"'");
							

							if ( bFlutterSelected )
							{
								if ( (sTokenPosTableAr != null) && (sTokenPosTableAr.length > 0) )
								{
									for ( int iZ = 0; iZ < sTokenPosTableAr.length; iZ++ )
									{
										sT = sTokenPosTableAr[iZ];
										
										iLoc2 = sT.indexOf(",");
										if ( iLoc2 != -1 )
										{
											sT = sT.substring(0, iLoc2);
											
											try
											{
												iLine = Integer.parseInt(sT);
												//System.out.println("iLine: "+iLine);
											}
											catch (NumberFormatException nfe)
											{
											}
										}
										
										if ( iLineNumber == iOneLineNumber )
										{
											bLineSelected = false;	// Reset selection..
											
											//System.out.println("--MATCHED--");
											int iChoice = JOptionPane.showConfirmDialog(
												frame,
												(String)"Clear Breakpoint?",
												"Breakpoint",
												(int)JOptionPane.YES_NO_OPTION);
	
											if ( iChoice == JOptionPane.YES_OPTION )
											{
												//System.out.println("Doing removeBreakpoint");
												
												try
												{
													//
													// removeBreakpoint
													//
													
													requestLatch = new CountDownLatch(1);
															
													ParamAr = new ArrayList();
													ParamAr.add((String)Utils.filterObject(sIsolateId));
													ParamAr.add((String)Utils.filterObject(sBreakpointId));
													
													String[] getAddBreakpointMsg = {
														"method", "removeBreakpoint",
														"params",
														"isolateId", "[]",
														"breakpointId", "[]",
														"}"};
											
													String sReq = ConstructMessage(getAddBreakpointMsg);
													websocket = webSocketObject.getWebSocket();
													websocket.send(sReq);
													
													try
													{
														requestLatch.await();
													}
													catch (InterruptedException ie)
													{
													}
													
													// Remove entry in ArrayList..
													BreakpointAr.remove(iB);
													
													// Refresh..
													bDoLineSelect = false;
													
													//System.out.println("==At D==");
													updateSourceLines((long)0);

												}
												catch (WebSocketException wse)
												{
													wse.printStackTrace();
												}
											}
											
											break Break_Out;
										}
									}	// End for..
								}
							}
							else
							{
							
								if ( (LineTableAr != null) && (LineTableAr.size() > 0) )
								{
									int iLLen = LineTableAr.size();
									for ( int iL = 0; iL < iLLen; iL++ )
									{
										lineTableInfo = (LineTableInfo)LineTableAr.get(iL);
										lLnCodeIndex = lineTableInfo.lLineCodeIndex;
										iLineTableLineNumber = lineTableInfo.iLineNumber;
										
										if ( (breakpointInfo.iLineNumber == iActualLineNumber) &&
											(breakpointInfo.lMethodId == lMethodSelection) )
										{
											// Matched..
											int iChoice = JOptionPane.showConfirmDialog(
												frame,
												(String)"Clear Breakpoint?",
												"Breakpoint",
												(int)JOptionPane.YES_NO_OPTION);
	
											if ( iChoice == JOptionPane.YES_OPTION )
											{
												// Clear Breakpoint..
												JDWPCommands.command_Clear(
													(byte)Constants.EVENT_KIND_BREAKPOINT,
													iRequestId);
												
												// Remove entry in ArrayList..
												BreakpointAr.remove(iB);
	
												// Refresh..
												bDoLineSelect = false;
												
												updateSourceLines(lBreakpointLocationIndex);
												
												break Break_Out;
											}
											else if ( iChoice == JOptionPane.NO_OPTION )
											{
												bDoLineSelect = false;
												break Break_Out;
											}
										}
									}	// End for..
								}
							}
						}	// End for..
					}

					//
					// Normal line selection highlight..
					//
					
					if ( (BreakpointAr != null) && (BreakpointAr.size() > 0) )
					{
						for ( int iX = 0; iX < BreakpointAr.size(); iX++ )
						{
							//System.out.println("----------------");
							breakpointInfo = (BreakpointInfo)BreakpointAr.get(iX);
							//sT3 = breakpointInfo.sScriptId;
							//System.out.println("breakpointInfo.sScriptId: '"+breakpointInfo.sScriptId+"'");
							//iLn = breakpointInfo.iLineNumber;
							//System.out.println("breakpointInfo.iLineNumber: "+breakpointInfo.iLineNumber);
							//System.out.println("iOneLineNumber: "+iOneLineNumber);
							
							if ( iOneLineNumber == breakpointInfo.iLineNumber )
							{
								//System.out.println("Breakpoint line matches");
								bDoLineSelect = false;
								break;
							}
						}
					}
					
					
					//System.out.println("------ Normal line selection ------");

					//System.out.println("bDoLineSelect: "+bDoLineSelect);					
					if ( bDoLineSelect )
					{
						//System.out.println("Drawing line select");
						Rectangle rect = jTextArea.modelToView(iOffset);
						
						int iRow = jTextArea.viewToModel(new Point(0, rect.y));
						int iEndRow = jTextArea.viewToModel(new Point(jTextArea.getWidth(), rect.y));
						//System.out.println("iRow: "+iRow+"  iEndRow: "+iEndRow);
						
						//System.out.println("bDoLineSelect: "+bDoLineSelect);
						//if ( bDoLineSelect )
						//{
							jTextArea.select(iRow, iEndRow);
						//}
					}
				}
				
			}
			catch (BadLocationException ble)
			{
				ble.printStackTrace();
			}
			
			//System.out.println("Exiting mouseListener");
		}
	};	//}}}

	//{{{	TreeSelectionListener  Variable JTree
	TreeSelectionListener variableSelectionListener = new TreeSelectionListener()
	{
		public void valueChanged(TreeSelectionEvent e)
		{
			//System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			//System.out.println("(Variable JTree)TreeSelectionListener valueChanged()");
			
			TreePath treePath = e.getPath();
			int iIndex;
			StringBuffer sB;
			String sNodeName = "";

			// Note:
			// This will basically tell you what "column"
			// the selected node is in.

			// If selecting from the "first column"
			// it will return '2'.
			
			// If selecting from the "second column"
			// it will return '3'.	
			
			iPathCount = treePath.getPathCount();
			//System.out.println("iPathCount: "+iPathCount);
			
			
			NodeFVInfo nodeFVInfo;
			DefaultMutableTreeNode nodeSel = (DefaultMutableTreeNode)e.getPath().getLastPathComponent();

/*			
			if ( nodeSel == null )
				System.out.println("nodeSel null");
			else
				System.out.println("nodeSel not null");
/**/

		 // [0]:
		 // [1]: time:  DateTime
		 // [2]: timeZoneOffset:  Duration

		 	String sT = "";
		 	int iLoc2;
			TreeNode[] tNode = nodeSel.getPath();
			
			//for ( int iJ = 0; iJ < tNode.length; iJ++ )
				//System.out.println("["+iJ+"]: "+tNode[iJ]);
			
			if ( iPathCount > 2 )
			{
				// Nested Class, so get parent..
				
				iIndex = tNode.length - 1;
				iIndex--;
				
				if ( iIndex < 0 )
					iIndex = 0;
				//System.out.println("iIndex: "+iIndex);

				// Like: '[1]:  PlanetWidget'				
				sT = tNode[iIndex].toString();
				//System.out.println("sT: '"+sT+"'");
				iLoc2 = sT.indexOf(":");
				if ( iLoc2 != -1 )
				{
					// Get:
					// [1]:  PlanetWidget
					//       ^
					
					if ( sT.charAt(0) == '[' )
						sParentClassName = sT.substring(iLoc2 + 1);
					else
						sParentClassName = sT.substring(0, iLoc2);
						
					sParentClassName = sParentClassName.trim();
					//System.out.println("sParentClassName: '"+sParentClassName+"'");
				}
			}
			


/*
			System.out.println("(getChildCount()): "+nodeSel.getChildCount());
			System.out.println("(getDepth()): "+nodeSel.getDepth());
			System.out.println("(getLeafCount()): "+nodeSel.getLeafCount());
			System.out.println("(getLevel()): "+nodeSel.getLevel());
			System.out.println("(getSiblingCount()): "+nodeSel.getSiblingCount());
/**/

			Object nodeObject = nodeSel.getUserObject();
			nodeFVInfo = (NodeFVInfo)nodeObject;
			
			//System.out.println("(Selected)nodeFVInfo.sName: '"+nodeFVInfo.sName+"'");
			//System.out.println("(Selected)nodeFVInfo.sClassName: '"+nodeFVInfo.sClassName+"'");
			//System.out.println("(Selected)nodeFVInfo.sDisplayClassName: '"+nodeFVInfo.sDisplayClassName+"'");
			//System.out.println("(Selected)nodeFVInfo.sClassId: '"+nodeFVInfo.sClassId+"'");
			//System.out.println("(Selected)nodeFVInfo.sObjectId: '"+nodeFVInfo.sObjectId+"'");
			//System.out.println("(Selected)nodeFVInfo.bIsClass: "+nodeFVInfo.bIsClass);
			
			sOrgSelected = nodeFVInfo.sName;
			sOrgClassId = nodeFVInfo.sClassId;
			sOrgObjectId = nodeFVInfo.sObjectId;
			
			sTreeSelectionName = nodeFVInfo.sName;
			//System.out.println("sTreeSelectionName: '"+sTreeSelectionName+"'");	

			// Try to add to SelectedNodesLHm..			
			if ( nodeFVInfo.sName.charAt(0) == '[' )
			{
				// Construct new name, like: '[1].children' 
				sB = new StringBuffer();
				sB.append(nodeFVInfo.sName);
				sB.append(".");
				sB.append(sParentClassName);
				sNodeName = sB.toString();
			}
			else
			{
				sNodeName = nodeFVInfo.sName;
			}
			
			//System.out.println("sNodeName: '"+sNodeName+"'");
			SelectedNodesLHm.put((String)sNodeName, (NodeFVInfo)nodeFVInfo);
			
			bVariableNodeSelected = true;

			currentNode = nodeSel;	// Set up for UpdateVariableJTreeBgThread..


			
			//System.out.println("In variableSelectionListener");
			//updateVariableJTreeBgThread = new UpdateVariableJTreeBgThread();
			//updateVariableJTreeBgThread.start();

			// Only expand Classes or List..			
			if ( (nodeFVInfo.bIsClass) || (nodeFVInfo.sClassName.equals("List")) )
			{
				expandBgThread = new ExpandBgThread();
				expandBgThread.start();
			}

		}
	};	//}}}
			
	//{{{	TreeSelectionListener  Source JTree
	TreeSelectionListener treeSelectionListener = new TreeSelectionListener()
	{
		public void valueChanged(TreeSelectionEvent e)
		{
			//System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			//System.out.println("(Source JTree)TreeSelectionListener valueChanged()");
			
			DefaultMutableTreeNode parentNode = null;
			TabInfo tabInfo;
			//int iExpandRow;
			
			// Note:
			// Moving this here seemed to fix it,
			// was getting trashed before..
			long lMethodId = 0;
			
			// Note:
			// We can also get an event when
			// the tree selection is removed,
			// in which case a Class or Method was
			// not selected, so we don't want to do anything..

			// Returns true if the first path element has been added to the selection,
			// a return value of false means the first path has been removed from the selection. 			
			boolean bIsAdded = e.isAddedPath();
			if ( bIsAdded == false )
				return;

			TreePath parentPath = jTree.getSelectionPath();
			
/*			
			if ( parentPath == null )
				System.out.println("parentPath null");
			else
				System.out.println("parentPath not null");
/**/


			DefaultMutableTreeNode nodeX = (DefaultMutableTreeNode)e.getPath().getLastPathComponent();

/*			
			if ( nodeX == null )
				System.out.println("nodeX null");
			else
				System.out.println("nodeX not null");
/**/
			// Reset..
			bIsBreakpointStepEvent = false;
			
			Object nodeObject = nodeX.getUserObject();
			
			//System.out.println("nodeObject: "+nodeObject);
			NodeInfo nInfo = (NodeInfo)nodeX.getUserObject();
			
/*
			if ( nInfo == null )
				System.out.println("nInfo null");
			else
				System.out.println("nInfo not null");
/**/
			
			//System.out.println("nInfo.lId: "+nInfo.getId());
			//System.out.println("nInfo.sName: '"+nInfo.getName()+"'");		// Like:  'main.dart'
			//System.out.println("nInfo.bIsClass: "+nInfo.getIsClass());
			
			boolean bIsClass = nInfo.getIsClass();
			
			long lRefTypeId = 0;
			long lClassId = 0;
			int iArIndex = (int)nInfo.getId();
			int iLevel;
			int iLoc2;
			String sSourceFilePath = "";
			boolean bDoTab = false;
			boolean bMatched;
			

			//System.out.println("bIsClass: "+bIsClass);			
			if ( bIsClass )
			{
				//System.out.println("Selected Class");
				iLevel = 3;
				jTree.expandRow(iLevel);
				
				// Selected Class..
				parentNode = (DefaultMutableTreeNode)parentPath.getLastPathComponent();

				NodeInfo nodeInfo;
				Object object = parentNode.getUserObject();
				nodeInfo = (NodeInfo)object;
				lRefTypeId = nodeInfo.getId();
				bIsClass = nodeInfo.getIsClass();
					
				JDWPCommands.command_MethodsWithGeneric(lRefTypeId);
	
				MethodInfo methodInfo;
				int iLen;
				int iJ;
				DefaultMutableTreeNode child;
/*				
				if ( AllMethodsAr == null )
					System.out.println("AllMethodsAr null");
				else
					System.out.println("AllMethodsAr.size(): "+AllMethodsAr.size());
/**/				
				if ( (AllMethodsAr != null) && (AllMethodsAr.size() > 0) )
				{
					iLen = AllMethodsAr.size();
					for ( iJ = 0; iJ < iLen; iJ++ )
					{
						methodInfo = new MethodInfo();
						methodInfo = (MethodInfo)AllMethodsAr.get(iJ);
							
						// Don't include '<clinit>' or '<init>'..						
						if ( (methodInfo.sName.equals("<clinit>")) ||
								(methodInfo.sName.equals("<init>")) )
							continue;
							
						if ( methodInfo.iModBits == 256 )
							continue;

						// Skip some single line Methods which
						// can cause command_LineTable() to get a
						// connection Exception and cause a disconnect..
						if ( methodInfo.iModBits == 1281 )
							continue;
						
						// Also block 'enum' (methodInfo.iModBits = 9)
						if ( (methodInfo.iModBits != 4104) && (methodInfo.iModBits != 9) &&
							(! (methodInfo.sName).startsWith("access$")) )
						{
							child = new DefaultMutableTreeNode(
								//new NodeInfo(methodInfo.lMethodId, methodInfo.sName, false));
								new NodeInfo(methodInfo.lMethodId, "", methodInfo.sName, false));
			
							((DefaultTreeModel)jTree.getModel()).
							insertNodeInto(
								child,		// new Child
								parentNode,	// parent
								parentNode.getChildCount());	// index
						}
					}
				}
			}
			else
			{
				//System.out.println("\ntreeSelectionListener, in else");
				//System.out.println("Selected Method");
				// Selected Method..
				
				if  ( bFlutterSelected )
				{
					//System.out.println("In bFlutterSelected");

					// Differentiate between directory and file selection..					
					iLoc2 = nInfo.sName.indexOf(".dart");	// Like: 'main.dart'
					if ( iLoc2 != -1 )
					{
						// Source file selected..
						//System.out.println("Source file selected");
						
						// Grab full file path..
						bTabSelected = false;	// Tab Panel Selected
						bLineSelected = false;
	
						// Note:
						// The array index is already
						// set to the correct location..
						
						//System.out.println("(getId())iArIndex: "+iArIndex);		
						
						// Like: 'C:\Android\Dev\planets-master\lib\main.dart'
						sSourceFilePath = nInfo.getFullPath();
/*						
						if ( sSourceFilePath == null )
							System.out.println("sSourceFilePath null");
						else
							System.out.println("sSourceFilePath: '"+sSourceFilePath+"'");
/**/								
								
						if ( (sSourceFilePath != null) && (sSourceFilePath.length() > 0) )
						{
							//System.out.println("sSourceFilePath: '"+sSourceFilePath+"'");
/*							
							if ( TabInfoAr == null )
								System.out.println("TabInfoAr null");
							else
								System.out.println("TabInfoAr.size(): "+TabInfoAr.size());
/**/							
							
							// Check for dup..
							if ( (TabInfoAr != null) && (TabInfoAr.size() > 0) )
							{
								bMatched = false;
								for ( int iZ = 0; iZ < TabInfoAr.size(); iZ++ )
								{
									tabInfo = (TabInfo)TabInfoAr.get(iZ);
									if ( (tabInfo.sSourcePath != null) && (tabInfo.sSourcePath.length() > 0) )
									{
										//if ( tabInfo.sSourcePath.equals(sSourceFilePath) )
										if ( sSourceFilePath.equals(tabInfo.sSourcePath) )
										{
											bMatched = true;
											break;
										}
									}
								}
								
								if ( bMatched == false )
									bDoTab = true;
							}
						}
					}
				}
				else
				{
	
					ClassMethodInfo classMethodInfo;
/*					
					if ( ClassMethodAr == null )
						System.out.println("ClassMethodAr null");
					else
						System.out.println("ClassMethodAr.size(): "+ClassMethodAr.size());
/**/

/*
					if ( ClassMethodAr != null )
					{
						for ( int g = 0; g < ClassMethodAr.size(); g++ )
						{
							classMethodInfo = (ClassMethodInfo)ClassMethodAr.get(g);
							System.out.println("----------------------------");
							System.out.println("(lClassId): "+classMethodInfo.lClassId);
							System.out.println("(lMethodId): "+classMethodInfo.lMethodId);
							System.out.println("(sMethodName): '"+classMethodInfo.sMethodName+"'");
							System.out.println("(sSourcePath): '"+classMethodInfo.sSourcePath+"'");
						}
						System.out.println();
					}
/**/				
	
					//System.out.println("Setting bTabSelected to false");
					bTabSelected = false;	// Tab Panel Selected
					bLineSelected = false;
	
					// Get ClassId from parent..				
					DefaultMutableTreeNode pNode = (DefaultMutableTreeNode)(nodeX.getParent());				
	
					NodeInfo nodeInfo;
					Object object = pNode.getUserObject();
					nodeInfo = (NodeInfo)object;
					lClassId = nodeInfo.getId();
					//System.out.println("lClassId: "+lClassId);
					currentClassId = lClassId;		// Save for breakpoint info..
	
					// Get Method info..
					String sMethodName = nInfo.getName();
					//System.out.println("sMethodName: '"+sMethodName+"'");
					lMethodId = nInfo.getId();
					//System.out.println("lMethodId: "+lMethodId);
					bDoTab = true;	// Do Tab by default
					
					// Check for duplicate..
					if ( ClassMethodAr != null )
					{
						int iG;
						bMatched = false;
						for ( iG = 0; iG < ClassMethodAr.size(); iG++ )
						{
							//System.out.println("--TOP-- iG: "+iG);
							classMethodInfo = (ClassMethodInfo)ClassMethodAr.get(iG);
							//System.out.println("classMethodInfo.lMethodId: '"+classMethodInfo.lMethodId);
							
							if ( classMethodInfo.lMethodId == lMethodId )
							{
								// Method matched..
								//System.out.println("(Duplicate) --Matched--");
								iMethodIndex = iG;
								//System.out.println("(Set)iMethodIndex: "+iMethodIndex);
								bDoTab = false;		// Don't do Tab..
								break;
							}
						}
					}
				}

				//System.out.println("bDoTab: "+bDoTab);				
				if ( bDoTab )
				{
					if  ( bFlutterSelected )
					{
/*
						if ( sSourceFilePath == null )
							System.out.println("sSourceFilePath null");
						else
							System.out.println("sSourceFilePath: '"+sSourceFilePath+"'");
/**/							
						updateSource(sSourceFilePath);
						
					}
					else
					{
						lMethodSelection = lMethodId;
						lCurrentSelectedMethod = lMethodId;
						
						//System.out.println("(Before)lMethodId: "+lMethodId);
	
						updateSource(lClassId, lMethodId);
					}
				}
				else
				{
					// Select Tab..
					int iSelIndex = 0;
					
					//System.out.println("(setSelectedIndex())iMethodIndex: "+iMethodIndex);
					tabbedPane.setSelectedIndex(iMethodIndex);
					
				}

				// For Flutter, try to load
				// lengthy SetLibraryDebuggable after source is selected and loaded..
				if ( (bFlutterSelected) && (bFlutterSetLibraryDebuggableStarted == false) )
				{
/*
					libraryTimingBgThread = new LibraryTimingBgThread();
					libraryTimingBgThread.start();
/**/
				}
			}
		}
	};	//}}}
	
	//{{{	ItemListener    projectItemListener
	private ItemListener projectItemListener = new ItemListener()
	{
		public void itemStateChanged(ItemEvent e)
		{
			//System.out.println("itemStateChanged()");
			int iState = e.getStateChange();
			//Object obj = e.getItem();
			JRadioButton radioButton = (JRadioButton)e.getSource();
			String sObj = radioButton.getText();
			sObj = sObj.trim();
			//System.out.println("sObj: '"+sObj+"'");
			
			if ( (sObj.equals("Lib-Project")) && (iState == ItemEvent.SELECTED ) )
			{
				if ( iProjectDialog == UPDATE_DIALOG )
				{
					libraryPathLbl.setEnabled(false);
					libraryPathField.setEnabled(false);
					libraryChooseButton.setEnabled(false);
					subprojectsCheckBox.setEnabled(false);
				}
				else if ( iProjectDialog == CREATE_DIALOG )
				{
					activityLbl.setEnabled(false);
					activityField.setEnabled(false);
				}
			}
			else
			{
				if ( iProjectDialog == UPDATE_DIALOG )
				{
					libraryPathLbl.setEnabled(true);
					libraryPathField.setEnabled(true);
					libraryChooseButton.setEnabled(true);
					subprojectsCheckBox.setEnabled(true);
				}
				else if ( iProjectDialog == CREATE_DIALOG )
				{
					activityLbl.setEnabled(true);
					activityField.setEnabled(true);
				}
			}
			
			if ( iProjectDialog == UPDATE_DIALOG )
				updateFrame.validate();
			else if ( iProjectDialog == CREATE_DIALOG )
				createFrame.validate();
		}
	};	//}}}
	
	//{{{	ItemListener	'Use Gradle' 'Use Flutter', 'Use Kotlin', & 'Use NDK' 
	/**
     * Listen for changes to 'Use Gradle', 'Use Flutter', 'Use Kotlin', 'Use NDK'
     */
	private ItemListener itemListener = new ItemListener()
	{
		public void itemStateChanged(ItemEvent e)
		{
			//System.out.println("itemStateChanged()");

			int iState = e.getStateChange();
			String textS = "";
			
			Object obj = e.getItem();
			if ( obj instanceof JMenuItem )
			{
				JMenuItem menuItem = (JMenuItem)e.getSource();
				textS = menuItem.getText();
/*				
				if ( textS == null )
					System.out.println("textS null");
				else
					System.out.println("textS: '"+textS+"'");
/**/
			}

			if ( textS.equals("Use NDK") )
			{
				if ( iState == ItemEvent.SELECTED )
				{
					bNDKSelected = true;
					
					if ( (statusLabel != null) && (bHomeJustSet == false) )
						statusLabel.setText(" ");
					
					// Unselect 'Use Gradle'..
					if ( uGradleMenuItem != null )
						uGradleMenuItem.setSelected(false);

					// Unselect 'Use Kotlin'..
					if ( uKotlinMenuItem != null )
						uKotlinMenuItem.setSelected(false);

					// Unselect 'Use Flutter'..
					if ( uFlutterMenuItem != null )
						uFlutterMenuItem.setSelected(false);
					
					if ( updateMenuItem != null )
						updateMenuItem.setVisible(false);
					
					// Hide Flutter buttons..
					if ( runButton != null )
						runButton.setVisible(false);
					
					if ( reloadButton != null )
						reloadButton.setVisible(false);

					// Set 'Debug' Button to 'Build'..					
					debugButton.setIcon(build24Icon);
					debugButton.setToolTipText("Build");
					
					releaseButton.setVisible(false);	// Disable..
				}
				else if ( iState == ItemEvent.DESELECTED )
				{
					bNDKSelected = false;
					
					// Restore 'Debug' Button..
					debugButton.setIcon(debug24Icon);
					debugButton.setToolTipText("Debug");
					
					releaseButton.setVisible(true);	// Enable..
				}
			}
			else if ( textS.equals("Use Gradle") )
			{
				if ( iState == ItemEvent.SELECTED )
				{
					bGradleSelected = true;
					
					if ( (bFlutterSelected == false) && (bKotlinSelected == false) )
					{
						if ( (statusLabel != null) && (bHomeJustSet == false) )
							statusLabel.setText(" ");
						
						// Hide Flutter buttons..
						if ( runButton != null )
							runButton.setVisible(false);
						
						if ( reloadButton != null )
							reloadButton.setVisible(false);
					}

					if ( updateMenuItem != null )
						updateMenuItem.setVisible(false);
					
					// Unselect 'Use NDK'..
					if ( bNDKSelected )
					{
						if ( uNDKMenuItem != null )
							uNDKMenuItem.setSelected(false);

						// Restore 'Debug' Button..
						debugButton.setIcon(debug24Icon);
						debugButton.setToolTipText("Debug");
						
						releaseButton.setVisible(true);	// Enable..
					}
				}
				else if ( iState == ItemEvent.DESELECTED )
				{
					bGradleSelected = false;

					if ( (bFlutterSelected == false) && (bKotlinSelected == false) )
					{
						if ( updateMenuItem != null )
							updateMenuItem.setVisible(true);
					}
				}
			}
			else if ( textS.equals("Use Flutter") )
			{
				if ( iState == ItemEvent.SELECTED )
				{
					bFlutterSelected = true;
					
					RefreshProperties();
					
					if ( (statusLabel != null) && (bHomeJustSet == false) )
						statusLabel.setText(" ");

					// Unselect 'Use NDK'..
					if ( bNDKSelected )
					{
						if ( uNDKMenuItem != null )
							uNDKMenuItem.setSelected(false);

						// Restore 'Debug' Button..
						debugButton.setIcon(debug24Icon);
						debugButton.setToolTipText("Debug");
						
						releaseButton.setVisible(true);	// Enable..
					}
					
					if ( updateMenuItem != null )
						updateMenuItem.setVisible(false);

					// Unselect 					
					if ( uKotlinMenuItem != null )
						uKotlinMenuItem.setSelected(false);

					// Select 'Use Gradle'..
					if ( uGradleMenuItem != null )
						uGradleMenuItem.setSelected(true);

					// Show Flutter buttons..					
					if ( runButton != null )
						runButton.setVisible(true);
					
					if ( reloadButton != null )
					{
						reloadButton.setVisible(true);
						if ( (sRunBuildType != null) && (sRunBuildType.length() > 0) )
						{
							if ( sRunBuildType.equals("debug") )
								reloadButton.setEnabled(true);
							else
								reloadButton.setEnabled(false);
						}
					}
					
				}
				else if ( iState == ItemEvent.DESELECTED )
				{
					bFlutterSelected = false;
					
					// Unselect 'Use Gradle'..
					if ( uGradleMenuItem != null )
						uGradleMenuItem.setSelected(false);
					
					// Hide Flutter buttons..
					if ( runButton != null )
						runButton.setVisible(false);
					
					if ( reloadButton != null )
						reloadButton.setVisible(false);
				}
			}
			else if ( textS.equals("Use Kotlin") )
			{
				if ( iState == ItemEvent.SELECTED )
				{
					bKotlinSelected = true;
					
					if ( (statusLabel != null) && (bHomeJustSet == false) )
						statusLabel.setText(" ");
					
					if ( updateMenuItem != null )
						updateMenuItem.setVisible(false);
					
					// Hide Flutter buttons..
					if ( runButton != null )
						runButton.setVisible(false);
					
					if ( reloadButton != null )
						reloadButton.setVisible(false);
					
					// Unselect 'Use NDK'..
					if ( bNDKSelected )
					{
						if ( uNDKMenuItem != null )
							uNDKMenuItem.setSelected(false);

						// Restore 'Debug' Button..
						debugButton.setIcon(debug24Icon);
						debugButton.setToolTipText("Debug");
						
						releaseButton.setVisible(true);	// Enable..
					}
					
					// Unselect 'Use Flutter'..
					if ( uFlutterMenuItem != null )
						uFlutterMenuItem.setSelected(false);
					
					// Select 'Use Gradle'..
					if ( uGradleMenuItem != null )
						uGradleMenuItem.setSelected(true);
				}
				else if ( iState == ItemEvent.DESELECTED )
				{
					bKotlinSelected = false;
					
					// Unselect 'Use Gradle'..
					if ( uGradleMenuItem != null )
						uGradleMenuItem.setSelected(false);
				}
			}

			updateStorage();
			
		}
	};	//}}}

	//{{{	ItemListener windowItemListener  'Build'  'Debug'   
	/**
     * Listen for changes to Window 'Build', 'Debug'
     */
	private ItemListener windowItemListener = new ItemListener()
	{
		public void itemStateChanged(ItemEvent e)
		{
			int iState = e.getStateChange();
			String textS = "";
			Object obj = e.getItem();
			if ( obj instanceof JRadioButtonMenuItem )
			{
				JRadioButtonMenuItem radioMenuItem = (JRadioButtonMenuItem)e.getSource();
				textS = radioMenuItem.getText();
			}

			if ( textS.equals("Build") )
			{
				if ( iState == ItemEvent.SELECTED )
				{
					cardLayout.show(cardPanel, (String)"BUILD_CARD");
					iCardShowing = BUILD_CARD;
					
					// Clear status..
					statusPath.setText(" ");
				}
			}
			else if ( textS.equals("Debug") )
			{
				//System.out.println("\nwindowItemListener Debug");
				if ( iState == ItemEvent.SELECTED )
				{
					boolean bShowDebug = true;

					if ( bFlutterSelected )
					{
						// Check if Run has been hit..
						//System.out.println("bRunSelected: "+bRunSelected);
						if ( bRunSelected )
						{
							while ( true )
							{
								if ( bHaveWsUri )
									break;
								
								try
								{
									Thread.sleep(250);
								}
								catch (InterruptedException ie)
								{
								}
							}


							
							//if ( bDebugRan == false )
								DebugInit();
								
						}
						else
							bShowDebug = false;
					}
					
/*					
					if ( projectHomeS == null )
						System.out.println("projectHomeS null");
					else
						System.out.println("projectHomeS: '"+projectHomeS+"'");
/**/							
					// Check for Project->Home..
					if ( (projectHomeS != null) && (projectHomeS.length() > 0) )
						;
					else
					{
						// Put up Dialog..
						JOptionPane.showMessageDialog(
							frame,
							"Please set Project Home.",
							"Project Home",
							JOptionPane.WARNING_MESSAGE);
		
						// Reset..
						buildMenuItem.setSelected(true);
						bShowDebug = false;
					}

					//System.out.println("bShowDebug: "+bShowDebug);
					if ( bShowDebug )
					{
						cardLayout.show(cardPanel, (String)"DEBUG_CARD");
						iCardShowing = DEBUG_CARD;
						bIsCleanDebug = false;
						
						// Clear JList..		
						jListVariableVector.clear();
						jList.setListData(jListVariableVector);

						// Clear JTree..						
						DefaultMutableTreeNode root = null;
						DefaultTreeModel model = (DefaultTreeModel)jTree.getModel();
						root = (DefaultMutableTreeNode)model.getRoot();
						root.removeAllChildren();
						model.reload();
						
						int iTCnt;
						Component component;
						
						// Clear Tabs..
						// Reset..
						//bClearTabs = false;

						if ( tabbedPane != null )
						{
							iTCnt = tabbedPane.getTabCount();
							//System.out.println("(getTabCount())iTCnt: "+iTCnt);
							
							// If Tab title is empty don't do anything..
							if ( iTCnt == 1 )
							{
								// Get Title..
								String sTabTitle = tabbedPane.getTitleAt(0);

								if ( (sTabTitle != null) && (sTabTitle.equals("")) )
								{
									// Detected empty Tab..
									;
								}
							}
							else
							{
								//System.out.println("\nClearing Tabs");
								
								for ( int j = 0; j < iTCnt; j++ )
								{
									// Signal that we are doing a remove()..
									bHitClose = true;
									
									//System.out.println("remove(0)");
									tabbedPane.remove(0);
								}
								
								//TabTextAreaAr = new ArrayList();
								TabInfoAr = new ArrayList();
								
								if ( bFlutterSelected == false )
									ClassMethodAr = new ArrayList();
								
								// Reset so we can get Tab created..
								bTabSelected = false;
								
								// Create our new default Tab..
								addTab("    ");

								if ( bFlutterSelected == false )
								{
									// Set up ClassMethodInfo..
									ClassMethodInfo classMethodInfo = new ClassMethodInfo();
									classMethodInfo.lClassId = 0;
									classMethodInfo.lMethodId = 0;
									classMethodInfo.sMethodName = "";
									classMethodInfo.sSourcePath = "";
									classMethodInfo.jScrollPane = tabScrollPane;
	
									//System.out.println("\n(ADD)ItemListener build debug");									
									ClassMethodAr.add((ClassMethodInfo)classMethodInfo);
								}

								// Reset so default Tab will be removed..									
								iTabLevel = 0;
								
								// Set default Tab showing..
								bDefaultTabShowing = true;

							}
						}

						bIsDebug = true;						
						showProgressTask = new ShowProgressTask();
						showProgressTask.execute();
					}
				}
			}
		}
	};	//}}}

	//{{{	ChangeListener tabChangeListener
	private ChangeListener tabChangeListener = new ChangeListener()
	{
		public void stateChanged(ChangeEvent changeEvent)
		{
			// A Tab was created..
			// A Tab was selected..
			// A Tab was removed..
			
			//System.out.println("\n***************************");
			//System.out.println("tabChangeListener stateChanged()");
			
			
			ClassMethodInfo classMethodInfo;
			TabInfo tabInfo;
			int iIndex;
			
			// Signal that we got the event..			
			bGotStateChanged = true;
			
			boolean bIsRemove = false;
			
			// Reset..
			bIsBreakpointStepEvent = false;
			
			// javax.swing.JTabbedPane
			JTabbedPane pane = (JTabbedPane)changeEvent.getSource();

			// Returns -1 if there is no currently selected tab			
			iSelectedIndex = pane.getSelectedIndex();
			//System.out.println("iSelectedIndex: "+iSelectedIndex);
			
/*			
			if ( TabInfoAr != null )
			{
				for ( int iJ = 0; iJ < TabInfoAr.size(); iJ++ )
				{
					tabInfo = (TabInfo)TabInfoAr.get(iJ);
					System.out.println("--------------------------------");
					System.out.println("sScriptId: '"+tabInfo.sScriptId+"'");
					System.out.println("sSourcePath: '"+tabInfo.sSourcePath+"'");
				}
			}
/**/			
			
			
			int iTabCount = pane.getTabCount();

			if ( bDidAddTab )
			{
				// An Event has come through
				// and we did an addTab()
				// so try to flag this as Tab created..
				bTabCreated = true;
			}
			
			// Reset..
			bDidAddTab = false;


			// Sometimes bHitClose seems to get
			// set when it wasn't			
			if ( bHitClose )
			{
				// An Event has come through
				// and we had hit Close, so try to
				// flag this as a remove()..
				bIsRemove = true;
			}
			
			// Reset..
			bHitClose = false;
			
			// Set Ar index..			
			iTabArIndex = iSelectedIndex;
			
			// Adjust for Close..
			if ( bIsRemove )
			{
				bTabCreated = false;
			}
			
			if ( bTabCreated )
			{
				// Tab created..
				//System.out.println("-Tab created-");
				
			}
			else if ( bIsRemove )
			{
				// Close button was hit
				// so it should be a remove()..
				//System.out.println("-Tab remove()-");
				
			}
			else if ( iSelectedIndex != -1 )
			{
				// Tab selected..
				//System.out.println("-Tab selected-");

				bTabSelected = true;	// Tab Panel Selected
				
				if ( bFlutterSelected )
				{
					// Note:
					// It seems to not need updateSource() called
					// as the text, and tab selection, is properly updated
					
					iIndex = iSelectedIndex;
					if ( (TabInfoAr != null) && (TabInfoAr.size() > 0) )
					{
						tabInfo = (TabInfo)TabInfoAr.get(iIndex);
						String sSourcePath = tabInfo.sSourcePath;
						//System.out.println("sSourcePath: '"+sSourcePath+"'");	
						
						sSelectedScriptId = tabInfo.sScriptId;
						//System.out.println("sSelectedScriptId: '"+sSelectedScriptId+"'");
						
						//updateSource(sSourcePath);
						statusPath.setText(Utils.processPath(sSourcePath));		// Flip '\' -> '/'
					}
/**/
				}
				else
				{
					if ( (ClassMethodAr != null) && (ClassMethodAr.size() > 0) )
					{
						
/*					
						for ( int g = 0; g < ClassMethodAr.size(); g++ )
						{
							classMethodInfo = (ClassMethodInfo)ClassMethodAr.get(g);
							System.out.println("----------------------------  "+g);
							System.out.println("(lClassId): "+classMethodInfo.lClassId);
							System.out.println("(lMethodId): "+classMethodInfo.lMethodId);
							System.out.println("(sMethodName): '"+classMethodInfo.sMethodName+"'");
							System.out.println("(sSourcePath): '"+classMethodInfo.sSourcePath+"'");
							
							if ( classMethodInfo.jScrollPane == null )
								System.out.println("classMethodInfo.jScrollPane null");
							else
								System.out.println("classMethodInfo.jScrollPane not null");
						}
						System.out.println();
/**/						
						
						long lClassId;
						long lMethodId;
						
						classMethodInfo = (ClassMethodInfo)ClassMethodAr.get(iSelectedIndex);
	
						bLineSelected = false;
		
						
						lClassId = classMethodInfo.lClassId;
						if ( lClassId > 0 )
						{
							currentClassId = lClassId;		// Save for breakpoint info..
							
							// Get Method info..
							String sMethodName = classMethodInfo.sMethodName;
							//System.out.println("sMethodName: '"+sMethodName+"'");
							
							lMethodId = classMethodInfo.lMethodId;
							//System.out.println("lMethodId: "+lMethodId);
		
							lMethodSelection = lMethodId;
							lCurrentSelectedMethod = lMethodId;
							
							updateSource(lClassId, lMethodId);
							
						}
						else
						{
							statusPath.setText(" ");
						}
					}
				}
			}
			

			// Increment "Tab Level" to help indicate
			// initial one..
			iTabLevel++;

			// Reset..
			bTabCreated = false;
			
			//System.out.println("Exiting tabChangeListener");
		}
	};	//}}}
	
	//{{{	WindowListener	windowClosed()
	static WindowListener windowListener = new WindowAdapter()
	{
		public void windowClosed(WindowEvent e)
		{
			// Invoked when a window has been closed as the result of calling dispose on the window.
			System.exit(0);
		}
		
		public void windowClosing(WindowEvent e)
		{
			// Invoked when the user attempts to close the window from the window's system menu.
			Window window = e.getWindow();
			window.dispose();
			
			// Disconnect..
			try
			{
				if ( ioBgThread != null )
					ioBgThread.interrupt();

				if ( eventThread != null )
					eventThread.interrupt();
				
				if ( packetDispatcher != null )
					packetDispatcher.interrupt();
				
				SocketTransport.close();
			}
			catch (SecurityException se)
			{
			}
		}
	};	//}}}

	//{{{	ComponentListener
	ComponentListener componentListener = new ComponentAdapter()
	{
		public void componentResized(ComponentEvent e)
		{
			int iWidth = mainPanel.getWidth();
			if ( horzSplitPane != null )
			{
				horzSplitPane.setDividerLocation(iWidth / 2);
			}
		}
		
		public void componentMoved(ComponentEvent e)
		{
			Rectangle rectBounds = mainPanel.getBounds(null);
		}
		
	};	//}}}

	//{{{	JTreeClassInfo
	class JTreeClassInfo
	{
		
		String sName;	// Class name, like: 'this'
		
		String sObjectId;	// Classes objectId, like: 'objects\/112'
		
	}	//}}}

	//{{{	LibraryInfo	
	class LibraryInfo
	{
		String sLibraryId;	// Like: "libraries\/@21294743"
		
		boolean bIsPackage;
		
	}	//}}}

	//{{{	TabInfo	
	class TabInfo
	{
		JTextArea jTextArea;
		
		JScrollPane jScrollPane;
	
		// Like:
		// 'libraries\/@477433113\/scripts\/package%3Aflutter%2Fsrc%2Fwidgets%2Fvalue_listenable_builder.dart\/16f0547fbd8'
		String sScriptId;
		
		// Full source path
		String sSourcePath;
	
		// Like: '9,225,5,232,12' for each line..	
		String[] sTokenPosTable;
		
	}	//}}}

	//{{{	VariableInfo
	class VariableInfo
	{
		String sHierarchyName;	// Like: 'size~aspectRatio'
		
		String sName;	// Like: 'canvas'
		
		//String sId;		// Like: 'objects\/148'
		//String sStackObjectId;	// Like: 'objects\/41'
		String sObjectId;
		
		boolean bIsClass;
		
		String sClassId;	// Like: 'classes\/1052'
		
		String sClassName;	// Like: 'Canvas'
		
		String sDisplayClassName;	// For List display, like: 'List (3 items)'
		
		String sValueAsString;	// Like: '240.46946742441236'
		
	}	//}}}

	//{{{	NodeFVInfo
	class NodeFVInfo
	{
	
		public String sName;
		public String sClassName;
		public String sPropertyName;	// See if same as ClassName
		public String sClassId;
		public String sValueAsString;
		public String sDisplayClassName;
		public String sObjectId;
		public String sGetObjectId;
		public String sTargetId;	// For evaluate
		public boolean bIsClass;
		public boolean bUsesObject;
		//public int iArrayIndex;
	
		
		public NodeFVInfo(String sName)
		{
			this.sName = sName;
			bUsesObject = false;
			sDisplayClassName = "";
			sValueAsString = "";
			sClassName = "";
			sPropertyName = "";
			sObjectId = "";
			bIsClass = false;
		}
	
		//@Override
		public String toString()
		{
			StringBuffer sB = new StringBuffer();	

			//System.out.println("toString()");
			//System.out.println("sValueAsString: '"+sValueAsString+"'");
			//System.out.println("sDisplayClassName: '"+sDisplayClassName+"'");

			
			sB.append(sName);
			sB.append(":  ");
	
			//if ( ((sValueAsString != null) && (sValueAsString.length() > 0))
					//&& (! sValueAsString.equals("null")) )
			if ( ((sValueAsString != null) && (sValueAsString.length() > 0)) )
				sB.append(sValueAsString);
			//else if ( ((sDisplayClassName != null) && (sDisplayClassName.length() > 0))
					//&& (! sDisplayClassName.equals("null")) )
				//sB.append(sDisplayClassName);
			else
				sB.append(sClassName);
	
			return 	sB.toString();	
		}
		
	}	//}}}

	//{{{	BreakpointInfo
	class BreakpointInfo
	{
		long lClassId;
		long lMethodId;		// Actually four bytes..
		long lLineCodeIndex;
		
		int iRequestId;		// For Clear..
		
		int iLineNumber;	// For Flutter also..
		//String sDescription;
		String sMethodName;
		String sClassName;
		
		// Flutter
		String sBreakpointId;	// For 'removeBreakpoint'
		
		// Like:      'libraries\/@27117998\/scripts\/package%3Aclock_app%2Fclock%2Fhand_minute.dart\/16f513e828f'
		String sScriptId;		// Location..
	}	//}}}

	//{{{	CheckListItem
	class CheckListItem
	{
		// Represents items in the list that can be selected
		
		private String sLabel;
		private String sBreakpointId;
		private boolean isSelected;
		private int iRequestId;
		
		public CheckListItem(String sLabel)
		{
			//System.out.println("CheckListItem() constructor");
			//System.out.println("sLabel: '"+sLabel+"'");
			this.sLabel = sLabel;
			isSelected = false;
		}
		
		public boolean isSelected()
		{
			return isSelected;
		}
		
		public void setSelected(boolean isSelected)
		{
			this.isSelected = isSelected;
		}
		
		public boolean getSelected()
		{
			return isSelected;
		}

		public int getRequestId()
		{
			return iRequestId;
		}
		
		public void setRequestId(int iRequestId)
		{
			//System.out.println("setRequestId(), iRequestId: "+iRequestId);
			this.iRequestId = iRequestId;
		}
		
		public String getBreakpointId()
		{
			return sBreakpointId;
		}
		
		public void setBreakpointId(String sBreakpointId)
		{
			this.sBreakpointId = sBreakpointId;
		}
		
		public String toString()
		{
			return sLabel;
		}
	}	//}}}

	//{{{	TabTextAreaInfo
	class TabTextAreaInfo
	{
		JTextArea jTextArea;
		
		JScrollPane jScrollPane;
	}	//}}}

	//{{{	TreeClass
	class TreeClass
	{
		long lTypeId;
		String sSignature;
	}	//}}}

	//{{{	Scripts	
	class Scripts
	{
		// Like:
		// 'libraries\/@477433113\/scripts\/package%3Aflutter%2Fsrc%2Fwidgets%2Fvalue_listenable_builder.dart\/16f0547fbd8'
		String sScriptId;
	
		// Like: '9,225,5,232,12' for each line..	
		String[] sTokenPosTable;
	}	//}}}
	
	//{{{	NodeInfo	
	class NodeInfo
	{
		
		// For non-Flutter
		// this is the methodInfo.lMethodId or treeClass.lTypeId..
		protected long lId;
		
		protected String sFullPath;
		
		// For Flutter this is the name of the
		// directory or source file..
		protected String sName;
		
		protected boolean bIsClass;
	
		//public NodeInfo(long lId, String sName, boolean bIsClass)
		public NodeInfo(long lId, String sFullPath, String sName, boolean bIsClass)
		{
			this.lId = lId;
			this.sFullPath = sFullPath;
			this.sName = sName;
			this.bIsClass = bIsClass;
		}
		
		public long getId()
		{
			return lId;
		}
	
		public String getName()
		{
			return sName;
		}
		
		public String getFullPath()
		{
			return sFullPath;
		}
	
		public boolean getIsClass()
		{
			return bIsClass;
		}
		
		public String toString()
		{
			return 	sName;	
		}
	}	//}}}

	//{{{	ClassMethodInfo
	class ClassMethodInfo
	{
		long lClassId;
		long lMethodId;
		String sMethodName;
		String sSourcePath;
		JScrollPane jScrollPane;
	}	//}}}

	//{{{	EventInfo
	class EventInfo
	{
		byte bEventKind;
		byte bTypeTag;
		byte bCatchTypeTag;
		byte bRefTypeTag;
		int iRequestId;
		int iFieldId;
		int iStatus;
		long lClassId;
		long lCatchClassId;
		long lMethodId;
		long lCatchMethodId;
		long lLocationIndex;
		long lCatchLocationIndex;
		long lTaggedObjectId;
		long lTypeId;
		long lThreadId;
		String sSignature;
	}	//}}}

	//{{{	main()	
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater( new Runnable()
		{
			public void run()
			{
				aDev = new ADev();

				mainJFrame = new JFrame();
				mainJFrame.setContentPane(mainPanel);			
				mainJFrame.pack();
				mainJFrame.addWindowListener(windowListener);
				mainJFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
				mainJFrame.setVisible(true);
			}
		});
	}	//}}}
}


