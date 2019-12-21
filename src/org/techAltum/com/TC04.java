package org.techAltum.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class TC04 extends BaseClass{

	@Test
	public void testCase04() {
		
		driver.get("http://www.onetravel.com");
		
		//Open Cal
		WebElement departCal = driver.findElement(By.xpath("//input[@placeholder='Depart']"));
		departCal.click();
		System.out.println("Cal is opened");
		
		//Select Dates
		String a = "//div[@class='calendar__single-month active']/div[3]/div[";
		int i = 1;
		String b = "]/div";
		String dateNeedToSelect = "29";
		
		String xp = a + i + b;
		
		for(i = 1; i<=42; i++) {
			xp = a + i + b;
			
			try {
				String dateInCal = driver.findElement(By.xpath(xp)).getText();
				System.out.println(dateInCal);
				
				if(dateInCal.equals(dateNeedToSelect)) {
					driver.findElement(By.xpath(xp)).click();
					System.out.println("Date " + dateNeedToSelect + " is selected.");
					break;
				}
			}
			catch(Exception ex) {
				System.out.println("No date found for xpath = " + xp);
			}
		}
	}
}