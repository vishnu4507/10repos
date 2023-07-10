package pageobjectpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	public HomePage( WebDriver driver ) 
	
	{ 
	     this.driver = driver; 
	// Call initElements() method by using PageFactory reference and pass driver and this as parameters. 
	    PageFactory.initElements( driver, this); 
	   } 
	
	@FindBy(id="email") private  WebElement name;
	
	@FindBy(id="pass") private  WebElement password;
	
	@FindBy(id="login") private  WebElement login;
	
	

public void username()
{
	name.sendKeys("Vishnu");
}

public void password()
{
	 password.sendKeys("12344");
}

public void click()
{
	login.click();

}
}