package in.smartprogramming.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();

		// Create driver using options
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("//div[@id='div_city']/div/select"));	
		//Drop down handling
		Select dropdown = new Select(element);
		Thread.sleep(2000);
		dropdown.selectByVisibleText("Indore");
		
		
		Thread.sleep(5000);
		driver.quit();
			

	}

}
