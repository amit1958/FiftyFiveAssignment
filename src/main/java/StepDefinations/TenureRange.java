package StepDefinations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import TestRunner.TestExecuter;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class TenureRange extends TestExecuter {
	@Then("^User clicks on Explore CTA on the banner$")
	public void Click_Explore() {
		driver.get(pr.getProperty("url"));
		WebElement explorebutton = driver.findElement(By
				.xpath("//a[contains(text(),'Explore More')]"));
		mywait.until(ExpectedConditions.visibilityOf(explorebutton));
		explorebutton.click();

	}

	@And("^Verify the Tenure selection default$")
	public void Validate_DefaultTenure() {
		WebElement defaluttenure = driver.findElement(By
				.xpath("//div[@id='selectedvalue']/span"));
		mywait.until(ExpectedConditions.visibilityOf(defaluttenure));
		String actualtenure = defaluttenure.getText().trim();
		String exdefaultTenure = "48";
		assertEquals(actualtenure, exdefaultTenure);
	}

	/*@And("^Verify Change the tenure$")
	public void change_Tenure() throws InterruptedException {
		WebElement manualcity = driver.findElement(By.id("selctedCity_Des"));
		mywait.until(ExpectedConditions.visibilityOf(manualcity));
		manualcity.click();
		manualcity.sendKeys("Faridabad");
		driver.findElement(By.xpath("//*[contains(text(), 'Faridabad')]"))
				.click();
	
		WebElement changedTenure = driver.findElement(By
				.xpath("//body/div[4]/div[1]/div[1]/div[2]/div[2]/span[1]/span[2] //span[contains(text(),'24')]"));
		Actions myaction= new Actions(driver);
		myaction.moveToElement(changedTenure).build().perform();
		JavascriptExecutor itemvalue = (JavascriptExecutor)driver;
		itemvalue.executeScript("scroll(759,356)");
//		itemvalue.executeScript("arguments[0].scrollIntoView()", changedTenure); 
//		mywait.until(ExpectedConditions.visibilityOf(changedTenure));
		changedTenure.click();

		WebElement selectedtenure = driver.findElement(By
				.xpath("//div[@id='selectedvalue']/span"));
		mywait.until(ExpectedConditions.visibilityOf(selectedtenure));
		String actualtenure = selectedtenure.getText().trim();
		String exdefaultTenure = "24";
		assertEquals(actualtenure, exdefaultTenure);

	}*/

	@And("^Verify Click Next$")
	public void Click_Next() throws InterruptedException {
		WebElement clicknext = driver.findElement(By
				.xpath("//*[@class='orangeButton carSelectScreen']/a"));
		mywait.until(ExpectedConditions.visibilityOf(clicknext));
		clicknext.click();
		Thread.sleep(5000);
		WebElement verifynext = driver.findElement(By
				.xpath("//div[contains(text(),'Select Car')]"));
		mywait.until(ExpectedConditions.visibilityOf(verifynext));
		String actuallabel = verifynext.getText().trim();
		String expectedlabel = "Select Car";
		assertEquals(actuallabel, expectedlabel);
		
	}

	@And("^Verify Click Back$")
	public void Click_Back() {
		WebElement clickBack = driver.findElement(By
				.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/ul/li[1]/a"));
		mywait.until(ExpectedConditions.visibilityOf(clickBack));
		clickBack.click();
		WebElement actualvalue = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]"));
		mywait.until(ExpectedConditions.visibilityOf(actualvalue));
		String actualname=actualvalue.getText().trim();
		String expectedvalue = "Select Range";
		assertEquals(actualname, expectedvalue);
	}

}
