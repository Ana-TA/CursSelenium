package tests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

import pages.LoginPage;
import pages.MenuPage;
import utils.BaseTest;

public class LoginTest extends BaseTest {
	
	@Test(priority=1)
	public void validLogin() throws InterruptedException {
		
		//open login popup
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.loginLink);
		
		//insert valid username
		//insert valid pass.
		//press submit button
		LoginPage login = new LoginPage(driver);
		login.loginInApp("TestUser", "12345@67890");
		
		Thread.sleep(1000); // Bad practice
		//verify success login
		assertTrue(login.checkLoginMsgIsDisplayed(login.sucessLoginMsg));
	}

}
