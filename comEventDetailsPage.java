

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

			}
	 
			
			
	
	 
	 
	 
	 
}









