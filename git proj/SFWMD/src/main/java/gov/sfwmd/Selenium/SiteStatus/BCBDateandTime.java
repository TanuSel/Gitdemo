package gov.sfwmd.Selenium.SiteStatus;

import java.io.IOException;

import org.openqa.selenium.By;

public class BCBDateandTime extends BasepageSiteStatus
{

	public BCBDateandTime() throws IOException
	{
		super();
	}
public static String DateandTime24hr() throws InterruptedException
{
	 
	 String pagedate1= (driver.findElement(By.xpath("//div[@class='updated-date ng-binding']"))).getText();
	 String Date1=pagedate1.substring(12,28);
	System.out.println("pagedate:"+Date1);
	System.out.println("Site BigCypressBasin Page Date and Time is Correct 24hr :"+Date1);
	return Date1;
}
public static String DateandTime7Amto7Pm() throws InterruptedException
{
	String pagedate1= (driver.findElement(By.xpath("//div[@class='updated-date ng-binding']"))).getText();
	 String Date1=pagedate1.substring(12,28);
	System.out.println("pagedate:"+Date1);
	System.out.println("Site BigCypressBasin Page Date and Time is Correct 7Amto7Pm :"+Date1);
	return Date1;
}
public static String DateandTime7day()
{
	String pagedate1= (driver.findElement(By.xpath("//div[@class='updated-date ng-binding']"))).getText();
	 String Date1=pagedate1.substring(12,28);
	System.out.println("pagedate:"+Date1);
	System.out.println("Site BigCypressBasin Page Date and Time is Correct 7day :"+Date1);
	return Date1;
	
}

}
