package DataProviderPrac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FBRegistrationPage {
	
//	@Test (dataProvider = "getFBData", dataProviderClass = ExcelDataForRegistration.class, invocationCount=3, threadPoolSize=3)
//	public void FbRegistration(String FirstName, String Surname, String Email, String Password) {
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\OneDrive\\Desktop\\Selinium all jars\\Selenium\\ChromeDriver 108\\chromedriver_win32 (3)\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://www.facebook.com/");
//		
//		WebElement newAcc = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
//		WebDriverWait wait=new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.elementToBeClickable(newAcc)).click();
//		
//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(FirstName);
//		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(Surname);
//		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(Email);
//		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(Password);
//		
//		
//	}
	
	
	@Test(dataProvider = "getData", dataProviderClass = ExcelDataForRegistration.class)
	public void verifyFbRegistrationPage(String FirstName, String Surname, String Email, String Password) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\OneDrive\\Desktop\\Selinium all jars\\Selenium\\ChromeDriver 110\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement newAcc=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
//		newAcc.click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(newAcc)).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(FirstName);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(Surname);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(Password);
		
		
		
		
	}
	

}
