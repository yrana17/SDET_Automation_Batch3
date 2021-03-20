package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://devlabs-860f0.web.app/contextmenu");

		WebElement we = driver.findElement(
				By.xpath("/html/body/app-root/app-context-menu/div/div/div/div/div/button/mat-list/mat-list-item/div"));

		Actions act = new Actions(driver);

		act.contextClick(we).perform();

		we = driver.findElement(By.xpath("//*[@id='mat-menu-panel-0']/div/div/button"));
		we.click();

		Alert al = driver.switchTo().alert();
		al.accept();

	}

}
