package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeLocators2 {

	public static void main(String[] args) {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		WebElement we = driver.findElement(By.id("txtUsername"));
		we.sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");

		driver.findElement(By.id("btnLogin")).click();

		/**
		 * To find link on webpage
		 */
		List<WebElement> al = driver.findElements(By.tagName("a"));
		System.out.println(al.size());

		for (WebElement webElement : al) {
			System.out.println(webElement.getText());
		}

		/**
		 * To print span elemnts conatins text as 'My'
		 */
		List<WebElement> l = driver.findElements(By.xpath("//span[contains(text(),'My')]"));
		System.out.println(l.size());

		for (WebElement webElement : l) {
			System.out.println(webElement.getText());
		}

	}

}
