package propproj;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prop {
	
	public static void main(String[] args) throws Exception {
		
		Properties p=new Properties();
		p.load(new FileInputStream("./facebookdata.properties"));
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Jar and Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); //Dynamic binding
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		String username = p.getProperty("username");
		String password = p.getProperty("password");
		driver.findElement(By.name("email")).sendKeys(username);
		Thread.sleep(3300);
		driver.findElement(By.id("pass")).sendKeys(password);

		
	}

}
