# Google Summer of Code

These are some suggested Best Practices for Google Summer of Code projects - all feedback appreciated!

## Getting started
  * Mentors should set up intro meetings with their students asap
  * Students should set up a wiki for their project, linked from the ZAP and OWASP (or Mozilla) wikis
  * Students should set up a ZAP dev environment: https://github.com/zaproxy/zaproxy/wiki/Building
  * Students and mentors should agree an initial plan, ideally including/based on use cases
  * All mentors and students should join the ZAP Dev Group and introduce themselves
  * All mentors and students should have an initial ‘intro’ video call with the project lead (Simon)

## Updates
  * Mentors should have at least weekly meetings with their students (format can be agreed, but video was found to be very useful last year)
  * Students should update their wiki at least weekly
  * Mentors should update the project lead (Simon) at regular intervals, frequency TBD

## Source Control
  * Ideally as much new code as possible should be implemented as new add-ons in the ZAP extensions project: https://github.com/zaproxy/zap-extensions/
  * If significant core changes are required then students should create a new https://github.com/zaproxy/zaproxy/ branch
  * Add-ons should follow the standard development process: https://github.com/zaproxy/zap-extensions/wiki/AddOnDevelopment
  * All projects should aim for ‘release’ status by the end of the GSoC

## Development
  * Relatively short development cycles are encouraged, with students committing changes and releasing new add-on versions regularly - this allows us to see that things are on track and gives the maximum opportunity for feedback from the community
  * Unit tests should be developed in conjunction with the code (in https://github.com/zaproxy/zaproxy-test/ ) - these should be configured to run on all new commits (by Simon)
  * Help and other documentation should be written, although this may lag behind development
  * All developments should follow the ZAP development guidelines: https://github.com/zaproxy/zaproxy/wiki/DevGuidelines eg easy to use, intuitive, internationalized etc

## Community engagement
  * Any questions regarding ZAP development / best practice / feedback etc should be directed to the ZAP Dev Group - this gives the most visibility to the rest of the community
  * Community feedback should be encouraged as early as possible
  * All students will be encouraged to record a video demonstrating their finished project which will be promoted via the ZAP wiki and twitter feed