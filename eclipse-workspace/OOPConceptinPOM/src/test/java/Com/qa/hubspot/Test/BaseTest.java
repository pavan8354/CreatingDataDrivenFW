package Com.qa.hubspot.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Com.Mypages.Page;

public class BaseTest {
	
	
	public WebDriver driver;
	public WebDriverWait wait;
	public Page page;
	
	@BeforeMethod
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\JAVALEARN\\filewriting\\chromedriver.exe");	
		driver = new ChromeDriver(); 
		wait = new WebDriverWait(driver ,15);
		driver.manage().window().fullscreen();
		driver.get("http://demo.guru99.com/V1/index.php");
		page = new Page(driver ,wait);
		
		
	}
	
	@AfterMethod
	
	public void teardown() {
		driver.quit();
	}

}
