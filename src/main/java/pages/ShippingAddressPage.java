package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.SeleniumWrappers;

public class ShippingAddressPage extends SeleniumWrappers {

	public ShippingAddressPage(WebDriver driver) {
		super(driver);
	}
	
	public String shippingURL = "https://keybooks.ro/account/edit-address/shipping/";
	public By oopsMsgScreen = By.cssSelector("[class='rs_error_message_oops']");
	public By dropDoownMenuId = By.id("select2-shipping_country-results");
	
	public By countryDropDown = By.name("shipping_country");
	public By provinceDropDown = By.name("shipping_state");
	

	public void filterByIndex(int index) {
		
		Select selectObj = new Select(returnWebElement(countryDropDown));
		selectObj.selectByIndex(index);
		
	}
	
	public void filterByValue(String value) {
		
		Select selectObj = new Select(returnWebElement(provinceDropDown));
		selectObj.selectByValue(value);
		
	}
	
	public String getCurrentSelectedOption(By locator) {
		
		Select selectObj = new Select(returnWebElement(locator));
		return selectObj.getFirstSelectedOption().getText();
	}

}
