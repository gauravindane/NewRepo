package com.Pages.qa;

import static org.testng.Assert.assertTrue;

import java.util.List;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class FbLoginPage {
	
//	@FindBy (xpath="//img[@class='fb_logo _8ilh img']")private WebElement fblogo;
//	@FindBy (xpath="//input[@id='email']")private WebElement username;
//	@FindBy (xpath="//input[@id='pass']")private WebElement password;
//	@FindBy (xpath="//button[@name='login']")private WebElement loginbtn;
//	@FindBy (xpath="//a[text()='Forgotten password?']")private WebElement forgotpasslink;
//	@FindBys ({@FindBy (xpath="//div[@id='pageFooterChildren']/ul/li/a")}) private List<WebElement> footerlinks;
//	
//	
//	public FbLoginPage(WebDriver driver) {
//		PageFactory.initElements(driver, this);
//	}
//	
//	
//	public void verifyFBLogo() {
//		Assert.assertTrue(fblogo.isDisplayed(), "Fb logo is not displayed");
//	}
//	
//	public void setUserName() {
//		Assert.assertTrue(username.isEnabled(), "Username is not enabled");
//		username.sendKeys("Gaurav");
////		password.sendKeys(PassWord);
//	}
//	
//	public void setPassword() {
//		Assert.assertTrue(password.isEnabled(), "username is not enabled");
//		password.sendKeys("gaurav@123");
//	}
//	
//	public void clickLoginButton() {
//		Assert.assertTrue(loginbtn.isEnabled(), "Login button is not enabled");
//		loginbtn.click();
//	}
//	
//	public void verifyForgotPasswordLink() {
//		Assert.assertTrue(forgotpasslink.isEnabled(), "Forgot password link is not enabled");
//	}
//	
//	public void verifyFooterLinks() {
//		Assert.assertEquals(32, footerlinks.size());
//	}
	
	
	@FindBy (xpath = "//h2[text()='Facebook helps you connect and share with the people in your life.']") private WebElement FBLogo;
	@FindBy (xpath = "//input[@id='email']") private WebElement username;
	@FindBy (xpath = "//input[@id='pass']") private WebElement password;
	@FindBy (xpath = "//a[text()='Forgotten password?']") private WebElement forgotPass;
	@FindBy (xpath = "//button[@data-testid='royal_login_button']") private WebElement loginbtn;
	@FindBys ({@FindBy (xpath = "//div[@id='pageFooterChildren']/ul/li/a")}) private List<WebElement> footerlinks;
	
	 public FbLoginPage (WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void verifyFbLogo() {
		 Assert.assertTrue(FBLogo.isDisplayed(), "FBLogo is not displayed");
		 Reporter.log("verifyFbLogo");
	 }
	 
	 public void setUsername() {
		 Assert.assertTrue(username.isEnabled(), "Username is not enabled");
		 username.sendKeys("Gaurav");
		 Reporter.log("setUsername");
	 }
	 
	 public void setPassword() {
		 Assert.assertTrue(password.isEnabled(), "Password is not enabled");
		 password.sendKeys("Gaurav@123");
		 Reporter.log("setPassword");
	 }
	 
	 public void verifyForgotPasswordLnk() {
		 Assert.assertTrue(forgotPass.isEnabled(), "Link not enabled");
		 Reporter.log("verifyForgotPasswordLnk");
	 }
	 
	 public void clickLoginBtn() {
		 Assert.assertTrue(loginbtn.isDisplayed(), "Login button is displayed");
		 loginbtn.click();
		 Reporter.log("clickLoginBtn");
	 }
	 
	 public void verifyFooterLinks() {
		 Assert.assertEquals(footerlinks.size(), 31);
		 Reporter.log("verifyFooterLinks");
	 }

}
