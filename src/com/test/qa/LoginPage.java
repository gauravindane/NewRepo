package com.test.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Pages.qa.FbLoginPage;
import com.base.qa.TestBase;
import com.utility.qa.Utilities;

import DataProviderPrac.ExcelDataProvider;

public class LoginPage extends TestBase {
	
	
	
//	@BeforeClass
//	public void setup() {
//		launchBrowser("chrome");
//	}
//	
//	@AfterClass
//	public void closebrowser() {
//		teardown();
//	}
//	
//	@Test
//	public void verifyLoginPage() {
//		FbLoginPage lp = new FbLoginPage(TestBase.driver);
//		lp.verifyFBLogo();
//		lp.setUserName();
//		lp.setPassword();
//		lp.verifyForgotPasswordLink();
//		lp.verifyFooterLinks();
//		lp.clickLoginButton();
//		
//	}
	
	
	@BeforeClass
	public void openBrowser() {
		launchBrowser("edge");
	}
	
//	@AfterClass
//	public void closeBrowser() {
//		tearDown();
//	}
	
	
	@Test
	public void verifyFbLoginPage() {
		FbLoginPage lp = new FbLoginPage(TestBase.driver);
//		Utilities ut = new Utilities();
		
		lp.verifyFbLogo();
		lp.setUsername();
		lp.setPassword();
		lp.verifyForgotPasswordLnk();
		lp.verifyFooterLinks();
		lp.clickLoginBtn();
//		ut.titleByJS(driver);
//		ut.alertByJS(driver, "Login Page");
		System.out.println(Utilities.TitlebyJS(driver));
		Utilities.alertByJS(driver, "Login Page");
	}

}
