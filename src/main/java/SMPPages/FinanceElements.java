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

public class FinanceElements extends origin {

	
	public void financePage() throws InterruptedException  {
		String carpageurl= driver.getCurrentUrl();
		System.out.println("=====carpageurl is ====" + carpageurl);
		WebElement finance= driver.findElement(By.xpath("//a[contains(text(),'Finance')]"));
		//driver.navigate().to(pr.getProperty("car"));
		finance.click();
		Select carmodel= new Select(driver.findElement(By.id("ddlcarmodel")));
		carmodel.selectByVisibleText("WagonR");
		Select variant= new Select(driver.findElement(By.id("ddlcarVarient")));
		variant.selectByVisibleText("WAGONR LXI 1.0L (O)");
		WebElement carprice=driver.findElement(By.xpath("//*[@id='carPrice']"));
		String price= carprice.getText();
		System.out.println("=====price is " +price);
		
		Thread.sleep(5000);
		Asserts.financePageAssert();
		
		}
	public void calculateEMI() throws InterruptedException{
		driver.findElement(By.id("CalculateEmi")).click();
	WebElement calculatedAmount=	driver.findElement(By.id("emiamount"));
	String amountis= calculatedAmount.getText();
	System.out.println("===amount is ===" +amountis);
	Thread.sleep(5000);
	Asserts.financePageAssert();
	}
	
}