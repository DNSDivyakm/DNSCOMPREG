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
import io.github.bonigarcia.wdm.WebDriverManager;

public class comOrganiserDetailsTest {

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
		
		//compreg Rally details page
		comOrganiserDetailsPage ob2 = new comOrganiserDetailsPage(driver);
		ob2.organiserdetailsclick();
		ob2.organisermembersincedate();
		ob2.tableevents();
		ob2.eventscountandnameorganiser();
		ob2.ralliescountandnameorganiser();
		ob2.participantscountandnameorganiser();
		ob2.organiserprofileclick();
		ob2.organiserdetailsdisplay();
		ob2.organiserdetailssubmitbutton();
		ob2.organiserupdatedanimator();
		ob2.organisercontactaddnewbutton();
		ob2.organiserdetailsimageclick();
		
		comEventDetailsPage ob3 = new comEventDetailsPage(driver);
		ob3.addneworganiserwindow();
		ob3.neworganiseranimatorclick();


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
