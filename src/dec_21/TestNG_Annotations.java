package dec_21;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations {

	
	
	@BeforeMethod
	public void atBeforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void atAfterMethod() {
		System.out.println("After Method");
	}
	
	@BeforeTest(alwaysRun = true)
	public void atBeforeTest() {
		System.out.println("Before Test");
	}
	
	@Test(description = "This is a login test", priority = 2)
	public void atTest01() {
		//System.out.println("Test 01");
		Reporter.log("Test 01");
	}
	
	//@Test(enabled = false)
	@Test(priority = 1)
	public void atTest02() {
		//System.out.println("Test 02");
		Reporter.log("Test 02");
	}
	
	@AfterTest
	public void atAfterTest() {
		System.out.println("After Test");
	}
	
	@BeforeClass
	public void atBeforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void atAfterClass() {
		System.out.println("After Class");
	}
	
	@AfterSuite
	public void atAfterSuite() {
		System.out.println("After Suite");
	}
	
	@BeforeSuite
	public void atBeforeSuite() {
		System.out.println("Before Suite");
	}
	
}
