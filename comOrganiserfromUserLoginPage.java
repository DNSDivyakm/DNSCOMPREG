package DNSCompregModule1Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class comOrganiserfromUserLoginPage {

	WebDriver driver;
	
	
	public comOrganiserfromUserLoginPage(WebDriver driver)
	{
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	

	}
	
	//verification of user dashboard upcoming events organiser details click
	
	public void organiserdetailsclick() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement organiserdetails = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div[2]/div/div/div[2]/a[3]"));
		organiserdetails.click();
		System.out.println("organiser details clicked"+organiserdetails);

	}
	
	
	//verification of total events ,rallies , participants count display
	
	public void organiserdetailstotalcountdisplay()
	{
		WebElement totaleventscount = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[2]/div/h4"));
		if(totaleventscount.isDisplayed()==true)
		{
			System.out.println("total events count is displayed"+totaleventscount);

		}
		
		WebElement totalralliescount = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[2]/div[2]/h4"));
		if(totalralliescount.isDisplayed()==true)
		{
			System.out.println("total rallies count is displayed"+totalralliescount);

		}
		
		WebElement totalparticipantscount = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[2]/div[3]/h4"));
		if(totalparticipantscount.isDisplayed()==true)
		{
			System.out.println("total participants count is displayed"+totalparticipantscount);

		}
				
	}
	
	
	//verification of mail id and phone number display
	
	public void mailidandphonedisplay()
	{
		WebElement organiserdetailsmailid = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[3]/div/a"));
		if(organiserdetailsmailid.isDisplayed()==true)
		{
			System.out.println("organiser details mailid is displayed"+organiserdetailsmailid);

		}
		
		WebElement organiserdetailsphonenumber = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[3]/div/a[2]"));
		if(organiserdetailsphonenumber.isDisplayed()==true)
		{
			System.out.println("organiser details phone number is displayed"+organiserdetailsphonenumber);

		}
	}
	
	//verification of organiser details fields displayed or not
	public void organiserdetailsfieldsdisplay()
	{
		
		WebElement companyname = driver.findElement(By.name("companyname"));
		if(companyname.isDisplayed()==true)
		{
			System.out.println("company name is displayed"+companyname);

		}
		WebElement username = driver.findElement(By.name("username"));
		if(username.isDisplayed()==true)
		{
			System.out.println("username is displayed"+username);

		}
		WebElement emailid = driver.findElement(By.name("email"));
		if(emailid.isDisplayed()==true)
		{
			System.out.println("emailid is displayed"+emailid);

		}
		WebElement phonenumber = driver.findElement(By.name("phone"));
		if(phonenumber.isDisplayed()==true)
		{
			System.out.println("phonenumber is displayed"+phonenumber);

		}
		WebElement addressline1 = driver.findElement(By.name("address1"));
		if(addressline1.isDisplayed()==true)
		{
			System.out.println("Address line 1 is displayed"+addressline1);

		}
		WebElement street = driver.findElement(By.name("street"));
		if(street.isDisplayed()==true)
		{
			System.out.println("street is displayed"+street);

		}
		WebElement postcode = driver.findElement(By.name("postcode"));
		if(postcode.isDisplayed()==true)
		{
			System.out.println("postcode is displayed"+postcode);

		}
		
		WebElement city = driver.findElement(By.name("city"));
		if(city.isDisplayed()==true)
		{
			System.out.println("city is displayed"+city);

		}
		WebElement state = driver.findElement(By.name("state"));
		if(state.isDisplayed()==true)
		{
			System.out.println("state is displayed"+state);

		}
		WebElement country = driver.findElement(By.name("country"));
		if(country.isDisplayed()==true)
		{
			System.out.println("country is displayed"+country);

		}
		WebElement facebookurl = driver.findElement(By.name("facebookUrl"));
		if(facebookurl.isDisplayed()==true)
		{
			System.out.println("facebookurl is displayed"+facebookurl);

		}
		WebElement instagramurl = driver.findElement(By.name("instagramUrl"));
		if(instagramurl.isDisplayed()==true)
		{
			System.out.println("instagramurl is displayed"+instagramurl);

		}
		WebElement websiteurl = driver.findElement(By.name("webciteUrl"));
		if(websiteurl.isDisplayed()==true)
		{
			System.out.println("websiteurl is displayed"+websiteurl);

		}

	}
	
	
	
	//verification of organiser contact table display
	
	
	public void organisercontactdislay() throws InterruptedException
	{
		
		Thread.sleep(1000);
		WebElement organisercontactimage = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[5]/div[2]/div/div[2]/table/tbody/tr[1]/td/div/img"));
		if(organisercontactimage.isDisplayed()==true)
		{
			System.out.println("organiser contact table image is displayed"+organisercontactimage);

		}
		
		WebElement organisercontactname = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[5]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]"));
		if(organisercontactname.isDisplayed()==true)
		{
			System.out.println("organiser contact table name  is displayed"+organisercontactname);

		}
		
		
		WebElement organisercontactphone = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[5]/div[2]/div/div[2]/table/tbody/tr[1]/td[3]"));
		if(organisercontactphone.isDisplayed()==true)
		{
			System.out.println("organiser contact table phone  is displayed"+organisercontactphone);

		}
		
		WebElement organisercontactemail = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[5]/div[2]/div/div[2]/table/tbody/tr[1]/td[4]"));
		if(organisercontactemail.isDisplayed()==true)
		{
			System.out.println("organiser contact table email is displayed"+organisercontactemail);

		}
	}
			
	
	
}









