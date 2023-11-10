package utils;

import org.openqa.selenium.WebDriver;

import pages.Blog_ClassicPage;
import pages.Blog_PostFormatsPage;
import pages.BookPage;
import pages.ContactPage;
import pages.EventsPage;
import pages.GenericEventPage;
import pages.HeaderBar;
import pages.LoginPage;
import pages.MenuPage;
import pages.ReviewsPage;
import pages.ShippingAddressPage;
import pages.ShopPage;
import pages.SingleAuthorPage;

public class BasePage extends SeleniumWrappers{

	public BasePage(WebDriver driver) {
		super(driver);
	}
	
	public LoginPage login = new LoginPage(driver);
	public MenuPage menu = new MenuPage(driver);
	public ReviewsPage reviews = new ReviewsPage(driver);
	public SingleAuthorPage singleAuthor = new SingleAuthorPage(driver);
	public ShopPage shopPage = new ShopPage(driver);
	public ContactPage contactPage = new ContactPage(driver);
	public ShippingAddressPage shippingAddress = new ShippingAddressPage(driver);
	public EventsPage events = new EventsPage(driver); 
	public GenericEventPage genericEvent = new GenericEventPage(driver);
	public BookPage book = new BookPage(driver);
	public HeaderBar headerBar = new HeaderBar(driver);
	public Blog_ClassicPage blog = new Blog_ClassicPage(driver);
	public Blog_PostFormatsPage blogPostFormats = new Blog_PostFormatsPage(driver);
}
