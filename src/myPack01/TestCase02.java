package myPack01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase02 {

	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		//Open browser
		System.setProperty("webdriver.chrome.driver", "F:\\Sel_Projects_v8\\TechAltum_Selenium_Project_4\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Enter URL
		driver.get("http://www.naukri.com");
		
		//Validate that user is on correct page
		String pageTitle = driver.getTitle();
		System.out.println("Page title is = " + pageTitle);
	}
	
	@Test 
	public void testCase02() {
		//TC logic
		
	}
	
	@AfterMethod
	public void closeBrowser() {
	driver.quit();	
	}
}
