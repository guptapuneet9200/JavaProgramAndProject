package com.amazon.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.utils.ConfigReader;
import com.amazon.utils.CustomWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	protected WebDriver driver;
	protected CustomWait wait;
	protected ConfigReader configReader;
	
	@FindBy(xpath="nav-logo-sprites")
	private WebElement logo;
	
	//Constructor
	public BasePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		this.wait= new CustomWait(driver, Duration.ofSeconds(configReader.getGlobalWaitValue()));
	}
	
	

	public WebDriver getDriver(String browser) {

		if(browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
		//	options.addArguments("--headless");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		//	driver.manage().window().maximize();
		}else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver.manage().window().maximize();
		}else {
			WebDriverManager.edgedriver().setup();
			driver.manage().window().maximize();
		}

		return driver;

	}
	
	//Getter Method
	public WebElement getlogo() {
		wait.waitForVisibilityOfElement(logo);
		return logo;
	}

	public void quitDriver() {
		driver.quit();
	}

	public boolean verifyLogo() {
		return getlogo().isDisplayed();
	}

	public String getTitleOfThePage() {
		return driver.getTitle();
	}

	public String getCurrentPageUrl() {

		return driver.getCurrentUrl();
	}

	public void navigateBack() {
		driver.navigate().back();
		
	}

	public void navigateForward() {
		driver.navigate().forward();
		
	}

	public void refreshPage() {
		driver.navigate().refresh();
		
	}
}
