package org.listener.com;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestResultListener implements ITestListener{

	/**
	   * Invoked each time before a test will be invoked. The <code>ITestResult</code> is only partially
	   * filled with the references to class, method, start millis and status.
	   *
	   * @param result the partially filled <code>ITestResult</code>
	   * @see ITestResult#STARTED
	   */
	  public void onTestStart(ITestResult result) {
	    
		  Reporter.log("Test startted = " + result.getName());
		/*
		 * Date date = new Date(); Reporter.log("Test start date  = " +
		 * date.toString());
		 */
	  }

	  /**
	   * Invoked each time a test succeeds.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#SUCCESS
	   */
	  public void onTestSuccess(ITestResult result) {
	    Reporter.log("This is on start" + "<br>");
	  }

	  /**
	   * Invoked each time a test fails.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#FAILURE
	   */
	  public void onTestFailure(ITestResult result) {
	    //Take screenshot
	  }

	  /**
	   * Invoked each time a test is skipped.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#SKIP
	   */
	  public void onTestSkipped(ITestResult result) {
	    // not implemented
	  }

	  /**
	   * Invoked each time a method fails but has been annotated with successPercentage and this failure
	   * still keeps it within the success percentage requested.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#SUCCESS_PERCENTAGE_FAILURE
	   */
	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
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
		  Reporter.log("context.getStartDate()");
	  }

	  /**
	   * Invoked after all the test methods belonging to the classes inside the &lt;test&gt; tag have run
	   * and all their Configuration methods have been called.
	   */
	  public void onFinish(ITestContext context) {
	    // not implemented
	  }

}
