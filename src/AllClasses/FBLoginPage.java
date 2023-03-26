package AllClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class FBLoginPage {
	
	@FindBy (xpath=("//img[@alt='Facebook']")) private WebElement fblogo;
	@FindBy (xpath=("//input[@id='email']")) private WebElement username;
	@FindBy (xpath=("//input[@id='pass']")) private WebElement password;
	@FindBy (xpath=("//a[text()='Forgotten password?']")) private WebElement forgot_password;
	@FindBys ({@FindBy (xpath=("//div[@id='pageFooterChildren']/ul/li/a"))}) private List<WebElement> footerlinks;
	
	
	public FBLoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyFBLogo() {
		Assert.assertTrue(fblogo.isDisplayed(), "Fb logo is not displayed");
		Reporter.log("Fb logo is verified");
	}
	
	public void setUsername() {
		Assert.assertTrue(username.isEnabled(), "username field is not enabled");
		username.sendKeys("Gaurav");
		Reporter.log("Username field is verified");
	}
	
	public void setPassword() {
		Assert.assertTrue(password.isEnabled(), "Password is not enabled");
		password.sendKeys("abc@123");
		Reporter.log("Password field is verified");
	}
	
	public void verifyForgotPasswordLink() {
		Assert.assertTrue(forgot_password.isEnabled(), "Link is not enabled");
		Assert.assertTrue(forgot_password.isDisplayed(), "Link is displayed");
		Reporter.log("Link is verified");
	}
	
	public void verifyFooterLinks() {
		Assert.assertEquals(footerlinks.size(), 31);
		Reporter.log("footer links are verified");
	}
	

}
