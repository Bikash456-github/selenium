package selenium1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment14_FlipKartLogin_xpath_wth_TxtMsg {
public static void main(String[] args) throws InterruptedException {
	

	
	
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	WebElement e3=driver.findElement(By.xpath("//input[@type='text']"));
	e3.sendKeys("shoes"+Keys.ENTER);
	
	WebElement e2=driver.findElement(By.xpath("//a[@class='WKTcLC']"));
	e2.click();         //a[@class=\"WKTcLC\”])[2]
	
	
	Thread.sleep(1000);
	Set<String>s1=driver.getWindowHandles();
	Iterator<String> i1= s1.iterator();
	String parentid =i1.next();
	String childid=i1.next();
	driver.switchTo().window(childid);
	//WebElement e3=driver.findElement(By.id("add-to-cart-button"));
//	e3.click();
	
	
	
	
	
	
}
}