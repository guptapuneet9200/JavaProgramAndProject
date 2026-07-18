package in.smartprogramming.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.get("https://www.rediff.com/");
		
		//Switch to frame 1
		driver.switchTo().frame("moneyiframe");
		
		String e=	driver.findElement(By.id("nseindex")).getText();
		
		System.out.println("NSE value is : "+e);
		
		driver.switchTo().defaultContent();
	//	driver.switchTo().parentFrame();
		
	}

}
