package dec_21;

import org.testng.Reporter;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class Test02 extends BaseClass{

	@Test(description = "Snapdeal home page test")
	public void snapdealTest() {
		driver.get("http://www.snapdeal.com");
		Reporter.log("Url is entered. " + driver.getCurrentUrl());
	}
}
