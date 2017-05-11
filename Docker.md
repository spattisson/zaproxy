# Introduction
Docker image with Owasp Zed Attack Proxy preinstalled.
# Details
## Install Instructions:
For the stable release:
```bash
docker pull owasp/zap2docker-stable
```
For the latest weekly release:
```bash
docker pull owasp/zap2docker-weekly
```
For the live release (built whenever the [zaproxy](https://github.com/zaproxy/zaproxy) project is changed):
```bash
docker pull owasp/zap2docker-live
```
Dockerfiles can be found [here](https://github.com/zaproxy/zaproxy/tree/develop/build/docker).
## Usage Instructions:
### ZAP GUI in a Browser:
Yes, you can run the ZAP Desktop GUI in a browser. You can use it in just the same way as the Swing UI and can even proxy via it.<br>
See the [WebSwing](WebSwing) wiki page for details.

### ZAP Headless:
You can also start the ZAP in headless mode with following command:
```bash
docker run -u zap -p 8080:8080 -i owasp/zap2docker-stable zap.sh -daemon -host 0.0.0.0 -port 8080
```
### ZAP Headless with xvfb:
You can start the ZAP in headless mode with xvfb following command:

```bash
docker run -u zap -p 8080:8080 -i owasp/zap2docker-stable zap-x.sh -daemon -host 0.0.0.0 -port 8080
```

This first starts xvfb (X virtual frame buffer) which allows add-ons that use Selenium (like the Ajax Spider and DOM XSS scanner) to run in a headless environment. Firefox is also installed so can be used with these add-ons.

### ZAP Baseline Scan:
The [[ZAP Baseline Scan]] runs the ZAP spider against the specified target for (by default) 1 minute and then waits for the passive scanning to complete before reporting the results.

To run it with no 'file' params use:
```
docker run -t owasp/zap2docker-weekly zap-baseline.py -t https://www.example.com
```
If you use 'file' params then you need to mount the directory those file are in or will be generated in, eg
```
docker run -v $(pwd):/zap/wrk/:rw -t owasp/zap2docker-weekly zap-baseline.py \
    -t https://www.example.com -g gen.conf -r testreport.html
```

For more details see the [[ZAP Baseline Scan]] page.
### ZAP CLI:
[ZAP CLI](https://github.com/Grunny/zap-cli) is a ZAP wrapper written in Python. It provides a simple way to do scanning from the command line:

```bash
docker run -i owasp/zap2docker-stable zap-cli quick-scan --self-contained \
    --start-options '-config api.disablekey=true' http://target
```

### ZAPR:
Zapr is ruby script for ZAP which allows commandline active scanning for desired target:

```bash
docker run -u zap -i owasp/zap2docker-stable zapr --debug --summary http://target
```
### Accessing the API from outside of the Docker container:

Docker appears to assign 'random' IP addresses, so an approach that appears to work is:

Run ZAP as a daemon listening on "0.0.0.0":

```bash
docker run -p 8090:8090 -i owasp/zap2docker-stable zap.sh -daemon -port 8090 -host 0.0.0.0
```
Find out the container id:
```bash
docker ps
```
Find out which address has been assigned to it:
```bash
docker inspect <CONTAINER ID> | grep IPAddress
```
You should be then able to point your browser at the specified host/port and access the ZAP API, eg http://172.17.0.8:8090/

Note that on Macs the IP will be the IP of the Docker VM host.  This is accessible with:  
```bash
docker-machine ip <host>
```