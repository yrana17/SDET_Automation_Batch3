package selenium;

import java.util.ArrayList;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {

		
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.open('https://www.flipkart.com')");
		
		js.executeScript("window.open('https://www.amazon.com')");

		js.executeScript("window.open('https://www.facebook.com')");
		
		
		
		String current=driver.getWindowHandle();
		System.out.println(current);
		
		ArrayList<String> win=new ArrayList<String>(driver.getWindowHandles());
		int n=win.size();
		
		for(int i=0;i<n;i++)
		{
			driver.switchTo().window(win.get(i));
			System.out.println(driver.getTitle());
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
