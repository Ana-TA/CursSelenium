package curs14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import utils.BaseTest;

public class SeleniumLocator extends BaseTest{
	
	@Test(priority =1)
	public void tagNameExample() {
		//<em>Discover</em>
		WebElement discoverText = driver.findElement(By.tagName("em"));
		String text = discoverText.getText();
		assertEquals(text, "Discover");
		
	}
	
	@Test(priority =2)
	public void linkTextExample() {
		//<a href="https://keybooks.ro/shop/"Books</a>>
		WebElement shopLink = driver.findElement(By.linkText("BOOKS"));
		shopLink.click();
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/");
	}
	
	@Test(priority =3)
	public void partialLinkTextExample() {
		WebElement cookingBookLink = driver.findElement(By.partialLinkText("love"));
		cookingBookLink.click();
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/cooking-with-love/");
		
	}
	
	@Test(priority =4)
	public void classNameLocator() {
		WebElement price = driver.findElement(By.className("price"));
		
		System.out.println(price.getText());
		
		assertTrue(price.getText().contains("18.49"));
	}
	
	@Test(priority =5)
	public void idLocator() {
		WebElement reviewTab = driver.findElement(By.id("tab-title-reviews"));
		reviewTab.click();
		
		WebElement reviewElement = driver.findElement(By.className("woocommerce-Reviews-title"));
		assertTrue(reviewElement.isDisplayed());
		assertEquals(reviewElement.getText(), "Reviews");
		
	}
	
	@Test(priority =6)
	public void nameLocator() {
		WebElement messageBox = driver.findElement(By.name("comment"));
		messageBox.sendKeys("My  message");
	}
	
	@Test(priority =7)
	public void cssSelector() {
		WebElement nameTextBox = driver.findElement(By.cssSelector("input[name='author']"));
		nameTextBox.sendKeys("My Name");
	}

}
