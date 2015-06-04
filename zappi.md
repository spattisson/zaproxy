# ZAPPi : ZAP on a Raspberry Pi

<table>
<tr>
<td>
<a href='https://pbs.twimg.com/media/B54CsrYIEAAdFvn.jpg:large'>https://pbs.twimg.com/media/B54CsrYIEAAdFvn.jpg:small</a>
</td>
<td>
<img src='https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/zap-pi.png' />
</td>
</tr>
</table>

# Set up

Its actually pretty easy to get ZAP running on a Rasberry Pi, although you shouldnt expect the performance to be stellar ;)

I used a Raspberry Pi Model B+ and installed [Raspbian](http://www.raspbian.org/) on it as per the [Raspberry Pi Quick Start Guide](http://www.raspberrypi.org/help/quick-start-guide/).

I then downloaded [ZAP 2.3.1 core](https://code.google.com/p/zaproxy/wiki/Downloads?tm=2#ZAP_2.3.1_Core) (as I only had a 4Gb SD card to hand), expanded it and it ran first time using the zap.sh script as Java 8 is pre-installed.

The full release or the latest weekly release should also work fine.

# Proxying the browser

The default Pi browser (Epiphany) doesnt have any proxy settings, so I set up the proxy on the command line:
```
export http_proxy="http://localhost:8080/"
```
And then restarted the browser from the command line and it proxied via ZAP:
```
epiphany-browser
```

# Importing the ZAP Root CA Certificate

Epiphany also doesnt have the ability to import certificates, so you need to import these into Raspbian:

In ZAP go to "Options / Dynamic CA Certificates", click the "Save" button and save the generated certificate to the default file and location.

From the command line type:
```
sudo cp /home/pi/owasp_zap_root_ca.cer /usr/local/share/ca-certificates

sudo update-ca-certificates
```
When you restart Epiphany you should no longer get any warnings related to the untrusted root certificate.

# External access

By default the Raspberry Pi doesnt have a firewall, so all you need to do to use ZAP on the Pi as a proxy from another machine is to configure ZAP to listen on the Pi's external IP address (or 0.0.0.0) via "Options / Local Proxy" and then configure your external machine to use the IP address and port that ZAP is listening on.

You will need to import the ZAP certificate to transparently access HTTPS connections of course.

# Start up time

It takes just over 3 minutes for ZAP to start in daemon mode and over 4 minutes in full UI mode.

# Page load times

I tested the time taken to load www.google.com via http://tools.pingdom.com/ from a browser on a Linux machine.

| With no proxy | 597 ms |
|:--------------|:-------|
| Using a local ZAP | 668 ms |
| Using ZAP on a Pi | 1.77 seconds |
