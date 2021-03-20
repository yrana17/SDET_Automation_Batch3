package testng_parallelexecutions;

import org.testng.annotations.Test;

public class ParallelByTest {

	@Test(invocationCount = 5, threadPoolSize = 5, timeOut = 2000)
	public void test1() {
		System.out.println("Test 1 executed...." + Thread.currentThread().getId());
	}

}
