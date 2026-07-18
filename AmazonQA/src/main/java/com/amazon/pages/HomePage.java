package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.base.BasePage;

public class HomePage extends BasePage{

	private Actions action;

	@FindBy(id="nav-link-accountList")
	public WebElement accountsAndLists;

	@FindBy(xpath="//span[contains(text(),\"Sign in\")]")
	public WebElement signInButton;

	@FindBy(linkText = "Start here.")
	public WebElement newCustomerStartsHere;

	//First time we create the constructor here
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
	}

	// ----------------------Seperate---------------------------	
	// Seperate xpath for enter email for reg.
	@FindBy(id="ap_email_login")
	public WebElement enterEmailForReg;

	@FindBy(xpath = "//span[@id=\"intention-submit-button\"]/span/input")
	public WebElement proceedToCreateAnAccount;

	// ----------------------Seperate---------------------------	
	
	
	//Getter methods for the Webelements
	
	public WebElement getAccountAndListElemet() {
		wait.waitForVisibilityOfElement(accountsAndLists);
		return accountsAndLists;
	}

	public WebElement getStartHereElemet() {
		wait.waitForVisibilityOfElement(newCustomerStartsHere);
		return newCustomerStartsHere;
	}
	
	public WebElement getSignInButtonElementt() {
		wait.waitForVisibilityOfElement(signInButton);
		return signInButton;
	}

	//Open the registration page

	public void openRegistrationPage() {

		action.moveToElement(getAccountAndListElemet()).perform();
		getStartHereElemet().click();
	}

	public void openSignInPage() {
		
		action.moveToElement(getAccountAndListElemet()).perform();
		getSignInButtonElementt().click();
	}


}
