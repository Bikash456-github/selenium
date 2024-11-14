package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment42_YouTube_ScrollDown_Infinite {
	
public static void main(String[] args)throws InterruptedException {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	WebElement e1=driver.findElement(By.xpath("//input[@id='search']"));
	e1.sendKeys("Nepal");
	e1.sendKeys(Keys.ENTER);
	Point p1=e1.getLocation();//it is an abstract method of WebElement interface
	int x=p1.getX();//it is point method and help to find you the coordinate of x
	int y=p1.getY();//it is point method and help to find you the coordinate of y
	System.out.println(x);
	System.out.println(y);
	Thread.sleep(1000);
	JavascriptExecutor js=driver;//UPcasting driver to JavascriptExecutor
	js.executeScript("win-dow.scrollBy(0,"+y+")");//utilizing a method called executeScript
	System.out.println(y);
	y++;
}
	
	
	
	
}
