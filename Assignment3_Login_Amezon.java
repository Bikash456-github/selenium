package selenium1;
//assignment2
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3_Login_Amezon {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.uk/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Samsungs24 ultrra");
		driver.findElement(By.name("btnI")).click();
	}

}
