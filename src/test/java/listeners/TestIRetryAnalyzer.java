package listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestIRetryAnalyzer {

	@Test(retryAnalyzer = listeners.LearnIRetryAnalyzer.class)
	public void test1() {
		Assert.assertEquals(true, false);
	}

	@Test
	public void test2() {
		System.out.println("Test 2 executed....");

	}

	@Test
	public void test3() {
		throw new SkipException("Test 3 is not ready for execution");
	}

}