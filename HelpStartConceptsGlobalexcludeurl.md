# Globally Excluded URLs

<em>Note: this feature is beta.</em>

Globally Excluded URLs are a set of Regular Expressions (regex) that ZAP ignores completely throughout
the application. These URLs will not show up in the Proxy, Scanner, or Spider for ZAP. In addition, the
URL regexs will be saved in the global configuration for ZAP and not inside of the session file. These
URLs will persist between each use of ZAP.

The regex for URLs are configured using the [Global Exclude URL screen](HelpUiDialogsOptionsGlobalexcludeurl) in the ZAP Options.
## See also
<table>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
<tr><td></td><td><a href='HelpStartConceptsConcepts'>Features</a></td><td>provided by ZAP</td></tr>
</table>