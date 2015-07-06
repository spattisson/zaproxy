# API Implementation

In order to add functionality to the API you need to:

  * Have at least one class that extends [org.parosproxy.paros.extension.Extension.java](https://github.com/zaproxy/zaproxy/blob/develop/src/org/parosproxy/paros/extension/Extension.java)
  * Add a class that extends [org.zaproxy.zap.extension.api.ApiImplementor.java](https://github.com/zaproxy/zaproxy/blob/develop/src/org/zaproxy/zap/extension/api/ApiImplementor.java)
  * Call [API](https://github.com/zaproxy/zaproxy/blob/develop/src/org/zaproxy/zap/extension/api/API.java).getInstance().registerApiImplementor(api); from your Extension.hook([ExtensionHook](https://github.com/zaproxy/zaproxy/blob/develop/src/org/parosproxy/paros/extension/ExtensionHook.java) extensionHook) method.
  * If your have implemented some option parameters you may want to add them to your API using the [ApiImplementor](https://github.com/zaproxy/zaproxy/blob/develop/src/org/zaproxy/zap/extension/api/ApiImplementor.java).addApiOptions([AbstractParam](https://github.com/zaproxy/zaproxy/blob/develop/src/org/parosproxy/paros/common/AbstractParam.java) param) method - this uses reflection to add standard parameters to the API.


Links:
  * Back: [Python client API](ApiPython)
  * Home: [The ZAP API](ApiDetails)