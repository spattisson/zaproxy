# Building ZAP

You should be able to use any modern IDE to build ZAP.

Please also have a look at (and add to!) the [Dev Tips and Tricks](DevTipsAndTricks) page.

## Eclipse - Quick Set Up

The quickest way to set up a ZAP development environment is as follows:

1. Ensure you have a recent version of Eclipse - the [Eclipse IDE for Java Developers](https://www.eclipse.org/downloads/packages/eclipse-ide-java-developers/lunasr2) is a good option (_Ensure you have a version of Eclipse 4.2 or later installed or if using an earlier version, the "EGit - Git Team Provider" plug-in installed._)
1. Start Eclipse and select a new (empty) workspace
1. Select the menu: "File / Import"
1. Select "Team / Team Project Set" and click "Next >"
1. Select URL and enter: https://raw.githubusercontent.com/zaproxy/zap-admin/master/ZAP-projectSet.psf
1. Click "Finish" and wait for Eclipse to pull down all of the projects and build them.

## Other IDEs / Manual Set Up

You can also manually import and configure the following projects into your IDE:
* https://github.com/zaproxy/zaproxy.git
  * develop branch
* https://github.com/zaproxy/zap-extensions.git
  * master, beta and alpha branches
* https://github.com/zaproxy/zap-core-help.git
* https://github.com/zaproxy/community-scripts.git

Please update this page with more detailed instructions for other IDEs!

## Intellij

A guide to develop, run and build ZAP with Intellij can be found [here](HowToBuildZapWithIntellij).

Note that this out of date as it refers to ZAP projects on Google Code.

## Other IDEs

If you use another IDE for ZAP development then please let us know so that we can add the details to this page :)

## Ant (No IDE)

If you're looking to build from the terminal using Ant, the `dist` target will build the generic, unpackaged executable.

    ant -f build/build.xml dist

## Contributing Changes

For details see the [Contributing-Changes](Contributing-Changes) page (work in progress).