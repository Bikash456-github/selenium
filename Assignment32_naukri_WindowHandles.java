package selenium1;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment32_naukri_WindowHandles {
//Assignment32
	public static void main(String[] args) throws InterruptedException {
	
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
			WebElement e1=	driver.findElement(By.xpath("//span[.='Google']"));	
			e1.click();
			Set<String> s1=	driver.getWindowHandles();
			
			System.out.println(s1);
			
			Iterator<String> s1i = s1.iterator();
			String parent_id = s1i.next();
			String child_id = s1i.next();
			
			driver.switchTo().window(child_id);
			WebElement email = driver.findElement(By.id("identifierId"));
			email.sendKeys("abcd@xyz.com");
			
			
					
		}
		
	}


