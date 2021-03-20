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

public class InsuranceElements extends origin {

	
	public void insurancePage() throws InterruptedException  {
		String carpageurl= driver.getCurrentUrl();
		System.out.println("=====carpageurl is ====" + carpageurl);
		WebElement insurance= driver.findElement(By.xpath("//a[contains(text(),'Insurance')]"));
		insurance.click();
		Select model= new Select(driver.findElement(By.id("ddlCarModel")));
		model.selectByVisibleText("Celerio");
		driver.findElement(By.id("inpregno")).sendKeys("2342432342");
		Select month= new Select(driver.findElement(By.id("ddlregmonth")));
		month.selectByVisibleText("March");
		Select year= new Select(driver.findElement(By.id("ddlregyear")));
		year.selectByVisibleText("2017");
		driver.findElement(By.id("inpploicyno")).sendKeys("2342432342");
		driver.findElement(By.id("inpinscompany")).sendKeys("Amit Company");
		driver.findElement(By.id("inpname")).sendKeys("InsuranceTest");
		driver.findElement(By.id("inpemail")).sendKeys("insurance@testing.com");
		driver.findElement(By.id("inpphone")).sendKeys("9800000000");
		driver.findElement(By.id("disclaimer")).click();
		driver.findElement(By.id("btninsurance")).click();
		Thread.sleep(10000);
		Asserts.thankYou();
		}
}