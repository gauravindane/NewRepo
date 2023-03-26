package AllClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalanderUtility {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\OneDrive\\Desktop\\Selinium all jars\\Selenium\\ChromeDriver 110\\chromedriver_win32 (3)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		
		selectDate("15", "Jun 2024");
		
	}
	
	public static String getDate(String monthyear) {
		return monthyear;
	}
	
	public static void selectDate(String day, String exmonthyear) {
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		String monthyear=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
		
		while(!(getDate(monthyear).equalsIgnoreCase(exmonthyear))) {
			driver.findElement(By.xpath("//td[@class='next']")).click();
			monthyear=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			System.out.println(monthyear);
		}
		
		driver.findElement(By.xpath("//td[text()='"+day+"']")).click();
		
		
		
	}

}
