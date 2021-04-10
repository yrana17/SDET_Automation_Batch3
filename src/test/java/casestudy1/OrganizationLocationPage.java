package casestudy1;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrganizationLocationPage {

	WebDriver driver;

	public OrganizationLocationPage(WebDriver driver) {
		this.driver = driver;
	}

	By city = By.id("searchLocation_city");
	By searchButton = By.id("btnSearch");
	By locationTable = By.xpath("//*[@id='resultTable']");
	By locationTableRow = By.xpath("//*[@id='resultTable']/tbody/tr");

	public void setCityName(String strCity) {
		driver.findElement(city).sendKeys(strCity);
	}

	public void clickOnSearchBtn() {
		driver.findElement(searchButton).click();
	}

	public int getRowCnt() {
		return driver.findElements(locationTableRow).size();
	}

	public void readTableData() {

		int rw = getRowCnt();
		for (int i = 2; i <= rw; i++) {

			HashMap<String, String> hm = new HashMap<String, String>();

			String val = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr[" + i + "]/td[2]/a")).getText();
			hm.put("Name", val);
			val = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr[" + i + "]/td[3]")).getText();
			hm.put("City", val);
			val = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr[" + i + "]/td[4]")).getText();
			hm.put("Country", val);
			val = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr[" + i + "]/td[5]")).getText();
			hm.put("Phone", val);
			val = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr[" + i + "]/td[6]")).getText();
			hm.put("NoOfEmployees", val);

			TestDataOrganization.listLocationTableDataUI.add(hm);
		}

	}

}
