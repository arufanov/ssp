#!/bin/bash

# Handle git tasks
#git tag -d ssp-1.0.0
#git push --delete origin ssp-1.0.0

# Handle mvn tasks
atlas-release -DreleaseVersion=1.0.1 -DdevelopmentVersion=1.0.2-SNAPSHOT -Dtag=my-project-1.0.1 
#atlas-release-rollback
