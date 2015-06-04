# Release 2.0.0

The following changes were made in this release:
## Significant changes:
### An integrated add-ons marketplace
ZAP can be extended by add-ons that have full access to all of the ZAP internals. Anyone can write add-ons
and upload them to the ZAP Add-on Marketplace (OK, so its a Google code project called zap-extensions,
but you get the idea). <br>More importantly you can now browse, download and install those add-ons from within<br>
ZAP. Most add-ons can be dynamically installed (and uninstalled) so you wont even need a restart. <br>You<br>
can choose to be notified of updates, and even be automatically updated. And as the scan rules are now<br>
implemented as add-ons you can get the latest rules as soon as they are published.<br>
<h3>A replacement for the 'standard' Spider</h3>
The ‘old’ Spider was showing its age, so its been completely rewritten, and is much faster and more comprehensive<br>
than the old one. This is still a 'traditional' spider that analyses the HTML code for any links it can<br>
find.<br>
<h3>A new 'Ajax' spider</h3>
In addition to the 'traditional' spider we've added an Ajax spider which is more effective with applications<br>
that make heavy use of JavaScript. This uses the Crawljax project which drives a browser (using Selenium)<br>
and so can discover any links an application generates, even ones generated client side.<br>
<h3>Web Socket support</h3>
ZAP now supports WebSockets, so ZAP can now see all WebSocket messages sent to and from your browser.<br>
As with HTTP based messages, ZAP can also intercept WebSocket messages and allows you to change them<br>
on the fly. <br>You can also fuzz WebSockets messages as well using all of the fuzzing payloads included<br>
in ZAP from projects like JBroFuzz and fuzzdb. And of course you can easily add your own fuzzing files.<br>
<h3>Quick Start tab</h3>
The first main tab you will now see is a ‘Quick Start’ tab which allows you to just type in a URL and<br>
scan it with one click. <br>This is an ideal starting point for people new to application security, but experts<br>
can easily remove it if they find it distracting.<br>
<h3>Session awareness</h3>
ZAP is now session awareness, so that ZAP can recognise and keep track of multiple sessions. It allows<br>
you to create new sessions, switch between them, and applies to all of the other components, like the<br>
Spider and Active Scanner.<br>
<h3>User defined Contexts</h3>
You can now define any number of ‘contexts’ - related sets of URLs which make up an application. You<br>
can then target all URLs in a context, for example using the Spider or Active Scanner. You can also add<br>
the contexts to the scope, and associate other information, such as authentication details.<br>
<h3>Session scope</h3>
The session scope allows you to specify which contexts you are interested at any one time. You can restrict<br>
what you see in various tabs to just the URLs in scope, and prevent accidentally attacking URLs not in<br>
scope by using the Protected mode.<br>
<h3>Different modes</h3>
ZAP now supports 3 modes:<br>
<ul><li>Safe, in which no potentially dangerous operations permitted<br>
</li><li>Protected, in which you can perform any actions on URLs in scope<br>
</li><li>Standard, in which you can do anything to any URLs<br>
<h3>Authentication handling</h3>
You can now associate authentication details with any context, which allows ZAP to do things like detect<br>
if and when you are logged out and automatically log you back in again. This is especially useful when<br>
used via the API in security regression tests.<br>
<h3>More API support</h3>
The REST API has been significantly extended, giving you much more access to the functionality ZAP provides.<br>
<h3>Fine grained scanning controls</h3>
The active scan rules can now be tuned to adjust their strength (the number of attacks they perform)<br>
and the threshold at which they report potential issues.<br>
<h3>New and improved active and passive scanning rules</h3>
We have uploaded the results from running ZAP 2.0.0 against wavsep (the most comprehensive open source<br>
evaluation project we are aware of) to the ZAP wiki: <a href='http://code.google.com/p/zaproxy/wiki/Testing'>http://code.google.com/p/zaproxy/wiki/Testing</a> TODO<br>
;)<br>
<h2>Full list of changes:</h2>
<h3>Issue 43 (on Google Code): Scope option for filtering</h3>
<h3>Issue 163 (on Google Code): Active scanner failing against DVWA <code>[</code> high false positives/true negatives rate]</h3>
<h3>Issue 175 (on Google Code): Better bruteforce wordlist</h3>
<h3>Issue 240 (on Google Code): SocketException whilst fuzzing not handled correctly.</h3>
<h3>Issue 278 (on Google Code): Root CA Certificate for Dynamic SSL invalid on some platforms due to ExtendeKeyUsage extension</h3>
<h3>Issue 281 (on Google Code): Alert class JSON dependency</h3>
<h3>Issue 299 (on Google Code): Feature request: Show count of found URIs during Spider</h3>
<h3>Issue 305 (on Google Code): Passive scanner rule for suspicious comments like TODO and FIXME</h3>
<h3>Issue 326 (on Google Code): Response time and total length in manual request</h3>
<h3>Issue 330 (on Google Code): robots.txt parsing</h3>
<h3>Issue 332 (on Google Code): Support for modes</h3>
<h3>Issue 333 (on Google Code): Spider - add option to crawl everthing in scope</h3>
<h3>Issue 335 (on Google Code): Web Sockets - add support for Modes and Scope</h3>
<h3>Issue 342 (on Google Code): Add an HttpSenderListener</h3>
<h3>Issue 350 (on Google Code): Authentication management</h3>
<h3>Issue 354 (on Google Code): Fuzzer attack strings not shown</h3>
<h3>Issue 356 (on Google Code): Generate CSRF test form</h3>
<h3>Issue 358 (on Google Code): Typo in "XFO Header Not Set" Solution</h3>
<h3>Issue 360 (on Google Code): brute force sub directories</h3>
<h3>Issue 361 (on Google Code): getHostPort on HttpRequestHeader for HTTPS CONNECT requests returns the wrong port</h3>
<h3>Issue 370 (on Google Code): API - save session better error handling</h3>
<h3>Issue 374 (on Google Code): API - save session synchronous or provide status</h3>
<h3>Issue 376 (on Google Code): Masking the passwords provided for Authentication</h3>
<h3>Issue 385 (on Google Code): Support contexts</h3>
<h3>Issue 386 (on Google Code): API Web UI - support parameters with views</h3>
<h3>Issue 388 (on Google Code): Allow user to specify which technologies apply to a context</h3>
<h3>Issue 390 (on Google Code): Spider - Add option to spider all in context</h3>
<h3>Issue 391 (on Google Code): ZAP Performance improvements</h3>
<h3>Issue 393 (on Google Code): More online links from menu</h3>
<h3>Issue 397 (on Google Code): Support weekly builds</h3>
<h3>Issue 400 (on Google Code): Generate new CA certificate will always produce certificate with same serial number</h3>
<h3>Issue 401 (on Google Code): Exception when the (new) Spider is started through the API</h3>
<h3>Issue 402 (on Google Code): GUI labels are not properly displayed on Linux (when language set to Polish)</h3>
<h3>Issue 403 (on Google Code): Set options via the API using reflection</h3>
<h3>Issue 404 (on Google Code): Labels not properly displayed when the Persian language is chosen</h3>
<h3>Issue 406 (on Google Code): Spider - Add option to control the effect of parameters on visited URLs</h3>
<h3>Issue 410 (on Google Code): charset wrapped in quotation marks</h3>
<h3>Issue 411 (on Google Code): Allow proxy port to be specified on the command line</h3>
<h3>Issue 417 (on Google Code): IndexOutOfBoundsException in ExtensionHttpSessions in daemon mode</h3>
<h3>Issue 419 (on Google Code): Restructure jar loading code</h3>
<h3>Issue 420 (on Google Code): API - support absolute session paths</h3>
<h3>Issue 421 (on Google Code): Cleanly shut down any active scan threads on shutdown</h3>
<h3>Issue 422 (on Google Code): Use exec in zap.sh so a new process is not forked</h3>
<h3>Issue 423 (on Google Code): Active scanner and spider can deadlock if ZAP is shutdown while they are running</h3>
<h3>Issue 424 (on Google Code): Exceptions in Web Sockets when session opened</h3>
<h3>Issue 425 (on Google Code): Add quick start tab</h3>
<h3>Issue 428 (on Google Code): ZAP Marketplace support</h3>
<h3>Issue 429 (on Google Code): Active Scan URL via API scans more than just the specified URL</h3>
<h3>Issue 433 (on Google Code): API: introduce mandatory parameters and optional descriptions</h3>
<h3>Issue 435 (on Google Code): Active scan alerts may be "lost" after saving the session</h3>
<h3>Issue 436 (on Google Code): Locking on session save or shutdown via the API</h3>
<h3>Issue 438 (on Google Code): API enhancements</h3>
<h3>Issue 441 (on Google Code): View incorrectly initialised in many places when in daemon mode</h3>
<h3>Issue 443 (on Google Code): "No Anti-CSRF tokens were found in a HTML submission form" listed as "None. Warning only."</h3>
<h3>Issue 446 (on Google Code): KeyStore of a registered PKCS#11 provider is not retrieved if a PKCS#11 provider is already registered</h3>
<h3>Issue 447 (on Google Code): Highlight attack when displaying alerts</h3>
<h3>Issue 448 (on Google Code): Rename Brute Force ext to Forced Browse and add URLs to the tree</h3>
<h3>Issue 449 (on Google Code): Missing help page for "Extensions" panel in the "Options" dialogue</h3>
<h3>Issue 451 (on Google Code): Manual check for updates doesn't work correctly in the newest weekly releases</h3>
<h3>Issue 453 (on Google Code): Dynamic loading and unloading of add-ons</h3>
<h3>Issue 455 (on Google Code): Split fuzzbd out into a new addon</h3>
<h3>Issue 456 (on Google Code): Spider session handling tweeks</h3>
<h3>Issue 457 (on Google Code): Search Tab arrow key support</h3>
<h3>Issue 459 (on Google Code): Active scanner locking</h3>
<h3>Issue 460 (on Google Code): Add a scan progress dialog</h3>
<h3>Issue 461 (on Google Code): Add help file for Quick Start addon</h3>
<h3>Issue 462 (on Google Code): Review: Patch/Review: SSLSocketFactory with TLS enabled and default Cipher options</h3>
<h3>Issue 466 (on Google Code): Move Port Scan extension to ZAP extensions project</h3>
<h3>Issue 468 (on Google Code): Upgrade SQL Injection rule to 'release'</h3>
<h3>Issue 469 (on Google Code): Allow anti csrf token to be added and removed via the API</h3>
<h3>Issue 471 (on Google Code): Move BeanSell extension to ZAP extensions project</h3>
<h3>Issue 472 (on Google Code): Spider accesses UI panel in daemon mode</h3>
<h3>Issue 473 (on Google Code): Allow add-ons to remove views/components added to the message panels</h3>
<h3>Issue 474 (on Google Code): Promote quick start to release status</h3>
<h3>Issue 478 (on Google Code): Allow to choose to send ZAP's managed cookies on a single Cookie request header and set it as the default</h3>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpIntro'>Introduction</a></td><td>the introduction to ZAP</td></tr>
<tr><td></td><td><a href='HelpReleasesReleases'>Releases</a></td><td>the full set of releases</td></tr>
<tr><td></td><td><a href='HelpCredits'>Credits</a></td><td>the people and groups who have made this release possible</td></tr>
</table>