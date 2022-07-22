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
import DNSCompregPages.comEventsLinksPage;
import DNSCompregPages.comRallyDetailsPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class comRallyDetailsTest {

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
		
		//compreg Rally details page
		comRallyDetailsPage ob2 = new comRallyDetailsPage(driver);
		ob2.rallydetailsralliesbuttonclick();
		ob2.rallyaddnewbutton();
		ob2.addrallywindowrallyname();
		ob2.addrallywindowrallytype();
		ob2.addrallywindowstartdate();
		ob2.addrallywindowenddate();
		ob2.addrallywindowmemo();
		ob2.addrallyaddfilebutton();
		ob2.addrallywindowaddfiledropdown();
		ob2.addrallywindowfileuploadbutton();
		ob2.addrallywindowsubmitbutton();
		ob2.rallycreatedanimatorclick();
		ob2.rallylistingexportcsv();
		ob2.rallylistingsamplecsv();
		ob2.rallylistingchoosecsv();
		
		
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
