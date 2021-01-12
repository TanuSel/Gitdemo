package gov.sfwmd.Selenium.PumpingSiteStatus;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import gov.sfwmd.Selenium.SiteStatus.BCBDateandTime;
import gov.sfwmd.Selenium.SiteStatus.BasepageSiteStatus;
import gov.sfwmd.Selenium.SiteStatus.DateandTimeUtil;

public class BCB24test extends BasepageSiteStatus
{
	public BCB24test() throws IOException
	{
		super();
		
	}
	@BeforeMethod
	public  void BCBdateandtimecheck()
	{
		intilization();
		driver.get("https://apps.sfwmd.gov/rainfall-report/#/maptwentyfourhour");

		}
	@Test
	public void BCBtest() throws InterruptedException
	{
		String T1=BCBDateandTime.DateandTime24hr();
		DateandTimeUtil.BCBDateandTimeAssert(T1);;
	}
	@AfterMethod
	public void Teardown()
	{
		//driver.quit();
    }

}
