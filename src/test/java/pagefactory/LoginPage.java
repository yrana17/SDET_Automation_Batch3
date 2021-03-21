package pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(id = "txtUsername")
	WebElement userName;

	@FindBy(id = "txtPassword")
	WebElement passwd;

	@FindBy(id = "btnLogin")
	WebElement loginBtn;

	@FindBy(linkText = "Forgot your password?")
	WebElement forgotPswd;

	@FindBy(tagName = "a")
	List<WebElement> lnk;

	@FindBys({ @FindBy(how = How.ID, using = "txtUsername"), @FindBy(how = How.NAME, using = "txtPassword") })
	List<WebElement> bothCriterias;

	@FindAll({ @FindBy(id = "txtUsername"), @FindBy(name = "txtPassword") })
	List<WebElement> eitherCriterias;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setUserName(String user) {
		userName.sendKeys(user);
	}

	public void setPassword(String pswd) {
		passwd.sendKeys(pswd);
	}

	public void clickOnLoginBtn() {
		loginBtn.click();
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void clickOnForgotLink() {
		forgotPswd.click();
	}

	public void getLinks() {
		System.out.println(lnk.size());
		for (int i = 0; i < lnk.size(); i++) {
			lnk.get(i).click();
		}

	}

}
