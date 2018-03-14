# Generating the weekly release

Generating the weekly release is currently a manual process.

Yes we should automate more, but as you'll see there are quite a few steps and manual sanity checks.

We now generate the weekly releases from the develop branch.

### Language files
Language file changes are now automatically submitted via pull requests from [zapbot](https://zapbot.github.io/zap-mgmt-scripts/index.html) - no additional steps are required here.

### Update extension zap.jar files
Note that this is only done when we are relatively close to a release as add-ons that use the weekly ZAP jars may be incompatible with the released version of ZAP.
  1. zaproxy/build/build.xml target=copy-jar-to-extension-projects
  1. Refresh files in IDE
  1. Fix any compilation errors caused by updating the jar
  1. Commit the jars and any fixes required

### Generate the weekly add-ons
  1. zaproxy/build/build.xml target=deploy-weekly-addons

### Generate the release
  1. zaproxy/build/build.xml target=day-stamped-release

### Sanity check the release
  1. Expand package into a new directory
  1. Check the UI starts with no errors:
    * ./zap -dir test
  1. Check the daemon starts with no errors:
    * ./zap -dir test -daemon

### Publish the release
  1. Create a new release via https://github.com/zaproxy/zaproxy/releases
  1. Upload the file to the release
  1. Update https://github.com/zaproxy/zaproxy/wiki/Downloads
  1. Update [ZapVersions-dev.xml](https://github.com/zaproxy/zap-admin/blob/master/ZapVersions-dev.xml)
  1. Update [ZapVersions-2.4.xml](https://github.com/zaproxy/zap-admin/blob/master/ZapVersions-2.4.xml)

### Update the Docker image
In the zaproxy directory:
  1. docker login
  1. docker build --no-cache -t owasp/zap2docker-weekly -f docker/Dockerfile-weekly docker/
  1. docker push owasp/zap2docker-weekly

### Generate the client APIs
  1. zaproxy/build/build.xml target=generate-apis
  1. Run zap-extensions/src/org.zaproxy.zap.extension.ApiGenerator
  1. Run zap-extensions-beta/src/org.zaproxy.zap.extension.ApiGenerator
  1. Run zap-extensions-alpha/src/org.zaproxy.zap.extension.ApiGenerator
    * Yes we should have build targets for these but I havnt had time to get them to work yet ;)
  1. If new files are added reference them from
    * zaproxy/src/org/zaproxy/clientapi/core/clientApi.java
    * zaproxy/nodejs/api/zapv2/index.js
    * zaproxy/php/api/zapv2/src/Zap/Zapv2.php
    * zaproxy/python/api/src/zapv2/init.py
  1. Check in any changes under
    * zaproxy/src/org/zaproxy/clientapi/
    * zaproxy/nodejs/api/zapv2/
    * zaproxy/php/api/zapv2/src/Zap/
    * zaproxy/python/api/src/zapv2/
  1. TODO - packaging the APIs