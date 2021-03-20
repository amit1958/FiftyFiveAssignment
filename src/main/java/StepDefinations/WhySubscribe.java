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

public class WhySubscribe extends TestExecuter {


	@Then("^User should come with whysubscribe section$")
	public void Verify_whysubscribe() throws InterruptedException {
	
		WebElement whysubscribe = driver.findElement(By
				.xpath("/html/body/div[4]/div[3]/div[1]/div/h2"));
		whysubscribe.getText().trim();
		mywait= new WebDriverWait(driver, 10);
		mywait.until(ExpectedConditions.visibilityOf(whysubscribe));
		
		String actuallabel = whysubscribe.getText().trim();
		String expectedlabel = "Why Subscribe?";
		assertEquals(actuallabel, expectedlabel);

	}

	@And("^Verify all whysubscribe items$")
	public void Verify_whysubscribe_items() throws InterruptedException {
		List<WebElement> allsubscribeitems = driver.findElements(By.xpath("//body/div[4]/div[3]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]"));
		Integer allitems= allsubscribeitems.size();
	System.out.println(allitems);
		for (WebElement mysubscribeitems : allsubscribeitems) {
			System.out.println("==Total subitems are ===" +mysubscribeitems);
			String subItems = mysubscribeitems.getText();
			System.out.println("== Sub Items=="  +subItems);
			if (subItems != null) {
				System.out.println("Test case is passed");
			} else {
				System.out.println("Test case is failed");
			}
		}

	}
}


