package qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import baseTest.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class Testcase0 extends BaseTest {

	ElementFetch ele=new ElementFetch();
	HomePageEvents homepage=new HomePageEvents();
	LoginPageEvents loginpage=new LoginPageEvents();
	
	@Test
	public void googlePagetest01() {
	
		homepage.search();
		System.out.println("search is visible");
		
	}
    @Test
	public void googlePagetest02() {
		
		homepage.gmail();
		System.out.println("Gmail option is visible");

	}
	/*public void verifySignInButton() {
	homepage.signInButton();
	
}*/
	/*public void sampleMethodForEnteringCredentials() {
		homepage.signInButton();
		loginpage.verifyIfLoginPageIsLoaded();
		loginpage.enterCredentials();
	}*/
	
	/*public void loginToApplication() {
		homepage.signInButton();
		loginpage.verifyIfLoginPageIsLoaded();
		loginpage.enterCredentials();
	} */
}