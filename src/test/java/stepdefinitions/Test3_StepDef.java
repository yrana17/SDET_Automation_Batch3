package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test3_StepDef {

	
	@Given("^User is onto home page of application$")
	public void user_is_onto_home_page_of_application() throws Throwable {
	    
	    System.out.println("Background STep - Given");
	}

	@When("^I enter credentials in form of user n pswd$")
	public void i_enter_credentials_in_form_of_user_n_pswd() throws Throwable {
	    
		System.out.println("Background STep - When");
	}

	@Then("^I should be successfully logged in$")
	public void i_should_be_successfully_logged_in() throws Throwable {
	    
		System.out.println("Background STep - Then");
	}

	@When("^I click on Directory Tab$")
	public void i_click_on_Directory_Tab() throws Throwable {
	    
	    System.out.println("Directory - When");
	}

	@When("^Search by Name or Designation$")
	public void search_by_Name_or_Designation() throws Throwable {
	    
		System.out.println("Directory - When2");
	}

	@Then("^I should be able to read employee details$")
	public void i_should_be_able_to_read_employee_details() throws Throwable {
	    
		System.out.println("Directory - Then");
	}

	@When("^I move to Job Grades under Admin Tab$")
	public void i_move_to_Job_Grades_under_Admin_Tab() throws Throwable {
	    
		System.out.println("JOb Grades - When");
	}

	@Then("^I should be able to read Grade Info$")
	public void i_should_be_able_to_read_Grade_Info() throws Throwable {
	    
		System.out.println("JOb Grades - Then");
	}
}
