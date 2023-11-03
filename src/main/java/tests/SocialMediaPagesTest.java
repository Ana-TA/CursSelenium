package tests;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import utils.BaseTest;

public class SocialMediaPagesTest extends BaseTest{
	
	public List<String> browserTabs;
	
	@Test
	public void socialMediaPagesTest() {
		
		app.click(app.headerBar.fbLink);
		
		browserTabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(browserTabs.get(1));
		
		assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/keytraining.ro");
		driver.close();

		//back to main page
		driver.switchTo().window(browserTabs.get(0));
		browserTabs.clear();
		
		app.click(app.headerBar.twitterLink);
		browserTabs = new ArrayList<>(driver.getWindowHandles());
		
		driver.switchTo().window(browserTabs.get(1));
		assertEquals(driver.getCurrentUrl(), "https://twitter.com/");
		driver.close();
		
		//back to main page
		driver.switchTo().window(browserTabs.get(0));
		browserTabs.clear();
		
		app.click(app.headerBar.instaLink);
		browserTabs = new ArrayList<>(driver.getWindowHandles());
		
		driver.switchTo().window(browserTabs.get(1));
		assertEquals(driver.getCurrentUrl(), "https://www.instagram.com/");
		driver.close();
		
		//back to main page
		driver.switchTo().window(browserTabs.get(0));
		browserTabs.clear();
		
		browserTabs = new ArrayList<>(driver.getWindowHandles());
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/");
	}

}
