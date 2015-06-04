# Somethings not working - what should I do?

Somethings not working as you expect with ZAP, and you're not sure if its a bug or a misunderstanding of how ZAP works.

The following steps may well help:

### Check for updates

Click on the 'Manage Add-ons' button on the toolbar and then click on the 'Check for updates' button.

Note that there will not be a 'Check for updates' button if you've configured ZAP to check on startup (which is recommended).


If there is a new version of ZAP and/or new versions of any of the add-ons then you should install them.

We are constantly improving ZAP and the add-ons and newer versions may fix the problems that you are experiencing.

### Check the ZAP User Guide

ZAP includes a User Guide that should cover all of the functionality available.

This can be accessed via the 'Help / OWASP ZAP User Guide' menu, the help button on the right hand side of the top toolbar, via help buttons on individual dialogs or via the F1 key (which is context dependant).

The main help file is also available [online](HelpIntro), although this will not include the help for optional add-ons that you have installed.

### Check the log file

Look in the zap.log file to see if any errors have been logged. This is either in the directory you specified via the '-dir' [command line](HelpCmdline) option or in the [default directory](FAQconfig) if you didnt specify one.

If there are error messages that appear to indicate a Java memory problem then try increasing the memory available via the appropriate command line script for your platform.

### Ask on the ZAP User Group

The [ZAP user group](http://groups.google.com/group/zaproxy-users) is a great place to ask questions about using ZAP. All of the ZAP developers are on the user group as are many knowledgeable ZAP users who may also be able to help you.

### Ask on irc

Some of the ZAP developers hang out on [irc.mozilla.org](https://chat.mibbit.com/?url=irc%3A%2F%2Firc.mozilla.org%2F%23websectools) in #websectools which you can access via that link or your favourite irc client.

### Ask on twitter

You can ask [@psiinon](https://twitter.com/psiinon) short questions directly on twitter, although whether he's online will be timezone and holiday dependant.

### Raise an issue

If you're (fairly) sure its a bug you can raise an [issue](https://code.google.com/p/zaproxy/issues/entry?template=Defect%20report%20from%20user).

Or if you think its a new feature you can raise an [Enhancement Request](https://code.google.com/p/zaproxy/issues/entry?template=Enhancement%20Request)


---

[Back to the FAQ](FAQtoplevel)