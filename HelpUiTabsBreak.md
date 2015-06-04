# Break tab

The Break tab allows you to change a request or response when it has been caught by ZAP via a [break point](HelpStartConceptsBreakpoints).<br>It allows you to change elements that you would not normally be able to change via your browser, including:<br>
<table>
<tr><td></td><td>The header</td></tr>
<tr><td></td><td>Hidden fields</td></tr>
<tr><td></td><td>Disabled fields</td></tr>
<tr><td></td><td>Fields that use javascript to filter out illegal characters</td></tr>
</table>
This functionality is key to effectively pen testing your application.<br>
<br>
The 2 panels will only contain anything if ZAP has caught a request or response.<br>You can change anything<br>
in these 2 panels and then forward the request or response using the buttons on the <a href='HelpUiTltoolbar'>Top Level Toolbar</a>.<br>
<br>
Pull downs allow you to select different <a href='HelpUiViews'>Views</a> for the request or response header and body.<br>
<br>
While the Break tab is not in use its icon is a grey cross:  <img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/16/101grey.png' /> .<br>When a <a href='HelpStartConceptsBreakpoints'>break point</a> is hit the tab icon is changed to a red cross:  <img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/16/101.png' /> .<br>
<h2>Right click menu</h2>
Right clicking on a node will bring up a menu which will allow you to:<br>
<h3>Find...</h3>
This will bring up the <a href='HelpUiDialogsFind'>Find dialog</a>.<br>
<h3>Encode/Decode/Hash...</h3>
This will bring up the <a href='HelpUiDialogsEnc_dec'>Encode/Decode/Hash dialog</a>.<br>If you have highlighted any text then this will be automatically included in the dialog.<br>
<h3>Copy</h3>
This will copy the selected string to the clipboard.<br>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
<tr><td></td><td><a href='HelpUiTabsBreakpoints'>Break Points tab</a></td><td>for details of how to change or delete break points</td></tr>
</table>