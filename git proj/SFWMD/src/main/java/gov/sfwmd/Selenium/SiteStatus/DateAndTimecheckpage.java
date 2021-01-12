package gov.sfwmd.Selenium.SiteStatus;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class DateAndTimecheckpage  extends BasepageSiteStatus
{ 
	
	public DateAndTimecheckpage() throws IOException
	{
		super();

	}
	public static void   checkSystemDate()
	{
		
		DateFormat dateformat=new SimpleDateFormat("MMM d, yyyy hh:mm:ss");
	    Date systemdate=new Date();
	    String Systemdate=dateformat.format(systemdate);
	    System.out.println("Systemdate:"+Systemdate);
	
	}
	public static void CheckLakeOPageDate()
	{               
	   String pagedate1= (driver.findElement(By.xpath("//div[@class=\"hidden-xs col-sm-5 ng-binding animated fadeIn\"]")).getText());
	   System.out.println("Site LakeO Page Date and Time is Correct  :"+ pagedate1);
		 
	}
	public static String CheckKissimmeePageDate() throws InterruptedException 
	{
		 driver.findElement(By.xpath("//a[@title='Kissimmee Basin - Upper Chain of Lakes']")).click();
	    String pagedate1= (driver.findElement(By.xpath("//div[@class=\"hidden-xs col-sm-5 ng-binding animated fadeIn\"]")).getText());
	    Thread.sleep(1000);
	    System.out.println("Site Kissimmee Page Date and Time is Correct  :"+ pagedate1);
	    String Date1=pagedate1.substring(11,28  );
	    return  Date1;
	}
	public static String CheckKissimmee_RiverPageDate()
	{
		     driver.findElement(By.xpath("//a[@title='Kissimmee River / Istokpoga Basin Control Structures']")).click();
	    String pagedate1= (driver.findElement(By.xpath("//div[@class=\"hidden-xs col-sm-5 ng-binding animated fadeIn\"]")).getText());
		System.out.println("Site Kissimmee_River Page Date and Time is Correct  :"+ pagedate1);
		 String Date1=pagedate1.substring(11,28);
		    return  Date1;
	}
	public static String CheckEAApageDate() throws InterruptedException 
	{
		     driver.findElement(By.xpath("//a[@title='Everglades Agricultural Area (EAA)']")).click();
		     Thread.sleep(1000);
	    String pagedate1= (driver.findElement(By.xpath("//div[@class=\"hidden-xs col-sm-5 ng-binding animated fadeIn\"]")).getText());
		System.out.println("Site EAA Page Date and Time is Correct  :"+ pagedate1);
		 String Date1=pagedate1.substring(11,28);
		    return  Date1;
		}
	public static String CheckRotenbergerpageDate() throws InterruptedException 
	{
		     driver.findElement(By.xpath("//a[@title='Rotenberger and Holey Land Wildlife Management Areas']")).click();
		     Thread.sleep(1000);
	    String pagedate1= (driver.findElement(By.xpath("//div[@class=\"hidden-xs col-sm-5 ng-binding animated fadeIn\"]")).getText());
		System.out.println("Site Rotenberger Page Date and Time is Correct  :"+ pagedate1);
		 String Date1=pagedate1.substring(11,28);
		    return  Date1;
	}
	public static String CheckWCAspageDate() 
	{
		     driver.findElement(By.xpath("//a[@title='Water Conservation Areas (WCAs)']")).click();
		     driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	    String pagedate1= (driver.findElement(By.xpath("//div[@class=\"hidden-xs col-sm-5 ng-binding animated fadeIn\"]")).getText());
		System.out.println("Site WCA Page Date and Time is Correct  :"+ pagedate1);
		 String Date1=pagedate1.substring(11,28);
		    return  Date1;		
		}
	public static String CheckSouthDadepageDate() 
	{
		     driver.findElement(By.xpath("//a[@title='South Dade']")).click();
		     driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	    String pagedate1= (driver.findElement(By.xpath("//div[@class=\"hidden-xs col-sm-5 ng-binding animated fadeIn\"]")).getText());
		System.out.println("Site SouthDade Page Date and Time is Correct  :"+ pagedate1);
		 String Date1=pagedate1.substring(11,28);
		    return  Date1;	
		}
	public static String CheckEastCoastCanalspageDate() throws InterruptedException 
	{
		   driver.findElement(By.xpath("//a[@title='East Coast Canals']")).click();
		   Thread.sleep(1000);
	    String pagedate1= (driver.findElement(By.xpath("//div[@class=\"hidden-xs col-sm-5 ng-binding animated fadeIn\"]")).getText());
		System.out.println("Site EastCoast Page Date and Time is Correct  :"+ pagedate1);
		 String Date1=pagedate1.substring(11,28);
		    return  Date1;	
		}
	public static String CheckBCBpageDate() throws InterruptedException
	{
		     driver.findElement(By.xpath("//a[@title='Big Cypress Basin']")).click();
		     Thread.sleep(1000);
	    String pagedate1= (driver.findElement(By.xpath("//div[@class=\"hidden-xs col-sm-5 ng-binding animated fadeIn\"]")).getText());
		System.out.println("Site BigCypressBasin Page Date and Time is Correct  :"+ pagedate1);
		 String Date1=pagedate1.substring(11,28);
		    return  Date1;
		}
	

}
