package TestRunner;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.mail.EmailException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import sendEmail.SendEmail;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "./src/main/java/features" }, tags = { "@ui" },

// "@ValidLogin,@Invlidlogin,"
// + "@HomepageBanners,@AvailableModels,@whysubscribe,@leasingpartners,
// + "@tenurerange,@Carrange,@pricerange,@createprofile,"
// + "@vehiclelisting,@VerifyFilters,@support,@footer, @configure" },

glue = { "StepDefinations" }, plugin = { "pretty",
		"html:target/cucumber-html-report" }, monochrome = true)
public class TestExecuter {
	public static WebDriver driver;
	public static Properties pr = new Properties();
	public static WebDriverWait mywait;
	public static JavascriptExecutor js;
	public static Actions myaction;

	@BeforeSuite
	public static void setupSuite() {
		System.out.println("Suite is executing");
	}

	@BeforeClass
	public static void setup() {
		System.out.println("Ran the before");
		try {
			File myfile = new File(
					"C:\\Users\\AGL\\AmitSharma\\workspace\\Assignment-FiftyFive\\FF.properties");

			System.out.println("exists:==> " + myfile.exists());
			FileInputStream myInput = new FileInputStream(myfile);
			pr.load(myInput);
			// System.setProperty("webdriver.gecko.driver",
			// pr.getProperty("ffdriverpath"));
			System.setProperty("webdriver.gecko.driver",
					pr.getProperty("ffdriverpathupdated"));
			// System.setProperty("webdriver.chrome.driver",pr.getProperty("chromedriver"));
			// driver.manage().deleteAllCookies();
			System.out.println("before calling the url");
			driver = new FirefoxDriver();
			// driver= new ChromeDriver();
			System.out.println("After calling the ffdriver");
			mywait = new WebDriverWait(driver, 10);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(pr.getProperty("url"));
			System.out.println("url is " + pr.getProperty("url"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@AfterClass
	public static void teardown() throws EmailException, IOException {
		// ITestResult result= null;
		// ScreenShot supportscreen = new ScreenShot();
		// supportscreen.myscreenShot();
		// driver.quit();
		// driver.close();
	}

	@AfterSuite
	public static void afteersuite() {
		try {
			String subject = "Tested on SMP domain-" + " "
					+ pr.getProperty("url");
			String filepath = "./target/cucumber-html-report/index.html";
			SendEmail myemail = new SendEmail();
			myemail.sendAnEmailwithAttachement(
					"Please find the Attached file for the executed testsuite",
					subject, filepath);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("++++++Email Problem++++++++");

		}
		// driver.quit();

	}
}
