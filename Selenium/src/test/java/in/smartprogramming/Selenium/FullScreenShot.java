package in.smartprogramming.Selenium;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FullScreenShot {

	public static void main(String[] args) throws Exception {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	
	//Convert webdriver object into TakeScreenShot interface
	TakesScreenshot screenshot = ((TakesScreenshot)driver); 
	
	//getScreenshotAs method to create image file
	File src =	screenshot.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\lenovo\\eclipse-workspace\\Selenium\\ScreenShot\\Screentshot1.png");
	
	//copy image file into destination
	FileUtils.copyFile(src, dest);
	
	Thread.sleep(2000);
	driver.quit();
	
	}

}
