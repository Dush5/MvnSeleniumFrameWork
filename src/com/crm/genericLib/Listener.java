package com.crm.genericLib;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		String testName=result.getMethod().getMethodName();
		EventFiringWebDriver edriver=new EventFiringWebDriver(BaseClass.driver);
		File srcFile=edriver.getScreenshotAs(OutputType.FILE);
		File dstFile=new File("./Failure_Screenshots/"+testName+".png");
		try
		{
			FileUtils.copyFile(srcFile, dstFile);
		}
		catch(Exception rv)
		{
			
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

 
}
