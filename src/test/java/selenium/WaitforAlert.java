package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforAlert {

	public static void main(String[] args) {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://devlabs-860f0.web.app/waitforalert");

		driver.findElement(By.xpath("//*[@id='mye']")).click();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		Alert al = wait.until(ExpectedConditions.alertIsPresent());
		al.accept();

	}

}
