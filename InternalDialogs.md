# Dialog Windows

## To display a popup message:
### Javascript example
```
org.parosproxy.paros.view.View.getSingleton().showMessageDialog("Hi!");
```
## To show a warning dialog:
### Javascript example
```
org.parosproxy.paros.view.View.getSingleton().showWarningDialog("Oh no!");
```
## To write to the Output tab
### Javascript example
```
org.parosproxy.paros.view.View.getSingleton().getOutputPanel().append("Testing 1 2 3\n");
```
Links:
  * Back: [Getting started](InternalStart)
  * Home: [Internal Details](InternalDetails)
  * Next: [The Sites tree](InternalSites)