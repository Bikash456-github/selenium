package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_popup_handle {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	driver.get("https://grotechminds.com/javascript-popup/");
	
System.out.println(driver.switchTo().alert().getText());
driver.switchTo().alert().accept();
	System.out.println(driver.getTitle());
	

	}

}
