package com.jija.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jija.qa.base.TestBase;
import com.jija.qa.pages.HomePage;
import com.jija.qa.pages.LoginPage;
import com.jija.qa.pages.PortraitPage;


public class PortraitPageTest extends TestBase {

	public LoginPage loginPage;
	public HomePage homePage;
	public PortraitPage portraitPage;

	public PortraitPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		 homePage=new HomePage();
		loginPage = new LoginPage();
		homePage.clickOnPortraitLink();
		portraitPage=new PortraitPage();
		Log.info("Application launched successfully");
		
		
			}

	@Test(priority=3)
	public void verifyPageTextTest(){
		
	boolean b=portraitPage.verifyPageText();
	Assert.assertTrue(b);	
	Log.error("verifyPageTextTest Executed");
	System.out.println("verifyPageTextTest Executed");
	}
	
	@Test(priority=1)
	public void verifyPageImageTest(){
		
		boolean b=portraitPage.verifyPageImage();
		Assert.assertTrue(b);
		Log.error("verifyPageImageTest Executed");
		System.out.println("verifyPageImageTest Executed");
	}

	@Test(priority=2)
	public void verifyPageImageClickableTest() throws Throwable{
		
		portraitPage.verifyPageImageClickable();
		Log.error("verifyPageImageClickableTest Executed");
		System.out.println("verifyPageImageClickableTest Executed");
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		Log.info("Browser closed successfully");
	}

}
