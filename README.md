# Super sprint planner
Super sprint planner is JIRA plagin that allow to plan SAFe super sprint.

# References
Here are GitHub JIRA plugin references:
* https://github.com/atlassian/jira-suite-utilities
* https://github.com/everit-org/jira-timetracker-plugin
* https://github.com/atlascommunity/jira-plugins-groovy
* https://github.com/atlassian/jira-github-connector-plugin

# Setup Idea environment
export JAVA_HOME=/usr/local/Cellar/openjdk@8/1.8.0+322
export PATH=$PATH:$JAVA_HOME/bin
export ATLAS_HOME=/Applications/Atlassian/atlassian-plugin-sdk-8.2.7
export M2_HOME=/Applications/Atlassian/atlassian-plugin-sdk-8.2.7/apache-maven-3.5.4

# Atlas info
Here are the SDK commands you'll use immediately:
* atlas-help - prints description for all commands in the SDK;
* atlas-run - installs this plugin into the product and starts it on localhost;
* atlas-debug - same as atlas-run, but allows a debugger to attach at port 5005;
* atlas-compile - Compiles the sources of your project (runs mvn compile);
* atlas-package - Packages the plugin artifacts (runs mvn package);
* atlas-clean - Removes files generated during the build-time in a project's directory (runs mvn clean);
* atlas-release - Performs a release of the plugin (runs mvn com.atlassian.maven.plugins:amps-dispatcher-maven-plugin:8.1.2:release);
* atlas-unit-test - Runs the unit tests for the plugin (runs mvn test);
* atlas-integration-test - Runs the integration tests for the plugin.




