package gov.sfwmd.Selenium.PumpingSiteStatus;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import gov.sfwmd.Selenium.SiteStatus.BCBDateandTime;
import gov.sfwmd.Selenium.SiteStatus.BasepageSiteStatus;
import gov.sfwmd.Selenium.SiteStatus.DateandTimeUtil;

public class BCB7test extends BasepageSiteStatus {

	public BCB7test() throws IOException {
		super();
		
	}
	@BeforeMethod
	public  void BCB7dateandtimecheck()
	{
		intilization();
		driver.get("https://apps.sfwmd.gov/rainfall-report/#/mapsevenday");

		}
	@Test
	public void BCB24test() throws InterruptedException
	{
		String T1=BCBDateandTime.DateandTime7day();
		DateandTimeUtil.BCBDateandTimeAssert(T1);;
	}
	@AfterMethod
	public void Tear2down()
	{
		driver.quit();
    }

}
