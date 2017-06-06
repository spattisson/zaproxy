This is work in progress, and has not been agreed upon yet ;)

It also just covers Eclipse - please update for other IDEs!

The ZAP branching model is based on http://nvie.com/posts/a-successful-git-branching-model/

In order to contribute code back to ZAP you will need to:

### Fork the relevant projects to your own GitHub user

1. Go to the relevant project pages (such as [zaproxy/zaproxy](https://github.com/zaproxy/zaproxy) and [zaproxy/zap-extensions](https://github.com/zaproxy/zap-extensions))
1. Click on the "Fork" button on the top right

### Change your IDE to point to your projects

You can import your projects directly into your IDE, in which case you can skip this step.

However if you have imported the [zaproxy](https://github.com/zaproxy/) projects into Eclipse using the psf referred to in the [Building](Building) page you will need to:

  * For Eclipse
    1. Select the menu Window -> Show View -> Other
      * Git / Git Repositories
    1. In the Git Repositories tab Right click the _project_/Remotes/origin node
    1. Select "Configure Push..."
    1. Enter your repo's URI

### Change your IDE to also point to the zaproxy projects

  * For Eclipse
    1. Select the Git Repositories tab
    1. Right click the _project_/Remotes node and select "Create Remote"
    1. Enter a Remote name of "upstream"
    1. Select "Configure fetch"
    1. Enter the original [zaproxy](https://github.com/zaproxy/) repo URI

### Create a branch for you to work on

  * For Eclipse
    1. Right click the project
    1. Team -> Switch to -> New Branch...

### Make and test your changes

Which is out of the scope of this guide ;)

### Commit your changes back to your repo

  * For Eclipse
    1. Right click the project
    1. Team -> Commit...
    1. Enter a suitable commit message, referring to any bugs fixed as per https://help.github.com/articles/closing-issues-via-commit-messages/
    1. Double check you've included the right files
    1. "Commit and Push"

  * In GitHub
    1. Go to your project
    1. Click "Pull Request"

### To pick up the latest changes from the zaproxy projects

  * For Eclipse
    1. For each project
    1. Right click the project
    1. Select "Team -> Remote -> Fetch From..."
    1. Choose the "upstream" remote
    1. Right click the project
    1. Select "Team -> Merge..." and select the corresponding "upstream" branch
