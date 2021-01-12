package gov.sfwmd.Selenium.pumpingOrders;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PumpingOrderspage extends Basepage
{ //@FindBy(name="login")
	 //WebElement Username;
	
 @FindBy(id="filterType")
 WebElement FieldStationList;
 @FindBy(id="filterBy")
 WebElement AllFSList;
 @FindBy(name="submit")
 WebElement SearchButton;

 
 public PumpingOrderspage() throws IOException 
	   {

		 PageFactory.initElements(driver, this);
		
		}

public void search() throws InterruptedException
	{
	
	 Select FiltType =new Select(FieldStationList);
	  FiltType.selectByIndex(1);
  Select FiltBy=new Select(AllFSList);
	  FiltBy.selectByIndex(5);
	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS); 	
	 	
	  SearchButton.click();
	  System.out.println("done");
}

public void Checkingmail() throws InterruptedException
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
	driver.findElement(By.name("btnSubmit3")).click();
	driver.findElement(By.xpath("//span[contains(text(),\"Submit\")]")).click();
	System.out.println("Site Order for TEST is Submitted----Check Your E-Mail");
	System.out.println("Active order for TEST will be replaced.");
	
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	
	driver.findElement(By.name("btnReplace")).click();
	
	System.out.println("Site Order for  TEST is Replaced");
	
}
}



