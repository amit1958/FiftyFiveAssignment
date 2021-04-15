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
		driver.get(pr.getProperty("url"));
		String actualURL= driver.getCurrentUrl();
		String expectedURL= "https://arena-qa-rg-523160-single.azurewebsites.net/smp";
		assertEquals(actualURL, expectedURL);
		System.out.println("Test Case is passed");
		Thread.sleep(5000);
	}
	@When("^Check city listing$")
	public void clicks_City_listing() throws InterruptedException {
		WebElement Citysearch =  driver.findElement(By.xpath("//*[@class='locationLink']/a[@id='selctedCity_Des']"));
		mywait.until(ExpectedConditions.visibilityOf(Citysearch));
		Citysearch.click();
		WebElement citylist =  driver.findElement(By.xpath("//*[@class='selectCityField']/input[@class='locationCityField']"));
		mywait.until(ExpectedConditions.visibilityOf(citylist));
		citylist.click();
	
	}
	@Then("^User should come with defaul city as per location$")
	public void Verify_Default_City() throws InterruptedException {
		WebElement currentcity =driver.findElement(By.xpath("//*[@class='locationLink']/a[@id='selctedCity_Des']"));
		mywait.until(ExpectedConditions.elementToBeClickable(currentcity));
		 String cityname= currentcity.getText();
			System.out.println("==Cityname==" + cityname);
	}
	@And("^Verify City manually$")
	public static void Verify_Manual_City() throws InterruptedException {
	
		WebElement citylist =  driver.findElement(By.xpath("//*[@class='selectCityField']/input[@class='locationCityField']"));
		mywait.until(ExpectedConditions.visibilityOf(citylist));
		citylist.click();
		Thread.sleep(5000);
		citylist.sendKeys("Faridabad");
		WebElement dropdown= driver.findElement(By.xpath("//li[@data-cityid='8']/a[contains(text(), 'Faridabad')]"));
		mywait.until(ExpectedConditions.elementToBeClickable(dropdown));
		dropdown.click();
		System.out.println(citylist.getText());
		String actualcity= citylist.getText().trim();
		String expectedcity= "Faridabad";
		assertEquals(actualcity, expectedcity);
		driver.findElement(By.xpath("//a[contains(text(),'Select')]")).click();
		
	}

}
