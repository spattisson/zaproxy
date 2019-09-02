# The History Extension

## Accessing the History List
### Javascript example
```
extHist = org.parosproxy.paros.control.Control.getSingleton().
    getExtensionLoader().getExtension(
        org.parosproxy.paros.extension.history.ExtensionHistory.NAME) 
if (extHist != null) {
    hList = extHist.getHistoryList();
    i=0
    while (i++ < hList.getSize()-1) {
        hr = hList.get(i)
        if (hr) { 
            org.parosproxy.paros.view.View.getSingleton().getOutputPanel().append(
                "Got " + hr.getHttpMessage().getRequestHeader().getURI() + "\n") 
        }
    }
}
```

### Java example
```
ExtensionHistory extHist = (ExtensionHistory) org.parosproxy.paros.control.Control.getSingleton().
        getExtensionLoader().getExtension(ExtensionHistory.NAME);
if (extHist != null) {
    HistoryList hList = extHist.getHistoryList();
    int i=0;
    while (i++ < hList.getSize()-1) {
        HistoryReference hr = (HistoryReference) hList.get(i);
        if (hr != null) {
            try {
                System.out.println("Got " + hr.getHttpMessage().getRequestHeader().getURI());
            } catch (HttpMalformedHeaderException e) {
            } catch (SQLException e) {
            }
        }
    }
}
```

## Accessing a History Reference by Id
### Javascript example
```
extHist = org.parosproxy.paros.control.Control.getSingleton()
    .getExtensionLoader().getExtension(
        org.parosproxy.paros.extension.history.ExtensionHistory.NAME)

if (extHist) {
   hr = extHist.getHistoryList().getHistoryReference(1)
}

if (hr) {
	org.parosproxy.paros.view.View.getSingleton().getOutputPanel().append(
		"Got " + hr.getHttpMessage().getRequestHeader().getURI() + "\n")
}
```
Full details:
  * [Latest source code](https://github.com/zaproxy/zaproxy/blob/develop/src/org/parosproxy/paros/extension/history/ExtensionHistory.java)
  * [JavaDoc](JavaDocs)

Links:
  * Back: [The Sites tree](InternalSites)
  * Home: [Internal Details](InternalDetails)
  * Next: [Sending Messages](InternalResend)