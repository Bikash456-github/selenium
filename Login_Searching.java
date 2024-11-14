package fb_test;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	
	public class Login_Searching
	{

		@Test
		public void login_to_facebook_with_valid_data()
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			Fb_LoginPage f1=new Fb_LoginPage(driver);
			f1.un();
			f1.pwd();
			f1.login();
			
			
			
		}
	}

