package pom_objectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Case1another {

	//Step1
	WebDriver driver;
	@FindBy(id="")
	WebElement username;
	
	@FindBy(name="")
	WebElement psw;
	
	@FindBy(xpath="")
	WebElement login;
	
	public void un()
	{
		username.sendKeys("bikash@gmail.com");
	}
	
	public void pss()
	{
		psw.sendKeys("Rakesh@345");
	}
	
	public void login()
	{
		login.click();
	}
	
}
