package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class BookPage extends SeleniumWrappers {

	public BookPage(WebDriver driver) {
		super(driver);
	}
	
	public By theForestLink = By.xpath("//div[@id='sc_tab_1456822345_1_17']//a[@href='the-forest' and text()='The forest']");
	public By cookBookLink = By.xpath("//a[text()='A hundred and one receipes']");
	public By magnifier = By.xpath("//a[@href='#' and contains(@class, 'woocommerce-product-gallery__trigger')]");
	public By newPrice = By.xpath("//p[@class='price']//span[@class='woocommerce-Price-amount amount']//bdi[text()='10.35']");
	public By stars = By.xpath("//div[@class='woocommerce-product-rating']//div[@class='star-rating']");
	public By description = By.xpath("//div[@class='woocommerce-product-details__short-description']");
	public By quantity = By.xpath("//div[@class='quantity']/input[@type='number']");
	public By addToCartButton = By.xpath("//button[@type='submit' and text()='Add to cart']");
	public By category = By.xpath("//span[@class='posted_in']/a[text()='Cookbooks']");
	public By title = By.xpath("//div[@class='summary entry-summary']/h1[@class='product_title entry-title']");

}
