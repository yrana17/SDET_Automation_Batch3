package testng_parallelexecutions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTest2 {

	
	@BeforeMethod
	public void beforeMethod2() {
		System.out.println("Before Method 2........"+Thread.currentThread().getId());
	}

	@Test
	public void test21() {
		System.out.println("Test21 Execution...."+Thread.currentThread().getId());
	}

	@Test
	public void test22() {
		System.out.println("Test22 Execution...."+Thread.currentThread().getId());
	}

	@Test
	public void test23() {
		System.out.println("Test23 Execution...."+Thread.currentThread().getId());
	}

	@AfterMethod
	public void afterMethod2() {
		System.out.println("After Method 2......."+Thread.currentThread().getId());
	}

	
	
}
