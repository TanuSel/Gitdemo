package gov.sfwmd.Selenium.NexradData;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import gov.sfwmd.Selenium.SiteStatus.BasepageSiteStatus;

public class NexradDataTest extends BasepageSiteStatus
{

	public NexradDataTest() throws IOException
	{
		super();
	}
@BeforeMethod
public void Baseclass() throws InterruptedException
{
	intilization();
	Thread.sleep(1000);
    driver.get("https://apps.sfwmd.gov/nexrad2/nrdmain.action");

}
@Test
public void data() throws InterruptedException
{

	verifyData.clickon();
}
@AfterMethod
public void teardown()
{
	//driver.quit();
}

}
