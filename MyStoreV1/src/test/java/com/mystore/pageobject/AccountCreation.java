package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountCreation {

	//1. Create Object of Webdriver	
	WebDriver Idriver;

	//2. Create Constructor	
	public  AccountCreation(WebDriver rdriver) {
		PageFactory.initElements(rdriver, this);
	}
	//3. Create WebElement

	@FindBy(id = "id_gender1")
	WebElement Mr;

	@FindBy(id = "name")
	WebElement name;

	@FindBy(id = "password")
	WebElement pwd;

	@FindBy(id = "first_name")
	WebElement first_name;

	@FindBy(id = "last_name")
	WebElement last_name;

	@FindBy(id = "address1")
	WebElement address;

	@FindBy(id = "country")
	WebElement country;

	@FindBy(id = "state")
	WebElement state;

	@FindBy(id = "city")
	WebElement city;

	@FindBy(id = "zipcode")
	WebElement zipcode;

	@FindBy(id = "mobile_number")
	WebElement mobile_number;

	@FindBy(xpath = "//button[contains(text(),'Create Account')]")
	WebElement createAccountBtn;

	//4. Create Method

	public void selectMr() {
		Mr.click();
	}

	public void enterName(String name1) {
		name.clear();
		name.sendKeys(name1);
	}

	public void enterPassword(String password) {
		pwd.sendKeys(password);
	}

	public void enterFirstName(String fname) {
		first_name.sendKeys(fname);
	}

	public void enterLastName(String lname) {
		last_name.sendKeys(lname);
	}

	public void enterAddress(String Address) {
		address.sendKeys(Address);
	}

	public void selectCountry(String Country) {
		Select sc = new Select(country);
		sc.selectByVisibleText(Country);
	}

	public void enterState(String State) {
		state.sendKeys(State);
	}

	public void enterCity(String City) {
		city.sendKeys(City);
	}

	public void enterZipcode(String Zipcode) {
		zipcode.sendKeys(Zipcode);
	}

	public void enterMobileNumber(String MobileNumber) {
		mobile_number.sendKeys(MobileNumber);
	}

	public void clickCreateAccount() {
		createAccountBtn.click();
	}
}
