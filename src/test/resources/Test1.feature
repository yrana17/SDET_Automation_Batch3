@tagF1
Feature: Testing Features for some application

  @tag1
  Scenario: Validate X Functionality
    Given I am provided with prerequisites
    When I follow the steps provided in doc
    Then I should get succeed.

  @tag2
  Scenario: Validate Y Functionality
    Given I am provided with prerequisites for Y testing
    When I follow the steps provided in doc for Y testing
    Then I should get succeed for Y as well.

  @tag3
  Scenario: Validate Z Functionality
    Given I am provided with prerequisites for Z testing on "http://www.google.com"
    When I follow the steps provided in doc for Z testing
    And I follow all steps without miss
    Then I should get succeed for Z as well.
