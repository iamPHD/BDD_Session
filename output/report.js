$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/seleniumcucumber/selicucum/createLeadNP/createlead.feature");
formatter.feature({
  "id": "create-lead",
  "description": " As a sales person\r\n I want to create lead in salesforce application\r\n In order to get more revenue",
  "name": "Create Lead",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "create-lead;create-lead",
  "description": "",
  "name": "Create Lead",
  "keyword": "Scenario",
  "line": 6,
  "type": "scenario"
});
formatter.step({
  "name": "I am logged into salesforce in \"ie\"",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "I got to \"leadtab\"",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "I click on button \"newleadbutton\"",
  "keyword": "And ",
  "line": 9
});
formatter.step({
  "name": "I enter value \"Prashant\" into the field \"firstName\"",
  "keyword": "And ",
  "line": 10
});
formatter.step({
  "name": "I enter value \"H\" into the field \"middleName\"",
  "keyword": "And ",
  "line": 11
});
formatter.step({
  "name": "I enter value \"Dhage\" into the field \"lastName\"",
  "keyword": "And ",
  "line": 12
});
formatter.step({
  "name": "I enter value \"PGS\" into the field \"company\"",
  "keyword": "And ",
  "line": 13
});
formatter.step({
  "name": "I click on button \"save\"",
  "keyword": "And ",
  "line": 14
});
formatter.step({
  "name": "lead creation should be \"success\"",
  "keyword": "Then ",
  "line": 15
});
formatter.match({
  "arguments": [
    {
      "val": "ie",
      "offset": 32
    }
  ],
  "location": "CreateLead.I_am_logged_in_salesforce(String)"
});
formatter.result({
  "duration": 54924964932,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "leadtab",
      "offset": 10
    }
  ],
  "location": "CreateLead.I_got_to(String)"
});
formatter.result({
  "duration": 5296846611,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "newleadbutton",
      "offset": 19
    }
  ],
  "location": "CreateLead.I_click_on(String)"
});
formatter.result({
  "duration": 2914723647,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Prashant",
      "offset": 15
    },
    {
      "val": "firstName",
      "offset": 41
    }
  ],
  "location": "CreateLead.I_enter_value_into_the_field(String,String)"
});
formatter.result({
  "duration": 489034263,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "H",
      "offset": 15
    },
    {
      "val": "middleName",
      "offset": 34
    }
  ],
  "location": "CreateLead.I_enter_value_into_the_field(String,String)"
});
formatter.result({
  "duration": 410841518,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dhage",
      "offset": 15
    },
    {
      "val": "lastName",
      "offset": 38
    }
  ],
  "location": "CreateLead.I_enter_value_into_the_field(String,String)"
});
formatter.result({
  "duration": 510815824,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PGS",
      "offset": 15
    },
    {
      "val": "company",
      "offset": 36
    }
  ],
  "location": "CreateLead.I_enter_value_into_the_field(String,String)"
});
formatter.result({
  "duration": 671256265,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "save",
      "offset": 19
    }
  ],
  "location": "CreateLead.I_click_on(String)"
});
formatter.result({
  "duration": 379961155,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "success",
      "offset": 25
    }
  ],
  "location": "CreateLead.Then_lead_creation_should_be(String)"
});
formatter.result({
  "duration": 3723307546,
  "status": "passed"
});
});