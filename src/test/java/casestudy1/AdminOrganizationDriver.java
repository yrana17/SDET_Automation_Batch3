package casestudy1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class AdminOrganizationDriver {

	WebDriver driver;
	HomePage objHome;
	LoginPage objLogin;
	OrganizationLocationPage objOrgLoc;
	HandleData objDataRead;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		objDataRead = new HandleData();
		objDataRead.readCredInputs(TestDataOrganization.getStrorganizationexcelinputfilepath(),
				TestDataOrganization.getStrcredentialssheetname());

	}

	@Test
	public void testOrganizationLocation() {

	}

	@AfterTest
	public void tear() {
		driver.quit();
	}

}
