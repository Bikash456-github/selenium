package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment19_GrotechMinds_DropDown {

	public static void main(String[] args)throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		Thread.sleep(2000);
			
	WebElement name =	    driver.findElement(By.id("fname"));
		name.sendKeys("BIKASH");
		Thread.sleep(1000);
		
		WebElement title =	    driver.findElement(By.id("lname"));
		title.sendKeys("DHUNGANA");
		Thread.sleep(1000);
		
		WebElement email =	    driver.findElement(By.id("email"));
		email.sendKeys("DHUNGANABIKASH@yahoo.com");
		Thread.sleep(2000);
		
		WebElement PSW =	    driver.findElement(By.id("password"));
		PSW.sendKeys("DHUNGANA");
		Thread.sleep(1000);
		
		 WebElement gen1 =driver.findElement(By.id("male"));
		 gen1.click();
		 Thread.sleep(1000);
		
		WebElement tec=driver.findElement(By.id("technicalskills"));
		Select sc=new Select(tec);
		sc.selectByIndex(3);
		 Thread.sleep(1000);
		
		WebElement country=driver.findElement(By.id("Country"));
		Select s1=new Select(country);
		s1.selectByValue("Nepal");
		Thread.sleep(1000);
	
		WebElement Address =driver.findElement(By.id("Present-Address"));
		Address.sendKeys("USA");
		Thread.sleep(1000);
		Address.sendKeys(Keys.CONTROL+"a");
		Address.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(1000);
		
		WebElement Address2 =driver.findElement(By.id("Permanent-Address"));
		Address2.sendKeys(Keys.CONTROL+"POKHARA");
		Thread.sleep(1000);
			
		WebElement pincode=	driver.findElement(By.id("Pincode"));
	     pincode.sendKeys("345");
	     Thread.sleep(1000);
		
	    WebElement rel=  driver.findElement(By.id("Relegion"));
	 	Select s2=new Select (rel);
		s2.selectByVisibleText("hindu");
		Thread.sleep(1000);
		
		WebElement file=driver.findElement(By.id("file"));
		file.sendKeys("");
		WebElement sub=driver.findElement(By.name("Submit"));
		sub.click();
		Thread.sleep(1000);
		
	
		
	
		
		
		
	}

}
