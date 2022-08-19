package DNSCompregModule1Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class comEventdetailsfromUserLoginPage {

	WebDriver driver;
	
	
	

	
	public comEventdetailsfromUserLoginPage(WebDriver driver)
	{
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	

	}
	
	
			//verification of user dashboard upcoming events event details click	
	
			public void eventdetailsclick() throws InterruptedException
			{
				Thread.sleep(1000);
				WebElement eventdetailsclick = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div[2]/div/div/div[2]/a[1]"));
				eventdetailsclick.click();
				System.out.println("event details clicked"+eventdetailsclick);
			}
			
	
				//verification of events quick information
		
				public void eventsinfoeventdetailsclick() throws InterruptedException
				{
			
				//verification of events quick information mail id
		
				WebElement eventsinfomailid = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/a"));
				
				if(eventsinfomailid.isDisplayed()==true)
				{
					System.out.println("events information maild id is displayed"+eventsinfomailid);
		
				}
			
		
				//verification of events quick information phone number
		
				
				WebElement eventsinfophonenumber = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/a[2]"));
				
				if(eventsinfophonenumber.isDisplayed()==true)
				{
					System.out.println("events information phone number is displayed"+eventsinfophonenumber);
		
				}
			
				//verification of events quick information event status displayed or not
				
				WebElement eventsinfoeventstatus = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[4]/div[2]/p"));
					
				if(eventsinfoeventstatus.isDisplayed()==true)
				{
					System.out.println("events information event status is displayed"+eventsinfoeventstatus);
		
				}
			
				//verification of events quick information participant status displayed or not
		
				WebElement eventsinfoparticipantstatus = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[5]/div[2]/p"));
				
				if(eventsinfoparticipantstatus.isDisplayed()==true)
				{
					System.out.println("events information participant status is displayed"+eventsinfoparticipantstatus);
		
				}
		
		
				//verification of events quick information start date displayed or not

				WebElement eventsinfostartdate = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[6]/div/div"));
				
				if(eventsinfostartdate.isDisplayed()==true)
				{
					System.out.println("events information startdate is displayed"+eventsinfostartdate);

				}
				
				//verification of events quick information rally count displayed or not

				WebElement eventsinforallycount = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[6]/div[2]/div"));
				
				if(eventsinforallycount.isDisplayed()==true)
				{
					System.out.println("events information rally count is displayed"+eventsinforallycount);

				}
		
		       //verification of events quick information venue displayed or not
				
				WebElement eventsinfovenue = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[6]/div[3]/div"));
				
				if(eventsinfovenue.isDisplayed()==true)
				{
					System.out.println("events information venue is displayed"+eventsinfovenue);

				}
				
				//verification of events quick information participants count displayed or not
				
				WebElement eventsinfoparticipantscount = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[6]/div[3]/div"));
				
				if(eventsinfoparticipantscount.isDisplayed()==true)
				{
					System.out.println("events information participants count is displayed"+eventsinfoparticipantscount);

				}

				
				//verification of events quick information participants count displayed or not
				
				WebElement eventsinforightimage= driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div[2]/img"));
				
				if(eventsinforightimage.isDisplayed()==true)
				{
					System.out.println("events information right side image is displayed"+eventsinforightimage);

				}

				
				//verification of by organiser click from events info
				
				Thread.sleep(2000);
				WebElement eventsinfobyorganiserclick = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[2]/p/a/span"));
				eventsinfobyorganiserclick.click();
				System.out.println("by organiser from events is clicked"+eventsinfobyorganiserclick);
				
				Thread.sleep(1000);
				driver.navigate().back();
			
	}
	
				
				//verification of events full details from event details click of dashboard page
	
	
				public void eventsfulldetailsfromeventdetailstab() throws InterruptedException
				{
					
					//verification of event details event name 
					
					WebElement eventname= driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[4]/div[2]/div"));
					if(eventname.isDisplayed()==true)
					{
						System.out.println("event name is displayed"+eventname);

					}
					
					//verification of event details event type 
					
					WebElement eventtype= driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[4]/div[2]/div[2]"));
					if(eventtype.isDisplayed()==true)
					{
						System.out.println("event type is displayed"+eventtype);

					}
					
					
					//verification of event details start date 
					
					WebElement startdate= driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[4]/div[2]/div[3]"));
					if(startdate.isDisplayed()==true)
					{
						System.out.println("start date is displayed"+startdate);

					}
					
					
					//verification of event details end date 
					
					WebElement enddate= driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[4]/div[2]/div[4]"));
					if(enddate.isDisplayed()==true)
					{
						System.out.println("end date is displayed"+enddate);

					}
					

					
					//verification of event details event organiser 
					
					WebElement eventorganiser= driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[4]/div[2]/div[5]"));
					if(eventorganiser.isDisplayed()==true)
					{
						System.out.println("event organiser is displayed"+eventorganiser);

					}
					
					//verification of event details organiser contact 
					
					WebElement organisercontact= driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[4]/div[2]/div[6]"));
					if(organisercontact.isDisplayed()==true)
					{
						System.out.println("organiser contact is displayed"+organisercontact);

					}
					
					
					//verification of event details enquiry number 
					
					WebElement enquirynumber= driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[4]/div[2]/div[7]"));
					if(enquirynumber.isDisplayed()==true)
					{
						System.out.println("enquiry number is displayed"+enquirynumber);

					}
					
					
					//verification of event details enquiry email 
					
					WebElement enquiryemail= driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[4]/div[2]/div[8]"));
					if(enquiryemail.isDisplayed()==true)
					{
						System.out.println("enquiry email is displayed"+enquiryemail);

					}
					
					
					//verification of event details venue 
					
					WebElement venue= driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[4]/div[2]/div[9]"));
					if(venue.isDisplayed()==true)
					{
						System.out.println("venue is displayed"+venue);

					}
					
					
					//verification of event details last date of registration 
					
					WebElement lastdateofregistration= driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[4]/div[2]/div[10]"));
					if(lastdateofregistration.isDisplayed()==true)
					{
						System.out.println("last date of registration is displayed"+lastdateofregistration);

					}
					
					
					//verification of event details website
					
					WebElement website= driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[4]/div[2]/div[11]"));
					if(website.isDisplayed()==true)
					{
						System.out.println("website is displayed"+website);

					}
					
					
					//verification of event details instagram url 
					
					WebElement instagramurl= driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[4]/div[2]/div[12]"));
					if(instagramurl.isDisplayed()==true)
					{
						System.out.println("instagram url is displayed"+instagramurl);

					}
					
					
					//verification of event details facebook url
					
					WebElement facebookurl= driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[4]/div[2]/div[13]"));
					if(facebookurl.isDisplayed()==true)
					{
						System.out.println("facebook url is displayed"+facebookurl);

					}
					
					
					//verification of event details memo 
					
					WebElement memo= driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[4]/div[2]/div[14]"));
					if(memo.isDisplayed()==true)
					{
						System.out.println("event name is displayed"+memo);

					}
					
					
					
					//verification of event details uploaded files
					
					WebElement uploadedfiles= driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[4]/div[2]/div[15]"));
					if(uploadedfiles.isDisplayed()==true)
					{
						System.out.println("uploaded files is displayed"+uploadedfiles);

					}
					
					
					
				}
				
				
				//verification of event forms tab click

				
				public void eventformstabclick() throws InterruptedException
				{
					Thread.sleep(3000);
					WebElement eventformstabclick= driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[4]/div/div/h3[3]"));
					eventformstabclick.click();
					System.out.println("event forms tab is clicked"+eventformstabclick);

					
					
				}
				
				
				//verification of event form elements
				
				public void eventformselements() throws InterruptedException
				{
					
					//verification of form label
					Thread.sleep(2000);
					WebElement eventformslabelfillup= driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[4]/div[2]/div/div/div/h4"));
					if(eventformslabelfillup.isDisplayed()==true)
					{
						System.out.println("event forms label is displayed"+eventformslabelfillup);

					}
					
					
				}

				
				//verification of event forms tab click
				
				
				public void eventdetailstabclick() throws InterruptedException
				{
					Thread.sleep(3000);
					WebElement eventdetailstabclick= driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[4]/div/div/h3[1]"));
					eventdetailstabclick.click();
					System.out.println("event details tab is clicked"+eventdetailstabclick);
					
					
				//verification of  event details table uploaded files click
					
					Thread.sleep(2000);
					WebElement eventdetailstableuploadedfilesclick = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[4]/div[2]/div[15]/div[2]"));
					eventdetailstableuploadedfilesclick.click();
					System.out.println("event details uploaded files is clicked"+eventdetailstableuploadedfilesclick);

					
					//verification of event details uploaded files click window

					Thread.sleep(2000);
					WebElement eventdetailsuploadedfilesclickwindow = driver.findElement(By.xpath("//*[@role='presentation']/div[3]/p[1]/div"));
					if(eventdetailsuploadedfilesclickwindow.isDisplayed()==true)
					{
						System.out.println("event details uploaded files window is displayed"+eventdetailsuploadedfilesclickwindow);

					}
					
					
					//verification of uploaded files click window field file name disabled or not
					
					
					WebElement eventdetailsuploadedfileswindowdisabledfilename = driver.findElement(By.xpath("//*[@role='presentation']/div[3]/p[1]/div/div/div/input"));
					if(eventdetailsuploadedfileswindowdisabledfilename.isEnabled()==false)
					{
						System.out.println("event details uploaded files window file name field is disabled"+eventdetailsuploadedfileswindowdisabledfilename);

					}
					
					
					//verification of uploaded files click window field dropdown disabled or not

					
					WebElement eventdetailsuploadedfileswindowdisabledropdown = driver.findElement(By.xpath("//*[@role='presentation']/div[3]/p[1]/div/div/div[2]/select/option[1]"));
					if(eventdetailsuploadedfileswindowdisabledropdown.isEnabled()==false)
					{
						System.out.println("event details uploaded files window dropdown field is disabled"+eventdetailsuploadedfileswindowdisabledropdown);

					}
					
					
					
					
					//verification of uploaded files click window field eye icon

					Thread.sleep(2000);
					WebElement eventdetailsuploadedfileswindoweyeicon = driver.findElement(By.xpath("//*[@role='presentation']/div[3]/p[1]/div/div/div[4]/div//*[name()='svg']"));
					eventdetailsuploadedfileswindoweyeicon.click();
					System.out.println("event details uploaded files window eye icon is clicked"+eventdetailsuploadedfileswindoweyeicon);

			
				}
}









