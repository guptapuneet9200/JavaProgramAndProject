package in.smartprogramming.Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public static void main(String[] args) throws Exception {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.google.com/");
	
	System.out.println("Print tile "+driver.getTitle());
	System.out.println("Print CurrentUrl "+driver.getCurrentUrl());
//	System.out.println("Print PageSource "+driver.getPageSource());
	
	
	Thread.sleep(5);
	driver.quit();
	
	

	
	
	
	
	}

}
