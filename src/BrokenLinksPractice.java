import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksPractice {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\OneDrive\\Desktop\\Selinium all jars\\Selenium\\ChromeDriver 110\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total no. of links are: "+links.size());
		
		for(int i=0; i<=links.size()-1; i++) {
			WebElement link = links.get(i);
			String currentlink =link.getAttribute("href").toString();
			
			if(link.isEnabled()==true) {
				System.out.println((i+1)+" "+currentlink+" -IS WORKING FINE");
			}else {
				System.out.println((i+1)+" "+currentlink+" -IS NOT WORKING FINE");
			}
		}
		
	}

}
