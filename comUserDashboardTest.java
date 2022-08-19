package DNSCompregModule1Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import DNSCompregModule1Pages.comUserDashboardPage;
import DNSCompregModule1Pages.comUserLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class comUserDashboardTest {

	WebDriver driver;
	
	String baseurl= "http://compreg.deepnetsoft.com/";

	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
	
	@BeforeTest
	public void setup()
	{
		
		reporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/DNS Compreg Reports/module 1 user login/compregparticipantdashboardpagereport.html");
		reporter.config().setDocumentTitle("Compreg Automation Report - participant dashboard page");
		reporter.config().setReportName("Compreg functional test -  participant dashboard page");
		reporter.config().setTheme(Theme.STANDARD);
		reporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("os", "windows10");
		extent.setSystemInfo("Tester Name", "DIVYA K M");
		extent.setSystemInfo("Browser Name", "chrome");
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	    driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	}
	
	@BeforeMethod
	public void url()
	{
		//compreg homepage load
		driver.get(baseurl);
		System.out.println("compreg homepage loaded successfully");
		
	}
	
	@Test
	public void comuserdashboardtest() throws InterruptedException
	{
		
		comUserLoginPage ob=new comUserLoginPage(driver);
		
		// verification of user login in compreg page 
		
		test=extent.createTest("login username and password to the textfield");
		ob.setfieldvaluescomuserlogin("divyakm1988","divyakm1988");
		//login button click
		
		test=extent.createTest("login button");
		ob.login();

		//login successfully animator
		
		test=extent.createTest("login successful animator");
		ob.animatorclick();
		
		
		comUserDashboardPage ob2=new comUserDashboardPage(driver);
		
		
		test=extent.createTest("participant dashboard overview click");
		ob2.userdashboardoverviewclick();	
		
		test=extent.createTest("participant dashboard overview icon");
		ob2.useroverviewicon();
		
		test=extent.createTest("participant dashboard overview heading");
		ob2.useroverviewheading();
		
		test=extent.createTest("participant dashboard upcoming events click");
		ob2.userupcomingeventsclick();
		
		test=extent.createTest("participant dashboard upcoming events heading");
		ob2.userupcomingeventsheading();
		
		test=extent.createTest("participant dashboard upcoming events details window");
		ob2.upcomingeventsdetailswindow();
		
		test=extent.createTest("participant dashboard past events click");
		ob2.pasteventsclick();
		
		test=extent.createTest("participant dashboard change username window click");
		ob2.dashboardchangeusername();
		
		test=extent.createTest("participant dashboard profile name and image display and click");
		ob2.dashboarduserprofiledetails();
		
		test=extent.createTest("participant dashboard participant profile click");
		ob2.participantprofileclick();
		
		test=extent.createTest("participant profile details and submit button click");
		ob2.participantprofiledetailsfromprofileclick();
		

	}
	

	
	@AfterMethod
    public void getResult(ITestResult result) {
        if(result.getStatus() == ITestResult.FAILURE) {
            test.log(Status.FAIL,result.getThrowable());
        }
        else if(result.getStatus() == ITestResult.SUCCESS) {
            test.log(Status.PASS, result.getTestName());
        }
        else {
            test.log(Status.SKIP, result.getTestName());
        }
    }
 
	
	 @AfterTest
	    public void tearDown() {
	        //to write or update test information to reporter
	        extent.flush();
	    }
	

	@AfterClass
	public void quitd()
	{
       //  driver.quit();
	}
	
	}

