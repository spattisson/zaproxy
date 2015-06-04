# Sending Messages

## Resending a Message
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
    org.parosproxy.paros.view.View.getSingleton().getOutputPanel().append(
    "Reponse " + hr.getHttpMessage().getResponseHeader().getStatusCode() + "\n")

  msg = hr.getHttpMessage().cloneRequest()

  // Should be zero
  org.parosproxy.paros.view.View.getSingleton().getOutputPanel().append(
    "Reponse " + msg.getResponseHeader().getStatusCode() + "\n")

  httpSender = new org.parosproxy.paros.network.HttpSender(
  org.parosproxy.paros.model.Model.getSingleton().getOptionsParam().getConnectionParam(), true)
  httpSender.sendAndReceive(msg)

  // Will be non zero if the request was sent
  org.parosproxy.paros.view.View.getSingleton().getOutputPanel().append(
    "Reponse " + msg.getResponseHeader().getStatusCode() + "\n")

}
```


Links:
  * Back: [The History Extension](InternalHistory)
  * Home: [Internal Details](InternalDetails)