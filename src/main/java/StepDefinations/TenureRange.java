package StepDefinations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestRunner.TestExecuter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class TenureRange extends TestExecuter {
	@Then("^User clicks on Explore CTA on the banner$")
	public void Click_Explore() {
		WebElement explorebutton = driver.findElement(By
				.xpath("//a[contains(text(),'Explore More')]"));
		mywait.until(ExpectedConditions.visibilityOf(explorebutton));
		explorebutton.click();

	}

	@And("^Verify the Tenure selection default$")
	public void Validate_DefaultTenure() {
		WebElement defaluttenure = driver.findElement(By
				.xpath("//div[@id='selectedvalue']"));
		mywait.until(ExpectedConditions.visibilityOf(defaluttenure));
		String actualtenure = defaluttenure.getText().trim();
		String exdefaultTenure = "48 Months";
		assertEquals(actualtenure, exdefaultTenure);
	}

	@And("^Verify Change the tenure$")
	public void change_Tenure() {
		WebElement manualcity = driver.findElement(By.id("selctedCity_Des"));
		mywait.until(ExpectedConditions.visibilityOf(manualcity));
		manualcity.click();
		manualcity.sendKeys("Faridabad");
		driver.findElement(By.xpath("//*[contains(text(), 'Faridabad')]"))
				.click();

		WebElement changedTenure = driver
				.findElement(By
						.xpath("//body/div[4]/div[1]/div[1]/div[2]/div[2]/span[1]/span[1]/span[6]"));
		mywait = new WebDriverWait(driver, 10);
		mywait.until(ExpectedConditions.visibilityOf(changedTenure));
		changedTenure.click();

		WebElement selectedtenure = driver.findElement(By
				.xpath("//div[@id='selectedvalue']"));
		mywait.until(ExpectedConditions.visibilityOf(selectedtenure));
		String actualtenure = selectedtenure.getText().trim();
		String exdefaultTenure = "24 Months";
		assertEquals(actualtenure, exdefaultTenure);

	}

	@And("^Verify Click Next$")
	public void Click_Next() throws InterruptedException {
		WebElement clicknext = driver.findElement(By
				.xpath("//*[@class='orangeButton carSelectScreen']/a"));
		mywait.until(ExpectedConditions.visibilityOf(clicknext));
		clicknext.click();
		Thread.sleep(5000);
		WebElement verifynext=driver.findElement(By.xpath("//div[contains(text(),'Select Car')]"));
		mywait.until(ExpectedConditions.visibilityOf(verifynext));
		String actuallabel= verifynext.getText().trim();
		String expectedlabel= "Select Car";
		assertEquals(actuallabel, expectedlabel);
		
	}

	@And("^Verify Click Back$")
	public void Click_Back() {
		driver.navigate().back();
		WebElement clickBack = driver.findElement(By
				.xpath("//*[@class='whiteButton']/a"));
		mywait.until(ExpectedConditions.visibilityOf(clickBack));
		clickBack.click();
		String currentURl= driver.getCurrentUrl().trim();
		String expectedURL= "https://arena-qa-rg-523160-single.azurewebsites.net/smp/preferences";
		assertEquals(currentURl, expectedURL);
	}

}
