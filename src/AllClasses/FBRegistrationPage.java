package AllClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FBRegistrationPage {
	
	@FindBy (xpath=("//img[@class='fb_logo _agiv img']")) private WebElement reg_fblogo;
	@FindBy (xpath=("//a[text()='Already have an account?']")) private WebElement already_acc;
	@FindBy (xpath=("//input[@name='firstname']")) private WebElement firstname;
	@FindBy (xpath=("//input[@name='lastname']")) private WebElement lastname;
	@FindBy (xpath=("//input[@name='reg_email__']")) private WebElement mob_email;
	@FindBy (xpath=("//input[@name='reg_passwd__']")) private WebElement password;
	@FindBy (xpath=("//select[@id='day']")) private WebElement bday;
	@FindBy (xpath=("//select[@id='month']")) private WebElement bmonth;
	@FindBy (xpath=("//select[@id='year']")) private WebElement byear;
	@FindBy (xpath=("//label[text()='Female']")) private WebElement gender_female;
	@FindBy (xpath=("//label[text()='Male']")) private WebElement gender_male;
	@FindBy (xpath=("//button[@name='websubmit']")) private WebElement submit_button;
	@FindBys ({@FindBy (xpath=("//div[@id='pageFooterChildren']/ul/li/a"))}) private List<WebElement> footerlinks;
	
	
	public FBRegistrationPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void verifyRegistrationPageLogo() {
		Assert.assertTrue(reg_fblogo.isDisplayed(), "FB logo is not displayed");
		Reporter.log("Logo is displayed");
	}
	
	public void verifyAlreadyAccountLink() {
		Assert.assertTrue(already_acc.isDisplayed(), "Link is not displayed");
		Assert.assertTrue(already_acc.isEnabled(), "Link is disabled");
		Reporter.log("Link is working fine");
	}
	
	public void setFirstname() {
		Assert.assertTrue(firstname.isEnabled());
		firstname.sendKeys("Gaurav");
	}
	
	public void setLastname() {
		Assert.assertTrue(lastname.isEnabled());
		firstname.sendKeys("Ind");
	}
	
	public void setMobileEmail() {
		Assert.assertTrue(mob_email.isEnabled(), "email field is disabled");
		mob_email.sendKeys("ABc@gamil.com");
		Reporter.log("setMobileEmail");
	}
	
	public void setPassword() {
		Assert.assertTrue(password.isEnabled(), "Password field is enabled");
		Reporter.log("setPassword");
	}
	
	public void setBirthDay() {
		Assert.assertFalse(bday.isSelected(), "Bday option is already selected");
		Select s = new Select(bday);
		s.selectByIndex(14);
	}
	
	public void setBirthMonth() {
		Assert.assertTrue(bmonth.isDisplayed(), "Birth month is displayed");
		Assert.assertFalse(bmonth.isSelected(), "Birth month is already selected");
		Select s1=new Select(bmonth);
		s1.selectByValue("6");
	}
	
	public void setBirthYear() {
		Assert.assertFalse(byear.isSelected(), "Birth year is already selected");
		Select s2=new Select(byear);
		s2.selectByVisibleText("1994");
	}
	
	public void setGender(String gender) {
		Assert.assertFalse(gender_female.isSelected(), "gender already selected");
		if(gender.equalsIgnoreCase("female")) {
			gender_female.click();
		}else if(gender.equalsIgnoreCase("male")){
			gender_male.click();
		}else {
			System.out.println("Wrong input is selected");
		}
	}
	
	public void verifyFooterLinks() {
		Assert.assertEquals(footerlinks.size(), 31);
		Reporter.log("verifyFooterLinks");
	}
	
	
	
	
	
	
	
	
	
	
	

}
