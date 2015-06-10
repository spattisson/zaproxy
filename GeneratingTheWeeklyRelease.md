# Generating the weekly release

Generating the weekly release is currently a manual process.

Yes we should automate more, but as you'll see there are quite a few steps and manual sanity checks.

At the time of writing we are generating the weekly releases from the zaproxy-2.4 branch. At some point after releasing 2.4.0 we'll go back to using the trunk.

### Language files
  1. zaproxy-2.4/build/build.xml target=crowdin-trigger-export-packages
  1. zaproxy-2.4/build/build.xml target=crowdin-download-translations
  1. Refresh files in IDE
  1. Commit changed language files (with some sanity checking)

### Update extension zap.jar files
Note that this is only done when we are relatively close to a release as add-ons that use the weekly ZAP jars may be incompatible with the released version of ZAP.
  1. zaproxy-2.4/build/build.xml target=copy-jar-to-extension-projects
  1. Refresh files in IDE
  1. Fix any compilation errors caused by updating the jar
  1. Commit the jars and any fixes required

### Generate the weekly add-ons
  1. zap-extensions/build/build.xml target=deploy-weekly
  1. zap-extensions-beta/build/build.xml target=deploy-weekly
  1. zap-extensions-alpha/build/build.xml target=deploy-weekly
  1. Commit the src/plugin directory (unless we are running out of space)

### Generate the release
  1. zaproxy-2.4/build/build.xml target=day-stamped-release

### Sanity check the release
  1. Expand package into a new directory
  1. Check the UI starts with no errors:
    * ./zap -dir test
  1. Check the daemon starts with no errors:
    * ./zap -dir test -daemon

### Publish the release
  1. Upload to http://sourceforge.net/projects/zaproxy/files/weekly/
  1. Update https://github.com/zaproxy/zaproxy/wiki/Downloads
  1. Update zaproxy-wiki/ZapVersions.xml
  1. Update [ZapVersions-dev.xml](https://github.com/zaproxy/zap-admin/blob/master/ZapVersions-dev.xml)
  1. Update [ZapVersions-2.4.xml](https://github.com/zaproxy/zap-admin/blob/master/ZapVersions-2.4.xml)

### Update the Docker image
  1. docker login
  1. docker build --no-cache -t owasp/zap2docker-weekly - < zaproxy-2.4/build/docker/Dockerfile-weekly
  1. docker push owasp/zap2docker-weekly

### Generate the client APIs
  1. zaproxy-2.4/build/build.xml target=generate-apis
  1. Run zap-extensions/src/org.zaproxy.zap.extension.ApiGenerator
  1. Run zap-extensions-beta/src/org.zaproxy.zap.extension.ApiGenerator
  1. Run zap-extensions-alpha/src/org.zaproxy.zap.extension.ApiGenerator
    * Yes we should have build targets for these but I havnt had time to get them to work yet ;)
  1. If new files are added reference them from
    * zaproxy-2.4/src/org/zaproxy/clientapi/core/clientApi.java
    * zaproxy-2.4/nodejs/api/zapv2/index.js
    * zaproxy-2.4/php/api/zapv2/src/Zap/Zapv2.php
    * zaproxy-2.4/python/api/src/zapv2/init.py
  1. Check in any changes under
    * zaproxy-2.4/src/org/zaproxy/clientapi/
    * zaproxy-2.4/nodejs/api/zapv2/
    * zaproxy-2.4/php/api/zapv2/src/Zap/
    * zaproxy-2.4/python/api/src/zapv2/
  1. TODO - packaging the APIs