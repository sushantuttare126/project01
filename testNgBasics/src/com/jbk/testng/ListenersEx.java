package com.jbk.testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersEx implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("testcase is start");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("testcase is passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("testcase is failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("testcase is skipped");
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("testcase is failed");
		
	
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("testsuite is start");
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("testsuite is finish");
		
		
	}
	

}
