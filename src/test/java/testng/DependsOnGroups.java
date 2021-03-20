package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroups {
	
	@Test(groups = {"smoke1","sanity1"})
	public void test1() {
		System.out.println("Test1 Execution for smoke and sanity....");
		Assert.assertEquals(true, false);
	}

	@Test(groups = {"automation1"})
	public void test2() {
		System.out.println("Test2 Execution for automation....");
	}

	@Test(dependsOnGroups = {"smoke1"})
	public void test3() {
		System.out.println("Test3 Execution ....");
	}
	
	@Test(dependsOnMethods = {"test1"})
	public void test4() {
		System.out.println("Test4 Execution ....");
	}
	
}
