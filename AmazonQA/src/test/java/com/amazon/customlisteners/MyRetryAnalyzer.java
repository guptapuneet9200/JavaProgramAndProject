package com.amazon.customlisteners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer{


	private int retryCount=0;
	private int max_retryCount=0;

	@Override
	public boolean retry(ITestResult result) {

		if(retryCount< max_retryCount && !result.isSuccess()) {
			retryCount++;
			System.out.println("Retrying the test ==> " +result.getName()+ " ==> Attempt No = " +retryCount);
			return true;
		}
		return false;
	}

}
