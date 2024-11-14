package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

@Test
public class Assignment47_Annotations_Class_Method_Test_Suite {
@Test
	public void test()
	{
	System.out.println("test");
	}
	@AfterMethod
	public void aMethod()
	{
		System.out.println("aMethod");
	}
	@BeforeSuite
	public void bSuite()
	{
		System.out.println("bSuite");
	}
	@AfterClass
	public void aClass()
	{
		System.out.println("aClass");
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	

