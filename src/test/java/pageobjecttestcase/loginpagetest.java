package pageobjecttestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjectpackage.facebookloginpage;

public class loginpagetest {
	
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Jar and Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//facebookloginpage.prop();
		
		//PageFactory.initElements(driver, facebookloginpage.class);
		
		facebookloginpage.name.sendKeys("Vishnu");
		facebookloginpage.password.sendKeys("12345");
		//facebookloginpage.login.click();
		
	}
	
	

}
