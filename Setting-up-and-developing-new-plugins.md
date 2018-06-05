# Summary ##
This wiki page discusses the way in which you set up the operating environment for developing plug-ins for OWASP ZAP, download the source code and relevant sub-projects, and develop the relevant plug-ins for inclusion into the OWASP ZAP  repository.  
This wiki draws heavily from the following documents:
* 	[Creating OWASP ZAP Extensions and Add-ons by Johanna Curiel.](https://www.owasp.org/images/3/37/GuidelineZAPExtensionsAddOns1.0.pdf)
* 	[Building OWASP ZAP Using Eclipse IDE for Java… Pen-Testers by Raul Siles.](http://www.taddong.com/docs/Building_ZAP_with_Eclipse_v3.0.pdf)

It will draw extensively from these documents as well as my experience in building the source for both the plug-ins as well as the baseline program.  Options will also be discussed as to what compilers can be used as well as different ways in which the code can be developed and tested.

# 1.	Compiler Decisions, and Setting up the Development Environment ###
## A.	Introduction
In this section we will be discussing the compiler options, some of the ramifications, and how to set up the development environment.  As of the writing of this document OWASP - ZAP is in flux having transitioned from the Google Code Repository to GitHub.  This changes how the development environment access the repository and changes how reviews are setup and requested.  The choices to be made as to compiler/runtime environment include both the Java 1.7.*** series and the Java 1.8.*** series of compiler.  The development environment will be the Eclipse Integrated Development Environment (IDE) with the plug in required to interface  a GIT storage facility.

All of these choices have pluses and minuses that will be discussed and will affect how you may have to modify your system in the future to accommodate changes that have been set into motion.  We will assume a Microsoft Windows operating system but much of the information will hold true for any of the major operating systems.  
The original guide detailing how to build ZAP is available from the OWASP ZAP project Wiki: https://github.com/zaproxy/zaproxy/wiki/Building. An older guide is available in PDF format for easy download, distribution, and use at Taddong’s Lab. http://www.taddong.com/en/lab.html.

## B.	Compiler Choices
For MS Windows, there is only one major source for a robust java compiler, that is the SUN/ORACLE complier available at java.sun.com.  For this development you will need the Java SE Java Developers Kit (JDK).  It comes in 2 versions, Java 1.7 and Java 1.8.  Both will work for this project, with Java 1.8 causing some minor issues at this time.  Java 1.7 actually comes in two sub distributions.  The PSU and the CPU variants.

Java SE Critical Patch Updates (CPU) contain fixes to security vulnerabilities and critical bug fixes. Oracle strongly recommends that all Java SE users upgrade to the latest CPU releases as they are made available. Java SE CPU releases are odd numbered versions 

Java SE Patch Set Updates (PSU) contain all of fixes in the corresponding CPU, as well as additional non-critical fixes. Java PSU releases should only be used if you are being impacted by one of the additional bugs fixed in that version.

As I have noted both versions work.  The developers of OWASP-ZAP recommend Java 1.7 and this would normally drive the compiler choice, however Java 1.7 has had its end of life announced per oracle (http://www.oracle.com/technetwork/java/eol-135779.html), and may not be available in the long term.  As outlined in the Oracle JDK Support Roadmap, after April 2015, Oracle will not post further updates of Java SE 7 to its public download sites.  This indicates that it may very well be better to install 1.8 and deal with any glitches that come along.

Whichever you decide is right for your situation download and install the Java Development Kit (JDK) following the default Windows installation from http://www.oracle.com/technetwork/java/javase/downloads/ using either the 32 bit or 64 bit version.  There are potential issues right now with the 64 bit version.  One of these issues includes the use of smart card authentication with ZAP.  As of the writing of this document, the 64 bit version of JAVA does not support this authentication under ZAP.

For the Linux operating system, you do have more choices as to the JDK which you use.  For those who do use Linux, you can also use the Open JDK java compiler.  This is available at http://openjdk.java.net/ for most java distributions.  

## C.	Setting up ECLIPSE and Additional Software ###
Setting up eclipse is by its self  relatively easy.  It can be downloaded from, http://www.eclipse.org/downloads/.  Chose the latest Eclipse version, as opposed to what earlier versions of the how to guide talk about.  This is because it contains several security patches and the EGIT code that will be needed for the releases housed at GitHub.  In addition, if you are using Microsoft Windows, you will need the GitHub software package.  More to be discussed on this in later sections.

One issue with Eclipse is that it needs to match the "bittedness" of Eclipse and the JVM/JDK.  This occurs mainly under Microsoft Windows.  64-bit Eclipse requires a 64-bit JVM, and 32-bit Eclipse requires 32-bit JVM--you can not mix-and-match between 32-bit and 64-bit, so make sure the version of Eclipse you installed matches the JVM/JDK that you're using to run it.  If you've "installed" Eclipse but are having trouble getting it to run, the next most likely cause is that you have not correctly specified the JVM for it to run under. Doing so is easy, just read http://wiki.eclipse.org/Eclipse.ini.  More details are available at https://www.eclipse.org/forums/index.php/t/198527/


Next you will need to extract the entire Eclipse project into the directory which you want to house it.  This is because eclipse is a standalone executable and does not perform the standard registry installation.  Eclipse likes to house the work files in the directory, under windows, `C:\user\<username>\workspace\<project name>`  this may be inconvenient, however the default space will probably give you the least difficulty.

### Setting up to Get the Main Project ####
This section borrows heavily from the main project setup site, https://github.com/zaproxy/zaproxy/wiki/Building, however I will attempt to add some tips to make things go a little smoother, especially if you want to contribute to the distribution.  From the web site:

1. Ensure you have a recent version of Eclipse - the Eclipse IDE for Java Developers is a good option
2. Start Eclipse and select a new (empty) workspace
3. Select the menu: "File / Import"
4. Select "Team / Team Project Set" and click "Next >"
5. Select URL and enter: https://raw.githubusercontent.com/zaproxy/zap-admin/master/ZAP-projectSet.psf 
6. Click "Finish" and wait for Eclipse to pull down all of the projects and build them.

This will pull down the main development project and all of the zap-extension projects, as well as the community scripts.  It will take quite some time depending upon your bandwidth. Next under Eclipse locate Window tab.  Under this menu select Windows->Preferences->Workspace.  Set the New text file line delimiter to Other/Unix.  This will greatly aid you in contributing files as all of the files stored on GitHub are in Unix format.

If you are not planning on contributing to the OWASP/ZAP repository and you don't want to write your own plug-ins you will probably not need the next steps. 

### Setting up the GitHub Software ####
If you are using a Linux operating system, you will probably have the Git command line interface already installed but it behooves you to check.  This is accomplished by opening a terminal window and typing `git --help`.  This should give you a scrolled list of git subcommands you can use.  This also lets you know git is installed.  For the Macintosh operating system or the PC you will need to get and install the git command line interface.  Particularly for the PC this is important.  The reason that you need the command line interface comes down to 2 basic reasons:

1.  Most of the help and examples available and the advice you will get from the ZAP team will be command line.  This makes it much easier to use their advice.
2.  There are "features" in egit (ECLIPSE GIT) that make it more difficult to perform certain software commit styles that the reviewers like and require for submission into the repository or functions cannot be performed in egit.

The first step, is of course to get an account at http://www.github.com.  You will need this for later steps to upload software to the repository.  Next you will need to setup GitHub Desktop.  This is accomplished by:

**1.**  Download and install the latest version of [GitHub Desktop](https://desktop.github.com/). This will automatically install Git and keep it up-to-date for you.
**2.**  On your computer, open the Git Shell application.
**3.** Tell Git your name so your commits will be properly labeled. Type everything after the $ here:

**_$ git config --global user.name "YOUR NAME"_**

**4.**  Tell Git the email address that will be associated with your Git commits. The email you specify should be the same one found in your email settings. To keep your email address hidden, see "Keeping your email address private".

**_$ git config --global user.email "YOUR EMAIL ADDRESS"_**

Further instructions can be found at the site the [GitHub Site](https://help.github.com/articles/set-up-git/).
