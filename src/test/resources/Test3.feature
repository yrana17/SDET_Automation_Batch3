#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@TestBackground
Feature: Test Background feature in Cucumber

  Background: User is logged in application
    Given User is onto home page of application
    When I enter credentials in form of user n pswd
    Then I should be successfully logged in

  @Directory @smoke
  Scenario: Validate Directory Functionality
  When I click on Directory Tab
  And Search by Name or Designation
  Then I should be able to read employee details
  
  @JobGrades
  Scenario: Validate Job Grades Functionality
  When I move to Job Grades under Admin Tab
  Then I should be able to read Grade Info  