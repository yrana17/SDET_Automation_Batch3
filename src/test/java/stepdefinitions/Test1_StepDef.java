package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test1_StepDef {

	@Given("^I am provided with prerequisites$")
	public void i_am_provided_with_prerequisites() throws Throwable {

		System.out.println("Given for X Scenario..........");
	}

	@When("^I follow the steps provided in doc$")
	public void i_follow_the_steps_provided_in_doc() throws Throwable {

		System.out.println("When for X Scenario..........");
	}

	@Then("^I should get succeed\\.$")
	public void i_should_get_succeed() throws Throwable {

		System.out.println("Then for X Scenario..........");
	}

	@Given("^I am provided with prerequisites for Y testing$")
	public void i_am_provided_with_prerequisites_for_Y_testing() throws Throwable {

		System.out.println("Given for Y Scenario..........");
	}

	@When("^I follow the steps provided in doc for Y testing$")
	public void i_follow_the_steps_provided_in_doc_for_Y_testing() throws Throwable {

		System.out.println("When for Y Scenario..........");
	}

	@Then("^I should get succeed for Y as well\\.$")
	public void i_should_get_succeed_for_Y_as_well() throws Throwable {

		System.out.println("Then for Y Scenario..........");
	}

	@Given("^I am provided with prerequisites for Z testing on \"([^\"]*)\"$")
	public void i_am_provided_with_prerequisites_for_Z_testing_on(String arg1) throws Throwable {
		System.out.println("Given with Fixed Input provided in STatement:"+arg1);	
	}

	@When("^I follow the steps provided in doc for Z testing$")
	public void i_follow_the_steps_provided_in_doc_for_Z_testing() throws Throwable {
		System.out.println("When 1 for Z Scenario..........");
	}

	@When("^I follow all steps without miss$")
	public void i_follow_all_steps_without_miss() throws Throwable {
		System.out.println("When 2 for Z Scenario..........");
	}

	@Then("^I should get succeed for Z as well\\.$")
	public void i_should_get_succeed_for_Z_as_well() throws Throwable {
		System.out.println("Then for Z Scenario..........");
	}
	
	
	
}
