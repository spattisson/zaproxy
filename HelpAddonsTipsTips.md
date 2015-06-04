# Tips and Tricks

## Full list of tips

Add your target application to a Context using the 'right click' menu: 'Include in Context'.<br>This allows<br>
you tell ZAP more about the target, such as the authentication, the users and the technology it uses.<br>
<br>
<br>
Click on the 'gear' icon on the right hand side of many tabs to quickly access the setting for that feature.<br>
<br>
<br>
Does your application use anti CSRF tokens?<br>Make sure you have configured ZAP to handle them via the 'Options<br>
/ Active Scan' screen.<br>
<br>
If you are getting too many false positives try changing the threshold for that scan rule to High.<br>But<br>
also report the problem to us via the ZAP Users Group or Issues so we can investigate it - both of which<br>
are linked off the 'Online' menu<br>
<br>
Install the Retire add-on from the ZAP Marketplace to detect insecure versions of JavaScript libraries<br>
using the database from Retire.js.<br>
<br>
Install the SAML Add-on from the ZAP Marketplace to detect, show, edit and fuzz SAML requests.<br>
<br>
Install the accessControl add-on from the ZAP Marketplace to automate testing of your application's access<br>
control.<br>
<br>
Install the beta active and passive scan rules to find more potential issues.<br>There are also alpha active<br>
and passive scan rules but obviously they may be less stable.<br>
<br>
Install the sequence add-on from the ZAP Marketplace to scan pages that must be visited in a specific<br>
order for the full functionality to be accessible.<br>
<br>
New to ZAP?<br>Download the 'Getting Started with ZAP' guide from the ZAP Marketplace.<br>
<br>
POST requests have a 'right click' menu for generating an anti CSRF test form<br>
<br>
Right click everywhere.<br>Highlight text and right click it.<br>A lot of ZAP functionality is context sensitive<br>
as best accessed this way.<br>
<br>
Save your ZAP session at the start of a test rather than at the end - the session is stored in a db which<br>
will be updated all of the time so you wont have to save it again.<br>
<br>
Still using Filters? These are being phased out and will be removed in the future.<br>Use scripts instead<br>
- they are much more powerful.<br>
<br>
The 'Show / enable' fields 'lightbulb' button on the main toolbar will make hidden fields visible and<br>
allow you to edit disabled fields.<br>
<br>
The Search tab allows you to find string in Fuzz results - it supports regex expressions and inverse<br>
matching.<br>
<br>
The majority of ZAP's tabs are now hidden by default so that the UI is less cluttered.<br>You can show and<br>
hide all of the tabs via buttons on the main toolbar.<br>You can also 'pin' any tab you like so that it stays<br>
visible even after a restart.<br>
<br>
There are a large number of fuzzing files available in the ZAP Marketplace in the 'Directory List <code>*</code>',<br>
'Fuzzdb files' and 'SVN Digger files' add-ons.<br>
<br>
There are lots of resources linked off the 'Online' menu, including the ZAP Homepage, User and Developer<br>
groups<br>
<br>
There is a repository of ZAP scripts at <a href='https://github.com/zaproxy/community-scripts'>https://github.com/zaproxy/community-scripts</a><br>If you clone a local<br>
copy then you can add all of them to ZAP via the Scripts Option pane.<br>You can also upload your own scripts<br>
via pull requests - the more the better!<br>
<br>
Try different UI layouts via the buttons on the main toolbar.<br>
<br>
Use keyboard shortcuts to speed up your testing - you can define your own combinations via 'Options /<br>
Keyboard' which also generates printable shortcut cheatsheets.<br>
<br>
Want to chat to someone about ZAP?<br>Many of the ZAP core developers hang out on <a href='irc://irc.mozilla.org'>irc://irc.mozilla.org</a> #websectools<br>
<br>
<br>
Want to script ZAP in a scripting language other than Java Script and Zest?<br>Check the ZAP Marketplace<br>
for other languages like python and ruby.<br>If your preferred scripting language isnt yet available then<br>
get in touch - its fairly easy to add support for other languages.<br>
<br>
You can change the syntax highlighting used for the Request, Response and Script Console tabs via the<br>
'right click' 'Syntax' menus.<br>
<br>
You can compare 2 requests or responses by selecting them both, 'right clicking' and selecting one of<br>
the 'Compare 2..' menu items.<br>
<br>
You can export all of the URLs recorded by ZAP using the top level menu: "Report / Export All URLs to<br>
a File..."<br>
<br>
You can import URLs contained in a text file using the importurls add-on available on the ZAP Marketplace<br>
<br>
<br>
You can invoke 3rd party tools like sqlmap and nmap from within ZAP, passing across a wide range of contextual<br>
information.<br>Just configure the applications you want to invoke in the "Options / Applications" screen.<br>
<br>
<br>
You can reorder table columns by dragging and dropping them.<br>You can also select which columns are show<br>
via the icon just above the scroll bar on the right hand side of each table.<br>
<br>
You can search for text in any text area, including the Request and Response tabs, using the 'right click'<br>
'Find...' menu.<br>
<br>
You can tell ZAP to access an app using a specified user.<br>To do that you need to add your app to a Context<br>
and then define the authentication and user details.<br>
<br>
You can tell ZAP to load all of the scripts in a set of directories via the Scripts Option page.<br>See the<br>
help for details of the directory structure.<br>
<br>
ZAP can automatically check for updates - turn it on via the 'Options / Check for Updates' screen.<br>If<br>
you dont want it to happen automatically then make sure you manually check for updates frequently via<br>
the 'Manage Add-ons' main toolbar button as we continually add new features and fix issues.<br>
<br>
ZAP can display, intercept and even fuzz client side messages including postMessages - 'right click'<br>
a subtree in the Sites tree and select a suitable submenu under 'Monitor clients'.<br>Force a browser refresh<br>
and your open pages will be displayed in the 'Clients' tab along with all of the client side messages<br>
they generate.<br>
<br>
ZAP has comprehensive help pages accessible via the 'Help / OWASP ZAP User Guide' menu.<br>The F1 key will<br>
also bring up the help pages and take you straight to the relevant section for the selected tab.<br>
<br>
Zest scripts are a great way to automate tasks.<br>Zest is ZAP's graphical macro language, but provides programming<br>
features like conditionals and loops.<br>Use the 'Record a new Zest script...' button on the main toolbar<br>
to quickly record a new Zest script.<br>You can also 'right click' requests to add them to Zest scripts.<br>
