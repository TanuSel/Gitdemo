package gov.sfwmd.Selenium.pumpingOrders;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NotLoginpage extends Basepage{

	public NotLoginpage() throws IOException
	{
		super();
	}

static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException{
		WebElement err = null;
		String res;
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(); 
		driver.get("https://appst.sfwmd.gov/pumpingorders");
	
		Thread.sleep(1000);
	WebElement Username=driver.findElement(By.name("login"));
      Username.sendKeys("tkashett");
	WebElement Password=driver.findElement(By.name("passwd"));
		Password.sendKeys(prop.getProperty("password"));
		//Loginpage.Login(prop.getProperty("Uname"),prop.getProperty("password"));
		driver.findElement(By.xpath("//*[@id=\"nsg-x1-logon-button\"]")).click();
		
		Thread.sleep(1000);
		
		try {
			err = driver.findElement(By.xpath("//td[@class=\"medium\" and @valign=\"top\"]"));
			
		}
		catch(Exception ex) { res = "Login: FAILED!";}
		if(err != null) {
			res = "Login Successful";			 
			} 
		else { res = "Login FAILED!"; }
		
		System.out.println(res);
		
 search();
 Checkingmail();
	}
public static  void search() 
{
     Select Ftype =new Select(driver.findElement(By.id("filterType")));
	  Ftype.selectByIndex(1);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  Select Filterby=new Select(driver.findElement(By.id("filterBy")));
	  Filterby.selectByIndex(5);
	  driver.findElement(By.xpath("//input[@name='submit']")).click();
	  System.out.println(" Searching done");
	}

public static void Checkingmail() throws InterruptedException
{    
	 Select Whoimpl= new Select(driver.findElement(By.xpath("//input[@value=\"117\"]//parent::td//following-sibling::td[3]//select")));
	   Whoimpl.selectByIndex(2);//value should not exceed 2
		Select  WMId=new Select(driver.findElement(By.xpath("//input[@value=\"117\"]//parent::td//following-sibling::td[4]//select")));
		WMId.selectByIndex(4);
		Select  PumpShift=new Select(driver.findElement(By.xpath("//input[@value=\"117\"]//parent::td//following-sibling::td[6]//select")));
		PumpShift.selectByIndex(3);
		Select  Weekdays=new Select(driver.findElement(By.xpath("//input[@value=\"117\"]//parent::td//following-sibling::td[7]//select")));
		Weekdays.selectByIndex(4);
		Select  CostcodeId=new Select(driver.findElement(By.xpath("//input[@value=\"117\"]//parent::td//following-sibling::td[9]//select")));
		CostcodeId.selectByIndex(2);
		driver.findElement(By.xpath("//input[@value=\"117\"]//parent::td//preceding-sibling::td//span//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//*[@name=\"btnSubmit3\"]")).click();
		driver.findElement(By.xpath("//span[contains(text(),\"Submit\")]")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@name=\"btnReplace\"]")).click();
		System.out.println("Email submission Done");
}

}


/*	
DateFormat dateformat= new SimpleDateFormat("MM/dd/yyyy hh:mm a");
Date systemdate=new Date();
String SysdateTime=dateformat.format(systemdate);
System.out.println("SystemdateTime:"+SysdateTime);  

Calendar calendar = Calendar.getInstance();
Calendar calendar1 = Calendar.getInstance();
calendar.add(Calendar.HOUR,-14);
calendar1.add(Calendar.HOUR_OF_DAY,-12);
Date pastDateTime = calendar.getTime();
Date presentDateTime = calendar1.getTime();
System.out.println("pasttime   :"+pastDateTime);
System.out.println("presenttime:"+presentDateTime);

*/