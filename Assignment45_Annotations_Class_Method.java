package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

@Test
public class Assignment45_Annotations_Class_Method {
@Test
	public void testCase1()
	{
	System.out.println("TestCase1");
	}
	@AfterMethod
	public void aMEthod()
	{
		System.out.println("aMethod");
	}
	@AfterClass
	public void aClass()
	{
		System.out.println("aClass");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
