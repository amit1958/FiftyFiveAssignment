package StepDefinations;

import TestRunner.TestExecuter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends TestExecuter {

	@Given("^User is on landing page$")
	public void Landing_Page() {

	}

	@When("^User is on Listing page and click on Subscribe Button$")
	public void Click_Subscribe() throws InterruptedException {

	}

	@And("^Enter valid moble number and submit$")
	public void Enter_Valid_Mobile() {

	}

	@Then("^Enter Otp field should show$")
	public void Verify_OTP_Field() {

	}

	@And("^Enter Valid OTP and submit$")
	public void Submit_OTP() {

	}

	@Then("^user should successfully login$")
	public void Successfully_Login() {

	}
}
