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
		app.sendKeys(app.reviews.reviewComment, "My neww comment...");
		app.sendKeys(app.reviews.nameField, "My neww name ...");
		app.sendKeys(app.reviews.emailField, "test@test.com");
		app.click(app.reviews.submitButton);
		
		assertTrue(app.returnWebElement(app.reviews.waitingApprovalText).isDisplayed());
	}
	
	
}
