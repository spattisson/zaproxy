# Authoring help files

This page describes the steps how to write, edit and compile the help files.

The ZAP built-in help system is based on [JavaHelp](http://javahelp.java.net/).

The sources are located in the folder [trunk/zaproxy/src/help](http://code.google.com/p/zaproxy/source/browse/trunk/#trunk%2Fsrc%2Fhelp).
The directory `zaphelp` is for the default locale ("en\_GB"). The translations are in its own directories whose name is composed with
the string `zaphelp` suffixed with the locale of the translated language: `zaphelp_ar_SA`, `zaphelp_bs_BA`, `zaphelp_da_DK`...

The ZAP [build.xml](http://code.google.com/p/zaproxy/source/browse/trunk/build/build.xml) file has a `generate-help-jars` target
which should be used to create the help jars of the available languages.
The generated jars have the same name as the source directory: `zaphelp.jar`, `zaphelp_ar_SA.jar`, `zaphelp_bs_BA.jar`, `zaphelp_da_DK.jar`...

The help files are also available online, and the src folder for these is [here](http://code.google.com/p/zaproxy/source/browse/#svn%2Fwiki)

These should typically **NOT** be changed manually as they are generated from the javahelp files using the target `generate-wiki`
for each new release.<br>The target generates the TOC for the help files (<code>TableOfContents-CoreUserGuide</code>) which must be manually copied to the file<br>
<a href='http://code.google.com/p/zaproxy/source/browse/wiki/TableOfContents.wiki'>TableOfContents.wiki</a> replacing the existing help TOC tree.<br>
<br>The generated TOC file should not be committed.<br>
<br>
The help files of the add-ons available online are generated with its own targets located in the build.xml files of the<br>
zap-extensions' trunk and alpha/beta branches.