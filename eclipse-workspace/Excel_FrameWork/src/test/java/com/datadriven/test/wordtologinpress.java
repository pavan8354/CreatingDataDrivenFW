package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class wordtologinpress {

	WebDriver driver;

	@BeforeTest

	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\JAVALEARN\\filewriting\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demosite.center/wordpress/wp-login.php");

	}

	@Test(dataProvider="wordpressdata")
	public void logintowordpress(String username,String password) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='rememberme']")).click();
		driver.findElement(By.xpath("//input[@id='wp-submit']")).sendKeys(Keys.ENTER);

		Thread.sleep(2000);

		System.out.println(driver.getTitle());

		Assert.assertTrue(driver.getTitle().contains("Dashboard ‹ Wordpress Demo Site at Demo.Center — WordPress"),"User cant be able to login successfully");
		
	}

		@AfterTest
		public void teardown() {
		driver.quit();
	}

	@DataProvider(name="wordpressdata")
	public Object[][] passdata(){

		Object[][] data = new Object[3][2];

		data[0][0] = "admin1";
		data[0][1] = "demo1";

		data[1][0] = "admin";
		data[1][1] = "demo123";

		data[2][0] = "admin2";
		data[2][1] = "demo1234";

		return data;


	}

}
