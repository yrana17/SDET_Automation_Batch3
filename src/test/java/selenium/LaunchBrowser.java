package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();

		// get method will launch browser with application url
		driver.get("https://www.google.com");

		driver.manage().window().maximize();

		System.out.println("Title:" + driver.getTitle());
		System.out.println("Url:" + driver.getCurrentUrl());

		driver.navigate().to("https://www.facebook.com");
		System.out.println("Title:" + driver.getTitle());

		driver.getPageSource();
		
		driver.navigate().back();
		System.out.println("Title:" + driver.getTitle());

		driver.navigate().forward();
		System.out.println("Title:" + driver.getTitle());

		driver.navigate().refresh();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.open('https://www.flipkart.com')");
		System.out.println("Title:" + driver.getTitle());

		driver.close();

		driver.quit();

	}

}
