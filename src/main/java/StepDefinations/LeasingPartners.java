package StepDefinations;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestRunner.TestExecuter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LeasingPartners extends TestExecuter {

	@When("^Select the city Fariabad$")
	public void Select_city_Fariabad() throws InterruptedException {
		WebElement Citysearch =  driver.findElement(By.xpath("//*[@class='locationLink']/a[@id='selctedCity_Des']"));
		mywait.until(ExpectedConditions.visibilityOf(Citysearch));
		Citysearch.click();
	CityListing.Verify_Manual_City();

	}

	@Then("^Verify Leasing Partners$")
	public void Verify_Label() throws InterruptedException {
	
		List<WebElement> availablepartners = driver.findElements(By
				.xpath("//*[@id='ulSMPLeasingPartner']"));
		for(WebElement partners:availablepartners){
			if (partners!=null){
					System.out.println("Test case is passed");
					
			}
			else {
				System.out.println("Testcase is failed");
			}
		}
	

	
	}

}
