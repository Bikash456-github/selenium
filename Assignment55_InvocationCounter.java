package TestNg;

import org.testng.annotations.Test;

public class Assignment55_InvocationCounter {

	@Test(priority=0,invocationCount=10)
	public void testcaseM()
	{
		System.out.println("testcaseM");
	}
	
	
}
