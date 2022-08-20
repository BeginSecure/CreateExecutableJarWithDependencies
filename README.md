# CreateExecutableJarWithDependencies

###### Step 002 ######

# Add the plugin information to the pom.xml

# Add in the fully qualified name of the class with your main method

# Validate
mvn validate

# Edit the com.beginsecure.app.App.java file to include something requiring a 3rd party library

# Look up the G.A.V. for the new library in Maven Central (search.maven.org)

# Add that information to the pom.xml file

# Build the code again from within the sample-app directory (where pom.xml is located)
mvn clean compile assembly:single

# Run the fat jar
java -jar target/sample-app-1.0-SNAPSHOT-jar-with-dependencies.jar




