package selenium1;

import java.sql.Date;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment37_ScreenShot_With_DateTime_Amezon {

	public static void main(String[] args)throws InterruptedException  {
		
	ChromeDriver driver=new ChromeDriver()	;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//driver.get("driver.get(\"https://www.google.co.uk/\");");
		driver.get("https://www.google.com/");
		Date d1=new Date(1);
		Date p_Date=new Date(d1.getTime());
		System.out.println(p_Date);
		
	}

}
