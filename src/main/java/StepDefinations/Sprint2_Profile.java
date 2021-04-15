package StepDefinations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import TestRunner.TestExecuter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sprint2_Profile extends TestExecuter {

	@When("^User login$")
	public void login() throws InterruptedException {
		ValidLogin.Click_Myaccount();
		ValidLogin.Enter_Valid_Mobile();
		ValidLogin.Verify_Submit();
	}

	@And("^Enter the Fields on the profile page$")
	public void Enter_Valid_Mobile() throws InterruptedException {
		WebElement pName = driver.findElement(By
				.xpath("//input[@id='txtFirstName']"));
		mywait.until(ExpectedConditions.visibilityOf(pName));
		pName.sendKeys("Automation");
		WebElement pLname = driver.findElement(By.id("txtLastName"));
		mywait.until(ExpectedConditions.visibilityOf(pLname));
		pLname.sendKeys("AutoLName");;
		// Check OTP fields appear on the page
		WebElement pphone = driver.findElement(By.id("txtPhoneNumber"));
		mywait.until(ExpectedConditions.visibilityOf(pphone));
		pphone.sendKeys("9810923303");
		WebElement pemail = driver.findElement(By.id("txtEmail"));
		mywait.until(ExpectedConditions.visibilityOf(pemail));
		pemail.sendKeys("automation1@mailinator.com");
		WebElement pcheckbox = driver.findElement(By.xpath("//*[@class='checkBoxmark']"));
		mywait.until(ExpectedConditions.visibilityOf(pcheckbox));
		pcheckbox.click();
		Thread.sleep(5000);
		WebElement CreateProfile = driver.findElement(By.id("createProfilebutton"));
		mywait.until(ExpectedConditions.visibilityOf(CreateProfile));
		CreateProfile.click();
	}


	@Then("^User move to Dealer selection page$")
	public void Verify_Dealerselection() {
		String actualdelaerurl= driver.getCurrentUrl();
		String expected= pr.getProperty("dealerpage");
		
		assertEquals(actualdelaerurl, expected);

		
	}

}
