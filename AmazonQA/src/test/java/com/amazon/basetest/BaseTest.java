package com.amazon.basetest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.amazon.base.BasePage;
import com.amazon.pages.BusinessPage;
import com.amazon.pages.HomePage;
import com.amazon.pages.RegistrationPage;
import com.amazon.pages.SignInPage;
import com.amazon.utils.ConfigReader;

public class BaseTest {

	public BasePage basePage;
	public WebDriver driver;
	public SignInPage signInPage;
	public RegistrationPage registrationPage;
	public HomePage homepage;
	public BusinessPage businessPage; 
	public ConfigReader configReader;
	
	
	@BeforeMethod

	public void baseSetup() {
		configReader= new ConfigReader();
		basePage = new BasePage(driver);
		basePage.getDriver(configReader.getBrowser());
		driver.get(configReader.getUrl());

		signInPage = new SignInPage (driver);
		registrationPage = new	RegistrationPage (driver);	
		homepage = new HomePage(driver);
		businessPage = new BusinessPage(driver);
		
							}

	@AfterMethod
	public void closeBrowser() {
		basePage.quitDriver();	
						}

}
