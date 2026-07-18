package in.smartprogramming.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.google.com/");
		
		System.out.println("Before search tile is :"+driver.getTitle());
		
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("India gate");
		
		searchBox.sendKeys(Keys.ENTER);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("After search title is :"+driver.getTitle());

		driver.quit();
	}

}
