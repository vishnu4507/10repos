package pageobjectpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookloginpage {
	

	
	static WebDriver driver;
	
    @FindBy(id="email") public static WebElement name;
	
	@FindBy(id="pass") public static WebElement password;
	
	@FindBy(id="login") public static WebElement login;
	
public facebookloginpage(WebDriver driver)
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	public static void prop()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Jar and Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//PageFactory.initElements(driver, this);
	}
	

	
	
//	public static WebElement username()
//	{
//	
//     WebElement username = driver.findElement(By.name("email"));
//	return username;
//		
//	}
//	
//	public static WebElement password()
//	{
//		WebElement password = driver.findElement(By.name("pass"));
//		return password;
//	}
//	
//	public static WebElement submitButton()
//	{
//		WebElement submitbutton = driver.findElement(By.name("login"));
//		return submitbutton;
//	}

}
