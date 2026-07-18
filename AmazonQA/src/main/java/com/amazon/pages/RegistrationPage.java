package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.amazon.base.BasePage;

public class RegistrationPage extends BasePage{
	
	//Webelement Of reg. page
//1st Page
	@FindBy(id="ap_email_login")
	public WebElement enterMobilenumberOrEmail;
	
	@FindBy(id="continue")
	public WebElement continueButton;
	
//2nd page
	@FindBy(id="ap_phone_number")
	public WebElement mobileNumber;
	
	@FindBy(id="ap_customer_name")
	public WebElement yourName;
	
	@FindBy(id="ap_password")
	public WebElement password;
		
	@FindBy(xpath ="//a[contains(text(),\"Sign in instead\")]")
	public WebElement signInInstead;
	
	@FindBy(xpath ="//div[@id='auth-password-requirement-info']/div/div")
	public WebElement passwordInfoMessage;
	
	@FindBy(xpath = "//span[contains(text(),'Verify mobile number')]")
	public WebElement verifyMobileNumberButton;
	
	@FindBy(id="mobileClaimDisclosureMessageRelaxed")
	public WebElement verifyMobileNumberMessage;
	
	//Getter Methods for all above webelements
//1st Page	
	WebElement getMobileNumberOrEmail() {
		wait.waitForVisibilityOfElement(enterMobilenumberOrEmail);
		return enterMobilenumberOrEmail;
	}
	
	WebElement getContinueButton() {
		wait.waitForVisibilityOfElement(continueButton);
		return continueButton;
	}	
	
//2nd page
	WebElement getMobileNumber() {
		wait.waitForVisibilityOfElement(mobileNumber);
		return mobileNumber;
	}
	
	WebElement getYourName() {
		wait.waitForVisibilityOfElement(yourName);
		return yourName;
	}
	
	WebElement getPassword() {
		wait.waitForVisibilityOfElement(password);
		return password;
	}
	
	WebElement getSignInInstead() {
		wait.waitForVisibilityOfElement(signInInstead);
		return signInInstead;
	}
	
	WebElement getPasswordInfoMessage() {
		wait.waitForVisibilityOfElement(passwordInfoMessage);
		return passwordInfoMessage;
	}
	
	WebElement getVerifyMobileNumberButton() {
		wait.waitForVisibilityOfElement(verifyMobileNumberButton);
		return verifyMobileNumberButton;
	}
	
		
	public RegistrationPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
//Page1 Actions	
	
	public void enterMobileNumberOrEmail(String mNumber) {
		getMobileNumberOrEmail().sendKeys(mNumber);
		
	}
	
	public void clickContinueButton() {
		 getContinueButton().click();;
		
	}
//Page2 Actions
	
	public void enterMobileNumber(String mNumber) {
		getMobileNumber().sendKeys(mNumber);
		
	}
	public void enterYourName(String name) {
		getYourName().sendKeys(name);
		
	}
	
	public void enterPassword(String pwd) {
		getPassword().sendKeys(pwd);
		
	}
	
	public void clickOnVerifyMobileNumberButton() {
		getVerifyMobileNumberButton().click();
		
	}
	
	//--------------Page Action over-----------
	
	//Here we are enter data into the reg page1
	public void verifyMobileNumberFunctionality0(String email) {   
		
		enterMobileNumberOrEmail(email);
		clickContinueButton();
	}
	
	
	
	
	
	//Here we are enter data into the reg page2
	public void verifyMobileNumberFunctionality(String number, String name, String pwd) {   
		
		enterMobileNumber(number);
		enterYourName(name);
		enterPassword(pwd);
		clickOnVerifyMobileNumberButton();
	}

	public void clickOnSignInLink() {
		
		
	}

	public void verifyPresenceOfElementsOnPage() {
		// TODO Auto-generated method stub
		
	}

//	public void clickOnCreateBusinessAccountLink() {
//		
//		
//	}

	
	
	
}
