package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import TestRunner.TestExecuter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CarRange extends TestExecuter {
	@Then("^Go to Car Range page and verify it$")
	public void Click_Explore() throws InterruptedException {
		TenureRange.Click_Explore();
		TenureRange.Click_Next();

	}

	@And("^Verify Select All$")
	public static void Validate_CarRange() throws InterruptedException {
		WebElement Selectall =
				driver.findElement(By
						.xpath("//a[contains(text(),'SELECT ALL')]"));
		mywait.until(ExpectedConditions.visibilityOf(Selectall));
		if (Selectall.getText().equalsIgnoreCase("SELECT ALL"));
		Selectall.click();
		System.out.println("Car selected");
		Thread.sleep(5000);
	}
		@And("^Do Next$")
		public static void Do_Next() {
			WebElement donext= driver.findElement(By.xpath("//*[@id='nextselection']/a"));
			mywait.until(ExpectedConditions.visibilityOf(donext));
			donext.click();
		}
	
		

}

