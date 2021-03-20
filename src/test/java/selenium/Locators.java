package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/"); 
		driver.manage().window().maximize();

		driver.findElement(By.id("txtUsername"));

		driver.findElement(By.name("txtUsername"));

		driver.findElement(By.linkText("Forgot your password?"));

		driver.findElement(By.partialLinkText("Forgot"));

		driver.findElement(By.cssSelector(""));

		driver.findElements(By.tagName("a"));

		driver.findElement(By.className(""));

		driver.findElement(By.xpath("//input[@id='txtUsername' and @name='']"));


	}

}
