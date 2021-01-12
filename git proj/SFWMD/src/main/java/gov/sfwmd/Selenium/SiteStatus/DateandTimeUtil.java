package gov.sfwmd.Selenium.SiteStatus;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class DateandTimeUtil extends BasepageSiteStatus
{
	public DateandTimeUtil() throws IOException {
		super();
		
	}

	static SoftAssert softassert1=new SoftAssert();
	public static void  SitesDateAssertmethod(String text1) 
	{
		SimpleDateFormat   sdf= new SimpleDateFormat ("MMM dd,yyyy hh:mm");
	    sdf.setLenient(false);

	      boolean bFlag=false;
	      try {
		        Date Dtt= sdf.parse(text1);
		        System.out.println(" Asserted Date and Time is  :"+text1);
		        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		         bFlag=true;
	           }
	      catch(ParseException e)
	            {
		           Assert.assertTrue(bFlag," Date and Time is not current");
	            }
	}
public static void DateandTimeAssertval(String text) 
{
    	
	SimpleDateFormat   sdf= new SimpleDateFormat ("MM/dd/yyyy hh:mm a");
    sdf.setLenient(false);
      boolean bFlag=false;
      try {
	        Date Dtt= sdf.parse(text);
	        System.out.println(" Asserted Date and Time is  :"+text);
	        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	         bFlag=true;
           }
     
      catch(ParseException e)
        {
       	   	   softassert1.assertTrue(bFlag," Date and Time is not current");
	       	   System.out.println("Date and Time not current");
        }
    	 
    		  
}

public static void BCBDateandTimeAssert(String text)
{
	SimpleDateFormat   sdf= new SimpleDateFormat ("dd, yyyy hh:mm a");
    sdf.setLenient(false);

      boolean bFlag=false;
      try {
	        Date Dtt= sdf.parse(text);
	        System.out.println("Asserted value is current :"+text);
	        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	         bFlag=true;
           }
      catch(ParseException e)
            {
	           Assert.assertTrue(bFlag," value is not current");
            }
}
}

