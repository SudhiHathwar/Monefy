# Appium Basic Tests for Monefy app with AWS device farm
This is an Appium TestNG tests using AWS device farm written for Monefy app [Android](https://www.apkmonk.com/app/com.monefy.app.lite/) app. 

**This test suite uses the simple page model in order to separate the tests from the logic.**

## What would be the most required coverage on automation front for non premium users

* Add income and expense transaction for all categories from the pie graph and expense icon
* Add new account type and add income and expense transaction for multiple account types
* Change currency
* Update / Delete income and expense transactions
* Add income and expense transaction for past and future dates
* Filters by year, month and day
* Transaction between the accounts
* Exporting and retrieving data sets

## Test cases covered

* Add income and expense transaction with default settings
* Add new account type 
 
## TODO

* Add comments for complex logic
* Add support for iOS devices
* Add missing use cases
* Have configurations instead of hard coded data
* Setup multiple sets of data for above use cases
* Have mocked data and screenshot comparison tests for different sets of data


## Approach

I have used Java as programming language as I have been working with Java as programming language from past 5 years and 
more comfortable working with it. Coming to the automation tool, I have used appium as its the currently best tool in 
the market to automate both Android and iOS applications with one piece of code. Since I didnt have a Mac laptop or Ios 
devices, I have currently ignored the iOS automation part. With a simple abstract class we can write one piece of code 
in order to test both iOS and Android application (unless the flows are completely different). 

#### Why AWS device farm?

Since the end goal of every automation project is to have a solid CI/CD process and do that we need to have cloud based 
setup to run our automation tests on multiple sets of devices/versions and since, I was exploring options, I came across 
AWS device farm and thought it would be a good idea to try it out for the assignment. And there will be no additional 
setup required for reporting as Device farm provides the recorded video of executions 


# Android
## Getting Started
1. Follow the **[official Appium getting started guide](http://appium.io/slate/en/tutorial/android.html?java#getting-started-with-appium)** and install the Appium server and dependencies. 

	**AWS Device Farm supports Appium version 1.7.2. Using a different version locally may cause unexpected results when running Appium tests on AWS Device Farm.**
2. In order to use 1.7.2, download Appium through NPM with this command: 
	```
	npm install -g appium@1.7.2
	```
3. Verify that you have Appium installed with this command: 
	```
	appium -v
	```
   You should get "1.7.2" as the output

## Creating a new Java Appium Test Project Using Maven
1. Create a new Maven project using a Java IDE. **The example in this tutorial is for [IntelliJ IDEA Community Edition](http://www.jetbrains.com/idea/download/)**.

2. Set up your POM file using the official AWS Device Farm documentation for [TestNG](http://docs.aws.amazon.com/devicefarm/latest/developerguide/test-types-android-appium-java-testng.html)
	- You will need the following dependencies in your POM file
		
        ```
	    <dependencies>
    	    <dependency>
        	    <groupId>org.testng</groupId>
            	<artifactId>testng</artifactId>
	            <version>6.11</version>
    	        <scope>test</scope>
        	</dependency>
	        <dependency>
    	        <groupId>io.appium</groupId>
        	    <artifactId>java-client</artifactId>
            	<version>4.1.2</version>
	        </dependency>
    	</dependencies>
        ```
	
## Running Tests Locally
First, make sure that you have followed all the steps in the [Appium getting started guide](https://appium.io/docs/en/about-appium/getting-started/?lang=en). 

Configure the device name and app path in the Base Test file. (Please note the configurations are still hard coded and yet to configured in more effective way) 

## Running Your Tests on AWS Device Farm
### Step 1: Verify the Project Set-up
Please read the [Device Farm documentation](http://docs.aws.amazon.com/devicefarm/latest/developerguide/test-types-android-calabash.html). Ensure that all the steps are completed.

### Step 2: Go into the Maven Appium Directory
Go into the project directory in the terminal.

#### Step 3: Package the Test Content
Run the following Maven command to package the test content.
```
mvn clean package -DskipTests=true
```
#### Step 4: Locate the zip-with-dependencies.zip file
Once the Maven command above is finished it will produce a "device-farm.zip" file in your target folder. You will upload this file when [creating a run](http://docs.aws.amazon.com/devicefarm/latest/developerguide/how-to-create-test-run.html) on AWS Device Farm.
This step is something that can be automated when the achieving continuous integration and deployment within the project.

#### Driver Configuration
Remember to set up your Appium driver correctly. AWS Device Farm takes care of the configuration for you, and you don't need to set any of the DesiredCapabilities when creating the driver.


