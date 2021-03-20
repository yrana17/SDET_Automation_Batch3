package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnAssertions {

	@Test
	public void test1() {

		Assert.assertEquals(true, false);
		Assert.assertNotEquals(true, false);

		System.out.println("Test1.......");
	}

	@Test
	public void test2() {
		SoftAssert obj = new SoftAssert();
		obj.assertEquals(true, false);
		obj.assertNotEquals(true, false);
		obj.assertAll();

		System.out.println("Test2.......");
	}

	@Test
	public void test3() {
		System.out.println("Test3.......");
	}

}
