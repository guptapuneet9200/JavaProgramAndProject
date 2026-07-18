import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RoughWrk {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://automationexercise.com/");
		driver.findElement(By.xpath("//a[contains(text(),' Signup / Login')]")).click();
		driver.findElement(By.name("name")).sendKeys("hkpohlhk");
		driver.findElement(By.xpath("//input[contains(@data-qa,'signup-email')]")).sendKeys("hkpohk@gmail.com");
		driver.findElement(By.xpath("//button[text()='Signup']")).click();
		
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("piyush");
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.id("first_name")).sendKeys("Vicky");
		
		driver.findElement(By.id("last_name")).sendKeys("Gupta");
		driver.findElement(By.id("address1")).sendKeys("B-143 hb colony karond nhopal");
		
		WebElement e= driver.findElement(By.id("country"));
		Select sc = new Select(e);
		sc.selectByVisibleText("India");
		
		driver.findElement(By.id("state")).sendKeys("Rajastha");
		driver.findElement(By.id("city")).sendKeys("Indore");
		
		driver.findElement(By.id("zipcode")).sendKeys("794560");
		driver.findElement(By.id("mobile_number")).sendKeys("9652368741");
		
		driver.findElement(By.xpath("//button[contains(text(),'Create Account')]")).click();
		
		System.out.println("Title of the page is : "+driver.getTitle());
		
		
		
				

	}

}
