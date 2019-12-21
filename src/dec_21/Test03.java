package dec_21;

import org.testng.Reporter;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class Test03 extends BaseClass{

	@Test(description = "Flipkart home page test")
	public void flipkartTest() {
		driver.get("http://www.flipkart.com");
		Reporter.log("Url is entered. " + driver.getCurrentUrl());
	}
}
