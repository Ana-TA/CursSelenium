package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MenuPage;
import utils.BasePage;
import utils.BaseTest;
import utils.SeleniumWrappers;

public class IsSelectedExample extends BaseTest{
	
	@Test
	public void isSelectedTest() {
		
		app.menu.navigateTo(app.menu.loginLink);
		app.returnWebElement(app.login.rememeberMeCheckBox).click();
		assertTrue(app.returnWebElement(app.login.rememeberMeCheckBox).isSelected());
		
		
		//MenuPage menu = new MenuPage(driver);
		//menu.navigateTo(menu.loginLink);
		//LoginPage login = new LoginPage(driver);
		//SeleniumWrappers seleniumWrapper =  new SeleniumWrappers();
		//System.out.println(seleniumWrapper.returnWebElement(login.rememeberMeCheckBox));
		//seleniumWrapper.returnWebElement(login.rememeberMeCheckBox).click();
		//System.out.println(seleniumWrapper.returnWebElement(login.rememeberMeCheckBox));
		
		//WebElement rememberMe = driver.findElement(login.rememeberMeCheckBox);
		//System.out.println(rememberMe.isSelected()); //pentru atributele: type=checkbox sau type=radio-button
		//rememberMe.click();
		//System.out.println(rememberMe.isSelected());
	}

}
