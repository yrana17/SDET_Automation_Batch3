package listeners;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.LearnITestListener.class)
public class TestITestListeners {

	@Test
	public void test1() {
		System.out.println("Test 1 executed........");
	}

	@Test
	public void test2() {
		System.out.println("Test 2 executed........");
	}

	@Test
	public void test3() {
		Assert.assertEquals(true, false);
		System.out.println("Test 3 executed........");
	}

	@Test(dependsOnMethods = { "test3" })
	public void test4() {
		System.out.println("Test 4 executed........");
	}

	int count = 0;

	@Test(successPercentage = 60, invocationCount = 5)
	public void test5() {

		count++;

		System.out.println("Invoked Count:" + count);

		if (count % 2 == 0)
			assertTrue(false);
		else
			assertTrue(true);

	}

}
