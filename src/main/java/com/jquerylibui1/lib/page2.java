package com.jquerylibui1.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class page2 {

	WebDriver driver;
	// elements locators
	By text1 = By.xpath("/html/body/div/div[2]/div/div/div[1]/h1");

	public void initpage2(WebDriver driver) {
		this.driver = driver;

	}

	// To click on plugins

	public void fun_ExtractText(WebDriver driver) {

		String res = driver.findElement(text1).getText();
		System.out.println("Text extracted: " + " " + res);

	}

}
