package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class Blog_ClassicPage extends SeleniumWrappers{

	public Blog_ClassicPage(WebDriver driver) {
		super(driver);
	}
	
	public By searchTitle = By.xpath("//input[@class='search_field' and @title='Search for:']");
	public By buttonSearch = By.xpath("//button[@type='submit' and @class='search_button icon-search']");
	public By readMoreLink = By.xpath("//span[@class='post_readmore_label' and text()='Read more']");
	
	public By classicCategTag = By.xpath("//a[@class='category_link' and @href='https://keybooks.ro/category/classic/' and text()='Classic']");
	public By newsCategTag = By.xpath("//a[@class='category_link' and @href='https://keybooks.ro/category/news/' and text()='News']");
	public By recommendCategTag = By.xpath("//a[@class='category_link' and @href='https://keybooks.ro/category/recommend/' and text()='Recommend']");

	
	public boolean isInCategory(By locator) {
		
		boolean locatorFound = true;
		try
		{
			waitForElementToBeVisible(locator);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			locatorFound = false;
		}
		return locatorFound;
	}
}
