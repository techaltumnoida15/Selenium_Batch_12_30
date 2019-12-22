package dec_21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class NaukriTest extends BaseClass{

	//http://seletesting.blogspot.com/2014/04/testng-parameterized-test-using-xml.html
	//http://seletesting.blogspot.com/2014/03/testng-parameterized-test-one-of-bright.html
	//http://seletesting.blogspot.com/2014/03/how-to-check-broken-links-on-web-page.html
	
	@Test(dataProvider = "testData")
	public void searchNaukri(String url, String skills, String location) throws Exception{
		
		driver.get(url);
		Reporter.log("Url is entered.");
		
		//Click on Searh job text box
		WebElement searchJobTextBox = driver.findElement(By.id("qsbClick1"));
		searchJobTextBox.click();
		Reporter.log("Click on Search job text box.");
		
		//Enter Skils
		WebElement skillTextBox = driver.findElement(By.name("qp"));
		skillTextBox.sendKeys(skills);
		System.out.println("Kills is entered.");
		
		//Enter location
		WebElement locationTextBox = driver.findElement(By.name("ql"));
		locationTextBox.sendKeys(location);
		System.out.println("Location is entered.");
		
		//Click on Search button
		WebElement searchButton = driver.findElement(By.id("qsbFormBtn"));
		searchButton.click();
		System.out.println("Click on Search button.");
	}

	
	//Define Test Data
	@DataProvider(name = "testData")
	public Object[][] provideData(){
		Object[][] xData = new Object[1][3];
		
		//1st row data
		xData[0][0] = "http://www.naukri.com";
		xData[0][1] = "Java";                  //Skills
		xData[0][2] = "Noida";                 // Location
		
		/*
		//2nd row data
		xData[1][0] = "http://www.naukri.com";
		xData[1][1] = "C#";                  //Skills
		xData[1][2] = "Gurgaon";                 // Location
		*/
		return xData;
	}
}
