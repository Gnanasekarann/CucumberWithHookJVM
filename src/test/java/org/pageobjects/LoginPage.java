package org.pageobjects;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	@FindBy(name="uid")
	public static WebElement username;
	
	@FindBy(name="password")
	public static WebElement userPass;
	
	@FindBy(name="btnLogin")
	public static WebElement Loginbtn;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getUserPass() {
		return userPass;
	}

	public WebElement getLoginbtn() {
		return Loginbtn;
	}



}
