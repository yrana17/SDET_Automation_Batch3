package testng;

import org.testng.annotations.Test;

public class Timeout {

	@Test(timeOut = 300)
	public void test1() {

		try {
			Thread.sleep(200);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Test1 Execution....");
	}

	@Test(timeOut = 300)
	public void test2() {
		try {
			Thread.sleep(400);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Test2 Execution....");
	}

}
