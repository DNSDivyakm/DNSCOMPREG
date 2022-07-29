package DNSCompregTests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DNSCompregPages.ComLoginPage;
import DNSCompregPages.comDashboardPage;
import DNSCompregPages.comOrganiserDetailsPage;
import DNSCompregPages.comOrganisersEventsCloneDeleteCancelPage;
import DNSCompregPages.comOrganisersEventsEditclickTablePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class comOrganisersEventsCloneDeleteCancelTest {

	WebDriver driver;
	
	String baseurl= "http://compreg.deepnetsoft.com/";

	


	
	
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	    driver.manage().window().maximize();

	}
	
	@BeforeMethod
	public void url1()
	{
		//compreg homepage load
		driver.get(baseurl);

		System.out.println("compreg homepage loaded successfully");

		
	}
	

	
	@Test
	public void comlogintodashboardpagetest()
	{
		
		//compreg login to dashboard authentication
		ComLoginPage ob=new ComLoginPage(driver);

	
		ob.setfieldvaluescomlogin("compreg.git.ch","Compreg@live");
		ob.login();
		ob.animatorclick();
	
		
		
		//compreg dashboard page tests
      comDashboardPage ob1= new comDashboardPage(driver);
		
		ob1.dashboardoverviewmenuclick();
		ob1.dashboardupcomingevents();
		ob1.dashboardupcomingeventsdetailsdisplay();
		
		//compreg organiser details page
		comOrganiserDetailsPage ob2 = new comOrganiserDetailsPage(driver);
		ob2.organiserdetailsclick();
		
		comOrganisersEventsEditclickTablePage ob3 = new comOrganisersEventsEditclickTablePage(driver);
		ob3.organiserseventsbuttonclicktable();
				
		comOrganisersEventsCloneDeleteCancelPage ob4 = new comOrganisersEventsCloneDeleteCancelPage(driver);
		ob4.eventstablescroll();
		ob4.organiserseventstablemenuclick();
		

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
