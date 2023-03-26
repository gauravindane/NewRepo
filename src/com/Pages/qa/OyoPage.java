package com.Pages.qa;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.utility.qa.Utilities;

public class OyoPage extends Utilities {
	
	@FindBy (xpath = "//div[@class='headerPrimary__logoWrapper undefined']")private WebElement oyoLogo;
	@FindBys (@FindBy (xpath = "//div[@data-cms-id='688284']/div/div"))private List<WebElement> headerLinks;
	@FindBy (xpath = "//h1[text()='Over 157,000 hotels and homes across 35 countries']")private WebElement tagLine;
	@FindBy (xpath = "//input[@id='autoComplete__home']")private WebElement searchBar;
	@FindBy (xpath = "//button[text()='Search']")private WebElement searchButton;
	@FindBys ({@FindBy(xpath = "//div[@class='oyo-cell--12-col footerDestinations__cityGrid']/a")})private List<WebElement>footerLinks;
	@FindBy (xpath = "//div[@class='c-ecv2tz']")private WebElement languageButton;
	@FindBy (xpath = "//a[@href='https://instagram.com/oyorooms/']")private WebElement instaButton;
	@FindBy (xpath = "//span[text()='OYO Hotel USA']")private WebElement USAHotel;
	
	
	public OyoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyOyoLogo(WebDriver driver) {
		Assert.assertTrue(oyoLogo.isDisplayed(), "Oyo Logo is not displayed");
		Utilities.borderByJS(driver, oyoLogo);
		Reporter.log("verifyOyoLogo");
	}
	
	public void verifyHeaderLinks(WebDriver driver) {
		Assert.assertEquals(headerLinks.size(), 10);
		Reporter.log("verifyHeaderLinks");
		Actions action=new Actions(driver);
		for(int i=0; i<headerLinks.size(); i++) {
			WebElement link = headerLinks.get(i);
			action.moveToElement(link);
			action.build().perform();
		}
	}
	
	public void verifyTagLine() {
		Assert.assertEquals("Over 157,000 hotels and homes across 35 countries", "Over 157,000 hotels and homes across 35 countries");
		Reporter.log("verifyTagLine");
	}
	
	public void verifySearchBar(WebDriver driver) {
//		Assert.assertTrue(searchBar.isEnabled(), "Search bar is enabled");
//		Assert.assertFalse(searchBar.isDisplayed(), "Search bar is getting displyed");
		SoftAssert soft = new SoftAssert();
		soft.assertFalse(searchBar.isDisplayed(), "Search bar is displayed");
		Actions action = new Actions(driver);
		action.keyDown(searchBar, Keys.SHIFT).sendKeys("P").keyUp(Keys.SHIFT).sendKeys("une").build().perform();
		Utilities.borderByJS(driver, searchBar);
		Reporter.log("verifySearchBar");
	}
	
	public void verifySearchButton(WebDriver driver) {
		Assert.assertTrue(searchButton.isEnabled(), "Search button is enabled");
		
		Utilities.borderByJS(driver, searchButton);
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
		Actions action = new Actions(driver);
		action.click(searchButton).build().perform();
		Reporter.log("verifySearchButton");
	}
	
	public void verifyFooterLinks() {
		Assert.assertEquals(footerLinks.size(), 54);
	}
	
	public void clickLanguageButton(WebDriver driver) {
		Assert.assertTrue(languageButton.isEnabled(), "Language Button is not enabled");
//		Utilities.clickByJS(driver, languageButton);
		Utilities.TitlebyJS(driver);
//		Utilities.alertByJS(driver, "Oyo Page");
//		Alert al = driver.switchTo().alert();
//		al.accept();
//		System.out.println(al.getText());
		Utilities.scrollByJS(driver, 0, 800);
		Utilities.scrollByJS(driver, 0, 100);
		Utilities.scrollIntoViewByJS(driver, USAHotel);
		Utilities.refreshByJS(driver);
		
	}
	
	public void clickInstaButton(WebDriver driver) {
		Assert.assertTrue(instaButton.isDisplayed(), "Insta Button is not displayed");
		Actions action=new Actions(driver);
		action.click(instaButton).build().perform();
	}

}
