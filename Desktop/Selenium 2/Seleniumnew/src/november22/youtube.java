package november22;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class youtube {
public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.Amazon.in");
	driver.manage().window().maximize();
	Select m1=	new Select(driver.findElement(By.id("searchDropdownBox")));
	m1.selectByValue("search-alias=electronics");
WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
e1.sendKeys("Apple iPhone 13 (128GB) - Starlight"+Keys.ENTER);
WebElement e2=	driver.findElement(By.xpath("//a[@class=\"a-link-normal s-no-outline\"][1]"));
e2.click();
Set<String>s1=driver.getWindowHandles();
Iterator<String> i1= s1.iterator();
String parentid =i1.next();
String childid=i1.next();
System.out.println(parentid);
driver.switchTo().window(childid);
WebElement e3=	driver.findElement(By.id("buy-now-button"));
e3.click();
WebElement email=	driver.findElement(By.xpath("//input[@name='email']"));
email.sendKeys("Bikashdhungana651@gmail.com");
WebElement continue1=	driver.findElement(By.id("continue"));
continue1.click();
WebElement pass=	driver.findElement(By.id("ap_password"));
pass.sendKeys("Sarmilaamerica123$");
WebElement signin=	driver.findElement(By.id("signInSubmit"));
signin.click();

WebElement payment =driver.findElement(By.name("ppw-instrumentRowSelection"));
payment.click();

WebElement carddetails= driver.findElement(By.linkText("Enter card details"));//
carddetails.click();

WebElement cardnumber= driver.findElement(By.name("addCreditCardNumber"));
cardnumber.sendKeys("459156060789099");

WebElement iframe=	driver.findElement(By.name("ApxSecureIframe-pp-xmTlD0-8"));

driver.switchTo().frame(iframe);




driver.switchTo().defaultContent();

}
}