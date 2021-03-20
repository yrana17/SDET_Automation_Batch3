package testng;

import org.testng.annotations.Test;

public class Enable {

	
	@Test(enabled = false)
	public void test1() {
		System.out.println("Test1 Execution....");
	}

	@Test
	public void test2() {
		System.out.println("Test2 Execution....");
	}

	@Test
	public void test3() {
		System.out.println("Test3 Execution....");
	}
	
	
}
