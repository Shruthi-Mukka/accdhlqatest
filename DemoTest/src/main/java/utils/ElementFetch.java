package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseTest.BaseTest;

public class ElementFetch {

	public WebElement getWebElement(String identifieType, String identifierValue) {
		switch(identifieType) {

		case "XPATH":
			return BaseTest.driver.findElement(By.xpath(identifierValue));
		case "CSS":
			return BaseTest.driver.findElement(By.cssSelector(identifierValue));
		case "ID":
			return BaseTest.driver.findElement(By.id(identifierValue));
		case "Name":
			return BaseTest.driver.findElement(By.name(identifierValue));

		default:
			return null;
		}
	}
	public List<WebElement> getWebElements(String identifieType, String identifierValue) {
		switch(identifieType) {

		case "XPATH":
			return BaseTest.driver.findElements(By.xpath(identifierValue));
		case "CSS":
			return BaseTest.driver.findElements(By.cssSelector(identifierValue));
		case "ID":
			return BaseTest.driver.findElements(By.id(identifierValue));
		case "Name":
			return BaseTest.driver.findElements(By.name(identifierValue));

		default:
			return null;
		}
	}
}

