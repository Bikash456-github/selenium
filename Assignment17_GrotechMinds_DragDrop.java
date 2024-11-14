package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment17_GrotechMinds_DragDrop {
	
		
		public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		
	WebElement demo1=driver.findElement(By.xpath("//div[@id='container-9']"))	;
	Actions demo2=new Actions(driver);//element should have been select	
		demo2.moveToElement(demo1).perform();
		demo1.click();//select pratice 1 here
		
		}
		
		
		
		
		
		
		
}
