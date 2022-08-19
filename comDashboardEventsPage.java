package DNSCompregModule1Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class comDashboardEventsPage {

	WebDriver driver;
	
	
	

	
	public comDashboardEventsPage(WebDriver driver)
	{
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	

	}
	
	//verification of dashboard events click
	
	public void dashboardeventsclick()
	{
		WebElement dashboardventsclick = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div/div/div[2]/div/ul/li[2]/a/span"));
		dashboardventsclick.click();
		System.out.println("event details clicked"+dashboardventsclick);
		
	}
	
	
	
	
	
	
	//verification of events listing table elements
	
	public void eventlistingtableelements() 
	{
		
		
		
		//verification of eventname in events listing
		
		
		WebElement eventlistingeventname = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr/td/div/div[2]"));

		if(eventlistingeventname.isDisplayed()==true)
		{
			System.out.println("event name in event listing table is displayed"+eventlistingeventname);

		}
	
	
	//verification of events count in events listing     // modifications coming in development side.. will test later
	
	
	
	//verification of start date in events listing
	
		WebElement eventlistingstartdate = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr/td[3]/p"));

		if(eventlistingstartdate.isDisplayed()==true)
		{
			System.out.println("startdate in event listing table is displayed"+eventlistingstartdate);

		}
	
	
	//verification of end date in events listing
	
		WebElement eventlistingenddate = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr/td[4]/p"));

		if(eventlistingenddate.isDisplayed()==true)
		{
			System.out.println("end date in event listing table is displayed"+eventlistingenddate);

		}
	
	
	
	//verification of status in events listing
		WebElement eventlistingstatus = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr/td[5]/p"));

		if(eventlistingstatus.isDisplayed()==true)
		{
			System.out.println("event status in event listing table is displayed"+eventlistingstatus);

		}
	
	
	
	//verification of actions in events listing
		
		WebElement eventlistinactions = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr/td[6]"));

		if(eventlistinactions.isDisplayed()==true)
		{
			System.out.println("actions in event listing table is displayed"+eventlistinactions);

		}
	}
	
	
		//verification of up and down arrows
	
		public void upanddownarrows() throws InterruptedException 
		{
			//verification of event up down arrow
			
			//Thread.sleep(3000);
			WebElement eventupdownarrow= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[3]/div[2]/div/div[2]/table/thead/tr/th[1]//*[name()='svg']"));
			eventupdownarrow.click();
			System.out.println("event up down arrow clicked"+eventupdownarrow);
			
			
			//verification of start date up and down arrows
			
			//Thread.sleep(3000);
			WebElement startdateupdownarrow= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[3]/div[2]/div/div[2]/table/thead/tr/th[3]//*[name()='svg']"));
			startdateupdownarrow.click();
			System.out.println("start date up down arrow clicked"+startdateupdownarrow);


			//verification of end date up and down arrows
			
			//Thread.sleep(3000);
			WebElement enddateupdownarrow= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[3]/div[2]/div/div[2]/table/thead/tr/th[4]//*[name()='svg']"));
			enddateupdownarrow.click();
			System.out.println("end date up down arrow clicked"+enddateupdownarrow);

			
			
		}
		
		//verification of actions edit click in events listing table
		
		public void actionseditclick() throws InterruptedException
		{
			
			//verification of scroll to event listing table edit click
			
			JavascriptExecutor js = (JavascriptExecutor)driver; 

			Thread.sleep(3000);
			WebElement eventlistingedit= driver.findElement(By.xpath("//*[@class='MuiTableBody-root']/tr[2]/td[6]/div/a[1]//*[name()='svg']"));
    
			js.executeScript("arguments[0].scrollIntoView(true);", eventlistingedit);
			System.out.println("event listing table edit is viewable"+eventlistingedit);
			
		
			
			Thread.sleep(3000);
			WebElement actionseditclick = driver.findElement(By.xpath("//*[@class='MuiTableBody-root']/tr[2]/td[6]/div/a[1]//*[name()='svg']"));
			actionseditclick.click();
			System.out.println("actions edit in event listing table is clicked"+actionseditclick);
			
			
			
			Thread.sleep(3000);
			WebElement eventdetailstabforscrollingdown= driver.findElement(By.xpath("//*[@id=\"Element\"]/div[1]/div/h3[2]"));
    
			js.executeScript("arguments[0].scrollIntoView(true);", eventdetailstabforscrollingdown);
			System.out.println("page scrolled down and event details tab is viewable"+eventdetailstabforscrollingdown);
			
			Thread.sleep(3000);
			driver.navigate().back();
			System.out.println("going back to events listing table page");

			
		}
		
		
		//verification of actions rally click in events listing table
		
		public void actionsrallyclick() throws InterruptedException
			{
			
				//verification of scroll to event listing table rally click 
			
			JavascriptExecutor js = (JavascriptExecutor)driver; 

			Thread.sleep(3000);
			WebElement eventlistingrally= driver.findElement(By.xpath("//*[@class='MuiTableBody-root']/tr[2]/td[6]/div/a[2]//*[name()='svg']"));
    
			js.executeScript("arguments[0].scrollIntoView(true);", eventlistingrally);
			System.out.println("event listing table rally is viewable"+eventlistingrally);
			
			Thread.sleep(3000);
			WebElement actionsrallyclick = driver.findElement(By.xpath("//*[@class='MuiTableBody-root']/tr[2]/td[6]/div/a[2]//*[name()='svg']"));
			actionsrallyclick.click();
			System.out.println("actions rally in event listing table is clicked"+actionsrallyclick);
			
			
			
			Thread.sleep(3000);
			WebElement rallyuploadfileforscrollingdown= driver.findElement(By.xpath("//*[@id=\"Element\"]/div[2]/div/div/div[2]/table/tbody/tr[1]/td[5]/p/div/div"));
    
			js.executeScript("arguments[0].scrollIntoView(true);", rallyuploadfileforscrollingdown);
			System.out.println("page scrolled down and rally uploaded file is viewable"+rallyuploadfileforscrollingdown);
			
			
			Thread.sleep(3000);
			driver.navigate().back();
			System.out.println("going back to events listing table page");
			}
		
		
		//verification of events heading in event listing page
		
		
				public void eventsheadingieventlisting()
				{
			
				WebElement eventsheading = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[2]/div/div/h3"));
				if(eventsheading.isDisplayed()==true)
				{
					System.out.println("events heading is displayed"+eventsheading);

				}
				
				}
				
				
				//verification of search  in event listing page
				
				public void searcheventlisting() throws InterruptedException
				{
					
				Thread.sleep(3000);
				WebElement eventlistingsearchfield = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div/div[2]/input"));
				eventlistingsearchfield.sendKeys("q");
				System.out.println("value q passing in search field and listed the corresponding events in table"+eventlistingsearchfield);
				
				
				
				}
				
	
}









