package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BasicTags {

	
	@BeforeSuite
	public void beforeTestSuite() {
		System.out.println("Before Test Suite.....");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test..........");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@Test
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

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method.......");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test........");
	}

	@AfterSuite
	public void afterTestSuite() {
		System.out.println("After Test Suite......");
	}

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Test Class.....");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class.......");
	}
	
	
	
}
