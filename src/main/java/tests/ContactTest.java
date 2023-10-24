package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.ContactPage;
import pages.MenuPage;
import utils.BaseTest;

public class ContactTest extends BaseTest{
	
	@Test (priority=1)
	public void sendContactDetails() throws InterruptedException {
		
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.contactsLink);
		
		ContactPage contact = new ContactPage(driver);
		contact.contactDetailsInApp("TestUser", "test@test.com", "Contact Page Test", "Message Message Message");
		
		Thread.sleep(1000);
		assertTrue(contact.checkContactMsgIsDisplayed(contact.sucessContactMsg));
				
	}
}
