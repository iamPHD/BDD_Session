Feature: Test login feature of Salesforce
   As a sales person
   I want to test login feature of salesforce application
   so that uesrs with valid id & psswd can login & with invalid id & psswsd cannot login 
   
Scenario: valid username & password -- chrome browser
   Given I go to "loginURL" on "chrome"
   And I enter loginame into the textbox "usrname" as "dhage.prashant@gmail.com"
   And I enter password into the textbox "passwrd" as "Selenium123$"
   And I click on "loginbutton"
   Then login should be "success"
   
Scenario: valid username & password -- ie browser
   Given I go to "loginURL" on "ie"
   And I enter loginame into the textbox "usrname" as "dhage.prashant@gmail.com"
   And I enter password into the textbox "passwrd" as "Selenium123$"
   And I click on "loginbutton"
   Then login should be "success"
   
Scenario: valid username & Invalid password -- ie browser
   Given I go to "loginURL" on "ie"
   And I enter loginame into the textbox "usrname" as "dhage.prashant@gmail.com"
   And I enter password into the textbox "passwrd" as "XXXXXX"
   And I click on "loginbutton"
   Then login should be "failure"
   
Scenario: Invalid username & Invalid password -- firefox browser
   Given I go to "loginURL" on "Mozilla"
   And I enter loginame into the textbox "usrname" as "dhage.prashant@rediff.com"
   And I enter password into the textbox "passwrd" as "XXXXXX"
   And I click on "loginbutton"
   Then login should be "success"
   