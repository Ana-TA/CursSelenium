package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage {
	
	public WebDriver driver;
	
	public MenuPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By loginLink = By.cssSelector("li>a[href='#popup_login']");
	public By contactsLink = By.linkText("CONTACTS");
	public By shopLink = By.linkText("BOOKS");
	public By eventsLink = By.linkText("EVENTS");
	
	public By blogLink = By.linkText("BLOG");
	public By blogClassic = By.xpath("//li[@id='menu-item-114']//a[@href='https://keybooks.ro/category/classic/' and text()='Classic']");
	public By blogPostFormatsLink = By.xpath("(//a[@href='https://keybooks.ro/category/post-formats/' and text()='Post Formats'])[1]");
	
	public By aboutLink = By.linkText("ABOUT");
	public By signUpButton = By.cssSelector("input[value='Sign up']");
	
	public By searchIcon = By.xpath("(//button[contains(@class, 'icon-search')])[1]");
	public By searchInput = By.xpath("(//input[contains(@class,'search_field')])[1]"); 
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}
	
	public void search(String text) {
		driver.findElement(searchIcon).click();
		driver.findElement(searchInput).clear();
		driver.findElement(searchInput).sendKeys(text);
		driver.findElement(searchIcon).click();
	}
	
}
