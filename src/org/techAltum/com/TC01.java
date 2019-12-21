package org.techAltum.com;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class TC01 extends BaseClass{

	@Test
	public void testCase01() {
		driver.get("http://www.cheapoair.com");
		
		//Select PAX
		//Select Adults
		Select adults = new Select(driver.findElement(By.name("Adults")));
		adults.selectByIndex(3);   //should select 3
		
		
		//Select Seniors
		Select seniors = new Select(driver.findElement(By.name("Seniors")));
		seniors.selectByValue("5");
		
		//Select Youth
		Select youth = new Select(driver.findElement(By.name("Youths")));
		youth.selectByVisibleText("6");
	}
}
