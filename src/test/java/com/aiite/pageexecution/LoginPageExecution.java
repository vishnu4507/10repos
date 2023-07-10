package com.aiite.pageexecution;

import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.aiite.basepackage.BaseClass;
import com.aiite.pagefactory.LoginPage;

public class LoginPageExecution extends BaseClass {
	
//	@BeforeClass
//	public static void beforeClass()
//	{
//		System.out.println("Executing Before Class Only once");
//	}
//	
//	@AfterClass
//	public static void afterClass()
//	{
//		System.out.println("Executing After Class Only once");
//	}
//	
	
	@Before
	public void beforeTest()
	{
		System.out.println("Executing (@Before)  before the Testcase starts");
	BaseClass.broswerload();
}
		@After
	public void afterTest()
	{
		System.out.println("Executing (@After)  After the Testcase Ends");
		BaseClass.closeBrowser();
	}
	
	
@Test  //testcase
	public void FbLogin()
	
{
	String expected = "Facebook – log in or sign up";
	    System.out.println(" Test case No 1");
		BaseClass.loadUrl("https://www.facebook.com/");
		LoginPage lp = new LoginPage();
		Assert.assertEquals(expected, "Facebook – log in or sign up");
		lp.username.sendKeys("sdkjhfksjdhfjk");
		lp.passWord.sendKeys("sd;fjaslkdjfl;ksja");
		lp.loginBtn.click();
		
	}




@Test
public void Assertion()
{
	
	String str1 = new String ("abc");
    String str2 = new String ("abc");
    String str3 = null;
    String str4 = "abc";
    String str5 = "abc";
		
    int val1 = 5;
    int val2 = 6;

    String[] expectedArray = {"one", "two", "three"};
    String[] resultArray =  {"one", "two", "three"};

Assert.assertArrayEquals("verifying Array asssertion Both are same", expectedArray, resultArray);



	
	
}


	
	
		
		
		
}
	

