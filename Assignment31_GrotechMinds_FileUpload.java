package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment31_GrotechMinds_FileUpload {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
WebElement fName=driver.findElement(By.id("fname"));		
	fName.sendKeys("bikash");
	
	WebElement LName=driver.findElement(By.name("lname"));		
	LName.sendKeys("Dhungana");	
		
	WebElement email=driver.findElement(By.xpath("//input[@class='email form-control ']"));		
	email.sendKeys("Dhungana@yahoo.com");	
	
	WebElement password=driver.findElement(By.id("password"));		
	password.sendKeys("yahoo123$");	
	
	WebElement Radiobtn=driver.findElement(By.id("male"));		
	Radiobtn.click();
	
	WebElement skills=driver.findElement(By.id("Skills"));		
	Select skill =new Select(skills);
	skill.selectByValue("select2");
	
	WebElement option2 =driver.findElement(By.id("nontechnicalskills"));
	Select law =new Select(option2);
	law.selectByValue("Law");
	Thread.sleep(1000);
	
	WebElement drpDwn_country=driver.findElement(By.id("Country"));		
	Select country =new Select(drpDwn_country);
	country.selectByVisibleText("Nepal");
	
	WebElement present_Addr = driver.findElement(By.id("Present-Address"));
	present_Addr.sendKeys("USA");
	
	WebElement permnt_Addr = driver.findElement(By.id("Permanent-Address"));
	permnt_Addr.sendKeys("Nepal");
	Thread.sleep(1000);
	
	WebElement pincode=driver.findElement(By.id("Pincode"));		
	pincode.sendKeys("45763");
	
	WebElement r1=driver.findElement(By.id("Relegion"));
	Select Relegioun =new Select (r1);
	Relegioun.selectByVisibleText("Hindu");
	Thread.sleep(1000);
WebElement fileUpload =driver.findElement(By.id("file"));
fileUpload.sendKeys("/Users/bikashdhungana/Desktop/M.jpeg");

WebElement chkBox_relocate=driver.findElement(By.id("relocate"));
chkBox_relocate.click();

WebElement btn_submit=driver.findElement(By.name("Submit"));
btn_submit.click();

	}

}
