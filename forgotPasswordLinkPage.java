
package DNSCompregPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class forgotPasswordLinkPage {

	WebDriver driver;
	

	
	public forgotPasswordLinkPage(WebDriver driver)
	{
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	

	}
	
	//forgot password page main image 
	public void forgotpasswordpagecarimage()
	{
		WebElement forgotpasswordcarimage = driver.findElement(By.xpath("//*[@class='auth-layout']/div"));
		if(forgotpasswordcarimage.isDisplayed()==true)
		{
			System.out.println("image is displayed in forgot password page");
			
		}
		else
		{
			System.out.println("image is not displayed in login page ");

		}

	}
	
	//forgot password logo image
	public void forgotpasswordlogoimage()
	{
		
		
     WebElement forgotpasswordimagelogo = driver.findElement(By.xpath("//*[@class='wrap']/img"));
		
		if(forgotpasswordimagelogo.isDisplayed()==true)
		{
			System.out.println("in forgot password page Logo image is present");
			
		}
		else
		{
			System.out.println("in forgot password page Logo image is not present");

		}
	}
	
	//language list in forgot password page
	public void forgotpasswordlanguage() throws InterruptedException
	{
		
	WebElement forgotlanguagelist = driver.findElement(By.name("language"));
	Select option = new Select(forgotlanguagelist);
	option.selectByIndex(0);
	
	Thread.sleep(3000);
	
	}
	

	//setting values to forgot password page username field	
	
	public void forgotpasswordusernametextfield()
	{
		
		
		WebElement forgotpasswordusername=	driver.findElement(By.name("username"));
		
		forgotpasswordusername.sendKeys("divya@123");


		}
	
	// send reset password link button
	public void sendresetpasswordlinkbutton()
	{
		WebElement sendresetpasswordlinkbutton = driver.findElement(By.xpath("//*[@class='MuiContainer-root container-wrap MuiContainer-maxWidthXs']/form/div[2]/button"));
		
        System.out.println("Clicking on the send password link button");

        sendresetpasswordlinkbutton.click();
       
            System.out.println("password reset link send to your email account"+sendresetpasswordlinkbutton);
	
       
       
	}
	
	
	//sign in button in forgot password page
	public void signinbutton()
	{
WebElement forgotpasswordsigninbutton = driver.findElement(By.xpath("//*[@class='text-wrap']/p/span/a"));
		
        System.out.println("Clicking on the sign in button in forgot password page");

        forgotpasswordsigninbutton.click();
       
            System.out.println("navigating to the login page"+forgotpasswordsigninbutton);	
	}
	}
	
	
	
	
	
	
	










