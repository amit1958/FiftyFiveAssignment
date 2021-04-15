package StepDefinations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import TestRunner.TestExecuter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidLogin extends TestExecuter {

	@When("^Click on myaccount page$")
	public static void Click_Myaccount() throws InterruptedException {
		WebElement Myaccount = driver.findElement(By
				.xpath("//span[@id='smpProfileAccount']"));
		mywait.until(ExpectedConditions.visibilityOf(Myaccount));
		Myaccount.click();
	}

	@Then("^Enter valid moble number and Send OTP$")
	public static void Enter_Valid_Mobile() {
		WebElement phonenumber = driver.findElement(By
				.xpath("//input[@id='mobnum']"));
		mywait.until(ExpectedConditions.visibilityOf(phonenumber));
		phonenumber.sendKeys("9810923303");
		WebElement Sendotp = driver.findElement(By.id("submitinfo"));
		mywait.until(ExpectedConditions.visibilityOf(Sendotp));
		Sendotp.click();
		// Check OTP fields appear on the page
		WebElement otpfield1 = driver.findElement(By.xpath("//input[@id='codeBox1']"));
		mywait.until(ExpectedConditions.visibilityOf(otpfield1));
		otpfield1.sendKeys("1");
		WebElement otpfield2 = driver.findElement(By.xpath("//input[@id='codeBox2']"));
		mywait.until(ExpectedConditions.visibilityOf(otpfield2));
		otpfield2.sendKeys("2");
		WebElement otpfield3 = driver.findElement(By.xpath("//input[@id='codeBox3']"));
		mywait.until(ExpectedConditions.visibilityOf(otpfield3));
		otpfield3.sendKeys("3");
		WebElement otpfield4 = driver.findElement(By.xpath("//input[@id='codeBox4']"));
		mywait.until(ExpectedConditions.visibilityOf(otpfield4));
		otpfield4.sendKeys("4");
	}

	@And("^Verify Enter Submit Button$")
	public static void Verify_Submit() {
		WebElement verifyotp = driver.findElement(By.id("verifyOtp"));
		mywait.until(ExpectedConditions.visibilityOf(verifyotp));
		verifyotp.click();
	}

	@Then("^User move to profile page$")
	public void Verify_Profile() {
		WebElement veriyfCreateprofile = driver.findElement(By
				.xpath("//h2[contains(text(),'Create Profile')]"));
		mywait.until(ExpectedConditions.visibilityOf(veriyfCreateprofile));
		String actualvalue = veriyfCreateprofile.getText();
		String Expecftedvalue = "Create Profile";
		assertEquals(actualvalue, Expecftedvalue);

		
	}

}
