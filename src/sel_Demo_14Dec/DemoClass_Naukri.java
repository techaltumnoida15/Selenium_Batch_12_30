package sel_Demo_14Dec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoClass_Naukri {

	//Declare WebDriver
	
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		//Open browser
		System.setProperty("webdriver.chrome.driver", "F:\\Sel_Projects_v8\\TechAltum_Selenium_Project_4\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Enter URL
		driver.get("http://www.naukri.com");
		
	}
	
	@Test
	public void naukriTest() throws Exception{
		//TC Logic
		//Click on Search job text box
		
		driver.findElement(By.id("qsbClick")).click();
		System.out.println("Click on Search job text box");
		
		//Enter skills
		driver.findElement(By.name("qp")).sendKeys("Java");
		System.out.println("Skill is entered");
		
		//Enter Location
		driver.findElement(By.name("ql")).sendKeys("Noida");
		System.out.println("Location is entered.");
		
		//Click on search button
		driver.findElement(By.id("qsbFormBtn")).click();
		System.out.println("Click on search button");
		
		
		Thread.sleep(4000);
		//On next page capture total no. of jobs based on skill and location
		String totalJobs = driver.findElement(By.xpath("//div[@class='small_title']")).getText();
		System.out.println("Total jobs are = " + totalJobs);
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		//driver.quit();
	}
}
