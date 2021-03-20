package testng;

import java.io.IOException;

import org.testng.annotations.Test;

public class ExpectedExceptions {

	
	@Test(expectedExceptions = {IOException.class})
	public void test1() {
		System.out.println("Test1 Execution....");
	}

	@Test(expectedExceptions = {IOException.class}, expectedExceptionsMessageRegExp = "Fail Message test")
	public void test2() throws IOException {
		throw new IOException("Pass Message test");
		
	}

	@Test(expectedExceptions = {IOException.class},expectedExceptionsMessageRegExp = ".* Message .*")
	public void test3() throws IOException {
		throw new IOException("Pass Message test");
		
	}
	
	@Test(expectedExceptions = {IOException.class},expectedExceptionsMessageRegExp = ".* test")
	public void test4() throws Exception {
		throw new IOException("Fail Message test");
		
	}
	
	
}
