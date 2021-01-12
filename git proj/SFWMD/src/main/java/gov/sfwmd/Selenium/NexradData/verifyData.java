package gov.sfwmd.Selenium.NexradData;

	import java.io.IOException;
	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

	import gov.sfwmd.Selenium.SiteStatus.BasepageSiteStatus;

	public class verifyData extends BasepageSiteStatus
	{
		public verifyData() throws IOException
		{
			 PageFactory.initElements(driver, this);
		}
	public static  void clickon() throws InterruptedException  
	{	
		WebElement clickbase=driver.findElement(By.xpath("//*[@id=\"widget_queryTYPE1\"]/div[1]/input"));
				clickbase.click();
		WebElement SelectTB=driver.findElement(By.xpath("//*[@id=\"queryTYPE1_popup1\"]"));
		SelectTB.click();

		Thread.sleep(1000);
		WebElement FromDate=driver.findElement(By.xpath("//*[@id=\"widget_searchFromText\"]/div[1]/input"));
		FromDate.click();
	WebElement DecreaseMonth=driver.findElement(By.xpath("//span[@class=\"dijitInline dijitCalendarIncrementControl dijitCalendarDecrease\"]"));
	DecreaseMonth.click();
	WebElement SelectFromDate=driver.findElement(By.xpath("//*[@id=\"searchFromText_popup\"]/tbody/tr[5]/td[4]/span"));
	SelectFromDate.click();
	WebElement TimeDropdown=driver.findElement(By.xpath("//*[@id='widget_fromInputTime']/div[1]/input"));
	TimeDropdown.click();
	WebElement SelectedTime=driver.findElement(By.xpath("//*[@id=\"fromInputTime_popup\"]/div[2]/div"));
	SelectedTime.click();
	Thread.sleep(1000);
	WebElement ClickToDate=driver.findElement(By.xpath("//*[@id=\"widget_searchToText\"]/div[1]/input"));
	ClickToDate.click();
	WebElement DecreaseToDate=driver.findElement(By.xpath("//*[@id=\"searchToText_popup\"]/thead/tr[1]/th[1]/span[1]"));
	DecreaseToDate.click();
	WebElement SelectedToDate=driver.findElement(By.xpath("//*[@id=\"searchToText_popup\"]/tbody/tr[5]/td[5]/span"));
	SelectedToDate.click();
	WebElement ClickToTimeDropdown=driver.findElement(By.xpath("//*[@id=\"widget_toInputTime\"]//div//input"));
	ClickToTimeDropdown.click();
	WebElement SelectedToTime=driver.findElement(By.xpath("//*[@id=\"toInputTime_popup\"]/div[1]/div"));
	SelectedToTime.click();
	WebElement PolySelection=driver.findElement(By.xpath("//select/option[4]"));
	PolySelection.click();
	WebElement TimeInterval=driver.findElement(By.xpath("//select[@name=\"time_interval\"]//option[3]"));
	TimeInterval.click();
	WebElement county=driver.findElement(By.xpath("//select[@id=\"county\"]//option[1]"));
	county.click();
	        	WebElement SelectList1 = driver.findElement(By.xpath("//*[@id=\"county\"]"));
	        	Select se = new Select (SelectList1);
	        	List<WebElement> opt =  se.getOptions();
	        	for(WebElement options : opt)
	        	{  
	        		if(options==county)
	        			System.out.println(options.getText());
	              	options.click();
	             }
	Thread.sleep(1000);
	        	driver.findElement(By.xpath("//input[@value=\"Get Data!\"]")).click();

	}
	}

