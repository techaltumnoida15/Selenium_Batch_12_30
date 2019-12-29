package org.testngListeners;

import java.util.Date;
import java.util.Set;

import org.testng.IResultMap;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("Starting test = " + result.getMethod().getMethodName());
		System.out.println("begining test = " + result.getName());
	}

	  /**
	   * Invoked each time a test succeeds.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#SUCCESS
	   */
	public void onTestSuccess(ITestResult result) {
		System.out.println("This test is passed = " + result.SUCCESS);
		System.out.println("This test is passed_status = " + result.getStatus());
	}

	  /**
	   * Invoked each time a test fails.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#FAILURE
	   */
	public void onTestFailure(ITestResult result) {
		System.out.println("This test is failed = " + result.FAILURE);
		System.out.println("This test is failed_status = " + result.getStatus());
	}

	  /**
	   * Invoked each time a test is skipped.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#SKIP
	   */
	public void onTestSkipped(ITestResult result) {

	}

	  /**
	   * Invoked each time a method fails but has been annotated with successPercentage and this failure
	   * still keeps it within the success percentage requested.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#SUCCESS_PERCENTAGE_FAILURE
	   */
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	  /**
	   * Invoked each time a test fails due to a timeout.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   */
	public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	  /**
	   * Invoked before running all the test methods belonging to the classes inside the &lt;test&gt; tag
	   * and calling all their Configuration methods.
	   */
	public void onStart(ITestContext context) {

		Date startDate = context.getStartDate();
		System.out.println("Start date is = " + startDate);
		
	}

	  /**
	   * Invoked after all the test methods belonging to the classes inside the &lt;test&gt; tag have run
	   * and all their Configuration methods have been called.
	   */
	public void onFinish(ITestContext context) {

		Date endDate = context.getEndDate();
		System.out.println("End date is = " + endDate);
	}
}
