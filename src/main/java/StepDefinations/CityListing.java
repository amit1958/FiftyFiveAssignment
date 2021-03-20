package StepDefinations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import TestRunner.TestExecuter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CityListing extends TestExecuter {

	@Given("^User is on the landing page$")
	public void LandingPage() throws InterruptedException{
		String actualURL= driver.getCurrentUrl();
		String expectedURL= "https://arena-qa-rg-523160-single.azurewebsites.net/smp";
		assertEquals(actualURL, expectedURL);
		System.out.println("Test Case is passed");
		Thread.sleep(5000);
	}
	@When("^Check city listing$")
	public void clicks_City_listing() throws InterruptedException {
		WebElement Citysearch =  driver.findElement(By.id("selctedCity_Des"));
		Citysearch.click();
		WebElement citylist=driver.findElement(By.xpath("//ul[@id='cityList_desktop']"));
		citylist.click();
	
	}
	@Then("^User should come with defaul city as per location$")
	public void Verify_Default_City() throws InterruptedException {
		WebElement currentcity =driver.findElement(By.id("selctedCity_Des"));
		mywait.until(ExpectedConditions.elementToBeClickable(currentcity));
		 String cityname= currentcity.getText();
			System.out.println("==Cityname==" + cityname);
	}
	@And("^Verify City manually$")
	public void Verify_Manual_City() throws InterruptedException {
		WebElement manualcity =driver.findElement(By.id("selctedCity_Des"));
				manualcity.sendKeys("Faridabad");
		driver.findElement(By.xpath("//*[contains(text(), 'Faridabad')]")).click();
		System.out.println(manualcity.getText());
		String actualcity= manualcity.getText().trim();
		String expectedcity= "Faridabad";
		assertEquals(actualcity, expectedcity);
		
	}

}
