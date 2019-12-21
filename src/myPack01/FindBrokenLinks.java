package myPack01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class FindBrokenLinks extends BaseClass{
	
	/*
	 * Write program for HASHMAP and HASHTABLE
	 */
	
	@Test
	public void findBrokenLinks() throws Exception{
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		
 		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
 		System.out.println("Total links are = " + allLinks.size());
 		
 		for(int i = 0; i<allLinks.size(); i++) {
 			
 			String linkName = allLinks.get(i).getText();
  			String linkHREF = allLinks.get(i).getAttribute("href");
  			
  			System.out.println("LinkName = " + linkName + ", and its href = " + linkHREF);
  			
  			allLinks.get(i).click();
  			Thread.sleep(4000);
  			
  			if(driver.findElement(By.tagName("body")).getText().contains("404") || driver.findElement(By.tagName("body")).getText().contains("404")) {
  				System.out.println(linkName + " Page link break");
  			}
  			else {
  				System.out.println(linkName + " working fine");
  			}
  			
  			driver.navigate().back();
 		}
	}
}
