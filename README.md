# Number Iterator

Write a program that will iterate though a sequence of integers starting from 0 up to
and including a number that can be passed in and the program will:

* output the number and “FOO” only when the integer is divisible by 3
* output the number and “BAR” only when the integer is divisible by 5
* but when the integer is divisible by both 3 and 5 then don’t write the above,
output the number and “BAZ” instead

### Prerequisites

Java 1.8 (http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

Maven 3 (http://www.sonatype.com/books/mvnref-book/reference/installation.html)

git command line tool (https://help.github.com/articles/set-up-git)


### Project from GIT Repo

git clone https://github.com/lavanyamthomas/NumberIterator

### Setup application in Eclipse (Spring Tool Suite)

Working with Number Iterator in Eclipse/STS

Note : Eclipse will create the needed .project, .settings, .classpath files based on your pom.xml and environment settings (installed Java version, etc.) . The earlier versions of Eclipse needed to have run the command mvn eclipse:eclipse which produced the same result.

Import as Existing Maven Project and run it as maven Application.

mvn(Maven) clean via eclipse

mvn(Maven) install via eclipse
 
### Run application from eclipse

 *NumberCheck.java* run as java application
 
### Run application from command line
 
 mvn clean install
 
 get the **NumberIteratorApp-0.0.1-SNAPSHOT.jar** under target folder
 
 execute the app suing the following command
 
 **java -jar NumberIteratorApp-0.0.1-SNAPSHOT.jar**
 
 then enter user input number
 