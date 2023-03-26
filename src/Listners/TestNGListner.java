package Listners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



public class TestNGListner implements ITestListener { 
	
	public static WebDriver driver;
	
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("TestCases failed and details are "+result.getName());
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File("C:\\Users\\GAURAV\\OneDrive\\Desktop\\Selinium all jars\\New.jpeg"));
			System.out.println("Screenshot is Taken");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("TestCases Skipped and details are "+result.getName());
		
	}
	
	public void onTestStart(ITestResult result) {
		System.out.println("TestCases Started and details are "+result.getName());
		
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCases Success and details are "+result.getName());
		
	}
	
	
	 

}
