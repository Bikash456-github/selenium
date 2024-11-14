package selenium1;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment36_ScreenShot_At_WrongLocation_Amezon2 {
	public static void main(String[] args) {
		
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize(); 	
	
	TakesScreenshot ts=	driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\MKT\\Desktop\\AB45\\"+new Assignment36_ScreenShot_At_WrongLocation_Amezon2().getClass()+".png");
	//FileHandler.copy(source, destination);
	
	
}
}