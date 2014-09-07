Feature: Create Lead
   As a sales person
   I want to create lead in salesforce application
   In order to get more revenue
   
Scenario: Create Lead
   Given I am logged into salesforce in "ie"
   When I got to "leadtab"
   And I click on button "newleadbutton"
   And I enter value "Prashant" into the field "firstName" 
   And I enter value "H" into the field "middleName" 
   And I enter value "Dhage" into the field "lastName" 
   And I enter value "PGS" into the field "company" 
   And I click on button "save"
   Then lead creation should be "success"
   