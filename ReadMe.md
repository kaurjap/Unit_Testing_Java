## Overview

There are two testing classes created, TriangleTest.java and NextDateTest.java, in order to test the three isTriangle () functions and the two nextDate () functions, respectively.

I worked through JUnit, the Java testing framework, and its environment setup and configuration mostly through Visual Studio Code by adding the JUnit jar file to the reference libraries folder of the project. 

However, in order to run the tests via command line, the junit jar file and the hamcrest file are also included.

Please follow the following steps to run the tests.

#### Step 1: Compile the source code

- From the base directory, type:
```console
    javac assignment1/Triangle.java
    javac assignment1/NextDate.java
```

#### Step 2: Compile and run the test classes

- In order to compile the test classes, the classpath needs to be configured. Hence, being in the base directory, please type the following to compile both the test files.
```console
    java -cp .:junit-4.13.2.jar TriangleTest.java
    java -cp .:junit-4.13.2.jar NextDateTest.java
```
- Once the test files/classes are compiled, run them in a similar way using the following specifications in the command.
```console
  java -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore TriangleTest
  java -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore NextDateTest
```

References:

https://medium.com/@pelensky/java-tdd-with-junit-without-using-an-ide-cd24d38adff
