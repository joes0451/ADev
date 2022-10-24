

/*
 * :folding=explicit:collapseFolds=1:
 */

	/**
	 *	  ADev is a lightweight Android development tool
	 *
	 *	  Copyright (c) 2013 - 2022 Joseph Siebenmann
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
import javax.xml.bind.DatatypeConverter;

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
import java.io.FileNotFoundException;
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
import java.util.TreeMap;
import java.util.Map.Entry;
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
import javax.swing.text.Position;
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
import javax.swing.tree.TreePath;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeNode;
import javax.swing.tree.MutableTreeNode;
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
	private JFrame keytoolFrame;
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
	private static JList countryCodesJList;
	private JList pullDialogJList;
	private static JScrollPane textScrollPane;
	private static JScrollPane tabScrollPane;
	private JScrollPane treeScrollPane;
	private JScrollPane variableTreeScrollPane;
	private JScrollPane listScrollPane;
	private JSplitPane horzSplitPane;
	private static JTabbedPane tabbedPane;
	private StyledDocument doc;
	private DefaultStyledDocument defStyledDoc;
	private Style normalStyle;
	private Style warningStyle;
	private Style errorStyle;
	private DefaultListModel defListModel;
	private static ADev aDev;
	static JList variableDialogJList;
	
	Icon build24Icon;
	Icon debug24Icon;
	static SwingWorker swingWorker;
	
	static CountDownLatch completeLatch;
	static CountDownLatch requestLatch;
	static CountDownLatch progressLatch;
	//static Object messageObject;
	
	static Queue eventQueue;
	
	static WebSocket websocket;
	static WebSocketObject webSocketObject;
	
	static volatile int iLineMode;
	static final int MODE_BREAKPOINT_ADDED = 1;
	//static final int MODE_BREAKPOINT_HIT = 2;
	static final int MODE_PAUSE_BREAKPOINT = 2;

	static volatile int iDebugCommand;
	static final int DEBUG_COMMAND_SET_BREAKPOINT = 1;
	static final int DEBUG_COMMAND_STEP = 2;
	static final int DEBUG_COMMAND_RESUME = 3;
	
	static volatile int iDebugMode;
	static final int DEBUG_RUN = 1;
	static final int DEBUG_ATTACH = 2;
	
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
	private static JCheckBoxMenuItem uSdkMenuItem;
	private static JCheckBoxMenuItem uGradleMenuItem;
	private static JCheckBoxMenuItem uKotlinMenuItem;
	private static JCheckBoxMenuItem uNDKMenuItem;
	private static JCheckBoxMenuItem uFlutterMenuItem;
	private static JMenuItem updateMenuItem;
	
	private static JTextField aliasPasswordField;
	private static JTextField keyStorePasswordField;
	private static JTextField countryCodeField;
	private static JTextField stateProvinceField;
	private static JTextField cityLocalityField;
	private static JTextField abOrganizationField;
	private static JTextField organizationUnitField;
	private static JTextField firstLastNameField;
	private static JTextField aliasField;
	private static JTextField keyStoreNameField;
	
	
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
	private JButton attachButton;
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
	private static JMenu subMenu;
	private static JMenu commandSubMenu;
	
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
	static volatile boolean bDebugOptionFinished;
	static volatile boolean bCheckGradleProjectFinished;
	static volatile boolean bFoundPackageName;
	static volatile boolean bWirelessEnabled;
	static volatile boolean bShellThreadFinished;
	static volatile boolean bIOBgThreadBreak;
	static volatile boolean bKillProgressBar;
	static volatile boolean bFlutterPubGetFinished;
	static volatile boolean bBlockDebug;
	static volatile boolean bProjectSelected;
	static volatile boolean bUninstallPressed;
	static volatile boolean bCommandFinished;
	static volatile boolean bCheckPasswordsFinished;
	static volatile boolean bOkayToDoKeytool;
	static volatile boolean bDoRefresh;
	static volatile boolean bIsReleaseBuild;
	static volatile boolean bIsDebugBuild;
	static volatile boolean bUsingAndroid;
	static volatile boolean bCheckDeviceFinished;
	static volatile boolean bWakeDeviceFinished;
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
	static volatile long lPrevTime;
	static volatile long lEvent_MethodId;
	static volatile long lBreakpointClassId;
	
	static volatile String sThreadName;
	static volatile String sClassSignature;
	static volatile String commandPhrase;
	static volatile String sFullSourcePath;
	static volatile String sDeviceIPAddress;
	
	static volatile String sKeystorePassword;
	static volatile String sKeyAliasPassword;
	static volatile String sKeystorePath;
	static volatile String sKeyAlias;
	static volatile String sAppBundleKeystorePath;
	static volatile String sAppBundleKeyAlias;
	static volatile String sAppBundleKeystorePassword;
	static volatile String sAppBundleKeyAliasPassword;
	
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
	static volatile String sDebugArg;
	static volatile String sUsingOpenJdk;
	static volatile String sSelectedMethodName;
	static volatile String sLastSourcePath;
	static volatile String sPackageNameLead;
	static volatile String packageNameS;
	static volatile String sDebugMessage;
	static volatile String sEnableDebugOutput;
	static volatile String sGradleSuppressWarnings;
	static volatile String sDontModifyBuildGradle;
	static volatile String sUsePidLogcat;
	static volatile String sPid;
	static volatile String sInternalCommand;
	static volatile String sAdditionalCommands;
	static volatile String sPropertiesPackageName;
	static volatile String sBundleToolJarPath;
	static volatile String sGradlewCommand;
	static volatile String sWakefulness;
	
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
	//static ArrayList ScriptsAr;
	static ArrayList VariableInfoAr;
	static ArrayList LibraryAr;
	static ArrayList ScriptIdAr;
	static ArrayList<String> CommandAr = null;
	//static ArrayList SourceClassInfoAr;
	
	//static Hashtable EventInfoHt;
	static volatile LinkedHashMap VariableInfoLHm;
	//static volatile Hashtable LineTableHt;
	static volatile LinkedHashMap ClassVariableLHm;
	static volatile LinkedHashMap LocalVariableLHm;
	static volatile LinkedHashMap SelectedNodesLHm;
	static volatile HashMap NodeHm;
	static volatile HashMap SourceClassInfoHm;
	
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
	private volatile boolean bDoKill;
	
	private boolean bReIssueRelease;
	private int iOS;
	private String apkNameS;
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
	//private volatile boolean bCommandFinished;
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
	static final String ATTACH = "Attach";
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
	static final String GENERATE_KEY_STORE = "Generate Key Store";
	static final String UPDATE = "Update";
	static final String LAUNCH = "Launch Emulator";
	static final String REFRESH = "Refresh";

	static final String CREATE_SUBMIT = "create_submit";
	static final String CREATE_CANCEL = "create_cancel";
	static final String UPDATE_SUBMIT = "update_submit";
	static final String UPDATE_CANCEL = "update_cancel";
	static final String GENERATE_KEY_STORE_SUBMIT = "generate_key_store_submit";
	static final String GENERATE_KEY_STORE_CANCEL = "generate_key_store_cancel";
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
	static final String MARK = "Mark";
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
	
	DocumentFilter dfilter;
	
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
	private ShellBgThread shellBgThread;
	private CheckDeviceBgThread checkDeviceBgThread;
	private WakeDeviceBgThread wakeDeviceBgThread;
	
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
	private ModifyGradleProjectBgThread modifyGradleProjectBgThread;
	private CheckGradleProjectBgThread checkGradleProjectBgThread;

	
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

	static byte[] appStartedStringBytes = {(byte)0x22, (byte)'a', (byte)'p', (byte)'p', (byte)'.', (byte)'s',
		(byte)'t', (byte)'a', (byte)'r', (byte)'t', (byte)'e', (byte)'d', (byte)0x22};
	static final String APP_STARTED_STRING = new String(appStartedStringBytes);
	
	static byte[] tokenPosBytes = {(byte)0x22, (byte)'t', (byte)'o', (byte)'k', (byte)'e', (byte)'n',
		(byte)'P', (byte)'o', (byte)'s', (byte)0x22};
	static final String TOKENPOS_STRING = new String(tokenPosBytes);
	
	static byte[] frameBytes = {(byte)0x22, (byte)'F', (byte)'r', (byte)'a', (byte)'m', (byte)'e', (byte)0x22};
	static final String FRAME_STRING = new String(frameBytes);

	static byte[] varsBytes = {(byte)0x22, (byte)'v', (byte)'a', (byte)'r', (byte)'s', (byte)0x22};
	static final String VARS_STRING = new String(varsBytes);
	
	static byte[] uriBytes = {(byte)0x22, (byte)'u', (byte)'r', (byte)'i', (byte)0x22};
	static final String URI_STRING = new String(uriBytes);
	
	static byte[] messageBytes = {(byte)0x22, (byte)'m', (byte)'e', (byte)'s', (byte)'s', (byte)'a',
		(byte)'g', (byte)'e', (byte)0x22};
	static final String MESSAGE_STRING = new String(messageBytes);

	static byte[] bytesBytes = {(byte)0x22, (byte)'b', (byte)'y', (byte)'t', (byte)'e', (byte)'s', (byte)0x22};
	static final String BYTES_STRING = new String(bytesBytes);

	
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
	"Android 10.0 Q (API level 29)",
	"Android 11.0 (API level 30)",
	"Android 12.0 (API level 31)",
	"Android 13.0 (API level 32)"};

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
		bIOBgThreadBreak = false;
		bKillProgressBar = false;
		
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
		iDebugMode = 0;
		bBlockDebug = false;
		bProjectSelected = false;
		bUninstallPressed = false;
		bIsReleaseBuild = false;
		bIsDebugBuild = false;
		bUsingAndroid = false;
		
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
		lPrevTime = 0;
		bWirelessEnabled = false;
		sGradlewCommand = "";
		
		
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
		
		if ( attachButton != null )
			attachButton.setVisible(false);
		
		if ( reloadButton != null )
			reloadButton.setVisible(false);
		
		init();

		// Select SDK..
		//("androidSdkPathAntS: '"+androidSdkPathAntS+"'");
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
		// Try to detect OpenJdk being used..
		if ( (javaPathS != null) && (javaPathS.length() > 0) )
		{
		    if ( javaPathS.contains("openjdk") )
		        sUsingOpenJdk = "true";
		    else
		        sUsingOpenJdk = "false";
		}
/**/		
		//System.out.println("(Selected)androidSdkPathS: '"+androidSdkPathS+"'");
		// Defaults..		
		bBreakOut = false;
		bLogcatOn = false;
		bReIssueRelease = false;
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

        // Look for [Project]/android
        // For LibGdx projects..
		if ( (projectHomeS != null) && (projectHomeS.length() > 0) )
		{
			StringBuffer sB = new StringBuffer(projectHomeS);
			sB.append("/android");
			File tFile = new File(sB.toString());
			if ( tFile.exists() )
				bUsingAndroid = true;
			else
				bUsingAndroid = false;
		}
		
		getPackageName();
		
		RefreshProperties();
		
/*		
        if ( bFlutterSelected )	
        {
            if ( (sEnableDebugOutput != null) && (sEnableDebugOutput.length() > 0) )
            {
                if ( sEnableDebugOutput.equals("true") )
                {
					bKillDaemonThread = false;
					flutterDaemonBgThread = new FlutterDaemonBgThread();
					flutterDaemonBgThread.start();
                    
                    DebugInit();
                    
                }
            }
        }
/**/

	}	//}}}

	//{{{	RefreshProperties()
	private void RefreshProperties()
	{
		// Read Properties..
		//System.out.println("\nRefreshProperties()");
		String[] sGCmdAr = {"assemble", "build", "buildDependents", "buildNeeded", "classes", "clean",
		    "jar", "testClasses"};
		
		Properties prop = new Properties();
		
		try
		{
			prop.load(new FileInputStream("config.properties"));
			
			// Get Property Values..
			antPathS = Utils.processPath(prop.getProperty("ant_path"));
			javaPathS = Utils.processPath(prop.getProperty("java_path"));
			androidSdkPathAntS = Utils.processPath(prop.getProperty("android_sdk_path_ant"));
			sBundleToolJarPath = Utils.processPath(prop.getProperty("bundletool_jar_path"));
			
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
			sUsePidLogcat = Utils.processPath(prop.getProperty("use_pid_logcat"));
			downloadPathS = Utils.processPath(prop.getProperty("download_path"));
			sdCardPathS = Utils.processPath(prop.getProperty("sdcard_path"));
			sDeviceIPAddress = Utils.processPath(prop.getProperty("device_ip_address"));
			gradleOfflineS = Utils.processPath(prop.getProperty("gradle_offline"));
			sDontModifyBuildGradle = Utils.processPath(prop.getProperty("dont_modify_build_gradle"));
			sAdditionalCommands = Utils.processPath(prop.getProperty("additional_commands"));
			sPropertiesPackageName = Utils.processPath(prop.getProperty("package_name"));
			
			sGradleSuppressWarnings = Utils.processPath(prop.getProperty("gradle_suppress_warnings"));
			sGPSLatitude = Utils.processPath(prop.getProperty("gps_latitude"));
			sUseGradlew = Utils.processPath(prop.getProperty("use_gradlew"));
			sUseAppBundle = Utils.processPath(prop.getProperty("use_app_bundle"));
			sGradleCommandOption = Utils.processPath(prop.getProperty("gradle_command_option"));
			sDebugArg = Utils.processPath(prop.getProperty("gradle_debug_option"));
			sEnableSoftwareRendering = Utils.processPath(prop.getProperty("enable_software_rendering"));
			sEnableDebugOutput = Utils.processPath(prop.getProperty("enable_debug_output"));
			
			sKeystorePath = Utils.processPath(prop.getProperty("keystore_path"));
			sKeyAlias = Utils.processPath(prop.getProperty("key_alias"));
			sKeystorePassword = Utils.processPath(prop.getProperty("key_store_password"));
			sKeyAliasPassword = Utils.processPath(prop.getProperty("key_alias_password"));
			
			sAppBundleKeystorePath = Utils.processPath(prop.getProperty("app_bundle_keystore_path"));
			sAppBundleKeyAlias = Utils.processPath(prop.getProperty("app_bundle_key_alias"));
			sAppBundleKeystorePassword = Utils.processPath(prop.getProperty("app_bundle_key_store_password"));
			sAppBundleKeyAliasPassword = Utils.processPath(prop.getProperty("app_bundle_key_alias_password"));

            if ( (javaPathS != null) && (javaPathS.length() > 0) && (! javaPathS.equals("null")) )
            {
                //System.out.println("javaPathS: '"+javaPathS+"'");
                
                // Try to detect OpenJDK being used..
                if ( javaPathS.contains("openjdk") )
                    sUsingOpenJdk = "true";
                else
                    sUsingOpenJdk = "false";
            }
            else
            {
                sUsingOpenJdk = "false";
            }
/*
            if ( sUseGradlew == null )
                System.out.println("sUseGradlew null");
            else
                System.out.println("sUseGradlew: '"+sUseGradlew+"'");
/**/            
            
			if ( (sUseGradlew != null) && (sUseGradlew.equals("true")) )
			{
				sGradleType = "gradlew";

                // Construct gradlew commands..
                CommandAr = new ArrayList<String>();
                for ( int iJ = 0; iJ < sGCmdAr.length; iJ++ )
                    CommandAr.add(sGCmdAr[iJ]);
                   
                if ( (sAdditionalCommands != null) && (! sAdditionalCommands.equals("null")) 
                    && (sAdditionalCommands.length() > 0) )
                {
                    StringTokenizer st = new StringTokenizer(sAdditionalCommands, ",");
                    int iCount = st.countTokens();
                    String sTok;
                    
                    for ( int iG = 0; iG < iCount; iG++ )
                    {
                        sTok = st.nextToken();
                        sTok = sTok.trim();
                        CommandAr.add(sTok);
                    }
                }
                
/*                
                if ( commandSubMenu == null )
                    System.out.println("commandSubMenu null");
                else
                    System.out.println("commandSubMenu: '"+commandSubMenu+"'");
/**/

                if ( commandSubMenu != null )
                {
                    if ( (CommandAr != null) && (CommandAr.size() > 0) )
                    {
                        commandSubMenu.removeAll();
                        JMenuItem tSubMenuItem;
                        for ( int iZ = 0; iZ < CommandAr.size(); iZ++ )
                        {
                            tSubMenuItem = new JMenuItem(CommandAr.get(iZ));
                            tSubMenuItem.addActionListener(actListener);
                            commandSubMenu.add(tSubMenuItem);
                        }
                    }
                }
                
			}
			else
				sGradleType = "gradle";
			
			if ( (sUseAppBundle != null) && (sUseAppBundle.equals("true")) )
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
		
        if ( (sUseGradlew != null) && (sUseGradlew.equals("true")) )
        {
            if ( commandSubMenu != null )
                commandSubMenu.setVisible(true);
        }
        else
        {
            // Hide if not using Gradlew..
            if ( commandSubMenu != null )
                commandSubMenu.setVisible(false);
        }
		
/*		
		if ( sAppBundleKeystorePath == null )
		    System.out.println("sAppBundleKeystorePath null");
		else
		    System.out.println("sAppBundleKeystorePath: '"+sAppBundleKeystorePath+"'");
/**/		

        //System.out.println("Exiting RefreshProperties()");
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

				outSb.append("    <string name=\"app_name\">");
				outSb.append(sApplicationName);
				outSb.append("</string>");
				outSb.append(sTrail);
				
				outSb.append("    <string name=\"out_text\">");
				outSb.append("Hello World, ");
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
				outSb.append("        android:text=\"@string/out_text");
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
							
							if ( iJ < objSa.length )
							{
                                objSa[iJ] = (String)lineSb.toString();
                                //System.out.println("objSa["+iJ+"]: '"+objSa[iJ]+"'");
                            }
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
					//outSb.append("apply plugin: 'android'");
					outSb.append("apply plugin: 'com.android.application'");
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
				
                if ( bKotlinSelected )
                {
                    outSb.append(sTrail);
                    outSb.append("dependencies {");
                    outSb.append(sTrail);
                    outSb.append("    implementation \"org.jetbrains.kotlin:kotlin-stdlib:");  
                    outSb.append(sKotlinVersion);
                    outSb.append("\"");
                    outSb.append(sTrail);
                    outSb.append("}");
                    outSb.append(sTrail);
                }
	
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
			//outSb.append("        mavenCentral()");
			outSb.append("        jcenter()");
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
				long lFrameId = 0;
				long lChangedMethodId = 0;
				int iKey = 0;
				int iRequestId;
				byte bSigByte;
				byte bSig;
				boolean bDoContinue = true;
				boolean bContainsMethodId = false;
				Integer IVal;
				FramesInfo framesInfo = null;
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
							//System.out.println("lMethodId: "+lMethodId+"  (Hex): "+Long.toHexString(lMethodId));
							lClassId = eventInfo.lClassId;
							//System.out.println("lClassId: "+lClassId+"  (Hex): "+Long.toHexString(lClassId));
							lThreadId = eventInfo.lThreadId;
							//System.out.println("lThreadId: "+lThreadId+"  "+Long.toHexString(lThreadId));
							
							// Set defaults..
							lMethodSelection = lMethodId;
							currentClassId = lClassId;
							
							//System.out.println("eventInfo.bEventKind: "+eventInfo.bEventKind);

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
								
								//System.out.println("eventInfo.lLocationIndex: "+eventInfo.lLocationIndex);
								lBreakpointClassId = lClassId;
								//System.out.println("lBreakpointClassId: "+lBreakpointClassId);
								
								// Show current line..
								bShowCurrentLine = true;
								
								// Reset..
								bTabSelected = false;
								
								lLocationMethod = lMethodId;
								
								updateSourceLines(lBreakpointLocationIndex);
								
								// Get Thread name..
								sThreadName = JDWPCommands.command_Name(lThreadId);
								
								// Get current FrameId..								
								JDWPCommands.command_Frames(
									lCurrentThreadId,
									0,				// startFrame
									1);			// length, count of frames to retrieve (-1 = all remaining)

								if ( FramesAr != null )
								    framesInfo = (FramesInfo)FramesAr.get(0);
								
								if ( framesInfo != null )
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
											    if ( iIndex < StaticValueAr.size() )
											    {
                                                    classValueInfo = (ClassValueInfo)StaticValueAr.get(iIndex);
                                                    value = classValueInfo.value;
                                                }
											}
											else if ( (iLoop == 1) &&
												((NonStaticValueAr != null) && (NonStaticValueAr.size() > 0)) )
											{
											    if ( iIndex < NonStaticValueAr.size() )
											    {
                                                    classValueInfo = (ClassValueInfo)NonStaticValueAr.get(iIndex);
                                                    value = classValueInfo.value;
                                                }
											}
											else if ( (iLoop == 2) &&
												((LocalValueAr != null) && (LocalValueAr.size() > 0)) )
											{
											    if ( iIndex < LocalValueAr.size() )
											    {
                                                    localValueInfo = (LocalValueInfo)LocalValueAr.get(iIndex);
                                                    value = localValueInfo.value;
                                                }
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
														if ( iVIndex < stringValueSa.length ) 
														    stringValueSa[iVIndex] = (String)sValue;
														
														//System.out.println("variableTableInfo.sStringValue["+iVIndex+"]: '"+
															//variableTableInfo.sStringValue[iVIndex]+"'");
														
														iVIndex++;
													}
												}
												
												if ( bLocal )
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
												else
												{
/*
													if ( ClassVariableLHm == null )
														System.out.println("ClassVariableLHm null");
													else
														System.out.println("ClassVariableLHm.size(): "+ClassVariableLHm.size());
/**/

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

/*								
								if ( ClassMethodAr == null )
								    System.out.println("ClassMethodAr null");
								else
								{
								    System.out.println("ClassMethodAr.size(): "+ClassMethodAr.size());
                                    for ( int g = 0; g < ClassMethodAr.size(); g++ )
                                    {
                                        classMethodInfo = (ClassMethodInfo)ClassMethodAr.get(g);
                                        System.out.println("----------------------------  "+g);
                                        System.out.println("(lClassId): "+classMethodInfo.lClassId);
                                        System.out.println("(lMethodId): "+classMethodInfo.lMethodId);
                                        System.out.println("(sMethodName): '"+classMethodInfo.sMethodName+"'");
                                        //System.out.println("(sSourcePath): '"+classMethodInfo.sSourcePath+"'");
                                    }
                                    System.out.println();
								}
/**/								

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
/*
									updateSource(lClassId, lMethodId);
/**/									
									bIsDirty = false;
								}
/**/								

								//System.out.println("bDidUpdate: "+bDidUpdate);
								if ( bDidUpdate )
								{
									bDidUpdate = false;
								}
								else
								{
									updateSourceLines(lBreakpointLocationIndex);
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
			//System.out.println("\nLoadSourceBgThread run()");
			
			bSourceExists = false;
			sourceBuf = null;
			StringBuffer statusPathSb;
			String sStatusPath = "";
			int iLoc2 = 0;
			
			byte[] bLib = {(byte)0x6c, (byte)0x69, (byte)0x62, (byte)0x5c};    // 'lib\'
			String sLib = new String(bLib);
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

                if ( bFlutterSelected )
                {
                    iLoc2 = sFullSourcePath.indexOf(sLib);
                    if ( iLoc2 != -1 )
                        sStatusPath = sFullSourcePath.substring(iLoc2);
                }
                else
                {
                    statusPathSb = new StringBuffer();
                    statusPathSb.append(sPackageName);
                    statusPathSb.append("/");
                    
                    iLoc2 = sFullSourcePath.lastIndexOf((int)0x5c);     // '\'
                    if ( iLoc2 != -1 )
                    {
                        statusPathSb.append(sFullSourcePath.substring(iLoc2 + 1));
                        //System.out.println("statusPathSb: '"+statusPathSb.toString()+"'");
                        sStatusPath = statusPathSb.toString();
                    }
                    
                }
				
				
				//System.out.println("sStatusPath: '"+sStatusPath+"'");
				statusPath.setText(sStatusPath);
				
				bSourceExists = true;
				
				//sourceBuf = Utils.readFile(2048, sFullSourcePath);	// iInitialSize..
				sourceBuf = readFile(2048, sFullSourcePath);
				
			}

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
			
			byte[] bZeroA = {(byte)0x0a};
			String sZeroA = new String(bZeroA);
			
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
			int iBlockCount = 0;	
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

                    outputEndS = "";
                    
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
					
					if ( bIOBgThreadBreak )
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
/*
                    if ( lineSb == null )
                        System.out.println("(Before)lineSb null");
                    else
                        System.out.println("(Before)lineSb.length(): "+lineSb.length());
/**/

/*
					if ( sUsePidLogcat == null )
					    System.out.println("sUsePidLogcat null");
					else    
					    System.out.println("sUsePidLogcat: "+sUsePidLogcat);
/**/


                    if ( (sUsePidLogcat != null) && (sUsePidLogcat.equals("true")) )
                    //if ( ((sUsePidLogcat != null) && (sUsePidLogcat.equals("true"))) ||
                            //((sUseAppBundle != null) && (sUseAppBundle.equals("true"))) )
                        Thread.sleep(5);
                    else
                    {
                        // Without this, console output
                        // can get really laggy and unresponsive..
                        if ( lineSb.length() < 4096 )
                            //Thread.sleep(10);
                            Thread.sleep(7);
                        else
                        {
                            if ( lDif > 0 )
                                Thread.sleep(40);
                                //Thread.sleep(45);
                            else
                                //Thread.sleep(30);
                                Thread.sleep(20);
                        }
/**/                        
                    }

					if ( (lineSb != null) && (iBytesRead > 0) )
					{
						// Start of new block..
						//System.out.println("=== NEW BLOCK ===");
						bInWord = false;
						iWordStart = 0;
						boolean bFirst2;
						int iLastZeroA = 0;
						int iLoc2 = 0;
						int iLoc3 = 0;
						int iLoc4 = 0;
						int iLoc5 = 0;
						int iLoc6 = 0;
						StringBuffer endSb;
						StringBuffer sB;
						StringBuffer sb;
						String sPrevEnd = "";
						String sT = "";
						String sT2 = "";
						
						//System.out.println("\nbLogcatOn: "+bLogcatOn);
						//System.out.println("sUsePidLogcat: '"+sUsePidLogcat+"'");
						//System.out.println("lineSb.length(): "+lineSb.length());
						//System.out.println("sPid: '"+sPid+"'");
						
                        if ( (bLogcatOn) && (sUsePidLogcat != null) && (sUsePidLogcat.length() > 0) )
                        {
                            if ( sUsePidLogcat.equals("true") )
                            {
                                // Use PID Logcat..
                                
                                //System.out.println("Using PID");
                                
                                if ( (sPid != null) && (! sPid.equals("null")) && (sPid.length() > 0) )
                                    ;   // Have it..
                                else
                                {
                                    if ( (packageNameS != null) && (packageNameS.length() > 0) )
                                    {
                                        // Check Process..
                                        sb = new StringBuffer();
                                        
                                        if ( iOS == LINUX_MAC )
                                        {
                                            sb.append("export PATH=${PATH}:");
                                            sb.append(androidSdkPathS);
                                            sb.append("/platform-tools");
                                            sb.append(";adb ");
                                        }
                                        else
                                        {
                                            sb.append("SET PATH=");
                                            sb.append(androidSdkPathS);
                                            sb.append("/platform-tools");
                                            sb.append(";%PATH%");
                                            sb.append("&&adb ");
                                        }
                                        
                                        sb.append("shell ps");
                                            
                                        if ( iOS == WINDOWS )
                                            sb.append("\n");
                                        
                                        bInternalFinished = false;		
                                        internalCommandS = sb.toString();
                                        commandBgThread = new CommandBgThread();
                                        commandBgThread.start();
                                
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
                            
                                            if ( bInternalFinished )
                                                break;
                                        }

                                        if ( (commandResultS != null) && (commandResultS.length() > 0) )
                                        {
                                            iLoc3 = commandResultS.indexOf(packageNameS);
                                            if ( iLoc3 != -1 )
                                            {
                                                // Grab PID..
                                                for ( ; commandResultS.charAt(iLoc3) != (char)0x0a; iLoc3-- );
                                
                                                iLoc3++;
                                                for ( ; ! Character.isWhitespace(commandResultS.charAt(iLoc3)); iLoc3++ );
                                                for ( ; Character.isWhitespace(commandResultS.charAt(iLoc3)); iLoc3++ );
                                                iStart = iLoc3;
                                                for ( ; ! Character.isWhitespace(commandResultS.charAt(iLoc3)); iLoc3++ );
                                                sPid = commandResultS.substring(iStart, iLoc3);
                                                
                                                // Try changing to use PID command..
                                            }
                                            else
                                            {
                                                sPid = "";
                                                lineSb = new StringBuffer();
                                            }
                                        }
                                    }
                                }


/*                                
                                if ( sPid == null )
                                    System.out.println("sPid null");
                                else
                                    System.out.println("sPid: '"+sPid+"'");
/**/                                

                                if ( (sPid != null) && (sPid.length() > 0) )
                                {
                                    sB = new StringBuffer();
                                    
                                    iLoc3 = 0;
                                    bFirst2 = true;
                                    
                                    while ( true )
                                    {
                                        if ( iLoc3 < lineSb.length() )
                                            ;
                                        else
                                        {
                                            //System.out.println("Breaking");
                                            break;
                                        }
                                        
                                        iLoc2 = lineSb.indexOf(sZeroA, iLoc3);
                                        if ( iLoc2 != -1 )
                                        {
                                            iLastZeroA = iLoc2;
                                            
                                            if ( bFirst2 )
                                            {
                                                bFirst2 = false;
                                                endSb = new StringBuffer();
                                                endSb.append(sPrevEnd);
                                                
                                                if ( (iLoc2 + 1) > 0 )
                                                {
                                                    endSb.append(lineSb.substring(0, iLoc2 + 1));
                                                }
                                                
                                                //System.out.println("endSb: '"+endSb.toString()+"'");
                                                // Like:  'I/InputDispatcher(  746): Delivering touch to (874): action: 0x4, toolType: 1[d][d][a]
                                                iLoc4 = endSb.indexOf(")");
                                                if ( iLoc4 != -1 )
                                                {
                                                    iLoc5 = endSb.indexOf("(");
                                                    if ( iLoc5 != -1 )
                                                    {
                                                        // ' 1499): Scheduling ... ( ...
                                                        if ( (iLoc4 > 0) && (iLoc5 < iLoc4) )
                                                        {
                                                            //System.out.println("endSb.length(): "+endSb.length());
                                                            // Statement's PID..
                                                            sT = endSb.substring(iLoc5 + 1, iLoc4);
                                                            //System.out.println("sT: '"+sT+"'");
                                                        
                                                            sT = sT.trim();
                                                            if ( sPid.equals(sT) )
                                                                sB.append(endSb.toString());
                                                        }
                                                    }
                                                }
                                                
                                                iLoc3 = iLoc2 + 1;  // Next..
                                                continue;                                    
                                            }
                                            
                                            iLoc4 = lineSb.indexOf(")", iLoc2);
                                            if ( iLoc4 != -1 )
                                            {
                                                iLoc5 = lineSb.indexOf("(", iLoc2);
                                                if ( iLoc5 != -1 )
                                                {
                                                        if ( (iLoc4 > 0) && (iLoc5 < iLoc4) )
                                                            sT = lineSb.substring(iLoc5 + 1, iLoc4);
                                                    
                                                    sT = sT.trim();
                                                    if ( sPid.equals(sT) )
                                                    {
                                                        //System.out.println("--PID Matched--");
                                                        iLoc6 = lineSb.indexOf(sZeroA, iLoc2 + 1);
                                                        if ( ((iLoc6 + 1) > (iLoc2 + 1)) && ((iLoc6 + 1) < lineSb.length()) )
                                                        {
                                                            // Append to output..
                                                            sT2 = lineSb.substring(iLoc2 + 1, iLoc6 + 1);
                                                            //System.out.println("sT2: '"+sT2+"'");
                                                            sB.append(sT2);
                                                            
                                                        }
                                                    }
                                                }
                                                else
                                                    break;
                                            }
                                            else
                                                break;
                                        }
                                        else
                                            break;
                                        
                                        iLoc3 = iLoc2 + 1;  // Next..
                                        
                                    }   // End while..
                                    
                                   //System.out.println("Dropped out");
                                   //System.out.println("lineSb.length(): "+lineSb.length());
                                   
                                   if ( ((iLastZeroA + 1) >= 0) && ((iLastZeroA + 1) < lineSb.length()) )
                                       sPrevEnd = lineSb.substring(iLastZeroA + 1);
                                    //System.out.println("(End of block)sPrevEnd: '"+sPrevEnd+"'");
                                    
                                    //bFinishEnd = true;
            
                                    if ( sB.length() > 0 )
                                        ;
                                    else
                                        sB.append("");
                                    
                                    lineSb = sB;
                                }
/**/                                
                                
                                
                                
                            }
                        }

/*
                        if ( lineSb == null )
                            System.out.println("(After)lineSb null");
                        else
                            System.out.println("(After)lineSb.length(): "+lineSb.length());
/**/

						
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

                        // In Flutter there
                        // were some bad lead characters
                        // so kill any of those..
/*                        
                        while ( true )
                        {
                            if ( lineSb.charAt(0) > 0x7f )
                            {
                                lineSb.deleteCharAt(0);
                                continue;
                            }
                            else
                                break;
                        }
/**/                        
						
						iIdx = 0;
						bDoBreak = false;
						bSplit = false;
						iChunkLen = lineSb.length();
						//System.out.println("bBlockSplit: "+bBlockSplit);
						//System.out.println("iWordLength: "+iWordLength);
						//System.out.println("iWordStart: "+iWordStart);
						
						for ( ; ; iIdx++ ) 
						{
							//System.out.println("--TOP--  iIdx: "+iIdx);
							if ( bDoBreak )
							{
								//System.out.println("--Breaking--");
								break;
							}
							
							//System.out.println("iChunkLen: "+iChunkLen);
							if ( iIdx >= iChunkLen )
							{
								// Hit end of block..
								cChr = ' ';
								if ( ((lineSb.length() - 1) >= 0) && ((lineSb.length() - 1) < lineSb.length()) )
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
							
							//System.out.println("bSplit: "+bSplit);
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
										if ( iChrLoc > (iSIdx - (iBreakLength / 2) ) )
										{
											lineSb.insert((iChrLoc + 1), ' ');
										}
										else
										{
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
						
						//System.out.println("Dropped out");
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

								//if ( lineSb.charAt(lineSb.length() - 1) == '>' )
								if ( ((lineSb.length() - 1) >= 0) && (lineSb.charAt(lineSb.length() - 1) == '>') )
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

                                    // Catch end of App Bundle Install..
                                    if ( actionCommandS.equals(INSTALL) &&
                                        ((sUseAppBundle != null) && (sUseAppBundle.equals("true"))) )
                                    {
                                        if ( lineS.endsWith(outputEndS) )
                                        {
											//System.out.println("End matched, breaking out..");
											bBreakOut = true;	// Signal to break out..
                                        }
                                    }
                                            
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
/*
                            if ( sGradlewCommand == null )
                                System.out.println("sGradlewCommand null");
                            else
                                System.out.println("sGradlewCommand: '"+sGradlewCommand+"'");
/**/                                
                            //System.out.println("(Check)lineSb: '"+lineSb.toString()+"'");
                            
							//System.out.println("sGradlewCommand: '"+sGradlewCommand+"'");
							if ( (sGradlewCommand != null) && (lineSb.indexOf(sGradlewCommand) != -1) )
							{
                                // Finish Progress Bar early..
                                //System.out.println("--FOUND--");
                                bFinished = true;
							}

                            //System.out.println("(Check)lineSb: '"+lineSb.toString()+"'");	
                            //System.out.println("bFinished: "+bFinished);
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
				
				bIOBgThreadBreak = false;    // Reset..
				
				//System.out.println("\nIOBgThread dropped out");
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
/**/
			//System.gc();

			bIOBgThreadFinished = true;
			
			// Reset..
			bBreakOut = false;
			bLogcatOn = false;
			bFinished = true;

			//System.out.println("\n\nExiting IOBgThread run()");
			
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

            //System.out.println("bFlutterSelected: "+bFlutterSelected);
            //System.out.println("bUsingAppProject: "+bUsingAppProject);			
			if ( bFlutterSelected )
				fileNameSb.append("/android/app/build.gradle");
			else
			{
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
/*
            if ( buildBuf == null )
                System.out.println("buildBuf null");
            else
                System.out.println("buildBuf not null");
/**/                
                
			if ( (buildBuf != null) && (buildBuf.length > 0) )
			{
				StringBuffer outSb = new StringBuffer(new String(buildBuf));
				
				// Set signingConfigs 'storeFile'..
				//System.out.println("bEnableStoreFile: "+bEnableStoreFile);
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
			//System.out.println("Exiting DebugReleaseBgThread");
		}
		
		//System.out.println("Exiting DebugReleaseBgThread");
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
						//System.out.println("outSb: '"+outSb.toString()+"'");
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
			//int iExitVal;
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
			byte[] bSlashes = {(byte)0x5c, (byte)0x5c};
			String sSlashes = new String(bSlashes);
			byte[] bBackSlash = {(byte)0x5c};
			String sBackSlash = new String(bBackSlash);

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

			if ( iDebugMode == DEBUG_RUN )
			{
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
                
                if ( (sDontModifyBuildGradle != null) && (sDontModifyBuildGradle.equals("true")) )
                    ;
                else
                {
                
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
                }
    
                //System.out.println("DebugReleaseBgThread dropped out of wait");
            }
			
			// Construct command..
			StringBuffer cmdSb = new StringBuffer();
			
			if ( iOS == LINUX_MAC )
			{
				cmdSb.append("export PATH=${PATH}:");
				cmdSb.append(sFlutterSdkPath);
				
				cmdSb.append(";cd ");
				cmdSb.append(projectHomeS);

				cmdSb.append(";flutter ");
				if ( iDebugMode == DEBUG_RUN )
				    cmdSb.append("run ");
				else if ( iDebugMode == DEBUG_ATTACH )
				    cmdSb.append("attach ");

				if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
				{
					cmdSb.append("--device-id ");
					cmdSb.append(sDeviceName);
					cmdSb.append(" ");
				}

                if ( iDebugMode == DEBUG_RUN )
                {
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
                }
				
				cmdSb.append(" --machine");
			}
			else
			{
				cmdSb.append("SET PATH=");
				cmdSb.append(sFlutterSdkPath);
				cmdSb.append(";%PATH%");

				cmdSb.append("&&CD ");
				cmdSb.append(projectHomeS);

				cmdSb.append("&&flutter ");
				if ( iDebugMode == DEBUG_RUN )
				    cmdSb.append("run ");
				else if ( iDebugMode == DEBUG_ATTACH )
				    cmdSb.append("attach ");
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

                if ( iDebugMode == DEBUG_RUN )
                {
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
                }

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
					daemonProcess = rt.exec(new String[] {"cmd.exe", "/C", cmdSb.toString()});
					
/*					
					daemonProcess = rt.exec("cmd.exe");
					
					// Command..				
					daemonOutputStream = daemonProcess.getOutputStream();
					daemonOutputStream.write(cmdSb.toString().getBytes());
					daemonOutputStream.flush();
/**/					
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
				//bKillProgressBar = false;
				swingWorker = new SwingWorker()
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

						//while ( true )
						while ( swingWorker.isCancelled() == false )
						{
							try
							{
								Thread.sleep(250);
							}
							catch (InterruptedException ie)
							{
							}
							
							//if ( bProgressBarFinished )
							if ( bProgressBarFinished || bKillProgressBar )   
							{
								break;
							}
						}
						
						//System.out.println("doInBackground() dropped out");
						
						return null;
					}
					
					@Override
					public void done()
					{
						//System.out.println("SwingWorker done()");
						progressJFrame.dispose();
					}
				};

                //System.out.println("Doing swingWorker.execute()");				
				swingWorker.execute();
				
				
				while ( true )
				{
				    //System.out.println("--TOP--");
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
						//System.out.println("Didn't get anything");
						// If still getting data
						// gets Exception:
						// 'Exception: java.lang.IllegalThreadStateException: process hasn't exited'
						// When I/O is finished, does exitValue()..
						try
						{
							iExitVal = daemonProcess.exitValue();
							//System.out.println("iExitVal: "+iExitVal);
							swingWorker.cancel(true);
							break;
						}
						catch (IllegalThreadStateException itse)
						{
						}
/**/
					}

					//System.out.println("\n\niBytesRead: "+iBytesRead);
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
											//bProgressBarFinished = true;
										}
										
										//System.out.println("sMessage: '"+sMessage+"'");
										sT2 = sMessage;
									}
								}
/**/

                                // Note:
                                // Since if we do Run in Release mode
                                // it doesn't get 'Syncing files to..'
                                // we end the progress bar on "app.started"..								
								iLoc3 = sT.indexOf(APP_STARTED_STRING);
								if ( iLoc3 != -1 )
								{
                                    // Signal finished..
                                    bProgressBarFinished = true;
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

                            // Sometimes it was getting a String
                            // with several spaces only and was causing an Exception..
                            if ( sT != null )
                                sT = sT.trim();
                            
							// No lead '['..
							//System.out.println("\n\nbLookForEnd: "+bLookForEnd);
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
/*								
								if ( sT == null )
								    System.out.println("(Else)sT null");
								else
								    System.out.println("(Else)sT: '"+sT+"'");
								
/**/								
								if ( (sT != null) && (! sT.equals("")) )
								{
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
                                        if ( (sT != null) && (! sT.equals("")) )
                                        {
                                            sT = sT.trim();
                                            //System.out.println("(Else)sT: '"+sT+"'");
            
                                            // Kill weird leading characters..								
                                            tSb = new StringBuffer(sT);
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
							}
						}

/*						
						if ( sT2 == null )
						    System.out.println("sT2 null");
						else
						    System.out.println("sT2.length(): "+sT2.length());
/**/						        
						        
						if ( (sT2 != null) && (sT2.length() > 0) )
						{
							// Output to console..
							//System.out.println("(Out)sT2: '"+sT2+"'");
							if ( sT2.startsWith("Installing") )
							{
							    bBlockDebug = false;    // Reset..
							    sT2 = sT2.replace(sSlashes, sBackSlash);
							}
							
							if ( sT2.startsWith("Syncing") )
							{
							    bBlockDebug = false;    // Reset..
							}

							//System.out.println("bBlockDebug: "+bBlockDebug);
							if ( (sT2.contains("/flutter ")) && (bBlockDebug) )
							    ;
							else
                            {
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
                                    //System.out.println("Output to console Exception");
                                    iae.printStackTrace();
                                }
                                catch (BadLocationException ble)
                                {
                                    //System.out.println("Output to console Exception");
                                    ble.printStackTrace();
                                }
                            }
						}
					}
					
					baos.reset();

/*					
                    try
                    {
                        iExitVal = daemonProcess.exitValue();
                        //System.out.println("(B)iExitVal: "+iExitVal);
                        break;
                    }
                    catch (IllegalThreadStateException itse)
                    {
                    }
/**/					
				}	// End while..
				
				//System.out.println("FlutterDaemonBgThread dropped out of while");
				
			}
			catch (Exception e)
			{
			    System.out.println("Daemon Exception");
			    swingWorker.cancel(true);

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
					ioe.printStackTrace();
				}
			}

			daemonProcess.destroy();
/*			
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
/**/

            //System.out.println("Exiting FlutterDaemonBgThread");
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
					}

					//System.out.println("(Daemon command)outSb: '"+outSb.toString()+"'");
					
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
				
				//if ( bWirelessConnected )
				if ( bWirelessConnected || bFlutterSelected )
					;
				else
				{
					sb.append(";adb kill-server");
					sb.append(";adb start-server");
				    
					sb.append(";adb kill-server");
					sb.append(";adb start-server");
				}
				
				sb.append(";adb ");
/*
				if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
				{
					sb.append("-s ");
					sb.append(sDeviceName);
					sb.append(" ");
				}
/**/				
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
				//if ( bWirelessConnected )
				if ( bWirelessConnected || bFlutterSelected )
					;
				else
				{
				    sb.append("&&adb kill-server");
					sb.append("&&adb start-server");

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
/*
				if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
				{
					sb.append("-s ");
					sb.append(sDeviceName);
					sb.append(" ");
				}
/**/				
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
				    // Note:
				    // In some cases the package name in the output
				    // is truncated so it won't match..
					int iLoc = 0;
					int iLoc2 = 0;
					int iLoc3 = 0;
					int iStart;
					int iEnd;
					int iLen = commandResultS.length();
					String sTmpPid;
		
					//boolean bFoundPackageName = false;
					bFoundPackageName = false;
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
							
							// Allow for truncated package name
							// so we can get the other information..
							if ( sPackageName.startsWith(packageNameS) )
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

	//{{{	CheckDeviceBgThread
	class CheckDeviceBgThread extends Thread
	{
		public void run()
		{
			//System.out.println("\nCheckDeviceBgThread run()");
			StringBuffer sb = new StringBuffer();
			int iStart = 0;
			int iLoc2 = 0;
			String sT = "";
			sWakefulness = "";
			
			sb = new StringBuffer();		
			if ( iOS == LINUX_MAC )
			{
				sb.append("export PATH=${PATH}:");
				sb.append(androidSdkPathS);
				sb.append("/platform-tools");
				sb.append(";adb ");
			}
			else
			{
				sb.append("SET PATH=");
				sb.append(androidSdkPathS);
				sb.append("/platform-tools");
				sb.append(";%PATH%");

				sb.append("&&adb ");
			}

            if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
            {
                sb.append("-s ");
                sb.append(sDeviceName);
                sb.append(" ");
            }

            sb.append("shell dumpsys power");
            
            if ( iOS == WINDOWS )
                sb.append("\n");
            
			//System.out.println("sb: '"+sb.toString()+"'");
			
			bInternalFinished = false;		
			internalCommandS = sb.toString();
			commandBgThread = new CommandBgThread();
			commandBgThread.start();
	
			// Wait for Thread to finish..
			while ( true )
			{
				try
				{
					Thread.sleep(150);
				}
				catch (InterruptedException ie)
				{
				}

				if ( bInternalFinished )
					break;
			}
			
            // mWakefulness=Asleep
			// mWakefulness=Awake

            if ( (commandResultS != null) && (commandResultS.length() > 0) )
            {
                iLoc2 = commandResultS.indexOf("mWakefulness=");
                iStart = iLoc2;
                if ( iLoc2 != -1 )
                {
                    char cCh;
                    while ( true )
                    {
                        cCh = commandResultS.charAt(iLoc2);
                        if ( cCh > 0x20 )
                        {
                            iLoc2++;
                            continue;
                        }
                        else
                            break;
                    }
                    
                    sT = commandResultS.substring((iStart + 13), iLoc2);
                    sT = sT.trim();
                    sWakefulness = sT;
                }
            }
            
            bCheckDeviceFinished = true;
            
		}
	}    //}}}

	//{{{	ShellBgThread
	class ShellBgThread extends Thread
	{
		public void run()
		{
			//System.out.println("\nShellBgThread run()");
			StringBuffer sb = new StringBuffer();
			String pidS = "";
			
			sb = new StringBuffer();		
			if ( iOS == LINUX_MAC )
			{
				sb.append("export PATH=${PATH}:");
				sb.append(androidSdkPathS);
				sb.append("/platform-tools");
				
				if ( bWirelessConnected || bFlutterSelected )
					;
				else
				{
					sb.append(";adb kill-server");
					sb.append(";adb start-server");
				}
				
				sb.append(";adb ");
/*
				if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
				{
					sb.append("-s ");
					sb.append(sDeviceName);
					sb.append(" ");
				}
/**/				
				sb.append("shell ps");
				
			}
			else
			{
				sb.append("SET PATH=");
				sb.append(androidSdkPathS);
				sb.append("/platform-tools");
				sb.append(";%PATH%");

				//System.out.println("bWirelessConnected: "+bWirelessConnected);
				if ( bWirelessConnected || bFlutterSelected )
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
/*
				if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
				{
					sb.append("-s ");
					sb.append(sDeviceName);
					sb.append(" ");
				}
/**/				
				sb.append("shell ps");
				
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
				try
				{
					Thread.sleep(150);
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
			//if ( bFlutterSelected == false )
			//{
				// Grab package name..
				if ( (commandResultS != null) && (commandResultS.length() > 0) )
				{
				    // Note:
				    // In some cases the package name in the output
				    // is truncated so it won't match..
					int iLoc = 0;
					int iLoc2 = 0;
					int iLoc3 = 0;
					int iStart;
					int iEnd;
					int iLen = commandResultS.length();
					String sTmpPid;
		
					//boolean bFoundPackageName = false;
					bFoundPackageName = false;
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
							//System.out.println("sPackageName: '"+sPackageName+"'");
							
							// You can have this happen:
							// 'com.droidfeed' -> 'com.droidfeed.debug'
							
							// Allow for truncated package name
							// so we can get the other information..
							if ( sPackageName.startsWith(packageNameS) )
							{
							    //System.out.println("Found package name");
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
				}
			//}

			bShellThreadFinished = true;
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
						    // Note:
						    // sTargetId can be quote quote
						    // and gets an error
						    
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
							    //System.out.println("In else");
								// Try to update from PauseBreakpoint..
								variableInfo = (VariableInfo)VariableInfoLHm.get((String)sName);
								if ( variableInfo != null )
								{
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
			String sEvalKind;
			String sInstanceType = "";
			
			String sMessage = "";
			StringBuffer sB;
			
			boolean bIsSystemClass = false;
			boolean bPastFields = false;
			boolean bElements = false;
			boolean bIsList = false;
			boolean bIsClass = false;
			boolean bIsObjectList = false;
			boolean bBoundFieldFinished = false;
			boolean bFunctionFinished = false;
			boolean bFromPropertyName;
			boolean bEvalIsClass;
			boolean bGoodValueAsString = false;
			boolean bExpanded = false;
			
			int iLoc2 = 0;
			int iLoc3 = 0;
			int iLoc4;
			int iLoc5;
			int iLoc6;
			int iLoc7 = 0;
			int iLoc8 = 0;
			int iLoc9 = 0;
			int iLoc10;
			int iLoc11;
			int iLoc12;
			int iLoc14 = 0;
			int iFieldEnd = -1;
			int iNextBoundField = 0;
			int iNextFunction = 0;
			int iSize = 0;
			int iArrayIndex = 0;
			int iExpandRow;
			int iFunctionsEnd = 0;
			int iEndFrame = 0;
			int iIndex2;
			int iChildCount = 0;
			int iInstanceNext = 0;
			int iKindLoc = 0;

			LinkedHashMap ExpandedNodeLHm = new LinkedHashMap();
			Set set;
			Iterator iterator;
			
			NodeFVInfo nodeFVInfo;
			NodeFVInfo tNodeFVInfo = null;
			NodeFVInfo newNodeFVInfo;
			Object nodeObject;
			DefaultMutableTreeNode childNode;
			DefaultMutableTreeNode emptyNode;
			DefaultMutableTreeNode firstNode;
			DefaultTreeModel model = (DefaultTreeModel)(variableJTree.getModel());
/*			
			if ( currentNode == null )
			    System.out.println("currentNode null");
			else
			    System.out.println("currentNode not null");
/**/

			if ( currentNode != null )
			{
			    iChildCount = currentNode.getChildCount();
			    //System.out.println("iChildCount: "+iChildCount);
                if ( iChildCount == 1 )
                {
                    firstNode = currentNode.getFirstLeaf();
                    nodeObject = (Object)firstNode.getUserObject();
                    if ( nodeObject == null )
                        model.removeNodeFromParent(firstNode);
                }
			    
				nodeObject = (Object)currentNode.getUserObject();
				nodeFVInfo = (NodeFVInfo)nodeObject;
				
				sSelectedName = nodeFVInfo.sName;
				//System.out.println("sSelectedName: '"+sSelectedName+"'");
				sSelectedObjectId = nodeFVInfo.sObjectId;
				//System.out.println("sSelectedObjectId: '"+sSelectedObjectId+"'");
				sSelectedClassId = nodeFVInfo.sClassId;
				//System.out.println("sSelectedClassId: '"+sSelectedClassId+"'");
				
				sDisplayClassName = nodeFVInfo.sDisplayClassName;
				//System.out.println("sDisplayClassName: '"+sDisplayClassName+"'");

				bIsClass = nodeFVInfo.bIsClass;
				//System.out.println("bIsClass: "+bIsClass);

                // Set as default if it doesn't match
                // ones in Frame..				
				g_sObjectId = sSelectedObjectId;
				g_sClassId = sSelectedClassId;
			}
			
			TreePath selectedPath = variableJTree.getSelectionPath();
			bExpanded = variableJTree.isExpanded(selectedPath);
			if ( bExpanded )
			{
			    variableJTree.collapsePath(selectedPath);
			    return;
			}
			
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


            // Get BoundVariable information
            // for selected node to expand..
            sMessage = g_sMessage;
            iLoc7 = 0;
            //System.out.println("iEndFrame: "+iEndFrame);
            //System.out.println("sSelectedName: '"+sSelectedName+"'");
            
            // Get variables in this Frame..											
            while ( true )
            {
                //System.out.println("++TOP++");
                if ( iLoc7 != -1 )
                {
                    if ( iLoc7 > iEndFrame )
                        break;
    
                    iLoc8 = sMessage.indexOf(NAME_STRING, iLoc7);
                    if ( iLoc8 != -1 )
                    {
                        iLoc9 = sMessage.indexOf((int)0x22, iLoc8 + 8);
                        if ( iLoc9 != -1 )
                        {
                            // Like: 'time'
                            g_sName = sMessage.substring(iLoc8 + 8, iLoc9);
                            //System.out.println("(Frame)g_sName: '"+g_sName+"'");
                            
                            if ( g_sName.equals(sSelectedName) )
                                ;
                            else
                            {
                                iLoc7 = iLoc8 + 2;  // Next..
                                continue;
                            }
                        }
                        
                        iLoc6 = sMessage.indexOf("classes", iLoc8);
                        if ( iLoc6 != -1 )
                        {
                            iLoc7 = sMessage.indexOf((int)0x22, iLoc6);
                            if ( iLoc7 != -1 )
                            {
                                g_sClassId = sMessage.substring(iLoc6, iLoc7);
                                //System.out.println("(Frame)g_sClassId: '"+g_sClassId+"'");
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
                                //System.out.println("(Frame)g_sClassName: '"+g_sClassName+"'");
                            }
                        }
                        
                        iLoc10 = sMessage.indexOf("objects", iLoc8);
                        if ( iLoc10 != -1 )
                        {
                            iLoc11 = sMessage.indexOf((int)0x22, iLoc10);
                            if ( iLoc11 != -1 )
                            {
                                g_sObjectId = sMessage.substring(iLoc10, iLoc11);
                                sSelectedObjectId = g_sObjectId;
                                //System.out.println("(Frame)g_sObjectId: '"+g_sObjectId+"'");
                            }
                        }
                        
                        break;
                    }
                }
                
                iLoc7 = iLoc8 + 2;	// Next..
            }    // End while..

			for ( int iIndex = 0; iIndex <= 1; iIndex++ )
			{
				//System.out.println("~~TOP~~  iIndex: "+iIndex);
				
				if ( iIndex == 0 )
				    sGetId = g_sObjectId;
				else
				    sGetId = g_sClassId;
				    
				//System.out.println("sGetId: '"+sGetId+"'");
				
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
				
                if ( sGetId.startsWith("classes") )
                {
                    iLoc2 = 0;
                    while ( true )
                    {
                        // classes
                        //System.out.println("--TOP--");
                        iLoc2 = g_sMessage.indexOf("@Function", iLoc2);
                        if ( iLoc2 != -1 )
                        {
                            //System.out.println("@Function");
                            
                            // {"type":"@Function","fixedId":true,"id":"classes
                            // \/1039\/functions\/get%3Aalpha","name":"alpha","_vmName":"get:alpha","owner":{"t
                            // ype":"@Class","fixedId":true,"id":"classes\/1039","name":"Color"},"_kind":"Gette
                            // rFunction","static":false,"const":false,"_intrinsic":false,"_native":false},
    
                            iLoc9 = g_sMessage.indexOf("_kind", iLoc2);
                            if ( iLoc9 != -1 )
                            {
                                iLoc5 = g_sMessage.indexOf((int)0x22, iLoc9 + 8);
                                if ( iLoc5 != -1 )
                                {
                                    sKind = g_sMessage.substring(iLoc9 + 8, iLoc5);
                                    if ( sKind.equals("GetterFunction") )
                                    {
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
    
                                        tNodeFVInfo = new NodeFVInfo(sName);
                                        tNodeFVInfo.sPropertyName = sName;
                                        //System.out.println("(@Function put())sName: '"+sName+"'");
                                        ExpandedNodeLHm.put((String)sName, (NodeFVInfo)tNodeFVInfo);
                                    }
                                }
                            }
                        }
                        else
                            break;
                        
                        iLoc2 += 2;
                        
                    }   // End while..
                }
                else
                {
                    // Get "fields" end..
                    iLoc10 = g_sMessage.indexOf(FIELDS_STRING);
                    if ( iLoc10 != -1 )
                    {
                        iFieldEnd = g_sMessage.indexOf("]", iLoc10);
                    }
                    
                    iLoc2 = 0;
                    while ( true )
                    {
                        // objects
                        //System.out.println("--TOP--");
                        iKindLoc = 0;
                        
                        iLoc2 = g_sMessage.indexOf(TYPE_STRING, iLoc2);
                        if ( iLoc2 != -1 )
                        {
                            iLoc3 = g_sMessage.indexOf((int)0x22, iLoc2 + 8);
                            if ( iLoc3 != -1 )
                            {
                                sType = g_sMessage.substring(iLoc2 + 8, iLoc3);
                                if ( sType.equals("BoundField") )
                                {
                                    //System.out.println("\nBoundField");
                                    // Find next one..
                                    iNextBoundField = g_sMessage.indexOf("BoundField", iLoc2 + 19);
                                   
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
                                    // "kind":"Closure" (Function)
                                    iLoc4 = g_sMessage.indexOf(KIND_STRING, iLoc6);     // From "name"..
                                    if ( iLoc4 != -1 )
                                    {
                                        //System.out.println("Found kind");
                                        iLoc5 = g_sMessage.indexOf((int)0x22, iLoc4 + 8);
                                        if ( iLoc5 != -1 )
                                        {
                                            sKind = g_sMessage.substring(iLoc4 + 8, iLoc5);
                                            //System.out.println("sKind: '"+sKind+"'");
                                        }
            
                                        if ( sKind.equals("List") )	
                                        {
                                            iKindLoc = iLoc4;
                                            tNodeFVInfo.sKind = sKind;
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
                                    
                                    // Try to locate 2nd "kind" to get past "@Instance"
                                    // and sometimes "List" is in the 2nd one..
                                    iLoc7 = g_sMessage.indexOf(KIND_STRING, iLoc4 + 2);     // From "kind"..
                                    //System.out.println("iLoc7: "+iLoc7);
                                    //System.out.println("iNextBoundField: "+iNextBoundField);
                                    if ( iLoc7 != -1 )
                                    //if ( (iLoc7 != -1) && (iLoc7 < iNextBoundField) )
                                    {
                                        iLoc5 = g_sMessage.indexOf((int)0x22, iLoc7 + 8);
                                        if ( iLoc5 != -1 )
                                        {
                                            sKind = g_sMessage.substring(iLoc7 + 8, iLoc5);
                                            //System.out.println("sKind: '"+sKind+"'");
                                        }
                                        
                                        if ( sKind.equals("List") )
                                        {
                                            iKindLoc = iLoc7;
                                            tNodeFVInfo.sKind = sKind;
                                            bIsList = true;
                                            
                                            // Get "length"..
                                            iLoc12 = g_sMessage.indexOf(LENGTH_STRING, iLoc7);
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
                                    
                                    // Class:		"@Instance","class"
                                    // Non Class: 	"@Instance","_vmType"
                                    iLoc8 = g_sMessage.indexOf(VALUE_STRING, iLoc6);	// From "name"..
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
                                            
                                            iLoc12 = g_sMessage.indexOf(NAME_STRING, iLoc10);   // @Instance
                                            if ( iLoc12 != -1 )
                                            {
                                                iLoc11 = g_sMessage.indexOf((int)0x22, iLoc12 + 8);
                                                if ( iLoc11 != -1 )
                                                {
                                                    sClassName = g_sMessage.substring(iLoc12 + 8, iLoc11);
                                                    //System.out.println("sClassName: '"+sClassName+"'");
                                                    tNodeFVInfo.sClassName = sClassName;
                                                }
                                            }
                                        }
                                    }
                                    
                                    iLoc14 = g_sMessage.indexOf("objects", iLoc8);
                                    if ( iLoc14 != -1 )
                                    {
                                        iLoc11 = g_sMessage.indexOf((int)0x22, iLoc14);
                                        if ( iLoc11 != -1 )
                                        {
                                            sObjectId = g_sMessage.substring(iLoc14, iLoc11);
                                            //System.out.println("(_widget)sObjectId: '"+sObjectId+"'");
                                            tNodeFVInfo.sObjectId = sObjectId;
                                        }
                                    }
                                    
                                    // Like: '"valueAsString":"6600233167816000"'
                                    iLoc8 = g_sMessage.indexOf(VALUE_AS_STRING_STRING, iLoc6);
                                    if ( iLoc8 != -1 )
                                    {
                                        // Note:
                                        // if there is no "valueAsString"
                                        // we need to prevent it from finding the
                                        // wrong one..
                                        
                                        //System.out.println("iNextBoundField: "+iNextBoundField);
                                        //System.out.println("iLoc8: "+iLoc8);
                                        if ( (iNextBoundField == -1) ||
                                            ((iNextBoundField != -1) && (iLoc8 < iNextBoundField)) )
                                        {
                                            //System.out.println("Found valueAsString");
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
                                    
                                    // Next..
                                    if ( iNextBoundField != -1 )
                                    {
                                        // There is a next BoundField..
                                        iLoc2 = iNextBoundField - 10;
                                    }
                                    else
                                    {
                                        // No BoundField, use end ']' location..
                                        iLoc2 = iFieldEnd;
                                    }
                                }
                                else if ( sType.equals("@Instance") )
                                {
                                    // List
                                    
                                    // {"type":"@Instance","class":{"type":"@Class","fixedId":true,"id":"classes\/3887",
                                    // "name":"PlanetWidget"},"kind":"PlainInstance","id":"objects\/300"},
                                    
                                    //System.out.println("\n--------------------------------");
                                    //System.out.println("@Instance");
            
                                    // Construct array index..
                                    sB = new StringBuffer();
                                    sB.append("[");
                                    sB.append(iArrayIndex);
                                    sB.append("]");
                                    iArrayIndex++;
                                    
                                    tNodeFVInfo = new NodeFVInfo(sB.toString());
                                    
                                    // Find next @Instance to make sure that
                                    // when we try to find "valueAsString"
                                    // we don't go over..
                                    iInstanceNext = g_sMessage.indexOf("@Instance", iLoc2 + 17);
                                    
                                    // Note:
                                    // For List elements a good way to
                                    // tell a Class or primative is to look at this:
                                    // "type":"@Instance","class"
                                    // "type":"@Instance","_vmType"
                                    
                                    // Get @Instance type..
                                    // iLoc2 @ "type"
                                    // This is probably a better way to do it
                                    // then if it we try to use "valueAsString"..
                                    iLoc6 = g_sMessage.indexOf((int)0x22, iLoc2 + 20);
                                    if ( iLoc6 != -1 )
                                    {
                                        sInstanceType = g_sMessage.substring(iLoc2 + 20, iLoc6);
                                        if ( sInstanceType.equals("class") )
                                            tNodeFVInfo.bIsClass = true;
                                        else
                                            tNodeFVInfo.bIsClass = false;
                                    }
                                        
                                    // Process List..
                                    iLoc7 = g_sMessage.indexOf("classes", iLoc2);		// <- Next pointer..
                                    if ( iLoc7 != -1 )
                                    {
                                        iLoc2 = iLoc7;  // Update..
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
                                        // Check if it went over..
                                        if ( (iInstanceNext == -1) ||
                                                ((iInstanceNext != -1) && (iLoc4 < iInstanceNext)) )
                                            bGoodValueAsString = true;
                                        else
                                            bGoodValueAsString = false;
                                    }
                                            
                                    if ( bGoodValueAsString )
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
                                        //System.out.println("In else, Object List");
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
                                        
                                        iLoc5 = g_sMessage.indexOf("objects", iLoc4);
                                        if ( iLoc5 != -1 )
                                        {
                                            iLoc6 = g_sMessage.indexOf((int)0x22, iLoc5);
                                            if ( iLoc6 != -1 )
                                            {
                                                sObjectId = g_sMessage.substring(iLoc5, iLoc6);
                                                //System.out.println("sObjectId: '"+sObjectId+"'");
                                                tNodeFVInfo.sObjectId = sObjectId;
                                            }
                                        }
                                    }
                                    
                                    //System.out.println("(@Instance put())sB: '"+sB.toString()+"'");
                                    ExpandedNodeLHm.put((String)sB.toString(), (NodeFVInfo)tNodeFVInfo);
                                }
                            }
                        }
                        else
                            break;
                        
                        iLoc2 += 2;
                        
                    }   // End while..
                }
			}	// End for..
			
			//System.out.println("\nDropped out");
			
			set = ExpandedNodeLHm.keySet();
			iterator = set.iterator();
			
			while ( true )
			{
				//System.out.println("**TOP**");
				if ( iterator.hasNext() )
				{
					sKey = (String)iterator.next();
					//System.out.println("sKey: '"+sKey+"'");
					
					nodeFVInfo = (NodeFVInfo)ExpandedNodeLHm.get((String)sKey);
					
					//System.out.println("---- pre evaluate() ----------------------------------------------");
					//System.out.println("nodeFVInfo.sName: '"+nodeFVInfo.sName+"'");
					//System.out.println("(getter)nodeFVInfo.sPropertyName: '"+nodeFVInfo.sPropertyName+"'");
					//System.out.println("nodeFVInfo.sClassName: '"+nodeFVInfo.sClassName+"'");
					//System.out.println("nodeFVInfo.sObjectId: '"+nodeFVInfo.sObjectId+"'");
					//System.out.println("nodeFVInfo.sClassId: '"+nodeFVInfo.sClassId+"'");
					//System.out.println("(get())nodeFVInfo.sValueAsString: '"+nodeFVInfo.sValueAsString+"'");
					//System.out.println("nodeFVInfo.sKind: '"+nodeFVInfo.sKind+"'");
					//System.out.println("nodeFVInfo.sDisplayClassName: '"+nodeFVInfo.sDisplayClassName+"'");
					//System.out.println("nodeFVInfo.bIsClass: "+nodeFVInfo.bIsClass);
					//System.out.println("--------------------------------------------------");

					sValueAsString = "";
					bFromPropertyName = false;
                    sEvalKind = "";
                    bEvalIsClass = false;
/*
					if ( nodeFVInfo.sPropertyName == null )
					    System.out.println("(get())nodeFVInfo.sPropertyName null");
					else
					    System.out.println("(get())nodeFVInfo.sPropertyName: '"+nodeFVInfo.sPropertyName+"'");
/**/

					// Process 'sPropertyName', set for GetterFunction..					
					if ( (nodeFVInfo.sPropertyName != null) && (nodeFVInfo.sPropertyName.length() > 0) )
					{
				
						sExpression = nodeFVInfo.sName;
/*						
						if ( sExpression == null )
							System.out.println("(evaluate())sExpression null");
						else
							System.out.println("(evaluate())sExpression: '"+sExpression+"'");
/**/

						sObjectId = sSelectedObjectId;    // From Frame..
/*						
						if ( sObjectId == null )
							System.out.println("(evaluate())sObjectId null");
						else
							System.out.println("(evaluate())sObjectId: '"+sObjectId+"'");
/**/					
		
                        // Note:
                        // It uses the Class's Object Id:
                        // "name":"DateTime"  "objects\/2932"
		
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
							//System.out.println("*** Evaluate OK ***");
							
							// Note:
							// Sometimes the only indication that it's a List
							// is found in the evaluation result:
							
                            // '{"jsonrpc":"2.0", "result":{"type":"@Instance","_vmType":
                            // "Array","class":{"type":"@Class","fixedId":true,"id":"classes\/72","name":"_List
                            // ","_vmName":"_List@0150898"},"kind":"List","id":"objects\/145","length":9},"id":
                            // "500"}'							
							
							
							// {"jsonrpc":"2.0", "result":{"type":"@Instance","class":{"type":"@Class","fixedId":true,
							// "id":"classes\/222","name":"Duration"},"kind":"PlainInstance","id":"objects\/127"},"id":"497"}
							
							// {"jsonrpc":"2.0", "result":{"type":"@Instance","_vmType":"
							// Smi","class":{"type":"@Class","fixedId":true,"id":"classes\/48","name":"_Smi",
							// "_vmName":"_Smi@0150898"},"kind":"Int","fixedId":true,"id":"objects\/int-2179",
							// "valueAsString":"2179"},"id":"498"}
							
							//sValueAsString = "";
							bIsClass = false;
		
							// Check for 'class' or '_vmType'
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
										bEvalIsClass = true;
										
										// Get type/name..
										iLoc5 = g_sMessage.indexOf(NAME_STRING);
										if ( iLoc5 != -1 )
										{
											iLoc6 = g_sMessage.indexOf((int)0x22, iLoc5 + 8);
											if ( iLoc6 != -1 )
											{
												// Like:  'Duration'
												sTypeName = g_sMessage.substring(iLoc5 + 8, iLoc6);
												//System.out.println("(evaluate())sTypeName: '"+sTypeName+"'");
											}
										}
									}
									else
									{
										bIsClass = false;
									}
								}
								
								//System.out.println("(evaluate())bIsClass: "+bIsClass);
							}
							
							// Get value..	
							iLoc5 = g_sMessage.indexOf(KIND_STRING, iLoc3);		// Help locate '}'..
							if ( iLoc5 != -1 )
							{
								iLoc7 = g_sMessage.indexOf((int)0x22, iLoc5 + 8);
								if ( iLoc7 != -1 )
								{
									sEvalKind = g_sMessage.substring(iLoc5 + 8, iLoc7);
									//System.out.println("sEvalKind: '"+sEvalKind+"'");
									if ( sEvalKind.equals("List") )
									{
									    bIsList = true;
                                        iLoc9 = g_sMessage.indexOf(LENGTH_STRING, iLoc3);		// Help locate '}'..
                                        if ( iLoc9 != -1 )
                                        {
                                            iLoc10 = g_sMessage.indexOf("}", iLoc9 + 9);
                                            if ( iLoc10 != -1 )
                                            {
                                                sLength = g_sMessage.substring(iLoc9 + 9, iLoc10);
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
                                                //tNodeFVInfo.sDisplayClassName = sDisplayClassName;
                                            }
                                        }
									}
								}
							    
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
												//System.out.println("sValueAsString: '"+sValueAsString+"'");
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
                        // These are from BoundField and @Instance..
                        sExpression = nodeFVInfo.sName;
                        
                        //System.out.println("bFromPropertyName: "+bFromPropertyName);
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

                        //System.out.println("bIsList: "+bIsList);
                        if ( bIsList )
                            ;
                        else
                            sDisplayClassName = nodeFVInfo.sDisplayClassName;
                            
	
						//System.out.println("\nsExpression: '"+sExpression+"'");
						//System.out.println("sObjectId: '"+sObjectId+"'");
						//System.out.println("sClassId: '"+sClassId+"'");
						//System.out.println("sValueAsString: '"+sValueAsString+"'");
						//System.out.println("sClassName: '"+sClassName+"'");
						//System.out.println("(sClassName)sTypeName: '"+sTypeName+"'");
						//System.out.println("sDisplayClassName: '"+sDisplayClassName+"'");
						//System.out.println("sType: '"+sType+"'");
						//System.out.println("bIsClass: "+bIsClass);
						//System.out.println("sTypeName: '"+sTypeName+"'");
						//System.out.println("\n");

						newNodeFVInfo = new NodeFVInfo(sExpression);
						
						newNodeFVInfo.sObjectId = sObjectId;
						newNodeFVInfo.sClassId = sClassId;
	
						//System.out.println("bIsClass: "+bIsClass);	
						//System.out.println("bIsObjectList: "+bIsObjectList);
						if ( bIsClass || bIsObjectList )
						{
						    //System.out.println("In bIsClass || bIsObjectList");
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
							childNode = new DefaultMutableTreeNode(newNodeFVInfo);
						}
						else
						{
						    //System.out.println("In else");
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

/*
							if ( (sDisplayClassName != null) && (sDisplayClassName.length() > 0) &&
									(! sDisplayClassName.equals("null")) )
							{
								newNodeFVInfo.sValueAsString = sDisplayClassName;
							}
							else if ( (sValueAsString != null) && (sValueAsString.length() > 0) )
							{
								newNodeFVInfo.sValueAsString = sValueAsString;
							}
/**/

							if ( (sValueAsString != null) && (sValueAsString.length() > 0) )
							{
								newNodeFVInfo.sValueAsString = sValueAsString;
							}
							else if ( (sDisplayClassName != null) && (sDisplayClassName.length() > 0) &&
									(! sDisplayClassName.equals("null")) )
							{
								newNodeFVInfo.sValueAsString = sDisplayClassName;
							}
							else
							{
								// Note:
								// This is the case where it wouldn't
								// have a value..
								newNodeFVInfo.sValueAsString = sTypeName;
							}
							
                            childNode = new DefaultMutableTreeNode(newNodeFVInfo);
						}
						
						//System.out.println("\n======== Add emptyNode ====================================");
						//System.out.println("bEvalIsClass: "+bEvalIsClass);
						//System.out.println("nodeFVInfo.bIsClass: "+nodeFVInfo.bIsClass);
						//System.out.println("sEvalKind: '"+sEvalKind+"'");
						//System.out.println("nodeFVInfo.sKind: '"+nodeFVInfo.sKind+"'");
						//System.out.println("nodeFVInfo.sDisplayClassName: '"+nodeFVInfo.sDisplayClassName+"'");
						//System.out.println("============================================");
						
                        if ( (bEvalIsClass || nodeFVInfo.bIsClass) ||
                            ((sEvalKind.equals("List")) || (nodeFVInfo.sKind.equals("List"))) )
                        {
                            // Add emptyNode to create a branch node..
                            emptyNode = new DefaultMutableTreeNode();
                            childNode.add(emptyNode);
                        }
						
						

						//System.out.println("Final ----------------------------");
						//System.out.println("newNodeFVInfo.sName: '"+newNodeFVInfo.sName+"'");
						//System.out.println("newNodeFVInfo.sClassName: '"+newNodeFVInfo.sClassName+"'");
						//System.out.println("nodeFVInfo.sClassId: '"+nodeFVInfo.sClassId+"'");
						//System.out.println("newNodeFVInfo.sObjectId: '"+newNodeFVInfo.sObjectId+"'");
						//System.out.println("nodeFVInfo.sTargetId: '"+nodeFVInfo.sTargetId+"'");
						//System.out.println("newNodeFVInfo.sValueAsString: '"+newNodeFVInfo.sValueAsString+"'");
						//System.out.println("nodeFVInfo.bIsClass: "+nodeFVInfo.bIsClass);

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
			DefaultMutableTreeNode emptyNode = null;
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
							if ( variableInfo != null )
							{
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
                                
                                //System.out.println("variableInfo.sClassName: '"+variableInfo.sClassName+"'");
                                //System.out.println("variableInfo.bShowAsBranchNode: "+variableInfo.bShowAsBranchNode);
    
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
    
                                //System.out.println("variableInfo.bIsClass: "+variableInfo.bIsClass);
                                //System.out.println("variableInfo.sDisplayClassName: '"+variableInfo.sDisplayClassName+"'");							
                                //if ( (variableInfo.bIsClass) || (variableInfo.sDisplayClassName.contains("List")) )
                                if ( variableInfo.bShowAsBranchNode )
                                {
                                    // Add emptyNode to create a branch node..
                                    emptyNode = new DefaultMutableTreeNode();
                                    child.add(emptyNode);
                                }
                                
                                ((DefaultTreeModel)variableJTree.getModel()).
                                    insertNodeInto(
                                        child,		// newChild
                                        root,		// parent
                                        root.getChildCount());	// index
                                
                            }
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
						    //System.out.println("*** Evaluate OK ***");
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
			
			//System.out.println("Dropped out");
			
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
		    //System.out.println("\nReleaseCheckBgThread run()");
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
			
			//System.out.println("Dropped out of ReleaseCheckBgThread run()");
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
	
	//{{{	CheckKeystorePasswords
	public void CheckKeystorePasswords()
	{
		//System.out.println("\nCheckKeystorePasswords");
		
		// Finish signaled in SUBMIT..
		sKeystorePassword = "";
		sKeyAliasPassword = "";
		sKeystorePath = "";
		sKeyAlias = "";
		
		sAppBundleKeystorePath = "";
		sAppBundleKeyAlias = "";
		sAppBundleKeystorePassword = "";
		sAppBundleKeyAliasPassword = "";
		
		
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
		
		RefreshProperties();
/*		
		try
		{
			Properties prop = new Properties();	
			prop.load(new FileInputStream("config.properties"));
			sKeystorePath = Utils.processPath(prop.getProperty("keystore_path"));
			sKeyAlias = Utils.processPath(prop.getProperty("key_alias"));
			sKeystorePassword = Utils.processPath(prop.getProperty("key_store_password"));
			sKeyAliasPassword = Utils.processPath(prop.getProperty("key_alias_password"));
			
			sAppBundleKeystorePath = Utils.processPath(prop.getProperty("app_bundle_keystore_path"));
			sAppBundleKeyAlias = Utils.processPath(prop.getProperty("app_bundle_key_alias"));
			sAppBundleKeystorePassword = Utils.processPath(prop.getProperty("app_bundle_key_store_password"));
			sAppBundleKeyAliasPassword = Utils.processPath(prop.getProperty("app_bundle_key_alias_password"));
		}
		catch (IOException ioe)
		{
			//System.out.println("Exception: "+ioe.toString());
		}
/**/

/*
        if ( sAppBundleKeyAliasPassword == null )
            System.out.println("sAppBundleKeyAliasPassword null");
        else
            System.out.println("sAppBundleKeyAliasPassword: '"+sAppBundleKeyAliasPassword+"'");
/**/        
        
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
/*
        if ( sUseAppBundle == null )
            System.out.println("sUseAppBundle null");
        else
            System.out.println("sUseAppBundle: '"+sUseAppBundle+"'");
/**/        
        
        
		if ( (sUseAppBundle != null) && (sUseAppBundle.equals("true")) )
		{
            if ( (sAppBundleKeystorePath != null) && (sAppBundleKeystorePath.length() > 0) &&
                    (! sAppBundleKeystorePath.equals("null")) )
                ;
            else
            {
                bShowKeystorePath = true;
                bShowDialog = true;
            }
		    
            if ( (sAppBundleKeyAlias != null) && (sAppBundleKeyAlias.length() > 0) &&
                    (! sAppBundleKeyAlias.equals("null")) )
                ;
            else
            {
                bShowKeyAlias = true;
                bShowDialog = true;
            }
		    
            if ( (sAppBundleKeystorePassword != null) && (sAppBundleKeystorePassword.length() > 0) &&
                    (! sAppBundleKeystorePassword.equals("null")) )
                ;
            else
            {
                bShowKeystorePassword = true;
                bShowDialog = true;
            }

            if ( (sAppBundleKeyAliasPassword != null) && (sAppBundleKeyAliasPassword.length() > 0) &&
                    (! sAppBundleKeyAliasPassword.equals("null")) )
                ;
            else
            {
                bShowKeyAliasPassword = true;
                bShowDialog = true;
            }
		}
		else
		{
		    // Signal that we don't want to
		    // show the App Bundle signing..
            bOkayToDoKeytool = false;
		    
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
			bOkayToDoKeytool = true;
			
			bReleaseCheckFinished = true;    // was off, uncommenting it fixed it doing the rest of the RELEASE..
			bCheckPasswordsFinished = true;
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
			{
				if ( bUsingAppProject )
				{
					fileNameSb.append("/app/build.gradle");
				}
				else
				{
					fileNameSb.append("/build.gradle");
				}
			}


			//System.out.println("fileNameSb: '"+fileNameSb.toString()+"'");
			buildFilenameS = fileNameSb.toString();	// Save original name..
			
			File buildFile = new File(fileNameSb.toString());

/*
			if ( buildFile == null )
				System.out.println("buildFile null");
			else
				System.out.println("buildFile not null");
/**/

			if ( buildFile != null )
			{
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
			}

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
				//System.out.println("(keystoreProperties) iLoc2: "+iLoc2);
				if ( iLoc2 == -1 )
				{
					// Not defined, add def..
					StringBuffer defSb = new StringBuffer();

					iLoc = outSb.indexOf("apply plugin");

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
						//outSb.insert(0, defSb.toString());
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

	//{{{   CheckGradleProjectBgThread
	class CheckGradleProjectBgThread extends Thread
	{
		public void run()
		{
		    //System.out.println("\nCheckGradleProjectBgThread run()");
		    int iLoc2 = 0;
		    int iLoc3 = 0;
		    int iLoc4 = 0;
		    String sIn = "";
		    StringBuffer sB;
		    byte[] buildBuf = null;
		    
			// Construct filename..
			StringBuffer fileNameSb = new StringBuffer(projectHomeS);
			
			if ( bFlutterSelected )
			{
			    sB = new StringBuffer(projectHomeS);
			    sB.append("/android");
			    File tFile = new File(sB.toString());
			    if ( tFile.exists() )
			        fileNameSb.append("/android");
			}
			
			fileNameSb.append("/build.gradle");
			//System.out.println("fileNameSb: '"+fileNameSb.toString()+"'");
			
			File buildFile = new File(fileNameSb.toString());

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
					break;
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
			    sIn = new String(buildBuf);
			    
			    iLoc2 = sIn.indexOf("allprojects");
			    if ( iLoc2 != -1 )
			    {
                    iLoc3 = sIn.indexOf("projectsEvaluated", iLoc2);
                    if ( iLoc3 != -1 )
                    {
                        iLoc4 = sIn.indexOf("options", iLoc3);
                        if ( iLoc4 != -1 )
                        {
                            if ( sIn.charAt(iLoc4 - 1) == '/' )
                                ;   // Already commented out..
                            else
                            {
                                // Comment out..
                                sB = new StringBuffer(sIn);
                                sB = sB.replace(iLoc4 - 2, iLoc4, "//");
                                
                                writeFile(sB.toString().getBytes(), fileNameSb.toString());
                            }
                        }
                    }
			    }
			}
			
			bCheckGradleProjectFinished = true;
		}
	}    //}}}
	
	//{{{   ModifyGradleProjectBgThread
	class ModifyGradleProjectBgThread extends Thread
	{
		public void run()
		{
		    //System.out.println("\nModifyGradleProjectBgThread run()");
   			byte[] buildBuf = null;
			byte[] zeroDzeroA = {(byte)0x0d, (byte)0x0a};
			byte[] zeroA = {(byte)0x0a};
			byte[] doubleQuote = {(byte)0x22};
			int iLoc2 = 0;
			int iLoc3 = 0;
			int iLoc4 = 0;
			int iLoc5 = 0;
			int iLoc6 = 0;
			String sTrail = "";
			String sIn = "";
			String sQuote = new String(doubleQuote);
			String sZeroA = new String(zeroA);
			StringBuffer sB = null;
			StringBuffer tSb = null;

			if ( iOS == LINUX_MAC )
				sTrail = new String(zeroA);
			else
				sTrail = new String(zeroDzeroA);

		    			
			// Construct filename..
			StringBuffer fileNameSb = new StringBuffer(projectHomeS);
			fileNameSb.append("/build.gradle");
			//System.out.println("fileNameSb: '"+fileNameSb.toString()+"'");
			
			File buildFile = new File(fileNameSb.toString());

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
					break;
			}

			buildBuf = readFile(
				512,					// iInitialSize
				fileNameSb.toString());	// fileName

			if ( ((buildBuf != null) && (buildBuf.length > 0)) &&
			    ((sDebugArg != null) && (sDebugArg.length() > 0)) )
			{
			    sIn = new String(buildBuf);
			    
			    iLoc2 = sIn.indexOf("allprojects");
			    if ( iLoc2 != -1 )
			    {
                    iLoc3 = sIn.indexOf("projectsEvaluated", iLoc2);
                    if ( iLoc3 != -1 )
                    {
                        // Modify..
                        sB = new StringBuffer(sIn);
                        
                        // Check if commented out..
                        iLoc6 = sB.indexOf("options", iLoc3);
                        if ( iLoc6 != -1 )
                        {
                            if ( sIn.charAt(iLoc6 - 1) == '/' )
                            {
                                // Un-comment..
                                sB = sB.replace(iLoc6 - 2, iLoc6, "  ");
                            }
                        }
                        
                        iLoc4 = sB.indexOf("add(", iLoc3);
                        if ( iLoc4 != -1 )
                        {
                            iLoc5 = sB.indexOf(sQuote, (iLoc4 + 6));
                            if ( iLoc5 != -1 )
                            {
                                sDebugArg = sDebugArg.trim();
                                sB = sB.replace((iLoc4 + 5), iLoc5, sDebugArg);
                            }
                        }
                    }
                    else
                    {
                        // Create..
                        sB = new StringBuffer(sIn);
                        iLoc3 = sB.indexOf("allprojects");
                        if ( iLoc3 != -1 )
                        {
                            iLoc4 = sB.indexOf(sZeroA, iLoc3);
                            if ( iLoc4 != -1 )
                            {
                                tSb = new StringBuffer();
                                tSb.append(sTrail);
                                tSb.append("    gradle.projectsEvaluated {");
                                tSb.append(sTrail);
                                tSb.append("        tasks.withType(JavaCompile) {");
                                tSb.append(sTrail);
                                tSb.append("            options.compilerArgs.add(");
                                tSb.append('"');
                                
                                sDebugArg = sDebugArg.trim();
                                tSb.append(sDebugArg);
                                tSb.append('"');
                                tSb.append(')');
                                tSb.append(sTrail);
                                tSb.append("        }");
                                tSb.append(sTrail);
                                tSb.append("    }");
                                tSb.append(sTrail);
                                
                                sB = sB.insert((iLoc4 + 1), tSb.toString());
                            }
                        }
                    }
			    }
			    
			    writeFile(sB.toString().getBytes(), fileNameSb.toString());			    
			}
			
			bDebugOptionFinished = true;
		}
	}    //}}}

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
				if ( (sUseAppBundle != null) && (sUseAppBundle.equals("true")) )
				    keysSb.append(sAppBundleKeystorePassword);
				else
				    keysSb.append(sKeystorePassword);
				
				keysSb.append(sEnding);
				
				keysSb.append("keyPassword=");
				if ( (sUseAppBundle != null) && (sUseAppBundle.equals("true")) )
				    keysSb.append(sAppBundleKeyAliasPassword);
				else
				    keysSb.append(sKeyAliasPassword);
				
				keysSb.append(sEnding);
				
				keysSb.append("keyAlias=");
				if ( (sUseAppBundle != null) && (sUseAppBundle.equals("true")) )
				    keysSb.append(sAppBundleKeyAlias);
				else
				    keysSb.append(sKeyAlias);
				
				keysSb.append(sEnding);
				
				keysSb.append("storeFile=");
				if ( (sUseAppBundle != null) && (sUseAppBundle.equals("true")) )
				    keysSb.append(sAppBundleKeystorePath);
				else
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
				
				//System.out.println("Dropped out of IOBgThread wait");
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
		//System.out.println("\nBreakpointDialog()");
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
/*		
		if ( BreakpointAr == null )
		    System.out.println("BreakpointAr null");
		else
		{
		    for ( int iG = 0; iG < BreakpointAr.size(); iG++ )
		    {
		        System.out.println("----------------------------");
		        breakpointInfo = (BreakpointInfo)BreakpointAr.get(iG);
		        System.out.println("["+iG+"]: breakpointInfo.sMethodName: '"+breakpointInfo.sMethodName+"'");
		        System.out.println("breakpointInfo.lMethodId: "+breakpointInfo.lMethodId);
		        System.out.println("breakpointInfo.lClassId: "+breakpointInfo.lClassId);
		    }
		}
/**/

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
				//System.out.println("--TOP-- iB: "+iB);
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
					//System.out.println("bClassMatched: "+bClassMatched);
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
				
				if ( iB < checkListItems.length )
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
		//System.out.println("\nDebugInit()");	
		String sAppName = "";
		String sPackageString = "";
		int iLoc2;
		int iLoc3;
		int iLoc4;
		int iLoc5;
		int iLoc6;
		
		VariableInfoLHm = new LinkedHashMap();
		SelectedNodesLHm = new LinkedHashMap();
		SourceClassInfoHm = new HashMap();
		
		eventQueue = new LinkedList();    // !!
		sVariablesScriptId = "";
		iPauseBreakpointTokenPos = 0;
		iTokenPosLine = 0;
		iPreviousLine = 0;
		sTreeSelectionName = "";
		bFlutterSetLibraryDebuggableStarted = false;
		iLibraryStartIndex = 0;
		sLastSourcePath = "";
/*		
        if ( sDebugUri == null )
            System.out.println("sDebugUri null");    
        else
            System.out.println("sDebugUri: '"+sDebugUri+"'");
/**/

/*
        if ( websocket == null )
            System.out.println("websocket null");
        else
            System.out.println("websocket not null");
/**/

        if ( websocket == null )
        {
            // Only do once..
            try
            {
                URI url = new URI(sDebugUri);
                
                websocket = new WebSocket(url);
                    
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
                // streamListen, Stderr
                //
        
                
                ParamAr = new ArrayList();
                ParamAr.add((String)"Stderr");
        
                String[] getStreamListen3Msg = {
                    "method", "streamListen",
                    "params",
                    "streamId", "[]",
                    "}"};
        
                sReq = ConstructMessage(getStreamListen3Msg);
                websocket = webSocketObject.getWebSocket();
                websocket.send(sReq);
    
                //
                // streamListen, Stdout
                //
        
                
                ParamAr = new ArrayList();
                ParamAr.add((String)"Stdout");
        
                String[] getStreamListen4Msg = {
                    "method", "streamListen",
                    "params",
                    "streamId", "[]",
                    "}"};
        
                sReq = ConstructMessage(getStreamListen4Msg);
                websocket = webSocketObject.getWebSocket();
                websocket.send(sReq);
    
                //
                // streamListen, Logging
                //
        
                
                ParamAr = new ArrayList();
                ParamAr.add((String)"Logging");
        
                String[] getStreamListen5Msg = {
                    "method", "streamListen",
                    "params",
                    "streamId", "[]",
                    "}"};
        
                sReq = ConstructMessage(getStreamListen5Msg);
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
                
    
                if ( iCardShowing == DEBUG_CARD	)
                {
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
                //Scripts scripts;
                //ScriptsAr = new ArrayList();
                ScriptIdAr = new ArrayList();
                
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
                                    //System.out.println("(Add)sScriptId: '"+sTScript+"'");
                                    ScriptIdAr.add((String)sTScript);
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
        }

        if ( iCardShowing == DEBUG_CARD	)
        {
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
        }

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
					    sT = "";
					    if ( (iZ + 1) < paramAr.length )
					    {
                            sT = paramAr[iZ + 1];
                            sT = sT.trim();
                        }
						
						outSb.append((char)0x22);
						outSb.append(sT);
						outSb.append((char)0x22);
						outSb.append(":[");
						iZ += 2;
						bFirst = true;
						continue;
						
					}
					//else if ( paramAr[iZ].equals("]") )
					else
					{
					    if ( iZ < paramAr.length )
					    {
                            if ( paramAr[iZ].equals("]") )
                            {
                                outSb.append("]");
                                iZ += 1;
                                continue;
                            }
                        }
					}
					
					outSb.append((char)0x22);
					outSb.append(paramAr[iZ]);
					outSb.append((char)0x22);
					outSb.append(":");

					bIsString = true;
					if ( (iZ + 1) < paramAr.length )
					{
                        if ( paramAr[iZ + 1].equals("[d") )
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
	    //System.out.println("processMessage()");
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
		{
			System.out.println("sMessage.length(): "+sMessage.length());
			if ( sMessage.length() > 300 )
			    System.out.println(sMessage.substring(0, 300));
			else
			    System.out.println("sMessage: '"+sMessage+"'");
			//System.out.println("sMessage: '"+sMessage+"'");
		}
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
/*		
		if ( eventQueue == null )
		    System.out.println("eventQueue null");
		else
		    System.out.println("eventQueue not null");
/**/		
		// Get as early as possible..
		iLoc6 = sMessage.indexOf("streamNotify");
		if ( iLoc6 != -1 )
		{
			bIsStreamNotify = true;
			//System.out.println("In streamNotify");
			
			// Save message..
			if ( eventQueue != null )
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
			TabInfo tabInfo = null;
			VariableInfoAr = new ArrayList();
			String sReq;
			String sT = "";
			String sTokenPos = "";
			String sKind = "";
			String sMessage = "";
			boolean bMatched;
			boolean bIsDebugOutput = false;
			//String sMessage = g_sMessage;
			//String sMessage = sStreamMessage;	// Use our saved version..

			//System.out.println("eventStack.size(): "+eventStack.size());
			//System.out.println("eventQueue.size(): "+eventQueue.size());
			
			//String sMessage = (String)eventStack.pop();
			
			
			try
			{
			    if ( eventQueue != null )
			        sMessage = (String)eventQueue.remove();
			}
			catch (NoSuchElementException nsee)
			{
				System.out.println("Exception: "+nsee.toString());
			}
			
			//String sId = "";
			int iLoc;
			int iLoc2 = 0;
			int iLoc3 = 0;
			int iLoc4 = 0;
			int iLoc5;
			int iEndBrace = 0;
			int iStart = 0;
			int iLen = 0;

/*			
			if ( sMessage == null )
				System.out.println("sMessage null");
			else
			{
				System.out.println("sMessage.length(): "+sMessage.length());
				System.out.println("sMessage: '"+sMessage+"'");
			}
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
			    //System.out.println("\nGot -BreakpointAdded-");
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
				//System.out.println("(Set)breakpointInfo.iLineNumber: "+breakpointInfo.iLineNumber);
				breakpointInfo.sBreakpointId = sBreakpointId;
				breakpointInfo.sScriptId = sBreakpointScriptId;
				
				BreakpointAr.add((BreakpointInfo)breakpointInfo);
				
			}
			else if ( sKind.equals("PauseBreakpoint") )
			{
			    //System.out.println("\n--PauseBreakpoint--");
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
							    //System.out.println("\n(Match)sBreakpointScriptId == tabInfo.sScriptId: "+iX);
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
				
				// Check if source is on a different tab..
                if ( (TabInfoAr != null) && (TabInfoAr.size() > 0) )
                {
                    bMatched = false;
                    for ( int iX = 0; iX < TabInfoAr.size(); iX++ )
                    {
                        tabInfo = (TabInfo)TabInfoAr.get(iX);
                        //System.out.println("tabInfo.sScriptId: '"+tabInfo.sScriptId+"'");
                        //System.out.println("sBreakpointScriptId: '"+sBreakpointScriptId+"'");
                        if ( sBreakpointScriptId.equals(tabInfo.sScriptId) )
                        {
                            //System.out.println("\n(Match)sBreakpointScriptId == tabInfo.sScriptId: "+iX);
                            tabbedPane.setSelectedIndex(iX);
                            break;
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
			else if ( sKind.equals("Logging") )
			{
			    //System.out.println("\n--Logging--");
				iLoc3 = sMessage.indexOf(MESSAGE_STRING);
				if ( iLoc3 != -1 )
				{
                    iLoc4 = sMessage.indexOf(VALUE_AS_STRING_STRING, iLoc3);
                    if ( iLoc4 != -1 )
                    {
                        iLoc4 += 17;
                        iStart = iLoc4;
                        iLoc5 = sMessage.indexOf((int)0x22, iLoc4);
                        if ( iLoc5 != -1 )
                        {
                            sDebugMessage = sMessage.substring(iStart, iLoc5);
                            sDebugMessage = sDebugMessage.trim();
                            //System.out.println("sDebugMessage: '"+sDebugMessage+"'");
                            bIsDebugOutput = true;
                        }
                    }
				}
			}
			else if ( sKind.equals("WriteEvent") )
			{
                iLoc4 = sMessage.indexOf(BYTES_STRING, iLoc3);
                if ( iLoc4 != -1 )
                {
                    iLoc4 += 9;
                    iStart = iLoc4;
                    iLoc5 = sMessage.indexOf((int)0x22, iLoc4);
                    if ( iLoc5 != -1 )
                    {
                        sT = sMessage.substring(iStart, iLoc5);
                        sT = sT.trim();
                        //System.out.println("sT: '"+sT+"'");
                        
                        byte[] bOut = DatatypeConverter.parseBase64Binary(sT);
                        sDebugMessage = new String(bOut);
                        //System.out.println("sDebugMessage: '"+sDebugMessage+"'");
                        bIsDebugOutput = true;
                    }
                }
			}
			
			if ( bIsDebugOutput )
			{
                try
                {				
                    doc = textPane.getStyledDocument();	
                    iLen = doc.getLength();
                    doc.insertString(iLen, sDebugMessage, normalStyle);
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
			else
			{
			    updateSourceLines((long)0);
			}
			
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
		
		boolean bShowAsBranchNode;

		iLoc7 = 0;
		
		// Get variables in this Frame..											
		while ( true )
		{
			//System.out.println("++TOP++");
			sDisplayClassName = "";
			bShowAsBranchNode = false;
			
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
									{
									    bShowAsBranchNode = true;
									    variableInfo.bShowAsBranchNode = true;
										variableInfo.bIsClass = true;	// 'class' It's a class..
									}
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
                                variableInfo.sValueAsString = sMessage.substring(iLoc3 + 17, iLoc4);
                                //System.out.println("variableInfo.sValueAsString: '"+variableInfo.sValueAsString+"'");
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
							    bShowAsBranchNode = true;
							    variableInfo.bShowAsBranchNode = true;
							    
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
										
										variableInfo.sDisplayClassName = sDisplayClassName;
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
                    //System.out.println("(put())variableInfo.sDisplayClassName: '"+variableInfo.sDisplayClassName+"'");
                    VariableInfoLHm.put((String)variableInfo.sName, (VariableInfo)variableInfo);
                    //System.out.println("(Full)(put())variableInfo.sName: '"+variableInfo.sName+"'");
				}
				else
				{
					variableInfo = (VariableInfo)VariableInfoLHm.get((String)g_sName); 
					if ( variableInfo != null )
					{
						variableInfo.sObjectId = g_sObjectId;
						variableInfo.sClassId = g_sClassId;
						variableInfo.sDisplayClassName = sDisplayClassName;
						variableInfo.bShowAsBranchNode = bShowAsBranchNode;
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
				{
				    if ( g < ConnectDevicesAr.size() )
				    {
				        if ( g < tSa.length )
				            tSa[g] = (String)ConnectDevicesAr.get(g);
				    }
				}
				else
				{
				    if ( g < DevicesAr.size() )
				    {
				        if ( g < tSa.length )
				            tSa[g] = (String)DevicesAr.get(g);
				    }
				}
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
		// Android update for Ant builds..
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
				{
				    if ( (g - 1) < targetDescAr.size() )
				        tSa[g] = (String)targetDescAr.get(g - 1);
				}
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

	//{{{   keytoolDialog()
    public void keytoolDialog()
    {
        //System.out.println("\nkeytoolDialog()");
        
        // C:\>keytool -genkey -keystore my-release-key.jks -keyalg RSA -keysize 2048 -validity 10000
        //  -alias xxx-alias -dname "CN=Joseph Siebenmann, OU=Mobile, O=MyCompany,
        //  L=Culpeper, ST=Virginia, C=US" -keypass xxxxxxxxxx -storepass xxxxxxxxxx

        if ( bDoRefresh )
        {
            // If coming from Password Dialog, it will
            // clear the fields we just filled in..
            RefreshProperties();
        }
		
		keytoolFrame = new JFrame();
		keytoolFrame.setLayout(new BorderLayout());		
		keytoolFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		keytoolFrame.setTitle("Key Store");
		
		int iGridY;
		
		JPanel panel = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(4, 4, 4, 4);	// External padding of the component

		iGridY = 0;
/*
        JLabel organizationLbl = new JLabel("Key store Name: ");
        gbc.gridx = 0;
        gbc.gridy = iGridY;
        gbc.gridwidth = 1;
        panel.add(organizationLbl, gbc);

        keyStoreNameField = new JTextField("release-keystore", 30);	
        keyStoreNameField.addCaretListener(orgCaretListener);
        gbc.gridx = 1;
        gbc.gridy = iGridY;
        gbc.gridwidth = 3;
        panel.add(keyStoreNameField, gbc);
        
        iGridY++;
        
        JLabel organizationLbl = new JLabel("Alias: ");
        gbc.gridx = 0;
        gbc.gridy = iGridY;
        gbc.gridwidth = 1;
        panel.add(organizationLbl, gbc);

        aliasField = new JTextField("com.example", 30);	
        aliasField.addCaretListener(orgCaretListener);
        gbc.gridx = 1;
        gbc.gridy = iGridY;
        gbc.gridwidth = 3;
        panel.add(aliasField, gbc);
        
        iGridY++;
/**/        
        JLabel firstLastNameLbl = new JLabel("First and Last Name: ");
        gbc.gridx = 0;
        gbc.gridy = iGridY;
        gbc.gridwidth = 1;
        panel.add(firstLastNameLbl, gbc);

        firstLastNameField = new JTextField("John Smith", 30);	
        firstLastNameField.addCaretListener(orgCaretListener);
        gbc.gridx = 1;
        gbc.gridy = iGridY;
        gbc.gridwidth = 3;
        panel.add(firstLastNameField, gbc);
        
        iGridY++;

        JLabel organizationUnitLbl = new JLabel("Organizational Unit: ");
        gbc.gridx = 0;
        gbc.gridy = iGridY;
        gbc.gridwidth = 1;
        panel.add(organizationUnitLbl, gbc);

        organizationUnitField = new JTextField("Mobile", 30);	
        organizationUnitField.addCaretListener(orgCaretListener);
        gbc.gridx = 1;
        gbc.gridy = iGridY;
        gbc.gridwidth = 3;
        panel.add(organizationUnitField, gbc);
        
        iGridY++;

        JLabel abOrganizationLbl = new JLabel("Organization: ");
        gbc.gridx = 0;
        gbc.gridy = iGridY;
        gbc.gridwidth = 1;
        panel.add(abOrganizationLbl, gbc);

        abOrganizationField = new JTextField("MyCompany", 30);	
        abOrganizationField.addCaretListener(orgCaretListener);
        gbc.gridx = 1;
        gbc.gridy = iGridY;
        gbc.gridwidth = 3;
        panel.add(abOrganizationField, gbc);
        
        iGridY++;

        JLabel cityLocalityLbl = new JLabel("City or Locality: ");
        gbc.gridx = 0;
        gbc.gridy = iGridY;
        gbc.gridwidth = 1;
        panel.add(cityLocalityLbl, gbc);

        cityLocalityField = new JTextField("MyCity", 30);	
        cityLocalityField.addCaretListener(orgCaretListener);
        gbc.gridx = 1;
        gbc.gridy = iGridY;
        gbc.gridwidth = 3;
        panel.add(cityLocalityField, gbc);
        
        iGridY++;

        JLabel stateProvinceLbl = new JLabel("State or Province: ");
        gbc.gridx = 0;
        gbc.gridy = iGridY;
        gbc.gridwidth = 1;
        panel.add(stateProvinceLbl, gbc);

        stateProvinceField = new JTextField("MyState", 30);	
        stateProvinceField.addCaretListener(orgCaretListener);
        gbc.gridx = 1;
        gbc.gridy = iGridY;
        gbc.gridwidth = 3;
        panel.add(stateProvinceField, gbc);
        
        iGridY++;

        JLabel countryCodeLbl = new JLabel("Country Code: ");
        gbc.gridx = 0;
        gbc.gridy = iGridY;
        gbc.gridwidth = 1;
        panel.add(countryCodeLbl, gbc);
        
        String[] countryCodes = {"Afghanistan (AF)", "Aland Islands (AX)", "Albania (AL)", "Algeria (DZ)", "American Samoa (AS)", "Andorra (AD)",
            "Angola (AO)", "Anguilla (AI)", "Antarctica (AQ)", "Antigua and Barbuda (AG)", "Argentina (AR)", "Armenia (AM)","Aruba (AW)", "Australia (AU)",
            "Austria (AT)", "Azerbaijan (AZ)", "Bahamas (BS)", "Bahrain (BH)", "Bangladesh (BD)", "Barbados (BB)", "Belarus (BY)", "Belgium (BE)",
            "Belize (BZ)", "Benin (BJ)", "Bermuda (BM)", "Bhutan (BT)", "Bolivia (BO)", "Bonaire, Sint Eustatius and Saba (BQ)",
            "Bosnia and Herzegovina (BA)", "Botswana (BW)", "Bouvet Island (BV)", "Brazil (BR)", "British Indian Ocean Territory (IO)",
            "Brunei Darussalam (BN)", "Bulgaria (BG)", "Burkina Faso (BF)", "Burundi (BI)", "Cabo Verde (CV)", "Cambodia (KH)", "Cameroon (CM)",
            "Canada (CA)", "Cayman Islands (KY)", "Central African Republic (CF)", "Chad (TD)", "Chile (CL)", "China (CN)",
            "Christmas Island (CX)", "Cocos Islands (CC)", "Colombia (CO)", "Comoros (KM)", "Congo (CD)", "Congo (CG)",
            "Cook Islands (CK)", "Costa Rica (CR)", "Cote d'Ivoire (CI)", "Croatia (HR)", "Cuba (CU)", "Curacao (CW)",
            "Cyprus (CY)", "Czechia (CZ)", "Denmark (DK)", "Djibouti (DJ)", "Dominica (DM)", "Dominican Republic (DO)", "Ecuador (EC)", "Egypt (EG)",
            "El Salvador (SV)", "Equatorial Guinea (GQ)", "Eritrea (ER)", "Estonia (EE)", "Eswatini (SZ)", "Ethiopia (ET)",
            "Falkland Islands [Malvinas] (FK)", "Faroe Islands (FO)", "Fiji (FJ)", "Finland (FI)", "France (FR)", "French Guiana (GF)",
            "French Polynesia (PF)", "French Southern Territories (TF)", "Gabon (GA)", "Gambia (GM)", "Georgia (GE)", "Germany (DE)",
            "Ghana (GH)", "Gibraltar (GI)", "Greece (GR)", "Greenland (GL)", "Grenada (GD)", "Guadeloupe (GP)", "Guam (GU)", "Guatemala (GT)",
            "Guernsey (GG)", "Guinea (GN)", "Guinea-Bissau (GW)", "Guyana (GY)", "Haiti (HT)", "Heard Island and McDonald Islands (HM)",
            "Holy See (VA)", "Honduras (HN)", "Hong Kong (HK)", "Hungary (HU)", "Iceland (IS)", "India (IN)", "Indonesia (ID)",
            "Iran (IR)", "Iraq (IQ)", "Ireland (IE)", "Isle of Man (IM)", "Israel (IL)", "Italy (IT)", "Jamaica (JM)",
            "Japan (JP)", "Jersey (JE)", "Jordan (JO)", "Kazakhstan (KZ)", "Kenya (KE)", "Kiribati (KI)", "Korea North (KP)",
            "Korea South (KR)", "Kuwait (KW)", "Kyrgyzstan (KG)", "Lao People's Democratic Republic (LA)", "Latvia (LV)",
            "Lebanon (LB)", "Lesotho (LS)", "Liberia (LR)", "Libya (LY)", "Liechtenstein (LI)", "Lithuania (LT)", "Luxembourg (LU)", "Macao (MO)",
            "Republic of North Macedonia (MK)", "Madagascar (MG)", "Malawi (MW)", "Malaysia (MY)", "Maldives (MV)", "Mali (ML)", "Malta (MT)",
            "Marshall Islands (MH)", "Martinique (MQ)", "Mauritania (MR)", "Mauritius (MU)", "Mayotte (YT)", "Mexico (MX)",
            "Micronesia (FM)", "Moldova (MD)", "Monaco (MC)", "Mongolia (MN)", "Montenegro (ME)",
            "Montserrat (MS)", "Morocco (MA)", "Mozambique (MZ)", "Myanmar (MM)", "Namibia (NA)", "Nauru (NR)", "Nepal (NP)", "Netherlands (NL)",
            "New Caledonia (NC)", "New Zealand (NZ)", "Nicaragua (NI)", "Niger (NE)", "Nigeria (NG)", "Niue (NU)", "Norfolk Island (NF)",
            "Northern Mariana Islands (MP)", "Norway (NO)", "Oman (OM)", "Pakistan (PK)", "Palau (PW)", "Palestine (PS)", "Panama (PA)",
            "Papua New Guinea (PG)", "Paraguay (PY)", "Peru (PE)", "Philippines (PH)", "Pitcairn (PN)", "Poland (PL)", "Portugal (PT)",
            "Puerto Rico (PR)", "Qatar (QA)", "Republic of North Macedonia (MK)", "Romania (RO)", "Russian Federation (RU)", "Rwanda (RW)",
            "Reunion (RE)", "Saint Barthelemy (BL)", "Saint Helena (SH)", "Saint Kitts and Nevis (KN)", "Saint Lucia (LC)",
            "Saint Martin (MF)", "Saint Pierre and Miquelon (PM)", "Saint Vincent and the Grenadines (VC)", "Samoa (WS)", "San Marino (SM)",
            "Sao Tome and Principe (ST)", "Saudi Arabia (SA)", "Senegal (SN)", "Serbia (RS)", "Seychelles (SC)", "Sierra Leone (SL)", "Singapore (SG)",
            "Sint Maarten (SX)", "Slovakia (SK)", "Slovenia (SI)", "Solomon Islands (SB)", "Somalia (SO)", "South Africa (ZA)",
            "South Georgia and the South Sandwich Islands (GS)", "South Sudan (SS)", "Spain (ES)", "Sri Lanka (LK)", "Sudan (SD)", "Suriname (SR)",
            "Svalbard and Jan Mayen (SJ)", "Sweden (SE)", "Switzerland (CH)", "Syrian Arab Republic (SY)", "Taiwan (TW)",
            "Tajikistan (TJ)", "Tanzania (TZ)", "Thailand (TH)", "Timor-Leste (TL)", "Togo (TG)", "Tokelau (TK)", "Tonga (TO)",
            "Trinidad and Tobago (TT)", "Tunisia (TN)", "Turkey (TR)", "Turkmenistan (TM)", "Turks and Caicos Islands (TC)", "Tuvalu (TV)",
            "Uganda (UG)", "Ukraine (UA)", "United Arab Emirates (AE)", "United Kingdom (GB)",
            "United States Minor Outlying Islands (UM)", "United States of America (US)", "Uruguay (UY)", "Uzbekistan (UZ)", "Vanuatu (VU)",
            "Venezuela (VE)", "Viet Nam (VN)", "Virgin Islands (VG)", "Virgin Islands (VI)",
            "Wallis and Futuna (WF)", "Western Sahara (EH)", "Yemen (YE)", "Zambia (ZM)", "Zimbabwe (ZW)"};           
 
            
		DefaultListModel defaultListModel = new DefaultListModel();
		for ( int g = 0; g < countryCodes.length; g++ )
		{
			defaultListModel.addElement((String)countryCodes[g]);
		}
		
		countryCodesJList = new JList(defaultListModel);
		countryCodesJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		countryCodesJList.setSelectedIndex(237);
		countryCodesJList.setVisibleRowCount(5);
		
		JScrollPane jScrollPane = new JScrollPane(countryCodesJList);
		Rectangle bounds = countryCodesJList.getCellBounds(237, 238);
		jScrollPane.getViewport().scrollRectToVisible(bounds);

		gbc = new GridBagConstraints();
		//gbc.insets = new Insets(4, 4, 4, 4);	// bottom, left, right, top		
		gbc.gridx = 1;
		gbc.gridy = iGridY;
		gbc.gridwidth = 3;
		panel.add(jScrollPane, gbc);
            
            
            
        
        iGridY++;
/*        
        JLabel organizationLbl = new JLabel("Key store Password: ");
        gbc.gridx = 0;
        gbc.gridy = iGridY;
        gbc.gridwidth = 1;
        panel.add(organizationLbl, gbc);

        keyStorePasswordField = new JTextField("US", 30);	
        keyStorePasswordField.addCaretListener(orgCaretListener);
        gbc.gridx = 1;
        gbc.gridy = iGridY;
        gbc.gridwidth = 3;
        panel.add(keyStorePasswordField, gbc);
        
        iGridY++;

        JLabel organizationLbl = new JLabel("Alias Password: ");
        gbc.gridx = 0;
        gbc.gridy = iGridY;
        gbc.gridwidth = 1;
        panel.add(organizationLbl, gbc);

        aliasPasswordField = new JTextField("US", 30);	
        aliasPasswordField.addCaretListener(orgCaretListener);
        gbc.gridx = 1;
        gbc.gridy = iGridY;
        gbc.gridwidth = 3;
        panel.add(aliasPasswordField, gbc);
        
        iGridY++;
/**/
		panel.setBorder(new LineBorder(Color.GRAY));
		
		JButton submitButton = new JButton("Submit");
		submitButton.setActionCommand("generate_private_key_submit");
		submitButton.addActionListener(actListener);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setActionCommand("generate_private_key_cancel");
		cancelButton.addActionListener(actListener);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(submitButton);
		buttonPanel.add(cancelButton);

		keytoolFrame.getContentPane().add(panel, BorderLayout.CENTER);
		keytoolFrame.getContentPane().add(buttonPanel, BorderLayout.PAGE_END);
		
		keytoolFrame.pack();
		keytoolFrame.setVisible(true);
		keytoolFrame.setResizable(false);
        
    }   //}}}
    
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
		String gradleVersionS = "";
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
				try
				{
					Thread.sleep(100);
				}
				catch (InterruptedException ie)
				{
				}
				
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
			
			//String gradleVersionS = "";
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
					sAndroidPluginVersion = "3.3.3";
					bDoBuildGradleUpdate = true;
				}
				else if ( gradleVersionS.equals("5.1.1") ||
					gradleVersionS.equals("5.2") ||
					gradleVersionS.equals("5.2.1") ||
					gradleVersionS.equals("5.3") ||
					gradleVersionS.equals("5.3.1") ||
					gradleVersionS.equals("5.4") )
				{
				    if ( (sUsingOpenJdk != null) && (sUsingOpenJdk.equals("true")) )
				        sAndroidPluginVersion = "3.4.0";
				    else
				        sAndroidPluginVersion = "3.3.3";
				        
					bDoBuildGradleUpdate = true;
				}
				else if ( gradleVersionS.equals("5.4.1") ||
					gradleVersionS.equals("5.5") ||
					gradleVersionS.equals("5.5.1") ||
					gradleVersionS.equals("5.6") ||
					gradleVersionS.equals("5.6.1") ||
					gradleVersionS.equals("5.6.2") ||
					gradleVersionS.equals("5.6.3") )
				{
				    if ( (sUsingOpenJdk != null) && (sUsingOpenJdk.equals("true")) )
				        sAndroidPluginVersion = "3.5.0";
				    else
				        sAndroidPluginVersion = "3.3.3";
				    
					bDoBuildGradleUpdate = true;
				}
				else if ( gradleVersionS.equals("5.6.4") ||
					gradleVersionS.equals("6.0") ||
					gradleVersionS.equals("6.0.1") ||
					gradleVersionS.equals("6.1") )
				{
				    if ( (sUsingOpenJdk != null) && (sUsingOpenJdk.equals("true")) )
				        sAndroidPluginVersion = "3.6.0";
				    else
				        sAndroidPluginVersion = "3.3.3";
				        
				    bDoBuildGradleUpdate = true;
				}
				else if ( gradleVersionS.equals("6.1.1") ||
					gradleVersionS.equals("6.2") ||
					gradleVersionS.equals("6.2.1") ||
					gradleVersionS.equals("6.2.2") ||
					gradleVersionS.equals("6.3") ||
					gradleVersionS.equals("6.4") ||
					gradleVersionS.equals("6.4.1") ||
					gradleVersionS.equals("6.5") ||
					gradleVersionS.equals("6.5.1") ||
					gradleVersionS.equals("6.6") ||
					gradleVersionS.equals("6.6.1") )
				{
				    if ( (sUsingOpenJdk != null) && (sUsingOpenJdk.equals("true")) )
				        sAndroidPluginVersion = "4.0.0";
				    else
				        sAndroidPluginVersion = "3.3.3";

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
					//sAndroidPluginVersion = "3.3.0";
					sAndroidPluginVersion = "3.3.3";
				}
			}
		}

		//System.out.println("\nbKotlinSelected: "+bKotlinSelected);
		if ( bKotlinSelected )
		{
            //sKotlinVersion = "1.3.50";	// Issues..
            //sKotlinVersion = "1.3.30";
            //sKotlinVersion = "1.3.70";
            sKotlinVersion = "1.3.72";
            //sKotlinVersion = "1.4.0";
            //sKotlinVersion = "1.4.10";
                
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
				    //System.out.println("A iZ: "+iZ);
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
				    //System.out.println("A iZ: "+iZ);
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
					if ( i < tSa.length )
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
		
		if ( bFlutterSelected )
			tSa[0] = "";

        String sLast = "";		
		for ( ; j < targetDescAr.size(); i++, j++ )
		{
			if ( i < tSa.length )
			{
			    tSa[i] = (String)targetDescAr.get(j);
			    sLast = tSa[i];    // Get highest..
			    //System.out.println("tSa["+i+"]: '"+tSa[i]+"'");
			}
		}
		
		SpinnerListModel targetSdkModel = new SpinnerListModel(tSa);
		targetSdkSpinner = new JSpinner(targetSdkModel);
		targetSdkSpinner.setValue((String)sLast);
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
		
        //System.out.println("bFlutterSelected: "+bFlutterSelected);
        //System.out.println("bKotlinSelected: "+bKotlinSelected);
        //System.out.println("bNDKSelected: "+bNDKSelected);
        //System.out.println("bGradleSelected: "+bGradleSelected);

		
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
		Icon attach24Icon = new ImageIcon("images/attach24.png");
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

		attachButton = new JButton();
		attachButton.setIcon(attach24Icon);
		attachButton.setActionCommand("Attach");
		attachButton.setToolTipText("Attach");
		attachButton.addActionListener(actListener);
		toolBar.add(attachButton);

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
		
		commandSubMenu = new JMenu("Command");
        if ( commandSubMenu != null )
        {
            if ( (CommandAr != null) && (CommandAr.size() > 0) )
            {
                commandSubMenu.removeAll();
                JMenuItem tSubMenuItem;
                for ( int iZ = 0; iZ < CommandAr.size(); iZ++ )
                {
                    tSubMenuItem = new JMenuItem(CommandAr.get(iZ));
                    tSubMenuItem.addActionListener(actListener);
                    commandSubMenu.add(tSubMenuItem);
                }
            }
        }

		
		JMenuItem privateKeyMenuItem = new JMenuItem("Generate Key Store");
		privateKeyMenuItem.addActionListener(actListener);

		updateMenuItem = new JMenuItem("Update");    // Android update for Ant buiilds..
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
		JMenuItem refreshMenuItem = new JMenuItem("Refresh");
		refreshMenuItem.addActionListener(actListener);
		
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
		menu.add(subMenu);        // Recent Projects
		menu.add(createMenuItem);
		menu.add(commandSubMenu);
		menu.add(privateKeyMenuItem);
		menu.add(updateMenuItem);
		menu.add(selectDeviceMenuItem);
		menu.add(pullMenuItem);
		menu.add(wirelessSubMenu);
		menu.add(gpsMenuItem);
		menu.add(searchMenuItem);
		menu.add(refreshMenuItem);
		menu.add(selectAllMenuItem);
		menu.addSeparator();
		menu.add(uSdkMenuItem);
		menu.add(uGradleMenuItem);
		menu.add(uFlutterMenuItem);
		menu.add(uKotlinMenuItem);
		menu.add(uNDKMenuItem);
		menuBar.add(menu);
		
		//System.out.println("**1bGradleSelected: "+bGradleSelected);
        if ( (bGradleSelected) || (bNDKSelected) )
        {
            // Hide if not Ant build..
            if ( updateMenuItem != null )
                updateMenuItem.setVisible(false);
        }
        else
        {
            if ( updateMenuItem != null )
                updateMenuItem.setVisible(true);
        }

        if ( (sUseGradlew != null) && (sUseGradlew.equals("true")) )
        {
            if ( commandSubMenu != null )
                commandSubMenu.setVisible(true);
        }
        else
        {
            // Hide if not using Gradlew..
            if ( commandSubMenu != null )
                commandSubMenu.setVisible(false);
        }
            
            
            
		/**
		 *		Debug Menu
		 */

		JMenu debugMenu = new JMenu("Debug");
		JMenuItem breakpointsMenuItem = new JMenuItem("Breakpoints");
		breakpointsMenuItem.addActionListener(actListener);
		JMenuItem refreshClassesMenuItem = new JMenuItem("Refresh Classes");
		if ( bFlutterSelected ) 
			refreshClassesMenuItem.setEnabled(false);
		else
			refreshClassesMenuItem.addActionListener(actListener);

		//JMenuItem markMenuItem = new JMenuItem("Mark");
		//markMenuItem.addActionListener(actListener);
		
		JMenuItem stackMenuItem = new JMenuItem("Dump Stack");
		stackMenuItem.addActionListener(actListener);
		JMenuItem disconnectMenuItem = new JMenuItem("Disconnect");
		disconnectMenuItem.addActionListener(actListener);
		
		debugMenu.add(breakpointsMenuItem);
		debugMenu.add(refreshClassesMenuItem);
		//debugMenu.add(markMenuItem);
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
		
		//System.out.println("Exiting createGui()");
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
			    //System.out.println("-TOP- g: "+g);
				Long LVal = (Long)AllThreadsAr.get(g);
				long lThreadId = LVal.longValue();
				
				sThreadNm = JDWPCommands.command_Name(lThreadId);
				if ( (sThreadNm != null) && (sThreadNm.length() > 0) )
				{
					int iLoc = sThreadNm.indexOf("main");
					if ( iLoc != -1 )
					{
					    //System.out.println("Found Thread");
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

        StringBuffer sB = new StringBuffer();

		//System.out.println("bFlutterSelected: "+bFlutterSelected);
		if ( bFlutterSelected )
		{
            if ( (projectHomeS != null) && (projectHomeS.length() > 0) )
                sB.append(projectHomeS);

            sB.append("/lib");
			//getDartSourceTree();
			getSourceTree(sB.toString());
		}
		else
		{
		    findSourcePath();
		    sB = new StringBuffer();
		    sB.append(sSourceDirectory);
		    
		    String sModPackageName = sPackageName.replace('.', (char)0x2f);
		    sB.append((char)0x2f);
		    sB.append(sModPackageName);
		    //System.out.println("sB: '"+sB.toString()+"'");
		    
			getTreeClasses(sB.toString());
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

			//System.out.println("\nbOK: "+bOK);
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
						//System.out.println("\n(Single device)sDeviceName: '"+sDeviceName+"'");
					}
					else
					{
						// More than one device,
						// put up Select Dialog..
						iSelectMode = SELECT_CONNECT;
						bSelectFinished = false;
						//selectDeviceDialog();
						
                        if ( (DevicesAr	!= null) && (DevicesAr.size() > 0) )
                        {
                            if ( DevicesAr.size() > 1 )
                            {
                                // Open Dialog..
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
                            else
                            {
                                // Single device, show it..
                                deviceLabel.setText((String)DevicesAr.get(0));
                            }
                        }
						
/*						
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
/**/						
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
						//System.out.println("\nsDeviceName: '"+sDeviceName+"'");
						
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

	//{{{	WakeDeviceBgThread
	class WakeDeviceBgThread extends Thread
	{
		public void run()
		{
			//System.out.println("WakeDeviceBgThread run()");
			StringBuffer internalSb = new StringBuffer();
			
			if ( iOS == LINUX_MAC )
			{
				internalSb.append("export PATH=${PATH}:");
				internalSb.append(androidSdkPathS);
				internalSb.append("/platform-tools");
				
				internalSb.append(";adb ");
			}
			else
			{
				internalSb.append("SET PATH=");
				internalSb.append(androidSdkPathS);
				internalSb.append("/platform-tools");
				internalSb.append(";%PATH%");
				
				internalSb.append("&&adb ");
			}
			
			if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
			{
				internalSb.append("-s ");
				internalSb.append(sDeviceName);
				internalSb.append(" ");
			}

			//internalSb.append("shell input keyevent 26");    // KEYCODE_POWER
			internalSb.append("shell input keyevent 224");    // KEYCODE_WAKEUP
			
            if ( iOS == WINDOWS )
                internalSb.append("\n");
			
			bInternalFinished = false;		
			internalCommandS = internalSb.toString();
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
			
			bWakeDeviceFinished = true;
		}
	}    //}}}

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
			    //System.out.println("A iZ: "+iZ);
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
			if ( (LsOutAr != null) && (iSelectedIndex < LsOutAr.size()) )
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
			if ( (LsOutAr != null) && (iSelectedIndex < LsOutAr.size()) )
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
/*
		if ( sTitle == null )
		    System.out.println("sTitle null");
		else
		    System.out.println("sTitle: '"+sTitle+"'");
/**/		
		        
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

		if ( tabbedPane != null )
		{
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

            if ( tabPanel != null )
            {
                tabbedPane.setTabComponentAt(
                    iTabCount,	// index	works
                    tabPanel);	// component
            }
    
            //System.out.println("(setSelectedIndex())iTabCount: "+iTabCount);
            tabbedPane.setSelectedIndex(iTabCount);		// works
            bTabSelected = false;    // Reset..
        }
		
		//System.out.println("\nExiting addTab()");

	}	//}}}
	
	//{{{	addPane()
	private JComponent addPane()
	{
		//System.out.println("\naddPane()");
		Font defaultFont = new Font("Monospaced", Font.BOLD, 13);
		
		//TabTextAreaInfo tabTextAreaInfo;
		TabInfo tabInfo = null;

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
				{
				    // For LibGdx projects..
                    if ( bUsingAndroid )
                        sb.append("/android");
				    
					sb.append("/build/outputs/apk");
				}
				
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

		// Note:
		// Sometimes when you do the Install
		// it has no akp, so we wait here..
		
		// Wait till it's ready..
		while ( true )
		{
		    if ( folder.exists() )
		        break;
		    
		    try
		    {
		        Thread.sleep(250);  
		    }
		    catch (InterruptedException ie)
		    {
		    }
		}
		
		//if ( folder.exists() )
		//{
			//System.out.println("Folder exists");
			File[] listOfFiles = folder.listFiles();
			File file;
			
			String fNameS;		
			for ( int g = 0; g < listOfFiles.length; g++ )
			{
			    //System.out.println("--TOP-- g: "+g);
				file = listOfFiles[g];
				fNameS = file.getName();
				//System.out.println("fNameS: '"+fNameS+"'");
/*				
				if ( ((iBuildType == RELEASE_BUILD) && (fNameS.endsWith("release.apk"))) ||
				    ((iBuildType == RELEASE_BUILD) && (fNameS.endsWith("unsigned.apk"))) ||
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
                            //fNameS.endsWith("debug.apk") )
                            fNameS.endsWith("debug.apk") ||
                            fNameS.endsWith("unsigned.apk") )
						altS = fNameS;
				}
/**/				
				if ( fNameS.endsWith(".apk") )
				{
					//System.out.println("Found file");
					apkNameS = fNameS;
					break;
				}
			}

			//if ( apkNameS.equals("") )
				//apkNameS = altS;
/*
			if ( apkNameS == null )
				System.out.println("(Final)apkNameS null");
			else
				System.out.println("(Final)apkNameS: '"+apkNameS+"'");
/**/
			
			
		//}
	}	//}}}

	//{{{	createChildren()
	void createChildren(File fileRoot, DefaultMutableTreeNode node)
	{
		//System.out.println("\ncreateChildren()");
		File[] files = fileRoot.listFiles();
		String sName;
		String sPath;
		if ( files == null )
			return;
		
		for ( int iZ = 0; iZ < files.length; iZ++ )
		{
		    //System.out.println("\n--TOP-- "+iZ);
			sName = files[iZ].getName();
			sPath = files[iZ].getAbsolutePath();
			//System.out.println("(getName()): '"+sName+"'");
			//System.out.println("(getAbsolutePath()): '"+sPath+"'");
			DefaultMutableTreeNode childNode = 
				new DefaultMutableTreeNode(
				    new NodeInfo(0, sPath, "", sName, "", false));
					
			node.add(childNode);
			//System.out.println("isDirectory(): "+files[iZ].isDirectory());
			if ( files[iZ].isDirectory() )
			{
				createChildren(files[iZ], childNode);
			}
		}
	}	//}}}
	
	//{{{	getTreeClasses()	
	//private void getTreeClasses()
	private void getTreeClasses(String sSourcePath)
	{
		//System.out.println("== getTreeClasses() ==");
		// Like: 'C:/Android/Dev/BottomNavAS/app/src/main/java/com/example/bottomnavas'
		//System.out.println("sSourcePath: '"+sSourcePath+"'");
		String sRoot = "";
		String sRootPath = "";
		System.out.println();
		if ( SourceClassInfoHm == null )
		    SourceClassInfoHm = new HashMap();
		
		// Note:
		// Use original 'packageNameS' because sometimes
		// the package name from 'ps shell'
		// is different..
		//System.out.println("packageNameS: '"+packageNameS+"'");
		String sOut = Utils.convertToSlashes(packageNameS);

		// Like:  'com.example.bottomnavas'
		//System.out.println("sPackageName: '"+sPackageName+"'");
		int iLoc3 = packageNameS.lastIndexOf(".");
		if ( iLoc3 != -1 )
		    sRoot = packageNameS.substring(iLoc3 + 1);
		
		//System.out.println("sRoot: '"+sRoot+"'");
        iLoc3 = sSourcePath.indexOf(sRoot);
        if ( iLoc3 != -1 )
        {
            sRootPath = sSourcePath.substring(0, iLoc3);
            //System.out.println("sRootPath: '"+sRootPath+"'");
        }

		
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
		LineInfo lineInfo;
		int iLoc;
		int iLoc2;
		//int iLoc3;
		int iLoc4;
		int iLoc5 = 0;
		int iLastSlash;
		int iLineNumber = 0;
		int iStart = 0;
		int iRootLoc = 0;
		long lClassId = 0;
		long lTypeId = 0;
		long lMethodId = 0;
		long lLineCodeIndex = 0;
		boolean bDoContinue;
		Integer IVal;
		Long LVal;
		String sSig;
		String sSignature = "";
		String sFixedString;
		String sPath = "";
		String sName = "";
		String sKeyPath = "";
		String sSubPath = "";
		String sDir = "";
		String sFNm = "";
		String sFileNm = "";
		String sSourceNm = "";
		String sT = "";
		String sEnd = "";
		String sPackagePath = "";
		StringBuffer sB;
		StringBuffer tSb;
        File fileObject;
        File[] files;

		HashMap LineHm = null;
		HashMap tHm = null;
		HashMap PathHm = null;
		TreeMap treeMap;
		MethodInfo methodInfo;
		LineTableInfo lineTableInfo;
		DefaultMutableTreeNode emptyNode;
		DefaultMutableTreeNode parentNode = null;
		DefaultMutableTreeNode childNode;
		DefaultMutableTreeNode root;
		DefaultTreeModel treeModel;
        Set setKeys;
        Iterator iterator;
        Set setKeys2;
        Iterator iterator2;
        Set treeSet;
        Iterator treeIterator;
        Entry entry;

		DefaultTreeModel model = (DefaultTreeModel)jTree.getModel();
		root = (DefaultMutableTreeNode)model.getRoot();
		root.setUserObject(sRoot);
		
        // Clear..		
        root.removeAllChildren();
        model.reload();
		
		
		parentNode = root;

/*		
		if ( AllClassesAr == null )
			System.out.println("AllClassesAr null");
		else
		{
			System.out.println("AllClassesAr.size(): "+AllClassesAr.size());
            for ( int iJ = 0; iJ < AllClassesAr.size(); iJ++ )
            {
                System.out.println("==================================");
				classInfo = (ClassInfo)AllClassesAr.get(iJ);
				System.out.println("["+iJ+"]classInfo.sSignature: '"+classInfo.sSignature+"'");
                System.out.println("classInfo.lTypeId: "+classInfo.lTypeId);
            }
		}
/**/				

		if ( (AllClassesAr != null) && (AllClassesAr.size() > 0) )
		{
		    // Key: com/kevalpatel2106/sample/RulerDemoActivity
		    // Value: HashMap of lineNumber and lineCodeIndex
		    NodeHm = new HashMap();
		    PathHm = new HashMap();
		    
			for ( int g = 0; g < AllClassesAr.size(); g++ )
			{
				//System.out.println("----TOP----");
				bDoContinue = false;
				classInfo = new ClassInfo();
				classInfo = (ClassInfo)AllClassesAr.get(g);
				
				// Get signature..
				sSignature = classInfo.sSignature;
				//System.out.println("sSignature: '"+sSignature+"'");
				iLoc3 = sSignature.indexOf("$");
				iLoc4 = sSignature.indexOf(";");
				
				// Like:  com/dp/logcatapp/fragments/logcatlive/LogcatLiveFragment
				if ( iLoc3 != -1 )
				    sPath = sSignature.substring(1, iLoc3);    
				else
				    sPath = sSignature.substring(1, iLoc4);
				
				//System.out.println("sPath: "+sPath+"'");
				
				// Ignore 'R'..
				iLoc5 = sPath.lastIndexOf("/");
				if ( iLoc5 != -1 )
				{
				    sEnd = sPath.substring(iLoc5 + 1);
				    //System.out.println("sEnd: '"+sEnd+"'");
				    
				    sT = sPath.substring(iLoc5 + 1);
				    if ( sT.equals("R") )
				        continue;
				}
				
				iLoc5 = sPath.indexOf("/");
				if ( iLoc5 != -1 )
				    sPackageNameLead = sPath.substring(0, iLoc5 + 1);    // Like: 'com/' 

				// Get Methods..
				lTypeId = classInfo.lTypeId;
				//System.out.println("lTypeId: "+lTypeId);

                SourceClassInfoHm.put((Long)lTypeId, (String)sEnd);
				
				JDWPCommands.command_MethodsWithGeneric(lTypeId);
				if ( (AllMethodsAr != null) && (AllMethodsAr.size() > 0) )
				{
				    if ( NodeHm.containsKey((String)sPath) )
				        tHm = (HashMap)NodeHm.get((String)sPath);
				    else
				        tHm = new HashMap();
				    
				    for ( int iJ = 0; iJ < AllMethodsAr.size(); iJ++ )
				    {
				        methodInfo = (MethodInfo)AllMethodsAr.get(iJ);
				        
				        lMethodId = methodInfo.lMethodId;
				        //System.out.println("methodInfo.sName: '"+methodInfo.sName+"'");
				        //System.out.println("methodInfo.sSignature: '"+methodInfo.sSignature+"'");
				        
				        JDWPCommands.command_LineTable((long)lTypeId, (long)lMethodId);
				        
				        if ( (LineTableAr != null) && (LineTableAr.size() > 0) )
				        {
				            for ( int iZ = 0; iZ < LineTableAr.size(); iZ++ )
				            {
				                lineInfo = new LineInfo();
				                lineTableInfo = (LineTableInfo)LineTableAr.get(iZ);
				              
				                iLineNumber = lineTableInfo.iLineNumber;
				                //lLineCodeIndex = lineTableInfo.lLineCodeIndex;
				                //lineInfo.iLineNumber = iLineNumber;
				                lineInfo.lLineCodeIndex = lineTableInfo.lLineCodeIndex;
				                lineInfo.lMethodId = lMethodId;
				                lineInfo.lTypeId = classInfo.lTypeId;
				                lineInfo.sMethodName = methodInfo.sName;
				                
				                //tHm.put((Integer)iLineNumber, (Long)lLineCodeIndex);
				                tHm.put((Integer)iLineNumber, (LineInfo)lineInfo);
				            }
				        }
				    }    // End for..
				    
                    // Update..				    
				    NodeHm.put((String)sPath, (HashMap)tHm);
				    
				}
			}	// End for..
			
            if ( NodeHm.size() > 0 )
            {
                //System.out.println("===========================");
                setKeys = NodeHm.keySet();
                iterator = setKeys.iterator();
                //System.out.println("sRoot: '"+sRoot+"'");
                
                while ( iterator.hasNext() )
                {
                    // Get Key, like:  'com/example/bottomnavas/ui/home/HomeViewModel'
                    //System.out.println("--TOP--");
                    sKeyPath = (String)iterator.next();
                    //System.out.println("sKeyPath: '"+sKeyPath+"'");
                    
                    iLastSlash = sKeyPath.lastIndexOf("/");
                    iRootLoc = sKeyPath.indexOf(sRoot);
                    if ( iRootLoc != -1 )
                    {
                        iLoc2 = iRootLoc;
                        iLoc2 += sRoot.length();
                        
                        parentNode = root;
                        sSubPath = sRoot;  // Reset..
                        
                        // Process path for this source..                        
                        while ( true )
                        {
                            //System.out.println("==TOP==");
                            if ( iLoc2 == iLastSlash )
                            {
                                //System.out.println("At end");
                                sFileNm = sKeyPath.substring(iLastSlash + 1);   // 'StringExtKt'
                                //System.out.println("sFileNm: '"+sFileNm+"'");
                                
                                // At end, add source file name..
                                sB = new StringBuffer();
                                sB.append(sRootPath);
                                sB.append(sSubPath);
                                
                                //  'C:/Android/Dev/android-ruler-picker-master/app/src/main/java/com/kevalpatel2106/sample'
                                //System.out.println("sB: '"+sB.toString()+"'");
                                
                                fileObject = new File(sB.toString());
                                files = fileObject.listFiles();
                                
                                if ( files != null )
                                {
                                    sFNm = "";  // Reset..
                                    for ( int iZ = 0; iZ < files.length; iZ++ )
                                    {
                                        sName = files[iZ].getName();
                                        sPath = files[iZ].getAbsolutePath();
                                        //System.out.println("["+iZ+"]:(getName()): '"+sName+"'");
                                        //System.out.println("["+iZ+"]:(getAbsolutePath()): '"+sPath+"'");
                                        
                                        // Get path from package start to try to prevent
                                        // duplicates..
                                        //System.out.println("sPackageNameLead: '"+sPackageNameLead+"'");
                                        tSb = new StringBuffer(sPackageNameLead);
                                        tSb.setCharAt(tSb.length() - 1, (char)0x5c);
                                        iLoc4 = sPath.indexOf(tSb.toString()); 
                                        if ( iLoc4 != -1 )
                                            sPackagePath = sPath.substring(iLoc4);
                                        
                                        //System.out.println("sPackagePath: '"+sPackagePath+"'");
                                        //System.out.println("contains(): "+sPackagePath.contains(sFileNm));
                                        //if ( sPath.contains(sFileNm) )
                                        if ( sPackagePath.contains(sFileNm) )
                                        {
                                            iLoc3 = sPath.lastIndexOf((int)0x5c);
                                            if ( iLoc3 != -1 )
                                            {
                                                sFNm = sPath.substring(iLoc3 + 1);
                                                //System.out.println("sFNm: '"+sFNm+"'");
                                                break;
                                            }
                                        }
                                    }
                                }
                                
                                //System.out.println("\n(Node)sSubPath: '"+sSubPath+"'");
                                //System.out.println("(Node)(Name): '"+sFNm+"'");
                                if ( (sFNm != null) && (sFNm.length() > 0) )
                                {
                                    childNode = new DefaultMutableTreeNode(
                                        new NodeInfo(
                                            0,          // lId
                                            sPath,      // sFullPath
                                            sSubPath,   // sSubPath
                                            sFNm,       // sName
                                            "",         // sSignature
                                            false));    // bIsClass
                                    
                                    //System.out.println("(Root): "+parentNode.toString());
                                    parentNode.add(childNode);
                                }
                                
                                break;
                            }
                            else
                            {
                                iLoc2++;    // Get past '/'..
                                iStart = iLoc2;
                                for ( ; sKeyPath.charAt(iLoc2) != '/'; iLoc2++ );
                                sDir = sKeyPath.substring(iStart, iLoc2);
                                //System.out.println("sDir: '"+sDir+"'");
                                sSubPath = sKeyPath.substring(iRootLoc, iLoc2);
                                //System.out.println("sSubPath: '"+sSubPath+"'");
                                
                                //System.out.println("containsKey(): "+PathHm.containsKey((String)sSubPath));
                                if ( PathHm.containsKey((String)sSubPath) )
                                {
                                    // In HashMap..
                                    // Get Value..
                                    parentNode = (DefaultMutableTreeNode)PathHm.get((String)sSubPath);
                                   
                                    //System.out.println("(Updated)(Parent): "+parentNode.toString());
                                }
                                else
                                {
                                    // Not in HashMap, add it..
                                    //System.out.println("\n(Add)(Node)sSubPath: '"+sSubPath+"'");
                                    //System.out.println("(Node)(Name): '"+sDir+"'");
                                    if ( (sDir != null) && (sDir.length() > 0) )
                                    {
                                        childNode = new DefaultMutableTreeNode(
                                            new NodeInfo(
                                                0,
                                                "",
                                                sSubPath,
                                                sDir,
                                                "",
                                                false));
                                        
                                        //System.out.println("(Parent): "+parentNode.toString());
                                        parentNode.add(childNode);
                                        parentNode = childNode;
                                        //System.out.println("*(Updated)(Parent): "+parentNode.toString());
    
                                        // Add..                                    
                                        PathHm.put((String)sSubPath, (DefaultMutableTreeNode)childNode);
                                    }
                                }
                            }
                        }   // End while..
                    }
                }   // End while..
            }


			
/*			
			if ( TreeClassesAr == null )
				System.out.println("TreeClassesAr null");
			else
				System.out.println("TreeClassesAr.size(): "+TreeClassesAr.size());
/**/

			
            // Expand all..
            for ( int iZ = 0; iZ < jTree.getRowCount(); iZ++ )
                jTree.expandRow(iZ);
            
            jTree.setEditable(false);
            jTree.setExpandsSelectedPaths(true);
            jTree.setShowsRootHandles(false);
            jTree.setRootVisible(true);

		}
		
		//System.out.println("\nExiting getTreeClasses()");
		
	}	//}}}
    
	//{{{	getSourceTree()
	//private void getDartSourceTree()
	private void getSourceTree(String sSourcePath)
	{
		//System.out.println("getDartSourceTree()");
		//System.out.println("\ngetSourceTree()");
		//System.out.println("sSourcePath: '"+sSourcePath+"'");

		// Get source files..
		//StringBuffer sB = new StringBuffer();
		StringBuffer sB = new StringBuffer(sSourcePath);
		
		
		String sDir = sB.toString();
		//System.out.println("sDir: '"+sDir+"'");
		//LibFileAr = new ArrayList();
		
		String sEnd = "";
		int iLoc2 = sDir.lastIndexOf("/");
		if ( iLoc2 != -1 )
		{
		    sEnd = sDir.substring(iLoc2 + 1);
		}
		
		//System.out.println("sEnd: '"+sEnd+"'");
		
		DefaultTreeModel treeModel = null;
		
		DefaultMutableTreeNode parentNode = null;
		DefaultMutableTreeNode rootNode = null;
		
		DefaultMutableTreeNode child;
		DefaultMutableTreeNode dirNode = null;
		DefaultMutableTreeNode sourceNode = null;
		DefaultMutableTreeNode root = null;
		
		DefaultTreeModel model = (DefaultTreeModel)jTree.getModel();
		root = (DefaultMutableTreeNode)model.getRoot();
		
		root.setUserObject(sEnd);
		
		// Clear..		
		root.removeAllChildren();
		model.reload();

		
		File fileObject = new File(sDir);
		if ( fileObject.exists() && fileObject.isDirectory() )
		{
			createChildren(fileObject, root);
		}
		
		// Expand all..
		for ( int iJ = 0; iJ < jTree.getRowCount(); iJ++ )
			jTree.expandRow(iJ);
		
		jTree.setEditable(false);
		jTree.setExpandsSelectedPaths(true);
		jTree.setShowsRootHandles(false);
		jTree.setRootVisible(true);
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
		String sPath = "";
		//String sScriptId = "";
		sScriptId = "";
		String sSourceText = "";
		String sConvertedKey = "";
		String sFlipped = "";
		String sValue = "";
		String[] tSAr = null;
		int iLoc2;
		int iLoc5 = 0;
		int iLoc6 = 0;
		int iStart;
		int iScriptIndex;
		int iSourceIndex = 0;
		int iTextLen;
		int iLineNumber = 0;
		long lLineCodeIndex = 0;
		Integer IVal;
		Long LVal;
		long[] tLAr;
		int[] tIAr;
		//Scripts scripts = null;
		//TabTextAreaInfo tabTextAreaInfo;
		TabInfo tabInfo = null;
		ArrayList tAr;
		HashMap lineHm;
		TreeMap treeMap;
		Set setKeys;
		Iterator iterator;
		Set treeSet;
        Iterator treeIterator;
        Entry entry;
        LineInfo lineInfo;
		
		//String[] sTokenPosTableAr = null;
		boolean bTabAdded = false;

		if ( bFlutterSelected )
		{
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
                    if ( (ScriptIdAr != null) && (ScriptIdAr.size() > 0) )
                    {
                        for ( iScriptIndex = 0; iScriptIndex < ScriptIdAr.size(); iScriptIndex++ )
                        {
                            sScriptId = (String)ScriptIdAr.get(iScriptIndex);
                            //System.out.println("sScriptId: '"+sScriptId+"'");
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
                        tSAr = new String[tAr.size()];
                        for ( int iZ = 0; iZ < tAr.size(); iZ++ )
                        {
                            tSAr[iZ] = (String)tAr.get(iZ);
                            //System.out.println("["+iZ+"]: '"+tSAr[iZ]+"'");
                        }
                        
                        //scripts.sTokenPosTable = tSAr;
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
        }
        else
        {
            // Expects 'sFullSourcePath' loaded..
            sFullSourcePath = sSourceFile;
            
            iLoc2 = sSourceFile.lastIndexOf((int)0x5c);     // '\'
            if ( iLoc2 != -1 )
                sScriptsSearchName = sSourceFile.substring(iLoc2 + 1);  // Tab name..
                
            //System.out.println("sScriptsSearchName: '"+sScriptsSearchName+"'");
        }
		
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

/*		
        if ( TabInfoAr == null )
            System.out.println("(After default)TabInfoAr null");
        else
            System.out.println("(After default)TabInfoAr.size(): "+TabInfoAr.size());
/**/			
		
		
		
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
			if ( iSourceIndex < iTabCount )
			{
				//System.out.println("Selecting tab with source on (iSourceIndex): "+iSourceIndex);
				// Select Tab with Method..						
				//System.out.println("Doing setSelectedIndex() on iSourceIndex: "+iSourceIndex);
				tabbedPane.setSelectedIndex(iSourceIndex);
				bTabSelected = false;    // Reset..
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

		//System.out.println("bTabAdded: "+bTabAdded);
		if ( bTabAdded )
		{
			// Note:
			// if tab was added, iGetIndex is now at the
			// proper, last, position..
			//System.out.println("Doing setSelectedIndex() on iGetIndex: "+iGetIndex);
			tabbedPane.setSelectedIndex(iGetIndex);
			bTabSelected = false;    // Reset..
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
		
		if ( (TabInfoAr != null) && (TabInfoAr.size() > 0) )
		{
		    
		    //System.out.println("\n(Updating)iGetIndex: "+iGetIndex);
		    if ( iGetIndex < TabInfoAr.size() )
		        tabInfo = (TabInfo)TabInfoAr.get(iGetIndex);
		    
		    if ( tabInfo != null )
		    {
                jTextArea = tabInfo.jTextArea;
                
/*			
                if ( tabInfo.sSourcePath == null )
                    System.out.println("tabInfo.sSourcePath null");
                else
                    System.out.println("tabInfo.sSourcePath: '"+tabInfo.sSourcePath+"'");
/**/			
                
                if ( bFlutterSelected )
                {
                    // Load 'sScriptId'..
                    //System.out.println("(Load)sScriptId: '"+sScriptId+"'");
                    tabInfo.sScriptId = sScriptId;
                    
                    // Load 'sTokenPosTable'..
                    tabInfo.sTokenPosTable = tSAr;
                    
                }
                else
                {
                    sConvertedKey = "";
                    if ( (tabInfo.sSourcePath != null) && (tabInfo.sSourcePath.length() > 0) )
                    {
                        sFlipped = Utils.processPath(tabInfo.sSourcePath);
                        iLoc5 = sFlipped.indexOf(sPackageNameLead);
                        if ( iLoc5 != -1 )
                        {
                            iLoc6 = sFlipped.lastIndexOf(".");
                            if ( iLoc6 != -1 )
                            {
                                // Like: 'com/example/bottomnavas/ui/home/HomeFragment'
                                sConvertedKey = sFlipped.substring(iLoc5, iLoc6);
                                //System.out.println("sConvertedKey: '"+sConvertedKey+"'");
                                
                                // Set Key..
                                tabInfo.sKeyPath = sConvertedKey;
                            }
                        }
                    }
                    
                    // tabInfo.sSourcePath: 'C:\Android\Dev\BottomNavAS\app\src\main\java\com\example\bottomnavas\...\HomeFragment.java'		        
    
                }
                
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
            
            //System.out.println("\nExiting updateSource()");
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
		String sName = "";
		String sValue;
		String sSignature = "";
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
			String[] sValueSa = null;
			byte bType;
			iKey = 0;
			
			while ( localIterator.hasNext() )
			{
				// Get Key..				
				IVal = (Integer)localIterator.next();
				if ( IVal != null )
					iKey = IVal.intValue();

				localVariableInfo = (LocalVariableInfo)LocalVariableLHm.get(new Integer(iKey));
				if ( localVariableInfo != null )
				{
                    sName = localVariableInfo.sName;
                    sSignature = localVariableInfo.sSignature;
                    iSlot = localVariableInfo.iSlot;
                    bType = localVariableInfo.bType;
                    sValueSa = localVariableInfo.sStringValue;
                }

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
			String[] sValueSa = null;
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
				if ( classVariableInfo != null )
				{
                    sName = classVariableInfo.sName;
                    sSignature = classVariableInfo.sSignature;
                    lFieldId = classVariableInfo.lFieldId;
                    bType = classVariableInfo.bType;
                    sValueSa = classVariableInfo.sStringValue;
                }

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
		// Where 'lLocationIndex' is the LineCodeIndex
		// also what is returned from part of the Event "location"
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
		int iLoc3 = 0;
		int iLineAdjust = 0;
		String[] sTokenPosTableAr = null;
		//String sScriptId = "";
		String sTScript;
		String sKey = "";
		String sValue = "";
		String sKeyPath = "";
		String sSource = "";
		
		int iScrollValue = 0;
		int iScrollMax = 0;
		int iScrollMin = 0;
		int iStart = 0;
		JViewport viewport = null;
		Rectangle viewRectangle = null;
		
		long lLineCodeIndex = 0;
		int iLen;
		//int iLineNumber = 0;
		boolean bMatchedIndex;
		boolean bMethodMatched = false;
		boolean bFindTab;
		Rectangle visRect;
		Highlighter highlighter;
		BreakpointInfo breakpointInfo;
		HashMap lineHm;
		Set set;
		Iterator iterator;
		Integer IVal;
		LineInfo lineInfo;

		
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

/*		
		if ( ClassMethodAr == null )
		    System.out.println("ClassMethodAr null");
		else
		{
		    System.out.println("ClassMethodAr.size(): "+ClassMethodAr.size());
            for ( int iJ = 0; iJ < ClassMethodAr.size(); iJ++ )
            {
                classMethodInfo = (ClassMethodInfo)ClassMethodAr.get(iJ);
                System.out.println("---------------------");
                System.out.println("classMethodInfo.lClassId: "+classMethodInfo.lClassId);
                System.out.println("classMethodInfo.lMethodId: "+classMethodInfo.lMethodId);
                System.out.println("classMethodInfo.sSourcePath: '"+classMethodInfo.sSourcePath+"'");
            }
		}
/**/		

		// Get current Tab..
		int iTabSel = 0;
		if ( tabbedPane != null )
		{
			iTabSel = tabbedPane.getSelectedIndex();
		}
		
		if ( iTabSel == -1 )
			iTabSel = 0;
		
		//System.out.println("(Current tab)iTabSel: "+iTabSel);

		if ( bFlutterSelected )
		    ;
		else
		{
            bFindTab = false;
            //System.out.println("bIsBreakpointStepEvent: "+bIsBreakpointStepEvent);
            if ( bIsBreakpointStepEvent )
            {
                //System.out.println("lBreakpointClassId: "+lBreakpointClassId);
                sValue = "";
                if ( SourceClassInfoHm != null )
                {
                    if ( SourceClassInfoHm.containsKey((Long)lBreakpointClassId) )
                    {
                        //System.out.println("Contains Class Key");
                        sValue = "";
                        sValue = (String)SourceClassInfoHm.get((Long)lBreakpointClassId);
                        //System.out.println("sValue: '"+sValue+"'");     // Like:   'CanvasTestActivity'
                    }
                }
    
                if ( (TabInfoAr != null) && (TabInfoAr.size() > 0) )
                {
                    if ( iTabSel < TabInfoAr.size() )
                    {
                        tabInfo = (TabInfo)TabInfoAr.get(iTabSel);
                        sKeyPath = tabInfo.sKeyPath;
                        //System.out.println("tabInfo.sKeyPath: '"+tabInfo.sKeyPath+"'");
                        iLoc3 = sKeyPath.lastIndexOf("/");
                        if ( iLoc3 != -1 )
                        {
                            sSource = sKeyPath.substring(iLoc3 + 1);    // Current tab..
                            //System.out.println("sSource: '"+sSource+"'");
                            if ( (sValue != null) && (sValue.equals(sSource)) )
                                ;   // In correct tab..
                            else
                                bFindTab = true;
                        }
                    }
                }

                if ( bFindTab )
                {
                    if ( (TabInfoAr != null) && (TabInfoAr.size() > 0) )
                    {
                        for ( int iX = 0; iX < TabInfoAr.size(); iX++ )
                        {
                            //System.out.println("--TOP--");
                            tabInfo = (TabInfo)TabInfoAr.get(iX);  
                            
                            // Like:  'com/android/spritemethodtest/SimpleCanvasRenderer'
                            sKeyPath = tabInfo.sKeyPath;
                            //System.out.println("tabInfo.sKeyPath: '"+tabInfo.sKeyPath+"'");
                            iLoc3 = sKeyPath.lastIndexOf("/");
                            if ( iLoc3 != -1 )
                            {
                                sSource = sKeyPath.substring(iLoc3 + 1);
                                //System.out.println("sSource: '"+sSource+"'");
                                if ( (sValue != null) && (sValue.equals(sSource)) )
                                {
                                    // Found, set to this tab..
                                    tabbedPane.setSelectedIndex(iX);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }

		if ( bFlutterSelected )
		{
			
		}
		else
		{
			if ( ClassMethodAr != null )
			{
				for ( ; iMethodIndex < ClassMethodAr.size(); iMethodIndex++ )
				{
				    //System.out.println("iMethodIndex: "+iMethodIndex);
					classMethodInfo = (ClassMethodInfo)ClassMethodAr.get(iMethodIndex);
					if ( lMethodId == classMethodInfo.lMethodId )
					{
						bMethodMatched = true;
						break;
					}
				}
			}
		}
		
		//System.out.println("bMethodMatched: "+bMethodMatched);
		//System.out.println("lMethodId: "+lMethodId);
		long lRefreshMethodId;
		long lRefreshClassId;
		
		//System.out.println("\nbHaveSDKSource: "+bHaveSDKSource);
/*		
		if ( TabInfoAr == null )
			System.out.println("TabInfoAr null");
		else
			System.out.println("TabInfoAr.size(): "+TabInfoAr.size());
/**/



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
		if ( (TabInfoAr != null) && (TabInfoAr.size() > 0) )
		{
			//System.out.println("iTabSel: "+iTabSel);
			if ( iTabSel < TabInfoAr.size() )
			{
                tabInfo = (TabInfo)TabInfoAr.get(iTabSel);
                sKey = tabInfo.sKeyPath;
                //System.out.println("sKey: '"+sKey+"'");
                
                jTextArea = tabInfo.jTextArea;
                scrollPane = tabInfo.jScrollPane;
                iLineAdjust = tabInfo.iSourceLineAdjust;
                
                scrollbar = scrollPane.getVerticalScrollBar();
            }
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


		// Get Tab's JScrollPane
		// This is critical for it to be able to
		// adjust the scrolling to keep the
		// current line in view
		
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
			
			// Find matching Method Id, with LineCodeIndex at '0',
			// and get it's matching LineNumber..
			
            lineHm = (HashMap)NodeHm.get((String)sKey);
            if ( lineHm != null )
            {
                set = lineHm.keySet();
                iterator = set.iterator();
                while ( iterator.hasNext() )
                {
                    //System.out.println("---TOP---");
                    IVal = (Integer)iterator.next();
                    if ( IVal != null )
                        iLineNumber = IVal.intValue();
                    //System.out.println("iLineNumber: "+iLineNumber);
 
                    if ( (Integer)iLineNumber < lineHm.size() )
                    {
                        lineInfo = (LineInfo)lineHm.get((Integer)iLineNumber);
                        if ( (lineInfo.lMethodId == lMethodId) &&
                            (lineInfo.lLineCodeIndex == 0) )
                        {
                            //System.out.println("Found matching LineCodeIndex at 0");
                            iUnadjustedLineNumber = iLineNumber;
                            //System.out.println("iUnadjustedLineNumber: "+iUnadjustedLineNumber);
                            break;
                        }
                    }
                }
            }
		}

/*
			if ( BreakpointAr == null )
				System.out.println("BreakpointAr null");
			else
				System.out.println("BreakpointAr.size(): "+BreakpointAr.size());
/**/
		
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

			//System.out.println("bFlutterSelected: "+bFlutterSelected);
			if ( bFlutterSelected )
			{
				// Search for matching 'tokenPos' and
				// get assc. line number..
				
				if ( (TabInfoAr != null) && (TabInfoAr.size() > 0) )
				{
				    //System.out.println("iTabSel: "+iTabSel);
				    if ( iTabSel < TabInfoAr.size() )
				    {
                        tabInfo = (TabInfo)TabInfoAr.get(iTabSel);
                        sTokenPosTableAr = tabInfo.sTokenPosTable;
                    }
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
						{
						    if ( iTokIndex < tSa.length )
						        tSa[iTokIndex] = st.nextToken();
						}
						
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
			    //System.out.println("\n----------- Line highlight --------------");
			    //System.out.println("lMethodId: "+lMethodId);
			    //System.out.println("lEvent_MethodId: "+lEvent_MethodId);
			    //System.out.println("lLocationIndex: "+lLocationIndex+"\n");
			    
			    //System.out.println("bMethodMatched: "+bMethodMatched);
			    //System.out.println("lLocationMethod: "+lLocationMethod);
			    //System.out.println("lCurrentSelectedMethod: "+lCurrentSelectedMethod+"\n");

                //System.out.println("(get())sKey: '"+sKey+"'");			    
                lineHm = (HashMap)NodeHm.get((String)sKey);
                if ( lineHm != null )
                {
                    set = lineHm.keySet();
                    iterator = set.iterator();
                    while ( iterator.hasNext() )
                    {
                        //System.out.println("---TOP---");
                        IVal = (Integer)iterator.next();
                        if ( IVal != null )
                            iLineNumber = IVal.intValue();
                        //System.out.println("iLineNumber: "+iLineNumber);
                            
                        lineInfo = (LineInfo)lineHm.get((Integer)iLineNumber);
                        //System.out.println("lineInfo.lMethodId: "+lineInfo.lMethodId);
                        //System.out.println("lineInfo.lLineCodeIndex: "+lineInfo.lLineCodeIndex);
                        if ( lineInfo != null )
                        {
                            if ( (lLocationIndex == lineInfo.lLineCodeIndex) &&
                                (lEvent_MethodId == lineInfo.lMethodId) )
                            {
                                //System.out.println("--MATCHED--");
                                //System.out.println("iLineNumber: "+iLineNumber);
                                //System.out.println("lineInfo.lMethodId: "+lineInfo.lMethodId);
                                //System.out.println("lineInfo.lLineCodeIndex: "+lineInfo.lLineCodeIndex);
                                
                                if ( bMethodChanged )
                                {
                                    // When the Method changes it seems to
                                    // need a little delay here before
                                    // 'iStart' and 'iEnd' values will
                                    // consistantly work..
                                    try
                                    {
                                        Thread.sleep(125);
                                    }
                                    catch (InterruptedException ie)
                                    {
                                    }
                                }
                                
                                // Get adjusted line number..
                                // Zero based display line number..
                                iAdjustedLine = iLineNumber - 1;
                                //System.out.println("iAdjustedLine: "+iAdjustedLine);
                    
                                // Get adjusted..
                                iAdjustedStartOffset = jTextArea.getLineStartOffset((int)iAdjustedLine);
                                //System.out.println("iAdjustedStartOffset: "+iAdjustedStartOffset);
                    
                                // Try to highlight line..
                                rect = jTextArea.modelToView(iAdjustedStartOffset);
                                
                                //int iStart = jTextArea.viewToModel(new Point(0, rect.y));
                                iStart = jTextArea.viewToModel(new Point(0, rect.y));
                                int iEnd = jTextArea.viewToModel(new Point(jTextArea.getWidth(), rect.y));
                                //System.out.println("iStart: "+iStart+"    iEnd: "+iEnd);
                                
                                //System.out.println("bShowCurrentLine: "+bShowCurrentLine);
                                if ( bShowCurrentLine )
                                {
                                    // Highlight current line..
                                    highlighter.addHighlight(
                                        iStart,
                                        iEnd,
                                        new DefaultHighlighter.DefaultHighlightPainter((Color)green));
                                }
                                
                                break;
                            }
                        }
                    }   // End while..
				}
/*
				else
				{
					// Doesn't match..
					;
				}
/**/
			}
			
			//BreakpointInfo breakpointInfo;
/*
			if ( BreakpointAr == null )
				System.out.println("BreakpointAr null");
			else
				System.out.println("BreakpointAr.size(): "+BreakpointAr.size());
/**/

			
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
				//int iLoc3;
				int iLineNum;
				long lMethodID;
				long lBpLineIndex;
				long lLnCodeIndex;
				boolean bMatched;
				//String sScriptId;
				String sPath;
				String sName;
				//String sTScript;
				
/*				
                if ( BreakpointAr == null )
                    System.out.println("BreakpointAr null");
                else
                    System.out.println("BreakpointAr.size(): "+BreakpointAr.size());
/**/

				//System.out.println("\n----------- Breakpoint highlight --------------");
				if ( bFlutterSelected )
				{
					//System.out.println("\n----------- Breakpoint highlight --------------");

					for ( int iZ = 0; iZ < BreakpointAr.size(); iZ++ )
					{
						//System.out.println("--TOP-- iZ: "+iZ);
						breakpointInfo = (BreakpointInfo)BreakpointAr.get(iZ);
						sTScript = breakpointInfo.sScriptId;
						//System.out.println("sScriptId: '"+sScriptId+"'");
						sPath = tabInfo.sSourcePath;
						//System.out.println("sPath: '"+sPath+"'");
						
						// Note:
						// At this point sPath looks like:
						// 'C:\Android\Dev\ClockApp-master\lib\clock\hand_minute.dart'
						iLoc3 = sPath.lastIndexOf((int)0x5c);	// '\'
						if ( iLoc3 != -1 )
						{
							sName = sPath.substring(iLoc3 + 1);
							//System.out.println("sName: '"+sName+"'");
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
                    for ( int iB = 0; iB < BreakpointAr.size(); iB++ )
                    {
                        breakpointInfo = (BreakpointInfo)BreakpointAr.get(iB);
                        lMethodID = breakpointInfo.lMethodId;
                        //System.out.println("lMethodID: "+lMethodID);
                        lBpLineIndex = breakpointInfo.lLineCodeIndex;
                        //System.out.println("lBpLineIndex: "+lBpLineIndex);
                        //System.out.println("lCurrentSelectedMethod: "+lCurrentSelectedMethod);

                        bMatched = false;	
                        
                        lineHm = (HashMap)NodeHm.get((String)sKey);
                        if ( lineHm != null )
                        {
                            set = lineHm.keySet();
                            iterator = set.iterator();
                            while ( iterator.hasNext() )
                            {
                                //System.out.println("---TOP---");
                                
                                IVal = (Integer)iterator.next();
                                if ( IVal != null )
                                    iLineNumber = IVal.intValue();
                                //System.out.println("iLineNumber: "+iLineNumber);
                                    
                                lineInfo = (LineInfo)lineHm.get((Integer)iLineNumber);
                                if ( lineInfo != null )
                                {
                                    //System.out.println("lineInfo.lMethodId: "+lineInfo.lMethodId);
                                    //System.out.println("lineInfo.lLineCodeIndex: "+lineInfo.lLineCodeIndex);
                                    
                                    if ( (lBpLineIndex == lineInfo.lLineCodeIndex) &&
                                        (lMethodID == lineInfo.lMethodId) )
                                    {
                                        //System.out.println("--MATCH--");
                                        iLineTableLineNumber = iLineNumber;
                                        
                                        // Get adjusted line number..
                                       iAdjLn = iLineTableLineNumber - 1;
                                        //System.out.println("iAdjLn: "+iAdjLn);
                                        
                                        // Get adjusted..
                                        iAdjustedStartOff = jTextArea.getLineStartOffset((int)iAdjLn);
                                        //System.out.println("iAdjustedStartOff: "+iAdjustedStartOff);
                                        
                                        // Try to highlight line..
                                        Rectangle bRect = jTextArea.modelToView(iAdjustedStartOff);
                                        
                                        iHStart = jTextArea.viewToModel(new Point(0, bRect.y));
                                        iHEnd = jTextArea.viewToModel(new Point(jTextArea.getWidth(), bRect.y));
                                        //System.out.println("iHStart: "+iHStart+"    iHEnd: "+iHEnd);
                                        
                                        highlighter.addHighlight(
                                            iHStart,
                                            iHEnd,
                                            new DefaultHighlighter.DefaultHighlightPainter((Color)red));
                                        
                                        break;
                                     }
                                }
                            }   // End while
                        }
                    }	// End for..
				}
			}
			
			
			int iScrollY;
			int iQuarter = viewRectangle.height / 4;
			
			if ( rect != null )
			{
				if ( (rect.y <= viewRectangle.y) ||
					(rect.y >= (viewRectangle.y + (iQuarter * 3))) )
				{
					iScrollY = rect.y - (viewRectangle.height / 2);
					//System.out.println("iScrollY: "+iScrollY);
						
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

		//System.out.println("\nExiting updateSourceLines()");
		
	}	//}}}
	
	//{{{	init()
	/**
     * Read Project Home from Persistent storage
     */
	private void init()
	{
		//String inS;
		String tokS = "";
		String tS = "";
		int iLoc;
		//int iLoc2;
		//System.out.println("\ninit()");
		//System.out.println("\nbProjectSelected: "+bProjectSelected);
		
		if ( bRunSelected == false )
		{
			if ( stopButton != null )
				stopButton.setVisible(false);
			
			if ( killButton != null )
				killButton.setVisible(true);
		}

        if ( bProjectSelected )
            ;
        else
        {
            // Try to read from Persistent storage..
            // Like: C:/Android/Dev/flutter_fivez~true~false~false~true
            tokS = readStorage("store.tmp");
/*            
            if ( tokS == null )
                System.out.println("tokS null");
            else
                System.out.println("tokS: '"+tokS+"'");
/**/
    
    
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
                        //System.out.println("tS: '"+tS+"'");
                        if ( tS.equals("true") )
                        {
                            if ( uGradleMenuItem != null )						
                                uGradleMenuItem.setState(true);
                            
                            bGradleSelected = true;
                        }
                        else if ( tS.equals("false") )
                        {
                            if ( uGradleMenuItem != null )
                            {
                                uGradleMenuItem.setState(false);
                                //System.out.println("\n(a)Setting to false");
                            }
                            
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
                                //uNDKMenuItem.setSelected(true);
                                uNDKMenuItem.setState(true);
                            
                            bNDKSelected = true;
                        }
                        else if ( tS.equals("false") )
                        {
                            if ( uNDKMenuItem != null )
                                //uNDKMenuItem.setSelected(false);
                                uNDKMenuItem.setState(false);
                            
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
                                //uKotlinMenuItem.setSelected(true);
                                uKotlinMenuItem.setState(true);
                            
                            bKotlinSelected = true;
                        }
                        else if ( tS.equals("false") )
                        {
                            if ( uKotlinMenuItem != null )
                                //uKotlinMenuItem.setSelected(false);
                                uKotlinMenuItem.setState(false);
                            
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
                                //uFlutterMenuItem.setSelected(true);
                                uFlutterMenuItem.setState(true);
                            
                            bFlutterSelected = true;
                        }
                        else if ( tS.equals("false") )
                        {
                            if ( uFlutterMenuItem != null )
                                //uFlutterMenuItem.setSelected(false);
                                uFlutterMenuItem.setState(false);
                            
                            bFlutterSelected = false;
                        }
                    }
                }	// End for..
                
                //System.out.println("bFlutterSelected: "+bFlutterSelected);
                //System.out.println("bKotlinSelected: "+bKotlinSelected);
                //System.out.println("bNDKSelected: "+bNDKSelected);
                //System.out.println("bGradleSelected: "+bGradleSelected);
    
                // Get Package name..
                //getPackageName();
                
                // Reset..			
                bHomeJustSet = false;
    
            }
        }
        
        if ( bProjectSelected )
            bProjectSelected = false;   // Reset..
        
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

/*
		if ( fileName == null )
		    System.out.println("fileName null");
		else
		    System.out.println("fileName: '"+fileName+"'");
/**/

		ByteArrayOutputStream baos = new ByteArrayOutputStream(iInitialSize);
		byte[] tempBuf = new byte[768];
		
		int iBufLength = tempBuf.length;		
    	int bytes_read = 0;

		FileInputStream fis = null;

		try
		{
			File file = new File(fileName);
			if ( file.exists() )
			//if ( true )
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
		catch (SecurityException se)
		{
			System.out.println("SecurityException: "+se.toString());
			se.printStackTrace();
		}
		catch (FileNotFoundException fnfe)
		{
			System.out.println("FileNotFoundException: "+fnfe.toString());
			fnfe.printStackTrace();
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

        //System.out.println("Exiting readFile()");		
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
		if ( uGradleMenuItem != null )
		{
		    if ( uGradleMenuItem.getState() )
		        sb.append("true");
		    else
		        sb.append("false");
		}
		else
		    sb.append("false");

		sb.append("~");
		if ( uNDKMenuItem != null )
		{
		    if ( uNDKMenuItem.getState() )
		        sb.append("true");
		    else
		        sb.append("false");
		}
		else
		    sb.append("false");

		sb.append("~");
		if ( uKotlinMenuItem != null )
		{
		    if ( uKotlinMenuItem.getState() )
		        sb.append("true");
		    else
		        sb.append("false");
		}
		else
		    sb.append("false");
		
		sb.append("~");
		if ( uFlutterMenuItem != null )
		{
		    if ( uFlutterMenuItem.getState() )
		        sb.append("true");
		    else
		        sb.append("false");
		}
		else
		    sb.append("false");
		
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
				// An executable location. The location is identified by one byte type tag followed
				// by a a classID followed by a methodID followed by an unsigned eight-byte index,
				// which identifies the location within the method.
				
				//System.out.println("\nLocation:");
				bTypeTag = Utils.getNextValueAsByte(index, event);
				//System.out.println("bTypeTag: "+bTypeTag);		// (TYPE_TAG_CLASS = 1)
				lClassId = Utils.getNextValueAsReferenceTypeID(index, event);	// (as in Location reference)
				//System.out.println("lClassId: "+lClassId+"   "+Long.toHexString(lClassId));
				lMethodId = Utils.getNextValueAsMethodID(index, event);
				lEvent_MethodId = lMethodId;
				//System.out.println("lMethodId: "+lMethodId+"   "+Long.toHexString(lMethodId));
				lLocationIndex = Utils.getNextValueAsLong(index, event);
				//System.out.println("lLocationIndex: "+lLocationIndex+"   "+Long.toHexString(lLocationIndex)+"\n");
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
				//System.out.println("lClassId: "+lClassId+"   (Hex)"+Long.toHexString(lClassId));
				lBreakpointClassId = lClassId;
				lMethodId = Utils.getNextValueAsMethodID(index, event);
				lEvent_MethodId = lMethodId;
				//System.out.println("lMethodId: "+lMethodId+"   (Hex)"+Long.toHexString(lMethodId));
				lLocationIndex = Utils.getNextValueAsLong(index, event);
				//System.out.println("lLocationIndex: "+lLocationIndex+"\n");

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
	
	//{{{	ActionListener  Handle events
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
			boolean bMatch;
			boolean bMatchedProject;
/*
			if ( projectHomeS == null )
				System.out.println("projectHomeS null");
			else
				System.out.println("projectHomeS: '"+projectHomeS+"'");
/**/

            if ( (projectHomeS != null) && (! projectHomeS.equals("null")) && (projectHomeS.length() > 0) )
                ;
            else
            {
                if ( HOME.equals(actionCommandS) )
                    ;   // Let them navigate to project..
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
				StringBuffer sB;
				int iLen;
				
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

                // Refresh..				
				bIsReleaseBuild = false;
				bIsDebugBuild = false;

				init();
				RefreshProperties();
				getPackageName();
				
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
                
                //System.out.println("androidSdkPathS: '"+androidSdkPathS+"'");
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
					
					//System.out.println("DeleteKeyPropertiesBgThread dropped out");
					
/*					
					if ( sDontModifyBuildGradle == null )
					    System.out.println("sDontModifyBuildGradle null");
					else
					    System.out.println("sDontModifyBuildGradle: '"+sDontModifyBuildGradle+"'");
/**/

                    // If it alread has 'storeFile', it's already been modified,
                    // and if it isn't commented out the Clean will fail, so do it anyway..
/*
                    if ( (sDontModifyBuildGradle != null) && (sDontModifyBuildGradle.length() > 0)
                            && (sDontModifyBuildGradle.equals("true"))  )
                        ;
                    else
                    {
/**/                        
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
                    //}
					
					//System.out.println("InitializeBuildGradleBgThread dropped out");

                    if ( (sDontModifyBuildGradle != null) && (sDontModifyBuildGradle.length() > 0)
                            && (sDontModifyBuildGradle.equals("true"))  )
                        ;
                    else
                    {
                        // Comment out projectsEvaluated debug
                        bCheckGradleProjectFinished = false;
                        checkGradleProjectBgThread = new CheckGradleProjectBgThread();
                        checkGradleProjectBgThread.start();
                        
                        while ( true )
                        {
                            if ( bCheckGradleProjectFinished )
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
					
					//System.out.println("CheckGradleProjectBgThread dropped out");
				}

                if ( bFlutterSelected )
                {
                    // Check for .packages
                    sB = new StringBuffer(projectHomeS);
                    sB.append("/.packages");
                    File file = new File(sB.toString());
                    if ( file.exists() )
                        ;
                    else
                    {
                        // Run 'flutter pub get'..
                        StringBuffer cmdSb = new StringBuffer();
                        
                        if ( iOS == LINUX_MAC )
                        {
                            cmdSb.append("export PATH=${PATH}:");
                            cmdSb.append(sFlutterSdkPath);
                            
                            cmdSb.append(";cd ");
                            cmdSb.append(projectHomeS);
            
                            cmdSb.append(";flutter pub get");	
                        }
                        else
                        {
                            cmdSb.append("SET PATH=");
                            cmdSb.append(sFlutterSdkPath);
                            cmdSb.append(";%PATH%");
            
                            cmdSb.append("&&CD ");
                            cmdSb.append(projectHomeS);
            
                            cmdSb.append("&&flutter pub get");
                            cmdSb.append("\n");
                        }
                        
                        bInternalFinished = false;		
                        internalCommandS = cmdSb.toString();
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

/*                        
                        if ( commandResultS == null )
                            System.out.println("commandResultS null");
                        else
                            System.out.println("commandResultS: '"+commandResultS+"'");
/**/

                        try
                        {				
                            doc = textPane.getStyledDocument();	
                            iLen = doc.getLength();
                            doc.insertString(iLen, commandResultS, normalStyle);
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

				commandSb = new StringBuffer();
				
				if ( iOS == LINUX_MAC )
				{
					if ( bGradleSelected )
					{
						if ( bFlutterSelected )
						{
							commandPhrase = "flutter clean";
							
							commandSb.append(";export PATH=${PATH}:");						
							commandSb.append(sFlutterSdkPath);
							
							commandSb.append(";cd ");
							commandSb.append(projectHomeS);
							
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
				
				bIsDebugBuild = true;
				bIsReleaseBuild = false;
				

				//bKillAdb = true;	// Set to kill adb..
				
				init();
				
				if ( bFlutterSelected || bGradleSelected )
				{
					// Select 'debug' in buildTypes..
					bDebugReleaseFinished = false;
					bEnableStoreFile = false;
					bEnableBuildTypesDebug = true;
					bEnableBuildTypesRelease = false;
					
                    if ( (sDontModifyBuildGradle != null) && (sDontModifyBuildGradle.equals("true")) )
                        ;
                    else
                    {
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
				}
				
				if ( bGradleSelected )
				{
                    // Check for debug option..
                    if ( (sDebugArg != null) && (sDebugArg.length() > 0) )
                    {
                        if ( (sDontModifyBuildGradle != null) && (sDontModifyBuildGradle.length() > 0)
                                && (sDontModifyBuildGradle.equals("true"))  )
                            ;
                        else
                        {
                            bDebugOptionFinished = false;
                            modifyGradleProjectBgThread = new ModifyGradleProjectBgThread();
                            modifyGradleProjectBgThread.start();
                
                            while ( true )
                            {
                                if ( bDebugOptionFinished )
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
							
                            if ( (sGradleSuppressWarnings != null) && (sGradleSuppressWarnings.equals("true")) )						
							    commandSb.append("--warning-mode=none ");
	
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

                            if ( (sGradleSuppressWarnings != null) && (sGradleSuppressWarnings.equals("true")) )						
							    commandSb.append("--warning-mode=none ");
							
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
			    //System.out.println("PRE_RELEASE");
				bOkayToDoRelease = false;
				bReleaseCheckFinished = false;
				releaseCheckBgThread = new ReleaseCheckBgThread();
				releaseCheckBgThread.start();
				
				CheckKeystorePasswords();
			}
			else if ( RELEASE.equals(actionCommandS) )
			{
			    // Note:
			    // When the Release Button is hit
			    // it does PRE_RELEASE, above, first and not here..
			    
			    // ReleaseCheckBgThread run() generates Event to finally
			    // do this RELEASE..
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
				
				bIsReleaseBuild = true;
				bIsDebugBuild = false;
				
				init();
				
				iBuildType = RELEASE_BUILD;

				//System.out.println("bGradleSelected: "+bGradleSelected);
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
					
                    // Check for debug option..
                    if ( (sDebugArg != null) && (sDebugArg.length() > 0) )
                    {
                        if ( (sDontModifyBuildGradle != null) && (sDontModifyBuildGradle.length() > 0)
                                && (sDontModifyBuildGradle.equals("true"))  )
                            ;
                        else
                        {
                        
                            bDebugOptionFinished = false;
                            modifyGradleProjectBgThread = new ModifyGradleProjectBgThread();
                            modifyGradleProjectBgThread.start();
                
                            while ( true )
                            {
                                if ( bDebugOptionFinished )
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
						
						//System.out.println("sGradleType: '"+sGradleType+"'");
						// Like: 'gradlew'
						commandSb.append(sGradleType);
						commandSb.append(" ");

						if ( (gradleOfflineS != null) && (gradleOfflineS.equals("true")) )
							commandSb.append("--offline ");

                        if ( (sGradleSuppressWarnings != null) && (sGradleSuppressWarnings.equals("true")) )						
                            commandSb.append("--warning-mode=none ");
						
                        //System.out.println("sGradleCommandOption: '"+sGradleCommandOption+"'");
						if ( (sGradleCommandOption != null) && (sGradleCommandOption.length() > 0) )
						{
							commandSb.append(sGradleCommandOption);
							commandSb.append(" ");
						}

						commandSb.append(ASSEMBLE_RELEASE);
						//commandSb.append("build --debug");
						
						//commandSb.append("build");    // Was using
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

                //System.out.println("(Swingworker)bGradleSelected: "+bGradleSelected);				
				if ( bGradleSelected )
				{
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

                            if ( (sDontModifyBuildGradle != null) && (sDontModifyBuildGradle.equals("true")) )
                                ;
                            else
                            {
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
			    //System.out.println("\n***************************");
				//System.out.println("RUN");
				iDebugMode = DEBUG_RUN;
				bBlockDebug = true;
				
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

				init();
				RefreshProperties();

				// Refresh Hot Reload button..
                if ( (sRunBuildType != null) && (sRunBuildType.length() > 0) )
                {
                    if ( sRunBuildType.equals("debug") )
                        reloadButton.setVisible(true);
                    else if ( sRunBuildType.equals("release") )
                        reloadButton.setVisible(false);
                }

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
				}

                // Wait for sDebugUri..
                while ( true )
                {
                    try
                    {
                        Thread.sleep(150);
                    }
                    catch (InterruptedException ie)
                    {
                    }
                    
                    if ( (sDebugUri != null) && (sDebugUri.length() > 0) )
                    {
                        //System.out.println("\nGot sDebugUri, breaking..");
                        break;
                    }
                }
                
                DebugInit();
				
				//System.out.println("Exiting RUN");
			}
			else if ( ATTACH.equals(actionCommandS) )
			{
				//System.out.println("ATTACH");
				iDebugMode = DEBUG_ATTACH;
				bBlockDebug = false;
				
				// Check for a device..				
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
				{
					System.out.println("DevicesAr.size(): "+DevicesAr.size());
					for ( int iJ = 0; iJ < DevicesAr.size(); iJ++ )
					    System.out.println("["+iJ+"]: '"+(String)DevicesAr.get(iJ)+"'");
				}
/**/	

				init();
				RefreshProperties();
				
				// Refresh Hot Reload button..
                if ( (sRunBuildType != null) && (sRunBuildType.length() > 0) )
                {
                    if ( sRunBuildType.equals("debug") )
                        reloadButton.setVisible(true);
                    else if ( sRunBuildType.equals("release") )
                        reloadButton.setVisible(false);
                }

                sDebugUri = "";
				if ( (DevicesAr != null) && (DevicesAr.size() > 0) )
				{
					//bRunSelected = true;
					bShellThreadFinished = false;
					shellBgThread = new ShellBgThread();
					shellBgThread.start();
					
					while ( true )
					{
					    try
					    {
					        Thread.sleep(150);
					    }
					    catch (InterruptedException ie)
					    {
					    }
					    
					    if ( bShellThreadFinished )
					        break;
					}
					
					//System.out.println("ShellBgThread dropped out");
					
					
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
						

						//bRunSelected = true;
						
						if ( stopButton != null )
							stopButton.setVisible(true);
						
						if ( killButton != null )
							killButton.setVisible(false);
						
						bKillDaemonThread = false;
						flutterDaemonBgThread = new FlutterDaemonBgThread();
						flutterDaemonBgThread.start();

					}
				}
				
/*
                if ( sEnableDebugOutput == null )
                    System.out.println("sEnableDebugOutput null");
                else
                    System.out.println("sEnableDebugOutput: '"+sEnableDebugOutput+"'");
/**/

                if ( (sEnableDebugOutput != null) && (sEnableDebugOutput.length() > 0) )
                {
                    if ( sEnableDebugOutput.equals("true") )
                    {
                        // Wait for sDebugUri..
                        while ( true )
                        {
                            try
                            {
                                Thread.sleep(150);
                            }
                            catch (InterruptedException ie)
                            {
                            }
                            
                            if ( (sDebugUri != null) && (sDebugUri.length() > 0) )
                            {
                                //System.out.println("\nGot sDebugUri, breaking..");
                                break;
                            }
                        }
                        
                        DebugInit();
                    }
                }
				
				//System.out.println("Exiting ATTACH");
				
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

                RefreshProperties();
                
				if ( daemonProcess == null )
				{
					flutterDaemonBgThread = new FlutterDaemonBgThread();
					flutterDaemonBgThread.start();
				}
				
				flutterDaemonStdInBgThread = new FlutterDaemonStdInBgThread();
				flutterDaemonStdInBgThread.start();
				
				// Kill all Breakpoints..
				
				// Kill all tabs..

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
				//System.out.println("\nLOGCAT");

				StringBuffer sb;
				StringBuffer internalSb;
				int iLoc = 0;
				int iLoc1 = 0;
				int iLoc2 = 0;
				int iStart = 0;
				//boolean bDidReconnect = false;
				boolean bDoReconnect = false;
				
				RefreshProperties();
				boolean bSelected = logcatToggleButton.isSelected();

				//System.out.println("(logcatToggleButton.isSelected())bSelected: "+bSelected);
				if ( bSelected )
				{
				    // Logcat being turned on..
				    //System.out.println("Logcat turned on");
				    
                    while ( true )
                    {
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

                            if ( bDoReconnect )
                            {
                                internalSb.append("&&adb reconnect");
                                bDoReconnect = false;   // Reset..
                            }
                            else
                                internalSb.append("&&adb devices");
                            
                            internalSb.append("\n");
                        }
                        
                        //System.out.println("(Cmd): '"+internalSb.toString()+"'");
            
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
                            iLoc2 = commandResultS.indexOf("attached");
                            if ( iLoc2 != -1 )
                            {
                                iLoc1 = commandResultS.indexOf("device", iLoc2);
                                if ( iLoc1 != -1 )
                                {
                                    // Have device..
                                    break;
                                }
                                else
                                {
                                    // No device
/*                                    
                                    if ( sWirelessID == null )
                                        System.out.println("sWirelessID null");
                                    else
                                        System.out.println("sWirelessID: '"+sWirelessID+"'");
/**/                                    
                                    
/*                                    
                                    if ( sDeviceName == null )
                                        System.out.println("sDeviceName null");
                                    else
                                        System.out.println("sDeviceName: '"+sDeviceName+"'");
/**/                                    
                                    ;
                                }
                            }
                        }
                    }   // End while..
				    
                    //System.out.println("\n=== DROPPED OUT ===");
                    
                    // Clear the buffer..
					bLogcatOn = true;
					commandSb = new StringBuffer();

					if ( iOS == LINUX_MAC )
					{
						commandSb.append("export PATH=${PATH}:");
						commandSb.append(androidSdkPathS);
						commandSb.append("/platform-tools");
						
						commandSb.append(";");
						
						//commandSb.append("adb logcat -c");
						commandSb.append("adb ");
                        
                        if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
                        {
                            commandSb.append("-s ");
                            commandSb.append(sDeviceName);
                            commandSb.append(" ");
                        }
                        
                        commandSb.append("logcat -c");
						    
						commandSb.append(";");
					}
					else
					{
						commandSb.append("SET PATH=");
						commandSb.append(androidSdkPathS);
						commandSb.append("/platform-tools");
						commandSb.append(";%PATH%");
						
						commandSb.append("&&");

                        // Clear the buffer so that any slowdowns
                        // will be gone..						
						//commandSb.append("adb logcat -c");
						commandSb.append("adb ");
						
                        if ( (sDeviceName != null) && (sDeviceName.length() > 0) )
                        {
                            commandSb.append("-s ");
                            commandSb.append(sDeviceName);
                            commandSb.append(" ");
                        }
                        
                        commandSb.append("logcat -c");
						
						    
						commandSb.append("&&");
					}
	
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
					
					// Note:
					// On newer devices it looks like it defaults to
					// something like -v threadtime
					// looking like:
					// 10-19 12:06:03.396  1438  1628 I GestureDetector: ...
					
					// Try to default to a more compact version..
					// Also ensures that highlighting will work..
					commandSb.append(" -v brief");
					
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
/**/
					if ( iOS == WINDOWS )
						commandSb.append("\n");
					
					textPane.setText("");
				
					commandS = commandSb.toString();
					//System.out.println("commandS: '"+commandS+"'");
					
					ioBgThread = new IOBgThread();
					ioBgThread.start();
				}
				else
				{
				    // Logcat being turned off..
					// Already selected..
					//System.out.println("Logcat turned off");
					
					sPid = "";    // Reset..
					
					bBreakOut = true;	// Set to kill IOBgThread..
					bLogcatOn = false;
					bKillLogcat = true;	// Signal to kill for logcat..
				}					
			}
			else if ( KILL_SERVER.equals(actionCommandS) )
			{
			    //System.out.println("KILL_SERVER");
			    
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
/*
				if ( packageNameS == null )				
					System.out.println("packageNameS null");
				else
					System.out.println("packageNameS: '"+packageNameS+"'");
/**/


                bCheckDeviceFinished = false;
                checkDeviceBgThread = new CheckDeviceBgThread();
                checkDeviceBgThread.start();
                
                while ( true )
                {
                    try
                    {
                        Thread.sleep(150);
                    }
                    catch (InterruptedException ie)
                    {
                    }
    
                    if ( bCheckDeviceFinished )
                        break;
                }

                if ( (sWakefulness != null) && (sWakefulness.equals("Asleep")) )
                {
                    // Wake up device..
                    bWakeDeviceFinished = false;
                    wakeDeviceBgThread = new WakeDeviceBgThread();
                    wakeDeviceBgThread.start();
                    
                    while ( true )
                    {
                        try
                        {
                            Thread.sleep(150);
                        }
                        catch (InterruptedException ie)
                        {
                        }
        
                        if ( bWakeDeviceFinished )
                            break;
                    }
                }

                bUninstallPressed = true;

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
					
				}

/*				
				if ( bWirelessConnected == false )
				{
					// Signal to kill adb..
					bKillLogcat = true;
				}
/**/
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

				if ( (sUseAppBundle != null) && (sUseAppBundle.equals("true")) )
				    ;
				else
				    getApk();
				
				// Do the Install..
				//bKillAdb = true;
				commandSb = new StringBuffer();
				
/*				
				if ( sUseAppBundle == null )
				    System.out.println("sUseAppBundle null");
				else
				    System.out.println("sUseAppBundle: '"+sUseAppBundle+"'");
/**/				
				if ( (sUseAppBundle != null) && (sUseAppBundle.equals("true")) )
				{
				    
                    // App Bundle install..				    
                    if ( iOS == LINUX_MAC )
                    {
                        commandSb.append("export PATH=${PATH}:");
                        commandSb.append('"');
                        commandSb.append(javaPathS);
                        commandSb.append('"');
    
                        commandSb.append(";java -jar ");
                        commandSb.append('"');
                        commandSb.append(sBundleToolJarPath);
                        commandSb.append('"');
                        commandSb.append(" ");
                    }
                    else
                    {
                        commandSb.append("SET PATH=");
                        commandSb.append('"');
                        commandSb.append(javaPathS);
                        commandSb.append('"');
                        commandSb.append(";%PATH%");
                        
                        commandSb.append("&&java -jar ");
                        commandSb.append('"');
                        commandSb.append(sBundleToolJarPath);
                        commandSb.append('"');
                        commandSb.append(" ");
                    }

                    // Construct path to .aab..
                    StringBuffer sB = new StringBuffer();
                    sB.append(projectHomeS);
                    sB.append("/");
                    if ( bFlutterSelected )
                    {
                        sB.append("build/app/outputs/bundle/");
                        if ( bIsReleaseBuild )
                        {
                            sB.append("release");
                            sB.append("/app-release.aab");
                        }
                        else
                        {
                            sB.append("debug");
                            sB.append("/app-debug.aab");
                        }
                    }
                    else
                    {
                        sB.append("app/build/outputs/bundle/");
                        if ( bIsReleaseBuild )
                            sB.append("release");
                        else
                            sB.append("debug");
                        
                        sB.append("/app.aab");
                    }
                    
                    //System.out.println("(aab path)sB: '"+sB.toString()+"'");
                    
                    // Check if it exists..
                    File tFile = new File(sB.toString());
                    if ( tFile.exists() )
                    //if ( false )
                        ;
                    else
                    {
                        JFileChooser fChooser;
                        
                        if ( (projectHomeS != null) && (! projectHomeS.equals("")) )
                        {
                            StringBuffer tSb = new StringBuffer();
                            tSb.append(projectHomeS);
                            tSb.append("/");
                            fChooser = new JFileChooser((String)tSb.toString());
                        }
                        else
                        {
                            fChooser = new JFileChooser();
                            fChooser.setCurrentDirectory(new java.io.File("."));
                        }
                            
                        fChooser.setDialogTitle(".aab Path");
                        fChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
                        fChooser.setAcceptAllFileFilterUsed(false);
                        
                        if ( fChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION )
                        {
                            //System.out.println("In APPROVE_OPTION");
                            String tS = fChooser.getSelectedFile().toString();
                            tS = Utils.processPath(tS);
                            //System.out.println("tS: '"+tS+"'");
                            
                            sB = new StringBuffer(tS);
                        }
                    }

                    //System.out.println("(aab path)sB: '"+sB.toString()+"'");
                    
                    commandSb.append("build-apks --bundle=");
                    // Path to app.aab..
                    commandSb.append('"');
                    //commandSb.append("C:/Android/Dev/G_GameNew/app/build/outputs/bundle/release/app.aab");
                    commandSb.append(sB.toString());
                    commandSb.append('"');
                    
                    // Path to output.apks..
                    commandSb.append(" --output=");
                    commandSb.append('"');
                    commandSb.append(projectHomeS);
                    commandSb.append("/output.apks");
                    commandSb.append('"');
				    
				    commandSb.append(" --connected-device --overwrite --verbose --ks=");
				    commandSb.append('"');
				    commandSb.append(sAppBundleKeystorePath);
				    commandSb.append('"');
				    
				    commandSb.append(" --ks-pass=pass:");
				    commandSb.append(sAppBundleKeyAliasPassword);
				    commandSb.append(" --ks-key-alias=");
				    commandSb.append(sAppBundleKeyAlias);    
				    commandSb.append(" --key-pass=pass:");
				    commandSb.append(sAppBundleKeystorePassword);
				    
				    if ( iOS == WINDOWS )
				        commandSb.append("\n");
				    
				    //System.out.println("commandSb: '"+commandSb.toString()+"'");
				        
                    commandS = commandSb.toString();
                    //System.out.println("commandS: '"+commandS+"'");

                    bIOBgThreadFinished = false;                    
                    ioBgThread = new IOBgThread();
                    ioBgThread.start();
                    
                    while ( true )
                    {
                        try
                        {
                            Thread.sleep(350);
                        }
                        catch (InterruptedException ie)
                        {
                        }
                        
                        if ( bIOBgThreadFinished )
                            break;
                    }
                    
                    //System.out.println("Dropped out");
/*                    
                    try
                    {
                        Thread.sleep(2000);
                    }
                    catch (InterruptedException ie)
                    {
                    }
/**/                    
                    commandSb = new StringBuffer();
                    
                    if ( iOS == LINUX_MAC )
                    {
                        commandSb.append("export PATH=${PATH}:");
                        commandSb.append('"');
                        commandSb.append(javaPathS);
                        commandSb.append('"');
    
                        commandSb.append(";java -jar ");
                        commandSb.append('"');
                        commandSb.append(sBundleToolJarPath);
                        commandSb.append('"');
                        commandSb.append(" ");
                    }
                    else
                    {
                        commandSb.append("SET PATH=");
                        commandSb.append('"');
                        commandSb.append(javaPathS);
                        commandSb.append('"');
                        commandSb.append(";%PATH%");
                        
                        commandSb.append("&&java -jar ");
                        commandSb.append('"');
                        commandSb.append(sBundleToolJarPath);
                        commandSb.append('"');
                        commandSb.append(" ");
                    }
                    
				    commandSb.append("install-apks --apks=");
				    
				    // Path to output.apks..
				    commandSb.append('"');
                    commandSb.append(projectHomeS);
                    commandSb.append("/output.apks");
				    commandSb.append('"'); 
				        
				    if ( iOS == WINDOWS )
				        commandSb.append("\n");
				    
				    //System.out.println("commandSb: '"+commandSb.toString()+"'");
                    commandS = commandSb.toString();
                    
                    bIOBgThreadFinished = false;                    
                    ioBgThread = new IOBgThread();
                    ioBgThread.start();
                    
                    while ( true )
                    {
                        try
                        {
                            Thread.sleep(350);
                        }
                        catch (InterruptedException ie)
                        {
                        }
                        
                        if ( bIOBgThreadFinished )
                            break;
                    }
				}
				else
				{
				    // Normal Install..
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
                        
                        commandSb.append("install ");
                        if ( bUninstallPressed == false )
                            commandSb.append("-r ");
                        
                        bUninstallPressed = false;    // Reset..
                        //commandSb.append("install -r ");
                        
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
                                {
                                    // For LibGdx projects..
                                    if ( bUsingAndroid )
                                        commandSb.append("/android");
                                    
                                    commandSb.append("/build/outputs/apk/");
                                }
                                
                                if ( iBuildType == RELEASE_BUILD )
                                    commandSb.append("release/");
                                else if ( iBuildType == DEBUG_BUILD )
                                    commandSb.append("debug/");
                            }
                        }
                        else
                            commandSb.append("/bin/");
                        
                        commandSb.append(apkNameS);
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
                        
                        commandSb.append("install ");
                        if ( bUninstallPressed == false )
                            commandSb.append("-r ");
                        
                        bUninstallPressed = false;    // Reset..
                        
                        //commandSb.append("install -r ");
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
                                //System.out.println("bUsingAppProject: "+bUsingAppProject);
                                if ( bUsingAppProject )
                                    commandSb.append("/app/build/outputs/apk/");
                                else
                                {
                                    // For LibGdx projects..
                                    if ( bUsingAndroid )
                                        commandSb.append("/android");
                                        
                                    commandSb.append("/build/outputs/apk/");
                                }
                                
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
                    }
/*
                    if ( bWirelessConnected == false )
                    {
                        // Signal to kill adb..
                        bKillLogcat = true;
                    }
/**/
                    commandS = commandSb.toString();
                    
                    ioBgThread = new IOBgThread();
                    ioBgThread.start();
                }
				
			}
			else if ( (BREAKPOINT.equals(actionCommandS)) && (iCardShowing == DEBUG_CARD) )
			{
				// Breakpoint button hit..
				//System.out.println("\nBREAKPOINT (button hit)");
				
				iDebugCommand = DEBUG_COMMAND_SET_BREAKPOINT;
				
				LineTableInfo lineTableInfo = null;
				LineInfo lineInfo = null;
				String sKey = "";
				long lLineCodeIndex = 0;
				long lMethodId = 0;
				long lClassId;
				int iLen;
				int iSelIndex = 0;
				int iLineNumber = 0;
				TabInfo tabInfo = null;
				HashMap tHm = null;
				Set treeSet;
                Iterator treeIterator;
                Set set;
                Iterator iterator;
                Entry entry;
                TreeMap treeMap;
                HashMap lineHm;
                Integer IVal;
				
				//System.out.println("currentClassId: "+currentClassId);
				BreakpointInfo breakpointInfo = new BreakpointInfo();

				if ( bFlutterSelected == false )
				{
                    if ( (TabInfoAr != null) && (TabInfoAr.size() > 0) )
                    {
                        iSelIndex = tabbedPane.getSelectedIndex();
                        //System.out.println("(Selected tab)iSelIndex: "+iSelIndex);
                        if ( iSelIndex < TabInfoAr.size() )
                        {
                            tabInfo = (TabInfo)TabInfoAr.get(iSelIndex);
                            
                            sKey = tabInfo.sKeyPath;
                            //System.out.println("sKey: '"+sKey+"'");
                            tHm = (HashMap)NodeHm.get((String)sKey);
                        }
                    }
                }
				
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
					    iLineNumber = iSelectedLine;
					    //System.out.println("iLineNumber: "+iLineNumber);
					    //sKey = tabInfo.sKeyPath;
					    //tHm = (HashMap)NodeHm.get((String)sKey);
					    lineInfo = (LineInfo)tHm.get((Integer)iLineNumber);
					    if ( lineInfo != null )
					    {
					        //System.out.println("lineInfo.lTypeId: "+lineInfo.lTypeId);
					        //System.out.println("lineInfo.lMethodId: "+lineInfo.lMethodId);
					        //System.out.println("lineInfo.sMethodName: '"+lineInfo.sMethodName+"'\n");
                            //breakpointInfo.lClassId = currentClassId;
                            breakpointInfo.lClassId = lineInfo.lTypeId;
                            //System.out.println("breakpointInfo.lClassId: "+breakpointInfo.lClassId);
                            //lClassId = currentClassId;
                            lClassId = lineInfo.lTypeId;
                            //System.out.println("lClassId: "+lClassId);
                            
                            //System.out.println("lMethodSelection: "+lMethodSelection);
                            //breakpointInfo.lMethodId = lMethodSelection;
                            breakpointInfo.lMethodId = lineInfo.lMethodId;
                            //System.out.println("breakpointInfo.lMethodId: "+breakpointInfo.lMethodId);
                            //lMethodId = lMethodSelection;
                            lMethodId = lineInfo.lMethodId;
                            //System.out.println("lMethodId: "+lMethodId);
                            
                            lLineCodeIndex = lineInfo.lLineCodeIndex;
                            //System.out.println("lLineCodeIndex: "+lLineCodeIndex);
                            
                            breakpointInfo.lLineCodeIndex = lLineCodeIndex;
                            breakpointInfo.iLineNumber = iLineNumber;
                            
                            breakpointInfo.sMethodName = lineInfo.sMethodName;
                            //System.out.println("breakpointInfo.sMethodName: '"+breakpointInfo.sMethodName+"'");
                            
                        }
                        else
                        {
                            //System.out.println("LineInfo null");
                            
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
							//System.out.println("\n(Flutter)Doing 'addBreakpoint'");
							
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
							
						}
						catch (WebSocketException wse)
						{
							wse.printStackTrace();
						}
					}
				}
				else
				{

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
			}
			else if ( (STEP_INTO.equals(actionCommandS)) && (iCardShowing == DEBUG_CARD) )
			{
				// Show current line..
				//System.out.println("STEP_INTO");
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
					//System.out.println("lCurrentThreadId: "+lCurrentThreadId);
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
				
                //System.out.println("bFlutterSelected: "+bFlutterSelected);
                //System.out.println("bKotlinSelected: "+bKotlinSelected);
                //System.out.println("bNDKSelected: "+bNDKSelected);
                //System.out.println("bGradleSelected: "+bGradleSelected);
				
				
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
					//System.out.println("\nFile selected");
					
					// Reset all..
					if ( uGradleMenuItem != null )
					{
					    uGradleMenuItem.setState(false);
					    //System.out.println("\n(c)Setting to false");
					}
					
					if ( uKotlinMenuItem != null )
					    uKotlinMenuItem.setState(false);
					
					if ( uFlutterMenuItem != null )
					    uFlutterMenuItem.setState(false);
					
					if ( uNDKMenuItem != null )
					    uNDKMenuItem.setState(false);
					
					bHaveDir = true;
					projectHomeS = fChooser.getSelectedFile().toString();
					projectHomeS = Utils.processPath(projectHomeS);
					//System.out.println("projectHomeS: '"+projectHomeS+"'");
					File file;
					byte[] buffer = null;
					StringBuffer fSb;

					fSb = new StringBuffer(projectHomeS);

					// Check for /app directory..
					// 'C:/Android/Dev/RPG/libGDX-master/build.gradle'
					StringBuffer tSb = new StringBuffer(projectHomeS);
					tSb.append("/app");
					File tFile = new File(tSb.toString());
					if ( tFile.exists() )
					{
					    // 'app' exists..
						bUsingAppProject = true;
						fSb.append("/app/build.gradle");
					}
					else
					{
						bUsingAppProject = false;
						fSb.append("/build.gradle");
					}
					
					//System.out.println("fSb: '"+fSb.toString()+"'");
					// Like:  'C:/Android/Dev/libgdx-demo-superjumper-master/build.gradle'
					file = new File(fSb.toString());
					if ( file.exists() )
					{
					    // Found build.gradle..
						//System.out.println("--Exists--");
/*						
                        if ( uGradleMenuItem == null )
                            System.out.println("uGradleMenuItem null");
                        else
                            System.out.println("uGradleMenuItem not null");
/**/
						
						if ( uGradleMenuItem != null )
						    uGradleMenuItem.setState(true);

						buffer = readFile(2048, fSb.toString());
						String tS = new String(buffer);
						iLoc2 = tS.indexOf("kotlin");
						if ( iLoc2 != -1 )
						{
						    //System.out.println("==Found kotlin==");
							sType = "KOTLIN";
							if ( uKotlinMenuItem != null )
							    uKotlinMenuItem.setState(true);
						}
						else
						{
							sType = "GRADLE";
						}

						
                        //if ( (sDontModifyBuildGradle != null) && (sDontModifyBuildGradle.length() > 0)
                            //&& (sDontModifyBuildGradle.equals("true"))  )
                        if ( (sDontModifyBuildGradle != null) && (sDontModifyBuildGradle.equals("true")) )
                            ;
                        else
                        {
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
						
						//System.out.println("Past GradleConfigBgThread wait");
						
					}
					else
					{
						// No build.gradle in project directory, check Flutter..
						fSb = new StringBuffer(projectHomeS);
						fSb.append("/android/app/build.gradle");
						file = new File(fSb.toString());
						if ( file.exists() )
						{
							// Flutter..
							sType = "FLUTTER";
							if ( uFlutterMenuItem != null )
							    uFlutterMenuItem.setState(true);
							
                            if ( (sDontModifyBuildGradle != null) && (sDontModifyBuildGradle.equals("true")) )
                                ;
                            else
                            {
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
						}
						else
						{
							sType = "ANT";
						}
					}
					
					//System.out.println("sType: '"+sType+"'");	
					uSdkMenuItem.setState(false);
					
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
						//boolean bMatch = false;
						bMatch = false;
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

					//System.out.println("(statusLabel.setText())projectHomeS: '"+projectHomeS+"'");
					statusLabel.setText(projectHomeS);
					statusPath.setText(" ");	// Clear status..
/*					
					System.out.println("==================");
					System.out.println("uGradleMenuItem.getState(): "+uGradleMenuItem.getState());
					System.out.println("uKotlinMenuItem.getState(): "+uKotlinMenuItem.getState());
					System.out.println("uFlutterMenuItem.getState(): "+uFlutterMenuItem.getState());
					System.out.println("uNDKMenuItem.getState(): "+uNDKMenuItem.getState());
/**/					
				}

				updateStorage();    // Write store.tmp..
				init();		// Reset..
				
                // Get Package name..
                getPackageName();
                
                // Update UI..
                //System.out.println("bFlutterSelected: "+bFlutterSelected);
                if ( bFlutterSelected )
                {
                    // Turn on Flutter UI..
                    if ( runButton != null )
                        runButton.setVisible(true);
                    
                    if ( attachButton != null )
                        attachButton.setVisible(true);
                    
                    if ( reloadButton != null )
                        reloadButton.setVisible(true);
                }
                else
                {
                    // Flutter UI should not be showing..
                    if ( (runButton != null) && (runButton.isVisible()) )
                    {
                        // Turn off Flutter UI..
                        runButton.setVisible(false);
                        
                        if ( attachButton != null )
                            attachButton.setVisible(false);
                        
                        if ( reloadButton != null )
                            reloadButton.setVisible(false);
                    }
                }
                
                //System.out.println("**3bGradleSelected: "+bGradleSelected);
                if ( (bGradleSelected) || (bNDKSelected) )
                {
                    // Hide if not Ant build..
                    updateMenuItem.setVisible(false);
                }
                else
                {
                    updateMenuItem.setVisible(true);
                }
                
                //System.out.println("Exiting HOME");
				
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
			else if ( GENERATE_KEY_STORE.equals(actionCommandS) )
			{
				//System.out.println("GENERATE_KEY_STORE");
				
				bDoRefresh = true;
				
				bOkayToDoKeytool = false;
                bCheckPasswordsFinished = false;			    
			    CheckKeystorePasswords();
			    
			    //System.out.println("Back from CheckKeystorePasswords()");
/*			    
			    if ( sAppBundleKeystorePath == null )
			        System.out.println("sAppBundleKeystorePath null");
			    else
			        System.out.println("sAppBundleKeystorePath: '"+sAppBundleKeystorePath+"'");
/**/

			    //System.out.println("bOkayToDoKeytool: "+bOkayToDoKeytool);
                if ( bOkayToDoKeytool )
                {
                    keytoolDialog();	
                }
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
			else if ( GENERATE_KEY_STORE_SUBMIT.equals(actionCommandS) )
			{
			    //System.out.println("GENERATE_KEY_STORE_SUBMIT");
			    StringBuffer sB = new StringBuffer();
			    int iLoc = 0;
			    int iLoc2 = 0;
			    String sCountryCode = "";
/*
                bCheckPasswordsFinished = false;			    
			    CheckKeystorePasswords();
			    
			    // Wait till check is completed..
			    while ( true )
			    {
			        try
			        {
			            Thread.sleep(250);
			        }
			        catch (InterruptedException ie)
			        {
			        }
			        
			        if ( bCheckPasswordsFinished )
			            break;
			    }
			    
			    System.out.println("Back from CheckKeystorePasswords()");
/**/	

/*
			    if ( sAppBundleKeystorePath == null )
			        System.out.println("sAppBundleKeystorePath null");
			    else
			        System.out.println("sAppBundleKeystorePath: '"+sAppBundleKeystorePath+"'");
/**/			    
			    //sB.append("keytool -genkey -keystore ");
			    sB.append("keytool -genkey -v -keystore ");
			    sB.append("\"");
			    sB.append(sAppBundleKeystorePath);
			    sB.append("\"");
			    sB.append("  -keyalg RSA -keysize 2048 -validity 10000 -alias ");
			    sB.append(sAppBundleKeyAlias);

                // Needed for Java 9 and newer..			    
			    sB.append(" -storetype JKS");
			    
			    sB.append(" -dname \"CN=");
			    String sFirstLastName = firstLastNameField.getText();
			    sFirstLastName = sFirstLastName.trim();
			    sB.append(sFirstLastName);
			    
			    sB.append(", OU=");
			    String sOrganizationUnit = organizationUnitField.getText();
			    sOrganizationUnit = sOrganizationUnit.trim();
			    sB.append(sOrganizationUnit);
			    
			    sB.append(", O=");
			    String sOrganization = abOrganizationField.getText();
			    sOrganization = sOrganization.trim();
			    sB.append(sOrganization);
			    
			    sB.append(", L=");
			    String sCityLocality = cityLocalityField.getText();
			    sCityLocality = sCityLocality.trim();
			    sB.append(sCityLocality);
			    
			    sB.append(", ST=");
			    String sStateProvince = stateProvinceField.getText();
			    sStateProvince = sStateProvince.trim();
			    sB.append(sStateProvince);
			    
			    sB.append(", C=");
			    //int iSel = countryCodesJList.getSelectedIndex();
			    //System.out.println("iSel: "+iSel);
			    String sSelValue = (String)countryCodesJList.getSelectedValue();
			    iLoc = sSelValue.indexOf("(");
			    if ( iLoc != -1 )
			    {
                    iLoc2 = sSelValue.indexOf(")");
                    if ( iLoc2 != -1 )
                    {
                        sCountryCode = sSelValue.substring(iLoc + 1, iLoc2);
                    }
			    }
			    
			    sB.append(sCountryCode);
			    
			    sB.append("\"");
			    
			    sB.append(" -keypass ");
			    sB.append(sAppBundleKeyAliasPassword);
			    sB.append(" -storepass ");
			    sB.append(sAppBundleKeystorePassword);
			    
			    commandSb = new StringBuffer();
			    
			    if ( iOS == LINUX_MAC )
			    {
                    commandSb.append("export PATH=${PATH}:");
                    commandSb.append("\"");
                    commandSb.append(javaPathS);
                    commandSb.append("/bin");
                    commandSb.append("\"");
                    
                    commandSb.append(";export JAVA_HOME=");
                    commandSb.append("\"");
                    commandSb.append(javaPathS);
                    commandSb.append("\"");

                    commandSb.append(";");
                    commandSb.append(sB.toString());
			    }
			    else
			    {
                    commandSb.append("SET PATH=");
                    commandSb.append("\"");
                    commandSb.append(javaPathS);
                    commandSb.append("/bin");
                    commandSb.append("\"");
                    commandSb.append(";%PATH%");
                    
                    commandSb.append("&&SET JAVA_HOME=");
                    commandSb.append("\"");
                    commandSb.append(javaPathS);
                    commandSb.append("\"");
                    
                    commandSb.append("&&");
                    commandSb.append(sB.toString());
			        commandSb.append("\n");
			    }
			    
			    //System.out.println("commandSb: '"+commandSb.toString()+"'");
			    commandS = commandSb.toString();
			    
                ioBgThread = new IOBgThread();
                ioBgThread.start();
			    
/*			    
                bCommandFinished = false;
                internalCommandS = commandSb.toString();
                commandBgThread = new CommandBgThread();
                commandBgThread.start();
    
                // Wait for Thread to finish..
                while ( true )
                {
                    try
                    {
                        Thread.sleep(250);
                    }
                    catch (InterruptedException ie)
                    {
                    }
    
                    if ( bCommandFinished )
                        break;
                }
/**/

                // We should output to the console
                // so you can see any errors..
                keytoolFrame.dispose();
			    
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
						commandSb.append("\n");
					
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

                        if ( (sDontModifyBuildGradle != null) && (sDontModifyBuildGradle.equals("true")) )
                            ;
                        else
                        {
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
/*				
				if ( keyAliasField == null )
				    System.out.println("keyAliasField null");
				else
				    System.out.println("keyAliasField not null");
/**/
                // Signal not to do a refresh, which would
                // wipe out what we are filling in..				
				bDoRefresh = false;
				        
				// Note:
				// We need to call Utils.processPath()
				// to remove any surrounding double quotes..
				if ( keyAliasField != null )
				{
				    if ( (sUseAppBundle != null) && (sUseAppBundle.equals("true")) )
				    {
				        sAppBundleKeyAlias = Utils.processPath(keyAliasField.getText());
				        sAppBundleKeyAlias = sAppBundleKeyAlias.trim();
				    }
				    else
				    {
                        sKeyAlias = Utils.processPath(keyAliasField.getText());
                        sKeyAlias = sKeyAlias.trim();
                    }
				}
				
				if ( keystorePathField != null )
				{
				    if ( (sUseAppBundle != null) && (sUseAppBundle.equals("true")) )
				    {
				        sAppBundleKeystorePath = Utils.processPath(keystorePathField.getText());
				        sAppBundleKeystorePath = sAppBundleKeystorePath.trim();
				    }
				    else
				    {
                        sKeystorePath = Utils.processPath(keystorePathField.getText());
                        sKeystorePath = sKeystorePath.trim();
                    }
				}

				if ( keyAliasPasswordField != null )
				{
				    if ( (sUseAppBundle != null) && (sUseAppBundle.equals("true")) )
				    {
				        sAppBundleKeyAliasPassword = Utils.processPath(keyAliasPasswordField.getText());
				        sAppBundleKeyAliasPassword = sAppBundleKeyAliasPassword.trim();
				    }
				    else
				    {
                        sKeyAliasPassword = Utils.processPath(keyAliasPasswordField.getText());
                        sKeyAliasPassword = sKeyAliasPassword.trim();
                    }
				}

				if ( keystorePasswordField != null )
				{
				    if ( (sUseAppBundle != null) && (sUseAppBundle.equals("true")) )
				    {
				        sAppBundleKeystorePassword = Utils.processPath(keystorePasswordField.getText());
				        sAppBundleKeystorePassword = sAppBundleKeystorePassword.trim();
				    }
				    else
				    {
                        sKeystorePassword = Utils.processPath(keystorePasswordField.getText());
                        sKeystorePassword = sKeystorePassword.trim();
                    }
				}
				
				//System.out.println("sKeystorePath: '"+sKeystorePath+"'");
				//System.out.println("sKeyAlias: '"+sKeyAlias+"'");
				//System.out.println("sKeystorePassword: '"+sKeystorePassword+"'");
				//System.out.println("sKeyAliasPassword: '"+sKeyAliasPassword+"'");
				
				// Signal finished..
				bReleaseCheckFinished = true;
				bCheckPasswordsFinished = true;
				bOkayToDoRelease = true;
				releaseFrame.dispose();
				
/*			    
			    if ( sAppBundleKeystorePath == null )
			        System.out.println("sAppBundleKeystorePath null");
			    else
			        System.out.println("sAppBundleKeystorePath: '"+sAppBundleKeystorePath+"'");
/**/
                if ( bOkayToDoKeytool )
                {
                    keytoolDialog();
                }
				
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
				{
                    findSourcePath();
                    StringBuffer sB = new StringBuffer();
                    sB.append(sSourceDirectory);
                    
                    String sModPackageName = sPackageName.replace('.', (char)0x2f);
                    sB.append((char)0x2f);
                    sB.append(sModPackageName);
                    //System.out.println("sB: '"+sB.toString()+"'");
				 
				    getTreeClasses(sB.toString());
				}
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
				
				// Or
				// 'adb.exe: no devices/emulators found
				
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
					if ( commandResultS.contains("no devices") )
					{
						// Error..
						bResultsOk = false;
					}
					
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
				if ( searchField != null )
				{
				    sSearchText = "";
				    sSearchText = searchField.getText();
				}
				
				sSearchText = sSearchText.trim();
				//System.out.println("sSearchText: '"+sSearchText+"'");
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
					//System.out.println("Didn't find");
					//System.out.println("bIsNext: "+bIsNext);
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

				//System.out.println("bDoHighlight: "+bDoHighlight);
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
			else if ( REFRESH.equals(actionCommandS) )
			{
				RefreshProperties();
			}
			else if ( CLOSE_DIALOG.equals(actionCommandS) )
			{
				informationFrame.dispose();
			}
			else if ( CREATE_CANCEL.equals(actionCommandS) )
			{
				createFrame.dispose();
			}
			else if ( GENERATE_KEY_STORE_CANCEL.equals(actionCommandS) )
			{
				keytoolFrame.dispose();
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
/*
			else if ( (MARK.equals(actionCommandS)) && (iCardShowing == DEBUG_CARD) )
			{
			    System.out.println("\nMark");
			    // Internal testing
			    //System.out.println("\n***************************************************");
			    //System.out.println("***************************************************\n");
			    
				try
				{	
					doc = textPane.getStyledDocument();	
					int iLen = doc.getLength();
					System.out.println("iLen: "+iLen);
					
					StringBuffer outSb = new StringBuffer();
					outSb.append("\n=============================================");
					outSb.append("=============================================\n");
					
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
/**/
			else if ( (DUMP_STACK.equals(actionCommandS)) && (iCardShowing == DEBUG_CARD) )
			{
				FramesInfo framesInfo;
				MethodInfo methodInfo;
				LineTableInfo lineTableInfo;
				//TabTextAreaInfo tabTextAreaInfo;
				TabInfo tabInfo = null;
				
				FramesAr = null;
				
				long lClassId;
				long lMethodId;
				long lLineCodeIndex;
				long lLocationIndex;
				int iLineNumber = 0;
				int iLineNum = 0;
				int iSelect = 0;
				boolean bFirst;
				boolean bContinue;
				String sSig;
				String sSrc = "";
				String sKey = "";
				String sMethodName = "";
				StringBuffer outSb = new StringBuffer();
				StringBuffer sb;
				ArrayList t2Ar;
				
                HashMap lineHm;
                Set set;
                Iterator iterator;
                Integer IVal;
                LineInfo lineInfo;
				
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
							    sT = "";
							    if ( iX < t2Ar.size() )
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
							//System.out.println("sSrc: '"+sSrc+"'");
							
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
										//System.out.println("sMethodName: '"+sMethodName+"'");
										break;
									}
								}
							}
	
							if ( lLocationIndex != -1 )
							{
                                // We are getting lLineCodeIndexAr
                                // from command_LineTable(), so we can get the line number from there..							    
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
/**/								
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
				
				if ( (TabInfoAr != null) && (TabInfoAr.size() > 0) )
				{
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
				bWirelessEnabled = true;

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
				bWirelessEnabled = false;
				
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
						if ( classVariableInfo != null )
						{
                            sSig = classVariableInfo.sSignature;
                            iModBits = classVariableInfo.iModBits;
                            fieldId[0] = (int)classVariableInfo.lFieldId;
                        }
					}
					else
					{
						localVariableInfo =
							(LocalVariableInfo)LocalVariableLHm.get(new Integer(iLocalVariableKey));
						if ( localVariableInfo != null )
						{
                            sSig = localVariableInfo.sSignature;
                            iSlot[0] = localVariableInfo.iSlot;
                        }
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
				if ( DevicesAr == null )
					System.out.println("(Before selectDeviceDialog())DevicesAr null");
				else
					System.out.println("(Before selectDeviceDialog())DevicesAr.size(): "+DevicesAr.size());
/**/

				//if ( (DevicesAr != null) && (DevicesAr.size() > 0) )
					//selectDeviceDialog();

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
			else
			{
			    //System.out.println("\nIn end else");
			    
				if ( (projectHomeS != null) && (projectHomeS.length() > 0) )
				{
					int iLoc = projectHomeS.lastIndexOf('/');
					String sIn = projectHomeS.substring(iLoc + 1);
					
					//System.out.println("sIn: '"+sIn+"'");
					if ( sIn.equals(actionCommandS) )
					    //System.out.println("Same project");
						;	// Same project..
					else
					{
						// Select project from submenu..
						//System.out.println("\nSelect Project");
						bProjectSelected = true;
						// 'C:/Android/Dev/GT_Three~GRADLE'...
						String sOut = readStorage("recent.tmp");
						if ( (sOut != null) && (sOut.length() > 0) )
						{
							//System.out.println("sOut: '"+sOut+"'");
							StringTokenizer st = new StringTokenizer(sOut, "~");
							int iCount = st.countTokens();
							String sTok;
							String sTitle;
							bMatch = false;
							
							for ( int iG = 0; iG < iCount; iG++ )
							{
							    //System.out.println("--TOP-- iG: "+iG);
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
										    // Change project..
										    bMatch = true;
										    bMatchedProject = true;

                                            // This is to try to help with it not getting errors
                                            // of it not commenting out:  storeFile file(keystoreProperties['storeFile'])
                                            // in build.gradle..										    
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
										    
											// Get project type..
											sTitle = sTok;	// Save..
											sTok = st.nextToken();
											//System.out.println("(type)sTok: '"+sTok+"'");
											if ( sTok.equals("ANT") )
											{
												uGradleMenuItem.setState(false);
												//System.out.println("\n(b)Setting to false");
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
	
											// Write store.tmp..
											updateStorage();
											
											init();		// Reset..
											
                                            // Get Package name..
                                            getPackageName();
                                            
                                            //System.out.println("**2bGradleSelected: "+bGradleSelected);
                                            if ( (bGradleSelected) || (bNDKSelected) )
                                            {
                                                // Hide if not Ant build..
                                                updateMenuItem.setVisible(false);
                                            }
                                            else
                                            {
                                                updateMenuItem.setVisible(true);
                                            }
                                            
                                            // Update UI..
                                            //System.out.println("bFlutterSelected: "+bFlutterSelected);
                                            if ( bFlutterSelected )
                                            {
                                                // Turn on Flutter UI..
                                                if ( runButton != null )
                                                    runButton.setVisible(true);
                                                
                                                if ( attachButton != null )
                                                    attachButton.setVisible(true);
                                                
                                                if ( reloadButton != null )
                                                    reloadButton.setVisible(true);
                                            }
                                            else
                                            {
                                                // Flutter UI should not be showing..
                                                if ( (runButton != null) && (runButton.isVisible()) )
                                                {
                                                    // Turn off Flutter UI..
                                                    runButton.setVisible(false);
                                                    
                                                    if ( attachButton != null )
                                                        attachButton.setVisible(false);
                                                    
                                                    if ( reloadButton != null )
                                                        reloadButton.setVisible(false);
                                                }
                                            }
											
											break;
										}
									}
								}
							}    // End for..

							if ( bMatch == false )
							{
							    // Try to match with Gradlew commands..
							    if ( (CommandAr != null) && (CommandAr.size() > 0) )
							    {
							        for ( int iX = 0; iX < CommandAr.size(); iX++ )
							        {
							            sGradlewCommand = (String)CommandAr.get(iX);
							            if ( actionCommandS.equals(sGradlewCommand) )
							            {
							                bMatch = true;
							                break;
							            }
							        }
							        
							        if ( bMatch )
							        {
							            // Gradlew command..
                                        commandSb = new StringBuffer();
                                        
                                        if ( iOS == LINUX_MAC )
                                        {
                                            // Gradle, Kotlin..
                                            commandSb.append("export ANDROID_HOME=");
                                            commandSb.append(androidSdkPathS);
                                            
                                            commandSb.append(";export PATH=${PATH}:");
                                            commandSb.append(javaPathS);
                        
                                            commandSb.append(";export JAVA_HOME=");
                                            commandSb.append(javaPathS);
                                            
                                            commandSb.append(";cd ");
                                            commandSb.append(projectHomeS);
                                            
                                            commandSb.append(";");
                                        }
                                        else
                                        {
                                            // Gradle, Kotlin..
                                            commandSb.append("SET ANDROID_HOME=");
                                            commandSb.append(androidSdkPathS);
                                            
                                            commandSb.append("&&SET JAVA_HOME=");
                                            commandSb.append(javaPathS);
                        
                                            commandSb.append("&&CD ");
                                            commandSb.append(projectHomeS);
                                            
                                            commandSb.append("&&");
                                        }
                                        
                                        commandSb.append("gradlew ");
                                        commandSb.append(sGradlewCommand);
                                        
                                        if ( iOS == WINDOWS )
                                            commandSb.append("\n");

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

                                                // If we didn't set up signing, we shouldn't set up /key.properties.. 
                                                if ( (sDontModifyBuildGradle != null) && (sDontModifyBuildGradle.equals("true")) )
                                                    ;
                                                else
                                                {
                                                    // Create Flutter or Gradle /key.properties..
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
                                                        
                                                        if ( bReleaseFinished )
                                                            break;
                                                    }
                                                }

                                                //commandS = commandSb.toString();
                                                
                                                bFinished = false;
                                                //bIOBgThreadFinished = false;
                                                ioBgThread = new IOBgThread();
                                                ioBgThread.start();
                    
                                                // Wait for Thread to finish..
                                                while ( true )
                                                {
                                                    try
                                                    {
                                                        Thread.sleep(150);
                                                    }
                                                    catch (InterruptedException ie)
                                                    {
                                                    }
                                                    
                                                    if ( bFinished )
                                                    //if ( bIOBgThreadFinished )
                                                    {
                                                        progressJFrame.dispose();
                                                        break;
                                                    }
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
							    }
							}
						}
					}
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
/*			
			if ( appNmField == null )
			    System.out.println("appNmField null");
			else
			    System.out.println("appNmField not null");
/**/			    
			    
			if ( appNmField != null )
			{
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
				
		// Check if we have it..
		if ( (sPropertiesPackageName != null) && (! sPropertiesPackageName.equals("null")) &&
		    (sPropertiesPackageName.length() > 0) )
	    {
	        packageNameS = sPropertiesPackageName;
	    }
	    else
	    {
            int iLoc;
            int iLoc2;
            String sIn = "";
            StringBuffer tSb;		
            File fileT3;

            packageNameS = "";
            
            if ( (projectHomeS != null) && (projectHomeS.length() > 0) )
            {
                StringBuffer sb = new StringBuffer(projectHomeS);
                
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
        
                    // In Home, Ant..
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
    
                // Note:
                // If it can't find AndroidManifest.xml
                // the path in 'sb' will be invalid..
                
                // Check that it's a valid file..
                File file = new File(sb.toString());
                if ( file.isFile() )
                {
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
                }
                else
                {
                    // Put up Dialog..
                    JOptionPane.showMessageDialog(
                        frame,
                        "Cannot find package name, set in config.properties",
                        "Package name",
                        JOptionPane.WARNING_MESSAGE);
                }
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
			if ( organizationField != null )
			{
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
/*			
			if ( sAppNm == null )
			    System.out.println("sAppNm null");
			else
			    System.out.println("sAppNm: '"+sAppNm+"'");
/**/			    
			
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

	//{{{	ActionListener tabActionListener   Close tab
	private ActionListener tabActionListener = new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			// Handle Close..
			//System.out.println("\ntabActionListener actionPerformed()");
			int iTabCnt = 0;
			int iIndex = 0;
			boolean bSkip = false;

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

            if ( jTabbedPane != null )
            {
                iTabCnt = jTabbedPane.getTabCount();
                //System.out.println("iTabCnt: "+iTabCnt);
           }
            
			// javax.swing.plaf.basic.BasicTabbedPaneUI$TabContainer			
			Component tabContainer = (Component)jButton.getParent();	// javax.swing.JPanel

/*			
			if ( tabContainer == null )
				System.out.println("tabContainer null");
			else
				System.out.println("tabContainer: "+tabContainer);
/**/

            // If only one tab open, don't remove() it..
            if ( iTabCnt > 1 )
            {
                iIndex = jTabbedPane.indexOfTabComponent(tabContainer);
                //System.out.println("(indexOfTabComponent())iIndex: "+iIndex);
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
                    
                    //System.out.println("(After remove()) jTabbedPane.getTabCount(): "+jTabbedPane.getTabCount());				
    
                    // Remove ClassMethodInfo for this Tab..
                    if ( (ClassMethodAr != null) && (iIndex < ClassMethodAr.size()) )
                    {
                        //System.out.println("(Remove)iIndex: "+iIndex);
                        ClassMethodAr.remove(iIndex);
                    }
    
                    //System.out.println("iTabLevel: "+iTabLevel);				
                    if ( iTabLevel < 3 )
                    {
                        // Closed default..
                        // Reset all TextAreas..
                        TabInfoAr = new ArrayList();
                        
                        bDefaultTabShowing = false;
                        
                    }
                    else
                    {
                        // Remove TextArea for this Tab..				
                        if ( (TabInfoAr != null) && (iIndex < TabInfoAr.size()) )
                        {
                            TabInfoAr.remove(iIndex);
                        }
                    }
                }
            }
            else
                bSkip = true;

			if ( bSkip == false )
			{
                //System.out.println("(After remove())getTabCount(): "+jTabbedPane.getTabCount());
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
			
			//System.out.println("Exiting tabActionListener");
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
							if ( classVariableInfo != null )
							{
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
							if ( localVariableInfo != null )
							{
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
			TabInfo tabInfo = null;
			boolean bLineMatched = false;
			boolean bDoLineSelect;
			bLineSelected = false;
			long lMethodID;
			long lBpLineIndex;
			long lLnCodeIndex;
			int iLineTableLineNumber;
			int iLineNumber = 0;
			int iRequestId;
			int iLineAdjust = 0;
			int iLoc2;
			//int[] iTAr = null;
			String[] sTokenPosTableAr = null;
			String sBreakpointId;
			String sTScript;
			String sKey = "";
			
            HashMap lineHm;
            Set set;
            Iterator iterator;
            Integer IVal;
            LineInfo lineInfo;
            
			
			try
			{
				// Try to get current Tab..
				int iSelect = tabbedPane.getSelectedIndex();
				//System.out.println("(tabbedPane)iSelect: "+iSelect);
				
				if ( (TabInfoAr != null) && (TabInfoAr.size() > 0) )
				{
				    if ( iSelect < TabInfoAr.size() )
				    {
                        tabInfo = (TabInfo)TabInfoAr.get(iSelect);
                        jTextArea = tabInfo.jTextArea;
                        sTokenPosTableAr = tabInfo.sTokenPosTable;	// String[]
                        //iLineAdjust = tabInfo.iSourceLineAdjust;
                        iLineAdjust = 0;
                        //System.out.println("iLineAdjust: "+iLineAdjust);
                        
                        sKey = tabInfo.sKeyPath;
                        
                        //iTAr = tabInfo.iLineTableAr;
                        //iTAr = tabInfo.iLineNumberAr;
                        
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
					
				}
				
				
				String sText = jTextArea.getText();
				
				byte[] bytes = sText.getBytes();
				//System.out.println("(getText())bytes.length: "+bytes.length);
				
				int iAdjustedLine;
				int iActualLineNumber = 0;
				
				// Note:
				// The offset is where in
				// the line it was tapped, so it
				// can vary..
				int iOffset = jTextArea.viewToModel(e.getPoint());
				//System.out.println("iOffset: "+iOffset);

				// Zero based line number..				
				int iZeroLineNumber = jTextArea.getLineOfOffset(iOffset);
				int iOneLineNumber = iZeroLineNumber + 1;
				//System.out.println("(getLineOfOffset())iZeroLineNumber: "+iZeroLineNumber);
				//System.out.println("iOneLineNumber: "+iOneLineNumber);

                //System.out.println("iSourceLineAdjust: "+iSourceLineAdjust);				
				// Convert into actual line number, 'iSourceLineAdjust' set in Utils..
				//iActualLineNumber = iZeroLineNumber + iSourceLineAdjust;
				
				// Note:
				// We now get 'iSourceLineAdjust' from
				// TabInfo because it was changing between tabs..
				//iActualLineNumber = iZeroLineNumber + iLineAdjust;
				iActualLineNumber = iZeroLineNumber + 1;
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
/*				    
				    if ( iTAr == null )
				        System.out.println("iTAr null");
				    else
				    {
				        System.out.println("iTAr.length: "+iTAr.length);
				        //for ( int iJ = 0; iJ < iTAr.length; iJ++ )
				            //System.out.println("["+iJ+"]: "+iTAr[iJ]);
				    }
/**/


					// Check if selected, actual, line is in LineTable..
					
                    lineHm = (HashMap)NodeHm.get((String)sKey);
                    if ( lineHm != null )
                    {
                        set = lineHm.keySet();
                        iterator = set.iterator();
                        while ( iterator.hasNext() )
                        {
                            //System.out.println("-TOP-");
                            IVal = (Integer)iterator.next();
                            if ( IVal != null )
                                iLineNumber = IVal.intValue();
                            
                            //System.out.println("iLineNumber: "+iLineNumber);
                            if ( iActualLineNumber == iLineNumber )
                            {
								iSelectedLine = iActualLineNumber;
								//System.out.println("\n(Final)iSelectedLine: "+iSelectedLine);
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
					{
						System.out.println("BreakpointAr.size(): "+BreakpointAr.size());
						for ( int iJ = 0; iJ < BreakpointAr.size(); iJ++ )
						{
						    System.out.println("-------------------------------");
						    breakpointInfo = (BreakpointInfo)BreakpointAr.get(iJ);
						    System.out.println("breakpointInfo.iLineNumber: "+breakpointInfo.iLineNumber);
						    System.out.println("breakpointInfo.sBreakpointId: "+breakpointInfo.sBreakpointId);
						    System.out.println("breakpointInfo.sScriptId: "+breakpointInfo.sScriptId);
						}
					}
/**/					
					
					if ( (BreakpointAr != null) && (BreakpointAr.size() > 0) )
					{
						iBLen = BreakpointAr.size();
Break_Out:
						for ( int iB = 0; iB < iBLen; iB++ )
						{
							//System.out.println("--TOP-- iB: "+iB);
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
										
										//System.out.println("iLineNumber: "+iLineNumber+"   iOneLineNumber: "+iOneLineNumber);
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
											    //System.out.println("\n============================");
												//System.out.println("Doing removeBreakpoint");
												
												try
												{
													//
													// removeBreakpoint
													//
													
													requestLatch = new CountDownLatch(1);
													//System.out.println("sIsolateId: '"+sIsolateId+"'   sBreakpointId: '"+sBreakpointId+"'");
															
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
                                lineHm = (HashMap)NodeHm.get((String)sKey);
                                if ( lineHm != null )
                                {
                                    set = lineHm.keySet();
                                    iterator = set.iterator();
                                    while ( iterator.hasNext() )
                                    {
                                        IVal = (Integer)iterator.next();
                                        if ( IVal != null )
                                            iLineNumber = IVal.intValue();
                                        //System.out.println("iLineNumber: "+iLineNumber);
                                            
                                        lineInfo = (LineInfo)lineHm.get((Integer)iLineNumber);
                                        if ( lineInfo != null )
                                        {
                                            if ( (breakpointInfo.iLineNumber == iActualLineNumber) &&
                                                (breakpointInfo.lMethodId == lineInfo.lMethodId) )
                                            {
                                                //System.out.println("\n-Breakpoint matched-");
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
                                        }
									}    // End while..
								}
							}
						}	// End for..
					}

					if ( (BreakpointAr != null) && (BreakpointAr.size() > 0) )
					{
						for ( int iX = 0; iX < BreakpointAr.size(); iX++ )
						{
							//System.out.println("----------------");
							breakpointInfo = (BreakpointInfo)BreakpointAr.get(iX);
							//System.out.println("breakpointInfo.sScriptId: '"+breakpointInfo.sScriptId+"'");
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

					//System.out.println("\nbDoLineSelect: "+bDoLineSelect);					
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

	//{{{	TreeSelectionListener  Variable JTree, Expand
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
				sT = "";
				if ( iIndex < tNode.length )			
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
			//System.out.println("(Selected)nodeFVInfo.sPropertyName: '"+nodeFVInfo.sPropertyName+"'");
			//System.out.println("(Selected)nodeFVInfo.sKind: '"+nodeFVInfo.sKind+"'");
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
			int iChildCount = currentNode.getChildCount();

			
			//System.out.println("In variableSelectionListener");
			//updateVariableJTreeBgThread = new UpdateVariableJTreeBgThread();
			//updateVariableJTreeBgThread.start();

			// Only expand Classes or List..			
			if ( iChildCount > 0 )
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
			
			boolean bIsLeaf;
			boolean bIsExpanded;
			DefaultMutableTreeNode parentNode = null;
			DefaultMutableTreeNode firstNode;
			DefaultTreeModel model = (DefaultTreeModel)(jTree.getModel());
			
			TabInfo tabInfo = null;
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

			//TreePath parentPath = jTree.getSelectionPath();
			TreePath selectedPath;
			
/*			
			if ( parentPath == null )
				System.out.println("parentPath null");
			else
				System.out.println("parentPath not null");
/**/

            // Selected node..
            selectedPath = e.getPath();
            DefaultMutableTreeNode nodeX = (DefaultMutableTreeNode)selectedPath.getLastPathComponent();
			//DefaultMutableTreeNode nodeX = (DefaultMutableTreeNode)e.getPath().getLastPathComponent();
/*
			if ( nodeX == null )
				System.out.println("nodeX null");
			else
				System.out.println("nodeX not null");
/**/
			// Reset..
			bIsBreakpointStepEvent = false;
			
			bIsLeaf = nodeX.isLeaf();
			//System.out.println("bIsLeaf: "+bIsLeaf);
			if ( bIsLeaf )
			    ;    // Try to load source..
			else
			{
			    bIsExpanded = jTree.isExpanded(selectedPath);
			    //System.out.println("bIsExpanded: "+bIsExpanded);
			    if ( bIsExpanded )
			    {
			        // Collapse..
			        jTree.collapsePath(selectedPath);
			        return;
			    }
			}
			
			
			Object nodeObject = nodeX.getUserObject();
			
			//System.out.println("nodeObject: "+nodeObject);
			NodeInfo nInfo = (NodeInfo)nodeX.getUserObject();
/*			
			if ( nInfo == null )
				System.out.println("nInfo null");
			else
				System.out.println("nInfo not null");
/**/
			
			//System.out.println("(Selected node)nInfo.lId: "+nInfo.getId());
			//System.out.println("(Selected node)nInfo.sName: '"+nInfo.getName()+"'");		// Like:  'main.dart'
			//System.out.println("(Selected node)nInfo.bIsClass: "+nInfo.getIsClass());
			
			boolean bIsClass = nInfo.getIsClass();
			
			long lRefTypeId = 0;
			long lClassId = 0;
			int iArIndex = (int)nInfo.getId();
			int iLevel;
			int iLoc2;
			int iLoc3;
			int iLoc4;
			int iLoc5;
			int iChildCount = 0;
			int iTabIndex = 0;
			String sSourceFilePath = "";
			String sSignature = "";
			String sT = "";
			String sSourceFileName = "";
			String sSourceText = "";
			StringBuffer sB;
			boolean bDoTab = false;
			boolean bMatched;
			Object nodeObj;
			
			//System.out.println("bIsClass: "+bIsClass);

            //System.out.println("\ntreeSelectionListener, in else");
            //System.out.println("Selected Method");
            // Selected Method..
            
            //System.out.println("In bFlutterSelected");

            //System.out.println("nInfo.sName: '"+nInfo.sName+"'");
            // Differentiate between directory and file selection..					
            if ( (nInfo.sName.contains(".dart")) ||
                (nInfo.sName.contains(".java")) ||
                (nInfo.sName.contains(".kt")) )
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
                        //for ( int iZ = 0; iZ < TabInfoAr.size(); iZ++ )
                        for ( iTabIndex = 0; iTabIndex < TabInfoAr.size(); iTabIndex++ )
                        {
                            tabInfo = (TabInfo)TabInfoAr.get(iTabIndex);
/*									
                            if ( tabInfo.sSourcePath == null )
                                System.out.println("tabInfo.sSourcePath null");
                            else
                                System.out.println("tabInfo.sSourcePath: '"+tabInfo.sSourcePath+"'");
/**/									    
                            if ( (tabInfo.sSourcePath != null) && (tabInfo.sSourcePath.length() > 0) )
                            {
                                //if ( tabInfo.sSourcePath.equals(sSourceFilePath) )
                                if ( sSourceFilePath.equals(tabInfo.sSourcePath) )
                                {
                                    //System.out.println("Dup, matched");
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

            //System.out.println("\nbDoTab: "+bDoTab);				
            if ( bDoTab )
            {
                // Tab doesn't exist, create it..
                
/*				    
                if ( sSourceFilePath == null )
                    System.out.println("sSourceFilePath null");
                else
                    System.out.println("sSourceFilePath: '"+sSourceFilePath+"'");
/**/						
                
                if ( bFlutterSelected )
                {
                    updateSource(sSourceFilePath);
                }
                else
                {
                    lMethodSelection = lMethodId;
                    lCurrentSelectedMethod = lMethodId;
                    
                    updateSource(sSourceFilePath);
                }
            }
            else
            {
                // Source tab exists, select it..
                int iSelIndex = 0;

                // Select matching tab..					
                //System.out.println("Doing setSelectedIndex() on iMethodIndex: "+iMethodIndex);
                //System.out.println("Doing setSelectedIndex() on iTabIndex: "+iTabIndex);
                tabbedPane.setSelectedIndex(iTabIndex);
                bTabSelected = false;    // Reset..
                
            }
			
			//System.out.println("\n\nExiting treeSelectionListener");
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
	
	//{{{	ItemListener	'Use Gradle', 'Use Flutter', 'Use Kotlin' & 'Use NDK' 
	/**
     * Listen for changes to 'Use Gradle', 'Use Flutter', 'Use Kotlin', 'Use NDK'
     */
	private ItemListener itemListener = new ItemListener()
	{
		public void itemStateChanged(ItemEvent e)
		{
			//System.out.println("itemStateChanged()");
			//System.out.println("\nbProjectSelected: "+bProjectSelected);
/*
            System.out.println("================== IN");
            System.out.println("uGradleMenuItem.getState(): "+uGradleMenuItem.getState());
            System.out.println("uKotlinMenuItem.getState(): "+uKotlinMenuItem.getState());
            System.out.println("uFlutterMenuItem.getState(): "+uFlutterMenuItem.getState());
            System.out.println("uNDKMenuItem.getState(): "+uNDKMenuItem.getState());
/**/

			int iState = e.getStateChange();
			String textS = "";
			
			Object obj = e.getItem();
			if ( obj instanceof JMenuItem )
			{
				JMenuItem menuItem = (JMenuItem)e.getSource();
				textS = menuItem.getText();
			}
/*			
            if ( textS == null )
                System.out.println("textS null");
            else
                System.out.println("textS: '"+textS+"'");
/**/

            if ( bProjectSelected )
                ;
            else
            {
                if ( textS.equals("Use NDK") )
                {
                    if ( iState == ItemEvent.SELECTED )
                    {
                        bNDKSelected = true;
                        
                        // Unselect 'Use Gradle'..
                        if ( uGradleMenuItem != null )
                        {
                            uGradleMenuItem.setState(false);
                            //System.out.println("\n(d)Setting to false");
                        }
    
                        // Unselect 'Use Kotlin'..
                        if ( uKotlinMenuItem != null )
                            uKotlinMenuItem.setState(false);
    
                        // Unselect 'Use Flutter'..
                        if ( uFlutterMenuItem != null )
                            uFlutterMenuItem.setState(false);
                        
                        if ( updateMenuItem != null )
                            updateMenuItem.setVisible(false);
                        
                        // Hide Flutter buttons..
                        if ( runButton != null )
                            runButton.setVisible(false);
                        
                        if ( attachButton != null )
                            attachButton.setVisible(false);
                        
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
                        //System.out.println("Use Gradle selected");
                        bGradleSelected = true;
                        
                        if ( (bFlutterSelected == false) && (bKotlinSelected == false) )
                        {
                            // Hide Flutter buttons..
                            if ( runButton != null )
                                runButton.setVisible(false);
                            
                            if ( attachButton != null )
                                attachButton.setVisible(false);
                            
                            if ( reloadButton != null )
                                reloadButton.setVisible(false);
                        }
    
                        if ( updateMenuItem != null )
                            updateMenuItem.setVisible(false);
                        
                        // Unselect 'Use NDK'..
                        if ( bNDKSelected )
                        {
                            if ( uNDKMenuItem != null )
                                //uNDKMenuItem.setSelected(false);
                                uNDKMenuItem.setState(false);
    
                            // Restore 'Debug' Button..
                            debugButton.setIcon(debug24Icon);
                            debugButton.setToolTipText("Debug");
                            
                            releaseButton.setVisible(true);	// Enable..
                        }
                    }
                    else if ( iState == ItemEvent.DESELECTED )
                    {
                        //System.out.println("Use Gradle unselected");
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
                        
                        //if ( (statusLabel != null) && (bHomeJustSet == false) )
                            //statusLabel.setText(" ");
    
                        // Unselect 'Use NDK'..
                        if ( bNDKSelected )
                        {
                            if ( uNDKMenuItem != null )
                                //uNDKMenuItem.setSelected(false);
                                uNDKMenuItem.setState(false);
    
                            // Restore 'Debug' Button..
                            debugButton.setIcon(debug24Icon);
                            debugButton.setToolTipText("Debug");
                            
                            releaseButton.setVisible(true);	// Enable..
                        }
                        
                        if ( updateMenuItem != null )
                            updateMenuItem.setVisible(false);
    
                        // Unselect 					
                        if ( uKotlinMenuItem != null )
                            uKotlinMenuItem.setState(false);
    
                        // Select 'Use Gradle'..
                        if ( uGradleMenuItem != null )
                            uGradleMenuItem.setState(true);
    
                        // Show Flutter buttons..					
                        if ( runButton != null )
                            runButton.setVisible(true);
                        
                        if ( attachButton != null )
                            attachButton.setVisible(true);
                        
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
                        {
                            uGradleMenuItem.setState(false);
                            //System.out.println("\n(e)Setting to false");
                        }
                        
                        // Hide Flutter buttons..
                        if ( runButton != null )
                            runButton.setVisible(false);
                        
                        if ( attachButton != null )
                            attachButton.setVisible(false);
                        
                        if ( reloadButton != null )
                            reloadButton.setVisible(false);
                    }
                }
                else if ( textS.equals("Use Kotlin") )
                {
                    if ( iState == ItemEvent.SELECTED )
                    {
                        bKotlinSelected = true;
                        
                        //if ( (statusLabel != null) && (bHomeJustSet == false) )
                            //statusLabel.setText(" ");
                        
                        if ( updateMenuItem != null )
                            updateMenuItem.setVisible(false);
                        
                        // Hide Flutter buttons..
                        if ( runButton != null )
                            runButton.setVisible(false);
                        
                        if ( attachButton != null )
                            attachButton.setVisible(false);
                        
                        if ( reloadButton != null )
                            reloadButton.setVisible(false);
                        
                        // Unselect 'Use NDK'..
                        if ( bNDKSelected )
                        {
                            if ( uNDKMenuItem != null )
                                //uNDKMenuItem.setSelected(false);
                                uNDKMenuItem.setState(false);
    
                            // Restore 'Debug' Button..
                            debugButton.setIcon(debug24Icon);
                            debugButton.setToolTipText("Debug");
                            
                            releaseButton.setVisible(true);	// Enable..
                        }
                        
                        // Unselect 'Use Flutter'..
                        if ( uFlutterMenuItem != null )
                            uFlutterMenuItem.setState(false);
                        
                        // Select 'Use Gradle'..
                        if ( uGradleMenuItem != null )
                            uGradleMenuItem.setState(true);
                    }
                    else if ( iState == ItemEvent.DESELECTED )
                    {
                        bKotlinSelected = false;
                        
                        // Unselect 'Use Gradle'..
                        if ( uGradleMenuItem != null )
                        {
                            uGradleMenuItem.setState(false);
                            //System.out.println("\n(f)Setting to false");
                        }
                    }
                }
            }
            
            if ( bProjectSelected )
                bProjectSelected = false;   // Reset..
			
/*			
            System.out.println("\n================== OUT");
            System.out.println("uGradleMenuItem.getState(): "+uGradleMenuItem.getState());
            System.out.println("uKotlinMenuItem.getState(): "+uKotlinMenuItem.getState());
            System.out.println("uFlutterMenuItem.getState(): "+uFlutterMenuItem.getState());
            System.out.println("uNDKMenuItem.getState(): "+uNDKMenuItem.getState());
/**/
			updateStorage();    // Write store.tmp..
			
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
		    //System.out.println("\nwindowItemListener itemStateChanged()");
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
			    //System.out.println("\nwindowItemListener Build");
				if ( iState == ItemEvent.SELECTED )
				{
					cardLayout.show(cardPanel, (String)"BUILD_CARD");
					iCardShowing = BUILD_CARD;
					
					// Clear status..
					statusPath.setText(" ");
					
                    if ( bFlutterSelected )	
                    {
                        if ( (sEnableDebugOutput != null) && (sEnableDebugOutput.length() > 0) )
                        {
                            if ( sEnableDebugOutput.equals("true") )
                                DebugInit();
                        }
                    }
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
					    iCardShowing = DEBUG_CARD;
					    
						// Check if Run has been hit..
						//System.out.println("bRunSelected: "+bRunSelected);
						//if ( bRunSelected )
						if ( (iDebugMode == DEBUG_RUN) || (iDebugMode == DEBUG_ATTACH) )
						//if ( true )
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
					    
                        // Before we try to launch the debugger
                        // check to see if the app is running on the Emulator
                        // or device..
                        
                        if ( bFlutterSelected == false )
                        {
                            // We need to check before we
                            // start ShowProgressTask()
                            // otherwise we'd have to restart,
                            // and that isn't good..					    
                            bShellThreadFinished = false;
                            shellBgThread = new ShellBgThread();
                            shellBgThread.start();
                            
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
                    
                                if ( bShellThreadFinished )
                                {
                                    break;
                                }
                            }
    
                            //System.out.println("bFoundPackageName: "+bFoundPackageName);
                            if ( bFoundPackageName )
                                ;
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
			//System.out.println("changeEvent.toString(): '"+changeEvent.toString()+"'");
			
			int iSelIndex = tabbedPane.getSelectedIndex();
			//System.out.println("(tabbedPane)iSelIndex: "+iSelIndex);
			
			ClassMethodInfo classMethodInfo;
			TabInfo tabInfo = null;
			JTextArea tJTextArea;
			String sT = "";
			String sSourcePath = "";
			String sKeyPath = "";
			int iIndex;
			int iLoc3;
			int iLoc4;
			byte[] bLib = {(byte)0x6c, (byte)0x69, (byte)0x62, (byte)0x5c};    // 'lib\'
			String sLib = new String(bLib);
			
			// Signal that we got the event..			
			bGotStateChanged = true;
			
			boolean bIsRemove = false;
			
			// Reset..
			bIsBreakpointStepEvent = false;
			
			// javax.swing.JTabbedPane
			JTabbedPane pane = (JTabbedPane)changeEvent.getSource();

			// Returns -1 if there is no currently selected tab			
			iSelectedIndex = pane.getSelectedIndex();
			//iSelectedIndex = tabbedPane.getSelectedIndex();
			//System.out.println("(tabbedPane)iSelectedIndex: "+iSelectedIndex);
			//System.out.println("(source)iSelectedIndex: "+iSelectedIndex);

/*			
			if ( TabInfoAr != null )
			{
				for ( int iJ = 0; iJ < TabInfoAr.size(); iJ++ )
				{
					tabInfo = (TabInfo)TabInfoAr.get(iJ);
					System.out.println("["+iJ+"]--------------------------------");
					//System.out.println("sScriptId: '"+tabInfo.sScriptId+"'");
					System.out.println("sSourcePath: '"+tabInfo.sSourcePath+"'");
					
					if ( tabInfo.jTextArea == null )
					    System.out.println("jTextArea null");
					else
					    System.out.println("jTextArea not null");
				}
			}
/**/			
/*
            if ( TabInfoAr == null )
                System.out.println("TabInfoAr null");
            else
                System.out.println("TabInfoAr.size(): "+TabInfoAr.size());
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

                // When a tab is selected we should
                // update the source because the Breakpoint
                // information might have changed..

				bTabSelected = true;	// Tab Panel Selected
				
				if ( bFlutterSelected )
				{
					// Note:
					// It seems to not need updateSource() called
					// as the text, and tab selection, is properly updated
					
					iIndex = iSelectedIndex;
					if ( (TabInfoAr != null) && (TabInfoAr.size() > 0) )
					{
					    if ( iIndex < TabInfoAr.size() )
					    {
                            tabInfo = (TabInfo)TabInfoAr.get(iIndex);
                            sSourcePath = tabInfo.sSourcePath;
                            //System.out.println("(statusPath)sSourcePath: '"+sSourcePath+"'");	
                            
                            int iLoc2 = sSourcePath.indexOf(sLib);
                            if ( iLoc2 != -1 )
                                sSourcePath = sSourcePath.substring(iLoc2);
                            
                            sSelectedScriptId = tabInfo.sScriptId;
                            //System.out.println("sSelectedScriptId: '"+sSelectedScriptId+"'");
                            
                            statusPath.setText(Utils.processPath(sSourcePath));		// Flip '\' -> '/'
                        }
					}
				}
				else
				{
				    // This is just doing the setText()
				    // a Method or Class wasn't chosen
					if ( (TabInfoAr != null) && (TabInfoAr.size() > 0) )
					{
					    //System.out.println("iSelectedIndex: "+iSelectedIndex);
					    if ( iSelectedIndex < TabInfoAr.size() )
					    {
                            tabInfo = (TabInfo)TabInfoAr.get(iSelectedIndex);
                            
                            // Like:  'C:\Android\Dev\BottomNavAS\app\src\main\java\com\example\bottomnavas\...\home\HomeFragment.java'
                            sSourcePath = tabInfo.sSourcePath;
/*						
                            if ( sSourcePath == null )
                                System.out.println("sSourcePath null");
                            else
                                System.out.println("sSourcePath: '"+sSourcePath+"'");
/**/
    
                            // Load index to NodeHm..
                            iLoc3 = sSourcePath.indexOf(sPackageNameLead);
                            if ( iLoc3 != -1 )
                            {
                                iLoc4 = sSourcePath.lastIndexOf(".");
                                if ( iLoc4 != -1 )
                                {
                                    sKeyPath = sSourcePath.substring(iLoc3 + 1, iLoc4);
                                    tabInfo.sKeyPath = sKeyPath;
                                }
                            }
    
                            StringBuffer pathSb = new StringBuffer();
                            pathSb.append(sPackageName);
                            pathSb.append("/");
                            
                            sSourcePath = Utils.processPath(sSourcePath);
                            int iLoc2 = sSourcePath.lastIndexOf((int)0x2f);    // '/'
                            if ( iLoc2 != -1 )
                                pathSb.append(sSourcePath.substring(iLoc2 + 1));
                            
                            //System.out.println("pathSb: '"+pathSb.toString()+"'");
                            statusPath.setText(pathSb.toString());
                        }
					}
				    
				    
				    
                    
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

				}

                // Refresh..				
				updateSourceLines(lBreakpointLocationIndex);
			}
			

			// Increment "Tab Level" to help indicate
			// initial one..
			iTabLevel++;

			// Reset..
			bTabCreated = false;

/*			
			if ( TabInfoAr != null )
			{
				for ( int iJ = 0; iJ < TabInfoAr.size(); iJ++ )
				{
					tabInfo = (TabInfo)TabInfoAr.get(iJ);
					System.out.println("["+iJ+"]--------------------------------");
					//System.out.println("sScriptId: '"+tabInfo.sScriptId+"'");
					System.out.println("sSourcePath: '"+tabInfo.sSourcePath+"'");
					
					if ( tabInfo.jTextArea == null )
					    System.out.println("jTextArea null");
					else
					    System.out.println("jTextArea not null");
				}
			}
/**/			

			
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
		String sScriptId;    // Flutter

        // When changing tabs the 'iSourceLineAdjust'
        // from GetSourceScope() can get messed up
        // so we store it here..
        //
        // The same can happen with the LineTable
        // info so we also store that..		
		int iSourceLineAdjust;
		//int[] iLineTableAr;
		
		//long[] lLineCodeIndexAr;
		//int[] iLineNumberAr;
		
		// Full source path
		String sSourcePath;
		
		// Key to NodeHm..
		String sKeyPath;
	
		// Like: '9,225,5,232,12' for each line..	
		String[] sTokenPosTable;    // Flutter
		
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
		
		boolean bShowAsBranchNode;
		
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
		public String sKind;
		public String sTargetId;	// For evaluate
		public boolean bIsClass;
		public boolean bUsesObject;
		//public boolean bShowAsBranchNode;
		//public int iArrayIndex;
	
		
		public NodeFVInfo(String sName)
		{
			this.sName = sName;
			sDisplayClassName = "";
			sValueAsString = "";
			sClassName = "";
			sClassId = "";
			sPropertyName = "";
			sObjectId = "";
			sKind = "";
			sGetObjectId = "";
			bIsClass = false;
			bUsesObject = false;
			//bShowAsBranchNode = false;
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
		String sFullSignature;
	}	//}}}

	//{{{	NodeInfo	
	class NodeInfo
	{
		
		// For non-Flutter
		// this is the methodInfo.lMethodId or treeClass.lTypeId..
		protected long lId;
		
		protected String sFullPath;
		protected String sSubPath;
		
		// For Flutter this is the name of the
		// directory or source file..
		protected String sName;
		
		protected String sSignature;
		
		protected boolean bIsClass;
	
		public NodeInfo(long lId, String sFullPath, String sSubPath, String sName, String sSignature, boolean bIsClass)
		//public NodeInfo(String sFullPath, String sName, String sSignature)
		{
			this.lId = lId;
			this.sFullPath = sFullPath;
			this.sSubPath = sSubPath;
			this.sName = sName;
			this.sSignature = sSignature;
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
		
		public String getSubPath()
		{
			return sSubPath;
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


