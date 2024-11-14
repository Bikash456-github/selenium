package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		driver.quit();
		
		
		
		
		
		

	}

}
