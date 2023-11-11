package qa.tests;

import org.testng.annotations.Test;

import org.testng.Assert;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class Testcase2 extends BaseTest {

	//ElementFetch ele=new ElementFetch();
	//HomePageEvents homepage=new HomePageEvents();
	//LoginPageEvents loginpage=new LoginPageEvents();
	@Test
	public void TCP_379_testMethod06() {
		
			String s="xxx";
			Assert.assertEquals(s,"xxx","Match");
		
		/*homepage.signInButton();
		loginpage.verifyIfLoginPageIsLoaded();
		loginpage.enterCredentials();*/
	}
}
