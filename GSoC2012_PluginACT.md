# Execute Summary

---


This page is a web log of the work carried out in the <a href='http://google-melange.appspot.com/gsoc/project/google/gsoc2012/guifre/48006'>Enhanced AJAX Integration in ZAProxy project</a> of the <a href='http://owasp.org'>OWASP</a> organization in the <a href='http://google-melange.appspot.com/gsoc/org/google/gsoc2012/owasp'>Google Summer of Code 2012</a>.

<br>
In this GSoC project, we made the following <b>contributions</b>:<br>
<br>
<ul><li>Developed a plugin to fully integrate a widely known spider called <a href='http://crawljax.com'>Crawlax</a> in ZAP. The release of the plugin is available to download on the <a href='http://code.google.com/p/zap-extensions/downloads/detail?name=zap-ext-spiderAjax-alpha-1.jar&can=2'>zap-extensions site</a>. You can find its official getting started guide with information  regarding its installation and use in the <a href='https://github.com/zaproxy/zaproxy/wiki/AJAXSpider_getStarted'>Getting Started</a> page.<br>
</li><li>Enhanced the Crawljax spidering capabilities. Before this GSoc project, Crawljax got a score of 10% in the <a href='http://code.google.com/p/wivet/'>WIVET</a> benchmarking project. We improved its score from 10% up to 72%. as shown in this <a href='http://vimeo.com/44380063'>video</a> and also in the <a href='https://github.com/zaproxy/zaproxy/wiki/Testing'> testing wiki page</a>. The improvements have been sent to the crawljax dev. team and are also available on <a href='https://github.com/guifre/crawljax/'>github</a>.<br>
</li><li>Added support for setting local proxies in crawljax when using the Chrome and HTMLUnit web browsers.<br>
</li><li>Added support in ZAP to allow extensions appending their custom icons in the Sites Nodes Tree, as specified in <a href='https://groups.google.com/d/topic/zaproxy-develop/KAKUYAm_6qo/discussion'>this thread</a>.<br>
</li><li>Researched different ways of including extension-specific dependencies in ZAP and established a standard one in the ant build file of ZAP, which we documented in the <a href='https://github.com/zaproxy/zaproxy/wiki/Dependencies'>wiki</a>.</li></ul>

<br><br>

<h1>Table of Contents</h1>
<hr />
<br>
<br>
<br>
<h1>Introduction</h1>
<hr />

The OWASP Zed Attack Proxy (ZAP) is a penetration testing tool for finding vulnerabilities in web applications. It is widely used by the security community, and it was recently elected tool of the year by a widely known security blog.<br>
<br>
Asynchronous JavaScript and XML (AJAX) is a group of interrelated web development techniques used on the client-side to create asynchronous web applications. It gained a lot of popularity since the Web 2.0.<br>
<br>
One of the main features of ZAP is a crawler that inspects all pages of the targeted site, as a result of which, a map of the site is generated. This map will be later used to find vulnerabilities in each one of the pages. Unfortunately, ZAP does not support crawling dynamic generated links with AJAX.<br>
<br>
On the other hand, there is a OWASP tool called AJAX Crawling Tool (ACT) that performs this task. My objective is to develop a plugin for ZAP to facilitate users scanning AJAX based web pages. This plugin will call ACT to accomplish this, and the resulting information will be properly integrated with the ZAP interface and features.<br>
<br>
<br>
<br>
<br>
<h1>Project goals</h1>
<hr />

After discussing the idea with the pertinent OWASP project leaders, we have set the following goals:<br>
<br>
<ul><li>Develop a plugin for ZAP to improve its integration with ACT.<br>
</li><li>Improve the ACT command line invocation capabilities.<br>
</li><li>Design a system to mark the HTTP requests made by ACT and implement also this system in ACT to recognize what URLs come from ACT.<br>
These were the main goals. Nevertheless, there are a few requirements that we will need to comply with:<br>
</li><li>The plugin will be easy to use by a developer with no security training.<br>
</li><li>The code will need to be very clean to facilitate its comprehension.<br>
</li><li>Both of the tools will be able to be updated separately without breaking integration.<br>
</li><li>The information provided by ACT will be completely integrated with the ZAP user interface. Links will appear in the site tree, also marked as spidered and shown in the history tab.</li></ul>

<blockquote><br><br></blockquote>

<h1>Timeline</h1>
<hr />

The project is planned to be completed in 4 phases to accomplish the goals of Section 2. Below we show its timeline.<br>
<br>
<ul><li>March-April: Setting up the Eclipse environment for developing ZAP, cloning the repository, compiling it, getting in touch with the development team and potential mentors, discussing the ideas with them and writing the proposal  (already done).<br>
</li><li>April-May: Getting to know the code, defining the requirements and specifications of the project start writing the prototype and modifications to ACT.<br>
</li><li>May-June: Develop the functional specifications and the resulting prototype. Get feedback from the mentor and community.<br>
</li><li>June-August: Performing the modifications needed, refining the code, carry out the needed tests and documentation.</li></ul>



<blockquote><br><br></blockquote>

<h1>Weekly Progress Log</h1>
<hr />

<h2>#13 Week (08-14 to 08-20)</h2>
<ul><li>Soft "pencils down" date.<br>
</li><li>Cleaning up code.<br>
</li><li>Writing documentation such as the <a href='https://github.com/zaproxy/zaproxy/wiki/AJAXSpider_getStarted'>getting started</a> page and some <a href='https://github.com/zaproxy/zaproxy/wiki/GSoC2012_PluginACT?ts=1344981172&updated=GSoC2012_PluginACT#AJAX_Spider_Plugin_Code'>code notes</a>.<br>
</li><li>Performing final tests.<br>
</li><li>Planning future work.</li></ul>

<br>
<h2>#12 Week (08-06 to 08-13)</h2>
<ul><li>Added gear button in AJAX Spider panel that opens the Options Panel.<br>
</li><li>Set up a <a href='http://code.google.com/p/bodgeit/'>bodgeit</a> local testing environment  & tested AJAX Spider (works well). Made a few screnshoots to put in the <a href='https://github.com/zaproxy/zaproxy/wiki/Testing'>wiki</a>.<br>
</li><li>Fixed a log4j logging level issues in Crawljax.<br>
</li><li>Sent all the enhancements made so far to the crawljax development team.<br>
</li><li>Added new Parameters in the Options panel to choose as many threads & browser windows as wanted, which speeds up the process dramatically.<br>
</li><li>Written the AJAX Spider help documentation.<br>
</li><li>Translated messages.properties into Spanish and removed some unnecessary labels in Messages.properties.<br>
</li><li>Tested a new OWASP penetration testing tool for web applications called <a href='https://www.owasp.org/index.php/OWASP_Xelenium_Project'>Xelenium</a>.<br>
</li><li>Tested all the previous changes and committed them into trunk.<br>
</li><li>Released the alpha 1 version of AJAX Spider in the <a href='https://code.google.com/p/zap-extensions/downloads/detail?name=zap-ext-spiderAjax-alpha-1.jar'>zap-extensions</a> site.</li></ul>

<br>
<h2>#11 Week (07-31 to 08-05)</h2>
<ul><li>Changed the zaproxy extensions way of handling custom icons according to the specifications described at the <a href='https://groups.google.com/forum/?fromgroups#!topic/zaproxy-develop/KAKUYAm_6qo'>dev. group thread</a>.<br>
</li><li>Created a standard way of including dependencies in ZAP extensions and documented it in the <a href='https://github.com/zaproxy/zaproxy/wiki/Dependencies'>wiki</a>.<br>
</li><li>Committed the ZAP core changes to trunk and branch 1.4.<br>
</li><li>Added support in crawljax for client proxy configuration for HtmlUnit.<br>
</li><li>Added a 'stop' button in the ajax spider panel extension to stop crawljax.<br>
</li><li>Added a checkbox in the options panel to switch to htmlunit.<br>
</li><li>Cloned the crawljax codebase to <a href='https://github.com/guifre/crawljax/commits/master'>a github repo</a> to facilitate tracking my changes, to allow other people contributing, and to learn about git.<br>
</li><li>Tested the extension with java 7 because of <a href='https://groups.google.com/d/msg/zaproxy-develop/KtsAPIZK68k/78nP_iJMe-QJ'>this</a>.</li></ul>

<br>
<h2>#10 Week (07-24 to 07-30)</h2>
<ul><li>Changed the dependencies packing mechanism to have those included in the plugin jar by using <a href='http://code.google.com/p/jarjar'>jarjar</a>.<br>
</li><li>Merged zaproxy needed resources and features into trunk and branch 1.4.<br>
</li><li>Working on allowing crawljax to support other web browsers such as IE and htmlunit.<br>
</li><li>Working on the extension-specific icons functionalities.</li></ul>

<br>
<h2>#09 Week (07-17 to 07-23)</h2>
<ul><li>Fixed the plugin icon's access from ZAP bug.<br>
</li><li>Created a new spider panel according to <a href='https://groups.google.com/forum/?fromgroups#!topic/zaproxy-develop/T5xdooTz1Zg'>https://groups.google.com/forum/?fromgroups#!topic/zaproxy-develop/T5xdooTz1Zg</a>
</li><li>Fixed some exceptions in crawljax.<br>
</li><li>Created new methods in HistoryReference to allow plugins using their own icons in the sites tree. It can be used by instantiating History ref as follows: HistoryReference(session,"/org/path/to/icon", msg, clearWhenManual?);<br>
</li><li>Working on including the jbrofuzz code in zap<br>
</li><li>Also working on some issues of my svn client that forbid me from properly merging my branch.<br>
<br></li></ul>

<h2>#08 Week (07-10 to 07-16)</h2>
<ul><li>Working on profiling the plugin and detecting the memory issues that were crashing zaproxy when running the plugin.<br>
</li><li>Created a method that checks if chromedriver is available in the system. It work in any platform.<br>
</li><li>Fixed a bug that forbid the plugin from reading some labels in the plugin messages file.<br>
</li><li>Created a new dialog that alerts the users if chromedriver is not available and shows were to download it.<br>
</li><li>Fixed the bug about extensions being loaded twice by removing zap.jar from the lib and locating it outside of the plugin folder.<br>
</li><li>Started writing the new panel interface according to the new specifications described in the dev. group <a href='https://groups.google.com/forum/?fromgroups#!topic/zaproxy-develop/T5xdooTz1Zg'>https://groups.google.com/forum/?fromgroups#!topic/zaproxy-develop/T5xdooTz1Zg</a>
</li><li>Working on fixing a bug in the icons that does not allow zaproxy to read the icons stored in the plugin jar file.<br>
</li><li>Finished implementing the spider Spidering Filter feature to ignore specific URLs.<br>
</li><li>Implemented a filter for the new proxy of the plugin to ignore specific URLs.<br>
</li><li>Not a very productive week, I did my thesis defense and had to do many university-related work. Fortunately, I finished it and from now on I can work 100% of the time on ZAP.</li></ul>



<br>
<h2>#07 Week (07-03 to 07-09)</h2>
<ul><li>Added Compatibility in the plugin for Chrome and IE.<br>
</li><li>Added new Check-boxes in the Option Menu Panel to choose the willing web-browser<br>
<ul><li>By default -> Firefox, if you select more than one-> Firefox. When opening it again you see the last selected.<br>
</li></ul></li><li>Tested the new version of the Selenium drivers and replaced the old ones with those (in both crawljax and the plugin).<br>
</li><li>Crawjlax did not had support to configure a proxy in Chrome, I added support for it.<br>
</li><li>Could not test the proxy thing with IE (I do not have any Windows box right now..)<br>
</li><li>Making a filter to ignore specifig URL patterns in crawljax (still working on it, crawljax has some known issues <a href='https://code.google.com/p/crawljax/issues/detail?id=58'>https://code.google.com/p/crawljax/issues/detail?id=58</a>)<br>
</li><li>Added the thc202 patch to the Spanish translation of ZAP and merged it to the trunk.<br>
</li><li>Changed the messages.properties location to the plugin class path.<br>
</li><li>Changed the icon images location to the plugin class path (also modified the build.xml to include them in the jar file).</li></ul>


<br>
<h2>#06 Week (06-25 to 07-02)</h2>
<ul><li>Got in touch with the crawljax developers to plan the integration of the current improvements.<br>
</li><li>Finished implementing the logic of the ajax proxy.<br>
</li><li>Replaced the User-Agent check by an instantiation of the historyRefernce class with specific constant for the ajax plugin.<br>
</li><li>Added a new feature to the plugin and to crawljax to allow deeper but slower analysis.<br>
</li><li>Added a new option in the Options panel to set normal or deeper analysis.<br>
</li><li>Added a new option in the Options panel to modify the configuration of the AJAX proxy.<br>
</li><li>Cleaning and commenting the code to carry out the first commit of the plugin.<br>
</li><li>Set up a public testing environment in a public server to allow people testing the plugin on wivet <a href='http://caos.uab.es/~gruiz/test/wivet/'>http://caos.uab.es/~gruiz/test/wivet/</a>
</li><li>Committed both zap-exts and zaproxy to their corresponding branches.<br>
</li><li>Created a brief howto about compiling and running the plugin at</li></ul>

<br>
<h2>#05 Week (06-18 to 06-24)</h2>
<ul><li>Got in <a href='https://groups.google.com/forum/?fromgroups#!topic/zaproxy-develop/jEm0Oh1sGLU'>touch</a> with ZAP developers to solve the spider specific icon issue of the plugin prototype.<br>
</li><li>Improved the results of ACT in WIVET up to 73% of the site so far.<br>
</li><li>Working on being able to directly instantiate the act and crawljax classes from zaproxy insted of performing a system call.<br>
</li><li>Fixed some translation issues in ZAP (I have to post the diff to the list to validate them).<br>
</li><li>Blogged & made a video about the current status at <a href='http://t.co/LJotsbBZ'>http://t.co/LJotsbBZ</a>
</li><li>created a new branch in the zaproxy repository called 'spiderAjax' and committed the changes.<br>
</li><li>I have to commit the plugin also, but there are many libraries and dependencies changed and there are no branches in that repository. I don't want to commit to avoid breaking something.<br>
</li><li>improved the Spanish translation of ZAP <a href='http://goo.gl/gDX2H'>http://goo.gl/gDX2H</a> and posted to the list <a href='http://goo.gl/lVrxQ'>http://goo.gl/lVrxQ</a> to have it reviewed.<br>
<br>
<h2>#04 Week (06-11 to 06-17)</h2>
</li><li>Working on improving the <a href='https://code.google.com/p/crawljax/'>crawljax</a> spidering capabilities.<br>
</li><li>In the beginning it was only capable to crawl <b>5 links</b> of wivet. With the new improvements it spiders <b>37 pages</b>.<br>
</li><li>Got in <a href='https://groups.google.com/forum/?fromgroups#!topic/crawljax/tstVeyfgavs'>touch</a> with the developers to include those.<br>
</li><li>The state machine of crawljax does not handle well the dynamic DOM states of wivet, working on fixing it.<br>
</li><li>Working hard on improving ACT crawling capabilities, current results available at: <a href='GSoC2012_PluginACT#Current_Results'>GSoC2012_PluginACT#Current_Results</a>
</li><li>Stucked on the ZAP plugin, working on showing a specific icon in ACT-crawled links and also on showing the results in its own tab.</li></ul>

<br>
<h2>#03 Week (06-04 to 06-10)</h2>

<ul><li>Checked out the ACT main line from<br>
</li><li>Went over the ACT code<br>
</li><li>made some changes to the pom.xml file to fix some dependency issues<a href='1'>1</a>
</li><li>Understanding and testing the ACT code.<br>
</li><li>Read Ali Mesbah, Arie van Deursen, and Stefan Lenselink (2011). Crawling Ajax-based Web Applications through Dynamic Analysis of User Interface State Changes. ACM Transactions on the Web (TWEB).<br>
<br></li></ul>

<h2>#02 Week (05-28 to 06-03)</h2>
<ul><li>Added an AJAX history tab for the plugin in the user interface.<br>
</li><li>Decided we will test ACT on Wivet<br>
</li><li>Set up a testing environmnet with wivet <a href='http://code.google.com/p/wivet/'>http://code.google.com/p/wivet/</a>
</li><li>Started testing ACT on wivet<br>
</li><li>Working on improving the ACT crawling capabilities.<br>
</li><li>Read documentation about Maven<br>
</li><li>Tested Crawljax in wivet<br>
</li><li>Identified links that is not able to crawl and started working on it.</li></ul>



<br>
<h2>#01 Week (05-21 to 05-27)</h2>
<ul><li>Developing the UI of the plugin<br>
</li><li>Added the button+icon in the attack menu<br>
</li><li>Added a option panel to facilitate users reviewing the configuration and changing it<br>
</li><li>Analyzed code regarding external applications.<br>
</li></ul><ul><li>Developed in the prototype a code that instantiates the InvokeAppWorker class and executes ACT as external application. Maybe we could extend the method to have more flexibility?</li></ul>


<br>
<h2>#00 Week (Before Coding Period)</h2>
<ul><li>Started working on the plugin to integrate ACT and ZAProxy:<br>
</li><li>Started coding the user-interface part of the ZAP plugin.<br>
</li></ul><ul><li>I set up my development environment and checked out the ZAProxy code.<br>
</li><li>I started Testing the current <a href='https://code.google.com/p/zap-extensions/'>available</a> extensions.<br>
</li><li>I got in touch with the ZAProxy development community to get some <a href='https://groups.google.com/forum/?fromgroups#!topic/zaproxy-develop/l8VECDlTZmg'>feedback</a> regarding some design decissions.<br>
</li><li>Made the gsoc proposal</li></ul>

<br>
<br>
<h1>AJAX Spider Plugin Code</h1>
<hr />
The code of the plugin among its javadoc can be found at the <a href='https://code.google.com/p/zap-extensions/source/browse/#svn%2Ftrunk%2Fsrc%2Forg%2Fzaproxy%2Fzap%2Fextension%2FspiderAjax'>zap-extensions subversion</a>, and it contains the following classes:<br>
<br>
<ul><li><b>AjaxProxyParam</b>: Contains the set of attributes and methods needed to store the configuration of the local proxy used by the spider ajax plugin.<br>
</li></ul><ul><li><b>PopupMenuAjaxSite</b>: creates the action in the attack menu to launch the crawler.<br>
</li><li><b>ChromeAlertDialog</b>: alter window shown if the chrome driver is not available when selecting chrome as default web browser.<br>
</li><li><b>ExtensionAjax</b>: Main class of the plugin, extends ExtensionAdaptor and instantiates the rest of the plugin's classes.<br>
</li><li><b>ProxyAjax</b>: This class manages the ajax spider proxy server and contains all the needed methods to update, start and stop it.<br>
</li><li><b>Messages</b>: It defines the default (English) variants of all of the internationalised messages of the plugin.<br>
</li><li><b>Messages_es_ES</b>: It is the Spanish translation of the messages of the plugin.<br>
</li><li><b>SpiderFilter</b>:  It is called before the crawling, it checks the candidates and discards those according to the excluded ones in the filter and scope.<br>
</li><li><b>SpiderPanel</b>: This class creates the Spider AJAX Panel where the found URLs are displayed. It has a button to stop the crawler and another one to open the option window.<br>
</li><li><b>OptionsAjaxSpider</b>: It contains the set of information to display in the Option Window that will be later used by the local spider proxy and the crawler.<br>
</li><li><b>SpiderThread</b>: This class instantiates crawljax and performs the spidering.<br>
</li><li><b>PopupMenuAjax</b>: This class creates the action in the attack menu to launch the crawler.<br>
</li><li><b>lib/</b>: This folder contains the set of dependencies of the plugin, which will be included in the final jar file.</li></ul>



<br><br>
<h1>Running the Prototype</h1>
<hr />

Requirements: Firefox 6-12<br>
<br>
<h2>Running the new zaproxy branch (already contains the plugin)</h2>
<ul><li>Checkout <a href='http://zaproxy.googlecode.com/svn/branches/spiderAjax'>http://zaproxy.googlecode.com/svn/branches/spiderAjax</a>
<ul><li>Window->Open Prespective->Other->SVN Repository<br>
</li><li>Right Click in the rep. tab->New->Repository Location<br>
</li><li>Write in the URL field: <a href='http://zaproxy.googlecode.com/svn/branches/spiderAjax'>http://zaproxy.googlecode.com/svn/branches/spiderAjax</a>
</li><li>checkout the spiderAjax folder as a new java project called "zaproxy"<br>
</li></ul></li><li>You need to set the output folder to bin, also select the libs and select the main class<br>
</li><li>Run the new configuration<br>
<br></li></ul>

<h2>Compiling the plugin</h2>
<ul><li>Checkout <a href='http://zap-extensions.googlecode.com/svn/branches/spiderAjax'>http://zap-extensions.googlecode.com/svn/branches/spiderAjax</a>
<ul><li>-Window->Open Prespective->Other->SVN Repository<br>
</li><li>Right Click in the rep. tab->New->Repository Location<br>
</li><li>Write in the URL field: <a href='http://zap-extensions.googlecode.com/svn/branches/spiderAjax'>http://zap-extensions.googlecode.com/svn/branches/spiderAjax</a>
</li><li>Checkout the spiderAjax folder as a new java project called "zap-exts"<br>
</li></ul></li><li>Run the build.xml file with Ant.<br>
</li><li>Copy ${workspace}/zap-exts/build/zap-exts/zap-ext-spiderAjax-alpha-1.jar to ${workspace}/zaproxy/src/plugin/<br>
</li><li>Copy ${workspace}/zap-exts/build/zap-exts/zap-ext-spiderAjax-alpha-1.jar to ${workspace}/zaproxy/bin/plugin/<br>
<br></li></ul>

<h2>Potential tests</h2>
<ul><li>Visit with firefox <a href='http://caos.uab.es/~gruiz/test/wivet'>http://caos.uab.es/~gruiz/test/wivet</a>
</li><li>In the site tab, press right click to "wivet" and lunch attack->spider ajax site<br>
</li><li>After finishing, go to Tools->Options->Spider AJAX options and martk "crawl in depth". Launch again the spider ajax and see the results.<br>
</li></ul><blockquote><br><br></blockquote>

<h1>TODO List</h1>
<hr />
<ul><li>Add proxy configuration in IE.<br>
</li><li>The tag scanning is slow in crawljax. I tried to put many tags and crawljax crashes... Furthermore, when you have a huge table crawljax takes a lot of time to scan all tags. We could dynamically scan each page and parse what tags have links and set a new config clickElement(x) depending on the tags of that specific page that has links (instead of the current clickAllElements() or clickDefaultElements()). We can either do this in our plugin or in the crawljax code.<br>
</li><li>Improve the crawling capabilities (currently 72%-74% of wivet)</li></ul>

<br><br>
<h1>Design Decisions</h1>
<hr />
<ul><li>ACT will be called as an external application in ZAP.<br>
</li><li>ACT (act13b.jar) will be included in the extension package. Therefore, it should be available in the plugin folder of ZAP. If not found it will be asked users their location.<br>
</li><li>The plugin will be run in the attack menu as  'Spider AJAX Site' (i.e. <a href='http://goo.gl/Psv8x'><a href='http://goo.gl/Psv8x'>http://goo.gl/Psv8x</a></a>).<br>
</li><li>Crawled links will appear in the Sites menu with the new icon (i.e. <a href='http://goo.gl/tHCIM'><a href='http://goo.gl/tHCIM'>http://goo.gl/tHCIM</a></a>).<br>
</li><li>Show new links in a new "AJAX Spider" tab or the existing spider should also change to use the History tab.</li></ul>

<br>
<h1>Other Notes</h1>
<hr />
<ul><li>Run ACT as external application in ZAP:<br>
<pre><code>/usr/bin/java   -jar /Users/guifre/act13b.jar -u %url% -b firefox -p localhost:8080<br>
</code></pre></li></ul>

<ul><li>Current action icon ( just the current one of the spider colorized to red with gimp) in /resource/icon/16/spiderAJAX.png backup: <a href='http://goo.gl/j5zKz'>http://goo.gl/j5zKz</a></li></ul>

<ul><li>Main problems of Crawljax when spidering wivet:<br>
There is a page that creates new random links, and crawljax enters in an infitinte loop spidering it.<br>
<code>&lt;a href="2_2.php?&lt;?php echo (rand()%1000)?&gt;=&lt;?php echo (rand()%1000)?&gt;"&gt;click me&lt;/a&gt;</code></li></ul>


<br><br>
<h1>WIVET Benchmarking</h1>
<hr />
<h2>Current Results</h2>

<i>The following results have been achieved by targeting the root of the wivet framework with ACT.</i>
<br>

<b>0%</b> of WIVET<br>
<br>
Current ACT<br>
<br>
<br>
<b>10%</b> of WIVET<br>
<br>
Modified <i>CandidateElementExtractor</i>  class to spider links <b>frame</b> tags.<br>
<br>
<br>
<b>30%</b> of WIVET<br>
<br>
Modified getFramesCandidates to to analyze the code of pages in <b>frame</b> tags.<br>
<br>
<br>
<b>70%</b> of WIVET<br>
<br>
Modified the crawling specification to spider the following HTML tags:<br>
<pre><code>a, td, span, div, tr, ol, li, radio, non, refresh, xhr, relative, link, self, form, select, input, option</code></pre>
<br>
<b>Current results: 73% of WIVET</b>
<br>
Added a sleep method when crawling meta tags to  support these tags.<br>
<br>
<br>
<br>
<h2>Issues Working on</h2>

<b>1</b>. 1_1.php	A complex javascript function executed after a certain TimeOut<br>
<pre><code>&lt;script&gt;<br>
window.onload = function(){<br>
// what what<br>
setTimeout(showLink, 3000);<br>
}<br>
function showLink(){<br>
var container = document.getElementById("container");<br>
var alink = document.createElement("a");<br>
alink.href = "../innerpages/1_1.php";<br>
alink.innerHTML = "click me";<br>
container.appendChild(alink);<br>
}<br>
<br>
<br>
Unknown end tag for &lt;/script&gt;<br>
<br>
</code></pre>
<b>2</b>. 2_2.php	self referencing link with random query string<br>
<pre><code>&lt;a href="2_2.php?&lt;?php echo (rand()%1000)?&gt;=&lt;?php echo (rand()%1000)?&gt;"&gt;click me<br>
<br>
Unknown end tag for &lt;/a&gt;<br>
<br>
</code></pre>
<b>3</b>. 8_1.php	link in html comment<br>
<pre><code>&lt;!-- my comment with full link: http://aopcgr.uab.es:10001/innerpages/8_1.php --&gt;</code></pre>
<b>4</b>. 8_2.php	relative link in html comment<br>
<pre><code>&lt;!-- my comment with relative: innerpages/8_2.php --&gt;</code></pre>
<b>5</b>. 9_2.php	span onmouseout window.location.href<br>
<br>
<b>6</b>. 9_6.php	p onmouseout window.location.href<br>
<br>
<b>7</b>. 9_10.php, 9_14.php, 9_18.php, 9_22.php selenium does not handle onmouseout events<br>
<pre><code>&lt;li onmouseout="genericGo(22)"&gt;click here<br>
<br>
Unknown end tag for &lt;/li&gt;<br>
<br>
<br>
<br>
&lt;tr onmouseout="genericGo(18)"&gt;<br>
<br>
&lt;td onmouseout="genericGo(14)"&gt;click here<br>
<br>
Unknown end tag for &lt;/td&gt;<br>
<br>
<br>
<br>
&lt;div onmouseout="genericGo(10)"&gt;click here<br>
<br>
Unknown end tag for &lt;/div&gt;<br>
<br>
<br>
<br>
&lt;p onmouseout="genericGo(6)"&gt;click here <br>
<br>
Unknown end tag for &lt;/p&gt;<br>
<br>
<br>
<br>
&lt;span onmouseout="go2()"&gt;click here <br>
<br>
Unknown end tag for &lt;/span&gt;<br>
<br>
</code></pre>
<b>8</b>. 12_4.php	non referred link pattern 1<br>
<br>
<b>9</b>. 16_2.php	302 redirection link in response body (not able to crawl $hiddenUrl)<br>
<pre><code>function redirect($url, $hiddenUrl)<br>
{<br>
header("Location: $url");<br>
echo 'This page has moved to &lt;a href="'.$hiddenUrl.'"&gt;HERE :)<br>
<br>
Unknown end tag for &lt;/a&gt;<br>
<br>
';<br>
exit();<br>
}<br>
redirect('../innerpages/16_1.php', '../innerpages/16_2.php');</code></pre>

<b>10</b>. 17_2.php	Some complex ajax request that requires a certain time between one and another one to be executed..<br>
<br>
<b>11</b>. 18_1.php	non referred link pattern 2<br>
<br>
<br>
<br>
<br>
<br>
<hr><br>
<br>
