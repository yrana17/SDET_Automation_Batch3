package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Driver {

	WebDriver driver;
	LoginPage objLogin;
	HomePage objHome;
	GradePage objGrade;
	DirectoryPage objDirectory;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(priority = 0, enabled = false)
	public void testGradePage() {
		objLogin = new LoginPage(driver);
		objLogin.setUserName("Admin");
		objLogin.setPassword("admin123");
		objLogin.clickOnLoginBtn();
		System.out.println(objLogin.getTitle());

		objHome = new HomePage(driver);
		objHome.moveToAdminJobGrades();

		objGrade = new GradePage(driver);
		System.out.println(objGrade.getGradePageTitle());
		System.out.println(objGrade.getRwCount());
		System.out.println(objGrade.getColCount());

	}

	@Test(priority = 0)
	public void testDirectoryPage() throws InterruptedException {
		objLogin = new LoginPage(driver);
		objLogin.setUserName("Admin");
		objLogin.setPassword("admin123");
		objLogin.clickOnLoginBtn();
		System.out.println(objLogin.getTitle());

		objHome = new HomePage(driver);
		objHome.clickOnDirectoryTab();

		objDirectory = new DirectoryPage(driver);

		Thread.sleep(5000);
		objDirectory.setSearchByLocation("Canada");
		objDirectory.clickOnSearchBtn();

		objDirectory.setSearchByName("Peter");
		objDirectory.clickOnSearchBtn();
		int r = objDirectory.getRowCnt();
		System.out.println(r);

		objDirectory.readTableData(r);
		objDirectory.clickOnResetBtn();

		objDirectory.setSearchByJobTitle("IT Manager");
		objDirectory.clickOnSearchBtn();
		System.out.println(objDirectory.getRowCnt());
		objDirectory.clickOnResetBtn();

	}

	@AfterTest
	public void tear() {
		driver.quit();
	}

}
