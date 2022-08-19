package DNSCompregModule1Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class comUserDashboardPage {

	WebDriver driver;
	
	
	
	public comUserDashboardPage(WebDriver driver)
	{
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	

	}
	
	
	//verification of overview menu click in user's page
	
	public void userdashboardoverviewclick() throws InterruptedException
	{
		Thread.sleep(1000);
		WebElement overviewclick = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div/div/div[2]/div/ul/li/a/span"));
		
		overviewclick.click();
		
		System.out.println("overview menu clicked in user dashboard page"+overviewclick);
	} 

	
	//verification of overview icon in user's page
	
		public void useroverviewicon()
		{
			WebElement useroverviewicon = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div/div/div[2]/div/ul/li/a/div"));
			if(useroverviewicon.isDisplayed()==true)
			{
				System.out.println("overview icon is displayed"+useroverviewicon);

			}

		}
	
		
		//verification of overview heading in user's page
		
		public void useroverviewheading()
		{
			WebElement overviewheading = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[2]/div/div/h3"));
			if(overviewheading.isDisplayed()==true)
			{
				System.out.println("overview heading is displayed"+overviewheading);

			}

		}

	
	//verification of upcoming events click in user's page
	
	public void userupcomingeventsclick() throws InterruptedException 
	{
		Thread.sleep(1000);
		WebElement upcomingeventsclick = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div/div"));
		
		upcomingeventsclick.click();
		
		System.out.println("upcoming events clicked in user dashboard page"+upcomingeventsclick);

	}
	
	
	//verification of upcoming events heading in user's page
	
			public void userupcomingeventsheading()
			{
				WebElement upcomingeventsheading = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div[2]/h3"));
				if(upcomingeventsheading.isDisplayed()==true)
				{
					System.out.println("upcoming events heading is displayed"+upcomingeventsheading);

				}

			}
			
			
			//verification of user's upcoming events details window
			
			public void upcomingeventsdetailswindow()
			{
				
				//verification of user's upcoming events details window display
				
				WebElement upcomingeventswindowdisplay = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div[2]/div"));
				if(upcomingeventswindowdisplay.isDisplayed()==true)
				{
					System.out.println("upcoming events details window is displayed"+upcomingeventswindowdisplay);

				}
				
				
				//verification of event name heading in upcoming events window
				
				
				WebElement upcomingeventseventname = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div[2]/div/div/div/div[2]/h5"));
				if(upcomingeventseventname.isDisplayed()==true)
				{
					System.out.println("event name is displayed in upcoming events window"+upcomingeventseventname);

				}
				
				
				//verification of event start and end date in upcoming events window
				
				
				WebElement upcomingeventstartenddate = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div[2]/div/div/div/div[2]/p"));
				if(upcomingeventswindowdisplay.isDisplayed()==true)
				{
					System.out.println("event start and end date is displayed upcoming events details window"+upcomingeventstartenddate);

				}
				
				
				//verification of event status in upcoming events window

				
				WebElement upcomingeventsstatus = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div[2]/div/div/div/div[2]/p[2]"));
				if(upcomingeventsstatus.isDisplayed()==true)
				{
					System.out.println("event status is displayed in upcoming events details window"+upcomingeventsstatus);

				}
				
				
				//verification of events count in upcoming events window

				
				WebElement upcomingeventscount = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div[2]/div/div/div/div[2]/div/div/h3"));
				if(upcomingeventscount.isDisplayed()==true)
				{
					System.out.println("event counts is displayed in upcoming events details window"+upcomingeventscount);

				}
				
				
				//verification of flag icon in upcoming events window

				
				WebElement upcomingeventsflagicon = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div[2]/div/div/div/div[2]/div/div//*[name()='svg']"));
				if(upcomingeventsflagicon.isDisplayed()==true)
				{
					System.out.println("flag icon is displayed upcoming events details window "+upcomingeventsflagicon);

				}
				
				
				//verification of total count of participants in upcoming events window

				WebElement upcomingeventsparticipantscount = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div[2]/div/div/div/div[2]/div/div[2]/h3"));
				if(upcomingeventsparticipantscount.isDisplayed()==true)
				{
					System.out.println("participants total count is displayed upcoming events details window "+upcomingeventsparticipantscount);

				}
				
				
				//verification of participants icon in upcoming events window

				WebElement upcomingeventsparticipantsicon = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div[2]/div/div/div/div[2]/div/div[2]//*[name()='svg']"));
				if(upcomingeventsparticipantsicon.isDisplayed()==true)
				{
					System.out.println("participants icon is displayed upcoming events details window "+upcomingeventsparticipantsicon);

				}
	}
			
			
		
			//verification of past events click in user's page
			
			public void pasteventsclick() throws InterruptedException
			{
				
					Thread.sleep(2000);
					WebElement pasteventsclick = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[2]/div"));
					
					pasteventsclick.click();
					
					System.out.println("past events clicked in user dashboard page"+pasteventsclick);

			}
			
			
			
			//verification of change username in the dashboard
			
			
			public void dashboardchangeusername() throws InterruptedException
			{
				
				//verification of change username in dashboard
				
				Thread.sleep(2000);
				WebElement dashboardchangeusernameclick = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[3]/div"));
				dashboardchangeusernameclick.click();
				System.out.println("parcipants change username in dashboard is clicked "+dashboardchangeusernameclick);

				
				
				//verification of change username window heading
				
				WebElement changeusernamewindowheading = driver.findElement(By.xpath("//*[@role='presentation']/div/div/h2"));
				if(changeusernamewindowheading.isDisplayed()==true)
				{
					System.out.println("change username heading is displayed "+changeusernamewindowheading);

				}
				
				
				
				//verification of change username window username textfield
				
				
				Thread.sleep(1000);
				WebElement changeusernamewindowusernamefield= driver.findElement(By.xpath("//*[@role='presentation']/div/div[2]/form/input"));
				changeusernamewindowusernamefield.sendKeys(Keys.CONTROL, Keys.chord("a")); //select all text in textbox
				changeusernamewindowusernamefield.sendKeys(Keys.BACK_SPACE); //delete it
				changeusernamewindowusernamefield.sendKeys("divyakm1988");
				System.out.println("new username entered in textfield"+changeusernamewindowusernamefield);
				
				
				
				//verification of change username window submit button - commented to proceed with next tests

//				WebElement changeusernamewindowsubmit = driver.findElement(By.xpath("//*[@role='presentation']/div[3]/div[2]/form/div/button"));
//				changeusernamewindowsubmit.click();
//				System.out.println("submit button clicked"+changeusernamewindowsubmit);

				
				
				//verification of change username window close
				
				Thread.sleep(1000);
				WebElement changeusernamewindowclose = driver.findElement(By.xpath("//*[@role='presentation']/div[3]//*[name()='svg']"));

				changeusernamewindowclose.click();
				System.out.println("participants change username close button is clicked "+changeusernamewindowclose);	
				
			}
			
			
			
			
			
			//verification of user profile details
			public void dashboarduserprofiledetails() throws InterruptedException
			{
				
				//verification of user's firstname
				WebElement dashboardusername = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[2]/div/div[2]/div[2]/div/div/div/div/button/span/h6"));
				if(dashboardusername.isDisplayed()==true)
				{
					System.out.println("user's firstname is displayed in dashboard "+dashboardusername);

				}
				
				
				//verification of user's profile image

				
				WebElement dashboardprofileimage = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[2]/div/div[2]/div[2]/div/div/div/div/button/span/img"));
				if(dashboardprofileimage.isDisplayed()==true)
				{
					System.out.println("user's profile image is displayed in dashboard  "+dashboardprofileimage);

				}
				
				
				//verification of user's firstname and image click
				
				Thread.sleep(1000);
				WebElement dashboardnameandimageclick = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[2]/div/div[2]/div[2]/div/div/div/div/button/span"));
				dashboardnameandimageclick.click();
				System.out.println("user's name and image clicked"+dashboardnameandimageclick);
				
				
			}	
			
			
			
			//verification of participant profile click
			public void participantprofileclick() throws InterruptedException
			{
				
				Thread.sleep(1000);
				WebElement participantprofileclick = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[2]/div/div[2]/div[2]/div/div/div/div/div/div/ul/a"));
				participantprofileclick.click();
				System.out.println("participants profile link is clicked and redirected to the page"+participantprofileclick);

			}
			
			
			
			
			
			
			//verification of participant details
			
			public void participantprofiledetailsfromprofileclick() throws InterruptedException
			{
				
				//verification of firstname field
				
				WebElement participantfirstname = driver.findElement(By.xpath("//*[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-1']/div/div/div/form/div[2]/div/div/input"));			
			
				
				participantfirstname.sendKeys(Keys.CONTROL, Keys.chord("a")); //select all text in textbox
				participantfirstname.sendKeys(Keys.BACK_SPACE); //delete it
				participantfirstname.sendKeys("Divya");
				System.out.println("firstname textfield edited"+participantfirstname);
				
				
				//verification of lastname field
				
				WebElement participantlastname = driver.findElement(By.name("lastName"));
				if(participantlastname.isEnabled()==true)
				{
					System.out.println("lastname textfield editable"+participantlastname);

				}

				
				//verification of username field
				

				WebElement participantusername = driver.findElement(By.name("username"));
				if(participantusername.isEnabled()==true)
				{
					System.out.println("username textfield editable"+participantusername);

				}
				
				
				//verification of email field
				
				
				WebElement participantemail = driver.findElement(By.name("email"));
				if(participantemail.isEnabled()==true)
				{
					System.out.println("email textfield editable"+participantemail);

				}
				
				
				//verification of phone field
				
				
				WebElement participantphone = driver.findElement(By.name("phone"));
				if(participantphone.isEnabled()==true)
				{
					System.out.println("phone textfield editable"+participantphone);

				}
				
				
				//verification of Address Line 1 field
				
				WebElement participantaddress = driver.findElement(By.name("address1"));
				if(participantaddress.isEnabled()==true)
				{
					System.out.println("Address Line 1 textfield editable"+participantaddress);

				}
				
				
				//verification of Street field
				
				WebElement participantstreet = driver.findElement(By.name("street"));
				if(participantstreet.isEnabled()==true)
				{
					System.out.println("street textfield editable"+participantstreet);

				}
				
				
				//verification of Postcode field
				
				WebElement participantpostcode = driver.findElement(By.name("postcode"));
				if(participantpostcode.isEnabled()==true)
				{
					System.out.println("postcode textfield editable"+participantpostcode);

				}
				
				
				//verification of City field
				
				WebElement participantcity = driver.findElement(By.name("city"));
				if(participantcity.isEnabled()==true)
				{
					System.out.println("city textfield editable"+participantcity);

				}
				
				
				//verification of State field
				
				WebElement participantstate = driver.findElement(By.name("state"));
				if(participantstate.isEnabled()==true)
				{
					System.out.println("state textfield editable"+participantstate);

				}
				
				
				//verification of Country field
				
				WebElement participantcountry = driver.findElement(By.name("country"));
				if(participantcountry.isEnabled()==true)
				{
					System.out.println("country textfield editable"+participantcountry);

				}
				
				
				//verification of Facebook URL field
				
				WebElement participantfacebookurl = driver.findElement(By.name("facebookUrl"));
				if(participantfacebookurl.isEnabled()==true)
				{
					System.out.println("facebook url textfield editable"+participantfacebookurl);

				}
				
				
				//verification of Instagram URL field
				
				WebElement participantinstagram = driver.findElement(By.name("instagramUrl"));
				participantinstagram.sendKeys(Keys.CONTROL, Keys.chord("a")); //select all text in textbox
				participantinstagram.sendKeys(Keys.BACK_SPACE); //delete it
				participantinstagram.sendKeys("adasdsad");
				System.out.println("instagram url textfield edited"+participantinstagram);
				
				
				
				//verification of submit click
				
				Thread.sleep(2000);
				WebElement participantsubmit = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[5]/div/div/div/form/div[2]/div[7]/div/div/button"));
				participantsubmit.click();
				System.out.println("submit button clicked"+participantsubmit);
				
			}
				
			
}







