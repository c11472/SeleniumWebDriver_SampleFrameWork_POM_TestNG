package com.jqueryui.testscript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.jquery.utility.utility;
import com.jquerylibui1.lib.page2;
import com.jqueryui.lib.page1;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class testcase001 {
	static WebDriver driver = new ChromeDriver();
	// page1 class object
	static page1 pg1 = new page1();
	static page2 pg2 = new page2();
	static utility utlpg3 = new utility();

	static ExtentTest test2; // Interface
	static ExtentReports rep2; // class

	@BeforeTest
	public void test1() {
		rep2 = new ExtentReports(System.getProperty("user.dir") + "./Reports/maintestreport.html");
		test2 = rep2.startTest("testcase001"); // trestNG class

	}

	@Test(priority = 1)
	public void fun_InvokeApp() throws IOException {
		pg1.initpage1(driver);
		pg1.fun_invokeapp(driver);
		utlpg3.utilityinit(driver);
		utlpg3.TakeScreenImage(driver); // invoke screen image
		test2.log(LogStatus.PASS, "The application jQuery has been invoked successfully");

		// pg1.fun_ClickOnPlugins(driver);

	}

	@Test(priority = 2)
	public void fun_ClickPlugin() throws IOException {
		pg1.initpage1(driver);
		pg1.fun_ClickOnPlugins(driver);
		test2.log(LogStatus.PASS, "The link is clicable");
		utlpg3.utilityinit(driver);
		utlpg3.TakeScreenImage(driver);

	}

	@Test(priority = 3)
	public void fun_Extractdata() {
		pg2.initpage2(driver);
		pg2.fun_ExtractText(driver);
		test2.log(LogStatus.PASS, "Data extracted successfully");
	}

	@AfterTest
	public void closeBrower() {

		rep2.endTest(test2);
		rep2.flush();
		rep2.close();

	}

}
