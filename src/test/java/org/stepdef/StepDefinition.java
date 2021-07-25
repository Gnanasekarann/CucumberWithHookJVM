package org.stepdef;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.pageobjects.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends LoginPage{

	BaseClass b = new BaseClass();
	LoginPage l = new LoginPage();

	@Given("Open the login page")
	public void open_the_login_page() {
	    BaseClass.urlLaunch();
	}
	@When("Enter the {string} and {string}")
	public void enter_the_and(String username, String password) {
		BaseClass.elements(l.getUsername(), username);
	    BaseClass.elements(l.getUserPass(), password);
		
		
	}
	/*@When("Enter the username and password")
	public void enter_the_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String, String>> asMaps = dataTable.asMaps(String.class,String.class);
		String username = asMaps.get(0).get("Username");
		String password = asMaps.get(0).get("Password");
	    BaseClass.elements(l.getUsername(), username);
	    BaseClass.elements(l.getUserPass(), password);
	    
		
	}*/

	@When("Enter the click button")
	public void enter_the_click_button() {
	    l.getLoginbtn().click();
	}

	@Then("User can enter into input page")
	public void user_can_enter_into_input_page() {
	    Assert.assertEquals(BaseClass.driver.getTitle(), "Guru99 Bank Manager HomePage");
		System.out.println("Test passed");

	   /* if (BaseClass.driver.getTitle()=="Guru99 Bank Manager HomePage") {
			System.out.println("Test passed");
		}
	    else {
	    	System.out.println("Test Failed");
			}
		}*/
	}
//	    Assert.assertEquals(expected, actual);
	@Then("User can see the error page")
	public void user_can_see_the_error_page() {
		Alert alert = BaseClass.driver.switchTo().alert();
	    String alerttext = alert.getText();
	    Assert.assertEquals(alerttext, "User or Password is not valid");
    	System.out.println("Test passed");
	    /*if (alerttext=="User or Password is not valid") {
	    	System.out.println("Test passed");
		}else {
			System.out.println("Test Failed");
		}*/
	}


}
