# Modes and Scope

In the next major version of ZAP (possibly to be 2.0.0) there will be support for 2 new concepts, as illustrated in this screenshot:

![](https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/mode-scope.PNG)

## Modes
_Updated information about modes (including ATTACK) can be found [here](https://github.com/zaproxy/zap-core-help/wiki/HelpStartConceptsModes)._

The ZAP UI will have a 'mode' which initially can be one of:
  * Safe - no potentially dangerous operations permitted
  * Protected - user can only perform (potentially) dangerous actions on URLs in the Scope (see below)
  * Standard - as now, user can do anything
The mode can be changed via the toolbar (as in the screenshot) and is persisted between sessions.

It does not (currently) apply to the API.

Examples of the things that will not be possible in either Safe mode or in Protected mode when not acting on URLs in the Scope:
  * Spidering
  * Active Scanning
  * Fuzzing
  * Brute Forcing
  * Breaking (intercepting)
  * Resending requests

## Scope
The 'Scope' is the set of URLs which the user is testing, and is defined by the user using 'include' and 'exclude' regexs. There are also 'right-click' options to easily add/remove subtrees from the scope.

URLs in the Scope are shown with a 'target' on their icon, as shown in the screenshot.

The Scope is used when in 'Protected mode' (see above) and can also apply to things like the Search tab.

## Implementation notes
If you are making changes or writing ZAP extensions that allow the user to do 'potentially dangerous' things, then you need to handle these concepts.

If you use right-click menu items which extend the following classes (which is recommended) then most of the functionality is already handled for you:
  * [org.zaproxy.zap.view.PopupMenuHistoryReference](https://github.com/zaproxy/zaproxy/blob/develop/src/org/zaproxy/zap/view/PopupMenuHistoryReference.java)
  * [org.zaproxy.zap.view.PopupMenuHttpMessage](https://github.com/zaproxy/zaproxy/blob/develop/src/org/zaproxy/zap/view/PopupMenuHttpMessage.java)
  * [org.zaproxy.zap.view.PopupMenuSiteNode](https://github.com/zaproxy/zaproxy/blob/develop/src/org/zaproxy/zap/view/PopupMenuSiteNode.java)
For any right-click menu item you can override the `isSafe()` method to return `true` if your menu item is safe to be run in any mode (e.g. it just displays information).

If you need to know the current mode then you can access it via:
```
org.parosproxy.paros.control.Control.getSingleton().getMode()
```

If you need to know if and when the user changes mode then you will need to extend [org.parosproxy.paros.extension.SessionChangedListener](https://github.com/zaproxy/zaproxy/blob/develop/src/org/parosproxy/paros/extension/SessionChangedListener.java) and put the relevant code in your implementation of the method:
```
public void sessionModeChanged(Mode mode) {
}
```