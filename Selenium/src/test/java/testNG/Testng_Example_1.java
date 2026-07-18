package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testng_Example_1 {

	@Test
	public void verifyTitel() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		String expected_title= "Google";
		String actual_title= driver.getTitle();

		Assert.assertEquals(actual_title, expected_title);

		driver.quit();
		
		
	}
}
