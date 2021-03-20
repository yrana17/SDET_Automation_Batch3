package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://devlabs-860f0.web.app/dropdown");

		WebElement we = driver.findElement(By.xpath("//*[@id='Index']"));

		Select sel = new Select(we);

		System.out.println("Multiple Select?"+sel.isMultiple()); //checks for multiple select option
		
		
		sel.selectByIndex(3);
		System.out.println("Index:3---"+sel.getFirstSelectedOption().getText());
		
		
		sel.selectByVisibleText("Mango");
		System.out.println("Visible Text-Mango?"+sel.getFirstSelectedOption().getText());
		
		
		sel.selectByValue("1");
		System.out.println("By Value -1?"+sel.getFirstSelectedOption().getText());
		
		
		

	}

}
