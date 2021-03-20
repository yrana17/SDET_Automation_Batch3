package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeLocators {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();

		WebElement we = driver.findElement(By.id("txtUsername"));
		we.sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");

		List<WebElement> al = driver.findElements(By.xpath("//input[starts-with(@id,'txt')]"));
		System.out.println(al.size());

		for (WebElement webElement : al) {
			// webElement.sendKeys("Pass1");
			System.out.println(webElement.getText());
		}

		driver.findElement(By.id("btnLogin")).click();

		System.out.println(driver.getTitle());

		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();

		boolean b = false;

		if (b == true) {
			driver.findElement(By.partialLinkText("Forgot")).click();

			driver.findElement(By.linkText("Forgot your password?")).click();
		}
		driver.close();

	}

}
