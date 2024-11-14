package selenium1;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Assignment35_ScreenShot_Amezon {

	public static void main(String[] args) throws IOException  {
	
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.ebay.com");//Screenshot amazon not working
TakesScreenshot ts=driver;
File sourceFile=ts.getScreenshotAs(OutputType.FILE);
File destination=new File("/Users/bikashdhungana/Desktop//bks"+Math.random() +".png");
FileHandler.copy(sourceFile, destination);
driver.quit();
		
		
	}

}
