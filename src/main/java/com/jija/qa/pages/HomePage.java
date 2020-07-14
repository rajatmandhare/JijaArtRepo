package com.jija.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jija.qa.base.TestBase;

public class HomePage extends TestBase{
	
	HomePage homePage;
	
	
	@FindBy(linkText="Craft")
	WebElement craftLink;
	
	@FindBy(linkText="Pottery")
	WebElement potteryLink;
	
	@FindBy(linkText="Portrait")
	WebElement portraitLink;
	
	@FindBy(xpath="//*[@class='dropdown-toggle  hyper'][1]")
	WebElement paintingsLink;
	
	@FindBy(xpath="//*[@id='desktopShow']/ul/li[4]/ul/div/div[1]/ul/li[1]/a/text()")
	WebElement landscapePaintingsLink;

	public HomePage(){
	PageFactory.initElements(driver, this);
}
	// Actions:
	
	public String verifyHomePageTitle(){
		return driver.getTitle();
		
	}
	
	public CraftPage clickOnCraftLink(){
		
			craftLink.click();
		return new CraftPage();
	}
	
	public PotteryPage clickOnPotteryLink(){
			potteryLink.click();
		return new PotteryPage();
	}
	public PortraitPage clickOnPortraitLink(){
			portraitLink.click();
		return new PortraitPage();
	}
	
	
}