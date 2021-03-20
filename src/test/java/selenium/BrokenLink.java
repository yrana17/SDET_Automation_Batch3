package selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://devlabs-860f0.web.app/home");

		List<WebElement> al = driver.findElements(By.tagName("a"));

		for (WebElement we : al) {

			String url = we.getAttribute("href");
			System.out.println(url);

			if (url.isEmpty() || url == null) {
				System.out.println("Url:" + url + " is not working");
				continue;
			} else {

				try {
					HttpURLConnection hc = (HttpURLConnection) new URL(url).openConnection();
					hc.connect();

					int respcode = hc.getResponseCode();

					if (respcode >= 400)
						System.out.println("Url:" + url + " is not working- Response code:" + respcode);
					else
						System.out.println("Url " + url + " is working fine- Response code:" + respcode);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

		}

	}

}
