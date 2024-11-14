package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5_SearchGTM_YouTube_IDLocator {

	public static void main(String[] args) {

		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();

		
		driver.findElement(By.id("search")).sendKeys("Grotechminds");
		driver.findElement(By.id("search-input")).sendKeys(Keys.ENTER);
	}

}
