package casestudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

	WebDriver driver;

	By adminTab = By.xpath("//*[@id='menu_admin_viewAdminModule']/b");
	By adminJob = By.xpath("//*[@id='menu_admin_Job']");
	By adminJobPayGrades = By.xpath("//*[@id='menu_admin_viewPayGrades']");
	By adminJobTitles = By.xpath("//*[@id='menu_admin_viewJobTitleList']");

	By directoryTab = By.xpath("//*[@id='menu_directory_viewDirectory']/b");

	By adminOrganization = By.xpath("//*[@id='menu_admin_Organization']");
	By adminOrganizationGeneral = By.xpath("");
	By adminOrganizationLocation = By.xpath("//*[@id='menu_admin_viewLocations']");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void moveToAdminJobGrades() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(adminTab)).moveToElement(driver.findElement(adminJob))
				.moveToElement(driver.findElement(adminJobPayGrades)).build().perform();

		act.click().perform();

	}

	public void moveToAdminJobTitles() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(adminTab)).moveToElement(driver.findElement(adminJob))
				.moveToElement(driver.findElement(adminJobTitles)).build().perform();

		act.click().perform();

	}

	public void moveToAdminOrganizationGeneralInfo() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(adminTab)).moveToElement(driver.findElement(adminOrganization))
		.moveToElement(driver.findElement(adminOrganizationGeneral)).build().perform();


		act.click().perform();

	}

	
	public void moveToAdminOrganizationLocation() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(adminTab)).moveToElement(driver.findElement(adminOrganization))
				.moveToElement(driver.findElement(adminOrganizationLocation)).build().perform();

		act.click().perform();

	}
	
	public void clickOnDirectoryTab() {
		driver.findElement(directoryTab).click();
	}

}
