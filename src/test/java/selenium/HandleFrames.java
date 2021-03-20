package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://devlabs-860f0.web.app/frame");
		driver.manage().window().maximize();

		List<WebElement> el = driver.findElements(By.tagName("iframe"));
		int l = el.size();
		System.out.println(l);

		/**
		 * Read web element property
		 */
		for (int i = 0; i < l; i++) {
			System.out.println(el.get(i).getAttribute("name"));
			System.out.println(el.get(i).getAttribute("id"));

		}

		String txt = driver.findElement(By.xpath("/html/body/app-root/app-frame/body/div/div/div/div/div/h1"))
				.getText();
		System.out.println(txt);

		/**
		 * Switch to particular frame based on id or name
		 */
		driver.switchTo().frame("loginFrame");

		driver.findElement(By.id("username")).sendKeys("testusr");
		driver.findElement(By.id("password")).sendKeys("tstpassword");

		/**
		 * switch back to parent frame
		 */
		driver.switchTo().parentFrame();
		// driver.switchTo().defaultContent();

		txt = driver.findElement(By.xpath("/html/body/app-root/app-frame/body/div/div/div/div/div/h1")).getText();
		System.out.println(txt);

	}

}
