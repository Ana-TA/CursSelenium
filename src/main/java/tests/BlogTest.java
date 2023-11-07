package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTest;

public class BlogTest extends BaseTest{
	
	@Test
	public void blogTest() {
		
		app.click(app.menu.blogLink);
		app.click(app.menu.blogClassic);
		
		Actions action = new Actions(driver);
		action.scrollByAmount(0,700);
		app.sendKeys(app.blog.searchTitle, "why");
		app.click(app.blog.buttonSearch);
		app.click(app.blog.readMoreLink);
		
		assertTrue(app.blog.isInCategory(app.blog.classicCategTag));
		assertTrue(app.blog.isInCategory(app.blog.newsCategTag));
		assertTrue(app.blog.isInCategory(app.blog.recommendCategTag));
		
	}

}
