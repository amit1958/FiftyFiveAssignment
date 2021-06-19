package Utils;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.mail.EmailException;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import TestRunner.TestExecuter;

public class ScreenShot extends TestExecuter{
	public void myscreenShot() throws EmailException, IOException{
		String location= "D:\\Selenium\\Screenshots\\SMP";
		//String location="C:/Users/AGL/AmitSharma/workspace/AglArena/test-output/";
		//String methodname = result.getName();
	
	//	System.out.println("===methodname===" +methodname);
//		TakeScreenshot myscreen= new TakeScreenshot();
//		myscreen.takesScreenshot();
		String filepath = null;
	try {
		Screenshot Screenshots  = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(700)).takeScreenshot(driver); 
		ImageIO.write(Screenshots.getImage(), "jpg", new File(location  + /*methodname + */ "_" + System.currentTimeMillis() + ".jpg"));
		filepath = location  + /*methodname + */   "_" + System.currentTimeMillis() + ".jpg";
		//File myattachement=new File(location  + methodname + "_" + System.currentTimeMillis() + ".png");
//		String screenpath=myattachement.getPath();
//		System.out.println("=========Path ===========" +screenpath);
		//File screenshots = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        //FileUtils.copyFile(Screenshots, new File(location  + methodname + "_" + System.currentTimeMillis() + ".png"));
	    } catch (Exception e) {
	          e.printStackTrace();
	    } finally {
	        //driver.quit();
	   }
		//email(methodname, filepath);
		//driver.quit();
//		SendEmail myemail = new SendEmail();
	//	myemail.sendAnEmailwithAttachement("Please find the Attached file", "Testing on hyperlocal");
		
	}
}
