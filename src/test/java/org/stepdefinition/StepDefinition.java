package org.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseMethods {

	@Given("To open Chrome Browser")
	public void to_open_Chrome_Browser() {
		launchBrowser();
		maxBrowser();
		launchUrl("https://www.facebook.com/");
	}

	@When("To pass valid username and valid password")
	public void toPassValidUsernameAndValidPassword(io.cucumber.datatable.DataTable d) {
		//ONE DIMENSIONAL MAP
		Map<String, String> ODM = d.asMap(String.class, String.class);
		String user = ODM.get("user-2");  //selenium
		String pass = ODM.get("pass-1");  //111
		PojoClass p = new PojoClass();
		passTxt(p.getFbUsername(), user);
		passTxt(p.getFbPassword(), pass);
	}

	@Then("To close window")
	public void toCloseWindow() {
	}

	@When("To pass invalid username and password")
	public void toPassInvalidUsernameAndPassword(io.cucumber.datatable.DataTable d) {
		//TWO DIMENSIONAL MAP
		List<Map<String, String>> TDM = d.asMaps(String.class, String.class);
		String user = TDM.get(3).get("user");  //devops
		String pass = TDM.get(1).get("pass");  //222
		PojoClass p = new PojoClass();
		passTxt(p.getFbUsername(), user);
		passTxt(p.getFbPassword(), pass);
	}


@Given("To pass details")
public void toPassDetails() {
	launchBrowser();
	maxBrowser();
	launchUrl("https://adactinhotelapp.com/Register.php");
}

@When("To pass user basic details")
public void toPassUserBasicDetails() {
	PojoClass p = new PojoClass();
	
  }

@Then("To click button")
public void toClickButton() {
  
}
}
