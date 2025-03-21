package project1a;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class  Itestlistener1 implements ITestListener
{
 	static WebDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
	
		ITestListener.super.onTestStart(result);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		ITestListener.super.onTestSuccess(result);
		
		Reporter.log("Bikash takes screenshot and pass test  successful");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("/Users/bikashdhungana/Desktop/Selenium 2/FirstMavenproject/src/test/java/project1a/screenshots/pass//bks"+Math.random()+".png");
		
		try {
			FileHandler.copy(sourceFile, destination);
		}catch(IOException e) {
			e.printStackTrace();
		
		}
	}
	@Override
	public void onTestFailure(ITestResult result) {
		
		ITestListener.super.onTestFailure(result);
		Reporter.log("Test fail");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("/Users/bikashdhungana/Desktop/Selenium 2/FirstMavenproject/src/test/java/project1a/screenshot/fail//bks"+Math.random()+".png");
		try {
			FileHandler.copy(sourceFile, destination);
		}catch(IOException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		
		ITestListener.super.onFinish(context);
	}

}
