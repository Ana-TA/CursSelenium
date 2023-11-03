package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import utils.BaseTest;

public class BookTest extends BaseTest{
	
	@Test
	public void bookTest() {
		
		app.click(app.book.cookBookLink);
		
		assertTrue(app.returnWebElement(app.book.magnifier).isDisplayed());
		assertTrue(app.returnWebElement(app.book.newPrice).isDisplayed());
		assertTrue(app.returnWebElement(app.book.stars).isDisplayed());
		assertTrue(app.returnWebElement(app.book.description).isDisplayed());
		assertTrue(app.returnWebElement(app.book.quantity).isDisplayed());
		assertTrue(app.returnWebElement(app.book.addToCartButton).isDisplayed());
		assertTrue(app.returnWebElement(app.book.category).isDisplayed());
		assertTrue(app.returnWebElement(app.book.title).isDisplayed());
	}

}
