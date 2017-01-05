# Generating the full release

**NOTE that this page is "work in progress" ;)**

Generating the full release is currently a manual process.

Yes we should automate more, but as you'll see there are quite a few steps and manual sanity checks.

``<relnum>`` is the release number, e.g. 2.4.1

### Create a new release branch
  1. On the command line in zaproxy/zaproxy: ``git checkout -b release-<relnum> develop``

You should now be working on the zaproxy/zaproxy "release-<relnum>" branch.

### Update for the new release
  1. Change the zaproxy/build/version.txt file to contain just ``<relnum>``
  1. Generate a short URL (eg via https://bitly.com/) and update zaproxy/src/org/zaproxy/zap/extension/autoupdate/ExtensionAutoUpdate.java
  1. Commit and push the branch to zaproxy/zaproxy

### Update @since 
  1. Grep for "TODO add version" replace with the version number
  1. Commit and push

### Create release help file
  1. Run [GenerateReleaseNotes.java](https://github.com/zaproxy/zap-admin/blob/master/src/org/zaproxy/admin/GenerateReleaseNotes.java) after updating the date
  1. Create the file in zaproxy/zap-core-help/src/help/zaphelp/contents/releases
  1. Update index.xml, map.jhm and toc.xml

### Language files
  1. zap-admin/build/build.xml target=crowdin-update-sources
  1. zap-admin/build/build.xml target=crowdin-trigger-export-packages
  1. zap-admin/build/build.xml target=crowdin-download-translations
  1. zap-admin/build/build.xml target=generate-help-jars
  1. zapproxy/build/build.xml target=generate-language-file
  1. Refresh files in IDE
  1. Change the language file name, remove the old one, update the coreLang manifest
  1. Update the help manifests (if required)
  1. Commit changed language files (with some sanity checking)

### Generate the java client API
  1. as per the [weekly release process](https://github.com/zaproxy/zaproxy/wiki/GeneratingTheWeeklyRelease#generate-the-client-apis)
  1. Update the Java API client version (in build.xml)

### Update extension zap.jar files
  1. zaproxy/build/build.xml target=copy-jar-to-extension-projects
  1. Refresh files in IDE
  1. Fix any compilation errors caused by updating the jar
  1. Commit the jars and any fixes required

### Generate the release add-ons
  1. zaproxy/build/build.xml target=deploy-release-addons

### Generate the initial release files
  1. zaproxy/build/build.xml target=full-release
Note that this will have to be done on Window, Linux and Mac OS.

### Generate the Windows installer
  1. TODO

### Publish the installers
  1. TODO

### Publish the installers
  1. TODO

### Tell key repackagers of the new release
  * Kali - https://bugs.kali.org/main_page.php
  * Homebrew Cask: https://github.com/caskroom/homebrew-cask/blob/master/Casks/owasp-zap.rb
If you repackage ZAP releases and would like to be informed of new ones then just let us know :)

### Publicize the new release
  1. TODO

### Update the API details on the wiki
  1. TODO

**TODO FINISH ;)**

