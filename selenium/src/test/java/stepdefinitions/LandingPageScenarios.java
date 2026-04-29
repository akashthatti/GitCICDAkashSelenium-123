package stepdefinitions;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.LoginPage;
import utils.TestContextSetup;

public class LandingPageScenarios {
	TestContextSetup testContext;
	LoginPage lp;
	
	public LandingPageScenarios(TestContextSetup testContext) {
		this.testContext = testContext;
		lp = testContext.pom.getLandingPage();
		// TODO Auto-generated constructor stub
	}
	
	
	@Given("user opens orange hrm page")
	public void user_opens_orange_hrm_page() throws IOException {
	    System.out.println(testContext.testbase.getDriver().getTitle());
	}
	
	@Then("Login word should be visible in landing page")
	public void login_word_should_be_visible_in_landing_page() {
	    Assert.assertEquals(lp.extractTheText(), "Login");
	}


}
