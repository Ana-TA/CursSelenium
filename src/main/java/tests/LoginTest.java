package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import com.beust.jcommander.Parameters;

import static org.testng.Assert.assertTrue;

import pages.LoginPage;
import pages.MenuPage;
import utils.BaseTest;

public class LoginTest extends BaseTest {
	
	@Parameters({"user", "pass"})
	@Test(priority=1)
	public void validLogin(String username, String password) throws InterruptedException {
		
		//open login popup
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.loginLink);
		
		//insert valid username
		//insert valid pass.
		//press submit button
		LoginPage login = new LoginPage(driver);
		login.loginInApp(username, password);
		
		Thread.sleep(1000); // Bad practice
		//verify success login
		assertTrue(login.checkLoginMsgIsDisplayed(login.sucessLoginMsg));
	}

}
