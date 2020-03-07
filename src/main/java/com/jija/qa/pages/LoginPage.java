package com.jija.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jija.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	
	// Page Factory OR: Object Repository
	
	@FindBy(xpath="//a[contains(text(),'Login / SignUp')]")
	WebElement loginbtn;
	
	@FindBy(name="email")
	WebElement enteremail;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="login")
	WebElement enterloginbtn;
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	WebElement registerlink;
	
	@FindBy(xpath="//img[contains(@class,'image')]")
	WebElement jijalogo;
	
	// Initialization of page objects:
		public LoginPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	// Actions to perform in the form of methods :
		
	public String verifyLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean verifyJijaImage() {
		return jijalogo.isDisplayed();
	}
	
	
	public HomePage login(String un, String pwd){
		
		loginbtn.click();
		enteremail.sendKeys(un);
		password.sendKeys(pwd);
		enterloginbtn.click();
		
		return new HomePage();
		
		
	}
}
