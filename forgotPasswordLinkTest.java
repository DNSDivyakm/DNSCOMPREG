
package DNSCompregTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DNSCompregPages.forgotPasswordLinkPage;
import io.github.bonigarcia.wdm.WebDriverManager;


public class forgotPasswordLinkTest {

	WebDriver driver;
	
	String baseurl= "http://compreg.deepnetsoft.com/forgot-password";

	
	
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
		//forgotpassword click page
		driver.get(baseurl);
		System.out.println("compreg forgot password page loaded successfully");
		
	}
	
	@Test
	public void forgotpasswordlinkpagetest() throws InterruptedException
	{
		
		forgotPasswordLinkPage ob=new forgotPasswordLinkPage(driver);
		ob.forgotpasswordpagecarimage();
		ob.forgotpasswordlogoimage();
		ob.forgotpasswordlanguage();
		ob.forgotpasswordusernametextfield();
		ob.sendresetpasswordlinkbutton();
		ob.signinbutton();
		
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
