package qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class Testcase1 extends BaseTest {

	//ElementFetch ele=new ElementFetch();
	//HomePageEvents homepage=new HomePageEvents();
	//LoginPageEvents loginpage=new LoginPageEvents();
	@Test
	public void testMethod01() {
		String s="xxx";
		Assert.assertEquals(s,"xx");
	}
	@Test
	public void testMethod02() {
		String s="xxx";
		Assert.assertEquals(s,"xxx");
	}
	
	
	
}
