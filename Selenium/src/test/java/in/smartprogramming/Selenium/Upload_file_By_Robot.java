package in.smartprogramming.Selenium;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_file_By_Robot {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();

		// Create driver using options
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://demoqa.com/upload-download");
		Thread.sleep(2000);
		WebElement button =  driver.findElement(By.id("uploadFile"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(button).click().perform();
		
		Robot rb = new Robot();
		rb.delay(2000);
		
		// Copy file into clipboard
		StringSelection ss = new StringSelection("C:\\Users\\lenovo\\Downloads\\CV_10102025.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//Perform control+V action to paste file
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
			
		Thread.sleep(5000);
		driver.quit();

	}

}
