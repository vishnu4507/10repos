package pageexecution;

import org.openqa.selenium.support.PageFactory;

import com.aiite.basepackage.BaseClass;
import com.aiite.pagefactory.LoginPage;

import pageobjecttestcase.loginpagetest;

public class pageexe extends BaseClass {
	
	public pageexe(){
PageFactory.initElements(driver,LoginPage.class);
}
	
	public static void main(String[] args) 
	
	{
		
		BaseClass.browserLaunch();
		BaseClass.loadUrl("https://www.facebook.com/");
		LoginPage lp=new LoginPage();
		PageFactory.initElements(driver,LoginPage.class);
		lp.username.sendKeys("vishnu");
		lp.passWord.sendKeys("flkjskldjfk");
		lp.loginBtn.click();
		
	}

}
