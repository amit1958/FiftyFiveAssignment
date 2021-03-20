package SMPUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.SMP.origin;

public class Asserts extends origin{

	public static void homePageAssert(){
		WebElement expected= driver.findElement(By.xpath("//h3[contains(text(),'Car Range')]"));
		String expectedas= expected.getText();
		String actual= "CAR RANGE";
		try {
			Assert.assertEquals(expectedas, actual);;
		} catch (Exception e) {
			System.out.println("TestCaes Failed");
		}
	}
	 public static void thankYou(){
		 String pagetitle= driver.getTitle();
			String expectedtitle= "Thank You";
			try {
				Assert.assertEquals(pagetitle, expectedtitle);
			} catch (Exception e) {
				System.out.println("TestCaes Failed");
			}
		}
		 
	 public static void carPageAssert(){
		 String carpageurl= driver.getCurrentUrl();
		 System.out.println("====carpageurl===" +carpageurl);
			String expectedurl= (pr.getProperty("url")+"/en/cars/wagonr");
			try {
				Assert.assertEquals(carpageurl, expectedurl);
			} catch (Exception e) {
				System.out.println("TestCaes Failed");
			}
	 }
	public static void navigateFinancepage() {
		WebElement expected= driver.findElement(By.xpath("//h3[contains(text()='Finance')]"));
		String expectedas= expected.getText();
		String actual= "FINANCE";
		try {
			Assert.assertEquals(actual,expectedas);;
		} catch (Exception e) {
			System.out.println("TestCaes Failed");
		}
	}
		public static void AboutUsPageAssert(){
			WebElement aboutexpected= driver.findElement(By.xpath("//h3[contains(text(),'About Us')]"));
			String expectedas= aboutexpected.getText();
			String actual= "ABOUT US";
			try {
				Assert.assertEquals(expectedas, actual);;
			} catch (Exception e) {
				System.out.println("TestCaes Failed");
			}
		}
		public static void financePageAssert(){
			WebElement aboutexpected= driver.findElement(By.xpath("//h3[contains(text(),'Finance')]"));
			String expectedas= aboutexpected.getText();
			String actual= "FINANCE";
			try {
				Assert.assertEquals(expectedas, actual);;
			} catch (Exception e) {
				System.out.println("TestCaes Failed");
			}
		}
		public static void carPriceValidation(){
			String priceExpected="4,29,613"; 
			WebElement price= driver.findElement(By.xpath("//label[@id='reveal-price']"));
			String actualcarprice= price.getText();
			System.out.println("===Car Price is=== " +actualcarprice );
			try {
				Assert.assertEquals(actualcarprice, priceExpected);;
			} catch (Exception e) {
				System.out.println(e);
				}
				}
			
		
			public static void financecalculateEMI(){
				WebElement emiexpected= driver.findElement(By.id("emiamount"));
				//String expectedas= aboutexpected.getText();
				String actual= "emiamount";
				try {
					Assert.assertEquals(emiexpected, actual);;
				} catch (Exception e) {
					System.out.println("TestCaes Failed");
				}
			}
				
			public static void contactPageAssert(){
				WebElement aboutexpected= driver.findElement(By.xpath("//h3[text()='Contact Us']"));
				String expectedas= aboutexpected.getText();
				String actualContact= "CONTACT US";
				try {
					Assert.assertEquals(expectedas, actualContact);;
				} catch (Exception e) {
					System.out.println("TestCaes Failed");
				}
			}
			public static void EbookNowPageAssert(){
				String ebookexpected= driver.getCurrentUrl();
				String actualContact= "https://www.marutisuzuki.com/channels/arena/service/ebook-car";
				try {
					Assert.assertEquals(actualContact, ebookexpected);;
				} catch (Exception e) {
					System.out.println("TestCaes Failed");
				}
			}
			
			
		}
		
		
	
	 

