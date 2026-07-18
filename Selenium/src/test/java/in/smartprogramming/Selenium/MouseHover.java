package in.smartprogramming.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();

		// Create driver using options
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://export.ebay.com/in/");
		Thread.sleep(2000);
			driver.findElement(By.id("onetrust-accept-btn-handler")).click();
			
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("(//span[text()='Resources'])[2]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();  //This is mouse hover method be remember
		
		
		Thread.sleep(5000);
		driver.quit();
		

	}

}
