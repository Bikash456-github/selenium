package selenium1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment33_Amezon_WindowHandles_AddCart {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
	
		
		Thread.sleep(1000);
		
		WebElement e1=driver.findElement(By.xpath("//input[@id='gh-ac']"));
		e1.sendKeys("i phone 16"+Keys.ENTER);
		Thread.sleep(1000);
		
	WebElement e5=driver.findElement(By.xpath("//div[@class='s-item__title']"));
		e5.click();
	  //  WebElement e2=driver.findElement(By.xpath("//span[@class='ux-textspans ux-textspans--BOLD'][2]"));
	   //  e2.click();
   // WebElement e3  =driver.findElement(By.xpath("//a[@id='atcBtn_btn_1']"));
	//e3.click();
	
     	Thread.sleep(1000);
        WebElement Add= driver.findElement(By.id("atcBtn_btn_1"));
		Add.click();
		Set<String>s1=driver.getWindowHandles();
		Iterator<String> i1= s1.iterator();
		String parentid =i1.next();
		String childid=i1.next();
		WebElement e4=driver.findElement(By.id("atcBtn_btn_1"));
		e4.click();
		
	
	}

}
