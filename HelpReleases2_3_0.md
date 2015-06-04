# Release 2.3.0

The following changes were made in this release:
## Significant changes:
### ZAP ‘lite’ version
For this release we are providing a _‘lite’_ version of ZAP in addition to the _‘full’_ version. This contains
exactly the same core code, but it just includes fewer default add-ons. Of course, you can download all
of the ‘missing’ add-ons from the ZAP marketplace to ‘upgrade’ the lite version to a full one.<br>The <i>‘lite’</i>
version is aimed at people new to security who need less initial functionality which will hopefully be<br>
easier to get started with. It will also be suitable for people looking for a smaller download or those<br>
wishing to customize exactly which add-ons they install.<br>
<h3>Support for client-side (browser) events</h3>
You can now view, intercept, manipulate, resend and fuzz <b>client-side events</b>. This includes postMessages,<br>
so you can now detect DOM based XSS vulnerabilities in postMessages. This is the first phase in a series<br>
of planned changes to support the testing of AJAX and HTML5 applications even more effectively.<br>
<h3>Enhanced authentication support</h3>
ZAP's support for authentication has been completely revamped to easily handle complex types of <b>authentication<br>
methods and scenarios</b>. Support has also been added for user-defined scripts which allow you to handle<br>
custom authentication schemes. In addition, now ZAP understands and allows you to configure <b>web applications'<br>
Users</b> so various actions throughout ZAP can be performed from the point of view of defined users. To<br>
get started, check out the new <i>Authentication</i> and <i>Users</i> panels in the Session Properties for each of<br>
the defined Contexts.<br>
<h3>Support for non standard apps</h3>
This release includes support for <b>‘single page’ applications</b> and <b>non standard key-value separators</b>. You<br>
can now control these settings via the new <i>Structure</i> panel in the Session Properties.<br>
<h3>New Input Vectors including user-defined scripts</h3>
ZAP supports new options for defining the <b>input vectors</b> i.e. the elements of a request that ZAP will<br>
attack. The new options are available in the <i>Active Scan Input Vectors</i> panel of the Options. Support<br>
has also been added for defining custom scripts that define new input vectors.<br>
<h3>Scan policy - fine grained control</h3>
The scan policy now has a <b>fine grained control</b>, allowing you to tweak individual scanner rules. You can<br>
also define, load and save scan policies, allowing you to maintain a set of policies that work well in<br>
different circumstances.<br>In addition, by default ZAP will not now scan well-known service parameters (e.g.<br>
<code>_</code><code>_</code>VIEWSTATE) speeding up the overall scanning process. This is completely user configurable, allowing<br>
you to specify exactly which parameters ZAP should ignore.<br>
<h3>Advanced Active Scan dialog</h3>
A new <i>'Advanced Active Scan'</i> dialog allows you to specify exactly how you want the active scanner to<br>
function. It allows you to specify <b>‘custom vectors’</b> that explicitly define which strings you want to<br>
attack. It also supports the option to scan as any of the Users you have defined for the application<br>
under test. Start an <i>Advanced Active Scan</i> via the <i>Tools</i> menu or via the <i>Attack</i> section of the right click<br>
popup menu.<br>
<h3>Extended command line options</h3>
You can now run ZAP ‘inline’ i.e. <b>without starting the ZAP UI or a daemon</b>. In this mode you can run simple<br>
attacks or run scripts which can access all of the ZAP functionality. You can also now override any of<br>
the options defined in the configuration file via command line parameters.<br>
<h3>More API support</h3>
The API has been extended to support even more of the ZAP functionality.<br>
<h3>Internationalized help file</h3>
The help file has been internationalized and is in the process of being translated into many other languages<br>
via <a href='https://crowdin.net/project/owasp-zap-help'>https://crowdin.net/project/owasp-zap-help</a>. If you use ZAP in one of the many languages we support, then the help files will include all of the available translations for that language while defaulting back to English for phrases that have not yet been translated.<br>Languages with a significant amount of translated help pages include:<br>
<ul><li>Bosnian<br>
</li><li>French<br>
</li><li>Japanese<br>
</li><li>Spanish<br>
<h3>Keyboard shortcuts</h3>
All menu items can now be invoked via keyboard shortcuts. Defaults are defined for virtually all cases,<br>
but you can configure your own preferences in the <i>Keyboard</i> panel of the Options.<br>
<h3>New UI options</h3>
There is a new option to change the display so that the selected tab takes up the <b>full screen</b>. This is<br>
useful when using ZAP on small screens. There is also an option to <b>toggle the visibility of the tab names</b>
on an off to further conserve space.</li></ul>

Most of the UI lists have also been converted to tables, which allow you to change column widths and<br>
define exactly which columns are displayed, and how the tables are sorted.<br>
<h3>More functionality moved to add-ons</h3>
More of the core functionality has been moved into add-ons which allows us to deliver updates dynamically<br>
via the ZAP Marketplace rather than requiring new full releases.<br>This includes the language packs, so<br>
translations made to the ZAP UI via <a href='https://crowdin.net/project/owasp-zap'>https://crowdin.net/project/owasp-zap</a> can be downloaded within ZAP<br>
or even automatically installed.<br>
<h3>New and improved active and passive scanning rules</h3>
Many of the release quality active and passive scanning rules have been improved. There are new alpha<br>
and beta quality rules and many rules have been promoted from alpha to beta and from beta to release<br>
quality.<br>
<h3>Other miscellaneous changes and additions</h3>
<ul><li>A new option to stop individual scan rules without stopping the whole scan<br>
</li><li>A new toolbar button that allows you to quickly and easily record Zest scripts.<br>
</li><li>A new group for sharing ZAP scripts (<a href='http://groups.google.com/group/zaproxy-scripts'>http://groups.google.com/group/zaproxy-scripts</a>) has been created.<br>
</li><li>The ability to spider applications based on source control metadata (SVN and Git) exposed via a web server<br>
</li><li>The ability to force breaks from within Proxy scripts<br>
<h2>Full list of changes:</h2>
</li><li>Issue 122 (on Google Code) : ProxyThread logging timeout readings with incorrect message (URL)<br>
</li><li>Issue 207 (on Google Code) : Enhancement: Hotkeys<br>
</li><li>Issue 362 (on Google Code) : Allow Alerts lists to be filtered by selection in Sites pane<br>
</li><li>Issue 399 (on Google Code) : zap.sh directory handling<br>
</li><li>Issue 412 (on Google Code) : Enable unsafe SSL/TLS renegotiation option not saved<br>
</li><li>Issue 416 (on Google Code) : Normalise how multiple related options are managed throughout ZAP and enhance the usability of some options Usability<br>
</li><li>Issue 485 (on Google Code) : Make language packs into add-ons<br>
</li><li>Issue 503 (on Google Code) : Change the footer tabs to display the data with tables instead of lists Usability<br>
</li><li>Issue 572 (on Google Code) : Change the generate<code>_</code>root<code>_</code>ca property to a function in the Python API<br>
</li><li>Issue 575 (on Google Code) : Return the list of alerts in the Python API instead of a dictionary with one entry<br>
</li><li>Issue 585 (on Google Code) : Proxy - "502 Bad Gateway" errors responded as "504 Gateway Timeout"<br>
</li><li>Issue 589 (on Google Code) : Move Reveal extension to ZAP extensions project<br>
</li><li>Issue 590 (on Google Code) : Forced Browse uses wrong scheme when "attacking" a site accessed over a secure connection (HTTPS) on a non-default port<br>
</li><li>Issue 591 (on Google Code) : Available sites/hosts (in the footer panels) disappear when mode changed to "Safe"<br>
</li><li>Issue 595 (on Google Code) : Spider fails to start (footer panel) with a site accessed over a secure connection (HTTPS) on a non-default port<br>
</li><li>Issue 606 (on Google Code) : Disable the "Start" scan button when the "--Select Site--" option is selected<br>
</li><li>Issue 607 (on Google Code) : Manual requested sites shown as scanned in the footer panels when selected in the "Sites" tab<br>
</li><li>Issue 609 (on Google Code) : Provide a common interface to query the state and access the data (HttpMessage and HistoryReference) displayed in the tabs<br>
</li><li>Issue 613 (on Google Code) : Move Save Raw HttpMessage extension to ZAP extensions project<br>
</li><li>Issue 619 (on Google Code) : Move Forced Browse extension to ZAP extensions project<br>
</li><li>Issue 620 (on Google Code) : Move Forced Browse files to ZAP extensions project<br>
</li><li>Issue 783 (on Google Code) : shutdown should be a method in the python zap.core api<br>
</li><li>Issue 788 (on Google Code) : Update Java for Mac release<br>
</li><li>Issue 793 (on Google Code) : Authentication / SessionManagement Methods dynamic loading in APIs not reliable<br>
</li><li>Issue 799 (on Google Code) : Add HttpAuthentication as an Authentication Method<br>
</li><li>Issue 803 (on Google Code) : Patch for /trunk/src/help/zaphelp/zaphelp/credits.html<br>
</li><li>Issue 804 (on Google Code) : Add Support for various types of Authentication for a Context<br>
</li><li>Issue 805 (on Google Code) : Add Support for various types of Session Management for a Context<br>
</li><li>Issue 806 (on Google Code) : Add Support for webapp Users<br>
</li><li>Issue 807 (on Google Code) : Error while loading ZAP when Quick Start Tab is closed<br>
</li><li>Issue 816 (on Google Code) : Add right-click Copy/Paste & Find options in the Encode/Decode/Hash dialog<br>
</li><li>Issue 817 (on Google Code) : Python API doesn't handle "other" operations correctly<br>
</li><li>Issue 822 (on Google Code) : Java API: ApiResponseSet.getAttributes() not working<br>
</li><li>Issue 825 (on Google Code) : Old version of Rhino included in lib directory<br>
</li><li>Issue 827 (on Google Code) : Default session tokens are not lower cased when added through options dialogue<br>
</li><li>Issue 828 (on Google Code) : NullPointerException while accessing HttpSessions API view "sessionTokens" when a site doesn't exist or doesn't have tokens<br>
</li><li>Issue 829 (on Google Code) : JSONException while calling an API view without the required parameter(s)<br>
</li><li>Issue 830 (on Google Code) : Java Client API doesn't encode query parameters when sending requests to ZAP API<br>
</li><li>Issue 832 (on Google Code) : Http Sessions tab should be cleared when a new session is created<br>
</li><li>Issue 837 (on Google Code) : Update, always, the HTTP request sent/forward by ZAP's proxy<br>
</li><li>Issue 838 (on Google Code) : Search API - Add search views that return HTTP messages<br>
</li><li>Issue 839 (on Google Code) : Search API - Add search views that return messages in HTTP Archive format<br>
</li><li>Issue 840 (on Google Code) : Core API - Allow to get the messages in HTTP Archive format<br>
</li><li>Issue 841 (on Google Code) : NullPointerException after sending a manual HTTP request with ExtensionHistory disabled<br>
</li><li>Issue 842 (on Google Code) : NullPointerException while active scanning with ExtensionAntiCSRF disabled<br>
</li><li>Issue 843 (on Google Code) : NullPointerException after sending/proxying a HTTP request with ExtensionAntiCSRF disabled<br>
</li><li>Issue 844 (on Google Code) : NullPointerException while invoking the "Scan policy" dialogue with ExtensionPassiveScan disabled<br>
</li><li>Issue 845 (on Google Code) : AbstractPanel added twice to TabbedPanel2 in ExtensionLoader#addTabPanel<br>
</li><li>Issue 846 (on Google Code) : NullPointerException while active scanning with ExtensionScript disabled<br>
</li><li>Issue 849 (on Google Code) : NullPointerException while authenticating with ExtensionHistory disabled<br>
</li><li>Issue 852 (on Google Code) : Search API - URL views return the same URL several times<br>
</li><li>Issue 853 (on Google Code) : Core API - Allow to get the number of alerts<br>
</li><li>Issue 854 (on Google Code) : Core API - Allow to get the number of messages<br>
</li><li>Issue 855 (on Google Code) : Core API - Allow to get a message by ID<br>
</li><li>Issue 856 (on Google Code) : Core API - Allow to get an alert by ID<br>
</li><li>Issue 857 (on Google Code) : Core API - "alerts" view might return unexpected alerts when pagination is used<br>
</li><li>Issue 858 (on Google Code) : Core API - "messages" view might return unexpected messages when pagination is used<br>
</li><li>Issue 859 (on Google Code) : PScan API - Allow to enable/disable the passive scan<br>
</li><li>Issue 860 (on Google Code) : PScan API - Allow to list/get the passive scanners<br>
</li><li>Issue 861 (on Google Code) : PScan API - Allow to enable/disable all the passive scanners<br>
</li><li>Issue 862 (on Google Code) : PScan API - Allow to enable/disable a given passive scanner<br>
</li><li>Issue 863 (on Google Code) : AScan API - Allow to list/get the active scanners<br>
</li><li>Issue 864 (on Google Code) : AScan API - Allow to enable/disable all the active scanners<br>
</li><li>Issue 865 (on Google Code) : AScan API - Allow to enable/disable a given active scanner<br>
</li><li>Issue 866 (on Google Code) : Alert keeps HttpMessage longer than needed when HistoryReference is set/available<br>
</li><li>Issue 867 (on Google Code) : HttpMessage#getFormParams should return an empty TreeSet if the request body is not "x-www-form-urlencoded"<br>
</li><li>Issue 868 (on Google Code) : Core API - "messages" view shouldn't return internal/temporary messages<br>
</li><li>Issue 869 (on Google Code) : Differentiate proxied requests from (ZAP) user requests<br>
</li><li>Issue 870 (on Google Code) : Change the MainToolbarPanel's expand buttons to use ButtonGroup and Action<br>
</li><li>Issue 871 (on Google Code) : Title not updated when session name is changed through the main tool bar button "Session Properties..."<br>
</li><li>Issue 872 (on Google Code) : Core API - Allow to send a manual request<br>
</li><li>Issue 873 (on Google Code) : Core API - Allow to send a manual request in HAR format<br>
</li><li>Issue 874 (on Google Code) : Change BreakPanelToolbarFactory to use Actions<br>
</li><li>Issue 875 (on Google Code) : Remove i18n directory<br>
</li><li>Issue 876 (on Google Code) : Deprecate FuzzerPanel#PANEL<code>_</code>NAME<br>
</li><li>Issue 877 (on Google Code) : ExtensionPopupMenuItem#isEnableForComponent called twice on some pop up menus each time is shown using the MainPopupMenu<br>
</li><li>Issue 878 (on Google Code) : ExtensionPopupMenuItem#getMenuIndex() as no effect in MainPopupMenu<br>
</li><li>Issue 879 (on Google Code) : Pop up menu "Spider Context..." is enabled even if ExtensionSpider is disabled<br>
</li><li>Issue 880 (on Google Code) : Remember last selected directory when adding custom fuzz files<br>
</li><li>Issue 881 (on Google Code) : Fail immediately if zapdb.script file is not found<br>
</li><li>Issue 882 (on Google Code) : Remove "Copy" pop up menu item shown in the "Forced Browse" tab<br>
</li><li>Issue 884 (on Google Code) : Plug-n-Hack phase 2<br>
</li><li>Issue 885 (on Google Code) : API - Actions' response not shown when using HTML format<br>
</li><li>Issue 886 (on Google Code) : Main pop up menu invoked twice on some components<br>
</li><li>Issue 887 (on Google Code) : Scanners' pause button with inconsistent selection/enabled state<br>
</li><li>Issue 888 (on Google Code) : Search API - URL views might return unexpected URLs when pagination is used<br>
</li><li>Issue 889 (on Google Code) : JSONException while calling an API "other" without the required parameter(s)<br>
</li><li>Issue 890 (on Google Code) : Allow to clear "Output" tab<br>
</li><li>Issue 891 (on Google Code) : Target build "generate-javadocs" should apply SVN mime-type property to all generated files<br>
</li><li>Issue 892 (on Google Code) : Cache of response body length in HistoryReference might not be correct<br>
</li><li>Issue 896 (on Google Code) : PnH: Flag any fuzz attacks that hit the DOM XSS oracle<br>
</li><li>Issue 897 (on Google Code) : Add a JToggleButton that allows to set a tool tip text based on button's state<br>
</li><li>Issue 898 (on Google Code) : Replace all toggle buttons that set a tool tip text based on button's state with ZapToggleButton<br>
</li><li>Issue 899 (on Google Code) : Remove "manual" update of toggle buttons' icon based on button's state<br>
</li><li>Issue 900 (on Google Code) : IllegalArgumentException when invoking the main pop up menu with menus or super menus with high menu index<br>
</li><li>Issue 901 (on Google Code) : Pop up menu "succeed" separator is not added when using sub-menu in MainPopupMenu<br>
</li><li>Issue 902 (on Google Code) : Change all ExtensionAdaptor#hook(ExtensionHook) overriding methods to call the base implementation<br>
</li><li>Issue 903 (on Google Code) : Change options' thread sliders to use the same component<br>
</li><li>Issue 904 (on Google Code) : Add a button group that allows to deselect the selected button<br>
</li><li>Issue 905 (on Google Code) : Incorrect link in "Break tab" help pages<br>
</li><li>Issue 910 (on Google Code) : Forced User cannot be changed<br>
</li><li>Issue 911 (on Google Code) : AScan API - Change the "scanners" view to include the state of the active scanner<br>
</li><li>Issue 912 (on Google Code) : PScan API - Change the "scanners" view to include the state of the passive scanner<br>
</li><li>Issue 913 (on Google Code) : AScan API - Allow to list/get the active scanner policies<br>
</li><li>Issue 914 (on Google Code) : AScan API - Allow to set the active scanner policies enabled<br>
</li><li>Issue 915 (on Google Code) : Dynamically filter history based on selection in the sites window<br>
</li><li>Issue 919 (on Google Code) : Allow vulnerabilities.xml to be localized IdealFirstBug<br>
</li><li>Issue 920 (on Google Code) : Add include/exclude url patterns to history filter<br>
</li><li>Issue 921 (on Google Code) : PnH2: open as monitored url<br>
</li><li>Issue 923 (on Google Code) : Allow individual rule thresholds and strengths to be set via GUI<br>
</li><li>Issue 925 (on Google Code) : HTML report issues<br>
</li><li>Issue 929 (on Google Code) : AScan API - Allow to set the attack strength and alert threshold of active scanner policies and active scanners<br>
</li><li>Issue 930 (on Google Code) : AScan API - Allow to list/get the active scanners by policy ID<br>
</li><li>Issue 931 (on Google Code) : Allow extensions to pick up command line args in GUI mode<br>
</li><li>Issue 932 (on Google Code) : Allow scripts to be specified on the command line<br>
</li><li>Issue 933 (on Google Code) : Automatically determine install dir<br>
</li><li>Issue 934 (on Google Code) : Handle files on the command line via extension<br>
</li><li>Issue 935 (on Google Code) : Improve the identification of Java version<br>
</li><li>Issue 939 (on Google Code) : ZAP should accept SSL connections on non-standard ports automatically<br>
</li><li>Issue 947 (on Google Code) : Spider fails on URLs with illegal characters<br>
</li><li>Issue 950 (on Google Code) : Cope with add-ons containing files copied directly into the plugins directory<br>
</li><li>Issue 951 (on Google Code) : TLS' versions 1.1 and 1.2 not enabled by default<br>
</li><li>Issue 954 (on Google Code) : Changes to certain fields in the GUI are not saved after clicking OK/Proceed<br>
</li><li>Issue 955 (on Google Code) : keyboard focus lost when large body found<br>
</li><li>Issue 956 (on Google Code) : Copy URLs doesn't copy multiple<br>
</li><li>Issue 957 (on Google Code) : Reference for alert "X-Content-Type-Options header missing"<br>
</li><li>Issue 963 (on Google Code) : Add-on added to blocklist if it cant be deleted on update<br>
</li><li>Issue 965 (on Google Code) : Support 'single page' apps and 'non standard' parameter separators<br>
</li><li>Issue 966 (on Google Code) : Quickstart command line option<br>
</li><li>Issue 967 (on Google Code) : InvalidParameterException while updating the "Script Console" add-on<br>
</li><li>Issue 968 (on Google Code) : Allow to choose the enabled SSL/TLS protocols<br>
</li><li>Issue 969 (on Google Code) : Proxy - Do not include the response body when answering unsuccessful HEAD requests<br>
</li><li>Issue 970 (on Google Code) : Body of DELETE requests should be sent/forward<br>
</li><li>Issue 974 (on Google Code) : Scan URL path elements<br>
</li><li>Issue 975 (on Google Code) : Inverse Search Fuzz Results Buggy<br>
</li><li>Issue 976 (on Google Code) : Spider Context Attack causes spidering outside of context<br>
</li><li>Issue 979 (on Google Code) : Sites and Alerts trees can get corrupted<br>
</li><li>Issue 981 (on Google Code) : Internationalize help file<br>
</li><li>Issue 982 (on Google Code) : API key<br>
</li><li>Issue 986 (on Google Code) : New ScanProgress dialog implementation and plugin skipping functionality<br>
</li><li>Issue 987 (on Google Code) : Allow arbitrary config file values to be set via the command line<br>
</li><li>Issue 988 (on Google Code) : ZAP Help crashes before starting<br>
</li><li>Issue 989 (on Google Code) : Add a right click option "Add user" on an HTTP session<br>
</li><li>Issue 991 (on Google Code) : Add-on/Scan rule review request - Persistent XSS<br>
</li><li>Issue 996 (on Google Code) : Ensure all dialogs close when the escape key is pressed<br>
</li><li>Issue 997 (on Google Code) : Session.open complains about improper use of addPath<br>
</li><li>Issue 998 (on Google Code) : Silly regexp search kills ZAP<br>
</li><li>Issue 999 (on Google Code) : History loaded in wrong order<br>
</li><li>Issue 1002 (on Google Code) : Add support for Authentication via Scripts<br>
</li><li>Issue 1003 (on Google Code) : XXE Vulnerability Testing Plugin<br>
</li><li>Issue 1004 (on Google Code) : Source Code disclosure using Git meta-data<br>
</li><li>Issue 1005 (on Google Code) : Source Code disclosure using Subversion meta-data<br>
</li><li>Issue 1006 (on Google Code) : Spidering of web applications using using Git meta-data<br>
</li><li>Issue 1007 (on Google Code) : Spidering of web applications using using Subversion (SVN) meta-data<br>
</li><li>Issue 1010 (on Google Code) : Allow to sort fuzz results<br>
</li><li>Issue 1012 (on Google Code) : Encode / Decode dialog - support HTML and JavaScript encoding IdealFirstBug<br>
</li><li>Issue 1016 (on Google Code) : HTML encoding display issue in credits.html<br>
</li><li>Issue 1017 (on Google Code) : Proxy set to 0.0.0.0 causes incorrect PAC file to be generated<br>
</li><li>Issue 1018 (on Google Code) : Give AbstractAppParamPlugin implementations access to the parameter type<br>
</li><li>Issue 1019 (on Google Code) : ZAP startup with bad JAVA<code>_</code>HOME shows confusing error message<br>
</li><li>Issue 1020 (on Google Code) : Duplicate "Body: Table" plug-able view on Request/Break tabs<br>
</li><li>Issue 1021 (on Google Code) : OutOutOfMemoryError while running the active scanner<br>
</li><li>Issue 1022 (on Google Code) : Proxy - Allow to override a proxied message<br>
</li><li>Issue 1023 (on Google Code) : Script Console - Run/Stop buttons with inconsistent state<br>
</li><li>Issue 1024 (on Google Code) : Large Response view is shown even if a response body is not present<br>
</li><li>Issue 1025 (on Google Code) : NullPointerException while pressing a key with "Script Console" text areas selected<br>
</li><li>Issue 1030 (on Google Code) : Load and save scan policies<br>
</li><li>Issue 1031 (on Google Code) : Adding Parameter Exclusion capabilities to the Active Scanner<br>
</li><li>Issue 1032 (on Google Code) : Add API support for Script Based Authentication<br>
</li><li>Issue 1033 (on Google Code) : org.zaproxy.clientapi.core.Alert does not override equals() method<br>
</li><li>Issue 1037 (on Google Code) : JSON RPC parameters are not set correctly<br>
</li><li>Issue 1039 (on Google Code) : Improve External Redirect plugin Accuracy<br>
</li><li>Issue 1041 (on Google Code) : Active Scan plugins don't start if the site is local to 127.0.0.1<br>
</li><li>Issue 1042 (on Google Code) : Having significant issues opening a previous session<br>
</li><li>Issue 1043 (on Google Code) : Custom active scan dialog<br>
</li><li>Issue 1044 (on Google Code) : Forced User Mode is not persisted across Session saves/loads<br>
</li><li>Issue 1046 (on Google Code) : The getHttpCookies() method in the HttpResponseHeader does not properly set the domain<br>
</li><li>Issue 1047 (on Google Code) : Backup Files not detected by Zap<br>
</li><li>Issue 1049 (on Google Code) : Fast multiple pattern search component<br>
</li><li>Issue 1050 (on Google Code) : Scripting based Input Vectors<br>
</li><li>Issue 1051 (on Google Code) : Zap can bound services to all network interfaces<br>
</li><li>Issue 1052 (on Google Code) : Callback API for active scan plugins<br>
</li><li>Issue 1053 (on Google Code) : String similarity and LCS algorithm component<br>
</li><li>Issue 1055 (on Google Code) : Load extensions before plugins<br>
</li><li>Issue 1057 (on Google Code) : Add a Extension.postInstall() method for post install actions<br>
</li><li>Issue 1059 (on Google Code) : Add Jython support for Script-Based Authentication<br>
</li><li>Issue 1060 (on Google Code) : Add JRuby support for Script-Based Authentication<br>
</li><li>Issue 1061 (on Google Code) : Select proper Script Type, Engine and Template when creating new script<br>
</li><li>Issue 1063 (on Google Code) : Option to decode add gzipped content (was handle compression for scripts)<br>
</li><li>Issue 1065 (on Google Code) : Rename ExtensionScripts to ExtensionScriptsConsole Maintainability<br>
</li><li>Issue 1066 (on Google Code) : Add support for quickly setting Script Based Authentication from scripts UI<br>
</li><li>Issue 1068 (on Google Code) : Zap does not detect source code in responses<br>
</li><li>Issue 1069 (on Google Code) : Support .-: in Zest variable names<br>
</li><li>Issue 1071 (on Google Code) : Using Zest-Script "Replace in response-body" delivers wrong Content-Length header.<br>
</li><li>Issue 1072 (on Google Code) : SQLDataException: data exception: string data, right truncation<br>
</li><li>Issue 1074 (on Google Code) : Add option to only display output from the displayed script<br>
</li><li>Issue 1075 (on Google Code) : Change TableHistory to delete records in batches Performance<br>
</li><li>Issue 1076 (on Google Code) : Change active scanner to not delete the temporary messages generated Performance<br>
</li><li>Issue 1077 (on Google Code) : Change (HTTP) fuzzer to not delete the temporary messages generated Performance<br>
</li><li>Issue 1078 (on Google Code) : Change ExtensionBreak to fallback to base message type breakpoint manager implementation<br>
</li><li>Issue 1079 (on Google Code) : Remove misplaced main pop up menu separators<br>
</li><li>Issue 1080 (on Google Code) : User Guide HTML pages incorrectly relying on the platform default encoding<br>
</li><li>Issue 1081 (on Google Code) : ExtensionPopupMenu should "notify" child ExtensionPopupMenu (and ExtensionPopupMenuItem) when the pop up is invoked<br>
</li><li>Issue 1082 (on Google Code) : Search URL matches highlighted in incorrect position<br>
</li><li>Issue 1083 (on Google Code) : Deprecate the method ExtensionPopupMenuItem#isSuperMenu()<br>
</li><li>Issue 1084 (on Google Code) : NullPointerException while selecting a node in the "Sites" tab<br>
</li><li>Issue 1085 (on Google Code) : Do not add/remove pop up menu items through the method View#getPopupMenu()<br>
</li><li>Issue 1086 (on Google Code) : Allow to dynamically add/remove passive scanners<br>
</li><li>Issue 1087 (on Google Code) : Change extensions to dynamically add passive scanners<br>
</li><li>Issue 1088 (on Google Code) : Deprecate the method ExtensionPopupMenu#prepareShow<br>
</li><li>Issue 1089 (on Google Code) : Change ExtensionPopupMenu to honour the extension pop up methods<br>
</li><li>Issue 1090 (on Google Code) : Do not add pop up menus if target extension is not enabled<br>
</li><li>Issue 1091 (on Google Code) : CoreAPI - Do not get the IDs of temporary history records<br>
</li><li>Issue 1092 (on Google Code) : SearchThread - Do not get the IDs of discarded messages<br>
</li><li>Issue 1093 (on Google Code) : Add an HTTP request body view that warns of large body<br>
</li><li>Issue 1094 (on Google Code) : Change ExtensionManualRequestEditor to only add view components if in GUI mode<br>
</li><li>Issue 1095 (on Google Code) : Replace main pop up sub menus with ExtensionPopupMenu when appropriate<br>
</li><li>Issue 1096 (on Google Code) : AddOnLoader calls incorrect notify method after uninstalling add-on files<br>
</li><li>Issue 1097 (on Google Code) : Move "Run applications" (invoke) extension to zap-extensions project<br>
</li><li>Issue 1098 (on Google Code) : Move AJAX Spider help pages to "Ajax Spider" add-on (and update them)<br>
</li><li>Issue 1099 (on Google Code) : Allow to annotate option methods as ignored for ZAP API<br>
</li><li>Issue 1100 (on Google Code) : Annotate option methods that shouldn't be exposed in the ZAP API<br>
</li><li>Issue 1101 (on Google Code) : Change passive scanners to expose its IDs<br>
</li><li>Issue 1102 (on Google Code) : Ajax Spider - Replace ajax spider proxy with core proxy<br>
</li><li>Issue 1103 (on Google Code) : Script Console - Allow to clear output even if "clear on run" is enabled<br>
</li><li>Issue 1104 (on Google Code) : Replace all toggle buttons that set a tool tip text based on button's state with ZapToggleButton (add-ons)<br>
</li><li>Issue 1105 (on Google Code) : Remove "manual" update of toggle buttons' icon based on button's state (add-ons)<br>
</li><li>Issue 1106 (on Google Code) : HistoryList's mapping of history ID to list indexes not updated when history entry is deleted<br>
</li><li>Issue 1110 (on Google Code) : Spider API - Unable to set how parameters are handled using API<br>
</li><li>Issue 1111 (on Google Code) : Check for Updates on startup gets (automatically) disabled when accessing the "Options" dialogue<br>
</li><li>Issue 1112 (on Google Code) : Change ZAP (core) to support new add-on dir structure<br>
</li><li>Issue 1113 (on Google Code) : Change add-on dir structure (help and resources)<br>
</li><li>Issue 1118 (on Google Code) : Alerts Tab can get out of sync<br>
</li><li>Issue 1120 (on Google Code) : Uninstall add-on fails if rules use message bundle in uninstall<br>
</li><li>Issue 1121 (on Google Code) : Scan progress dialog can cause UI freezes<br>
</li><li>Issue 1122 (on Google Code) : Add-on additional info<br>
</li><li>Issue 1125 (on Google Code) : Can't re-import jython script as a proxy script<br>
</li><li>Issue 1126 (on Google Code) : Bugs in breakpoint filters<br>
</li><li>Issue 1127 (on Google Code) : Feature request: Allow scripts to generate breaks<br>
</li><li>Issue 1131 (on Google Code) : Support Zest Intercept actions in add-on<br>
</li><li>Issue 1132 (on Google Code) : HttpSender ignores the "Send single cookie request header" option<br>
</li><li>Issue 1134 (on Google Code) : Passive Scan Rule regexes not validated<br>
</li><li>Issue 1135 (on Google Code) : Marketplace tab cant be updated if cfu runs on start<br>
</li><li>Issue 1137 (on Google Code) : ZAP locks up when deleting nodes<br>
</li><li>Issue 1138 (on Google Code) : Passive Scan Rule changes not saved<br>
</li><li>Issue 1145 (on Google Code) : Cookie parsing error if a comma is used<br>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpIntro'>Introduction</a></td><td>the introduction to ZAP</td></tr>
<tr><td></td><td><a href='HelpReleasesReleases'>Releases</a></td><td>the full set of releases</td></tr>
<tr><td></td><td><a href='HelpCredits'>Credits</a></td><td>the people and groups who have made this release possible</td></tr>
</table>