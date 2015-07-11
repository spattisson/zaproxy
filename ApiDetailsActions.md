# Invoking an action
Actions invoke ZAP functionality and can optionally take parameters - those are shown in brackets after the action name.

The shutdown () action doesnt take any parameters, and stops ZAP - thats the only way to shutdown ZAP when running in daemon mode.

You can go back to the 'top level' of the API by clicking on the 'ZAP API UI' link at the top. If you do that and then select the spider you should see:

![](https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/API-spider.PNG)

Click on the scan link and then supply a URL that ZAP knows about - those can be found via the 'urls' view in the core component.

So if you supply `http://localhost:8080/bodgeit/` you will then be redirected to a URL like:

`http://zap/XML/spider/action/scan/?url=http%3A%2F%2Flocalhost%3A8080%2Fbodgeit%2F`

If ZAP knows about the URL you should see:
```
<result>
    <e type="string">OK</e>
</result>
```

This means that the Spider has been successfully started - in fact if you have the ZAP UI open you'll see the Spider running!

The Spider (and Active Scanner) are asynchronous, as they could take a significant length of time.

To see how they are doing follow one of the Spider 'status' links, eg

`http://zap/JSON/spider/view/status/`

Which will return something like:
```
["38"]
```

This is the percentage of the scan the Spider has completed. When it gets to 100 it will have completed.

Links:
  * Back: [Accessing views](ApiDetailsViews)
  * Home: [The ZAP API](ApiDetails)
  * Next: [The URL format](ApiDetailsUrlFormat)