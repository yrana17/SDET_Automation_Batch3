package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowserTest {

	public static void main(String[] args) {

		WebDriver driver;

		System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("https://devlabs-860f0.web.app/alert");


		System.setProperty("webdriver.ie.driver", "src\\main\\resources\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();

		driver.get("https://devlabs-860f0.web.app/alert");
		
		
		
	}

}
