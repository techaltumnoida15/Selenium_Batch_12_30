package dec_21;

import org.testng.Reporter;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class Test04 extends BaseClass{

	@Test(description = "Naukri home page test")
	public void naukriTest() {
		driver.get("http://www.naukri.com");
		Reporter.log("Url is entered. " + driver.getCurrentUrl());
	}
}
