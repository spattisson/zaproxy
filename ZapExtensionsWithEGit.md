# Setting Up Zap-Extensions with EGit

If you're using Eclipse and trying to set up the recently migrated zap-extensions project, the following steps may be useful. The first thing you'll probably want to do is remove any branches from the SVN zap-extensions project from your workspace.


## Setting up EGit

Navigate to Help > Eclipse Marketplace and search for egit. The first result should be "EGit - Git Team Provider 3.7.1." If you're using Luna, chances are this is already installed and you'll have the option to update. Either install or update to the latest version, restart Eclipse, and you should be ready to clone the repo.

## Cloning the repo

Navigate to Window > Open Perspective > Other. One of the options in the list that pops up should be Git. Select this and click OK.

In the top right corner of the "Git Repositories" pane should be a number of icons. Hover over the third from the left and it should read "Clone a Git Repository and add the clone to this view." Click the icon and a new window will pop up.

Copy the following into the "URI" field: `https://github.com/zaproxy/zap-extensions.git`

This is the location of the remote repository, which we will be cloning from. It includes a master, beta and alpha branch, where master corresponds to the former release branch.

The fields Host, Repository Path and Protocol should all auto-populate with the correct information.

Enter your GitHub username and password in the appropriate fields. I'm unsure of whether or not this is required, but it didn't yell at me when I did so :).

Click Next and you should see a checklist of the three branches. Select all those you wish to work with in the future, then click Next.

On this page, select the directory where you would like to store the zap-extensions project. I chose my current ZAP workspace. You may also choose the initial branch for your local repo, set to master by default. You may also choose to rename the remote repo, although the default of "origin" is the convention. Click Finish.


## Importing the Project and Checking Out Branches

You should see the new repository in the Git Repositories view with a name similar to `zap-extensions [master] - C:\Users\myname\Documents\zap-workspace\.git`. If you expand this item, you should see a "Branches" item, and if you expand that there should be a "Local" subfolder containing the initial branch you selected and a "Remote Tracking" subfolder with all three.

Right-click on the repo and select "Import Projects" from the dropdown. In the wizard that comes up select "Import as general project" and then click Next and then Finish.

If you plan on working with multiple branches, you will need to checkout those branches from the remote repo. For example if you need the beta branch, right-click origin/beta under Remote Tracking, then click "Checkout." Click "Checkout as New Local Branch" from the popup and a copy will be generated in your local repo. Do the same for alpha.

## Switching Between Branches

Navigate to Window > Open Perspective > Other and this time click on the Java perspective. You should see something similar to: `> zap-extensions [zap-extensions beta]` in your Package Explorer. If you right-click on this and navigate to Team > Switch To, you should be able to switch back and forth between your local copies of each branch.

If you're interested in learning about how branches work in Git, [this](http://nvie.com/posts/a-successful-git-branching-model/) is an excellent introduction.