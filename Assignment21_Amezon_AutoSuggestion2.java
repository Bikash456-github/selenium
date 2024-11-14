package selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment21_Amezon_AutoSuggestion2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();	

	WebElement txtBox_Search=driver.findElement(By.id("twotabsearchtextbox"));
	txtBox_Search.sendKeys("shoes"+Keys.ENTER);
	Thread.sleep(1000);
	WebElement l2=driver.findElement(By.xpath("//div[@class='two-pane-results-container']/div/div)[2]\")"));
		l2.click();
		
		
		
		
	}

}
