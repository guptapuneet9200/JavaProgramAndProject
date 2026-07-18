package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
	
//1. Create Object of Webdriver	
		WebDriver Idriver;
		
//2. Create Constructor	
		public MyAccount(WebDriver rdriver) {
			
			PageFactory.initElements(rdriver, this);			
		}

//3. Create WebElement			
		
		@FindBy(name = "name")
		WebElement Name;	
		
		@FindBy(xpath = "//input[contains(@data-qa,'signup-email')]")
		WebElement EmailAddress;
		
		@FindBy(xpath = "//button[text()='Signup']")
		WebElement SignUpBtn;
		
		@FindBy(xpath = "//input[@data-qa='login-email']")
		WebElement LoginEmail;
		
		@FindBy(xpath = "//input[@data-qa='login-password']")
		WebElement LoginPwd;
		
		@FindBy(xpath = "//button[@data-qa='login-button']")
		WebElement LoginBtn; 
		
//4. Create Account Method
		
		public void enterName(String name) {
			Name.sendKeys(name);
		}
		
		public void enterEmail(String email) {
			EmailAddress.sendKeys(email);
		}
		
		public void clickSignUp() {
			SignUpBtn.click();
		}
		
		
//5. Create Login User Method
		public void enterEmailAddress(String emailAddress) {
			LoginEmail.sendKeys(emailAddress);
		}
		
		public void enterPassword(String Password) {
			LoginPwd.sendKeys(Password);
		}
		
		public void clickLogin() {
			LoginBtn.click();
		}


}
