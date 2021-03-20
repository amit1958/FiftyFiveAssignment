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

public class ServiceElements extends origin {

	
	public void servicePage() throws InterruptedException  {
		WebElement service= driver.findElement(By.xpath("//a[contains(text(),'Service')]"));
		String carpageurl= driver.getCurrentUrl();
		System.out.println("=====carpageurl is ====" + carpageurl);		service.click();
		Thread.sleep(3000);
		driver.findElement(By.id("inpname")).sendKeys("TestServicepage");
		driver.findElement(By.id("inpemail")).sendKeys("TestServicepage@testing.com");
		driver.findElement(By.id("inpphone")).sendKeys("9800000000");
		driver.findElement(By.id("inpsskms")).sendKeys("11111");
		Select carmodel= new Select(driver.findElement(By.id("ddlCarModel")));
		carmodel.selectByVisibleText("WagonR");
		Select year= new Select(driver.findElement(By.id("ddlpurchageyear")));
		year.selectByVisibleText("2016");
		driver.findElement(By.id("pick2")).click();
		driver.findElement(By.id("inpaddress1")).sendKeys("TestServicepage");
		driver.findElement(By.id("inpaddress2")).sendKeys("TestServicepage");
		driver.findElement(By.id("disclaimer")).click();
		driver.findElement(By.id("btnsubmit")).click();
		Thread.sleep(8000);
		Asserts.thankYou();
		}
	
	}
