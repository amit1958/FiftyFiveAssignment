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
		WebElement manualcity = driver.findElement(By.id("selctedCity_Des"));
		manualcity.click();
		manualcity.sendKeys("Faridabad");
		driver.findElement(By.xpath("//*[contains(text(), 'Faridabad')]"))
				.click();
		Thread.sleep(8000);

	}

	@Then("^User should come with Leasing Partner Label name$")
	public void Verify_Label() throws InterruptedException {
	
		WebElement availablepartners = driver.findElement(By
				.xpath("//*[@id='divSMPleasingPartner']/div/div/h2"));
		availablepartners.getText().trim();
		mywait= new WebDriverWait(driver, 20);
		mywait.until(ExpectedConditions.visibilityOf(availablepartners));
		
		String actuallabel = availablepartners.getText().trim();
		String expectedlabel = "Our Leasing Partners";
		assertEquals(actuallabel, expectedlabel);

	}

	@And("^Verify Leasing Partners$")
	public void Verify_partners() throws InterruptedException {
		List<WebElement> allpartners = driver.findElements(By
				.id("divSmpAvailableModels"));
		Integer totalpartners= allpartners.size();
		System.out.println("==Total Partners are ===" +totalpartners);
		for (WebElement mypartner : allpartners) {
			
			String partner = mypartner.getText();
			if (partner != null) {
				System.out.println("Test case is passed");
			} else {
				System.out.println("Test case is failed");
			}
		}

	}

}
