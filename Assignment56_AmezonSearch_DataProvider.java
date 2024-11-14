package TestNg;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import  org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Assignment56_AmezonSearch_DataProvider {
@DataProvider(name="set1")
public Object[]	[] method1()
{
	return new Object[][] {{"Nepal"},{"India"},{"Pokhara"}};
}
@DataProvider(name="set2")
public Object[][] method2()
{
return new Object[][] {{"Modi"},{"SRk"},{"Salman"}};
}
@Test(dataProvider="set2")
public void search(String input)
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement search=driver.findElement(By.name("q"));
search.sendKeys(input+Keys.ENTER);
}
@DataProvider(name="set3")
public Object[][] method3()
{
return new Object[]	[] {{"1000"},{"500"},{"200"}};
}
public void method(int input)
{
int sum=100+input;
Reporter.log("Addition is  ->"+sum);
System.out.println(sum);
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
