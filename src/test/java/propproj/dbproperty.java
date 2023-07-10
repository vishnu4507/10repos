package propproj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dbproperty {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
FileReader read=new FileReader("cc.properties");
		Properties p = new Properties();
//		p.setProperty("name","Sonoo Jaiswal");  
//		p.setProperty("email","sonoojaiswal@javatpoint.com");
//		p.put("Age", "22");
//		FileOutputStream file=  new FileOutputStream("./write.properties",true);
//		p.store(file,"Javatpoint Properties Example");  
//		System.out.println("File created");
//		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Jar and Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); //Dynamic binding
		driver.manage().window().maximize();
	
	}

}
