

package DNSCompregPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class comEventsLinksPage {

	WebDriver driver;
	
	

	public comEventsLinksPage(WebDriver driver)
	{
		this.driver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		
	}


	//verification of email id link

	public void emaillink()
	{
	
	WebElement emailidlink = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[3]/div/div/a/h6"));
	   
	if(emailidlink.isEnabled()==true)
	{
		System.out.println("email id is clickable");
		
	
	}
	
	}


	//verification of enquiry contact link

	public void enquirycontactlink()
	{
	
	WebElement enquirycontactlink = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[3]/div/div[2]/a"));
	   
	if(enquirycontactlink.isEnabled()==true)
	{
		System.out.println("enquiry contact link is clickable");
	
	}
	
	}

	
	//verification of website link 


	public void websitelink()
	{
	
	WebElement websitelink = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[3]/div/div[3]/a"));
	   
	if(websitelink.isEnabled()==true)
	{
		System.out.println("website link is clickable");
	
	}
	}
	
	//verification of rallies button click
	
	public void ralliesbuttonclick()
	{
		WebElement ralliesclick = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[3]/div[2]/button[1]"));
		if(ralliesclick.isEnabled()==true)
		{
			System.out.println("Rallies button is clickable");

		}
	}
	
	//verification of details button click

	public void detailsbuttonclick()
	{
		WebElement detailsclick = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[3]/div[2]/button[2]"));
		if(detailsclick.isEnabled()==true)
		{
			System.out.println("details button is clickable");

		}
	}
	
	//verification of forms button click
	
	public void formsbuttonclick()
	{
		WebElement formsclick = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[3]/div[2]/button[3]"));
		if(formsclick.isEnabled()==true)
		{
			System.out.println("forms button is clickable");

		}
	}
	
	//verification of participants button click
	
	public void participantsbuttonclick()
	{
		WebElement participantsclick = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[3]/div[2]/button[4]"));
		if(participantsclick.isEnabled()==true)
		{
			System.out.println("participants button is clickable");

		}

	}
	
			

	//verification of organisers link 

	public void organisedbylinkevents()
	{
		WebElement organisedbylinkclick = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div/p/a"));
		organisedbylinkclick.click();
		driver.navigate().forward();
		System.out.println("organised by link clicked"+organisedbylinkclick);
	
		
	}
}
			
			
			
			

	 
	
			
			
			
	 
	 
	








