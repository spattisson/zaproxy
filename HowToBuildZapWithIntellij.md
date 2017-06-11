HOW-TO Build OWASP ZAP with Intellij

# Introduction

This is a guide for developing, running and building OWASP ZAP with IntelliJ.

This guide uses IntelliJ 2017.1.4 Ultimate Edition, and was done on a system running macOS Sierra 10.12.5 with Java 1.8 Update 131.

The version of the ZAP source used here is [bc1167f](https://github.com/zaproxy/zaproxy/commit/bc1167f248a66dc29b94576d82d44106cb691cf6).

# Steps

## 1.

Pull down the source from [here](https://github.com/zaproxy/zaproxy/).

## 2.

Open IntelliJ and from the welcome screen select **Import Project**, then select the folder containing the ZAP source code.

  1. Select "Create project from existing sources".
  1. Rename the project if you want to.
  1. Add all the source files that were found.
  1. Add all the libraries that were found.
  1. Include all the modules that were found.
  1. Use JDK 1.8 as the project SDK.
  1. Use the web framework if you're prompted for it.

Now the project should load and you can browse the code.

## 3.

Add a run/debug configuration for the application. org.zaproxy.zap.ZAP in ZAP.java contains the main() method.

Then you should be good to go to run the app! You should see the app coming up when running the ZAP configuration.

## 4.

To build the project, go to **Build** -> **Build Project**, if it complains on some dependencies, download them.