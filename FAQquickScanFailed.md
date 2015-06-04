# Why has the Quick Scan Attack reported an invalid URL?

If the Quick Start Attack fails with the message:
```
Failed to attack the URL, please check that the URL is valid
```
then the first thing to do is check your URL in a browser.

If it works ok then open the ZAP [Manual Request Editor](https://code.google.com/p/zaproxy/wiki/HelpUiDialogsMan_req), replace the default URL with the one you are trying and send the request.

The response may well explain the problem.

Browsers will try variations of a URL that ZAP will not attempt, and we have also seen sites blocking ZAP scans based on the request signature.

In the latter case scanning the sites using a proxied request rather than using the Quick Start Attack button was successful.


---

[Back to the FAQ](FAQtoplevel)