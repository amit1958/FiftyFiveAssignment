package StepDefinations;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import TestRunner.TestExecuter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class WhySubscribe extends TestExecuter {


	@Then("^User should come with whysubscribe section$")
	public void Verify_whysubscribe() throws InterruptedException {
		driver.get(pr.getProperty("url"));
		WebElement whysubscribe = driver.findElement(By
				.xpath("//h2[contains(text(),'Why Subscribe?')]"));
		mywait.until(ExpectedConditions.visibilityOf(whysubscribe));
		whysubscribe.getText().trim();
		
		String actuallabel = whysubscribe.getText().trim();
		String expectedlabel = "Why Subscribe?";
		assertEquals(actuallabel, expectedlabel);

	}

	@And("^Verify all whysubscribe items$")
	public void Verify_whysubscribe_items() throws InterruptedException {
		List<WebElement> allsubscribeitems = driver.findElements(By.xpath("//body/div[4]/div[3]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]"));
		mywait.until(ExpectedConditions.visibilityOfAllElements(allsubscribeitems));
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


