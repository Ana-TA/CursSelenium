package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTest;

public class ShippingAddressTest extends BaseTest{
	
	@Test(priority=1)
	public void testShippingAddress(){
		
		app.click(app.menu.loginLink);
		app.login.loginInApp("TestUser", "12345@67890");
		app.waitForElementToBeVisible(app.shippingAddress.oopsMsgScreen);
		
		driver.get(app.shippingAddress.shippingURL);
		app.shippingAddress.filterByIndex(41);
		assertEquals(app.shippingAddress.getCurrentSelectedOption(app.shippingAddress.countryDropDown), "Canada");
		
		//Actions action = new Actions(driver);
		//action.scrollByAmount(200,500);
		app.shippingAddress.filterByValue("NL");
		assertEquals(app.shippingAddress.getCurrentSelectedOption(app.shippingAddress.provinceDropDown), "Newfoundland and Labrador");
	}

}
