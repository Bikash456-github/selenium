package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

@Test
public class Assignment48_Annotations_Method_Test {
	@Test(priority=1)
	public void m2()
	{
	System.out.println("registration");	
	}
	@Test(priority=2)
	public void m3()	
	{
	System.out.println("logout");	
	}
	@Test 
	public void m1()	
	{
	Reporter.log("Bikashdhungana");	
		System.out.println("login");
	}

		
	}



