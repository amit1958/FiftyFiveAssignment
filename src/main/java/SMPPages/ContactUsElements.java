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

public class ContactUsElements extends origin {

	
	public void contactPage() throws InterruptedException  {
		String carpageurl= driver.getCurrentUrl();
		System.out.println("=====carpageurl is ====" + carpageurl);
		WebElement contact= driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]"));
		contact.click();
	
		Thread.sleep(5000);
		Asserts.contactPageAssert();
		
		}
}