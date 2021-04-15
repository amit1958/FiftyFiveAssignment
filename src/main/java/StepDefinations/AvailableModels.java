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

public class AvailableModels extends TestExecuter {

/*	@Given("^User is on the landing page$")
	public void LandingPage() throws InterruptedException {
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://arena-qa-rg-523160-single.azurewebsites.net/smp";
		assertEquals(actualURL, expectedURL);
		System.out.println("Test Case is passed");
		Thread.sleep(5000);
	}*/

	@When("^Select city Fariabad$")
	public void Select_city_Fariabad() throws InterruptedException {
		WebElement manualcity = driver.findElement(By.id("selctedCity_Des"));
		mywait.until(ExpectedConditions.visibilityOf(manualcity));
		manualcity.click();
		manualcity.sendKeys("Faridabad");
		driver.findElement(By.xpath("//*[contains(text(), 'Faridabad')]"))
				.click();
		Thread.sleep(8000);

	}

	@Then("^User should come with label name$")
	public void Verify_Label() throws InterruptedException {
	
		WebElement availablemodels = driver.findElement(By
				.xpath("//*[@id='divSmpAvailModel']/div/h2"));
		mywait.until(ExpectedConditions.visibilityOf(availablemodels));
		availablemodels.getText().trim();
		mywait= new WebDriverWait(driver, 20);
		mywait.until(ExpectedConditions.visibilityOf(availablemodels));
		
		String actuallabel = availablemodels.getText().trim();
		String expectedlabel = "Available Models";
		assertEquals(actuallabel, expectedlabel);

	}

	@And("^Verify models$")
	public void Verify_Models() throws InterruptedException {
		List<WebElement> allmodels = driver.findElements(By
				.id("divSmpAvailableModels"));
		mywait.until(ExpectedConditions.visibilityOfAllElements(allmodels));
		for (WebElement mymodel : allmodels) {
			String model1 = mymodel.getText();
			if (model1 != null) {
				System.out.println("Test case is passed");
			} else {
				System.out.println("Test case is failed");
			}
		}

	}

}
