# Unit Testing Project

unit test simply verifies that individual units of code works as expected .
the tests are written in the form of functions that will determine a returned value equals
the value you were expecting when you wrote the function.
#Getting Started

JUnit (http://junit.org/) is an open-source Java Unit Testing Framework designed by Kent Beck, Erich Gamma. 
It is the de facto standard for Java Unit Testing.
JUnit is not included in JDK, but included in most of the IDEs such as Eclipse and NetBeans.

# Installing

Download the Eclipse Installer.
Download Eclipse Installer from http://www.eclipse.org/downloads. ...
Start the Eclipse Installer executable. ...
Select the package to install. ...
Select your installation folder. ...
Launch Eclipse.

Installing and Using JUnit

Installing JUnit: Goto http://junit.org/ ⇒ "Download and Install Guide" ⇒ Download the "junit.jar" and "hamcrest-core.jar". 
You could download the API documentation as well as the source code.
Using JUnit: To use the JUnit, include JUnit jar-files "junit-4.##.jar" and "hamcrest-core-1.##.jar" in your CLASSPATH.
Using JUnit under Eclipse
Include JUnit Library in your Java Project:
Create a new Java project ⇒ right-click on the project ⇒ Properties ⇒ Java Build Path⇒
"Libraries" tab ⇒ Add Library ⇒ JUnit ⇒ In "JUnit library version", choose "JUnit 4" ⇒
In "current location" use the eclipse's JUnit or your own download. 
[Alternatively, when you create a new test case or test suite (as describe below), Eclipse will prompt you to include the JUnit library.]

Create Test case (or Test Suite): To create a new JUnit test case (or test suite, which contains many test cases)
⇒ File ⇒ Others ⇒ Java ⇒ JUnit ⇒ JUnit test case (or JUnit test suite).
Run Test case (or Test Suite): To run a test case (or test suite), right-click the file ⇒ Run As ⇒ JUnit Test.

# Test

testing arithmetic operations on two integers.
example
-Write an addition function. Test it carefully, change it, repeat until it works.
-Do the same for subtraction, multiplication, division functions.

 @Test header specifies that the function definitionis indeed a test function that JUnit can run separately.
 
# Built With
 
Eclipse IDE



 
