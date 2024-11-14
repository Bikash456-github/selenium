package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment26_SBI_Login_without_rightClick {
	public static void main(String[] args) {
		//SBI indian bank 
		//driver.get("file:///Users/bikashdhungana/Downloads/learningHTML1%20-%20Copy.html");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		
		
		WebElement e1=driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		e1.click();
		
		WebElement e2=driver.findElement(By.id("username"));
		e2.sendKeys("Bikash");
		
		WebElement e3=driver.findElement(By.name("password"));
		e3.sendKeys("Dhungana");
		
		driver.quit();
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
