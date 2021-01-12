package gov.sfwmd.Selenium.pumpingOrders;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage1 extends Basepage
{
 	 @FindBy(name="login")
	 WebElement Username;
	 @FindBy(name="passwd")
	 WebElement password;
	 @FindBy(xpath=("//*[@id=\"nsg-x1-logon-button\"]"))
	 WebElement Loginbtn;
	
	 //Initializing the PageObjects 
	 
	 public Loginpage1() throws IOException 
	 {
		 
		 PageFactory.initElements(driver, this);
	 }
	
	
public void Login(String uname,String pwd)
{
	Username.sendKeys(uname);
	password.sendKeys(pwd);
	Loginbtn.click();
}
public String title()
{
	return driver.getTitle();
	
}
}



