package in.smartprogramming.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog2 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();

		// Create options object
		ChromeOptions options = new ChromeOptions();

		// Disable password manager
		options.addArguments("--incognito");     //DISABLE PASSWORD MANAGER

		// Create driver using options
		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.submit-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
		
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
