package dec_21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class Test03 extends BaseClass{

	@Test(description = "Onetravel home page test")
	public void flipkartTest() throws Exception{
		driver.get("http://www.onetravel.com");
		Reporter.log("Url is entered. " + driver.getCurrentUrl());
		
		Thread.sleep(2000);
		
		//Exp wait for search button on home page
		//Exp wait - Fluent wait
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofMillis(100));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Search Now']")));	
		
		//Explicit wait - Normal wait
		Wait<WebDriver> wait2 = new WebDriverWait(driver, 5);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Search Now']")));  //default polling time 500 ms
	
		
		//Enter From
		
		//1. Clear from city - if any
		
		//2. Enter city name - NYC
		
		//Select a city which contains - NewYork
	
	
	}
}
