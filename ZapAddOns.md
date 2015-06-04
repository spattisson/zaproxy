# ZAP Add-ons

ZAP 2.0 supports dynamically loadable add-ons - just click on the 'Manage Add-ons' button.

An add-on can contain:
  * Active scan rules
  * Passive scan rules
  * [Extensions](ZapExtensions)
  * Files

A ZAP add-on is a file with a name of the following format: `<id>-<status>-<version>.zap`
  * `<id>` is a unique identifier which should match the package the add-on is implemented in
  * `<status>` is an indication of how mature the add-on is: alpha, beta or release
  * `<version>` is an integer which increments with each new released version

The ZAP add-on file is a standard jar file, but ideally should include a [ZapAddOn.xml](https://code.google.com/p/zap-extensions/source/browse/trunk/src/org/zaproxy/zap/extension/ZapAddOn.xml) file at the top level - this contains information about the contents of the add-on and allows it to be loaded and unloaded dynamically.

The easiest way to generate a zap file is to use the 'build-addon' target in the relevent build.xml file:
  * [alpha/build/build.xml](https://code.google.com/p/zap-extensions/source/browse/branches/alpha/build/build.xml)
  * [beta/build/build.xml](https://code.google.com/p/zap-extensions/source/browse/branches/beta/build/build.xml)
  * [trunk/build/build.xml](https://code.google.com/p/zap-extensions/source/browse/trunk/build/build.xml)

Try to copy how other add-ons use this target - there should be examples to cover most cases.

For more information about developing add-ons see the [zap-extensions wiki](https://code.google.com/p/zap-extensions/wiki/AddOnDevelopment)