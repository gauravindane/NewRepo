package com.test.qa;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pages.qa.OyoPage;
import com.base.qa.TestBase;

public class OyoTest extends TestBase {
	
	@BeforeClass
	public void openBrowser() {
		launchBrowser("chrome");
	}
	
//	@AfterClass
//	public void tearDown() {
//		driver.close();
//	}

	@Test
	public void verifyOyoPage() {
		OyoPage op = new OyoPage(TestBase.driver);
		op.verifyOyoLogo(driver);
		op.verifyHeaderLinks(driver);
		op.verifySearchBar(driver);
		op.verifySearchButton(driver);
		op.verifyTagLine();
		op.verifyFooterLinks();
		op.clickLanguageButton(driver);
		op.clickInstaButton(driver);
	}
}
