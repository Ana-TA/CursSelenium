package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class Blog_PostFormatsPage extends SeleniumWrappers {

	public Blog_PostFormatsPage(WebDriver driver) {
		super(driver);
	}
	
	public By audioPostLink = By.xpath("//a[@href='https://keybooks.ro/2016/02/02/audio-post/' and text()='Audio post']");
	public By playButton = By.xpath("//div[@class='mejs-button mejs-playpause-button mejs-play']");
	public By playSlider = By.xpath("//span[@class='mejs-time-current']");
	public By volumeSlider = By.xpath("//a[@class='mejs-horizontal-volume-slider']");
}
