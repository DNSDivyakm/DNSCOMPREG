

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
import DNSCompregPages.comEventDetailsPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class comEventDetailsTest {

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
		ob1.upcomingeventdetailsclick();
		
		//compreg event details page tests
		comEventDetailsPage ob2 = new comEventDetailsPage(driver);
		
		ob2.detailsbuttonineventdetailspage();
		ob2.eventdetailsnamedisplay();
		ob2.eventtypedropdown();
		ob2.eventorganiserfield();
		ob2.orgnisercontactdropdown();
		ob2.enquirycontactdisplay();
		ob2.enquiryemaildisplay();
		ob2.venueeventdetails();
		ob2.eventdetailsfield();
		ob2.eventdetailsstartdate();
		ob2.eventdetailsenddate();
		ob2.eventdetailslastedate();
		ob2.facebookeventdetails();
		ob2.instagrameventdetails();
		ob2.memoeventdetails();
		ob2.websiteeventdetails();
		ob2.addnewcontactlink();
		ob2.addneworganiserwindow();
		ob2.eventdetailsaddfilebutton();

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
