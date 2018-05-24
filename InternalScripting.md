# Script Examples
The ScriptConsole supports any language that conforms to [JSR 223](http://www.jcp.org/en/jsr/detail?id=223).

This page shows some simple example of creating a popup window in a selection of the supported languages.

You can cut-and-paste these directly into the console (as standalone scripts):
### ECMAScript / JavaScript (built in, Rhino engine)
```
importPackage(org.parosproxy.paros.view);
View.getSingleton().showMessageDialog("Hello world!");
```
### ECMAScript / JavaScript (built in, Oracle Nashorn engine)
```
Java.type('org.parosproxy.paros.view.View').getSingleton().showMessageDialog('Hello world!');
```
### [Groovy](http://groovy.codehaus.org/)
```
org.parosproxy.paros.view.View.getSingleton().showMessageDialog("Hello world!");
```
### [Jython](http://www.jython.org/)
```
from org.parosproxy.paros.view import View
View.getSingleton().showMessageDialog("Hello world!")
```
### [Jruby](http://jruby.org/)
```
require 'java'
org.parosproxy.paros.view.View.getSingleton().showMessageDialog("Hello world!");
```

Links:
  * Back: [GUI programming](UiStartDevelopment)
  * Home: [Internal Details](InternalDetails)
  * Next: [Dialog Windows](InternalDialogs)
