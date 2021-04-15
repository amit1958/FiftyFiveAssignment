package StepDefinations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import TestRunner.TestExecuter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CarRange extends TestExecuter {
	@Then("^Go to Car Range page and verify it$")
	public void Click_Explore() {
		driver.get(pr.getProperty("url"));
		WebElement explorebutton = driver.findElement(By
				.xpath("//a[contains(text(),'Explore More')]"));
		mywait.until(ExpectedConditions.visibilityOf(explorebutton));
		explorebutton.click();
		WebElement clicknext = driver.findElement(By
				.xpath("//*[@class='orangeButton carSelectScreen']/a"));
		mywait.until(ExpectedConditions.visibilityOf(clicknext));
		clicknext.click();
		WebElement verifypage = driver.findElement(By
				.xpath("//div[contains(text(),'Select Car')]"));
		mywait.until(ExpectedConditions.visibilityOf(verifypage));
		String actuallabel = verifypage.getText().trim();
		String expectedlabel = "Select Car";
		assertEquals(actuallabel, expectedlabel);

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

