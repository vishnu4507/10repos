package propproj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readData {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		
		Properties p=new Properties();
		p.put("name", "javaproject@123");
		p.put("password", "1234sdkfjh");
		p.put("password1", "2312312");
		p.setProperty("age", "25");
		p.setProperty("job", "tester");
		FileOutputStream fo =new FileOutputStream("./writedata.properties",false);
		p.store(fo, "Writing the Data");
		System.out.println("File Created");
	}
}
