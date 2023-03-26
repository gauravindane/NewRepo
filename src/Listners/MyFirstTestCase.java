package Listners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(Listners.TestNGListner.class)
public class MyFirstTestCase {
	
	@Test
	public void GoogleTitleVerify() {
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\OneDrive\\Desktop\\Selinium all jars\\Selenium\\ChromeDriver 108\\chromedriver_win32 (3)\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com/");
//		driver.manage().window().maximize();
//		System.out.println(driver.getTitle());
//		Assert.fail();
		
	
		String s="stress";
		char c;

		for(int i=0; i<=s.length(); i++) {
		      for(int j=i+1; j<s.length(); j++) {
		            if(s.charAt(i)==s.charAt(j)) {
		                System.out.println(s.charAt(i));break;
		            }
		      }
		break;
		}
		
		
	}

}
