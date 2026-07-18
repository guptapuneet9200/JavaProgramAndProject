package in.smartprogramming.Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopUp {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		/*
		 * To handle the window auth then username and password should pass into the url
		 * 
		 * https://admin:admin@the-internet.herokuapp.com/basic_auth"
		 */
		

	}

}
