package DNSCompregPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




		public class comOrganisersEventsCloneDeleteCancelPage {

			WebDriver driver;

	


		public comOrganisersEventsCloneDeleteCancelPage(WebDriver driver)
		{
		this.driver=driver;
		

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		

		
		}

		public void organiserseventsbuttonclicktable()
		{
			WebElement organiserseventsclick = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[3]/div[2]/button"));
			organiserseventsclick.click();
			System.out.println("organisers events button clicked"+organiserseventsclick);
		}

	

		//verification of organisers events table menu - clone , delete , cancel

		public void eventstablescroll()
		{

			WebElement organiserseventstable = driver.findElement(By.xpath("//*[@class='MuiTableRow-root MuiTableRow-hover']"));
			if( organiserseventstable.isDisplayed()==true)
			{
				System.out.println("organisers events table displayed"+organiserseventstable);
			}
	
				
			
			//verification of organisers events table scroll bar 
			
			JavascriptExecutor js = (JavascriptExecutor)driver; 
    
			WebElement element= driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[5]/div/div/div[2]"));
    
			js.executeScript("arguments[0].scrollIntoView(true);", element);
			System.out.println("scroll bar is viewable"+element);
			
			
		
		//verification of events table menu selector
			
			WebElement menuselector= driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[5]/div/div/div[2]/table/tbody/tr/td[6]/div/div/div/button"));
		    
			js.executeScript("arguments[0].scrollIntoView(true);", menuselector);
			System.out.println("events table menu selector is viewable"+menuselector);
			
		
				
		}
		
		//verification of organisers events table menu selector click
		
			public void organiserseventstablemenuclick()
			{
				WebElement organiserseventstablemenuclick = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[5]/div/div/div[2]/table/tbody/tr/td[6]/div/div/div/button"));
				organiserseventstablemenuclick.click();
				System.out.println("events table edit is clicked"+organiserseventstablemenuclick);

	    
	    
			}
		}


					



			
			
		
	



			
			
			
			

	 
	
			
			
			
	 
	 
	








