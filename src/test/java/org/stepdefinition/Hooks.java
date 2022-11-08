package org.stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseMethods {

	@Before
	public void tc1() {
		dateTime();
	}

	

	@After
	public void tc4() {

		dateTime();
	}

}
