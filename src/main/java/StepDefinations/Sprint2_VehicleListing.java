package StepDefinations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import TestRunner.TestExecuter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Sprint2_VehicleListing extends TestExecuter {

	@Given("^user do explores$")
	public void user_do_explores() throws Throwable {
		WebElement explorebutton = driver.findElement(By
				.xpath("//a[contains(text(),'Explore More')]"));
		mywait.until(ExpectedConditions.visibilityOf(explorebutton));
		explorebutton.click();
		Thread.sleep(5000);
	}

	@And("^User select the preference$")
	public static void Select_Preferences() throws InterruptedException {

		WebElement clicknext = driver.findElement(By
				.xpath("//*[@class='orangeButton carSelectScreen']/a"));
		mywait.until(ExpectedConditions.visibilityOf(clicknext));
		clicknext.click();

		WebElement Selectall = driver.findElement(By
				.xpath("//a[contains(text(),'SELECT ALL')]"));
		mywait.until(ExpectedConditions.visibilityOf(Selectall));
		if (Selectall.getText().equalsIgnoreCase("SELECT ALL"))
			;
		Selectall.click();
		System.out.println("Car selected");
		Thread.sleep(5000);

		CarRange.Do_Next();
		//price range page
		// JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		WebElement pricenext= driver.findElement(By.xpath("//li[@class='orangeButton']/a[@href='/smp/listing']")); 
		mywait.until(ExpectedConditions.visibilityOf(pricenext));
		//js.executeScript("arguments[0].click();", pricenext);
		pricenext.click();
	}

	@Then("^User should move to the Listing page$")
	public static void Validate_Vehiclelisting() {
		String listingurl = driver.getCurrentUrl();
		String expectedurl = pr.getProperty("listingurl");
		assertEquals(listingurl, expectedurl);
		// All car models tab should be there
		WebElement allcarmodels = driver.findElement(By
				.xpath("//a[contains(text(),'All Car Models')]"));
		if (allcarmodels != null) {
			System.out.println("Test Case is passed");
		} else {
			System.out.println("Test Case is Failed");
		}

	}

}
