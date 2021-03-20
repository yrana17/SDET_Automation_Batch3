package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://devlabs-860f0.web.app/aui");

		Actions act = new Actions(driver);

		act.dragAndDrop(driver.findElement(By.xpath("//*[@id='draggable']/p")),
				driver.findElement(By.xpath("//*[@id='droppable']"))).build().perform();

	}

}
