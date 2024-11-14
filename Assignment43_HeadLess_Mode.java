package TestNg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment43_HeadLess_Mode {


	public static void main(String[] args) {
		ChromeOptions c1=new ChromeOptions();
		ChromeDriver driver=new ChromeDriver(c1);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
			
		List<WebElement> li=driver.findElements(By.tagName("a"));
    System.out.println(li.size());
      for (int i=0;i<li.size();i++)
         {
	WebElement list_li=li.get(i);
	String url=list_li.getAttribute("href");
	System.out.println(url);
         }
	

	}
	}
	