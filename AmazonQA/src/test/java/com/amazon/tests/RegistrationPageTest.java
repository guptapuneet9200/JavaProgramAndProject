package com.amazon.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.basetest.BaseTest;

public class RegistrationPageTest extends BaseTest {

	 @BeforeMethod
	 
	 public void setUp() {
		 
		 homepage.openRegistrationPage();
	 			}
	 
	 @Test
	 public void isLogoPresentTest() {
		 Assert.assertTrue(registrationPage.verifyLogo(),"Error- Logo is not present n the page");
	 }
	 
	 
	 @Test
	 public void pageTitleTest() {
		 Assert.assertEquals(registrationPage.getTitleOfThePage(), "Amazon Registration");
	 }
	 
	//Here we are enter data into the reg page1
	 
	 @Test
	 public void verifyMobileNumberTest0() {
		registrationPage.verifyMobileNumberFunctionality0("Test@gmail.com");
		Assert.assertEquals(registrationPage.getTitleOfThePage(), "Amazon Intent Confirmation");
	 }
	 
	 
	//Here we are enter data into the reg page2
	 
	 @Test
	 public void verifyMobileNumberTest() {
		registrationPage.verifyMobileNumberFunctionality("0000000000","Punit","Test@123");
		Assert.assertEquals(registrationPage.getTitleOfThePage(), "Amazon Registration");
	 }
	 
	 @Test
	 public void signInLinkTest() {
		 registrationPage.clickOnSignInLink();
		 Assert.assertEquals(signInPage.getTitleOfThePage(), "Amazon Sign-In","Error SignIn page not open after clicking signin link");
		 Assert.assertTrue(signInPage.getSignInText().isDisplayed(),"Error- SignIn Page not opened after click on SignIn link");
	 }
	 
//	 @Test 
//	 //Is method ko signIn page mai mention krna hai
//	 
//	 public void createBusinessAccountTest() {
//		 registrationPage.clickOnCreateBusinessAccountLink();
//		 Assert.assertEquals(businessPage.getTitleOfThePage(), "Amazon Business","Error- Amazon business page not opened after click the link");
//	 }
	 
		//Verify input fields/ fields label / links / button on sign in page
		
		@Test
		public void fieldsOnThePageTest() {
			registrationPage.verifyPresenceOfElementsOnPage();
		}
}
