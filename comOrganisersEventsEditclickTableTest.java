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
import DNSCompregPages.comOrganiserDetailsPage;
import DNSCompregPages.comOrganisersEventsEditclickTablePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class comOrganisersEventsEditclickTableTest {

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
		ob3.organiserseventstablescroll();
		ob3.elementeditclickintable();	
		
		comEventDetailsPage ob4 = new comEventDetailsPage(driver);
		
		ob4.eventdetailsnamedisplay();
		ob4.eventtypedropdown();
		ob4.eventorganiserfield();
		ob4.orgnisercontactdropdown();
		ob4.enquirycontactdisplay();
		ob4.enquiryemaildisplay();
		ob4.venueeventdetails();
		ob4.eventdetailsfield();
		ob4.eventdetailsstartdate();
		ob4.eventdetailsenddate();
		ob4.eventdetailslastdate();
		ob4.facebookeventdetails();
		ob4.instagrameventdetails();
		ob4.memoeventdetails();
		ob4.websiteeventdetails();
		ob4.addnewcontactlink();
		ob4.addneworganiserwindow();
		ob4.eventdetailsaddfilebutton();
		ob4.addfiledropdown();
	    ob4.neworganiseranimatorclick();
	    ob4.fileuploadbutton();
	    ob4.eventdetailssubmit();
	    ob4.imageuploadeventdetails();
	    
	    
		ob3.eventupdatedanimator();
		

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
