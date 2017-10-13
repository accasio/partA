# partA

You have been asked to build a student registration system.
a)	Create a Java project using Maven (Maven project). The project should contain three classes and each class should have suitable accessor and mutator methods:
  1.	A student class should contain information such as (Name, Age, DOB, ID, username etc) 
  2.	A specific method (getUsername) will generate the student’s username by concatenating their Name and Age. Write a simple unit test using JUnit to make sure this works as expected. 
  3.	A module class, which should contain information such as (Module Name, ID (CT417), List of students).
  4.	A course programme class (Course Name (CS & IT or ECE, etc), List of modules, Academic Start date and End dates). Start and end dates should use Joda Time classes, which should be added as a project dependency.
  5.	The project should be packaged into a JAR file. This JAR needs to be pushed to a global repository so that it can be added as a dependency to additional projects automatically. Note: You won’t be able to push your build artefact from the part a to Maven Global. You will need to figure out a way to create a repository such as http://www.jitblog.net/use-dropbox-to-host-a-maven-repository/
