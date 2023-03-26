package com.base.qa;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.utility.qa.Utilities;

public class TestBase extends Utilities {
	
//	public static WebDriver driver;
//	
//	public void launchBrowser(String browser) {
//		if(browser.equalsIgnoreCase("chrome")) {
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\OneDrive\\Desktop\\Selinium all jars\\Selenium\\ChromeDriver 108\\chromedriver_win32 (3)\\chromedriver.exe");
//			driver=new ChromeDriver();
//		}else if(browser.equalsIgnoreCase("firefox")) {
//			System.setProperty("webdriver.gecko.driver", "C:\\Users\\GAURAV\\OneDrive\\Desktop\\Selinium all jars\\Selenium\\geckodriver-v0.32.0-win32\\geckodriver.exe");
//			driver=new FirefoxDriver();
//		}else {
//			System.out.println("wrong browser is selected");
//		}
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().deleteAllCookies();
//		driver.get("http://www.facebook.com/"); 
//	}
//	
//
//	public void teardown() {
//		driver.quit();
//	}
//	
//	
//	@AfterMethod
//	public void screenshotCapture(ITestResult result) throws IOException {
//		if(result.getStatus()==ITestResult.FAILURE) {
//			Date d=new Date();
//			String name = d.toString().replace(" ", "_").replace(":", "_")+".png";
//			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(source, new File("C:\\Users\\GAURAV\\OneDrive\\Desktop\\project\\FbLoginPage_"+name));
//		}
//	}
	
	public static WebDriver driver;
	
//	@Parameters("browser")
//	@Test
	public void launchBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\OneDrive\\Desktop\\Selinium all jars\\Selenium\\ChromeDriver 110\\chromedriver_win32 (3)\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver=new ChromeDriver(options);
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\GAURAV\\OneDrive\\Desktop\\Selinium all jars\\Selenium\\geckodriver-v0.32.0-win32\\geckodriver.exe");
			driver=new FirefoxDriver();
		}else {
			System.out.println("Wrong Browser selected");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
//		https://www.facebook.com/
	}
	
	
	public void tearDown() {
		driver.close();
	}
	
	@AfterMethod
	public void screenshotCapture(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.FAILURE) {
			Date d=new Date();
			String name=d.toString().replace(":", "_").replace(":", "_")+".png";
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("C:\\Users\\GAURAV\\OneDrive\\Desktop\\New folder\\project\\oyo_"+name));
		}
	}
	
	
	
	

}
