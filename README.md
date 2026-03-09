# OrangeHRM Automation - TestNG Framework

This project automates the OrangeHRM web application using Selenium WebDriver with Java and TestNG framework.

---

## Technologies Used
- Java
- Selenium WebDriver
- TestNG
- Maven
- Eclipse IDE

---

## Project Setup (From Scratch)

Follow the below steps to create this automation project.

### 1. Install Java

Download and install JDK.

Check installation:


java -version


---

### 2. Install Eclipse IDE

Download and install **Eclipse IDE for Java Developers**.

---

### 3. Install Maven

Download Maven and configure it.

Verify installation:


mvn -version


---

### 4. Create Maven Project in Eclipse

Steps:

1. Open Eclipse  
2. Click **File → New → Maven Project**  
3. Select **maven-archetype-quickstart**  
4. Enter:


GroupId: automation
ArtifactId: OrangeHRMAutomation


5. Click **Finish**

---

### 5. Add Dependencies in pom.xml

Add Selenium and TestNG dependencies.

```xml
<dependencies>

<dependency>
<groupId>org.seleniumhq.selenium</groupId>
<artifactId>selenium-java</artifactId>
<version>4.18.1</version>
</dependency>

<dependency>
<groupId>org.testng</groupId>
<artifactId>testng</artifactId>
<version>7.9.0</version>
</dependency>

</dependencies>

Right click project → Maven → Update Project

Project Structure
src/test/java
   tests
      OrangeHRMTest.java

pom.xml
testng.xml
Test Scenarios Automated

The following HRM application workflows are automated:

1.Launch Browser

2.Login with Username and Password

3.Navigate to PIM Module

4.Add New Employee

5.Save Employee Details

6.Search for Added Employee

7.Delete Employee Record

8.Close Browser

9.How to Run the Project

10.Open the project in Eclipse.

Locate:

testng.xml

Right click Run As → TestNG Suite

Automation tests will start executing.
