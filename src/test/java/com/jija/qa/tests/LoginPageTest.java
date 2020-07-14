package com.jija.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jija.qa.base.TestBase;
import com.jija.qa.pages.HomePage;
import com.jija.qa.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends TestBase {

	public LoginPage loginPage;
	public HomePage homePage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		 homePage=new HomePage();
		loginPage = new LoginPage();
		Log.info("Application launched successfully");
		
	}

	@Test
	public void titleCheckTest(){
		String title=loginPage.verifyLoginPageTitle();
		Assert.assertEquals(title, "JijaArt | Home");
		Log.error("titleCheckTest Executed");
		System.out.println("titleCheckTest Executed");
		
	}
	
	@Test
	public void logoCheckTest(){
		boolean b=loginPage.verifyJijaImage();
		Assert.assertTrue(b);
		Log.error("logoCheckTest Executed");
		System.out.println("logoCheckTest Executed");
	}
	
	@Test
	public void loginTest(){
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Log.error("loginTest Executed");
		System.out.println("loginTest Executed");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		Log.info("Browser closed successfully");
	}

}
