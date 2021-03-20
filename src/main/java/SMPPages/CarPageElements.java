package SMPPages;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

import SMPUtils.Asserts;

import com.SMP.origin;

public class CarPageElements extends origin {

	
	public void carPage() throws InterruptedException  {
		//WebElement cars= driver.findElement(By.linkText("Cars"));
		WebElement cars= driver.findElement(By.xpath("//a[contains(text(),'Cars')]"));
		//driver.navigate().to(pr.getProperty("car"));
		Actions mouse= new Actions(driver);
		mouse.moveToElement(cars).build().perform();
		driver.findElement(By.linkText("WagonR")).click();
		String carpageurl= driver.getCurrentUrl();
		System.out.println("=====carpageurl is ====" + carpageurl);
		Thread.sleep(5000);
		Asserts.carPageAssert();
		
		}
	public void carGetaQuote() throws InterruptedException  {
		CarPageElements carpagemethod= new CarPageElements();
		carpagemethod.carPage();
		String currenturl=driver.getCurrentUrl();
		System.out.println("====current urls ======" +currenturl);
		WebElement getaquote= driver.findElement(By.xpath("/html/body/main/section[2]/div/ul/li[1]/a"));
		getaquote.click();
		//putting assert
		Select variant= new Select(driver.findElement(By.id("ddlvariant")));
		variant.selectByVisibleText("WAGONR LXI 1.0L");
		driver.findElement(By.id("inpname")).sendKeys("AmitTestQuoteName");
		driver.findElement(By.id("inpemail")).sendKeys("testquote@mailinator.com");
		driver.findElement(By.id("inpphone")).sendKeys("9800000000");
		driver.findElement(By.id("disclaimer")).click();
		driver.findElement(By.id("saveaquote")).click();
		Thread.sleep(10000);
		Asserts.thankYou();
		
		}
	public void bookATestDrive() throws InterruptedException{
		CarPageElements carpagemethod= new CarPageElements();
		carpagemethod.carPage();
		String currenturl=driver.getCurrentUrl();
		System.out.println("====current urls ======" +currenturl);
		//driver.navigate().to(pr.getProperty("url"));
		//Book a test drive
		driver.findElement(By.xpath("/html/body/main/section[2]/div/ul/li[2]/a/div[1]/img")).click();
		//TO BE PUT ASSERT
		driver.findElement(By.id("inpname")).sendKeys("Testing");
		driver.findElement(By.id("inpemail")).sendKeys("Testing@mailinator.com");
		driver.findElement(By.id("inpphone")).sendKeys("9811111111");
		Select model= new Select(driver.findElement(By.id("ddlCarModel")));
		model.selectByVisibleText("Alto K10");
		driver.findElement(By.id("disclaimer")).click();
		//submit the form now.
		driver.findElement(By.id("bookTestDrive")).click();
		Thread.sleep(10000);
		Asserts.thankYou();
	}


	public void navigatetoEMICalculator() throws InterruptedException{
		CarPageElements carpagemethod= new CarPageElements();
		carpagemethod.carPage();
		String currenturl=driver.getCurrentUrl();
		System.out.println("====current urls ======" +currenturl);
		driver.findElement(By.xpath("//li[4]//a[1]//div[2]")).click();
	//User should navigate to the Finance Page
		Thread.sleep(80000);
		Asserts.financePageAssert();
	}
	
	public void carPriceValidation() throws InterruptedException{
		CarPageElements carpagemethod= new CarPageElements();
		carpagemethod.carPage();
		String currenturl=driver.getCurrentUrl();
		System.out.println("====current urls ======" +currenturl);
		WebElement price= driver.findElement(By.xpath("//label[@id='reveal-price']"));
		String carprice= price.getText();
		System.out.println("===Car Price is=== " +carprice );
	//User should navigate to the Finance Page
		Thread.sleep(8000);
		Asserts.carPriceValidation();
	}
}