package DNSCompregTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import DNSCompregPages.ComLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ComLoginTest {

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
	public void comloginpagetest() throws InterruptedException
	{
		
		ComLoginPage ob=new ComLoginPage(driver);
		
		//compreg title verification
		ob.compregtitleverification();
		

		
		// login in compreg page as super admin 
		ob.setfieldvaluescomlogin("compreg.git.ch","Compreg@live");
		
		//login button click
		//ob.login();
		
		//image display
		ob.compregloginimgdisplay();
		
		
		//language selection
		ob.compreglanguagelogin();
		
		//forgot password link click
		ob.forgotpasswordlinkclick();
		
		//compreglogo image in login page 
		ob.compreglogoimagedisplay();
		

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
