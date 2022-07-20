

package DNSCompregPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class comEventDetailsPage {

	WebDriver driver;
	

	public comEventDetailsPage(WebDriver driver)
	{
		this.driver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	}


	
	//checking value of event details name displayed is correct or not 
		public void eventdetailsnamedisplay()
		{
			WebElement eventdetailseventname=driver.findElement(By.xpath("//*[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-3']/div/input"));
			System.out.println(eventdetailseventname);
             if(eventdetailseventname.isDisplayed()==true)
					{
				System.out.println("event details name is displayed");
					}
             else
             {
 				System.out.println("event details name is not displayed");

             }
	

		}
		
		//verification of event type dropdown 
		public void eventtypedropdown()
		{
			
			Select eventtypedropdown = new Select(driver.findElement(By.name("eventType")));

			eventtypedropdown.selectByIndex(2);
			System.out.println("eventtype selected"+eventtypedropdown);

			
		}
		
		//verification of event organiser combobox
		public void eventorganiserfield()
		{
			
			WebElement eventorganiser = driver.findElement(By.xpath("//*[@class='MuiAutocomplete-root MuiAutocomplete-hasClearIcon MuiAutocomplete-hasPopupIcon']/div/div"));
			eventorganiser.click();
			System.out.println("event organiser clicked"+eventorganiser);
			
		}
		
		
		//verification of organiser contact dropdown 
		public void orgnisercontactdropdown()
		{
			
			Select organisercontact = new Select(driver.findElement(By.xpath("//*[@class='MuiBox-root jss148 jss133']/div[2]/div[2]/select")));
			organisercontact.selectByIndex(1);
			System.out.println("organisercontact selected"+organisercontact);
		}
	
		
		 
	 //verification of details button click in event page
	 public void detailsbuttonineventdetailspage()
	 {
		 WebElement detailsbtn = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[3]/div[2]/button[2]"));
		 detailsbtn.click();
		 System.out.println(" details button in events clicked"+detailsbtn);

	 }
	 
	 
	//checking value of enquiry contact displayed is correct or not 
			public void enquirycontactdisplay()
			{
				WebElement enquirycontact=driver.findElement(By.xpath("//*[@class='MuiBox-root jss148 jss133']/div[2]/div[3]/input"));
				System.out.println(enquirycontact);
	             if(enquirycontact.isDisplayed()==true)
						{
					System.out.println("enquiry contact is displayed");
						}
	             else
	             {
	 				System.out.println("enquiry contact is not displayed");

	             }
		

			}
			
			
			//checking value of enquiry email displayed is correct or not 
			public void enquiryemaildisplay()
			{
				WebElement enquiryemail=driver.findElement(By.xpath("//*[@class='MuiBox-root jss148 jss133']/div[2]/div[4]/input"));
				System.out.println(enquiryemail);
	             if(enquiryemail.isDisplayed()==true)
						{
					System.out.println("enquiry email is displayed");
						}
	             else
	             {
	 				System.out.println("enquiry email is not displayed");

	             }
		

			}
			
			
			//setting values to venue field
			public void venueeventdetails()
			{
				WebElement venue=driver.findElement(By.xpath("//*[@class='MuiBox-root jss148 jss133']/div[3]/div/input"));
				venue.sendKeys("dfsddsdf");
			}
			
			
			//setting values to event details field
			public void eventdetailsfield()
			{
				WebElement eventdetails=driver.findElement(By.xpath("//*[@class='MuiBox-root jss148 jss133']/div[3]/div[3]/textarea"));
				eventdetails.sendKeys("bsdbsndmbbnmndsbfmnsdbfnmdsbfmndbmnsdbfmnsdbmnsdmbd");
        		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	


			}
	 
			
			//verification of start date
			public void eventdetailsstartdate()
			{
				WebElement startdate=driver.findElement(By.xpath("//*[@class='MuiBox-root jss148 jss133']/div/div[3]/div"));
                if(startdate.isDisplayed()==true)
                {
                	System.out.println("startdate displayed 21/07/2022");
                }
        		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	

                
			}
	 
			
			//verification of end date
			public void eventdetailsenddate()
			{
				WebElement enddate=driver.findElement(By.xpath("//*[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-3']/div[4]/div/div/input"));
                if(enddate.isDisplayed()==true)
                {
                	System.out.println("enddate displayed");
                }
        		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	

			}
			

			//verification of last date of registration
			public void eventdetailslastedate()
			{
		
				WebElement lastdate=driver.findElement(By.xpath("//*[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-3']/div[4]/div/div/input"));
                if(lastdate.isDisplayed()==true)
                {
                	System.out.println("lastdate displayed");
                }
        		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	

                
       
			}
			
			//verification of website field
			
			public void websiteeventdetails()
			{
				WebElement website=driver.findElement(By.xpath("//*[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-1']/div/div/div/form/div[2]/div[3]/div[4]/input"));
				if(website.isDisplayed()==true)
                {
                	System.out.println("website displayed");
                }
        		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	

			}
			
				//verification of facebook url field
			
			public void facebookeventdetails()
			{
				WebElement facebook=driver.findElement(By.xpath("//*[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-1']/div/div/div/form/div[2]/div[4]/div/input"));
				if(facebook.isDisplayed()==true)
                {
                	System.out.println("facebookurl displayed");
                }
			}
				//verification of instagram url field
			
			public void instagrameventdetails()
			{
				WebElement instagram=driver.findElement(By.xpath("//*[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-1']/div/div/div/form/div[2]/div[4]/div[2]/input"));
				if(instagram.isDisplayed()==true)
                {
                	System.out.println("instagramurl displayed");
                }
			}
			
				//verification of memo field
			
			public void memoeventdetails()
			{
				WebElement memo=driver.findElement(By.xpath("//*[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-1']/div/div/div/form/div[2]/div[4]/div[3]/textarea"));
				if(memo.isDisplayed()==true)
                {
                	System.out.println("memo displayed");
                }		
				}
			
			
			//verification of Add new contact link
			public void addnewcontactlink()
			{
				WebElement addnewcontact = driver.findElement(By.xpath("//*[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-1']/div/div/div/form/div[2]/div[2]/div[2]/div/a"));
				addnewcontact.click();
				System.out.println("Add new contact link clicked and window came"+addnewcontact);
			}
			
			
			
			//verification of add new organiser contact window
			public void addneworganiserwindow()
			{
				WebElement addneworganiserfirstname= driver.findElement(By.xpath("//*[@id='transition-modal-description']/form/div/div[2]/div/input"));		
				addneworganiserfirstname.sendKeys("org1");
	
				WebElement addneworganiserlastname= driver.findElement(By.xpath("//*[@id='transition-modal-description']/form/div/div[2]/div[2]/input"));
				addneworganiserlastname.sendKeys("fsdfsdf");
				
				WebElement addneworganiseremail= driver.findElement(By.xpath("//*[@id='transition-modal-description']/form/div/div[3]/div/input"));
				addneworganiseremail.sendKeys("rrrr@nbsdf.com");
				
				WebElement addneworganiserphone= driver.findElement(By.xpath("//*[@id='transition-modal-description']/form/div/div[3]/div[2]/input"));
				addneworganiserphone.sendKeys("3424242423");
				
				WebElement addneworganiserdesignation= driver.findElement(By.xpath("//*[@id='transition-modal-description']/form/div/div[4]/div/input"));
				addneworganiserdesignation.sendKeys("vvxvxv");
				
				WebElement addneworganisermemo= driver.findElement(By.xpath("//*[@id='transition-modal-description']/form/div/div[4]/div[2]/input"));
				addneworganisermemo.sendKeys("dsfsdfsdfsf");
				
				WebElement addneworganisersubmit= driver.findElement(By.xpath("//*[@id='transition-modal-description']/form/div/div[5]/div/div/button"));
				addneworganisersubmit.click();
				System.out.println("add new organiser contact link clicked"+addneworganisersubmit);

			}
			
			
			//verification of add file button 
			public void eventdetailsaddfilebutton()
			{
				WebElement addfilebutton = driver.findElement(By.xpath("//*[@class='MuiBox-root jss148 jss133']/div[5]/div/button"));
				addfilebutton.click();
				System.out.println("add file button clicked"+addfilebutton);
		
			}

			}
			
		

	 
	
			
			
			
	 
	 
	







