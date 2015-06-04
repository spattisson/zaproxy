# API Simple Scan

The API can be used to perform a simple scan of an application in the following way:

## Spider the target

Use the 'spider.scan' action to start spidering the target, passing in the URL you want to start spidering from. You only need to specify an apikey if you have set one up in your ZAP API options.

All scans are asynchronous as they can take a long time, so poll the 'spider.status' view until it returns 100 - this is how far the spider has progressed as a percentage.

## Active scan the target

Use the 'ascan.scan' action to start active scanning the target, passing in the URL you want to start scanning from, and setting recurse=true and inScopeOnly=false. You only need to specify an apikey if you have set one up in your ZAP API options.

Poll the ascan.status view until it returns 100.

## Retrieve the alerts

Use the core.alerts view without any parameters to retrieve all of the alerts.


Links:
  * Back: [The URL format](ApiDetailsUrlFormat)
  * Home: [The ZAP API](ApiDetails)
  * Next: [Java client API](ApiJava)