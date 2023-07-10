package com.aiite.pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.aiite.basepackage.BaseClass;

public class LoginPage extends BaseClass {
	
//public LoginPage(){
//		PageFactory.initElements(driver, this);
//	}
//	
	

//	
//	public static String userName= "email";
//	public static String passWord= "pass";
//	public static String loginBtn = "//button[@name='login']";
	
//	public WebElemnt username = driver.findElement(By.id("email"));
	

//	public LoginPage()
//	{
//		PageFactory.initElements(driver, this);
//}
		
	@FindBy(id="email")
	public WebElement username;
	
	@FindBy(id="pass")
	public WebElement passWord;
	
	@FindBy(xpath="//button[@name='login']")
	public WebElement loginBtn;
	
	@FindAll({@FindBy(id="pass") ,@FindBy(id="email")})
	List <WebElement> data;
	
	@FindBys({@FindBy(id="pass") ,@FindBy(id="email")})
	WebElement bys;
	
	

}
