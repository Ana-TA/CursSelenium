package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Blog_PostFormats_JSETest extends BaseTest{
	
	@Test
	public void blog_PostFormats_JSETest() {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		app.hoverElement(app.menu.blogLink);
		//jse.executeScript("document.getElementsByClassName('sub-menu animated fast fadeOut')[0].childNodes[7].click()");
		WebElement blogPostFormatsLink = driver.findElement(app.menu.blogPostFormatsLink);
		jse.executeScript("arguments[0].click()", blogPostFormatsLink);
		
		jse.executeScript("arguments[0].scrollIntoView()", app.returnWebElement(app.blogPostFormats.galleryFormatTitle));
		jse.executeScript("document.getElementsByClassName('sc_button sc_button_square sc_button_style_filled sc_button_size_small')[3].click()");
		jse.executeScript("arguments[0].scrollIntoView()", app.returnWebElement(app.blogPostFormats.addCommentTitle));
		jse.executeScript("document.getElementById('comment').value='Nice pictures!'");
		jse.executeScript("document.getElementById('author').value='My Name'");
		jse.executeScript("document.getElementById('email').value='test@test.com'");
		jse.executeScript("document.getElementById('send_comment').click()");
	}
	

}
