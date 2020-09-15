package Com.Mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginpage extends BasePage{

	public loginpage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}

	//locators
	
	By emailid = By.name("uid");
	By password = By.name("password");
	By clickLoginbutton = By.name("btnLogin");
	
	
	//page actions
	
	public String getLoginPageTitle() {
		return driver.getTitle();		
	}
	
	public void doLoginmethod(String username,String pwd) {
		doSendKeys(emailid ,username);
		doSendKeys(password , pwd);
		doClick(clickLoginbutton);
	}
}
