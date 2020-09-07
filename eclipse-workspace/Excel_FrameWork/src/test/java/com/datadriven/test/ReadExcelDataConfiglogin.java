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

import Com.Excel.Utilities.ReadExcelDataConfig;

public class ReadExcelDataConfiglogin {
	
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

//		Assert.assertTrue(driver.getTitle().contains("Dashboard ‹ Wordpress Demo Site at Demo.Center — WordPress"),"User cant be able to login successfully");
		
	}

		@AfterTest
		public void teardown() {
		driver.quit();
	}

	@DataProvider(name="wordpressdata")
	public Object[][] passdata(){
		
		
		ReadExcelDataConfig rdex = new ReadExcelDataConfig("C:\\Users\\Dell\\eclipse-workspace\\Excel_FrameWork\\TestData\\InputData.xlsx");
		int rows = rdex.getrowcount(0);	
		Object[][] rowdata = new Object[rows][2];
		
		for(int i=0;i<rows;i++) {
			
			rowdata[i][0] =rdex.getdata(0, i, 0);
			rowdata[i][1] =rdex.getdata(0, i, 1);
					
		}
		
		return rowdata;
	}
}
	


