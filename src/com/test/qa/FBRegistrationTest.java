package com.test.qa;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Pages.qa.FBRegistrationPages;
import com.base.qa.TestBase;

import AllClasses.FBRegistrationPage;
import DataProviderPrac.ExcelDataForRegistration;

public class FBRegistrationTest extends TestBase{
	
	@BeforeClass
	public void setup() {
		launchBrowser("chrome");
	}
	
	
	@Test(dataProvider = "getData", dataProviderClass = ExcelDataForRegistration.class)
	public void verifyRegistrationPages() {
		FBRegistrationPages rs = new FBRegistrationPages(TestBase.driver);
		rs.verifyRegistrationPageFields(null, null, null, null);
	}

}
