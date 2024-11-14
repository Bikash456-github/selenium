package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reporter_log {
@Test(priority=2)
public void login()
{
	
}
@Test(priority=4)
public void logout()	
{
	
}
@Test(priority=1)
public void registration()	
{
Reporter.log("Bikashdhungana");	
}

	
}


