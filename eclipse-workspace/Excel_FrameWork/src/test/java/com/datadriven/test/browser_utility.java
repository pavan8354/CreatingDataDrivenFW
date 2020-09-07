package com.datadriven.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser_utility {
	
	public static WebDriver getDriver(String browser) {
		
	WebDriver driver = null;
	
	if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\JAVALEARN\\filewriting\\chromedriver.exe");	
		driver = new ChromeDriver(); 
	}else if(browser.equals("IE")){	

		
	}

		return driver;
		
	}

}
