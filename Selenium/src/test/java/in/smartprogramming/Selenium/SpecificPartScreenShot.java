package in.smartprogramming.Selenium;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpecificPartScreenShot {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement section=	driver.findElement(By.xpath("//div[@class='_6luv _52jv']/form"));
		File src =   section.getScreenshotAs(OutputType.FILE);
		
		File desp = new File("C:\\Users\\lenovo\\eclipse-workspace\\Selenium\\ScreenShot\\Screenshot2.png");
		
		FileUtils.copyFile(src, desp);
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
