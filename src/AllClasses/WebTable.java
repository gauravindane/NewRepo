package AllClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class WebTable {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\OneDrive\\Desktop\\Selinium all jars\\Selenium\\ChromeDriver 110\\chromedriver_win32 (3)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		
		int rows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr")).size();
		int cols = driver.findElements(By.xpath("//table[@class='dataTable']//tbody/tr[1]/td")).size();
		
		System.out.println(rows);
		System.out.println(cols);
		
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=cols; j++) {
				String value = driver.findElement(By.xpath("//table[@class='dataTable']//tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print("=> "+value+" ");
			}
			System.out.println();
		}
	}

}
