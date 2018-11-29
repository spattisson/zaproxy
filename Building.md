# Building ZAP

You should be able to use any modern IDE to build ZAP.

Please also have a look at (and add to!) the [Dev Tips and Tricks](DevTipsAndTricks) page.

## IDEs / Manual Set Up

You will need to manually import and configure the following projects into your IDE:
* https://github.com/zaproxy/zaproxy.git
  * develop branch
* https://github.com/zaproxy/zap-extensions.git
  * master, beta and alpha branches
* https://github.com/zaproxy/zap-core-help.git
* https://github.com/zaproxy/community-scripts.git

Please update this page with more detailed instructions for other IDEs!

## Eclipse - Quick Set Up

Most of the ZAP Core Team use Eclipse, just make sure you use a recent version.

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