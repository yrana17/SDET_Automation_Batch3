package testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderTag {

	@Test(dataProvider = "dp")
	public void test1(String usr, String pwd) {
		System.out.println(usr + " --" + pwd);
	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { "User1", "pswd1" }, new Object[] { "User2", "pswd2" },
				new Object[] { "User3", "pswd3" }, };
	}

	@Test(dataProviderClass = DataProviderClassDemo.class, dataProvider = "dp1")
	public void test2(String usr, String pwd) {
		System.out.println(usr + " --" + pwd);
	}

}
