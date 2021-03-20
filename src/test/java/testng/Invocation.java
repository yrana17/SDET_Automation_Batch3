package testng;

import org.testng.annotations.Test;

public class Invocation {
	
	
	int i=1;
	
	
	@Test(invocationCount = 5)
	public void test1()
	{
		System.out.println("Test 1 executed...."+i);
		i=i+1;
	}

	
	@Test(invocationCount = 5, invocationTimeOut = 5000)
	public void test2() throws InterruptedException
	{
		System.out.println("Test 2 executed...."+i);
		Thread.sleep(1000);
		i=i+1;
	}
	
	
	
}
