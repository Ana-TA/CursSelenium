package utils;

import org.openqa.selenium.WebDriver;

import pages.LoginPage;
import pages.MenuPage;
import pages.ReviewsPage;
import pages.SingleAuthorPage;

public class BasePage extends SeleniumWrappers{

	public BasePage(WebDriver driver) {
		super(driver);
	}
	
	public LoginPage login = new LoginPage(driver);
	public MenuPage menu = new MenuPage(driver);
	public ReviewsPage reviews = new ReviewsPage(driver);
	public SingleAuthorPage singleAuthor = new SingleAuthorPage(driver);
}
