package com.SMP;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class TakeScreenshot extends origin{


	public  void takesScreenshot(){
		

		  // Take screenshot and store as a file format
		  File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		  // now copy the  screenshot to desired location using copyFile method
		 
		 FileUtils.copyFile(src, new File("D:\\Selenium\\SMP_Screenshot"  + System.currentTimeMillis()+".png"));
		       
		}
		 
		catch (IOException e)
		 
		{
		 
			e.printStackTrace();
		 
		    }
	 }

}
