package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.BasePage;

public class SignInPage extends BasePage{
	
	//Create Business a/c 
	@FindBy(xpath = "//span[contains(text(),'Create a free business account')]")
	public WebElement createBusinessAccount;
	
	
	//Page Webelement
	@FindBy(xpath="//h1[contains(text(),'Sign in')]")
	private WebElement signInText;
	
	@FindBy(xpath="//*[contains(text(),'Enter mobile number or email')]")
	private WebElement enterMobileNumberOrEmailText;
	
	@FindBy(id="ap_email_login")
	private WebElement emailInputBox;
	
	@FindBy(xpath="//span[@id='continue']/span/input")
	private WebElement continueBtn;
	
	@FindBy(xpath = "//div[contains(text(), 'Invalid email address')]")
	private WebElement InvalidEmail;
	
	@FindBy(id="ap_password")
	private WebElement validPwd;
	
	@FindBy(id="signInSubmit")
	private WebElement signInBtn;
	
//Getter Method for above all Webelements
	
	public WebElement getCreateBusinessAccount() {
		wait.waitForVisibilityOfElement(createBusinessAccount);
		return createBusinessAccount;
	}
	
	public WebElement getSignInText() {
		wait.waitForVisibilityOfElement(signInText);
		return signInText;
	}
	public WebElement getEnterMobileNumberOrEmailText() {
		wait.waitForVisibilityOfElement(enterMobileNumberOrEmailText);
		return enterMobileNumberOrEmailText;
	}
	public WebElement getEmailInputBox() {
		wait.waitForVisibilityOfElement(emailInputBox);
		return emailInputBox;
	}
	public WebElement getContinueBtn() {
		wait.waitForVisibilityOfElement(continueBtn);
		return continueBtn;
	}
	
	public WebElement getInvalidEmailError() {
		wait.waitForVisibilityOfElement(InvalidEmail);
		return InvalidEmail;
	}
	
	public WebElement getPasswordInputBox() {
		wait.waitForVisibilityOfElement(validPwd);
		return validPwd;
	}
	
	public WebElement getSignInBtn() {
		wait.waitForVisibilityOfElement(signInBtn);
		return signInBtn;
	}
	
	//---------------------End Getter Method-------------------
	
	//Constructor Method
	
	public SignInPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	// Page Actions Methods
	
	public void clickOnCreateBusinessAccountLink() {
		
		
	}

	public void enterEmailId(String email) {
		
		getEmailInputBox().sendKeys(email);
	}

	public void clickOnContinueButton() {
		
		getContinueBtn().click();
	}

	//Ignore this 
//	public String readtUnregisteredEmailIdError() {
//	
//		return null;
//	}

	public String readInvalidEmailIdError() {
		return getInvalidEmailError().getText();
	}
	
	public void enterPassword(String pwd) {
		getPasswordInputBox().sendKeys(pwd);
	}
	
	public void clickOnSignInButton() {
		getSignInBtn().click();
	}
	public void signInWithValidCredentials(String validEmail, String validPwd) {
		enterEmailId(validEmail);
		clickOnContinueButton(); 
		enterPassword(validPwd);
		clickOnSignInButton();
	}

	public void verifyPresenceOfElementsOnPage() {
		// TODO Auto-generated method stub
		
	}

}
