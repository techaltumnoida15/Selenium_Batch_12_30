package selDemo;

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

	//Declare WebDriver
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		//OPen Browser
		String projectPath = System.getProperty("user.dir");
		
		String driverEXE = projectPath + "\\browserDrivers\\chromedriver.exe";
		
		System.out.println("Browser driver exe path = " + driverEXE);
		
		//System.setProperty("webdriver.chrome.driver", "F:\\Sel_Projects_v8\\TechAltum_Selenium_Project_4\\browserDrivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", driverEXE);
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Enter URL
		driver.get("http://www.naukri.com");
	}
	
	@Test
	public void testCaseLogic() throws Exception{
		//Click on Search Job text box
		driver.findElement(By.id("qsbClick")).click();
		System.out.println("Click on Search job text box.");
		
		//Enter skills
		driver.findElement(By.name("qp")).sendKeys("Java");
		System.out.println("Skill is entered");
		
		//Enter location
		driver.findElement(By.name("ql")).sendKeys("Noida");
		System.out.println("Location is entered.");
		
		//CLick on Search button
		driver.findElement(By.id("qsbFormBtn")).click();
		System.out.println("Click on search button");
		
		Thread.sleep(4000);
		
		String jobs = driver.findElement(By.xpath("//div[@class='small_title']")).getText();
		System.out.println(jobs);
		
	}
	
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
	
}
