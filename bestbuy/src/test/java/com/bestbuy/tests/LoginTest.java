package com.bestbuy.tests;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.bestbuy.pages.LoginPage;

public class LoginTest extends LoginPage {

	@Test
	public void loginBestbuy() {
		
	try {
		launchBrowser("https://www.bestbuy.com/");	
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		loginPage.unitedStatesButton();
		loginPage.clickAccountButton();
		loginPage.Account();
			
		
		String loginTitle = "Best Buy[: Create an Account]";
		Assert.assertEquals(driver.getTitle(), loginTitle);
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
	}
	
	
}
