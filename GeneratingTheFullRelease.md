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
  1. Generate a short URL (eg via https://bitly.com/) and update zaproxy/src/
  1. Commit and push the branch to zaproxy/zaproxy

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

### Update extension zap.jar files
  1. zaproxy/build/build.xml target=copy-jar-to-extension-projects
  1. Refresh files in IDE
  1. Fix any compilation errors caused by updating the jar
  1. Commit the jars and any fixes required

### Generate the release add-ons
  1. zaproxy/build/build.xml target=deploy-release-addons

### Generate the client APIs
**TODO FINISH ;)**

