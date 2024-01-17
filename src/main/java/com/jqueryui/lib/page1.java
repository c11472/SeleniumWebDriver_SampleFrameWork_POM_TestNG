package com.jqueryui.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class page1 {
	WebDriver driver;

	// WebElements
	By plg = By.xpath("//*[contains(text(),'Plugins')]");

	// variable initializations to use fro assert
	String expTitlePage1 = "jQuery UI";
	String actTitlePage1;
	String expDataToValidate = "jQuery Plugin Registry";
	String actDataToValidate;

	// init method
	public void initpage1(WebDriver driver) {
		this.driver = driver;

	}

	// Invoke application

	public void fun_invokeapp(WebDriver driver) {
		driver.get("https://jqueryui.com/");

		actTitlePage1 = driver.getTitle();
		Assert.assertEquals(expTitlePage1, actTitlePage1);

	}

	// click on plugin

	public void fun_ClickOnPlugins(WebDriver driver) {
		driver.findElement(plg).click();
		actDataToValidate = driver.getTitle();
		Assert.assertEquals(expDataToValidate, actDataToValidate);

	}

}
