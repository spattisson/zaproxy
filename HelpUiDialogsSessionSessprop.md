# Session Properties dialog

This allows you to set the session properties and is made up of the following screens:
### General screen
This allows you to set the session name and description.
### Exclude from proxy
This allows you to manage the URLs which will be ignored by the proxy.
### Exclude from scanner
This allows you to manage the URLs which will be ignored by the scanner.
### Exclude from spider
This allows you to manage the URLs which will be ignored by the spider.
### Contexts
A set of screens for managing [contexts](HelpStartConceptsContexts)
## URL regexs
In the _Exclude from `*`_ dialogs, you can enter regular expressions to define excluded URLs. While you can
escape a single meta-character with a backslash, you can also use the **\Q...\E** escape sequence. All the
characters between the **\Q** and the **\E** are interpreted as literal characters. E.g. \Q`*`\d+`*`\E matches the
literal text `*`\d+`*`. This escape sequence is used in ZAP when you exclude URLs via some context menus.
<br><b>Note:</b> If your URL contains a "\E", then you have to do the following steps when using the <b>\Q...\E</b> escape<br>
sequence:<br>
<ul><li>Open the escape sequence<br>
</li><li>Close the escape sequence before the "character" \E<br>
</li><li>Escape the backslash<br>
</li><li>Open after the "\E" another escape sequence;<br>
</li><li>Close the escape sequence as normally would.<br>
<br>Example: subdomain.example.com/path?a=<b>\E</b>&moredata=2 should appear as <i>\Qsubdomain.example.com/path?a=\E</i><b>\\E</b><i>\Q&moredata=2\E</i>
<h2>Accessed via</h2>
<table>
<tr><td></td><td><a href='HelpUiTlmenuFile'>Top level File menu</a></td><td>'Properties...' menu item</td></tr>
</table>
<h2>See also</h2>
<table>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
<tr><td></td><td><a href='HelpUiDialogsDialogs'>Dialogs</a></td><td>for details of the dialogs or popups </td></tr>
</table>