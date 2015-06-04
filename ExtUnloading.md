# Unloading extensions

By default extensions cannot be unloaded (and therefore updated) dynamically.

You can change this by overloading the `canUnload` method (which tells ZAP the extension supports dynamic unloading):
```
	@Override
	public boolean canUnload() {
		return true;
	}
```
and the `unload` method, which actually does the unloading:
```
	public void unload() {
		Control.getSingleton().getExtensionLoader().removeExtension(this, hook);
	}
```
The `unload` method undo's all actions performed on the _`ExtensionHook`_ object in the _`hook(ExtensionHook extensionHook)`_ method, i.e. it unregisters all listeners, removes user interface panels and menu items.

If you performed other initialization steps too, override this method, call the parent method first and then do your clean-up.