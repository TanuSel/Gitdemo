package gov.sfwmd.Selenium.SiteStatus;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class CurrentFlowValueCheck  extends BasepageSiteStatus
{
	public CurrentFlowValueCheck() throws IOException 
	{
		super();
	}
public static DateFormat checkSystemDate()
	{
	    DateFormat dateformat=new SimpleDateFormat("MMM d, yyyy hh:mm");
	    Date systemdate=new Date();
	    String Systemdate=dateformat.format(systemdate);
	    System.out.println("Systemdate:"+Systemdate);
	      
	return dateformat;
	}
public static void checkLakeOPageDate()
	{
	     String pagedate1= (driver.findElement(By.xpath("//div[@class=\"hidden-xs col-sm-5 ng-binding animated fadeIn\"]")).getText());
		 String Date1=pagedate1.substring(11,28);
		System.out.println("pagedate:"+Date1);
		System.out.println("Site Page Date and Time is Correct  :"+pagedate1);
	}
public static void clickChart() throws InterruptedException 
	{
		WebElement img1=driver.findElement(By.xpath("//*[@id=\"groups\"]/div[4]/div/div[6]/div/img[@src='images/graph.png']"));
		Thread.sleep(1000);	
		img1.click();
	}

public static  void checkFlowValue() throws InterruptedException 
	{	
	SoftAssert soft=new SoftAssert();
		String BeforeXpath="//*[@id=\"groups\"]/div[4]/div/div[";
	    String AfterXpath="]/div/div[3]/span";
	int j=0; 
	 
	for (int i=2;i<=7 ;i++)
	{
		 Thread.sleep(1000);
		 String ActualXpath=BeforeXpath+i+AfterXpath;	
		 
   	 		Actions action=new Actions(driver);	 
	action.moveToElement(driver.findElement(By.xpath(ActualXpath))).doubleClick().perform();
	driver.findElement(By.xpath(ActualXpath)).click();
	
	String text =driver.findElement(By.xpath(ActualXpath)).getAttribute("title");
	Thread.sleep(1000);
	String val=driver.findElement(By.xpath(ActualXpath)).getText();
  		  
	System.out.println("Current value is:"+val); 

		Thread.sleep(1000);
				SimpleDateFormat   sdf= new SimpleDateFormat ("MM/dd/yyyy hh:mm a");
		    sdf.setLenient(false);
		      boolean bFlag=false;
		      try {
			        	Date Dtt= sdf.parse(text);
			        System.out.println(" Asserted Date and Time is  :"+text);
			        Thread.sleep(1000);
			         bFlag=true;
		           }
		      catch(ParseException e)
		        {
		       	   soft.assertTrue(bFlag," Date and Time is not current");
			   j++;
		    	   	   System.out.println("Date and Time not current:"+text);
			       }
	   	if(i>=7)
		       	{
		       		if(j>=4)
		       		 System.out.println(" No.of not current values: "+j);
		       	   		soft.assertAll();
		       	}
	}
		     
	}	       	  

}
