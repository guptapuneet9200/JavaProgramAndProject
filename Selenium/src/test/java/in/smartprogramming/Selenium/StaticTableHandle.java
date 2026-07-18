package in.smartprogramming.Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticTableHandle {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		List<WebElement>rowCount = 	driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		List<WebElement>columnCount = 	driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th"));
		Thread.sleep(2000);
		System.out.println("Number of Rows are :"+rowCount.size());
		System.out.println("Number of Columns are :"+columnCount.size());
		Thread.sleep(2000);
		for(int r=2;r<=rowCount.size();r++) {
			for(int c=1;c<=columnCount.size();c++) {
				
			String data =	driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[" + r + "]/td[" + c + "]")).getText();
				
				System.out.println(data);
			
									}
								}
		
		Thread.sleep(2000);
	}

}
