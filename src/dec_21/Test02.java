package dec_21;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class Test02 extends BaseClass{

	@Test(description = "Snapdeal home page test")
	public void snapdealTest() {
		driver.get("http://www.snapdeal.com");
		Reporter.log("Url is entered. " + driver.getCurrentUrl());
		
		String pageURL = driver.getCurrentUrl();
		System.out.println(pageURL);
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		//Verify If user is on correct page
		Assert.assertTrue(pageTitle.contains("www. Snapdeal.com"), "User is not on correct page");
		System.out.println("User is on correct page.");
		
		Assert.assertEquals(pageURL, "http://www.snapdeal.com", "Page url doesnt match.");
		
		/*
		 * if(pageTitle.contains("www. Snapdeal.com")) {
		 * System.out.println("User is on correct page."); } else {
		 * System.out.println("User is not on correct page."); }
		 */
		
		
	}
}
