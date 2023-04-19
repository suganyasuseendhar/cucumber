package com.bestbuy.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bestbuy.pages.CreateAccountPage;

public class CreateAccountTest extends CreateAccountPage {
	
	@Test
	public void newAccount() {
		
		try {
			
			launchBrowser("https://www.bestbuy.com/identity/newAccount?token=tid%3Ac77bf73a-de0b-11ed-aceb-02c1750f522d");
			CreateAccountPage accountPage = PageFactory.initElements(driver, CreateAccountPage.class);
			accountPage.fname("suganya");
			accountPage.lname("suseendhar");
			accountPage.email("suganit40@gmail.com");
			accountPage.password1("gsugan@5678");
			accountPage.password2("gsugan@5678");
			accountPage.mobileNumber("7358638444");
			accountPage.backupMail();
			accountPage.newAccount();
			accountPage.skipNow();
		
		
		
		
		String createAccountTitle = "Account Home - Best Buy";
		Assert.assertEquals(driver.getTitle(), createAccountTitle);
		}
		catch(Exception e) {
			
			
			e.printStackTrace();
			
		}
		
	}

}
