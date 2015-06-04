# Internationalization

As of release 1.3.0 ZAP is completely internationalized.

You can change language the first time you start ZAP and at any time later via the [Options Display screen](HelpUiDialogsOptionsView).

We are now using [Crowdin](http://crowdin.net/project/owasp-zap) for managing the ZAP translation - so if you'd like to help translate ZAP go to:
  * http://crowdin.net/project/owasp-zap To translate the UI
  * http://crowdin.net/project/owasp-zap-help To translate the help pages

See the [Credits](http://code.google.com/p/zaproxy/wiki/HelpCredits) for details of the translators of the last release. Note that the [credits](http://code.google.com/p/zaproxy/source/browse/trunk/src/help/zaphelp/zaphelp/credits.html) file in svn may include more recent contributors.

If you are able to translate ZAP into any other languages, or have any comments about the existing translations, then just go to [Crowdin](http://crowdin.net/project/owasp-zap) and get stuck in!

Note that the properties files should use the ISO 8859-1 character encoding. Characters that cannot be directly represented in this encoding can be written using Unicode escapes. http://docs.oracle.com/javase/6/docs/api/java/util/Properties.html for more details - there is a native2ascii tool that can be used to generate the Unicode escapes.