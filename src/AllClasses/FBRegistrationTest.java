package AllClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FBRegistrationTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\OneDrive\\Desktop\\Selinium all jars\\Selenium\\ChromeDriver 108\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/signup");
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
	
	
	@Test
	public void FacebookRegistrationPageTest() {
		FBRegistrationPage rgpage = new FBRegistrationPage(driver);
		
		rgpage.verifyRegistrationPageLogo();
		rgpage.verifyAlreadyAccountLink();
		rgpage.setFirstname();
		rgpage.setLastname();
		rgpage.setMobileEmail();
		rgpage.setPassword();
		rgpage.setBirthDay();
		rgpage.setBirthMonth();
		rgpage.setBirthYear();
		rgpage.setGender("male");
		rgpage.verifyFooterLinks();
	}
	

}
