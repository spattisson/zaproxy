# [FAQ:](FAQtoplevel) Why does ZAP 2.0.0 fail with "Unsupported major.minor version 51.0"

ZAP 2.0.0 required Java 7 - using Java 6 results in the above message.

So you will need to install Java 7.

On Linux this can be done from the command line using:
```
sudo add-apt-repository ppa:webupd8team/java
sudo apt-get update
sudo apt-get install oracle-java7-installer
```

Issue 484 (on Google Code) has been raised to get zap.sh to check the java version.

---

[Back to the FAQ](FAQtoplevel)