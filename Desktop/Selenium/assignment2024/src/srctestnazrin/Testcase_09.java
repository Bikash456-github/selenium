package nazrin;

	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.testng.Assert;
	import org.testng.annotations.Test;

import srcmainnazrin.DDT;
import srcmainnazrin.HomePage;
import srcmainnazrin.LoginPage;
import srcmainnazrin.ProceedPage;
import srcmainnazrin.ProductDetail;


	public class Testcase_09 extends LaunchQuit
	{
		@Test(retryAnalyzer = srcmainnazrin.Retry_Analyzer.class)
		public void add_to_shopping_cart() throws EncryptedDocumentException, IOException
		{
			DDT d1 = new DDT();
			d1.ddt_login();
			d1.ddt_search();
			
			HomePage h1 = new HomePage(driver);
			h1.aandl(driver);
			h1.signin();
			
			LoginPage l1 = new LoginPage(driver);
			l1.email();
			l1.continue_un();
			l1.pass();
			l1.sign_in_to_amazon();
			
			h1.search();
			
			ProductDetail p1 = new ProductDetail(driver);
			p1.addItemstocart(driver);
			ProceedPage p2 = new ProceedPage(driver);
			p2.gotoCart();
			
			Assert.assertEquals("Amazon.in Shopping Cart", driver.getTitle());
		}



	}

