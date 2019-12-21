package org.techAltum.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class TC03 extends BaseClass{

	@Test
	public void testCase03() {
		driver.get("http://www.naukri.com");
		
		
		WebElement searchJobTextBo = driver.findElement(By.id("qsbClick"));
		searchJobTextBo.click();
		
		
		//Enter skills
		String skills = "Java";
		WebElement skillsTextBox = driver.findElement(By.name("qp"));
		skillsTextBox.sendKeys(skills);
		System.out.println("Skill '" + skills + "' is entered.");
		
		//Enter Location
		String location = "Java";
		WebElement locationTextBox = driver.findElement(By.name("ql"));
		locationTextBox.sendKeys(location);
		System.out.println("Location '" + location + "' is entered.");
		
		//Select Exp
		/*
		 * Select exp = new
		 * Select(driver.findElement(By.xpath("//input[@class='sdTxt w85']")));
		 * exp.selectByIndex(5);
		 */
		//Select code and press ctrl + shift + / = to comment
		//Select code and press ctrl + shift + \ = to uncomment
		//to import all at once ct.rl + shijft + o
		
		//to get all shortcut keys of eclipse = ctrl + shift + l
		
		//Press Tab Key
		locationTextBox.sendKeys(Keys.TAB);
		System.out.println("Tab key is pressed");
		
		
		//Arrow Down - Exp
		WebElement exp = driver.findElement(By.xpath("//input[@class='sdTxt w85']"));
		for(int i = 1; i<=6; i++) {
			exp.sendKeys(Keys.ARROW_DOWN);
		}
		System.out.println("Exp is selected.");
		
		String selectedExp = driver.findElement(By.id("exp_ddHid")).getAttribute("value");
		System.out.println(selectedExp);
	}
}
