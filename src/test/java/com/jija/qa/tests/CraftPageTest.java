package com.jija.qa.tests;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jija.qa.base.TestBase;
import com.jija.qa.pages.CraftPage;
import com.jija.qa.pages.HomePage;

import junit.framework.Assert;


// Rajat Mandhare :
public class CraftPageTest extends TestBase {
		CraftPage craftPage;
		HomePage homePage;
		
		
		
	public CraftPageTest(){
		super();
	}

	@BeforeMethod
	public void setUp(){
		initialization();
		homePage=new HomePage();
		homePage.clickOnCraftLink();
		craftPage=new CraftPage();
		Log.info("Application launched successfully");
		
	}
	
	@Test
	public void craftPageOpenTest(){
		
		boolean text=craftPage.verifyCraftPage();
		Assert.assertTrue(text);
		Log.error("craftPageOpenTest Executed");
		System.out.println("craftPageOpenTest Executed");
		
	}
	
	@AfterMethod
	public void tearDown(){ 
		driver.quit();
		Log.info("Browser closed successfully");
	}
	
}
