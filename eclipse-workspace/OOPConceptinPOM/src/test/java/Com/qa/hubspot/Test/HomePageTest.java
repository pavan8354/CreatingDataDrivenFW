package Com.qa.hubspot.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.Mypages.Homepage;
import Com.Mypages.loginpage;

public class HomePageTest extends BaseTest {
	
	@Test(priority=1)
	
	public void HomePageTitleTest() {
		page.getInstance(loginpage.class).doLoginmethod("mngr283965 ","EjYbAdA");
		String title = page.getInstance(Homepage.class).StringHomePageTile();
		System.out.println("Home page title is:::"+title);
		Assert.assertEquals(title, "GTPL Bank Manager HomePage");
	}
	
@Test(priority=2)
	
	public void HomePageHeaderTitleTest() {
		page.getInstance(loginpage.class).doLoginmethod("mngr283965 ","EjYbAdA");
		String headertitle = page.getInstance(Homepage.class).gethomepageheader();
		System.out.println("Home page title is:::"+headertitle);
		Assert.assertEquals(headertitle, "Gtpl Bank");
	}

}
