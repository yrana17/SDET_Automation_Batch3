package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://devlabs-860f0.web.app/alert");

		/**
		 * Simple - only ok
		 */
		driver.findElement(By.id("12345rtf")).click();
		Alert al = driver.switchTo().alert();
		al.accept();

		/**
		 * Confirmation - OK CANCEL
		 */
		driver.findElement(By.id("zxcvbnm")).click();
		al = driver.switchTo().alert();
		al.dismiss();

		/**
		 * Prompt - Enter Text and then ok or cancel
		 */

		driver.findElement(By.id("aswdefr")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		al=wait.until(ExpectedConditions.alertIsPresent());
		
		
		//al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.sendKeys("yrana");
		System.out.println(al.getText());
		al.accept();

	}

}
