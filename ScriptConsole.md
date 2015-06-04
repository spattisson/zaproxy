# The Script Console
The ZAP Scripting Console is a plugable extension that can be added to the latest version of ZAP.

It allows you to access internal ZAP data structures dynamically using any scripting language that supports [JSR 223](http://www.jcp.org/en/jsr/detail?id=223), including

  * ECMAScript / Javascript (built in)
  * Groovy http://groovy.codehaus.org/
  * Python http://www.jython.org
  * Ruby - http://jruby.org/
  * and many more...

In order to install the Script Console

  1. Download the extension jar from the [zap-extensions](http://code.google.com/p/zap-extensions/) project
  1. Move the jar into the 'plugins' directory where ZAP is installed
  1. Restart ZAP

Note that only ECMAScript (Javascript) support is built in - for other languages you will need to download the relevant jar(s), copy them into the 'lib' directory and restart ZAP.

You will now have access to the Script Console as seen here (click for the full size image):
![![](https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/zap-scriptconsole-sm.jpg)](https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/zap-scriptconsole.png)

For some examples on what you can do in the console please see: InternalDetails.

And for full details of all of the classes see the JavaDocs or (of course) the [source code](http://code.google.com/p/zaproxy/source/browse/).

Any problems, get in touch via the [developer-group](http://groups.google.com/group/zaproxy-develop).

You may find it difficult to get access to some of the ZAP data structures as some of it is not as accessible as it should be.
If so then please [let us know](http://groups.google.com/group/zaproxy-develop) - we are committed to exposing anything that could be useful.

Please [tell us](http://groups.google.com/group/zaproxy-develop) if you develop any useful scripts and we'll publish them (with full credit of course).

But be aware that scripts run with the same permissions as ZAP, so do not run any scripts that you do not trust!