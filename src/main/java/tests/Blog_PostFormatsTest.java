package tests;

import org.testng.annotations.Test;

import utils.BaseTest;

public class Blog_PostFormatsTest extends BaseTest {
	
	@Test
	public void blog_PostFormatsTest() throws InterruptedException {
		
		app.hoverElement(app.menu.blogLink);
		app.click(app.menu.blogPostFormatsLink);
		app.click(app.blogPostFormats.audioPostLink);
		
		app.click(app.blogPostFormats.playButton);
		
		app.dragAndDrop(app.blogPostFormats.playSlider, 200, 0);
		Thread.sleep(4000);
		app.dragAndDrop(app.blogPostFormats.volumeSlider, 50, 0);
		
		Thread.sleep(10000);
		
	}

}
