# Summary ##
This wiki page discusses the way in which you set up the operating environment for developing plug-ins for OWASP ZAP, download the source code and relevant sub-projects, and develop the relevant plug-ins for inclusion into the OWASP ZAP  repository.  
This wiki draws heavily from the following documents:
* 	Creating OWASP ZAP Extensions and Add-ons by Johanna Curiel.
* 	Building OWASP ZAP Using Eclipse IDE for Java… Pen-Testers by Raul Siles.

It will draw extensively from these documents as well as my experience in building the source for both the plug-ins as well as the baseline program.  Options will also be discussed as to what compilers can be used as well as different ways in which the code can be developed and tested.

# 1.	Compiler Decisions, and Setting up the Development Environment ###
## A.	Introduction:	
In this section we will be discussing the compiler options, some of the ramifications, and how to set up the development environment.  As of the writing of this document OWASP - ZAP is in flux having transitioned from the Google Code Repository to GitHub.  This changes how the development environment access the repository and changes how reviews are setup and requested.  The choices to be made as to compiler/runtime environment include both the Java 1.7.*** series and the Java 1.8.*** series of compiler.  The development environment will be the Eclipse Integrated Development Environment (IDE) with the plug in required to interface  a GIT storage facility.

All of these choices have pluses and minuses that will be discussed and will affect how you may have to modify your system in the future to accommodate changes that have been set into motion.  We will assume a Microsoft Windows operating system but much of the information will hold true for any of the major operating systems.  
The original guide detailing how to build ZAP is available from the OWASP ZAP project Wiki: http://code.google.com/p/zaproxy/wiki/Building. An older guide is available in PDF format for easy download, distribution, and use at Taddong’s Lab. http://www.taddong.com/en/lab.html.

##B.	Compiler Choices ###
For MS Windows, there is only one major source for a robust java compiler, that is the SUN/ORACLE complier available at java.sun.com.  For this development you will need the Java SE Java Developers Kit (JDK).  It comes in 2 versions, Java 1.7 and Java 1.8.  Both will work for this project, with Java 1.8 causing some minor issues at this time.  Java 1.7 actually comes in two sub distributions.  The PSU and the CPU variants.

Java SE Critical Patch Updates (CPU) contain fixes to security vulnerabilities and critical bug fixes. Oracle strongly recommends that all Java SE users upgrade to the latest CPU releases as they are made available. Java SE CPU releases are odd numbered versions 

Java SE Patch Set Updates (PSU) contain all of fixes in the corresponding CPU, as well as additional non-critical fixes. Java PSU releases should only be used if you are being impacted by one of the additional bugs fixed in that version.

As I have noted both versions work.  The developers of OWASP-ZAP recommend Java 1.7 and this would normally drive the compiler choice, however Java 1.7 has had its end of life announced per oracle (http://www.oracle.com/technetwork/java/eol-135779.html), and may not be available in the long term.  As outlined in the Oracle JDK Support Roadmap, after April 2015, Oracle will not post further updates of Java SE 7 to its public download sites.  This indicates that it may very well be better to install 1.8 and deal with any glitches that come along.

Whichever you decide is right for your situation download and install the Java Development Kit (JDK) following the default Windows installation from http://www.oracle.com/technetwork/java/javase/downloads/ using either the 32 bit or 64 bit version.  There are potential issues right now with the 64 bit version.  One of these issues includes the use of smart card authentication with ZAP.  As of the writing of this document, the 64 bit version of JAVA does not support this authentication under ZAP.

For the Linux operating system, you do have more choices as to the JDK which you use.  For those who do use Linux, you can also use the Open JDK java compiler.  This is available at http://openjdk.java.net/ for most java distributions.  

## C.	Setting up ECLIPSE ###
Setting up eclipse is by its self  relatively easy.  It can be downloaded from, http://www.eclipse.org/downloads/.  Chose the latest Eclipse version, as opposed to what earlier versions of the how to guide talk about.  This is because it contains several security patches and the EGIT code that will be needed for the releases housed at GitHub.

Next you will need to extract the entire Eclipse project into the directory which you want to house it.  This is because eclipse is a standalone executable and does not perform the standard registry installation.  Eclipse likes to house the work files in the directory, under windows, C:\user\<username>\workspace\<project name>  this may be inconvenient, however the default space will probably give you the least difficulty.

### Setting up to get the main project ####
