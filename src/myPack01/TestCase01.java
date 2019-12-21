package myPack01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase01 {

	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		//Open browser
		String projectPath = System.getProperty("user.dir");
		System.out.println("Projejct Path is = " + projectPath);
		
		String browserDriverPath = projectPath + "\\browserDrivers\\chromedriver.exe";
		System.out.println("Browser Driver exe path = " + browserDriverPath);
		
		System.setProperty("webdriver.chrome.driver", browserDriverPath);
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Enter URL
		driver.get("http://www.snapdeal.com");
		
		//Validate that user is on correct page
		String pageTitle = driver.getTitle();
		System.out.println("Page title is = " + pageTitle);
		
		if(pageTitle.contains("Snapdeal")) {
			System.out.println("User is on correct page.");
		}
		else {
			System.out.println("User is not on correct page.");
		}
	}
	
	@Test
	public void testFacebookRegistration() throws Exception{
		//Type some string to search
		driver.findElement(By.id("inputValEnter")).sendKeys("Shirt");
		
		//CLick on Search button
		driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();
		Thread.sleep(2000);
		
		//Get total number of items
		String totalItems = driver.findElement(By.xpath("//div[@class='search-result-txt-section  marT12']/span")).getText();
		System.out.println(totalItems);
	}
	
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
}
