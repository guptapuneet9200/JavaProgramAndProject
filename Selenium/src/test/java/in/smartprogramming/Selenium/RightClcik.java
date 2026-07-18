package in.smartprogramming.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClcik {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();

		// Create driver using options
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(1000);
		WebElement button = driver.findElement(By.cssSelector("#rightClickBtn"));
		
		Actions act = new Actions(driver);
		act.contextClick(button).perform();
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
		
		
		

	}

}
