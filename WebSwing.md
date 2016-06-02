Starting with version 2.5.0 you can run the ZAP Desktop UI in your browser without having to install Java, thanks to the magic of [Docker](https://www.docker.com/) and [WebSwing](http://webswing.org)

To do this you will just need Docker installed. From your command line type:

`docker run -u zap -p 8080:8080 -p 8090:8090 -i owasp/zap2docker-stable zap-webswing.sh`

Then point your browser at [http://localhost:8080/?anonym=true&app=ZAP](http://localhost:8080/?anonym=true&app=ZAP)

You will then see the familiar ZAP splash screen while ZAP starts up.

![](https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/ZAP-webswing.png)

The ZAP UI acts in just the same way as it does when running 'natively'.

The performance is surprisingly good, although a little bit slower. You can still move and resize the windows and some (but not all) of the keyboard shortcuts will work.

You can even proxy your browser through ZAP, via the URL [http://localhost:8090](http://localhost:8090)

Note that you will need to visit [http://localhost:8080/?anonym=true&app=ZAP](http://localhost:8080/?anonym=true&app=ZAP) _before_ you can use ZAP as a proxy - ZAP will only start to run when you visit that URL.