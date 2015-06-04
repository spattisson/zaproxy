# Release 2.4.0

The following changes were made in this release:
## Significant changes:
### Attack mode
A new 'ATTACK' [Mode](HelpStartConceptsModes) has been added - new nodes that are in [Scope](HelpStartConceptsScope) are [actively scanned](HelpStartConceptsAscan) as soon as they are discovered.
### Advanced fuzzing
A completely new fuzzing dialog has been introduced that allows multiple injection points to be attacked
at the same time.<br>This supports new attack payloads including the option to use scripts for generating<br>
the payloads as well as pre and post attack manipulation and analysis.<br>
<h3>Scan dialogs with advanced options</h3>
New <a href='HelpUiDialogsAdvascan'>Active Scan</a>, <a href='HelpUiDialogsSpider'>Spider</a> and AJAX Spider dialogs have replaced the increasing number of right click 'Attack' options.<br>These provide easy access to all of the most common options and optionally a wide range of advanced options.<br>
<h3>Scan Policies</h3>
A new <a href='HelpUiDialogsScanpolicymgr'>Scan Policy Manager dialog</a> allows you to create as many <a href='HelpStartConceptsScanpolicy'>Scan Policies</a> as you need.<br>Scan policies define exactly which rules are run as part of an <a href='HelpStartConceptsAscan'>Active Scan</a>.<br>They also define how these rules run influencing how many requests are made and how likely potential issues are to be flagged.<br>
<h3>Unused tabs hidden</h3>
By default only the essential tabs are now shown when ZAP starts up.<br>The remaining tabs are revealed when<br>
they are used (e.g. for the spider and active scanner) or when you display them via the special tab on<br>
the far right of each window with the green '+' icon. This special tab disappears if there are no hidden<br>
tabs.<br>Tabs can be closed via a small 'x' icon which is shown when the tab is selected.<br>Tabs can also be<br>
'pinned' using a small 'pin' icon that is also shown when the tab is selected - pinned tabs will be shown<br>
when ZAP next starts up.<br>
<h3>Enablers for Sequence scanning add-on</h3>
A new optional 'alpha' quality add-on adds the ability to scan 'sequences' of web pages, in other words<br>
pages that must be visited in a strict order in order to work correctly.<br>
<h3>Enablers for access control testing add-on</h3>
A new optional 'alpha' quality add-on adds the ability to automate many aspects of access control testing.<br>
<h3>Note for API Users</h3>
Please be aware that the Plugin ID for the External Redirect scanner has changed from 30000 to 20019.<br>
<h2>Full list of changes:</h2>
<ul><li>Issue 389 (on Google Code) : Enable technology scope for scanners<br>
</li><li>Issue 414 (on Google Code) : API: Support scripts<br>
</li><li>Issue 445 (on Google Code) : SSLContextManager.isProviderAvailable() returns true as default<br>
</li><li>Issue 557 (on Google Code) : SQL injection false negatives<br>
</li><li>Issue 642 (on Google Code) : Output tab needs timestamps<br>
</li><li>Issue 653 (on Google Code) : Handle updates better on Kali Linux<br>
</li><li>Issue 704 (on Google Code) : ZAP Error: handshake alert: unrecognized<code>_</code>name<br>
</li><li>Issue 883 (on Google Code) : Support multiple scans in the API<br>
</li><li>Issue 949 (on Google Code) : Spider (site) does not follow hyperlinks in JSON documents<br>
</li><li>Issue 959 (on Google Code) : add-on updater might ignore outbound proxy changes<br>
</li><li>Issue 990 (on Google Code) : Allow to delete alerts through the API<br>
</li><li>Issue 1151 (on Google Code) : Active Scan in Scope finishes before scanning all messages in scope if multiple domains available<br>
</li><li>Issue 1154 (on Google Code) : Tool tip text "Show tab names and tab icons" IdealFirstBug<br>
</li><li>Issue 1176 (on Google Code) : Spider advanced scan dialog<br>
</li><li>Issue 1180 (on Google Code) : Proxy corrupts URL when there are multiple question marks<br>
</li><li>Issue 1184 (on Google Code) : Improve support for IBM JDK<br>
</li><li>Issue 1207 (on Google Code) : AScan API - Change the "scanners" view to include the dependencies<br>
</li><li>Issue 1208 (on Google Code) : Search classes/resources in add-ons declared as dependencies<br>
</li><li>Issue 1209 (on Google Code) : Additional Reliability Values/Options & Rename Reliability to Confidence in UI<br>
</li><li>Issue 1214 (on Google Code) : Sorting in Scan Policy Dialogs Usability<br>
</li><li>Issue 1215 (on Google Code) : Alert Tree Ordering/Sorting Issue Usability<br>
</li><li>Issue 1216 (on Google Code) : Typo in scripts tab<br>
</li><li>Issue 1217 (on Google Code) : Table format does not display information when charset is present in Content-Type header<br>
</li><li>Issue 1224 (on Google Code) : Display Quality/Status in Scan Policy Dialogs Usability<br>
</li><li>Issue 1226 (on Google Code) : Active scanner excluded parameter's regexes not validated<br>
</li><li>Issue 1227 (on Google Code) : Active scanner sends GET requests with content in request body<br>
</li><li>Issue 1238 (on Google Code) : NullPointerException if an active scanner raises an alert with null attack<br>
</li><li>Issue 1239 (on Google Code) : Allow extending the Spider from Extensions<br>
</li><li>Issue 1241 (on Google Code) : Active scanner might not report finished state when using host scanners<br>
</li><li>Issue 1242 (on Google Code) : Active scanner might use outdated policy settings<br>
</li><li>Issue 1243 (on Google Code) : NullPointerException if a script type does not have core bundled script templates<br>
</li><li>Issue 1244 (on Google Code) : Scripts Active Scanner should be category Misc not Injection Usability<br>
</li><li>Issue 1252 (on Google Code) : Connection Exception during shutdown while running scans through the API<br>
</li><li>Issue 1256 (on Google Code) : Revisit missing X-Frame-Options scanner level<br>
</li><li>Issue 1257 (on Google Code) : Create a passive rule which detects big redirects<br>
</li><li>Issue 1261 (on Google Code) : NPE on "Plug-n-Hack Configuration" update from market place<br>
</li><li>Issue 1262 (on Google Code) : Address "Passive Rules - Risk - Reliability" <code>[</code>User controllable HTML element attribute (potential XSS), and Timestamp Disclosure - Unix]<br>
</li><li>Issue 1263 (on Google Code) : Generate Report Clobbers Existing Files Without Prompting<br>
</li><li>Issue 1264 (on Google Code) : Manual authentication - Cookie mismatch due to wrong handling of domain and path<br>
</li><li>Issue 1265 (on Google Code) : Context import and export<br>
</li><li>Issue 1272 (on Google Code) : ZAP API: Core.MessagesHAR() fails if a HTTP Request contains invalid Cookie header(s)<br>
</li><li>Issue 1274 (on Google Code) : ZAP Error <code>[</code>javax.net.ssl.SSLException]: Unsupported record version SSLv2Hello<br>
</li><li>Issue 1275 (on Google Code) : SpiderODataAtomParser must return true from "parseResource"<br>
</li><li>Issue 1278 (on Google Code) : Safe menu items not available in protected and safe modes<br>
</li><li>Issue 1279 (on Google Code) : Active scanner excluded parameters not working when "Where" is "Any"<br>
</li><li>Issue 1280 (on Google Code) : API shortcuts not removed when the ApiImplementor is removed<br>
</li><li>Issue 1281 (on Google Code) : QuickStart - Allow to generate the report when the view is initialised<br>
</li><li>Issue 1282 (on Google Code) : Extension#stop() is never called before destroy()<br>
</li><li>Issue 1283 (on Google Code) : SQLDataException: data exception: string data, right truncation while writing an alert to DB<br>
</li><li>Issue 1286 (on Google Code) : Fuzzer seems to be slow<br>
</li><li>Issue 1290 (on Google Code) : "Port Scan host" menu item enabled even if a port scan is already in progress<br>
</li><li>Issue 1291 (on Google Code) : 407 Proxy Authentication Required while active scanning<br>
</li><li>Issue 1292 (on Google Code) : NullPointerException while attempting to remove an unregistered ManualRequestEditorDialog<br>
</li><li>Issue 1294 (on Google Code) : Trivial<code>_</code>UI<code>_</code>Issue: Word - 'will be' appears twice under 'Session Properties' prompt.<br>
</li><li>Issue 1295 (on Google Code) : Enhancement Request - New Active Scan Rule to Check HTTP Access to HTTPS Content<br>
</li><li>Issue 1300 (on Google Code) : Add-ons show incorrect language when English is selected on non English locale<br>
</li><li>Issue 1301 (on Google Code) : AbstractPanel leak through TabbedPanel2<br>
</li><li>Issue 1302 (on Google Code) : Context menu item action might not get executed<br>
</li><li>Issue 1303 (on Google Code) : HttpPanel<code>[</code>SyntaxHighlight]TextArea leak through HighlighterManager<br>
</li><li>Issue 1304 (on Google Code) : ZapMenuItem leak through ExtensionKeyboard<br>
</li><li>Issue 1305 (on Google Code) : Outgoing proxy is disabled when updating from old versions<br>
</li><li>Issue 1307 (on Google Code) : Ant OS X build of zip gets spaces in file name confused<br>
</li><li>Issue 1308 (on Google Code) : ZAP icns resolution too low<br>
</li><li>Issue 1309 (on Google Code) : NullPointerExceptions during a failed uninstallation of an add-on<br>
</li><li>Issue 1310 (on Google Code) : Allow to set history types as temporary<br>
</li><li>Issue 1311 (on Google Code) : Differentiate temporary internal messages from temporary scanner messages<br>
</li><li>Issue 1312 (on Google Code) : Misleading error message when unable to bind the local proxy to specified address<br>
</li><li>Issue 1319 (on Google Code) : Add API support for configuring a Context's authorization detection<br>
</li><li>Issue 1322 (on Google Code) : Remove deprecated Auth API<br>
</li><li>Issue 1324 (on Google Code) : Include add-on api calls in the generated apis<br>
</li><li>Issue 1325 (on Google Code) : Option to delete contexts<br>
</li><li>Issue 1326 (on Google Code) : Move Ajax Spider Extension from Beta to Release status<br>
</li><li>Issue 1333 (on Google Code) : ExtensionAntiCSRF ConcurrentModificationException<br>
</li><li>Issue 1334 (on Google Code) : ZAP does not handle API requests on reused connections leading to UnknownHostException: www.zap.com<br>
</li><li>Issue 1335 (on Google Code) : NullPointerException while selecting a node in the "Alerts" tab after excluding sites from proxy<br>
</li><li>Issue 1339 (on Google Code) : Introduce a simple event bus<br>
</li><li>Issue 1343 (on Google Code) : XContentTypeOptionsScanner Internationalization Usability<br>
</li><li>Issue 1345 (on Google Code) : Support Attack mode<br>
</li><li>Issue 1346 (on Google Code) : Breaking gziped responses fails in the browser<br>
</li><li>Issue 1348 (on Google Code) : Java client api Ant tasks dont wait<br>
</li><li>Issue 1353 (on Google Code) : Simpler break option<br>
</li><li>Issue 1355 (on Google Code) : Html report generation through the API<br>
</li><li>Issue 1356 (on Google Code) : Fix CacheControlScanner Typos<br>
</li><li>Issue 1357 (on Google Code) : Hide unused tabs<br>
</li><li>Issue 1359 (on Google Code) : Reinstate splash screen<br>
</li><li>Issue 1360 (on Google Code) : New add-on - Tips and Tricks<br>
</li><li>Issue 1362 (on Google Code) : Being allowed to add duplicated Anti-CSRF tokens only by API<br>
</li><li>Issue 1367 (on Google Code) : Can't detect "Xpath Injection" on a certain environment.<br>
</li><li>Issue 1377 (on Google Code) : "Source Code Disclosure - SVN" is missing regex escape<br>
</li><li>Issue 1378 (on Google Code) : Revamp active scan panel<br>
</li><li>Issue 1379 (on Google Code) : Not all extension's listeners are hooked during add-on installation<br>
</li><li>Issue 1381 (on Google Code) : Cleanly close breakpoint Add/Edit dialog on Cancel<br>
</li><li>Issue 1383 (on Google Code) : NullPointerException if an anti CSRF token does not have a value<br>
</li><li>Issue 1384 (on Google Code) : HttpSessions API does not accept URIs with path component<br>
</li><li>Issue 1385 (on Google Code) : XML report is not generated through the API if ZAP is not run from default installation dir<br>
</li><li>Issue 1386 (on Google Code) : PScan API - Allow to change and view alert thresholds<br>
</li><li>Issue 1387 (on Google Code) : Unable to change the proxy's port/address if the port/address was specified through the command line<br>
</li><li>Issue 1388 (on Google Code) : Not all translated files are updated when "zaplang" package is imported<br>
</li><li>Issue 1389 (on Google Code) : NullPointerException during startup if core help jar is not found<br>
</li><li>Issue 1390 (on Google Code) : Force https on cfu call<br>
</li><li>Issue 1391 (on Google Code) : Active Scan send wrong payload of multipart/form-data type<br>
</li><li>Issue 1394 (on Google Code) : Import vulnerabilities.xml files when updating the translated resources<br>
</li><li>Issue 1395 (on Google Code) : vulnerabilities' data kept in memory even if not used<br>
</li><li>Issue 1397 (on Google Code) : Move help files into add-ons<br>
</li><li>Issue 1399 (on Google Code) : Enhance help to open 'external' links in the users default browser<br>
</li><li>Issue 1404 (on Google Code) : SpiderODataAtomParser must return true only if links are detected<br>
</li><li>Issue 1406 (on Google Code) : Move online menu items to an add-on<br>
</li><li>Issue 1409 (on Google Code) : Speed up ZAP startup<br>
</li><li>Issue 1415 (on Google Code) : Fixed file uploads > 128k<br>
</li><li>Issue 1412 (on Google Code) : Manage scan policies<br>
</li><li>Issue 1416 (on Google Code) : Allow spider to be restricted by the number of children<br>
</li><li>Issue 1418 (on Google Code) : Option for ZAP to stay on top when breakpoint hit<br>
</li><li>Issue 1419 (on Google Code) : Include alert's evidence in HTML report<br>
</li><li>Issue 1420 (on Google Code) : Change spider's URLCanonicalizer to skip URIs without authority<br>
</li><li>Issue 1427 (on Google Code) : Standardize on <code>[</code>Cancel] <code>[</code>OK] button order<br>
</li><li>Issue 1433 (on Google Code) : Spider Select target not selected automatically<br>
</li><li>Issue 1447 (on Google Code) : Update RSyntaxTextArea library<br>
</li><li>Issue 1449 (on Google Code) : Resend / Manual Request help out of date<br>
</li><li>Issue 1458 (on Google Code) : Change home/installation dir paths to be always absolute<br>
</li><li>Issue 1460 (on Google Code) : Script types are not shown in "Script" tree when script type is added during installation of an add-on<br>
</li><li>Issue 1461 (on Google Code) : Core API - Allow to get a message by ID in HTTP Archive format<br>
</li><li>Issue 1462 (on Google Code) : Allow to remove script types<br>
</li><li>Issue 1463 (on Google Code) : Allow scripts to access classes of add-ons<br>
</li><li>Issue 1464 (on Google Code) : Allow to send "Referer" header in spider requests<br>
</li><li>Issue 1465 (on Google Code) : Translated files are not copied to correct directory if ZAP is not run from default installation dir<br>
</li><li>Issue 1466 (on Google Code) : Config option for 'large display' size<br>
</li><li>Issue 1467 (on Google Code) : AuthenticationApiExample not working<br>
</li><li>Issue 1468 (on Google Code) : Script templates not available when new script types are added during an installation of an add-on<br>
</li><li>Issue 1469 (on Google Code) : Automatically add a user if form based authentication specified based on a request<br>
</li><li>Issue 1472 (on Google Code) : Allow extensions to specify a name for UI components<br>
</li><li>Issue 1475 (on Google Code) : Alerts with different name from same scanner might not be shown in report<br>
</li><li>Issue 1476 (on Google Code) : Display contexts in the Sites tree<br>
</li><li>Issue 1483 (on Google Code) : MissingResourceException after uninstalling an add-on with passive scanners<br>
</li><li>Issue 1484 (on Google Code) : NullPointerException during uninstallation of an add-on with active scanners<br>
</li><li>Issue 1485 (on Google Code) : Do not allow to reselect an add-on if the uninstallation was unsuccessful<br>
</li><li>Issue 1486 (on Google Code) : Add-on components leak<br>
</li><li>Issue 1489 (on Google Code) : Version number in window title<br>
</li><li>Issue 1490 (on Google Code) : Update HarLib library<br>
</li><li>Issue 1491 (on Google Code) : Add versioned AbstractParam<br>
</li><li>Issue 1492 (on Google Code) : Update commons-csv library<br>
</li><li>Issue 1493 (on Google Code) : Remove deprecated authentication classes<br>
</li><li>Issue 1494 (on Google Code) : Support script directories<br>
</li><li>Issue 1502 (on Google Code) : Allow to remove script engine wrappers<br>
</li><li>Issue 1503 (on Google Code) : Not all engines are shown when creating a script from type<br>
</li><li>Issue 1504 (on Google Code) : Exception when a script engine is not installed/found<br>
</li><li>Issue 1505 (on Google Code) : Not all "Forced Browse" components are unloaded during uninstallation<br>
</li><li>Issue 1507 (on Google Code) : Not all "Script Console" components are unloaded during uninstallation<br>
</li><li>Issue 1508 (on Google Code) : Alerts added in view in daemon mode<br>
</li><li>Issue 1510 (on Google Code) : New Extension.postInit() method to be called once all extensions loaded<br>
</li><li>Issue 1511 (on Google Code) : Add option to only allow secure connections to the API<br>
</li><li>Issue 1514 (on Google Code) : Root CA cert not generated in daemon mode<br>
</li><li>Issue 1515 (on Google Code) : Not all "Zest" components are unloaded during uninstallation<br>
</li><li>Issue 1520 (on Google Code) : Add lock icon to https sites in the Sites tree<br>
</li><li>Issue 1521 (on Google Code) : Throwable errors like StackOverflowError not caught by passive scanner<br>
</li><li>Issue 1524 (on Google Code) : New Persist Session dialog<br>
</li><li>Issue 1525 (on Google Code) : Introduce a database interface layer to allow for alternative implementations<br>
</li><li>Issue 1528 (on Google Code) : Support user defined font size<br>
</li><li>Issue 1530 (on Google Code) : Default attack strength and alert threshold, set in 'Scan Policy', not used by scanners<br>
</li><li>Issue 1534 (on Google Code) : Change "Ajax Spider" add-on to depend on "Selenium" add-on<br>
</li><li>Issue 1535 (on Google Code) : Update Crawljax library and dependencies ("Ajax Spider" add-on)<br>
</li><li>Issue 1536 (on Google Code) : Change "Zest" add-on to depend on "Selenium" add-on<br>
</li><li>Issue 1537 (on Google Code) : ZAP should allow importing CA certificates<br>
</li><li>Issue 1540 (on Google Code) : Allow proxy scripts to fake responses<br>
</li><li>Issue 1541 (on Google Code) : Enable active scan scripts to scan just a URL rather than every parameter<br>
</li><li>Issue 1544 (on Google Code) : Support persistent script variables<br>
</li><li>Issue 1551 (on Google Code) : ZAP does not detect Relative Path Confusion (aka "Relative Path Overwrite" / "Path Relative Stylesheet Import")<br>
</li><li>Issue 1552 (on Google Code) : ZAP does not detect Forward / Reverse Proxies<br>
</li><li>Issue 1553 (on Google Code) : ZAP does not detect Storability / Cacheability of a response<br>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpIntro'>Introduction</a></td><td>the introduction to ZAP</td></tr>
<tr><td></td><td><a href='HelpReleasesReleases'>Releases</a></td><td>the full set of releases</td></tr>
<tr><td></td><td><a href='HelpCredits'>Credits</a></td><td>the people and groups who have made this release possible</td></tr>
</table>