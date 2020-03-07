package com.jija.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jija.qa.base.TestBase;
import com.jija.qa.pages.CraftPage;
import com.jija.qa.pages.HomePage;
import com.jija.qa.pages.LoginPage;


import junit.framework.Assert;

public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	CraftPage craftPage;
	
	public HomePageTest(){
		super();
		
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		  loginPage= new LoginPage();
		  homePage=new HomePage();
		//homePage =loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		craftPage =new CraftPage();
	}
	
	@Test(priority=1)
	public void verifyHomePageTitle(){
		String homePageTitle=homePage.verifyHomePageTitle();
	//	System.out.println(homePageTitle);
		Assert.assertEquals(homePageTitle,"JijaArt | Home");
	}	
		
	@Test(priority=2)
	public void verifyCraftPageBtnTest(){
		 craftPage=homePage.clickOnCraftLink();
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
