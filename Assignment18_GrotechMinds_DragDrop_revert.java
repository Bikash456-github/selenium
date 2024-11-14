package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment18_GrotechMinds_DragDrop_revert {

	public static void main(String[] args) {
		

	
			ChromeDriver driver= new ChromeDriver();
			driver.get("https://grotechminds.com/drag-and-drop/");
			driver.manage().window().maximize();
			WebElement e2_json = driver.findElement(By.xpath("//div[@id='container-5']"));
			WebElement e1_targetBox = driver.findElement(By.xpath("//div[@id='div2']"));
			Actions json_DragDrop = new Actions(driver);
			json_DragDrop.dragAndDrop(e2_json, e1_targetBox).perform();
			
			
		
		
		
		
		
		
		
	}

}
