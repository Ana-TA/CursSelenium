package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class ContactPage extends SeleniumWrappers{
	
public ContactPage(WebDriver driver) {
		super(driver);
	}

//public WebDriver driver;
	
	//public ContactPage(WebDriver driver) {
		//this.driver = driver;
	//}
	
	public By nameField = By.cssSelector("input[name='your-name']");
	public By emailField = By.cssSelector("input[type='email']");
	public By subjectField = By.cssSelector("input[name='your-s']");
	public By messageField = By.cssSelector("textarea[name='your-message']");
	public By submitButton = By.cssSelector("p>input[type='submit'");
	public By sucessContactMsg = By.cssSelector("div[class*='response-output']");
	public By zoomInButton = By.cssSelector("button[title='Zoom in']");
	public By zoomOutButton = By.cssSelector("button[title='Zoom out']");
	public By iframe = By.tagName("iframe");
	
	public void contactDetailsInApp(String name, String email, String subject, String message) {
		driver.findElement(nameField).sendKeys(name);
		driver.findElement(emailField).sendKeys(email);
		driver.findElement(subjectField).sendKeys(subject);
		driver.findElement(messageField).sendKeys(message);
		driver.findElement(submitButton).click();
	}
	
	public boolean checkContactMsgIsDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
	
	public void zoomMap(By locator) {
		driver.switchTo().frame(returnWebElement(iframe));
		click(locator);
	}

}
