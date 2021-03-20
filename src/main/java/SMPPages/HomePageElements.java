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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

import SMPUtils.Asserts;

import com.SMP.origin;

public class HomePageElements extends origin {

	
	public void homePage()  {
		Asserts.homePageAssert();
		
		}
	public void bookATestDriver(){
		//driver.navigate().to(pr.getProperty("url"));
		//Book a test drive
		driver.findElement(By.cssSelector("a[href^='#sc_tab1']"));
		driver.findElement(By.id("inpname")).sendKeys("Testing");
		driver.findElement(By.id("inpemail")).sendKeys("Testing@mailinator.com");
		driver.findElement(By.id("inpphone")).sendKeys("9811111111");
		Select model= new Select(driver.findElement(By.id("ddlCarModel")));
		model.selectByValue("Alto K10");
		driver.findElement(By.id("disclaimer")).click();
		//submit the form now.
		driver.findElement(By.id("bookTestDrive")).click();
		Asserts.thankYou();
	}

	public void scheduleService(){
		driver.navigate().to(pr.getProperty("url"));
		//Schedule a Service
		driver.findElement(By.cssSelector("a[href^='#sc_tab2']"));
		driver.findElement(By.id("inpssname")).sendKeys("Testing");
		driver.findElement(By.id("inpssemail")).sendKeys("Testing@mailinator.com");
		driver.findElement(By.id("inpssphone")).sendKeys("9811111111");
		driver.findElement(By.id("inpsskms")).sendKeys("12000");
		Select model= new Select(driver.findElement(By.id("ddlssCarModel")));
		model.selectByValue("Alto K10");
		driver.findElement(By.id("disclaimer2")).click();
		//submit the form now.
		driver.findElement(By.id("savesservice")).click();
		Asserts.thankYou();
	}
}