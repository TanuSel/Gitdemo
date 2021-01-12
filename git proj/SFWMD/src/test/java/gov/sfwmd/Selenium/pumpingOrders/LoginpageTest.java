package gov.sfwmd.Selenium.pumpingOrders;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginpageTest extends Basepage
  {
	Loginpage1 Loginpage;
	
	public LoginpageTest() throws IOException
	{
		super(); 
	}
	@BeforeMethod 
	public void Setup() throws IOException 
	{
		intilization();
		Loginpage = new Loginpage1();
		
	}
		
	@Test()
	public void Login() 
	{
		Loginpage.Login(prop.getProperty("TUname"),prop.getProperty("Tpassword"));	
	String title=Loginpage.title();
	Assert.assertEquals(title,"NetScaler AAA");
	}
@AfterMethod
public void exitout()
{
	driver.quit();
}

}
