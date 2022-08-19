package DNSCompregModule1Tests;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import org.testng.ITestResult;
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

public class comUserLoginTest {

	WebDriver driver;
	
	String baseurl= "http://compreg.deepnetsoft.com/";
	
	

	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	

	
	
	@BeforeTest
	public void setup()
	{
	
	
		reporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/DNS Compreg Reports/module 1 user login/compregparticipantloginpagereport.html");
		reporter.config().setDocumentTitle("Compreg Automation Report - participant login page");
		reporter.config().setReportName("Compreg functional test -participant login");
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
	public void comloginpagetest() throws InterruptedException, IOException
	{
		
		
		
		comUserLoginPage ob=new comUserLoginPage(driver);
		
		
		
		//compreg title verification
		test=extent.createTest("compreg title verification");
		ob.compreguserlogintitleverification();
		

		
		// verification of user login in compreg page 
		
		test=extent.createTest("user login username and password to the textfield");
		ob.setfieldvaluescomuserlogin("divyakm1988","divyakm1988");
	
		
		//login button click
		test=extent.createTest("login button");
		ob.login();
		
		//image display
		test=extent.createTest("login image");
		ob.compreguserloginimgdisplay();
		
		
		
		//language selection in user login
		test=extent.createTest("language selection");
		ob.compreguserloginlanguage();
		
		
		//compreglogo image in login page 
		test=extent.createTest("compreg logo image");
		ob.compreglogoimagedisplay();
		
		//login successfully animator
		test=extent.createTest("login successful animator");
		ob.animatorclick();
		

		comUserDashboardPage ob2=new comUserDashboardPage(driver);
		
		test=extent.createTest("dashboard overview click");
		ob2.userdashboardoverviewclick();	
		
		test=extent.createTest("dashboard participant profile details");
		ob2.dashboarduserprofiledetails();

		test=extent.createTest("change username click");
		ob.changeusernameclick();
		
		test=extent.createTest("change password click");
		ob.changepasswordclick();
		
		
		test=extent.createTest("hello welcome participant image display");
		ob.hellowelcomeimage();
		
		test=extent.createTest("hello welcome participant click");
		ob.hellowelcomeclick();
		
		test=extent.createTest("participant sign out cancel click");
		ob.usersignoutclickcancel();
		
		test=extent.createTest("participant sign out yes click");
		ob.usersignoutclickyes();

		

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
