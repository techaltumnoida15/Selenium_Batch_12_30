package org.techAltum.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class TC05 extends BaseClass{
	
	@Test
	
	 public void MouseOverNaukri()
	{
		//open web browser
		driver.get("http://www.naukri.com");
		
		Set<String> winHandles = driver.getWindowHandles();
        System.out.println(winHandles);
        
        List<String> myList = new ArrayList<String>();
        Iterator<String> Itr = winHandles.iterator();
        
        for(int i = 0; i<winHandles.size(); i++) {
        	myList.add(Itr.next());
        }
        
        for(int k = 0; k<myList.size(); k++) {
        	driver.switchTo().window(myList.get(k));
        	String title = driver.getTitle();
        	System.out.println(title);
        	if(k ==  0) {
        		
        	}
        	else {
        		driver.close();
        	}
        	
        }
		
		//find webelement recruiters.
		WebElement Recruiters = driver.findElement(By.xpath("(//div[@class='mTxt'])[2]"));
		Actions act = new Actions(driver);
		//move pointer at the middle of the text Recruiters.
		act.moveToElement(Recruiters);
		act.build().perform();
		
		System.out.println("Mouse over done");
		//find webelement browse all recruiters.
		WebElement BAR = driver.findElement(By.xpath("//a[text()='Browse All Recruiters']"));
				
		BAR.click();
		System.out.println("click on text Browse All Recruiters");
		String keywordNeedToEnter = "java";
		String LocwordNeedToEnter = "noida";
		//driver.switchTo().frame(driver.findElement(By.id("qsbForm")));
		try {
		   
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Get current window handle
		/*
		 * String parentWinHandle = driver.getWindowHandle();
		 * System.out.println("Parent window handle: " + parentWinHandle);
		 */
        
		/*
		 * // Get the window handles of all open windows Set<String> winHandles =
		 * driver.getWindowHandles();
		 * 
		 * List<String> myList = new ArrayList<String>(); Iterator<String> Itr =
		 * winHandles.iterator();
		 * 
		 * for(int i = 0; i<winHandles.size(); i++) { myList.add(Itr.next()); }
		 * 
		 * for(int k = 0; k<myList.size(); k++) {
		 * driver.switchTo().window(myList.get(myList.size() - 1)); String title =
		 * driver.getTitle(); System.out.println(title);
		 * 
		 * } //driver.switchTo().window(myList.get(myList.size() - 1))
		 */	}
}

