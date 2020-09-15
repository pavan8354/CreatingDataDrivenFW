package Com.Mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage extends BasePage {

	public Homepage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}
	
	//locators
	By homepagetitle = By.xpath("//h2[@class='barone']");
	
	
	public String StringHomePageTile() {		
		return driver.getTitle();	
	}

	public String gethomepageheader() {
		return doGetText(homepagetitle);
		
	}
	
}
