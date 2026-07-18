package com.mystore.testcases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mystore.pageobject.*;
//import com.mystore.pageobject.AccountCreation;
//import com.mystore.pageobject.IndexPage;
//import com.mystore.pageobject.MyAccount;
//import com.mystore.pageobject.RegisteredUserAccount;

public class TC_CreateAccountPageTest extends BaseClass{


	@Test(enabled = false)
	public void verifyRegistrationAndLogin() {


		IndexPage pg = new IndexPage(driver);
		pg.clickOnLogin();
		logger.info("Click on Login link");

		MyAccount myAcpg = new MyAccount(driver);
		myAcpg.enterName("test7898");
		logger.info("Enter name ");
		myAcpg.enterEmail("test19p980@mailinator.com");
		logger.info("Enter Email-id");
		myAcpg.clickSignUp();
		logger.info("Click on Signup button");

		AccountCreation accountCreation = new AccountCreation(driver);
		accountCreation.selectMr();
		accountCreation.enterName("Saurav");
		accountCreation.enterPassword("Test@123");

		accountCreation.enterFirstName("Gourav");
		accountCreation.enterLastName("Gupta");
		accountCreation.enterAddress("B-143 HB Colony Karond Jaipur");
		accountCreation.selectCountry("India");
		accountCreation.enterState("Rajasthan");
		accountCreation.enterCity("Jaipur");
		accountCreation.enterZipcode("302009");
		accountCreation.enterMobileNumber("7894561230");

		logger.info("Enter user detail on account creation page");

		accountCreation.clickCreateAccount();
		logger.info("Click on Create Account Button");

		//After SignUp, Retrieve the title and validate it here 
		Assert.assertEquals(driver.getTitle(), "Automation Exercise - Account Created","User is not SignUp into the account");

	}

	@Test
	public void verifyLogin() throws IOException {

		logger.info("Verify login test execution started....");
		IndexPage pg = new IndexPage(driver);
		pg.clickOnLogin();
		logger.info("Click on Login link");

		MyAccount myAcpg = new MyAccount(driver);
		myAcpg.enterEmailAddress("as@mailinator.com");
		logger.info("Enter login email id");

		myAcpg.enterPassword("Test@123");
		logger.info("Enter login password");

		myAcpg.clickLogin();
		logger.info("Clicked on login in button");

		// Create obj of RegisteredUserAccount class
		
		RegisteredUserAccount regUserAcc = new RegisteredUserAccount(driver);
		
		if(driver.getTitle().equals("Automation Exercise")) {

			logger.info("verify login - Passed");
			Assert.assertTrue(true);
			
			regUserAcc.clickOnLogOut();
		}
		else {

			logger.info("verify login - Failed");
			captureScreenShot(driver, "verifyLogin");
			Assert.assertTrue(false);
		}		

	}

}
