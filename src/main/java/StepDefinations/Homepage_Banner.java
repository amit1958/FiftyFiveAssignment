package StepDefinations;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestRunner.TestExecuter;
import cucumber.api.java.en.Then;

public class Homepage_Banner extends TestExecuter {
	// Scenario: Validating Banner Section
	@Then("^View Banner Section$")
	public void View_Banners() {
		WebElement bannertext= driver.findElement(By.xpath("//*[contains(text(), 'Why Subscribe from Maruti Suzuki?')]"));
		mywait.until(ExpectedConditions.visibilityOf(bannertext));
		System.out.println(bannertext.getText());
	}
	

	// Scenario: Validate toggle CTA
	@Then("^User click on Toggle icon in right$")
	public void Click_Toggle() {
		
		WebElement toggleclick= driver.findElement(By.xpath("//div[@class='owl-nav']/button[2]/span"));
		mywait.until(ExpectedConditions.visibilityOf(toggleclick));
	Boolean buttondisplay= toggleclick.isDisplayed();
	assertTrue(buttondisplay);
	}


	// Scenario: Validate Explore CTA
	@Then("^User click on Explore CTA on the banner$")
	public void Click_Explore() {
		WebElement explorebutton= driver.findElement(By.xpath("//a[contains(text(),'Explore More')]"));
		mywait.until(ExpectedConditions.visibilityOf(explorebutton));
	
	explorebutton.click();
	String actualurl= driver.getCurrentUrl().trim();
	String ExpectedURL = "https://arena-qa-rg-523160-single.azurewebsites.net/smp/preferences";
	assertEquals(actualurl, ExpectedURL);
	driver.navigate().back();
	mywait= new WebDriverWait(driver, 10);
	WebElement downloadbrochure= driver.findElement(By.xpath("//div[@class='btn']/a[2]"));
	mywait.until(ExpectedConditions.elementToBeClickable(downloadbrochure));
	downloadbrochure.click();
	System.out.println("Brochure url is ===" +downloadbrochure.getAttribute("href") );
	
	}

}
