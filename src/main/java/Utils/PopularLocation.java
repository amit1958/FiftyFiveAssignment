package Utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import TestRunner.TestExecuter;

public class PopularLocation extends TestExecuter {


	public static void PopularLoc() throws InterruptedException {
		//driver.getCurrentUrl();
		List<WebElement> alllocations = driver.findElements(By
				.xpath("//ul[@id='PopularLoactions']/li/a"));
		mywait.until(ExpectedConditions.visibilityOfAllElements(alllocations));
		for (WebElement myloc : alllocations) {
			if (myloc.getText().equalsIgnoreCase(pr.getProperty("location"))) {
				myloc.click();
				Thread.sleep(2000);
				break;
			}
			
		}

	}
}
