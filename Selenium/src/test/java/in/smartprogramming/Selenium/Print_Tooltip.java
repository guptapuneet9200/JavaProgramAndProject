package in.smartprogramming.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Print_Tooltip {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		//Tooltip is comes in under in 'Title' attribute in HTML code
		
		String Actual_tooltip = driver.findElement(By.id("APjFqb")).getAttribute("title");
		
		System.out.println("Actual ToolTip is :"+Actual_tooltip);
		
		String Expected_tooltip = "Search";
		
		if (Actual_tooltip.equals(Expected_tooltip)) {
			
			System.out.println("ToolTip is match");
		}
		
		else {
			System.out.println("ToolTip is not match");
		}
		
		Thread.sleep(5000);
		driver.quit();
	}

}
