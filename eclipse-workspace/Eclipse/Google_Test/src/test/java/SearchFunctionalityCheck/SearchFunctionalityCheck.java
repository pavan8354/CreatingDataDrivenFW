package SearchFunctionalityCheck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SearchFunctionalityCheck {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\JAVALEARN\\filewriting\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}


	public void New_Project() {

		//		driver.findElement(By.xpath("//button[@id='oauth-login-google_oauth2']//span")).click();
		//		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Selenium Automation");
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();
		String title = driver.getTitle();
		System.out.println("The main Home page title is------->"+title);
		Assert.assertEquals(title, "selenium automation");
	}

	
	}


