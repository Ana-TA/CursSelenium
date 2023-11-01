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
	public By countryRegionDropDown = By.xpath("//span [@class='select2-selection__rendered']");
	public By provinceDropDown = By.id("select2-shipping_state-container");
	public By oopsMsgScreen = By.cssSelector("[class='rs_error_message_oops']");
	public By dropDoownMenuId = By.id("select2-shipping_country-results");
	
	public By dropDown = By.name("Select a country / region ...");
	

	public void filterByIndex(By locator, String optionText) {

		WebElement dropdownButton = returnWebElement(locator);
		dropdownButton.click();
		List<WebElement> dropdownMenu = returnWebElements(dropDoownMenuId);
		if (dropdownButton.isDisplayed()) {
			int index= 0;
				for (WebElement element: dropdownMenu) {
					System.out.println(element.getText());
				
					if (element.getText().equals(optionText)) {
						System.out.println("test");
						dropdownMenu.get(index).click();
					}
					
					index++;
				}
			}
	}
	
	
	public void filterByValue(String value, By locator) {
		
		Select selectObj = new Select(returnWebElement(locator));
		selectObj.selectByValue(value);
		
	}
	
	public String getCurrentSelectedOption(By locator) {
		//TODO
		Select selectObj = new Select(returnWebElement(locator));
		return selectObj.getFirstSelectedOption().getText();
	}

}
