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

public class comUserLoginTest {

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
	public void comloginpagetest() 
	{
		
		
		
		comUserLoginPage ob=new comUserLoginPage(driver);
		
		//compreg title verification
		ob.compreguserlogintitleverification();
		

		
		// verification of user login in compreg page 
		ob.setfieldvaluescomuserlogin("divyakm1988","divyakm1988");
	
		
		//login button click
		ob.login();
		
		//image display
		ob.compreguserloginimgdisplay();
		
		
		
		//language selection in user login
		ob.compreguserloginlanguage();
		
		
		//compreglogo image in login page 
		ob.compreglogoimagedisplay();
		//login successfully animator
		ob.animatorclick();
	
		

		comUserDashboardPage ob2=new comUserDashboardPage(driver);
		ob2.userdashboardoverviewclick();	
		ob2.dashboarduserprofiledetails();

		
		ob.changeusernameclick();
		ob.changepasswordclick();
		ob.usersignoutclickcancel();
	//	ob.usersignoutclickyes();
		ob.hellowelcomeclick();
		ob.hellowelcomeimage();


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
