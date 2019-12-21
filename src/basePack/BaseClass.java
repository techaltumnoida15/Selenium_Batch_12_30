package basePack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {

	protected WebDriver driver;
	
	@Parameters({"browser"})
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
	}
	
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
}
