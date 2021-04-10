package casestudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrganizationLocationPage {

	WebDriver driver;

	public OrganizationLocationPage(WebDriver driver) {
		this.driver = driver;
	}

	By city = By.id("searchLocation_city");
	By searchButton = By.id("btnSearch");

	public void setCityName(String strCity) {
		driver.findElement(city).sendKeys(strCity);
	}

	public void clickOnSearchBtn() {
		driver.findElement(searchButton).click();
	}

}
