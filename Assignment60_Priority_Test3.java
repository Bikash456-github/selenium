package TestNg;

import org.testng.annotations.Test;

public class Assignment60_Priority_Test3 {
@Test(priority=0)
public void testcaseM()	
{
	System.out.println("testcaseM");
}
@Test(priority=-1)
public void testcaseN()	
{
	System.out.println("testcaseN");
}	
@Test(priority=1)	
	public void testcaseO()
	{
	System.out.println("testcaseO priority =1");
	}
@Test(priority=1)
public void testcaseP()
{
System.out.println("testcaseP priority =1");	
}


	}
	
	
	
	

