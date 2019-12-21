package myPack01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase06 {

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
		
		driver.get("http://www.snapdeal.com");
	}
	
	@Test
	public void testCase04() {
		//Verify that user is on correct page
		
		
		//Mouse Over - Sign In
		//Use Actions CLASS
		WebElement signIn = driver.findElement(By.xpath("//div[@class='accountInner']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(signIn);
		//act.moveToElement(driver.findElement(By.xpath("//div[@class='accountInner']")));
		act.build().perform();
		
		//Click on - Login
		WebElement login = driver.findElement(By.xpath("//a[text()='login']"));
		login.click();
		
		//Assignment - 
		//Enter Mobile NUmber
		
		//Click on Continue
		
		
		/*
		 * Perform same steps on Naukri.com
		 * Click on BuyOnline under for Employers
		 */
	}
	
	@AfterMethod
	public void quitBrowser() {
		//driver.quit();
	}
}
