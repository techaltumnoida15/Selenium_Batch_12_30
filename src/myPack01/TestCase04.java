package myPack01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase04 {

	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		
		  String projectPath = System.getProperty("user.dir"); 
		  System.out.println("Project Path is = " + projectPath);
		  
		  String browserDriverPath= projectPath + "\\browserDrivers\\chromedriver.exe";
		  System.out.println("BrowserDriver exe path = " + browserDriverPath);
		  
		  System.setProperty("webdriver.chrome.driver", browserDriverPath);
		 
		
		//System.setProperty("webdriver.chrome.driver", "F:\\Sel_Projects_v8\\TechAltum_Selenium_Project_4\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.naukri.com");
	}
	
	@Test
	public void testCase04() {
		//TC Logic
	}
	
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
}
