# Selenium Project   
This project is aimed at showcasing the usage of selenium to automate E-commerce website registration page
## Prerequistites 
* To run the Framwork on your local maching you need to setup the following :
* JDK version 7.0.2
* Install IntelliJ IDEA Community Edition
* Check Edge driver compatibility with current Egde browser before run the TC 
* Install Allure report binaries and after setup put the path of bin file in Environment variables Path
* Install Apache-Maven To use Allure report and after setup put the path of bin file in Environment variables Path
* For Maven / TestNG / Selenium / Json Reader / Allure report dependencies already configured in POM.XML file
  
### Overview of the project :
   * Project built using POM framwork 
   * There are no static data in the code as the data retrived from Json file through Json Data Reader class
   * The main functions (Click , Insert ..) are defined in the PageBase Class 
   * Initiate and close broswer method defined in TestBase class to be run before / after the test case
   * Elements identifiers are unique (ID,linktext) 
   * Following command to be run from cmd to initiate Allure report and check TC execution status,time .. (allure serve + "allure bin file path")
   * Assertion after run the TC to make sure that user registred succesfully thorugh assert by success message that retrived after registration
     
