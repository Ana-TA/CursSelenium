package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.BaseTest;

public class DataProviderExample3 extends BaseTest{
	
	@DataProvider(name="romansBooksDataProvider")
	public Object[][] romansBooksDataProvider() {
		
		Object[][] data = new Object[4][2];
		
		data[0][0] = "A banquet of  mouse";
		data[0][1] = "/a-banquet-of-mouse/";
		
		data[1][0] = "Life in the garden";
		data[1][1] = "/life-in-the-garden/";
		
		data[2][0] = "Lonely man in white hat";
		data[2][1] = "/lonely-man-in-white-hat/";
		
		data[3][0] = "The son";
		data[3][1] = "/the-son/";
		
		return data;
	}
	
	@Test(dataProvider = "romansBooksDataProvider")
	public void checkBooksUrlTest(String title, String urlTitle) {
		
		app.click(app.menu.shopLink);
		app.click(app.shopPage.romansLink);
		
		String locatorString = app.shopPage.bookListedPartialLinkLocator + urlTitle + "'" + "and text()='" + title + "']";
		By bookListedLink = By.xpath(locatorString);
		
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 800).perform();
		
		app.click(bookListedLink);
		
		String currentURL =  driver.getCurrentUrl();
		assertTrue(currentURL.contains(urlTitle));
		
		WebElement romansCategory = driver.findElement(app.book.romansCategory);
		assertTrue(romansCategory.isDisplayed());

	}

}
