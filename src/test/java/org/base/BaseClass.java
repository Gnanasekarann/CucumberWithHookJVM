package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.pageobjects.LoginPage;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebDriver urlLaunch() {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Users\\\\gnanas\\\\eclipse-workspace\\\\testng\\\\drivers\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/");
	    PageFactory.initElements(driver, LoginPage.class);
		return driver;

	}
	
	public static void elements(WebElement e, String val) {
		e.sendKeys(val);
	}

}
