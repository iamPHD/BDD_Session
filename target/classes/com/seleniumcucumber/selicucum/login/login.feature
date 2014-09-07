Feature: Logging into Salesforce
   As a sales person
   I want to login into salesforce application
   In order to work on multiple tasks
@login
Scenario Outline: Logging into Salesforce with valid username & password
   Given I go to "loginURL" on "<Browser>"
   And I enter "loginusername" as "<UserName>"
   And I enter "loginpassword" as "<Password>"
   And I click on "loginbutton"
   Then login should be "<Expected_Result>"
   
 Examples:
 |Browser|UserName                       |Password    |Expected_Result|
 |ie     |XXXXXXX                        |ZZZZZZ      |failure        |
 |chrome |dhage.prashant@gmail.com       |Selenium123$|success        |
 |ie     |dhage.prashant@gmail.com       |Selenium123$|success        |
 |chrome |XXXXXXX                        |ZZZZZZ      |failure        |   
