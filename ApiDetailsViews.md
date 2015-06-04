# Accessing a view
If you click on the JSON link (http://zap/JSON/core/view/sites/) for the sites you will see something like this:

```
["http://localhost:8080","http://safebrowsing-cache.google.com","http://safebrowsing.clients.google.com"]
```

While if you click on the XML link (http://zap/XML/core/view/sites/) you will see:

```
<sites>
    <site type="string">http://localhost:8080</site>
    <site type="string">http://safebrowsing-cache.google.com</site>
    <site type="string">http://safebrowsing.clients.google.com</site>
</sites>
```

Its exactly the same information, just in a different format.

Links:
  * Back: [The API UI](ApiDetailsUI)
  * Home: [The ZAP API](ApiDetails)
  * Next: [Invoking Actions](ApiDetailsActions)