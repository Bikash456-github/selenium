package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment12_htmlApplication_TagNameLocator {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("file:///Users/bikashdhungana/Downloads/learningHTML1%20-%20Copy.html");
		driver.manage().window().maximize();
		
	WebElement e1	=driver.findElement(By.id("1"));
	boolean b1=e1.isDisplayed();
	System.out.println(b1);		
	boolean b2=e1.isEnabled();
		System.out.println(b2);
		if(b1  &&  b2)
			{
			e1.sendKeys("BIKASH456");
			}	
	else
	
		{
		System.out.println("Cannot perform");
		}
	}
}
