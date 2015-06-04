# Zest

Zest is an experimental specialized scripting language (also known as a domain-specific language) developed
by the Mozilla security team and is intended to be used in web oriented security tools.

It is included by default with ZAP.<br>
<h2>Creating Zest scripts</h2>
There are a variety of ways to create Zest scripts:<br>
<h3>Record a new Zest script Button</h3>
<ul><li>Press the 'Record a new Zest script' button on the main toolbar<br>
</li><li>Type in a suitable name for your script in the 'Add a Zest Script' dialog<br>
</li><li>Select the prefix you want to record requests for, or leave blank to record all requests<br>
</li><li>Press the 'Save' button<br>
</li><li>The 'Record a new Zest script' button will stay pressed, change to 'Recording a new Zest script' and show a red icon.<br>
The new Zest script will be shown in the Scripts tab with a red 'recording' icon.<br>Any requests that you<br>
make underneath the specified prefix will be added to the script.<br>Press the 'Recording a new Zest script'<br>
again to stop recording the requests.<br>Note that you can only record 'Stand Alone' Zest scripts in this<br>
way. If you want to create other types of Zest script you must use another mechanism. <br><br>You can also right<br>
click any Stand Alone Zest script and use the 'Start recording' and 'Stop recording' buttons.<br>
<h3>New Script Button</h3>
</li><li>Navigate to the Scripts tree tab<br>
</li><li>Press the 'New Script...' button<br>
</li><li>Type in a suitable name for your script in the 'New Script' dialog<br>
</li><li>Select the script type (see the Scripts add-on help page for more details)<br>
</li><li>Select the Zest script engine<br>
</li><li>Select one of the templates (if relevant)<br>
</li><li>Press the 'Save' button<br>
Any type of Zest script can be created this way.<br>
<h3>Right clicking a Zest template</h3>
</li><li>Navigate to the Scripts tree tab<br>
</li><li>Expand the 'Templates' node and find a template you want to use<br>
</li><li>Right click on the template and select 'New Script...'<br>
</li><li>Press the 'Save' button<br>
Any type of Zest script can be created this way.<br>
<h3>Right clicking requests</h3>
</li><li>Navigate to any tab that shows requests, such as the History tab<br>
</li><li>Select one or more requests<br>
</li><li>Right click on them<br>
</li><li>Select the 'Add to Zest Script' menu which allows you to select an existing Stand Alone script or create a new one<br>
Note that you can only add request to 'Stand Alone' Zest scripts.<br>
<h3>Plug-n-Hack</h3>
If you are using a recent version of Firefox then you can create Zest scripts from within your browser.<br>
</li><li>Press the 'Plug-n-Hack' button on the ZAP 'Quick Start' tab<br>
</li><li>Install the Plug-n-Hack Firefox Add-on and accept all of the dialogs<br>
</li><li>Press 'Shift F2' in Firefox to access the Developer Toolbar<br>
</li><li>Type 'zap record on global' to start recording a new Zest script<br>
</li><li>Any requests you make through ZAP will be added to the script<br>
</li><li>Type 'zap record off global' to stop recording the script<br>
Note that you can only record 'Stand Alone' Zest scripts in this way. If you want to create other types<br>
of Zest script you must use another mechanism.<br>
<h2>Editing Zest scripts</h2>
Zest scripts are edited graphically in the Scripts tree tab.<br>Each statement is a node in the tree - double<br>
click nodes to edit the statement properties.<br>You can add, move and remove statements via right clicking<br>
the Zest nodes.<br>You can also add requests to 'Stand alone' Zest scripts by right clicking the requests<br>
in any of the other tabs.<br>There are also some right click options available when you select text in the<br>
Request or Response tabs.<br><br>Zest includes a set of 'built in' variables as well as allowing you to declare<br>
your own.<br>A right click menu is provided (where relevant) in the edit dialogs to allow you to paste in<br>
any of the available variable names.<br>
<h2>External links</h2>
<table>
<tr><td></td><td><a href='https://developer.mozilla.org/en-US/docs/zest'>https://developer.mozilla.org/en-US/docs/zest</a></td><td>Zest overview</td></tr>
<tr><td></td><td><a href='https://github.com/mozilla/zest'>https://github.com/mozilla/zest</a></td><td>The Zest github repository, including details of the language</td></tr>
</table>