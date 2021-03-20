package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		//Page Load Timeouts
		//driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		// Implicit Waits
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		// Explicit Waits -- polling every 500msec
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement we = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUsername")));
		we.sendKeys("Admin");

		// Fluent Wait
		Wait<WebDriver> wt = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(Exception.class);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtUsername1"))).sendKeys("Admin");

		
		
		
	}

}
