package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment22_FlipKart_AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		WebElement txtBox_Search=driver.findElement(By.name(""));
		txtBox_Search.sendKeys("");//mobile
		Thread.sleep(2000);
		List<WebElement>li=driver.findElements(By.xpath(""));
		WebElement lastItems=li.get(li.size()-1);
		lastItems.click();
	}

}
