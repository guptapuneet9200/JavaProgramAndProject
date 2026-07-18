package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {

//1. Create Object of Webdriver	
	WebDriver Idriver;
	
//2. Create Constructor	
	public IndexPage(WebDriver rdriver) {
		
		PageFactory.initElements(rdriver, this);
		
	}
	
//2. Identify WebElement
	
//	@FindBy(xpath = "//span[text()='My Account']")
//	WebElement My_account;
	
//Identify action on WebElement
	
//	public void clickOnMyAccount() {
//		My_account.click();
//	}
	
	@FindBy(xpath = "//a[text()=' Signup / Login']")
	WebElement Login;	
	
	public void clickOnLogin() {
		Login.click();
	}
	
	
	
	
	
}
