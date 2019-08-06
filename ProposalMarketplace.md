# Marketplace Proposal

## Summary

This page describes a proposal for a ZAP 'marketplace', which to be honest is a bit of marketing spin ;)

It is really all about making it as easy as possible for ZAP users to find, install and manage extensions and scan rules.

This will help users, but should also make the extensions more popular and will hopefully encourage more people to contribute to ZAP.

## Feedback
Feedback can be added via comments on this page or posted to the related Dev group post here: https://groups.google.com/d/topic/zaproxy-develop/flV3oilraXo/discussion

## What is this proposal trying to solve

I think we have the following problems regarding ZAP extensions:
  * Many (most?) ZAP users are unaware of the zap-extensions project
  * Users have to choose to visit the zap-extensions project
  * Users have to manually download and install ZAP extensions
  * A ZAP restart is required to see them
  * Extensions can be disabled in ZAP, but again changes require a restart
  * It is not possible to upgrade 'built in' extensions without performing a 'full release'
  * Extensions have to be put in the 'plugin' directory which may only be accessible to root/administrators

## The proposal
This is actually a set of proposals, which are broken down for clarity:

### Terminology
This is very much up in the air at the moment!

There is a ZAP [Extension](https://github.com/zaproxy/zaproxy/blob/develop/src/org/parosproxy/paros/extension/Extension.java) class, so strictly speaking ZAP extensions just extend this class.

However we also have active and passive scanner rules, etc.

Perhaps we should use the term 'addons' to refer to any code that can be added to ZAP without needing a rebuild?

Suggestions and feedback appreciated!

### Make ZAP more modular
The ZAP build route will be changed so that instead of one zap.jar there will be multiple jars.

The jars could contain just one Extension, but in practice many may contain multiple related extensions.

There will still be a zap-core.jar file for the core functionality, including the code for loading all of the other jars. It will not be possible to dynamically upgrade this jar.

All of the jars will include a version number and status - like the zap-extension jars do now.

The core jar could either just be named zap-core.jar or could include the ZAP version, eg zap-core-2-0-0.jar

All of the scanner rules will be moved into the zap-extensions project and will be included in one jar (per status), eg zap-scanrules-release-5.jar and zap-scanrules-beta-7.jar

### ZAP Extensions branches
New branches will be introduced in the zap-extensions project for alpha and beta (and weekly?) rules and extensions.

Classes will move between these branches based on the review procedure being discussed ion the ZAP dev group.

(Thanks to Sergey for this suggestion!)

### Change the way jars are loaded
The class loaders will be changed to look at all of the jars in the `<install>/plugins` directory and a `<user>/plugins` directory.

This will allow us to ship a set of 'release' jars, which can then be upgraded dynamically. The use of a local user directory will avoid file permission issues.

So we may ship a jar such as zap-spider-release-1.jar and at a future date this may get upgraded to zap-spider-release-2.jar - this could be placed in the user's plugin directory and will supersede the one included in the release.

### Check for updates to extensions
At the moment the ZAP 'check-for-updates' extension just checks for new versions of ZAP.

This will be changed to check for new versions of all installed extensions.

The user will still be able to disable this, and may well be given more control (see below).

There will be an option to automatically download and install any updates. Possibly this should be configurable on a per update basis?

There will ideally be a wide range of (checkbox) options for the user, including:
  * Check for ZAP updates
    * Check for addon (?) updates
    * Auto install addon updates
    * Auto install release quality scan rules
    * Auto install beta quality scan rules
    * Auto install alpha quality scan rules
    * Check and install on startup (see below)
Note that the scan rules are deliberately split out - I think many users will want to automatically upgrade to the latest 'release quality' scan rules (as long as we ensure they remain high quality!) but may want more control over other extensions.

All of these are open for discussion, including (especially!) the wording, but should give an idea of the sort of options envisioned.

### Optionally report new addons
There will be a set of options which will allow the user to be alerted when new addons/extensions become available, eg
  * Report new release quality addons
  * Report new beta quality addons
  * Report new alpha quality addons

### Browse new extensions in ZAP
It will be possible to browse the available extensions from within ZAP.

ZAP will (when requested) pull down information about all of the extensions available and allow the user to see summary and more detailed information.

This will include ALL available extensions, including alpha and beta versions. These will be clearly labelled.

In a way this (and the following item) is the ZAP marketplace - all of the other changes are just to support this.

### Download and install extensions
Users will be able to download and install extensions without having to restart ZAP.

It is likely that a restart will be needed before an upgrade to an existing extension can be applied.

Perhaps there should be an option to install upgrades before the class loaders run?

### Rationalize the zaproxy and zap-extensions project
As mentioned above all scan rules will be moved to the zap-extensions project.

It is suggested that at least some of the existing extensions in zaproxy should be moved to zap-extensions - the port scanner being an obvious example.

Perhaps all non 'core' extensions should be moved to zap-extensions?

### New file extension for addons
We could define a new file extension for ZAP addons, and '.zap' seems to be an obvious candidate.

We could then associate ZAP with the .zap file extension and then it could be invoked automatically when the user downloads or double clicks on a local file with this naming convention. eg zap-spider-release-2.zap (maybe we could then drop the initial 'zap'?)

These could just be 'just' jar files, or could be jar files which have a specific structure or include specific files (see below).

### Localization
One problem with splitting ZAP into many components is how to handle the language files.

We could have one per extension, as per the zap-extensions project, but this then becomes difficult for people who want to translate ZAP into different languages.

But if we have one master file then we will need to update this is any extension needs new language strings.

One option would be to have a 'core' language file (as now) for all of the extensions included in full releases. But there would also be a set of 'patch files' eg Messages-update\_en\_GB.properties. These would be loaded after the core ones.

When an extension is updated the .zip file could include the changed or addition language strings in a standard directory in the jar (zap file). The upgrade process would extract these strings and append them to the relevant patch file. Patch files would probably be cleared out whenever there is a new 'full' ZAP release.

### Help files
We have a similar problem with help files.

I suspect (but dont know for certain) that it will be much harder to patch in changes to the main help file.

We may therefore need to either:
  1. Accept the help file will get out of date
  1. Release a new help file if significant changes are made to a core extension
  1. Split the existing help file into multiple ones
Any suggestions appreciated!

### Dynamically 'uninstall' extensions
We could make changes that would allow extensions to be dynamically uninstalled.

This would probably be achieved by requiring that extensions implement a new method which would be called when the user uninstalls the plugin.

Each extension would then be responsible from rolling itself back, in particular undoing any UI changes that it had made.

Note that this would be a non trivial piece of work, and if considered worthwhile should probably still be implemented as optional functionality for each extension, at least to start with.

### ZAP extensions revamp
The https://github.com/zaproxy/zap-extensions/ homepage and wiki should be improved to make it more visually appealing and easier to find more information.

This is something that can be addressed on an ongoing basis and is not tied to a specific ZAP release.