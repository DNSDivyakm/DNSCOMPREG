package DNSCompregModule1Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DNSCompregModule1Pages.comUserDashboardPage;
import DNSCompregModule1Pages.comUserLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class comUserDashboardTest {

	WebDriver driver;
	
	String baseurl= "http://compreg.deepnetsoft.com/";

	
	
	@BeforeTest
	public void setup()
	{
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
		ob.setfieldvaluescomuserlogin("divyakm1988","divyakm1988");
		//login button click
		ob.login();

		//login successfully animator
		ob.animatorclick();
		
		
		comUserDashboardPage ob2=new comUserDashboardPage(driver);
		
		ob2.userdashboardoverviewclick();	
		ob2.useroverviewicon();
		ob2.useroverviewheading();
		ob2.userupcomingeventsclick();	
		ob2.userupcomingeventsheading();
		ob2.upcomingeventsdetailswindow();
		ob2.dashboardchangeusername();
		ob2.dashboarduserprofiledetails();
		ob2.participantprofileclick();
		ob2.participantprofiledetailsfromprofileclickdetails();
		

	}
	
	
	@AfterMethod
	public void closeb()
	{
		//driver.close();
		System.out.println("Finished Test On Chrome Browser");
	}
	@AfterClass
	public void quitd()
	{
       //  driver.quit();
	}
	
	}
