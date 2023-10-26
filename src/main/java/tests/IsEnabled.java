package tests;

import org.testng.annotations.Test;

import utils.BaseTest;

public class IsEnabled extends BaseTest {
	
	@Test
	public void isEnabledTest() {
		
		app.menu.navigateTo(app.menu.loginLink);
		System.out.println(app.returnWebElement(app.login.usernameField).isEnabled());  //verifica daca un element de tipul input este enabled sau nu
	}

}
