package pack01;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(packageName.className.class)
//@Listeners(TestNGListener.class)
public class TestingListeners {

	//@Test(retryAnalyzer = packageName.className.class)
	//@Test(retryAnalyzer = ReTryAnalyzer.class)
	@Test
	public void test01() {
		Assert.assertTrue(false);
	}
	
	
	@Test
	public void test02() {
		Assert.assertEquals(2, 2);
	}
}
