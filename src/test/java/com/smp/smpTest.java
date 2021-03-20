package com.smp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import SMPUtils.ReadExcelFilePOI;

import com.SMP.origin;

public class smpTest extends origin {

   @Test
   public  void allDomainTest(){
	  ReadExcelFilePOI mydomains= new ReadExcelFilePOI();
	  

	   for(int row=0; row<671; row++){
			String domainurl= mydomains.readExcel(0,row,0);
			   String protocol= "https://";
			   String finalurl= protocol+domainurl;
			   System.out.println("url is " + finalurl);
			 
			     
			   
			  driver.get(finalurl);
			 
			 
					WebElement aboutexpected= driver.findElement(By.xpath("//a[contains(text(),'About Us')]"));
					String expectedas= aboutexpected.getText();
					String actual= "ABOUT US";
					try {
						Assert.assertEquals(actual, expectedas);;
					} catch (Exception e) {
						System.out.println("TestCaes Failed");
					} 
				  }

	
		}
   
   }
   
   

