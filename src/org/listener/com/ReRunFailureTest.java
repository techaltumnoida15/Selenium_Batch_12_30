package org.listener.com;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRunFailureTest implements IRetryAnalyzer{

	int counter = 0;
	int reTryLimit = 3;
	
	@Override
	public boolean retry(ITestResult result) {

		if(counter < reTryLimit) {
			counter++;
			return true;
		}
		
		else {
			return false;
		}
	}

}
