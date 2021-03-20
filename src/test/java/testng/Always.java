package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Always {

	@Test
	public void test3() {
		System.out.println("Test3 Execution ....");
		Assert.assertEquals(true, false);
	}
	
	@Test(dependsOnMethods = {"test3"}, alwaysRun = true)
	public void test4() {
		System.out.println("Test4 Execution ....");
	}
	
	
	
}
