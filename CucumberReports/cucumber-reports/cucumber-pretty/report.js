$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test3.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Test Background feature in Cucumber",
  "description": "",
  "id": "test-background-feature-in-cucumber",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@TestBackground"
    }
  ]
});
formatter.background({
  "line": 22,
  "name": "User is logged in application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 23,
  "name": "User is onto home page of application",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I enter credentials in form of user n pswd",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I should be successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "Test3_StepDef.user_is_onto_home_page_of_application()"
});
formatter.result({
  "duration": 156555200,
  "status": "passed"
});
formatter.match({
  "location": "Test3_StepDef.i_enter_credentials_in_form_of_user_n_pswd()"
});
formatter.result({
  "duration": 142400,
  "status": "passed"
});
formatter.match({
  "location": "Test3_StepDef.i_should_be_successfully_logged_in()"
});
formatter.result({
  "duration": 101300,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Validate Directory Functionality",
  "description": "",
  "id": "test-background-feature-in-cucumber;validate-directory-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@Directory"
    },
    {
      "line": 27,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "I click on Directory Tab",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "Search by Name or Designation",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I should be able to read employee details",
  "keyword": "Then "
});
formatter.match({
  "location": "Test3_StepDef.i_click_on_Directory_Tab()"
});
formatter.result({
  "duration": 381500,
  "status": "passed"
});
formatter.match({
  "location": "Test3_StepDef.search_by_Name_or_Designation()"
});
formatter.result({
  "duration": 97500,
  "status": "passed"
});
formatter.match({
  "location": "Test3_StepDef.i_should_be_able_to_read_employee_details()"
});
formatter.result({
  "duration": 91500,
  "status": "passed"
});
});