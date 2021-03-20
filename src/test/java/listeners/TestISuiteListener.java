package listeners;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(listeners.LearnISuiteListeners.class)
public class TestISuiteListener {

	
	@BeforeSuite
	public void bsuite()
	{
		System.out.println("Before Suite");
	}
	
	
	@Test
	public void test1()
	{
		System.out.println("Test Method");
	}
	
	
	@AfterSuite
	public void asuite()
	{
		System.out.println("After Suite");
	}
	
	
	
}
