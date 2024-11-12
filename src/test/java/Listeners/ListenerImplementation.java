package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.err.println("onStart");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.err.println("onSuccess");
	}	

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.err.println("onFail");
	}	

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.err.println("onSkipp");
	}	

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.err.println("onstarted");
	}	

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.err.println("onFinish");
	}	
}

	
	
	
	
	


