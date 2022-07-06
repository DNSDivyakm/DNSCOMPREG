package DNSCompregPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ComLoginPage {

	WebDriver driver;
	
	By comusername= By.name("username");
	By compassword=By.name("password");

	
	public ComLoginPage(WebDriver driver)
	{
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	

	}
	
	//setting values for login fields
	public void setfieldvaluescomlogin(String username , String password)
	{
		driver.findElement(comusername).sendKeys(username);
		driver.findElement(compassword).sendKeys(password);
		

	}
	
	//title verification
	public void compregtitleverification()
	{
		String actualtitle = driver.getTitle();
	    if(actualtitle.equals("COMPREG"))
			{
				System.out.println("titleverification- pass");
			}
			else
			{
				System.out.println("titleverification-fail");

			}
	}
	
	//verifying image displayed or not
	public void compregloginimgdisplay()
	{
		WebElement loginimage = driver.findElement(By.xpath("//*[@class='auth-layout']/div"));
		if(loginimage.isDisplayed()==true)
		{
			System.out.println("image is present in login page");
			
		}
		else
		{
			System.out.println("image is not displayed in login page ");

		}
	}
	
	//verifying compreg logo image displayed or not
		public void compreglogoimagedisplay()
		{
			WebElement compreglogoimage = driver.findElement(By.xpath("//*[@class='wrap']/img"));
			if(compreglogoimage.isDisplayed()==true)
			{
				System.out.println("compreg logo image is present in login page");
				
			}
			else
			{
				System.out.println("compreg logo image is not displayed in login page ");

			}
		}
		
	//verifying language is clickable and listing
	public void compreglanguagelogin() throws InterruptedException
	{
		
	WebElement languagelist = driver.findElement(By.name("language"));
	Select option = new Select(languagelist);
	option.selectByIndex(0);
	
	Thread.sleep(3000);
	
	}
	
		
	// login button click
	public void login()
	{
		WebElement comloginbutton = driver.findElement(By.xpath("//*[@class='jss4']/button"));
		
        System.out.println("Clicking on the login button in the compreg page");

		comloginbutton.click();
	
	
		
	}
	
	// forgot password link click
	public void forgotpasswordlinkclick()
	{
		
		WebElement forgotpassword= driver.findElement(By.xpath("//*[@class='text']/a"));
      	forgotpassword.click();
	}
	
}









