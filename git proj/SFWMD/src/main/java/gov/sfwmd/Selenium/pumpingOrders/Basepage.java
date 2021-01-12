package gov.sfwmd.Selenium.pumpingOrders;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basepage {
	 
			public static WebDriver driver;
			public static Properties prop;
			

			 public Basepage() throws IOException 
		  {
			prop=new Properties();
			FileInputStream ip = new FileInputStream("C:\\Selenium\\workspace\\SFWMD\\src\\main\\java\\gov\\sfwmd1\\config.properties");
			prop.load(ip);
		  }
			public static void intilization()
				{
					String BrowserName=prop.getProperty("browser");
			  if(BrowserName.equals("chrome"))
			    {
			    	WebDriverManager.chromedriver().setup();
			        driver=new ChromeDriver();
			     }
			   else if(BrowserName.equals("FF"))
			    	{
			       WebDriverManager.firefoxdriver().setup();	
				   driver = new FirefoxDriver();
		        	}
			   
		     driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 
			 driver.get(prop.getProperty("url"));
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			
		    
				}

}
