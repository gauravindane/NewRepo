package AllClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class InstagramLoginPage {
	
	@FindBy (xpath="//i[@aria-label='Instagram']") private WebElement insta_logo;
	@FindBy (xpath="//input[@name='username']") private WebElement username;
	@FindBy (xpath="//input[@name='password']") private WebElement password;
	@FindBys ({@FindBy (xpath="//footer[@role='contentinfo']/div/div/div/div/a")}) private List<WebElement> footerlinks;
	
	public InstagramLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void verifyInstaLogo() {
		Assert.assertTrue(insta_logo.isDisplayed(), "logo not displayed");
		Reporter.log("verifyInstaLogo");
	}
	
	public void setUsername() {
		Assert.assertTrue(username.isEnabled(), "username is not enabled");
		username.sendKeys("gaurav");
		Reporter.log("setUsername");
	}
	
	

}
