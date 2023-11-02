package tests;

import org.testng.annotations.Test;

import utils.BaseTest;

public class IFrameExample extends BaseTest {
	
	@Test
	public void ifremeTest() {
		app.click(app.menu.contactsLink);
		app.contactPage.zoomMap(app.contactPage.zoomInButton);
		driver.switchTo().defaultContent();
		app.returnWebElement(app.contactPage.nameField).sendKeys("Text");
	}

}
