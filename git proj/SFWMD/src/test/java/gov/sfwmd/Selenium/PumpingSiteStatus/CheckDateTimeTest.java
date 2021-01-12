package gov.sfwmd.Selenium.PumpingSiteStatus;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import gov.sfwmd.Selenium.SiteStatus.BasepageSiteStatus;
import gov.sfwmd.Selenium.SiteStatus.CurrentFlowValueCheck;
import gov.sfwmd.Selenium.SiteStatus.DateAndTimecheckpage;
import gov.sfwmd.Selenium.SiteStatus.DateandTimeUtil;

public class CheckDateTimeTest extends BasepageSiteStatus

{
	public CheckDateTimeTest() throws IOException
	{
		super();
		
	}
	

@BeforeMethod
public  void dateandtimecheck()
 {
	intilization();
	driver.get(prop.getProperty("sitestatusURL"));

 }

@Test(priority=3)
public void checkvalupdated() throws InterruptedException 
{
 Thread.sleep(1000);
		 CurrentFlowValueCheck.checkFlowValue();
	 
  }
@Test(priority=1)
public void pagecheckTimeValue() throws InterruptedException 
{
	CurrentFlowValueCheck.checkSystemDate();
	Thread.sleep(1000);
	
  String T1= DateAndTimecheckpage.CheckKissimmeePageDate();
  Thread.sleep(1000);
   DateandTimeUtil.SitesDateAssertmethod(T1);
  String T2= DateAndTimecheckpage.CheckKissimmee_RiverPageDate();
  Thread.sleep(1000);
   DateandTimeUtil.SitesDateAssertmethod(T2);
  String T3= DateAndTimecheckpage.CheckEAApageDate();
  Thread.sleep(1000);
   DateandTimeUtil.SitesDateAssertmethod(T3);
  String T4= DateAndTimecheckpage.CheckRotenbergerpageDate();
  Thread.sleep(1000);
   DateandTimeUtil.SitesDateAssertmethod(T4);
  String T5= DateAndTimecheckpage.CheckWCAspageDate();
  Thread.sleep(1000);
   DateandTimeUtil.SitesDateAssertmethod(T5);
   String T6=DateAndTimecheckpage.CheckSouthDadepageDate();
   Thread.sleep(1000);
   DateandTimeUtil.SitesDateAssertmethod(T6);
   String T7=DateAndTimecheckpage.CheckEastCoastCanalspageDate();
   Thread.sleep(1000);
   DateandTimeUtil.SitesDateAssertmethod(T7);
  String T8= DateAndTimecheckpage.CheckBCBpageDate();
  Thread.sleep(1000);
  DateandTimeUtil.SitesDateAssertmethod(T8);
   
 }
@Test(priority=2)
public void pageclickchart() throws InterruptedException
{
	CurrentFlowValueCheck.clickChart();
}
@AfterMethod
public void Teardown()
{ 
	//driver.quit();
}

}
