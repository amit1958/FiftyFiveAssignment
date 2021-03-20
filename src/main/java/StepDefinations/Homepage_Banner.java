package StepDefinations;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestRunner.TestExecuter;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Homepage_Banner extends TestExecuter {
	// Scenario: Validating Banner Section
	@Then("^View Banner Section$")
	public void View_Banners() {
		WebElement banner1= driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div/div[1]/div/div[1]/div/div[1]"));
		WebElement banner2=driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div/div[1]/div/div[1]/div/div[2]"));
		WebElement banner3=driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div/div[1]/div/div[1]/div/div[3]"));
		
		System.out.println(banner1.getText());
		System.out.println(banner2.getText());
		System.out.println(banner3.getText());
	}
	

	// Scenario: Validate toggle CTA
	@Then("^User click on Toggle icon in right$")
	public void Click_Toggle() {
		
		WebElement toggleclick= driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/button[2]/span[1]"));
	Boolean buttondisplay= toggleclick.isDisplayed();
	assertTrue(buttondisplay);
	}


	// Scenario: Validate Explore CTA
	@Then("^User click on Explore CTA on the banner$")
	public void Click_Explore() {
		WebElement explorebutton= driver.findElement(By.xpath("//a[contains(text(),'Explore More')]"));
		
	explorebutton.click();
	String actualurl= driver.getCurrentUrl().trim();
	String ExpectedURL = "https://arena-qa-rg-523160-single.azurewebsites.net/smp/preferences";
	assertEquals(actualurl, ExpectedURL);
	driver.navigate().back();
	mywait= new WebDriverWait(driver, 10);
	WebElement downloadbrochure= driver.findElement(By.xpath("//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/a[2]"));
	mywait.until(ExpectedConditions.elementToBeClickable(downloadbrochure));
	downloadbrochure.click();
	System.out.println("Brochure url is ===" +downloadbrochure.getAttribute("href") );
	
	}

}
