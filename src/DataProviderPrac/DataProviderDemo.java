package DataProviderPrac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@Test (dataProvider ="getData", dataProviderClass = ExcelDataProvider.class)
    public void Login(String userName, String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\OneDrive\\Desktop\\Selinium all jars\\Selenium\\ChromeDriver 108\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
	}
	
	
//	@DataProvider
//	public Object[][] loginData() {
//		Object[][] data=new Object[2][2];
//		data[0][0]="gaurav";
//		data[0][1]="gaurav123";
//		
//		data[1][0]="Sahil";
//		data[1][1]="sahil123";
//		
//		return data;
//		
//	}

}
