# Super sprint planner
Super sprint planner is JIRA plugin that allow to plan SAFe super sprint.

# References
Here are GitHub JIRA plugin references:
* https://github.com/atlassian/jira-suite-utilities
* https://github.com/everit-org/jira-timetracker-plugin
* https://github.com/atlascommunity/jira-plugins-groovy
* https://github.com/atlassian/jira-github-connector-plugin

# Setup Java environment
Setup Java environment to work:
* brew install openjdk@8
* brew tap atlassian/tap
* export JAVA_HOME=`/usr/libexec/java_home -v 1.8.0_322`
* brew install atlassian/tap/atlassian-plugin-sdk

Add these lines to .zshrc
* export ATLAS_HOME=/usr/local/Cellar/atlassian-plugin-sdk/8.2.7/libexec
* export JAVA_HOME=`/usr/libexec/java_home -v 1.8.0_322`
* export M2_HOME=/usr/local/Cellar/atlassian-plugin-sdk/8.2.7/libexec/apache-maven-3.5.4
* export PATH=$PATH:$JAVA_HOME/bin

# Setup Idea environment
Setup env variable to work with Idea:
* Edit project structure to set up project sdk to 1.8
* Edit project structure to set up language level to 8
* Edit preferences build tools maven to setup maven home path:
  /usr/local/Cellar/atlassian-plugin-sdk/8.2.7/libexec/apache-maven-3.5.4
* Edit preferences build tools maven to set up user settings file:
  /usr/local/Cellar/atlassian-plugin-sdk/8.2.7/libexec/apache-maven-3.5.4/conf/settings.xml
* Edit preferences build tools maven to set up local repository:
  /usr/local/Cellar/atlassian-plugin-sdk/8.2.7/libexec/repository

More information are here:
* https://www.baeldung.com/intellij-change-java-version

# Atlas info
Here are the SDK commands you'll use immediately:
* atlas-help - prints description for all commands in the SDK;
* atlas-run - installs this plugin into the product and starts it on localhost;
* atlas-debug --jvm-debug-suspend - same as atlas-run, but allows a debugger to attach at port 5005;
* atlas-compile - compiles the sources of your project (runs mvn compile);
* atlas-package - packages the plugin artifacts (runs mvn package);
* atlas-clean - removes files generated during the build-time in a project's directory (runs mvn clean);
* atlas-release - performs a release of the plugin (runs mvn com.atlassian.maven.plugins:amps-dispatcher-maven-plugin:8.1.2:release);
* atlas-unit-test - runs the unit tests for the plugin (runs mvn test);
* atlas-integration-test - runs the integration tests for the plugin.




