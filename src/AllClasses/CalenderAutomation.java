package AllClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderAutomation {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\OneDrive\\Desktop\\Selinium all jars\\Selenium\\ChromeDriver 108\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		
//		driver.findElement(By.xpath("//table[@class='rb-monthTable first last']//tbody/tr[7]/td[5]")).click();
		//td[@class='current day' and text()='9']
		
		boolean b=false;
		
		List<WebElement> date = driver.findElements(By.xpath("//td[@class='current day' and text()='9']"));
		System.out.println(date.size());
		
		while(b==false) {
			if(date.size()==0) {
				driver.findElement(By.xpath("//td[@class='current day' and text()='9']")).click();
				b=true;
			}else {
				driver.findElement(By.xpath("//td[@class='next']")).click();
			}
		}
		
	}
}


