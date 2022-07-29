package DNSCompregPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




		public class comOrganisersEventsEditclickTablePage {

			WebDriver driver;

	


		public comOrganisersEventsEditclickTablePage(WebDriver driver)
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

		
		

		//verification of organisers events table 

		public void organiserseventstablescroll()
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
			
			
			
			
			
			//verification of organisers events table element edit 

			WebElement elementedit= driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[5]/div/div/div[2]/table/tbody/tr/td[6]/div/div/a"));
    
			js.executeScript("arguments[0].scrollIntoView(true);", elementedit);
			System.out.println("events table edit is viewable"+elementedit);
			
		}
		
		
		
		
			
		
		//verification of organisers events table element edit click
	
		public void elementeditclickintable()
		{
			WebElement elementeditintable = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[5]/div/div/div[2]/table/tbody/tr/td[6]/div/div/a"));
			elementeditintable.click();
			System.out.println("events table edit is clicked"+elementeditintable);

    
    
		}
	
		
		
		
		//verification of  event updated successfully animator 
		
		public void eventupdatedanimator()
		{
			WebElement eventupdatedanimator = driver.findElement(By.xpath("//*[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success']"));
			eventupdatedanimator.click();
			System.out.println("event updated animator clicked"+eventupdatedanimator);
		}

		
		
		}


					



			
			
		
	



			
			
			
			

	 
	
			
			
			
	 
	 
	








