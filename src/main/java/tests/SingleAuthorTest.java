package tests;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class SingleAuthorTest extends BaseTest{
	
	@Test (priority=1)
	public void singleAuthorTest() {
		app.menu.navigateTo(app.singleAuthor.singleAuthorLink);
		List<WebElement> elements = app.returnWebElements(app.singleAuthor.scoreSkillsLink);
		
		assertEquals(app.singleAuthor.getAttributeText(elements.get(0)), "95%");
		assertEquals(app.singleAuthor.getAttributeText(elements.get(1)), "75%");
		assertEquals(app.singleAuthor.getAttributeText(elements.get(2)), "82%");

	}

}
