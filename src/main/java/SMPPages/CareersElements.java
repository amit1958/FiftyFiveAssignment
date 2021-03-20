package SMPPages;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

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
import bsh.Console;

import com.SMP.origin;

public class CareersElements extends origin {

	
	public void careersPage() throws InterruptedException  {
		String carpageurl= driver.getCurrentUrl();
		System.out.println("=====carpageurl is ====" + carpageurl);
		WebElement career= driver.findElement(By.xpath("//a[contains(text(),'Careers')]"));
		career.click();
		Thread.sleep(5000);
		try {
			Boolean apply= driver.findElement(By.xpath("/html/body/main/section/div/div/div[2]/div[2]/a")).isDisplayed();
			if(apply.equals(true)){
				   driver.findElement(By.xpath("/html/body/main/section/div/div/div[2]/div[2]/a")).click();
				   Thread.sleep(2000);
					driver.findElement(By.id("inpname")).sendKeys("CareersTest");
					driver.findElement(By.id("inpphone")).sendKeys("9800000000");
					driver.findElement(By.id("inpemail")).sendKeys("Careers@testing.com");
					driver.findElement(By.id("inptextarea")).sendKeys("gurgaon location");
					
					driver.findElement(By.id("disclaimer")).click();
					driver.findElement(By.id("btnsubmit")).click();
					Thread.sleep(7000);
					Asserts.thankYou();
			}
			else {
				System.out.println("Apply button doesn't found" + apply);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
				   System.out.println("Apply button not present on this page");
				
		}

	
		
		
		
	}
}