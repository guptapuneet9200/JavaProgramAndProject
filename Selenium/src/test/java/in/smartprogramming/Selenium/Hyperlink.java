package in.smartprogramming.Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlink {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();

		// Create driver using options
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://www.calculator.net/");
		Thread.sleep(1000);
		List<WebElement> linkElement =   driver.findElements(By.tagName("a"));
		
		System.out.println("total no. of links are : "+linkElement.size());
		
		for (WebElement e : linkElement) {
			
			System.out.println(e.getText());
		}
		
	

	}

}
