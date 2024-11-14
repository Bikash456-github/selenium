package assignment71_Retring_Failed_TestCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;
@Test
public class IRetryAnalyzerlogic implements IRetryAnalyzer
{
	int inititalcount=0;
	int retrycount=2;

	@Override
	public boolean retry(ITestResult result) 
	{
		if(inititalcount<retrycount)
		{	
			inititalcount++;
		return true;
	}
		return false;
	}
	
	
	
	
	
	
}
