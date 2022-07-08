package DNSCompregTests;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DNSCompregPages.comSignupPage;
import io.github.bonigarcia.wdm.WebDriverManager;


public class comSignupTest {

	
	WebDriver driver;
	String baseurl="http://compreg.deepnetsoft.com/register";
	
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
		driver.get(baseurl);
		
	}
	
	
	@Test
	public void compreglogosignuppage() 
	{
		
	}

	@Test
	public void testsignup()
	{
		
		comSignupPage ob=new comSignupPage(driver);
		ob.setvaluesregister("aaa","sss","klkl@123","lll@gmail.com","9876543245","jjjkkk","jjjkkk");
		ob.registernextbutton();
		ob.registerfirstimgdisplay();
		ob.registersecondimgdisplay();
		ob.registerpagelogoimage();
		ob.facebookurlregister();
		ob.instagramurlregister();
		//ob.skipandcompleteregistrationbutton();
		ob.saveandcompleteregistrationbutton();
	

	}

	@AfterMethod
	public void closeb()
	{
	//	driver.close();
		System.out.println("Finished Test On Chrome Browser");
	}
	@AfterClass
	public void quitd()
	{
//driver.quit();
	}
}

