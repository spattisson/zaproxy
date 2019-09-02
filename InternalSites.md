# The Sites Tree

The Sites tree is part of the ZAP core, and so is always accessible.

## Accessing the Sites tree
### Javascript example
```
node = org.parosproxy.paros.model.Model.getSingleton().
	getSession().getSiteTree().findNode(new org.apache.commons.httpclient.URI("http://localhost/", true));

if (node) {
	org.parosproxy.paros.view.View.getSingleton().getOutputPanel().append(
		"Node = " + node.getNodeName() + " childCount = " + node.getChildCount() + "\n");
	// List any child nodes
	for (i=0;i<node.getChildCount();i++) {
		org.parosproxy.paros.view.View.getSingleton().getOutputPanel().append(
			"\tChild = " + node.getChildAt(i).getNodeName() + "\n");
	}
}
```

Full details:
  * [Latest source code](https://github.com/zaproxy/zaproxy/blob/develop/src/org/parosproxy/paros/model/SiteMap.java)
  * [JavaDoc](JavaDocs)

Links:
  * Back: [Dialog Windows](InternalDialogs)
  * Home: [Internal Details](InternalDetails)
  * Next: [The History Extension](InternalHistory)