package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.SeleniumWrappers;

public class ShopPage extends SeleniumWrappers{

	public ShopPage(WebDriver driver) {
		super(driver);
	}
	
	public By orderDropDown = By.name("orderby");
	
	public By cookBooksLink = By.xpath("//a[@href='https://keybooks.ro/product-category/cookbooks/' and text()='Cookbooks']");
	public By deletedPrice = By.xpath("//del[@aria-hidden='true']//span[@class='woocommerce-Price-currencySymbol' and text()='$']");
	
	public By sliderInitialPosition = By.cssSelector("span[style='left: 0%;']");
	public By sliderFinalPosition = By.cssSelector("span[style='left: 100%;']");
	
	public By romansLink = By.xpath("//a[@href='https://keybooks.ro/product-category/romans/' and text()='Romans']");
	
	public String bookListedPartialLinkLocator = "//a[@href='https://keybooks.ro/shop";
	
	public int numberOfBooksListed = 5;
	
	public void filterByValue(String value) {
		
		Select selectObj = new Select(returnWebElement(orderDropDown));
		selectObj.selectByValue(value);
		
	}
	
	public void filterByVisibleText(String text) {
		
		Select selectObj = new Select(returnWebElement(orderDropDown));
		selectObj.selectByVisibleText(text);
		
	}
	
	public void filterByIndex(int index) {
		
		Select selectObj = new Select(returnWebElement(orderDropDown));
		selectObj.selectByIndex(index);
		
	}
	
	public String getCurrentSelectedOption() {
		
		Select selectObj = new Select(returnWebElement(orderDropDown));
		return selectObj.getFirstSelectedOption().getText();
	}
	
	public int numberOfBooksOnSale() {
		
		List<WebElement> deletedPrices = returnWebElements(deletedPrice);
		return deletedPrices.size();
	}
	

}
