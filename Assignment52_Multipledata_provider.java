package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment52_Multipledata_provider {

@Test(dataProvider = "login")
public void login_to_facbook(String username,String password) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	WebElement e1=driver.findElement(By.id("email"));
	WebElement e2=driver.findElement(By.id("pass"));
	e1.sendKeys(username);
	e2.sendKeys(password);
}

	@DataProvider(name="login")
	public Object[][] method1()
	{	
	Object data1[][]=new Object[5][2];
	//1st row
	data1[0][0]="Bikash@yahoo.com";
	data1[0][1]="456373";
	
	//2nd
	data1[1][0]="Sarmila@gmail.com";
	data1[1][1]="4344454";
	
	//1nd
	data1[0][0]="Nabinsubedi@gmail.com";
	data1[0][1]="987464743";
	//2nd 
	data1[1][0]="Bikash@gmail.com";
	data1[1][1]="8474937";
	return data1;
	
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

