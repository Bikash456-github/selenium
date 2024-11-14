package pom_objectmodel;

	import org.testng.annotations.Test;

	import source.HomePage;
	import source.Loginpage;

	public class TestCase1 extends launchQuit
	{
		@Test
		public void logintoamazon()
		{
			
			HomePage h1=new HomePage();
			h1.aandlist(driver);
			h1.signin();
			Loginpage l1=new Loginpage(driver);
			l1.un();
			l1.un_continue();
			l1.pwd();
			l1.pwd_signin();
			
			
		}
	}

