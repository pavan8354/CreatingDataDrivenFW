package Com.qa.hubspot.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.Mypages.loginpage;

public class LoginPageTest extends BaseTest {
	
	@Test(priority=1)
	
	public void verifyLoginTitleTest() {
		String title = page.getInstance(loginpage.class).getLoginPageTitle();
		System.out.println("Login page title is"+title);
		Assert.assertEquals(title, "GTPL Bank Home Page");			
	}
	
@Test(priority=2)	
	public void doLoginTitleTest() {
	page.getInstance(loginpage.class).doLoginmethod("mngr283965 ","EjYbAdA ");				
	}

}
