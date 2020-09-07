package com.datadriven.test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Com.Excel.Utilities.Excel_Utility;

public class ReadExcelTestData {
	
	private WebDriver driver = null;
	@Test
	public void test1() throws InterruptedException {
		
		try {
			List<Map<String,String>> testdata = Excel_Utility.gettestDatainMap();
		
			driver = browser_utility.getDriver("chrome");
			driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
			
			driver.findElement(By.xpath("//div[@class='rFrNMe N3Hzgf jjwyfe vHVGub zKHdkd sdJrJc Tyc9J']//div[@class='Xb9hP']")).sendKeys("abcdef");
			driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).sendKeys(Keys.ENTER);;
			
			
//			driver.findElement(By.xpath("//div[@id='lastname_r']")).sendKeys(testdata.get(0).get("last_name"));
//			driver.findElement(By.xpath("//div[@id='email_r']")).sendKeys(testdata.get(0).get("email"));
//			driver.findElement(By.xpath("//div[@id='PASSWORD_r']")).sendKeys(testdata.get(0).get("password"));
//			
//			driver.findElement(By.xpath("//input[@class='checkbox__control']")).click();
//			
//			driver.findElement(By.xpath("//button[@id='ppaFormSbtBtn']")).click();
			
			Thread.sleep(3000);	
			/*System.out.println(testdata.get(0).get("email"));
			System.out.println(testdata.get(0).get("password"));*/
	
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
