package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SingleAuthorPage {
	
	public WebDriver driver;

	public SingleAuthorPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By singleAuthorLink = By.cssSelector("[class ='menu_main_wrap'] [href='/margaret-robins/']");
	public By scoreSkillsLink = By.cssSelector("[class ='sc_skills_total']");
	
	public String getAttributeText(WebElement attribute) {
		return attribute.getText();
	}

}
