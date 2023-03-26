package AllClasses;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\OneDrive\\Desktop\\Selinium all jars\\Selenium\\ChromeDriver 110\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		
//		for(int i=0; i<links.size(); i++) {
//			WebElement link = links.get(i);
//			if(link.isEnabled()) {
//				System.out.println(i+" "+link.getAttribute("href")+" -is working fine");
//			}else {
//				System.out.println(i+" "+link.getAttribute("href")+" -is not working");
//			}
//		}
	}

}
