package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment23_Google_AutoSuggestion_PrintAll {

	
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			Thread.sleep(2000);
			WebElement txtBox_search=driver.findElement(By.id("APjFqb"));
			txtBox_search.sendKeys("Nepal");
			txtBox_search.sendKeys(Keys.ENTER);
			List<WebElement>li=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
			for(int i=0;i<li.size();i++)
			{
				WebElement auto1=li.get(i);
				System.out.println(auto1.getText());
				
			}
	}

}
