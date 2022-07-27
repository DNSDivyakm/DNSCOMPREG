package DNSCompregPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class comOrganiserDetailsPage {

	WebDriver driver;

	
	
By companyname = By.name("companyname");
By username = By.name("username");
By emailid = By.name("email");
By phonenumber = By.name("phone");
By addressline1 = By.name("address1");
By street = By.name("street");
By postcode = By.name("postcode");
By city = By.name("city");
By state = By.name("state");
By country = By.name("country");
By facebookurl = By.name("facebookUrl");
By instagramurl = By.name("instagramUrl");
By websiteurl = By.name("webciteUrl");

public comOrganiserDetailsPage(WebDriver driver)
	{
		this.driver=driver;
		

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		

		
	}

	
	//verification of organiser details button click
	
	public void organiserdetailsclick()
	{
		WebElement organiserdetailsclick = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div[2]/div/div[2]/div[2]/a[3]"));
		organiserdetailsclick.click();
		System.out.println("organiser details  button is clicked"+organiserdetailsclick);

	}
	
	//verification of organiser name 
	public void organiserpageorganisername()
	{
		WebElement organisername = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div/h5"));
		if(organisername.isDisplayed()==true)
		{
			System.out.println("organiser name displayed"+organisername);
		}

			
		}
		
		//verification of member since date
		public void organisermembersincedate()
		{
			WebElement membersince = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div/p"));
			if(membersince.isDisplayed()==true)
			{
				System.out.println("member since date displayed"+membersince);

				
			}
			
		
	}
		
		//verification of events count in table
		public void tableevents()
		{
			WebElement eventscountintable = driver.findElement(By.xpath("//*[@class='MuiTable-root MuiTable-stickyHeader']/tbody/tr"));
			if(eventscountintable.isDisplayed()==true)
			{
				System.out.println("events displayed in table"+eventscountintable);

			}
			
		}

			
			//verification of event count is displayed in organiser page
			
			public void eventscountandnameorganiser()
			{
				WebElement eventscountinorganiserpage = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[2]/div/h4"));
				if(eventscountinorganiserpage.isDisplayed()==true)
				{
					System.out.println("total number of events is displayed"+eventscountinorganiserpage);

				}

				WebElement eventsnameorganiserpage = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[2]/div/h6"));
				if(eventsnameorganiserpage.isDisplayed()==true)
				{
					System.out.println("events label is displayed"+eventsnameorganiserpage);

				}

				
			

			
		}
			
			//verification of rally count is displayed in organiser page
			
			public void ralliescountandnameorganiser()
			{
				WebElement ralliescountinorganiserpage = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[2]/div[2]/h4"));
				if(ralliescountinorganiserpage.isDisplayed()==true)
				{
					System.out.println("total number of rallies is displayed"+ralliescountinorganiserpage);

				}

				WebElement ralliesnameorganiserpage = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[2]/div[2]/h6"));
				if(ralliesnameorganiserpage.isDisplayed()==true)
				{
					System.out.println("rallies label is displayed"+ralliesnameorganiserpage);

				}
	
			}
			
			//verification of participants count is displayed in organiser page
			
			public void participantscountandnameorganiser()
			{
				WebElement participantscountinorganiserpage = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[2]/div[2]/h4"));
				if(participantscountinorganiserpage.isDisplayed()==true)
				{
					System.out.println("total number of participants is displayed"+participantscountinorganiserpage);

				}

				WebElement participantsnameorganiserpage = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[2]/div[2]/h6"));
				if(participantsnameorganiserpage.isDisplayed()==true)
				{
					System.out.println("participants label is displayed"+participantsnameorganiserpage);

				}
	
			}
			
			//verification of profile button click in organiser page
			
			public void organiserprofileclick()
			{
			    JavascriptExecutor js = (JavascriptExecutor) driver;

				WebElement organiserprofilebutton = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[3]/div[2]/button[2]"));
				organiserprofilebutton.click();
				System.out.println("organiser profile button clicked"+organiserprofilebutton);
				
		        js.executeScript("window.scrollBy(0,1000)");



				
			}
			
			//verification of organiser details fields displayed and editable or not
			public void organiserdetailsdisplay()
			{
				driver.findElement(companyname).isDisplayed();
				driver.findElement(username).isDisplayed();
				driver.findElement(emailid).isDisplayed();
				driver.findElement(phonenumber).isDisplayed();
				driver.findElement(addressline1).isDisplayed();
				driver.findElement(street).isDisplayed();
				driver.findElement(postcode).isDisplayed();
				driver.findElement(city).isDisplayed();
				driver.findElement(state).isDisplayed();
				driver.findElement(country).isDisplayed();
				driver.findElement(facebookurl).isDisplayed();
				driver.findElement(instagramurl).isDisplayed();
				driver.findElement(websiteurl).isDisplayed();


				
			}
			
			//verification of organiser details submit button
			public void organiserdetailssubmitbutton()
			{

				WebElement organiserdetailssubmit = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[5]/div/div/div/form/div[2]/div[8]/div/div/button"));
				organiserdetailssubmit.click();

				System.out.println("organiser details submit button clicked"+organiserdetailssubmit);
	
				
			}

			
			//verification of organiser updated successfully animator
			public void organiserupdatedanimator()
			{
				WebElement organiseranimator = driver.findElement(By.xpath("//*[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success']"));
				organiseranimator.click();
				System.out.println("organiser updated successfully animator clicked"+organiseranimator);

			}
			
			
			//verification of organiser contact add new button
			public void organisercontactaddnewbutton()
			{
				WebElement organanisercontactaddnew = driver.findElement(By.xpath("//*[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-1']/div[2]/div/div/button"));
				organanisercontactaddnew.click();
				System.out.println("organiser contact add new button is clicked"+organanisercontactaddnew);

			}
			
			//verification of image in organiser details
			public void organiserdetailsimageclick()
			{
				WebElement organiserdetailsimage = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[5]/div/div/div/form/div/div/div/img"));
				if(organiserdetailsimage.isEnabled()==true)
				{
					System.out.println("organiser details image is enabled"+organiserdetailsimage);
	
				}
				
			}
			
		
	
}
			
			
			
			

	 
	
			
			
			
	 
	 
	








