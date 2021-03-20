package SMPPages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import SMPUtils.Asserts;

import com.SMP.origin;

public class EBookNowElements extends origin {

	
	public void EbookNow() throws InterruptedException  {
		String aboutusurl= driver.getCurrentUrl();
		System.out.println("=====aboutusurl is ====" + aboutusurl);
		
		
		
		try {
			Boolean ebook= driver.findElement(By.xpath("//a[contains(text(),'E Book Now')]")).isDisplayed();
			if(ebook.equals(true)){
				driver.findElement(By.xpath("//a[contains(text(),'E Book Now')]")).click();
				   Thread.sleep(2000);
				   List<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
					//switch to new tab
					driver.switchTo().window(browserTabs .get(1));
					Thread.sleep(5000);
					Asserts.EbookNowPageAssert();
			}
			else {
				System.out.println("Ebook Element doesn't found" + ebook);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
				   System.out.println("Ebook link not present on this page");
				
		}
		
		
	
		}

}