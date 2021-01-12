package gov.sfwmd.Selenium.PumpingSiteStatus;

import java.io.IOException;
import java.text.ParseException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import gov.sfwmd.Selenium.SiteStatus.BasepageSiteStatus;
import gov.sfwmd.Selenium.SiteStatus.SiteSTA1;

public class SiteSTAtest extends BasepageSiteStatus
{

	public SiteSTAtest() throws IOException
	{
		super();
	}
	@BeforeMethod
	public  void dateandtimecheck()
	{
		intilization();
		driver.get("https://apps.sfwmd.gov/staReport/");
	}

@Test
public void checkval() throws InterruptedException, ParseException
{
	SiteSTA1.STAcheckFlowValue();
}
@AfterMethod
public void Teardown()
{
	driver.quit();
}

}
