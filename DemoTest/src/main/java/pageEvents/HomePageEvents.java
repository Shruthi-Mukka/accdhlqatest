package pageEvents;

import pageObjects.HomePageElements;
import utils.ElementFetch;

public class HomePageEvents {

	ElementFetch ele=new ElementFetch();
	public void search() {
		ele.getWebElement("XPATH", HomePageElements.search).getText();
		System.out.println("search element text value: "+ele);
		
		
	}
	public void gmail() {
	
		ele.getWebElement("XPATH", HomePageElements.gmail).getText();
		System.out.println("gmail element text value: "+ele);
	}
	
	/*public void signInButton() {
		ele.getWebElement("XPATH", HomePageElements.signInButtonText).click();
	}*/
}
