package TestNg;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment52_Final {
ChromeDriver driver;
@BeforeMethod
public void Lunchebay()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ebay.com/");
	
}
@Test
public void searchproduct()
{
WebElement txtbox_search=driver.findElement(By.xpath("//input[@id='gh-ac']"));
	txtbox_search.sendKeys("i phone"+Keys.ENTER);
}	
@Test
public void addWishList()
{
	WebElement txtbox_search=driver.findElement(By.xpath("//input[@id='gh-ac']"));
	txtbox_search.sendKeys("I phone"+Keys.ENTER);
	WebElement iphone1st=driver.findElement(By.xpath("//span[@class='ux-call-to-action__text'])[2]\"))"));
	iphone1st.click();
	//add to wishList
	Set<String> s1=driver.getWindowHandles();
	Iterator<String> is1=s1.iterator();
	String parentID=is1.next();
	String childID=is1.next();
	System.out.println(parentID);
	driver.switchTo().window(childID);
	WebElement btn_wishList=driver.findElement(By.id("//span[@class='ux-call-to-action__text'])[3]\"))"));
	btn_wishList.click();
}
@AfterMethod
public void closeBrowser()
{
	driver.quit();
}


}
