package com.jija.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jija.qa.base.TestBase;
import com.jija.qa.pages.HomePage;
import com.jija.qa.pages.LoginPage;
import com.jija.qa.pages.PotteryPage;


public class PotteryPageTest extends TestBase {

	public LoginPage loginPage;
	public HomePage homePage;
	public PotteryPage potteryPage;

	public PotteryPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		 homePage=new HomePage();
		loginPage = new LoginPage();
		potteryPage=new PotteryPage();
		homePage.clickOnPotteryLink();
		Log.info("Application launched successfully");
		
			}

	@Test(priority=1)
	public void productsListTest(){
		
		potteryPage.getProducts();
		Log.error("productsListTest Executed");
		System.out.println("productsListTest Executed");
		
	}
	
	@Test(priority=2)
	public void checkItemCountTest(){
		
		int count=potteryPage.checkItemCount();
		Assert.assertTrue(count==13);
		Log.error("checkItemCountTest Executed");
		System.out.println("checkItemCountTest Executed");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
		Log.info("Browser closed successfully");
	}

}
