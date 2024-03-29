

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
import DNSCompregPages.comOrganisersContactTablePage;
import DNSCompregPages.comOrganiserDetailsPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class comOrganisersContactTableTest {

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
		
		//compreg organiser details tests
		comOrganiserDetailsPage ob2 = new comOrganiserDetailsPage(driver);
		ob2.organiserdetailsclick();
				
		//compreg organiser contact table
		comOrganisersContactTablePage ob3 = new comOrganisersContactTablePage(driver);
		ob3.imageorganisertable();
		ob3.organisertablescroll();
		ob3.editorganisercontact();
		ob3.eventorganiserupdated();
		ob3.organisercontacttabledeleteyes();
		ob3.eventorganiserdeletedanimator();
		ob3.organisercontacttabledeletecancel();
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
