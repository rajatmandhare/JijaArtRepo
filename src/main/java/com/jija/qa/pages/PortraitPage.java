package com.jija.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jija.qa.base.TestBase;

public class PortraitPage extends TestBase{
	
	public PortraitPage portraitPage;
	
	@FindBy (css="div[class=container] h1")
	WebElement textOnPage;
	
	@FindBy (css="img[src*=portrait]")
	WebElement imageOnPage;
	
			
	@FindBy (xpath="//button[contains(text(),'Order Now')]")
	WebElement orderNowOnPage;
	
	public PortraitPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean verifyPageText(){
		
		return textOnPage.isDisplayed();
	}
	
	public boolean verifyPageImage(){
		
		return textOnPage.isDisplayed();
	}
	
	public PortraitPage verifyPageImageClickable() {
		
				textOnPage.click();
			
		return new PortraitPage();

				
		
	}

}
