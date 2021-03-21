package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GradePage {

	WebDriver driver;

	By tableGrade = By.xpath("//*[@id='resultTable']");
	By tableRow = By.xpath("//*[@id='resultTable']/thead/tr/th");
	By tableCol = By.xpath("//*[@id='resultTable']/tbody/tr");

	public GradePage(WebDriver driver) {
		this.driver = driver;
	}

	public String getGradePageTitle() {
		return driver.getTitle();
	}

	public int getRwCount() {
		return driver.findElements(tableRow).size();
	}

	public int getColCount() {
		return driver.findElements(tableCol).size();
	}

}
