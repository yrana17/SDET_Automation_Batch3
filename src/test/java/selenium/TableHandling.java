package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://devlabs-860f0.web.app/table");

		int col = driver.findElements(By.xpath("//*[@id='table']/thead/tr/th")).size();
		System.out.println("Col Cnt:" + col);

		List<WebElement> al = driver.findElements(By.xpath("//*[@id='table']/tbody/tr"));
		System.out.println("Rows:" + al.size());

		for (int i = 1; i <= al.size(); i++) {
			for (int j = 1; j <= col; j++) {

				String val = driver.findElement(By.xpath("//*[@id='table']/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.println(val);

				if (val.equals("") || val.equals(" ") || val.equals(null))
					driver.findElement(By.xpath("//*[@id='table']/tbody/tr[" + i + "]/td[" + j + "]")).click();

			}
		}

		driver.findElement(By.xpath("//*[@id='first']")).click();

		System.out.println(driver.findElement(By.xpath("//*[@id='table']/tbody/tr[1]/td[4]")).isSelected());
		System.out.println(driver.findElement(By.xpath("//*[@id='table']/tbody/tr[2]/td[4]")).isSelected());

	}

}
