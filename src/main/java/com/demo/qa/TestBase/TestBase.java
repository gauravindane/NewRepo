package com.demo.qa.TestBase;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class TestBase {
	
	 public static  WebDriver driver;
     
     
		public WebDriver intializeBrowser(String browser) {
			if(browser.equalsIgnoreCase("chrome")) {
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\OneDrive\\Desktop\\New folder\\Selinium all jars\\Selenium\\ChromeDriver 110\\chromedriver_win32 (3)\\chromedriver.exe");
				 driver=new ChromeDriver();
			System.out.println("Chrome driver sucessfully open");
			}
			driver.get("http://demo.mygasagency.com/Login/Login");
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();

			driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@id='password-field']")).sendKeys("admin@123");
			driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
			
			driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
			return driver;
			
			}
	
		
		@AfterMethod
		public void screenshotCapture(ITestResult result) throws IOException, InterruptedException {
			if(result.getStatus()==ITestResult.FAILURE) {
				Date d=new Date();
				String name = d.toString().replace(" ", "").replace(":", "")+".png";
				File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
				FileUtils.copyFile(source, new File("C:\\Users\\YOGESH\\Desktop\\Lpg Screenshot\\lpg"+name));
			}
	
			
			
		}
}
