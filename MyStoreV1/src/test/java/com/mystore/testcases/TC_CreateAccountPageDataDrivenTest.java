package com.mystore.testcases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mystore.pageobject.AccountCreation;
import com.mystore.pageobject.IndexPage;
import com.mystore.pageobject.MyAccount;
import com.mystore.utilities.ReadExcelFile;
//import com.mystore.pageobject.RegisteredUserAccount;

public class TC_CreateAccountPageDataDrivenTest extends BaseClass{


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

	@Test(dataProvider = "LoginDataProvider")
	public void verifyLogin(String userEmail, String userPwd, String expectedTitle) throws IOException {

		logger.info("Verify login test execution started....");
		IndexPage pg = new IndexPage(driver);
		pg.clickOnLogin();
		logger.info("Click on Login link");

		MyAccount myAcpg = new MyAccount(driver);
		myAcpg.enterEmailAddress(userEmail);
		logger.info("Enter login email id");

		myAcpg.enterPassword(userPwd);
		logger.info("Enter login password");

		myAcpg.clickLogin();
		logger.info("Clicked on login in button");

		if(driver.getTitle().equals(expectedTitle)) {

			logger.info("verify login - Passed");
			Assert.assertTrue(true);

		}
		else {

			logger.info("verify login - Failed");
			captureScreenShot(driver, "verifyLogin");
			Assert.assertTrue(false);
		}		

	}

	@DataProvider(name = "LoginDataProvider")
	public String[][] LoginDataProvider()
	{
		//Excel file path store in filename
		
		String fileName = System.getProperty("user.dir")+"\\TestData\\MyStoreTestData.xlsx";
		
		int ttlRows = ReadExcelFile.getRowCount(fileName, "LoginTestData");
		int ttlColumns = ReadExcelFile.getColCount(fileName, "LoginTestData");
		
		String data[][] = new String[ttlRows][ ttlColumns];
		
		for(int i=1;i<ttlRows;i++) { //row =1,2
			for(int j=0;i<ttlColumns;j++) { //col = 0,1,2
				
				data[i-1][j]=ReadExcelFile.getCellValue(fileName, "LoginTestData", i, j);
				
			}
		}
		return data;
	}
	
	
}
