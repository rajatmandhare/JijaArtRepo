package com.jija.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jija.qa.base.TestBase;

public class CraftPage extends TestBase{
	
	CraftPage craftPage;
	
	@FindBy(xpath="//h4[contains(text(),'Bicycle ')]")
	WebElement bicycletext;
	
	public CraftPage(){
		  PageFactory.initElements(driver, this);
	}

	public boolean verifyCraftPage(){
		 boolean text=bicycletext.isDisplayed();
		return text;
	}
}
