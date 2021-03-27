@OrangeHRMFeature
Feature: Test Orange HRM Sites Features


	@loginOrangeHRM
	Scenario Outline: Validate login functionality
		Given I am on home page of application "https://opensource-demo.orangehrmlive.com/"
		When I enter "<userid>" and "<pswd>"
		And click on Login Button
		Then Validate the "<status>" of login as success or failure
		
		Examples: 
			| userid | pswd | status |
			| Admin  | admin123 | |
			| admin  | admin1234 | Invalid credentials |
			| adm    | admin123 | Invalid credentials |
			|        | admin123 | Username cannot be empty |
			| admin  |          | Password cannot be empty |
			|        |   			  | Username cannot be empty |