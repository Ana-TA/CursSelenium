package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class LoginPage extends SeleniumWrappers{
	
	//public WebDriver driver;
	
	//public LoginPage(WebDriver driver) {
		//this.driver = driver;
	//}
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	//locatori sau webelemente
	public By usernameField = By.id("log");
	public By passwordField = By.id("password");
	public By submitButton = By.className("submit_button");
	public By sucessLoginMsg = By.cssSelector("div[class*='sc_infobox_style_success']");
	public By errorLoginMsg = By.cssSelector("div[class*='sc_infobox_style_error']");
	public By rememeberMeCheckBox = By.cssSelector("li input[type='checkbox']");
	public By logoutButton = By.linkText("Logout");
	public By closeLoginPopup = By.cssSelector("a[class='popup_close']");
	
	
	//metode specifice paginii sau functionalitatii pe care o reprezinta
	public void loginInApp(String user, String pass) {
		driver.findElement(usernameField).clear();
		driver.findElement(passwordField).clear();
		driver.findElement(usernameField).sendKeys(user);
		driver.findElement(passwordField).sendKeys(pass);
		driver.findElement(submitButton).click();
	}
	
	public boolean checkLoginMsgIsDisplayed(By locator) {
		return driver.findElement(locator).isDisplayed();
	}
	
}
