## General details of the implementation

The tests use tasks, interactions, questions, elements of pages (userinterface).
The complete structure of the project is the following:

````
+ exceptions
     Classes that control the possible technical and business exceptions that arise during the execution of tests
+ model
     Classes related to the domain model and their respective builders when necessary
+ tasks
     Classes that represent tasks performed by the actor at the business process level
+ interactions
     Classes that represent direct interactions with the user interface
+ userinterface
     Page Objects and Page Elements. Map the objects of the user interface
+ questions
     Objects used to check the status of the application
+ util
     Utility classes
+ runners
     Classes that allow to run the tests
+ step definitions
     Classes that map the Gherkin lines to java code
+ features
     The representation of the stories in cucumber archives
````
## Requirements

To run the project you need Java JDK 11 and Gradle preferably with version 7.1.

## To run the project

You have Chrome as the default browser, to run the test cases you can use the command:

    gradle clean test aggregate

The report will be generated in the folder /target/site/serenity/


