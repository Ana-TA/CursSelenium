package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class HeaderBar extends SeleniumWrappers{

	public HeaderBar(WebDriver driver) {
		super(driver);
	}
	
	public By fbLink = By.xpath("//div[@class='top_panel_top_user_area']//a[@href='https://www.facebook.com/keytraining.ro' and @class='social_icons social_facebook']");
	public By twitterLink = By.xpath("//div[@class='top_panel_top_user_area']//a[@class='social_icons social_twitter']");
	public By instaLink = By.xpath("//div[@class='top_panel_top_user_area']//span[@class='icon-instagramm']");

}
