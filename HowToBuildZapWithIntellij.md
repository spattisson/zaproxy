HOW-TO Build OWASP ZAP with Intellij

# Introduction

This is a guide for developing, running and building OWASP ZAP with Intellij.

This guide uses Intellij 13.0.2 Ultimate edition, and was done on a Macbook Air running OSX 10.9.1.

The version of the ZAP source used here is [r4335](https://code.google.com/p/zaproxy/source/detail?r=4335).

# Steps

## 1.

Pull down the source from [here](https://code.google.com/p/zaproxy/source/checkout).

## 2.

Open Intellij and press **File** -> **Import Project...** and select the folder containing the ZAP source code.

  1. Select "Create project from existing sources".
  1. Rename the project if you want to.
  1. Add all the source files (just press continue).
  1. When prompted for which libraries to include, uncheck the hsqldb library for now. This is because there is already a hsqldb jar in the lib directory, so they clash.
  1. Include all modules.
  1. Use JDK 1.7.
  1. Use the web framework if your prompted for it.

Now the project should load and you can browse the code.

## 3.

When running the project (you might have to set the the run configuration, ZAP.java contains the main method), you might get some issues with the diamond generics, then go into **File** -> **Project Structure** and set the language level to 7.0.

If the STDOUT complains about a missing Apache license, just copy the license from license/ to the correct directory.

Then you should be good to go to run the app! You should see the app coming up when running the ZAP configuration.

## 4.

To build the project, go to **Build** -> **Make Project**, if it complains on some dependencies, download them.