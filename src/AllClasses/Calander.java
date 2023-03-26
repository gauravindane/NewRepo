package AllClasses;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Calander {
	
	WebDriver driver;
	
	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\OneDrive\\Desktop\\Selinium all jars\\Selenium\\ChromeDriver 110\\chromedriver_win32 (3)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.redbus.in/");
	}
	
	@Test (dependsOnMethods = "setup")
	public void calanderAuto() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
//		WebElement nextbtn=driver.findElement(By.xpath("//td[@class='next']"));
		
//		driver.findElement(By.xpath("//td[@class='we day' and text()='25']")).click();
		
		String months=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
		System.out.println(months);
		
		while(!(months.equalsIgnoreCase("Jun 2024"))) {
			driver.findElement(By.xpath("//td[@class='next']")).click();
			months=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			System.out.println(months);
		}
		
		driver.findElement(By.xpath("//td[text()='15']")).click();
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
		
		
		
	}











