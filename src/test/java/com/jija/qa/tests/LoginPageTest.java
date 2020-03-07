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
		loginPage = new LoginPage();
	}

	@Test(priority=3)
	public void titleCheckTest(){
		String title=loginPage.verifyLoginPageTitle();
		Assert.assertEquals(title, "JijaArt | Home");
		
	}
	
	@Test(priority=1)
	public void logoCheckTest(){
		boolean b=loginPage.verifyJijaImage();
		Assert.assertTrue(b);
	}
	
	@Test(priority=2)
	public void loginTest(){
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
