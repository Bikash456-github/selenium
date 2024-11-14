package TestNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class Assignment50_Annotations_Method_Three_Test {
@BeforeMethod
public void bMethod()
{
	System.out.println("bMEthod");
}	
@Test	
	public void test2()
	{
	System.out.println("test2");
	}
	@Test
	public void test()
	{
		System.out.println("test");
	}
	@AfterMethod()
	public void aMethod()
	{
		System.out.println("aMethod");
	}
	@Test
	public void test3()
	{
		System.out.println("test3");
	}
	
	
}
