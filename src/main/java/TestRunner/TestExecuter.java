package TestRunner;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.SMP.TakeScreenshot;

import sendEmail.SendEmail;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"C:/Users/AGL/smp/git/ArenaSMP-Cucumber/src/main/java/features/TenureRange.feature"
				/*"C:/Users/AGL/smp/git/ArenaSMP-Cucumber/src/main/java/features/WhySubscribe.feature",
				"C:/Users/AGL/smp/git/ArenaSMP-Cucumber/src/main/java/features/LeasingPartners.feature",
				"C:/Users/AGL/smp/git/ArenaSMP-Cucumber/src/main/java/features/AvailableModels.feature",
				"C:/Users/AGL/smp/git/ArenaSMP-Cucumber/src/main/java/features/CityListing.feature",
				"C:/Users/AGL/smp/git/ArenaSMP-Cucumber/src/main/java/features/Login.feature",
				"C:/Users/AGL/smp/git/ArenaSMP-Cucumber/src/main/java/features/Homepage_Banner.feature" */},
		glue={"StepDefinations"},
		plugin={"pretty","html:target/cucumber-html-report"},
		//format= { "html:test-output"},
		monochrome=true
)

public class TestExecuter {
	public static WebDriver driver;
  	public static Properties pr = new Properties();
  	public  WebDriverWait mywait= new WebDriverWait(driver, 10);
  	
  	@BeforeSuite
  	public static void setupSuite(){
  		System.out.println("Suite is executing");
  	}
	@BeforeClass
    public static void setup() {
        System.out.println("Ran the before");
    	try {
    			File myfile = new File(
    					"C:\\Users\\AGL\\smp\\git\\ArenaSMP-Cucumber\\SMP.properties");
    			System.out.println("exists:==> " + myfile.exists());
    			FileInputStream myInput = new FileInputStream(myfile);
    			pr.load(myInput);
    			// System.setProperty("webdriver.gecko.driver",
    			// pr.getProperty("ffdriverpath"));
    			System.setProperty("webdriver.gecko.driver",
    					pr.getProperty("ffdriverpathupdated"));
    			System.out.println("before calling the url");
    			driver = new FirefoxDriver();
    			System.out.println("After calling the ffdriver");
    			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    			// driver.manage().window().maximize();
    			driver.get(pr.getProperty("url"));
    			System.out.println("url is " + pr.getProperty("url"));
    			Thread.sleep(5000);
    		} catch (Exception e) {
    			e.printStackTrace();
    		}

    }

    @AfterClass
    public static void teardown() {
        //driver.quit();
    	TakeScreenshot myscreen= new TakeScreenshot();
    	myscreen.takesScreenshot();

    }
    @AfterSuite
    public static void afteersuite(){
    	try {
			String subject= "Tested on SMP domain-" + " " + pr.getProperty("url");
			SendEmail myemail = new SendEmail();
			myemail.sendAnEmailwithAttachement("Please find the Attached file for the executed testsuite", subject );
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("++++++Email Problem++++++++");
			
		}	
	
		}
    }



