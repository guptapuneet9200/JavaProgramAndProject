package com.amazon.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.basetest.BaseTest;

public class SignInPageTest extends BaseTest{

	@BeforeMethod (alwaysRun =	true)
	public void setupPage() {
		homepage.openSignInPage();
	}
	
	//Verify logo
	@Test
	public void isLogoPresentTest() {
		Assert.assertTrue(signInPage.verifyLogo(),"Error - logo not present");
	}
	
	@Test
	public void pageTitleTest() {
		Assert.assertEquals(signInPage.getTitleOfThePage(), "Amazon Sign-In","Error - title is not match");
	}
	
	//Verify Backward, Forward and Refresh of the Page
	@Test
	public void backAndForwardScenariosTest() {
		
		basePage.navigateBack();
		Assert.assertEquals(homepage.getTitleOfThePage(), "Online Shopping site in India:Shop Online for Mobiles, Books, Watches");
		basePage.navigateForward();
		Assert.assertEquals(homepage.getTitleOfThePage(), "Amazon Sign-In");
		basePage.refreshPage();
		Assert.assertEquals(homepage.getTitleOfThePage(), "Amazon Sign-In");
	}
	
	@Test 
	 public void createBusinessAccountTest() {
		 signInPage.clickOnCreateBusinessAccountLink();
		 Assert.assertEquals(signInPage.getTitleOfThePage(), "Amazon Business","Error- Amazon business page not opened after click the link");
	 }
	
	//Sign-in with un-registered email 
	/*
	@Test
	public void signInWithUnregisteredEmailIdTest() {
		signInPage.enterEmailId("asd@gmail.com");
		signInPage.clickOnContinueButton();
		Assert.assertEquals(signInPage.getUnregisteredEmailIdError(), "We cannot find an account with that email address");
	}
	*/
	
	//Sign-in with invalid email id
	/*
	@Test
	public void signInWithInvalidEmailIdTest() {
		signInPage.enterEmailId("asde@test");
		signInPage.clickOnContinueButton();
		Assert.assertEquals(signInPage.getInvalidEmailIdError(), "Invalid email address");
	}
	*/
	
	//Sign-in with valid email id
	
	@Test
	public void signInWithValidCredentialsTest() {
		signInPage.signInWithValidCredentials("asdfhkhk","hkhkhkhk");
	}
	
	//Verify input fields/ fields label / links / button on sign in page
	
	@Test
	public void fieldsOnThePageTest() {
		signInPage.verifyPresenceOfElementsOnPage();
	}
	
	
	
}
