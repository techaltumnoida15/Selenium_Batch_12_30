package org.testngListeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTryAnalyzer implements IRetryAnalyzer{

	int counter = 0;
	int reTryCount = 3;
	
	@Override
	public boolean retry(ITestResult result) {
		if(counter < reTryCount) {
			counter++;
			return true;
		}
		return false;
	}

}
