# Options Extensions screen

This screen allows you to enable/disable extensions that are available to ZAP.
### Enable/Disable Extensions
Enabled extensions will be loaded by ZAP, thus adding the functionalities provided by those extensions.
Disabled extensions will not be loaded.
### Core Extensions
Core extensions are extensions that if disabled will impair ZAP's minimal functionality. Extensions marked
as core cannot be disabled.

_Note: Core extensions can be disabled through the configuration file, although it's not recommend._
### Extensions' Dependencies
Extensions may depend on other extensions to work. When one of those extensions (dependencies) is disabled
it will make ZAP automatically disable all the extensions that depend on them. So it may happen that
when disabling one extension other extensions (that depend on it) will also be disabled. Automatically
disabled extensions will not be allowed to be enabled until all the dependencies are enabled.
### Location of extensions available to ZAP
To make an extension available to ZAP it must be in one the following locations:
  * "plugin" directory located in the ZAP's folder;
  * "plugin" directory located in the ZAP user's folder.

_Note: You will need to restart ZAP for the changes to take effect._
## See also
<table>
<tr><td></td><td><a href='HelpUiOverview'>UI Overview</a></td><td>for an overview of the user interface</td></tr>
<tr><td></td><td><a href='HelpUiDialogsOptionsOptions'>Options dialogs</a></td><td>for details of the other Options dialog screens</td></tr>
</table>