package com.jija.qa.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jija.qa.base.TestBase;

public class PotteryPage extends TestBase{
	
	
	PotteryPage potteryPage;
	
	@FindBy(css="div[class*= slideInUp] h4")
	WebElement productset;
	
	
	
	public PotteryPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	public PotteryPage getProducts(){
		
		List<WebElement> items = driver.findElements(By.cssSelector("div[class*= slideInUp] h4"));
		System.out.println("Total Number Of Products On Page :"+items.size());
		Iterator<WebElement> it = items.iterator();

		int j=1;
		
		while(it.hasNext())
		{
			System.out.print("Product "+j +" ");
			WebElement text1 = it.next();
			System.out.println(text1.getText());
			j++;
			
		}
			
		return potteryPage;
	}
	
	public int checkItemCount(){
		
		List<WebElement> items = driver.findElements(By.cssSelector("div[class*= slideInUp] h4"));
		return items.size();
	}
	
	
}
