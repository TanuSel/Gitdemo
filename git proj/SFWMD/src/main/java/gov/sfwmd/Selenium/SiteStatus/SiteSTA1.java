package gov.sfwmd.Selenium.SiteStatus;

import java.io.IOException;
import java.text.ParseException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class SiteSTA1 extends BasepageSiteStatus
{

	public SiteSTA1() throws IOException
	{
		super();
	}
public static void STA1()
{
	//driver.findElement(By.xpath("//a[@title='STA Report']")).click();
	    String pagedate1= (driver.findElement(By.xpath("//div[@class=\"hidden-xs col-sm-5 ng-binding animated fadeIn\"]")).getText());
		 String Date1=pagedate1.substring(11,28);
		System.out.println("pagedate:"+Date1);
		System.out.println("Site Page Date and Time is Correct  :"+pagedate1);
	

}
public static void STAcheckFlowValue() throws InterruptedException, ParseException 
{	
	String BeforeXpath="//div[@id=\"container\"]/div/table/tbody/tr[";
    String AfterXpath="]/td[8]/span/span";

   for (int i=18;i<=30;i=i+4)
 {	 
    String ActualXpath=BeforeXpath+i+AfterXpath;
Thread.sleep(1000);
    Actions action=new Actions(driver);	 
    action.moveToElement(driver.findElement(By.xpath(ActualXpath))).perform(); 
    Thread.sleep(1000); 
    String text=driver.findElement(By.xpath(ActualXpath)).getAttribute("title");
    
    String val=driver.findElement(By.xpath(ActualXpath)).getText();
   
         System.out.println("Current value of STA Report:"+val); 
         System.out.println("Current value updated date and Time of STA Site:"+text);
         Thread.sleep(1000);
 }
}

}
