package com.w3schools.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.w3schools.pages.LoginPage;
import com.w3schools.pages.ProfilePage;
import com.w3schools.utils.BaseTest;
import com.w3schools.utils.Reports;

public class LoginTest extends BaseTest {
	
	Reports report = new Reports();
	
	@Test
	public void loginW3Schools() {
		
		try {
			
			report.setTCDesc("Validating Login functionality");
			
			launchBrowser("https://profile.w3schools.com/log-in");
			
			LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
			ProfilePage profile = PageFactory.initElements(driver, ProfilePage.class);

			
			loginpage.setUsername("gunasekaranandhan24@gmail.com");
			
			loginpage.setPassword("9585148924@Gu");
			
			loginpage.clickLogin();
			
			//Thread.sleep(7000);
			loginpage.waitForLearning();

			
			String loginTitle = "My learning | W3Schools";
			Assert.assertEquals(driver.getTitle(), loginTitle);
			
			
		} catch (Exception e) {
			
			System.out.println("Problem while loggin into W3Schools");
			e.printStackTrace();
		}
		
		
	}

}
