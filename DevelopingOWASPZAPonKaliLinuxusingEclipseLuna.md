This page documents  how to set up a Kali Linux instance to develop OWASP ZAP, using Eclipse Luna.

Note: while the process documented here technically works, it is not in line with the Git process flow documented here: https://github.com/zaproxy/zaproxy/wiki/HowToBuildZapWithIntellij. That process assumes that you first "Fork" the required projects in Github, before setting up your IDE to point to your forked repo.  Once you've committed your changes back to your forked repo as usual (the changes shoudl be committed as part of a branch), use a PULL request in GitHub to request that the change is pulled back from the forked repo into the "origin" zaproxy repo.

# Requirements

  * You will need a GitHub account. Now would be a good time to get one, if you don't already have one.
  * If you want to push changes back to the ZAP repositories, you will need access. You'd best ask psiinon about this.

# Preparations

  * Update your Kali system, by running the following commands (as root):
```
# apt-get update
# apt-get upgrade 
```

# Installing Eclipse

  * Install Eclipse from https://eclipse.org/downloads/
  * Get the "Eclipse IDE for Java Developers" - 64 bit, in my case.
  * Using IceWeasel, this downloads to /root/Downloads/eclipse-java-luna-SR2-linux-gtk-x86\_64.tar.gz

  * Decide where to house Eclipse (under /data, in my case), and move across the downloaded file
```
# cd /data/
# mv /root/Downloads/eclipse-java-luna-SR2-linux-gtk-x86_64.tar.gz . 
```

  * Extract the Eclipse contents, which will create everything inside an "eclipse" folder.
```
# tar -xzvf eclipse-java-luna-SR2-linux-gtk-x86_64.tar.gz 
```

  * Now run the installed Eclipse, setting an environment variable to work around a known issue with GTK3 libraries and the old glibc version on Kali.
```
# cd eclipse
# export SWT_GTK3=0 
```
  * OR add the following to eclipse.ini (the newline **is** required)
```
--launcher.GTK_version
2
```

  * Now run Eclipse
```
./eclipse 
```

# Configure Eclipse for one of the ZAP projects

The following steps need to be performed for each of the following projects:
  * zap-extensions (release status)
  * zap-extensions-beta (beta status)
  * zap-extensions-alpha (alpha status)

The steps are as follows:
  * Open the "Git" perspective ( Window -> Open Perspective -> Other -> Git )
  * Click on "Clone a Git Repository"
  * Specify the URI: https://github.com/zaproxy/zap-extensions  (this remains the same for the "release", "alpha" and "beta" branches)
  * Specify your username and password
  * Click the "Store in secure store" checkbox
  * Click "Next"
  * Select the "master" checkboxes, to get the release status extensions (other options: "alpha", "beta")
  * Click Next
  * In the Local Destination screen, accept or specify the local Git repo location. In my case, I specify one of the following, depending on which project I am configuring:
    * /data/git/zap-extensions
    * /data/git/zap-extensions-beta
    * /data/git/zap-extensions-alpha

  * Check the "clone submodules" checkbox
  * Click "Finish".
  * Wait for the clone to complete
  * When prompted, specify a new master password for the secure storage.

  * Now create a project on the cloned repository, by selecting "File -> New -> Project"
  * Type "Java" in the input field, and select "Java Project"
  * Specify the Project Name to be one of the following
    * zap-extensions
    * zap-extensions-beta
    * zap-extensions-alpha
  * Use the default location, which in my case is set to one of the following:
    * /data/git/zap-extensions
    * /data/git/zap-extensions-beta
    * /data/git/zap-extensions-alpha
  * Click "Next"
  * Select the source folder to be "src" in tab 1.
  * Click Finish

  * Now Create a test build..
  * Right-click build/build.xml, and select "Run As -> Ant Build"
  * Check that the build succeeded in the Console tab.

# Configure Eclipse to store all branches in a single project

If you would prefer to maintain the zap-extensions, zap-extensions-beta and zap-extensions-alpha branches in a single project and switch between branches as needed, you may do the following:

  * Open the "Git" perspective ( Window -> Open Perspective -> Other -> Git )
  * Click on "Clone a Git Repository"
  * Specify the URI: https://github.com/zaproxy/zap-extensions  (this remains the same for the "release", "alpha" and "beta" branches)
  * Specify your username and password
  * Click the "Store in secure store" checkbox
  * Click "Next"
  * Select as many branches as you plan to work on
  * Select a local destination for the Git repository, the initial branch to checkout
  * Click "Finish"

At this point, you should see something similar to `zap-extensions [master] - C:\Users\myname\Documents\zap-workspace\.git` in the list of "Git Repositories."

In order to import the project:
  * Right-click on the name of the repository and click on "Import Projects..."
  * Select "Import as general project" and then click "Next"
  * Rename the project if you like, then click "Finish"
  * Click the "+" symbol next to the zap-extensions repository
  * Click the "+" symbol next to "Branches"
  * If you click the "+" symbol next to "Local," you should see the branch that you selected as initial in the previous step
  * Click the "+" symbol next to "Remote Tracking"
  * For each branch that you wish to work with that is not already in "Local," right-click the name of the branch and then click "Checkout"
  * Click "Checkout as New Local Branch"
  * Click "Finish"

Return to the Java perspective (Window > Open Perspective > Other > Java) and you should see the project as well as the current branch. In order to switch to another branch:

  * Right-click the project name
  * Hover over "Team"
  * Hover over "Switch to"
  * Click the name of the desired branch

If you get as far as here, all the ZAP extensions projects are configured, but the core project still needs to be configured.  At the time of writing, this project was not completely set up, and so this documentation is not yet complete