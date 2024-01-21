package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener interface which implements TestNG Listeners

public class listnersImplementations implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("This Block will be executed when Test is successfull "+result.getName());
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Failure of Test method "+result.getName());
	}
  
}
