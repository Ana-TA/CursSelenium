package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import utils.BaseTest;

public class ReviewsTest extends BaseTest {
	
	@Test(priority=1)
	public void reviewTest() {

		app.menu.navigateTo(app.reviews.stormBookLink);
		app.click(app.reviews.reviewsLink);
		app.click(app.reviews.submitButton);
		
		driver.switchTo().alert().accept();

		app.returnWebElement(app.reviews.threeStartsRating).click();
		app.reviews.writeDetails("My neww comment...", "My neww name ...", "test@test.com");
		app.click(app.reviews.submitButton);
		
		assertTrue(app.returnWebElement(app.reviews.waitingApprovalText).isDisplayed());
	}
	
	
}
