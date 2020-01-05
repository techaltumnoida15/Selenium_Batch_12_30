package basePack;

//import java.io.File;
//import java.io.IOException;
import java.util.concurrent.TimeUnit;

//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {

	protected WebDriver driver;
	
	//@Parameters({"browser"})
	@BeforeMethod
	public void openBrowser(String browser) {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Projejct Path is = " + projectPath);
		
		String browserDriverPath = projectPath + "\\browserDrivers";
		System.out.println("Browser Driver exe path = " + browserDriverPath);
		
		if(browser.equalsIgnoreCase("chrome")){
			//Open Chrome
			System.setProperty("webdriver.chrome.driver", browserDriverPath + "\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			//Open Firefox
			System.setProperty("webdriver.gecko.driver", browserDriverPath + "\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else if(browser.equalsIgnoreCase("ie")) {
			//Open IE
		}
		else {
			//Open Edge
		}
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().setScriptTimeout(5, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	/*public void quitBrowser(ITestResult testResult) throws Exception {
		
		//How to rerun failed tests using testng listner
		//Implement
		
		long ExecutionTime = testResult.getEndMillis();
		System.out.println(ExecutionTime);
		
		String testName = testResult.getTestClass().getName();
		System.out.println("Test case Name = " + testName);
		
		String methodName = testResult.getMethod().getMethodName();
		System.out.println("Method name = " + methodName);
		/*
		if(!testResult.isSuccess()) {
			File srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			String screenShotDir = System.getProperty("user.dir") + "\\screenshot\\screenshot2.jpeg";
			//Assignment
			//TestName + MethodName + CurrentDateTime(YYYY_MM_DD_hh_mm_ss) + ".jpeg";
			
			File destScreenshot = new File(screenShotDir);
			
			FileUtils.moveFile(srcScreenshot, destScreenshot);
			
			System.out.println("Test is fail");
		}
		else {
			System.out.println("Test is pass");
		}
		*/
		
		/*
		 * if(testResult.SKIP == 3) { System.out.println("Test is skipped."); }
		 */
	//@AfterMethod
	public void exist()
	{
		driver.quit();
	}
	
		
		//driver.quit();
	
}
