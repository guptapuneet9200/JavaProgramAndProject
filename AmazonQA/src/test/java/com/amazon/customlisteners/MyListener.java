package com.amazon.customlisteners;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IAnnotationTransformer;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import com.amazon.basetest.BaseTest;

public class MyListener extends BaseTest implements ITestListener,IAnnotationTransformer {
	
	@Override 
	
	public void onTestStart(ITestResult result) {
		//Use this method to perform some action when Test is started
		System.out.println("***************Starting Test***************Test Name ==>"+result.getName());
		
											}
	public void onTestfailure(ITestResult result) {
		
		//Use this method to perform some action when Test is failed
		//Ex- Take the webpage screenshot
		
		System.out.println("***************Test Failed***************Test Name ==>"+result.getName());
		LocalDateTime  now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
		String dynamicScreenshotName = result.getName()+formatter.format(now);
		
		File fIn = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(fIn, new File(System.getProperty("user.dir")+"./src/main/resource/Screenshots/"+dynamicScreenshotName+".png"));
			} catch (IOException e) {
		
			e.printStackTrace();
									}
		
											}
	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(MyRetryAnalyzer.class);
	}
}
