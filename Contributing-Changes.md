This is work in progress, and has not been agreed upon yet ;)

The ZAP branching model is based on http://nvie.com/posts/a-successful-git-branching-model/

In order to contribute code back to ZAP you will need to:

### Fork the relevant projects to your own GitHub user

1. Go to the relevant project pages (such as [zaproxy/zaproxy](https://github.com/zaproxy/zaproxy))
1. Click on the "Fork" button on the top right

### Change your IDE to point to your projects

You can import your projects directly into your IDE, in which case you can skip this step.

However if you have imported the [zaproxy](https://github.com/zaproxy/) projects into Eclipse using the psf referred to in the [Building](Building) page you will need to:

1. In Eclipse select the menu Window -> Show View -> Other
  * Git / Git Repositories
1. In the Git Repositories tab
  * Right click the _project_/Remotes/origin node and select "Configure Push..."
  * Enter your repo's URI

### Change your IDE to also point to the zaproxy projects

1. In the Eclipse Git Repositories tab
  * Right click the _project_/Remotes node and select "Create Remote"
  * Enter a Remote name of "upstream"
  * Select "Configure fetch"
  * Enter the original [zaproxy](https://github.com/zaproxy/) repo URI

## Create a fork for you to work on

1. In Eclipse right click the project
  * Team -> Switch to -> New Branch...

