package fb_test;
import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Fb_LoginPage
	{
	//step 1
		WebDriver driver;
		@FindBy(id="email") 
		WebElement username_tf;
		
		@FindBy(name="pass") 
		WebElement password_tf;
		
		@FindBy(xpath="//button[@name='login']") 
		WebElement login_button;
		
		//step 2
		public void un()
		{
			username_tf.sendKeys("Bikash456@yahoo.com");
		}
		public void pwd()
		{
			password_tf.sendKeys("rakesh123");
		}
		public void login()
		{
			login_button.click();
		}
		//step 3
		public Fb_LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this );
		}
		
	}

