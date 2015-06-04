# Scripts

The ZAP Script Add-on allows you to run scripts that can be embedded within ZAP and can access internal
ZAP data structures.<br>It supports any scripting language that supports JSR 223 (<a href='http://www.jcp.org/en/jsr/detail?id=223'>http://www.jcp.org/en/jsr/detail?id=223</a>)<br>
,including:<br>
<ul><li>ECMAScript / Javascript (included by default)<br>
</li><li>Zest <a href='https://developer.mozilla.org/en-US/docs/zest'>https://developer.mozilla.org/en-US/docs/zest</a> (included by default)<br>
</li><li>Groovy <a href='http://groovy.codehaus.org/'>http://groovy.codehaus.org/</a>
</li><li>Python <a href='http://www.jython.org'>http://www.jython.org</a>
</li><li>Ruby - <a href='http://jruby.org/'>http://jruby.org/</a>
</li><li>and many more...<br>
<b>WARNING - scripts run with the same permissions as ZAP, so do not run any scripts that you do not trust!</b>
<h2>Script types</h2>
Different types of scripts are supported:<br>
</li><li>Stand Alone - scripts that are self contained and are only run when your start them manually<br>
</li><li>Active Rules - these run as part of the Active Scanner and can be individually enabled<br>
</li><li>Passive Rules - these run as part of the Passive Scanner and can be individually enabled<br>
</li><li>Proxy Rules - these run 'inline', can change every request and response and can be individually enabled. They can also trigger break points<br>
</li><li>Targeted Rules - scripts that invoked with a target URL and are only run when your start them manually<br>
</li><li>Authentication - scripts that invoked when authentication is performed for a Context. To be used, they need to be selected when configuring the Script-Based Authentication Method for a Context.<br>
</li><li>Script Input Vectors - scripts for defining exactly what ZAP should attack<br>
All scripts that are run automatically are initially 'disabled' - you must enable them via the <a href='HelpAddonsScriptsTree'>The Scripts 'tree' tab</a> before they will run.<br>If an error occurs when they run then they will be disabled.<br>When you select the script then the last error will be shown in the <a href='HelpAddonsScriptsConsole'>Script Console tab</a>.<br>Targeted scripts can be invoked by right clicking on a record in the Sites or History tabs and selecting the 'Invoke with script...' menu item.</li></ul>

All scripting languages can be used for all script types, but only those languages that have been downloaded<br>
from the ZAP Marketplace will typically have templates. However you may well be able to adapt a template<br>
for another language.<br>If your favourite language is not available on the Marketplace then please raise<br>
a new issue via the "Online/Report an issue" menu item.<br>In the meantime you can just place the relevant<br>
jars in the 'lib' directory (not the 'plugin' directory) and restart ZAP.<br>
<h2>Global Variables</h2>
Variables can be shared between all scripts via the class org.zaproxy.zap.extension.script.ScriptVars.<br>For<br>
example in Javascript you can use this class as follows:<br><br><pre><code><br>
org.zaproxy.zap.extension.script.ScriptVars.setGlobalVar("var.name","value")<br>
org.zaproxy.zap.extension.script.ScriptVars.getGlobalVar("var.name")<br>
</code></pre>
<h2>Script Variables</h2>
Variables can be shared between separate invocations of the same script via the same org.zaproxy.zap.extension.script.ScriptVars<br>
class.<br>For example in Javascript you can use this class as follows:<br><br><pre><code><br>
org.zaproxy.zap.extension.script.ScriptVars.setScriptVar(this.context, "var.name","value")<br>
org.zaproxy.zap.extension.script.ScriptVars.getScriptVar(this.context, "var.name")<br>
</code></pre><br>Note that these methods are only usable from scripting languages that provide access to the ScriptContext (like Javascript).<br>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpAddonsScriptsConsole'>The Script Console tab</a></td><td></td></tr>
<tr><td></td><td><a href='HelpAddonsScriptsTree'>The Scripts 'tree' tab</a></td><td></td></tr>
</table>
<h2>External links</h2>
<table>
<tr><td></td><td><a href='http://code.google.com/p/zaproxy/wiki/InternalDetails'>http://code.google.com/p/zaproxy/wiki/InternalDetails</a></td><td>ZAP internal objects</td></tr>
<tr><td></td><td><a href='http://code.google.com/p/zaproxy/wiki/JavaDocs'>http://code.google.com/p/zaproxy/wiki/JavaDocs</a></td><td>ZAP javadocs</td></tr>
</table>