package in.smartprogramming.Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.get("https://www.facebook.com/");
		
		//Enter text in text box
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('email').value='Punit Gupta';");
		
		// Perform click on login button
		 WebElement element = driver.findElement(By.xpath("//button[text()='Log in']"));
//		js.executeScript("arguments[0].click();",element);
		js.executeScript("arguments[0].style.border='3px solid red';", element);
		 
		//Refresh browser
//		js.executeScript("history.go(0)");
		
		//Get domain name
//		String domain =	js.executeScript("return document.domain").toString();
//		System.out.println("Domain is :"+domain);
		
		//Get title name
//		String title =	js.executeScript("return document.title").toString();
//		System.out.println("Title is :"+title);
		
		//Get url 
//		String Url = js.executeScript("return document.URL").toString();
//		System.out.println("Url is :"+Url);
		
		//To zoom page
	//	js.executeScript("document.body.style.zoom='50%'");
		
		//Return Height & Width of web page
//	System.out.println(	js.executeScript("return window.innerHeight;").toString());
//	System.out.println(	js.executeScript("return window.innerWidth;").toString());	
		
		//Scroll vertical till the end
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		//Scroll vertical page up
//		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		// To generate alert pop-up
//		js.executeScript("alert('This is testing alert message')");
		
		//To navigate the different url
		js.executeScript("window.location='https://www.google.com/'");
	//	driver.quit();
		
		
		
		}

}
