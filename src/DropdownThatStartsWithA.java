import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownThatStartsWithA {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\OneDrive\\Desktop\\Selinium all jars\\Selenium\\ChromeDriver 110\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
//		List<WebElement> years = driver.findElements(By.xpath("//option[starts-with(@value, '202')]"));
//		
//		System.out.println(years.size());
//		
//		for(int i=0; i<=years.size(); i++) {
//			WebElement year=years.get(i);
//			System.out.println(year.getText());
//		}
		
		 List<WebElement> years = driver.findElements(By.xpath("//select[@id='month']/option"));
		
		for(int i=0; i<=years.size(); i++) {
			WebElement year = years.get(i);
			if(year.getText().toString().startsWith("M")==true || year.getText().toString().startsWith("J")==true) {
				System.out.println(year.getText());
			}
		}
		
		
	}

}
