package StepDefinations;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import TestRunner.TestExecuter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class PriceRange extends TestExecuter {
	@Then("^Go to Price Range page and verify it$")
	public void Click_Explore() {
		WebElement explorebutton = driver.findElement(By
				.xpath("//a[contains(text(),'Explore More')]"));
		mywait.until(ExpectedConditions.visibilityOf(explorebutton));
		explorebutton.click();
		WebElement clicknext = driver.findElement(By
				.xpath("//*[@class='orangeButton carSelectScreen']/a"));
		mywait.until(ExpectedConditions.visibilityOf(clicknext));
		clicknext.click();
		
		WebElement Selectall =
				driver.findElement(By
						.xpath("//a[contains(text(),'SELECT ALL')]"));
		mywait.until(ExpectedConditions.visibilityOf(Selectall));
		if (Selectall.getText().equalsIgnoreCase("SELECT ALL"));
		Selectall.click();
		System.out.println("Car selected");
		WebElement donext= driver.findElement(By.xpath("//*[@id='nextselection']/a"));
		mywait.until(ExpectedConditions.visibilityOf(donext));
		donext.click();
		

	}
	
		@And("^Do price range selection$")
		public void Select_pricerange() {
			//Fetch Price slider dimension
			WebElement sliderdimension= driver.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[2]/div[2]/span[1]/span[3]"));
			assertTrue(sliderdimension.isDisplayed());
			//Dimension sliderSize = sliderdimension.getSize();
			int xCoord = sliderdimension.getLocation().getX();
			System.out.println("Xcorrd is " +xCoord);
			WebElement priceslider= driver.findElement(By.xpath("//body/div[4]/div[3]/div[1]/div[2]/div[2]/span[1]/span[6]"));
			mywait.until(ExpectedConditions.visibilityOf(priceslider));
			Actions moveslider= new Actions(driver);
			moveslider.clickAndHold(priceslider).moveByOffset(xCoord, 0).build().perform();
		WebElement selectedRange=driver.findElement(By.xpath("/html/body/div[4]/div[3]/div[1]/div[2]/div[2]/span/span[1]/span[6]"));
			String actualPricerange= selectedRange.getText();
			System.out.println("selected price range is" + " "+actualPricerange);
			/*String ExpectedPricerange= "34 000 — 250 000";
			assertEquals(actualPricerange, ExpectedPricerange);*/
		}
	
		

}

