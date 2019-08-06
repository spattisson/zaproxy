# ZAP Add-ons

Since version 2.0 ZAP supports dynamically loadable add-ons - just click on the 'Manage Add-ons' button.

An add-on can contain:
  * Active scan rules
  * Passive scan rules
  * [Extensions](ZapExtensions)
  * Files

A ZAP add-on is a file with a name of the following format: `<id>-<status>-<version>.zap`
  * `<id>` is a unique identifier
  * `<status>` is an indication of how mature the add-on is: alpha, beta or release
  * `<version>` is an integer (which increments with each new released version) or Semantic Version

The ZAP add-on file is a standard JAR file that includes a [ZapAddOn.xml](https://github.com/zaproxy/zap-extensions/tree/master/docs/ZapAddOn.xml) file at the top level - this contains information about the contents of the add-on and allows it to be loaded and unloaded dynamically.

The easiest way to build an add-on is to use the [ZAP's Gradle Plugin](https://github.com/zaproxy/gradle-plugin-add-on).

Try to copy how other add-ons use this target - there should be examples to cover most cases.

For more information about developing add-ons see the [zap-extensions wiki](https://github.com/zaproxy/zap-extensions/wiki/AddOnDevelopment)