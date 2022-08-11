package DNSCompregModule1Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DNSCompregModule1Pages.comOrganiserfromUserLoginPage;
import DNSCompregModule1Pages.comUserLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class comOrganiserfromUserLoginTest {

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
		
		// verification of user login in compreg page 
		ob.setfieldvaluescomuserlogin("divyakm1988","divyakm1988");
				
				
		//login button click
				ob.login();

		//login successfully animator
		ob.animatorclick();
		
		comOrganiserfromUserLoginPage ob2 = new comOrganiserfromUserLoginPage(driver);
		ob2.organiserdetailsclick();
		ob2.organiserdetailsfieldsdisplay();
		ob2.organisercontactdislay();
		ob2.organiserdetailstotalcountdisplay();
		ob2.mailidandphonedisplay();
		

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
