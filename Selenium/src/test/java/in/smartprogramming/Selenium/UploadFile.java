package in.smartprogramming.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();

		// Create driver using options
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://demoqa.com/upload-download");
		Thread.sleep(2000);
		driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\lenovo\\Downloads\\CV_10102025.docx");
			
		Thread.sleep(1000);
		
		driver.quit();

	}

}
