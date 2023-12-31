package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import utils.BaseTest;

public class ShopTest extends BaseTest {
	
	@Test
	public void shopTest() {
		
		app.click(app.menu.shopLink);
		app.click(app.shopPage.cookBooksLink);
		
		System.out.println("Number of Books listed on sale: " + app.shopPage.numberOfBooksOnSale());
		assertEquals(app.shopPage.numberOfBooksOnSale(), app.shopPage.numberOfBooksListed);
	}

}
