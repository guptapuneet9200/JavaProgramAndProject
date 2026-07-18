package in.smartprogramming.Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_Tab_Handle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.get("https://www.google.com/");
		System.out.println("First page is :" +driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.facebook.com/");
		System.out.println("Second page is :" +driver.getTitle());
		
		Set<String>	windowHandles =	driver.getWindowHandles();
		List<String> handles = new ArrayList<String>();
		handles.addAll(windowHandles);
		
		driver.close();
		driver.switchTo().window(handles.get(0));
		System.out.println("First page is :" +driver.getTitle());
		
		driver.close();
	}

}
