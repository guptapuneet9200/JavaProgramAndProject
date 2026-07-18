package com.mystore.testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.logging.log4j.Logger;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import com.mystore.utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	// In this class we create all reusable method which can be use in all test cases

	ReadConfig readConfig = new ReadConfig();

	String url = readConfig.getBaseUrl(); 	
	String browser = readConfig.getBrowser();

	public static WebDriver driver;
	public static Logger logger;

	@BeforeClass
	public void setUp() {		

		switch (browser.toLowerCase()) 
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			break;

		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			break;	

		default:
			driver=null;
			break;
		}

		//Implicit Wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));		

		//For Logging
		logger = LogManager.getLogger("MyStoreV1");	

		//Open URL
		driver.get(url);
		logger.info("Url Opened");

	}

	//Browser close Method
	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
	}


	//Capture Screenshot
	public void captureScreenShot(WebDriver driver, String testName) throws IOException{

		//Step1. Convert webdriver object to Takescreenshot Interface
		TakesScreenshot screenshot = ((TakesScreenshot)driver);

		//Step2 Call getScreenShot method to create image file
		File src =	screenshot.getScreenshotAs(OutputType.FILE);

		File des = new File(System.getProperty("user.dir")+"//Screenshots//" + testName + ".png");

		//Step3 Copy image file to destination
		FileUtils.copyFile(src, des);


	}


}
