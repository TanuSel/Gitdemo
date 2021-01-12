package gov.sfwmd.Selenium.PumpingSiteStatus;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import gov.sfwmd.Selenium.SiteStatus.BCBDateandTime;
import gov.sfwmd.Selenium.SiteStatus.BasepageSiteStatus;
import gov.sfwmd.Selenium.SiteStatus.DateandTimeUtil;

public class BCB7to7test extends BasepageSiteStatus {
	public BCB7to7test() throws IOException {
		super();
	}
	@BeforeMethod
	public  void BCD1dateandtimecheck()
	{
		intilization();
		driver.get("https://apps.sfwmd.gov/rainfall-report/#/mapseventoseven");

		}
	@Test
	public void BCD1test() throws InterruptedException
	{
		String T1=BCBDateandTime.DateandTime7Amto7Pm();
		DateandTimeUtil.BCBDateandTimeAssert(T1);;
	}
	@AfterMethod
	public void Tear1down()
	{
		driver.quit();
    }

}
