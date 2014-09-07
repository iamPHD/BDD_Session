Feature: Verify top menu
   As a sales person
   I want to verify top menu of salesforce application
   In order to work on multiple menus
@menu
Scenario Outline: Test top menu
   Given I am logged into salesforce in "<BrowserType>"
   Then All tabs on menu should be present
   |hometab|
   |leadtab|
   And I click on "<HeaderLink>"
   Then "<VerificationObject>" element should be present
   
 Examples:
 |BrowserType|HeaderLink|VerificationObject    |
 |ie         |hometab   |whatareyouworkingon   |
 |chrome     |leadtab   |openleads             |  