package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
	
	@DataProvider(name = "searchDataSet")
	public Object[][] searchData(){
		Object[][] searchKeyWord = new Object[3][2];
		
		searchKeyWord[0][0]= "Agra";
		searchKeyWord[0][1]= "Tajmahal";
	
		searchKeyWord[1][0]= "Delhi";
		searchKeyWord[1][1]= "India Gate";
		
		searchKeyWord[2][0]= "Jaipur";
		searchKeyWord[2][1]= "Hawa Mahal";
		
		return searchKeyWord;
	}
	
	
	@Test(dataProvider = "searchDataSet")
	public void TestCaseGoogleSearch(String city, String monument) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement searchbox =	driver.findElement(By.name("q"));
		searchbox.sendKeys(city + " " + monument);
		
		driver.findElement(By.name("btnK")).click();
		
		driver.quit();
	}
	
}
