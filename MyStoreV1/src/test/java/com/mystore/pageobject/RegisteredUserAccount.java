package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisteredUserAccount {
	
	//1. Create Object of Webdriver	
	WebDriver Idriver;
	
//2. Create Constructor	
	public  RegisteredUserAccount(WebDriver rdriver) {
		
		PageFactory.initElements(rdriver, this);
		
	}	
	
//3. Get After login page title
	
	public String getTitle() {
		return Idriver.getTitle();
		 
	} 
	
//4. Log-out button Webelement
	
	@FindBy(xpath = "//*[contains(text(),'Logout')]")
	WebElement LogOut;

//5. Log-out action 
	
	public void clickOnLogOut() {
		LogOut.click();
	}
	
	 
}
