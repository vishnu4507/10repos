package com.aiite.pageexecution;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.aiite.basepackage.BaseClass;

public class GooglePageexe {
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
	
	@Test

	public void googlePage()
	{	
	System.out.println(" Test case No 2");
	BaseClass.loadUrl("https://www.google.com/");
	
	}
	

}
