# ProxyListener

The [ProxyListener](http://code.google.com/p/zaproxy/source/browse/trunk/src/org/parosproxy/paros/core/proxy/ProxyListener.java) class is one of the ExtensionHooks that allows you to view and change all requests and responses.

To use it you will need to create a class that implements it and then hook it in by overriding the [Extension](http://code.google.com/p/zaproxy/source/browse/trunk/src/org/parosproxy/paros/extension/Extension.java) 'hook' method, eg:
```
	@Override
	public void hook(ExtensionHook extensionHook) {
	    extensionHook.addProxyListener(getMyProxyListener());
	}
```

See the [ProxyListener](http://code.google.com/p/zaproxy/source/browse/trunk/src/org/parosproxy/paros/core/proxy/ProxyListener.java) source code for details of the methods it supports.