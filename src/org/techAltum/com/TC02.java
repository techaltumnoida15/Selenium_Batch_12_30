package org.techAltum.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class TC02 extends BaseClass{

	@Test
	public void testCasde02() throws Exception{
		driver.get("http://www.snapdeal.com");
		
		//Use Actions CLASS
		WebElement signIn = driver.findElement(By.xpath("//div[@class='accountInner']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(signIn);
		//act.moveToElement(driver.findElement(By.xpath("//div[@class='accountInner']")));
		act.build().perform();
		System.out.println("Mouse over - done");
		
		//Click on - Login
		WebElement login = driver.findElement(By.xpath("//a[text()='login']"));
		login.click();
		System.out.println("Click on Login");
		 
		//Switch to frame
		driver.switchTo().frame(driver.findElement(By.id("loginIframe")));
		System.out.println("Switched on frame.");
		
		Thread.sleep(2000);
		
		//Enter mobile number
		WebElement mobileNum = driver.findElement(By.id("userName"));
		mobileNum.sendKeys("9711235995");
		System.out.println("Enter Mobile num");
		
		//driver.switchTo().defaultContent();
	}
	
}
