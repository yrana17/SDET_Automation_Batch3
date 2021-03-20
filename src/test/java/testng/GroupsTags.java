package testng;

import org.testng.annotations.Test;

public class GroupsTags {

	
	@Test(groups = {"smoke","sanity"})
	public void test1() {
		System.out.println("Test1 Execution for smoke and sanity....");
	}

	@Test(groups = {"automation"})
	public void test2() {
		System.out.println("Test2 Execution for automation....");
	}

	@Test(groups = { "regression", "functional", "automation"})
	public void test3() {
		System.out.println("Test3 Execution for regression, functional and automation....");
	}
	
	@Test(groups = {"stability", "performance"})
	public void test4() {
		System.out.println("Test4 Execution for stability, performance....");
	}

	@Test(groups = {"regression","automation"})
	public void test5() {
		System.out.println("Test5 Execution for regression and automation....");
	}

	
	
}
