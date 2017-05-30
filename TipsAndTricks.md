# Tips and Tricks

Its clear from some of the questions we get that there are lots of little features that many people are unaware of.

This page documents some of them - feel free to suggest more!

| **Summary** | **Detail** |
|:------------|:-----------|
| Context sensitive help | The F1 key will open the ZAP help file at the page relevant for the tab that has focus|
| CSRF test form | You can use the ZAP API to generate a form for testing CSRF vulnerabilities. The API must be enabled, then you can right click a POST request and select "Generate anti CSRF test FORM" |
| Docker support | https://github.com/zaproxy/zaproxy/wiki/Docker |
| Edit in hex | You can edit requests and responses in the Hex view - just double click the relevant hex or character cell (for those requests and responses that are generally editable)|
| Manual browse indicator | Pages found by the spiders and forced browser are flagged in the Sites tree with the relevant icon. This icon disappears when you visit that page manually |
| Show hidden fields | Click the 'lightbulb' icon in the top level menu bar to see hidden fields and enable disabled fields in your browser for new requests (you'll need to refresh any pages already loaded) |
| User and Developer Group links | There are links to the online ZAP groups under the 'Online' menu |

Please add new tips in alphabetical order ;)