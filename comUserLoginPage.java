package DNSCompregModule1Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class comUserLoginPage {

	WebDriver driver;
	
	By comloginusername= By.name("username");
	By comloginpassword=By.name("password");
	
	

	
	public comUserLoginPage(WebDriver driver)
	{
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	

	}
	
	//setting values for user login fields
	public void setfieldvaluescomuserlogin(String username , String password) 
	{
		
		driver.findElement(comloginusername).sendKeys(username);
		
		driver.findElement(comloginpassword).sendKeys(password);
		

	}
	
	//title verification
	public void compreguserlogintitleverification()
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
	public void compreguserloginimgdisplay()
	{
		
		WebElement userloginimage = driver.findElement(By.xpath("//*[@class='auth-layout']/div"));
		if(userloginimage.isDisplayed()==true)
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
			

			WebElement compreglogoimage = driver.findElement(By.xpath("//*[@class='auth-layout']/div/div[2]/img"));
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
	public void compreguserloginlanguage()
	{

		WebElement option1 = driver.findElement(By.xpath("//*[@class='select']/option[3]"));


	System.out.println("language deutsch is selected from the options"+option1);
	
	WebElement option2 = driver.findElement(By.xpath("//*[@class='select']/option[2]"));


	System.out.println("language français is selected from the options"+option2);
	
	WebElement option3 = driver.findElement(By.xpath("//*[@class='select']/option[1]"));


	System.out.println("language english is selected from the options"+option3);
	


	}
	

	
		
	// login button click
	public void login()
	{
		WebElement comloginbutton = driver.findElement(By.xpath("//*[@class='MuiContainer-root container-wrap MuiContainer-maxWidthXs']/form/div[5]/button"));
		
	
		comloginbutton.click();
		
       System.out.println("Login button clicked successfully and redirected to user login page"+comloginbutton);
		
	}
	
	//verification of  login successfully animator
	public void animatorclick()
	{
		WebElement animatorclick = driver.findElement(By.xpath("//*[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success']"));
		animatorclick.click();
		System.out.println("animator clicked"+animatorclick);
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	

		
	}
	

	

	
}









