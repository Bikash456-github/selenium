package project1s;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fb_loginpage extends DDT {
	
	public static WebDriver driver;
	//Step1
	@FindBy(id="ap_email")
	WebElement username_id;

	@ FindBy(id="continue")
	WebElement loginbutton;

	@FindBy(id="ap_password")
	WebElement password;

	@ FindBy(id="signInSubmit")
	WebElement signin;
	
	
	//Step2public
	
	public void un()
	{
		
		username_id.sendKeys(un);
	}
	public void pas()
	{
		loginbutton.click();
	}
	public  void login() 
	{
		
		password.sendKeys(pass);	
	}
	public void signin()

	{
		signin.click();
	}

	//step3
	public fb_loginpage(WebDriver driver){

	PageFactory.initElements(driver, this);

	}
	}






