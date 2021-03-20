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

public class DrivingSchoolElements extends origin {

	
	public void drivingSchoolPage() throws InterruptedException  {
		String carpageurl= driver.getCurrentUrl();
		System.out.println("=====carpageurl is ====" + carpageurl);
		WebElement drivingschool= driver.findElement(By.xpath("//a[contains(text(),'Driving School')]"));
		//driver.navigate().to(pr.getProperty("car"));
		drivingschool.click();
		
		driver.findElement(By.id("inpname")).sendKeys("DrivingSchoolTest");
		driver.findElement(By.id("inpphone")).sendKeys("9800000000");
		driver.findElement(By.id("inpemail")).sendKeys("DrivingSchoolTest@testing.com");
		driver.findElement(By.xpath("//input[@id='inpLocation']")).sendKeys("gurgaon location");
		
		driver.findElement(By.id("disclaimer")).click();
		driver.findElement(By.id("savedriving")).click();
		
		Thread.sleep(10000);
		Asserts.thankYou();
		
		}
	
}