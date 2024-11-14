package selenium1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
public class Amazonbooks {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//sample x path By.xpath("(//i[@class=\"icp-radio\"])[1]"));
		
		//WebElement e1=driver.findElement(By.xpath("//span[@class='_1XjE3T']"));
		WebElement e1=driver.findElement(By.xpath("//span[@class='_1XjE3T'][2]"));
		e1.click();
		
		
		
WebElement e3=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
e3.sendKeys("shoes"+Keys.ENTER);

WebElement e2=driver.findElement(By.xpath("//span[@class='mEh187']"));
e2.click();
Thread.sleep(1000);
		/*
		e1.sendKeys(Keys.ENTER);
		
		WebElement e2=driver.findElement(By.xpath("//span[@class='nav-line-2'][2]"));
		e2.click();
		
	
		
		WebElement e5=	driver.findElement(By.xpath("//button[@class='QqFHMw cNEU5Q J9Kkbj _7Pd1Fp']"));
		e5.click();
		
	WebElement e3=	driver.findElement(By.className("VU-ZEz"));
	e3.click();
		
WebElement e4=	driver.findElement(By.className("XWLYwr"));
	e4.click();
	 Set<String>s1=driver.getWindowHandles();
		Iterator<String> i1= s1.iterator();
		String parentid =i1.next();
		String childid=i1.next();
		driver.switchTo().window(childid);
	
	
		Actions a2=new Actions(driver);
		((Actions) a2).moveToElement(e1).perform();
	*/
	
	
		
	}

}
