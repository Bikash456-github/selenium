package assignment71_Retring_Failed_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class iretrylogicgoogle {
	@Test(retryAnalyzer=assignment71_Retring_Failed_TestCases.IRetryAnalyzerlogic.class)
	
public void test() {
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com");
	WebElement search=driver.findElement(By.name("q"));
	search.sendKeys("Nepal"+Keys.ENTER);
	
	
}
}