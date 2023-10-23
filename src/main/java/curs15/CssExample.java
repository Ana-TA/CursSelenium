package curs15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class CssExample extends BaseTest {
	
	
	//@Test
	public void cssExample() {
		
		WebElement loginLink = driver.findElement(By.cssSelector("a[href='#popup_login']"));
		loginLink.click();
		
		//Logical AND
		WebElement usernameField = driver.findElement(By.cssSelector("ul input[id='log'][name='log']"));
		usernameField.sendKeys("TestUser");
		
		//Logial OR
		WebElement passwordField = driver.findElement(By.cssSelector("input[type='password'],[name='pwd']"));
		passwordField.sendKeys("TestUser");
		
		//direct child ('>' --> 'div>')
		WebElement submitButton = driver.findElement(By.cssSelector("div>input[type='submit']"));
		submitButton.click();
	}
	
	@Test
	public void cssExample2() {
		// * --> contains
		WebElement book1 = driver.findElement(By.cssSelector("a[href*='deep']"));
		System.out.println(book1.getText());
		
		//^StartsWith
		WebElement book2 = driver.findElement(By.cssSelector("a[href^='life']"));
		System.out.println(book2.getText());
	}

}
