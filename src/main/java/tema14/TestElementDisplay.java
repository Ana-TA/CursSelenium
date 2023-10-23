package tema14;

import org.testng.annotations.Test;
import utils.BaseTest;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestElementDisplay extends BaseTest{
	
	@Test(priority =1)
	public void testDisplayed1() {
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		assertTrue(loginLink.isDisplayed());
		
		loginLink.click();
	}
	
	@Test(priority =2)
	public void testDisplayed2() {
		WebElement username = driver.findElement(By.id("log"));
		assertTrue(username.isDisplayed());	
	}
	
	@Test(priority =3)
	public void testDisplayed3() {
		WebElement password = driver.findElement(By.id("password"));
		assertTrue(password.isDisplayed());
	}
}
