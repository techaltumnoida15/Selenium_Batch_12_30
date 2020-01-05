package myPack01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.testng.annotations.Test;

import basePack.BaseClass;
//import sun.util.calendar.BaseCalendar;

public class NaukriPopup extends BaseClass{

	@Test
	public void testCasde01() throws Exception{
		
		driver.get("http://www.naukri.com");
		Thread.sleep(2000);
		
		//Handle multiple browser window
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		System.out.println("Total open windows are = " + windows.size());
		
		//Dec a list
		List<String> myL = new ArrayList<String>();
		Iterator<String> Itr = windows.iterator();
		
		for(int i = 0; i<windows.size(); i++) {
			myL.add(Itr.next());
		}
		System.out.println("List is = " + myL);
		
		/*
		 * driver.switchTo().window(myL.get(1)); System.out.println(driver.getTitle());
		 */
		
		for(int j = 0; j<myL.size(); j++) {
			driver.switchTo().window(myL.get(j));
			String windowTitle = driver.getTitle();
			System.out.println(windowTitle);
			
			if(windowTitle.contains("LnT")) {
				//Logic
				driver.manage().window().maximize();
				break;
			}
			else {
				driver.close();
			}
		}
	}
}
