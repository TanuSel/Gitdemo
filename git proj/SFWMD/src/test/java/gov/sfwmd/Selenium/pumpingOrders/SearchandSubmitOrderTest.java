package gov.sfwmd.Selenium.pumpingOrders;

import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchandSubmitOrderTest extends Basepage
{
	 static Loginpage1 loginpage;
	 static PumpingOrderspage pumping;
		public SearchandSubmitOrderTest() throws IOException 
		{

			super();
		}
		@BeforeMethod 
		public void Setup() throws IOException 
		{
			intilization();
			loginpage = new Loginpage1();
			loginpage.Login(prop.getProperty("TUname"),prop.getProperty("Tpassword"));
		}
		
		@Test(priority=1)
		public void SearchOrders() throws InterruptedException, IOException
		{	pumping=new PumpingOrderspage();
			pumping.search();
			
		}
		@Test(priority=2)
		public void SubmitOrder() throws InterruptedException, IOException
		{
			pumping=new PumpingOrderspage();
			pumping.search();
			pumping.Checkingmail();
		}
		@AfterMethod
		public void exitout()
		{
		
			driver.quit();
		}

}
