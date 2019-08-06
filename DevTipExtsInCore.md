# Run addons from zaproxy without deploying them

ZAP Add-ons should typically be implemented in the [zap-extensions](https://github.com/zaproxy/zap-extensions/) project.

However there is a way to load them when starting ZAP via the zaproxy project without having to re-build and deploy them each time.

  1. Build and deploy the extension to zaproxy (or whatever project you are using)
  1. Edit the "Run Configurations..."
    * Select the "Classpath" tab
    * Select the "User Entries" node
    * Press the "Add Projects..." button
    * Select the require project, eg zap-extensions

When you run this configuration you _should_ get the latest code changes you've made to the relevant extensions project without having to redeploy the extension.

