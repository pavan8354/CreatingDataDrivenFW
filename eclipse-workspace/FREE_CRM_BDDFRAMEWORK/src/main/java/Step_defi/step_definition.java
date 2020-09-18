package Step_defi;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@RunWith(Cucumber.class)
public class step_definition {
	WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() {
	    // Write code here that turns the phrase above into concrete actions
			System.setProperty("webdriver.chrome.driver", "C:\\JAVALEARN\\filewriting\\chromedriver.exe");	
			driver = new ChromeDriver(); 
			driver.get("http://demo.guru99.com/v4/");
	}

	
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM()  {
	    // Write code here that turns the phrase above into concrete actions    
		String title = driver.getTitle();
		System.out.println("The Login page title is::::::"+title);
		Assert.assertEquals("Guru99 Bank Home Page", title);
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr283965");
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("EjYbAdA");
		
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()  {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//input[@name='btnLogin']")).click(); 
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page()  {
	    // Write code here that turns the phrase above into concrete actions
	    String title = driver.getTitle();
	    System.out.println("The obtained home page title is::"+title);
	    Assert.assertEquals("Guru99 Bank Manager HomePage", title);
	}

	@Then("^user moves to new contact page$")
	public void user_moves_to_new_contact_page()  {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//a[contains(text(),'New Customer')]")).click();
	    driver.findElement(By.xpath("//input[@name='name']")).sendKeys("pavan G");
	    driver.findElement(By.xpath("//input[@name='sub']")).click();
		
		
	}

	@Then("^Close the browser$")
	public void close_the_browser()  {
	    // Write code here that turns the phrase above into concrete actions
		driver.quit();
	}

}