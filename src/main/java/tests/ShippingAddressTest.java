package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import utils.BaseTest;

public class ShippingAddressTest extends BaseTest{
	
	@Test(priority=1)
	public void testShippingAddress() throws InterruptedException {
		
		app.click(app.menu.loginLink);
		app.login.loginInApp("TestUser", "12345@67890");
		app.waitForElementToBeVisible(app.shippingAddress.oopsMsgScreen);
		
		driver.get(app.shippingAddress.shippingURL);
		app.shippingAddress.filterByIndex(app.shippingAddress.countryRegionDropDown, "Canada");
		Thread.sleep(10000);
		assertEquals(app.shippingAddress.getCurrentSelectedOption(app.shippingAddress.countryRegionDropDown), "Canada");
		
		app.shippingAddress.filterByIndex(app.shippingAddress.provinceDropDown, "Newfoundland and Labrador");
		assertEquals(app.shippingAddress.getCurrentSelectedOption(app.shippingAddress.countryRegionDropDown), "Newfoundland and Labrador");
	}

}
