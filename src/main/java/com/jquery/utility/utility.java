package com.jquery.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class utility {
	WebDriver driver;

	public void utilityinit(WebDriver driver) {
		this.driver = driver;
	}

	public void TakeScreenImage(WebDriver driver) throws IOException {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File("./ScreenCaptures/scr2.png"));
	}

}
