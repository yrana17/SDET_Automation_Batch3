package testng;

import org.testng.annotations.Test;

public class Priority {

	
	@Test(description = "Test-1" , priority = 0)
	public void testc() {
		System.out.println("TestC Execution....");
	}

	@Test(description = "Test-3" , priority = 3)
	public void testa() {
		System.out.println("TestA Execution....");
	}

	@Test(description = "Test-2" , priority = 1)
	public void testb() {
		System.out.println("TestB Execution....");
	}	
	
	
}
