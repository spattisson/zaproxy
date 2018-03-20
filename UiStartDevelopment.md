# GUI Programming
## Introduction
**_SwingExplorer does not available from their developers. This project was originally hosted in [Google Code Archive](https://code.google.com/archive/p/swing-explorer/source/default/source). Please check the [issue](https://github.com/robotframework/SwingLibrary/issues/72) before you use it._**

Getting started with GUI programming is hard. A graphical tool, that lets you inspect the internal structure can help to understand how a user interface is composed. SwingExplorer  can be used for such purpose.

<img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/swing-explorer_application.png' width='800' />


## Setup Run Configuration for `SwingExplorer`

  1. First, setup your desired branch of ZAP in eclipse, as described under [Building](Building). In this setup I did it for the websockets branch.
  1. Download `swexpl.jar` and `swag.jar` from SwingExplorer. You have to provide your name and your e-mail address. However, the software is freeware.
  1. Place the `jar`-files into your eclipse project under a new folder named `swingexplorer`.
  1. In eclipse go to `Menu > Run > Run Configurations`:
    1. right click onto _Java Application_ and select _New_
    1. select your ZAP project if it is not already selected
    1. as _Main Class_ enter
```
org.swingexplorer.Launcher
```
    1. in the `Arguments` tab enter:
      * as _Program Argument_
```
org.zaproxy.zap.ZAP
```
      * as _VM Arguments_
```
-javaagent:../swingexplorer/swag.jar
-Xbootclasspath/a:../swingexplorer/swag.jar
-Dswex.mport=63812
-Dcom.sun.management.jmxremote
```
      * as _Working directory_ select _Custom_ and enter (as you've done with the run configuration for ZAP)
```
${workspace_loc:zaproxy-websockets/bin}
```
    1. in the _Classpath_ tab select _User Entries_ and press the _Add JARs_ button: select the `swexpl.jar` from your `swingexplorer` directory
    1. Finally _Apply_ the settings and _Run_ your new configuration

More Screenshots to aid aboves description:

<img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/swing-explorer_main.png' width='600' />

<img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/swing-explorer_arguments.png' width='600' />

<img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/swing-explorer_classpath.png' width='600' />


Links:
  * Home: [Internal Details](InternalDetails)
  * Next: [Script Examples](InternalScripting)