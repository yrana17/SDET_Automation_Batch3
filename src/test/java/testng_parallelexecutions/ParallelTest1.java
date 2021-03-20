package testng_parallelexecutions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTest1 {

	
	@BeforeMethod
	public void beforeMethod1() {
		
		
		System.out.println("Before Method"+Thread.currentThread().getId());
	}

	@Test
	public void test11() {
		System.out.println("Test1 Execution...."+Thread.currentThread().getId());
	}

	@Test
	public void test12() {
		System.out.println("Test2 Execution...."+Thread.currentThread().getId());
	}

	@Test
	public void test13() {
		System.out.println("Test3 Execution...."+Thread.currentThread().getId());
	}

	@AfterMethod
	public void afterMethod1() {
		System.out.println("After Method......."+Thread.currentThread().getId());
	}

	
	
}
