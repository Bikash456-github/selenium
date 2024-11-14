package selenium1;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8_GetWindowHandle_GetWindowHandles_amzn {
	
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		String parentId=driver.getWindowHandle();
		System.out.println(parentId);
		Set<String> parentchild=driver.getWindowHandles();
		System.out.println(parentchild);
		
		
		
		

}
}