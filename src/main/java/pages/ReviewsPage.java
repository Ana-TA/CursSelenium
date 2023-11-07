package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.BasePage;
import utils.SeleniumWrappers;

public class ReviewsPage extends SeleniumWrappers {
	
	public ReviewsPage(WebDriver driver) {
		super(driver);
	}

	public WebDriver driver;
	
	public By stormBookLink = By.cssSelector("a[href='storm']");
	public By reviewsLink = By.cssSelector("a[href='#tab-reviews']");
	public By submitButton = By.cssSelector("input[name='submit']");
	public By threeStartsRating = By.cssSelector("[class='star-3']");
	public By reviewComment = By.cssSelector("textarea[id='comment']");
	public By nameField = By.cssSelector("input[id='author']");
	public By emailField = By.cssSelector("input[id='email']");
	public By waitingApprovalText = By.cssSelector("[class='woocommerce-review__awaiting-approval']");
	
	public void writeDetails(String comment, String name, String email) {
		sendKeys(reviewComment, comment);
		sendKeys(app.reviews.nameField, name);
		sendKeys(app.reviews.emailField, email);
	}
}
