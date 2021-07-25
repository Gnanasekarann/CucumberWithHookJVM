package org.hooks;

import java.io.File;
import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	static WebDriver driver;
	@Before
	public void beforeEverything() {
		System.out.println("Start testing the login function of guru99");
	}
	/*@After	
	public void afterEverything() throws IOException {
		System.out.println("Successfuly tested");
		File ts = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ts, new File("D:\\Users\\gnanas\\eclipse-workspace\\CucumberPractice\\target\\testresult.png"));
	}*/
	@After
	public void tearDown() {
	  /*  if (scenario.isFailed()) {
	            final byte[] screenshot = ((TakesScreenshot) driver)
	                        .getScreenshotAs(OutputType.BYTES);
	            scenario.embed(screenshot, "image/png"); //stick it in the report
	    }*/
	    BaseClass.driver.close();
	}
}
