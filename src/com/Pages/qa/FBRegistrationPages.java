package com.Pages.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBRegistrationPages {
	
	@FindBy (xpath = "//a[@id='u_0_0_vx']")private WebElement createnewacc;
	@FindBy (xpath = "//input[@name='firstname']")private WebElement firstname;
	@FindBy (xpath = "//input[@name='lastname']")private WebElement lastname;
	@FindBy (xpath = "//input[@name='reg_email__']")private WebElement email;
	@FindBy (xpath = "//input[@name='reg_passwd__']")private WebElement newpassword;
	
	public FBRegistrationPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyRegistrationPageFields(String Firstname, String Lastname, String Email, String Password) {
		createnewacc.click();
		firstname.sendKeys(Firstname);
		lastname.sendKeys(Lastname);
		email.sendKeys(Email);
		newpassword.sendKeys(Password);
	}

}
