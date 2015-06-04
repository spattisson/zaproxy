# API URL format
The API URLs are of the form:

`http://zap/<format>/<component>/<operation>/<operation name>[/?<parameters>]`

The format can currently be 'JSON', 'XML' or 'HTML' - choose whichever you can consume more easily

The operation can be 'view' or 'action'

The components, operation names and parameters can all be discovered by browsing the API.


So you should now be able to use the API directly based on the information you can get from the API UI.

Remember it is only accessible when you are proxying via ZAP.

The API currently only supports HTTP GET operations rather than POSTs

Links:
  * Back: [Actions](ApiDetailsActions)
  * Home: [The ZAP API](ApiDetails)
  * Next: [A Simple Scan](ApiDetailsSimpleScan)