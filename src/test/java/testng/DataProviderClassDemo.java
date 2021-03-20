package testng;

import org.testng.annotations.DataProvider;

public class DataProviderClassDemo {
	
	@DataProvider
	public static Object[][] dp1() {
		return new Object[][] { new Object[] { "User4", "pswd4" }, new Object[] { "User5", "pswd5" },
				new Object[] { "User6", "pswd6" }, };
	}

}
