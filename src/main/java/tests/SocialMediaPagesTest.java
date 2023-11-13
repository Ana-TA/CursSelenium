package tests;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.BaseTest;

public class SocialMediaPagesTest extends BaseTest{
	
	public List<String> browserTabs;
	
	@Test
	public void socialMediaPagesTest() {
		
		/*app.click(app.headerBar.fbLink);
		
		browserTabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(browserTabs.get(1));
		
		assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/keytraining.ro");
		driver.close();

		//back to Main Page
		app.backToPage(browserTabs, 0);
		
		app.click(app.headerBar.twitterLink);
		browserTabs = new ArrayList<>(driver.getWindowHandles());
		
		driver.switchTo().window(browserTabs.get(1));
		assertEquals(driver.getCurrentUrl(), "https://twitter.com/");
		driver.close();
		
		//back to Main Page
		app.backToPage(browserTabs, 0);
		
		app.click(app.headerBar.instaLink);
		browserTabs = new ArrayList<>(driver.getWindowHandles());
		
		driver.switchTo().window(browserTabs.get(1));
		assertEquals(driver.getCurrentUrl(), "https://www.instagram.com/");
		driver.close();
		
		//back to Main Page
		app.backToPage(browserTabs, 0);
		
		browserTabs = new ArrayList<>(driver.getWindowHandles());
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/");
		*/
		
		By[] socialMediaRedirects =  {app.headerBar.fbLink, app.headerBar.twitterLink, app.headerBar.instaLink};
		String[] urlsToCheck = {"https://www.facebook.com/keytraining.ro", "https://twitter.com/", "https://www.instagram.com/"};
		
		for (int i = 0; i < socialMediaRedirects.length; i++) {
			
			app.click(socialMediaRedirects[i]);
			List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
			driver.switchTo().window(browserTabs.get(1));
			assertEquals(driver.getCurrentUrl(), urlsToCheck[i]);
			driver.close();
			driver.switchTo().window(browserTabs.get(0));
		}
	}

}
