# Extension Hooks

ZAP provides a range of mechanisms for extending its functionality.

One of the main ones is provides by the [ExtensionHook](http://code.google.com/p/zaproxy/source/browse/trunk/src/org/parosproxy/paros/extension/ExtensionHook.java) class.

This class allows you to hook your own classes into ZAP using a set of standard interfaces.

To use these you will need to implement the [Extension](http://code.google.com/p/zaproxy/source/browse/trunk/src/org/parosproxy/paros/extension/Extension.java) interface (typically by extending the abstract [ExtensionAdaptor](http://code.google.com/p/zaproxy/source/browse/trunk/src/org/parosproxy/paros/extension/ExtensionAdaptor.java)).

You can then hook any class that implements the interfaces below by adding calls to the relevant [ExtensionHook](http://code.google.com/p/zaproxy/source/browse/trunk/src/org/parosproxy/paros/extension/ExtensionHook.java) methods in the 'hook' method, for example (from [ExtensionAlert](http://code.google.com/p/zaproxy/source/browse/trunk/src/org/zaproxy/zap/extension/alert/ExtensionAlert.java#94)):

```
    @Override
    public void hook(ExtensionHook extensionHook) {
        super.hook(extensionHook);
        if (getView() != null) {
            extensionHook.getHookMenu().addPopupMenuItem(getPopupMenuAlertEdit());
            extensionHook.getHookMenu().addPopupMenuItem(getPopupMenuAlertDelete());
            extensionHook.getHookMenu().addPopupMenuItem(getPopupMenuAlertsRefresh());
            extensionHook.getHookMenu().addPopupMenuItem(getPopupMenuShowAlerts());

            extensionHook.getHookView().addStatusPanel(getAlertPanel());

            ExtensionHelp.enableHelpKey(getAlertPanel(), "ui.tabs.alerts");
        }
        extensionHook.addSessionListener(this);
```

The interfaces supported include:
| **Interface** | **Summary** |
|:--------------|:------------|
| [ProxyListener](ProxyListener) | Allows you to view and change all requests and responses |
| `OptionsChangedListener` | Called when options are changed|
| `SessionChangedListener` | Called when significant changes are made to the session |
| `AbstractParam` | Allows you to hook into the mechanism for persisting parameters |
| `SiteMapListener` | Called when nodes are selected in the Sites tree |
| `PersistentConnectionListener` | Called when persistent connection handshakes occur |
| `AddonFilesChangedListener` | Called when Add-on files are added or removed |

This class is also the mechanism for adding graphical elements to the UI - more details to come.