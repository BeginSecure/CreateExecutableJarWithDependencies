# CreateExecutableJarWithDependencies

###### Step 001 ######

# Generate the code
mvn archetype:generate -DgroupId=com.beginsecure.app -DartifactId=sample-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

# Change directories
cd sample-app

# Validate
mvn validate

# Package
mvn package

# Run the code
java -cp target/sample-app-1.0-SNAPSHOT.jar com.beginsecure.app.App

