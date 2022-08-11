package DNSCompregModule1Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	
	
	//verification of change username click from menu
	
	public void changeusernameclick()
	{
		
		WebElement changeusernameclick = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/ul/p"));
		changeusernameclick.click();
		System.out.println("change username clicked"+changeusernameclick);
		
		
		//verification of change username field
		WebElement changeusernamewindowusername= driver.findElement(By.xpath("//*[@role='presentation']/div/div[2]/form/input"));
		changeusernamewindowusername.sendKeys(Keys.CONTROL, Keys.chord("a")); //select all text in textbox
		changeusernamewindowusername.sendKeys(Keys.BACK_SPACE); //delete it
		changeusernamewindowusername.sendKeys("divyakm1988");
		System.out.println("new username entered in textfield"+changeusernamewindowusername);
		
		
		//verification of change username window submit button - commented to proceed with next tests

//		WebElement changeusernamewindowsubmit = driver.findElement(By.xpath("//*[@role='presentation']/div[3]/div[2]/form/div/button"));
//		changeusernamewindowsubmit.click();
//		System.out.println("submit button clicked"+changeusernamewindowsubmit);

		
		
		
		//verification of change username window close
		
		WebElement changeusernamewindowclosebutton = driver.findElement(By.xpath("//*[@role='presentation']/div[3]//*[name()='svg']"));

		changeusernamewindowclosebutton.click();
		System.out.println("participants change username close button is clicked "+changeusernamewindowclosebutton);
		
		
		WebElement dashboardnameandimageclick = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[2]/div/div[2]/div[2]/div/div/div/div/button/span"));
		dashboardnameandimageclick.click();
		System.out.println("user's name and image clicked for disappearing the menu"+dashboardnameandimageclick);
		
		
		dashboardnameandimageclick.click();
		System.out.println("user's name and image clicked for accessing the menu again for changing password"+dashboardnameandimageclick);

	}
	
		//verification of change password click from menu
	
	public void changepasswordclick() 
	{
		
		WebElement changepasswordclick = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/ul/p[2]"));
		changepasswordclick.click();
		System.out.println("change username clicked"+changepasswordclick);
		
		
		WebElement oldpassword = driver.findElement(By.xpath("//*[@id='transition-modal-description']/form/input"));
		oldpassword.sendKeys("divyakm1988");
		
		WebElement newpassword = driver.findElement(By.xpath("//*[@id='transition-modal-description']/form/input[2]"));
		newpassword.sendKeys("");
		
		
		WebElement confirmnewpassword = driver.findElement(By.xpath("//*[@id='transition-modal-description']/form/input[3]"));
		confirmnewpassword.sendKeys("");
		
		//verification of change password submit button
		
		WebElement changepasswordsubmit = driver.findElement(By.xpath("//*[@id='transition-modal-description']/form/div[4]/button"));
		changepasswordsubmit.click();
		System.out.println("change password submit button is clicked"+changepasswordsubmit);
		
		
		//verification of close button in change password window

		
		WebElement changepasswordwindowclose = driver.findElement(By.xpath("//*[@role='presentation']/div[3]//*[name()='svg']"));

		changepasswordwindowclose.click();
		System.out.println("participants change password close button is clicked "+changepasswordwindowclose);	
		
		
		WebElement dashboardnameandimageclick = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[2]/div/div[2]/div[2]/div/div/div/div/button/span"));
		dashboardnameandimageclick.click();
		System.out.println("user's name and image clicked for disappearing the menu"+dashboardnameandimageclick);
		
		
		
		
	}
	
	
	//verification of sign out  cancel click from menu
	
	public void usersignoutclickcancel() 
	{
		
		WebElement usersignoutclick1 = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/ul/p[3]"));
		usersignoutclick1.click();
		System.out.println("user signout link is clicked"+usersignoutclick1);
		
				
		WebElement usersignoutcancel = driver.findElement(By.xpath("//*[@role='presentation']/div/div[2]/p[2]"));
		usersignoutcancel.click();
		System.out.println("user signout cancel is clicked"+usersignoutcancel);

		
	}
	
	
	
	//verification of welcome image displayed or not
	
	public void hellowelcomeimage()
	{
		WebElement hellowelcomeimage = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div/div/div[2]/div/ul/li[3]/a/div/img"));
		hellowelcomeimage.click();
		System.out.println("welcome image is displayed"+hellowelcomeimage);
	}
	
	
	//verification of hello welcome click
	
	public void hellowelcomeclick()
	{
		WebElement hellowelcomeclick = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div/div/div[2]/div/ul/li[3]/a/div/div/div"));
		hellowelcomeclick.click();
		System.out.println("users welcome hello image clicked "+hellowelcomeclick);
	}
	
	
	//verification of sign out click from menu - commented for next tests
	
//	public void usersignoutclickyes()
//	{
//		
//		WebElement usersignoutclick2 = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/ul/p[3]"));
//		usersignoutclick2.click();
//		System.out.println("user signout link is clicked"+usersignoutclick2);
//		
//		
//		
//		
//		WebElement usersignoutyes = driver.findElement(By.xpath("//*[@role='presentation']/div/div[2]/p"));
//		usersignoutyes.click();
//		System.out.println("user signout yes is clicked"+usersignoutyes);
//
//		
//	}
	
}









