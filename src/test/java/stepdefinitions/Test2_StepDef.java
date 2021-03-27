package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test2_StepDef {

	WebDriver driver;

	@Before("@loginOrangeHRM")
	public void setUp() {
		System.out.println("Before Hook exec.....");
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("^I am on home page of application \"([^\"]*)\"$")
	public void i_am_on_home_page_of_application(String arg1) throws Throwable {

		driver.get(arg1);

	}

	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and(String arg1, String arg2) throws Throwable {
		driver.findElement(By.id("txtUsername")).sendKeys(arg1);
		driver.findElement(By.id("txtPassword")).sendKeys(arg2);
	}

	@When("^click on Login Button$")
	public void click_on_Login_Button() throws Throwable {
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^Validate the \"([^\"]*)\" of login as success or failure$")
	public void validate_the_of_login_as_success_or_failure(String arg1) throws Throwable {

		String act = "";
		try {
			act = driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
		} catch (Exception e) {
		}

		System.out.println("Expected:" + arg1 + " Actual:" + act);

		Assert.assertEquals(arg1, act);

	}

	@After("@loginOrangeHRM")
	public void tear() {
		System.out.println("After Hook exec.....");
		driver.close();

	}

}
