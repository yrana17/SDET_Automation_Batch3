package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTag {

	
	@Test
	@Parameters({"user","pswd","id"})
	public void test1(String user,String pswd,String id)
	{
		System.out.println(user);
		System.out.println(pswd);
		System.out.println(id);
	}
	
	
}
