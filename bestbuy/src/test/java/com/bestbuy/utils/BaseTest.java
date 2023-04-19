package com.bestbuy.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import org.openqa.selenium.support.ui.ExpectedConditions;



import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest{

public static WebDriver driver = null;

public void launchBrowser(String url) {

	try {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		
	} catch (Exception ex) {
	
		System.out.println("Problem while launching Browser");
		
		ex.printStackTrace();
	}

}
public void clickAction(WebElement ele) {
	try {
		ele.click();
		
	} catch (Exception ex) {
		
		ex.printStackTrace();
	}
}	
public void waitForElement(WebElement ele) {
	try {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(ele));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	} catch (Exception ex) {
		
		ex.printStackTrace();
	}

}

public void typeText(WebElement ele, String text) {
	try {
		ele.clear();
		ele.sendKeys(text);
		
	} catch (Exception ex) {
		
		ex.printStackTrace();
	}
}
}

	

