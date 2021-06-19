package com.Fiftyfive;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import TestRunner.TestExecuter;



public class TakeScreenshot extends TestExecuter{


	public  void takesScreenshot(){
		

		  // Take screenshot and store as a file format
		  File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		  // now copy the  screenshot to desired location using copyFile method
		 
		 FileUtils.copyFile(src, new File("D:\\Selenium\\Screenshot\\SMP"  + System.currentTimeMillis()+".png"));
		       
		}
		 
		catch (IOException e)
		 
		{
		 
			e.printStackTrace();
		 
		    }
	 }

}
