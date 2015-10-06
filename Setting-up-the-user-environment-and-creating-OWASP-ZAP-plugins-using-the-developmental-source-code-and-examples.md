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

