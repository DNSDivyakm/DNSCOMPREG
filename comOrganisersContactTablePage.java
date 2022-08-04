
package DNSCompregPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;




public class comOrganisersContactTablePage {

	WebDriver driver;

	


public comOrganisersContactTablePage(WebDriver driver)
	{
		this.driver=driver;
		

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		

		
	}


		//verification of image in organiser table
		public void imageorganisertable()
		{
	    WebElement organisertableimage = driver.findElement(By.xpath("//*[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-1']/div[2]/div/div[2]/table/tbody/tr/td/div/img"));
	    if(organisertableimage.isDisplayed()==true)
	    {
			System.out.println("organiser table image is displayed"+organisertableimage);

	    }
		}



		//verification of organiserstable scroll
			public void organisertablescroll()
				{
			JavascriptExecutor jse = (JavascriptExecutor) driver;     

	 WebElement organisertable = driver.findElement(By.xpath("//*[@class='MuiTableContainer-root jss126']"));
	if( organisertable.isDisplayed()==true)
	{
		System.out.println("organiser table displayed"+organisertable);
	}
		
        jse.executeScript("window.scrollBy(0,1000)");
		System.out.println("organiser table scrolled down"+organisertable);

        
        WebElement elementintable = driver.findElement(By.xpath("//*[@class='MuiButtonBase-root MuiIconButton-root jss142']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(elementintable);
        actions.perform();
		System.out.println("organiser table selected the icon element"+elementintable);
		elementintable.click();
		
		//verification of organisers table icon click edit
		

		WebElement elementclickmenuedit = driver.findElement(By.xpath("//*[@style='padding-right: 7px; overflow: hidden;']/div[5]/div[3]/ul/li[2]/div"));

		actions.moveToElement(elementclickmenuedit);
		actions.click().perform();
		System.out.println("organiser table edit icon clicked"+elementclickmenuedit);
		
		
		
}
				
		

			//verification of edit organiser contact window
			public void editorganisercontact()
			{
				WebElement editorganiserfirstname= driver.findElement(By.xpath("//*[@id='transition-modal-description']/form/div/div[2]/div/input"));		
				if(editorganiserfirstname.isEnabled()==true)
				{
					System.out.println("edit organiser firstname is enabled "+editorganiserfirstname);

				}	
			
	
				WebElement editorganiserlastname= driver.findElement(By.xpath("//*[@id='transition-modal-description']/form/div/div[2]/div[2]/input"));
				
				if(editorganiserfirstname.isEnabled()==true)
				{
					System.out.println("edit organiser lastname is enabled and edited"+editorganiserlastname);

				}						

								
				WebElement editorganiseremail= driver.findElement(By.xpath("//*[@id='transition-modal-description']/form/div/div[3]/div/input"));
				if(editorganiseremail.isEnabled()==true)
				{
					System.out.println("edit organiser email is enabled"+editorganiseremail);

				}				
				WebElement editorganiserphone= driver.findElement(By.xpath("//*[@id='transition-modal-description']/form/div/div[3]/div[2]/input"));
				if(editorganiserphone.isEnabled()==true)
				{
					System.out.println("edit organiser phone is enabled"+editorganiserphone);

				}				
				WebElement editorganiserdesignation= driver.findElement(By.xpath("//*[@id='transition-modal-description']/form/div/div[4]/div/input"));
				if(editorganiserdesignation.isEnabled()==true)
				{
					System.out.println("edit organiser designation is enabled"+editorganiserdesignation);

				}				
				WebElement editorganisermemo= driver.findElement(By.xpath("//*[@id='transition-modal-description']/form/div/div[4]/div[2]/input"));
				if(editorganisermemo.isEnabled()==true)
				{
					System.out.println("edit organiser memo is enabled"+editorganisermemo);

				}	
			
			
				//verification of submit button in edit organiser contact


				WebElement editorganisersubmit= driver.findElement(By.xpath("//*[@id='transition-modal-description']/form/div/div[5]/div/div/button"));
				editorganisersubmit.click();
				System.out.println("edit organiser submit button clicked"+editorganisersubmit);

			}
			
			//verification of event organiser updated successfully animator
			
			public void eventorganiserupdated()
			{
				WebElement organiserupdated = driver.findElement(By.xpath("//*[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success']"));
				organiserupdated.click();
				System.out.println("event organiser updated successfully animator clicked"+organiserupdated);

			}
			
			
			//verification of organiser contact table delete yes click
			
			public void organisercontacttabledeleteyes()
			{
				

				 WebElement elementintable = driver.findElement(By.xpath("//*[@class='MuiButtonBase-root MuiIconButton-root jss142']"));
			        Actions actions = new Actions(driver);
			        actions.moveToElement(elementintable);
			        actions.perform();
					System.out.println("organiser table selected the icon element"+elementintable);
					elementintable.click();
					
					
					
					//verification of organiser table delete click
					
					
					WebElement elementclickmenudelete = driver.findElement(By.xpath("//*[@style='padding-right: 7px; overflow: hidden;']/div[5]/div[3]/ul/li/div"));

					actions.moveToElement(elementclickmenudelete);
					actions.click().perform();
					System.out.println("organiser table delete clicked"+elementclickmenudelete);
					
					
					
					//verification of organiser delete window
					
					
					WebElement organiserdeletewindow = driver.findElement(By.xpath("//*[@aria-describedby='transition-modal-description']/div[3]"));
					if(organiserdeletewindow.isDisplayed()==true)
					{
						System.out.println("organiser table delete window is displayed"+organiserdeletewindow);

					}
					
					
					//verification of organisers table icon click delete heading "do you want to delete is displayed or not 
					
					
					
					WebElement deleteheading = driver.findElement(By.xpath("//*[@aria-describedby='transition-modal-description']/div/h3"));
					if(deleteheading.isDisplayed()==true)
					{
						System.out.println("organisers table do you want to delete heading is displayed"+deleteheading);

					}
					

					
					//verification of organisers table icon  delete yes click
					
					
					
					WebElement deleteyesclick = driver.findElement(By.xpath("//*[@aria-describedby='transition-modal-description']/div[3]/div[2]/p"));
					JavascriptExecutor js = (JavascriptExecutor) driver;     

					js.executeScript("arguments[0].click();", deleteyesclick);
					System.out.println("organisers table delete yes is clicked and row deleted"+deleteyesclick);
					
			}
						
			
					
					//verification of event organiser deleted successfully animator
			
			public void eventorganiserdeletedanimator()
			{
				 WebElement organiserdeleteanimator = driver.findElement(By.xpath("//*[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success']"));
				 organiserdeleteanimator.click();
				 System.out.println(" event organiser deleted successfully animator clicked"+organiserdeleteanimator);

				
			}
			

					
					
					//verification of organiser contact table delete cancel click

			
			public void organisercontacttabledeletecancel()
			{
				

				 WebElement elementintable = driver.findElement(By.xpath("//*[@class='MuiButtonBase-root MuiIconButton-root jss142']"));
			        Actions actions = new Actions(driver);
			        actions.moveToElement(elementintable);
			        actions.perform();
					System.out.println("organiser table selected the icon element"+elementintable);
					elementintable.click();
					
					
					
					//verification of organiser table delete click
					
					
					WebElement elementclickmenudelete = driver.findElement(By.xpath("//*[@style='padding-right: 7px; overflow: hidden;']/div[5]/div[3]/ul/li/div"));

					actions.moveToElement(elementclickmenudelete);
					actions.click().perform();
					System.out.println("organiser table delete clicked"+elementclickmenudelete);
					
					
					
					//verification of organisers table icon click delete cancel click

					
					
					WebElement deletecancelclick = driver.findElement(By.xpath("//*[@aria-describedby='transition-modal-description']/div[3]/div[2]/p[2]"));
					JavascriptExecutor js = (JavascriptExecutor) driver;    
					js.executeScript("arguments[0].click();", deletecancelclick);


					if(deletecancelclick.isEnabled()==true)
					{
						System.out.println("organisers table cancel is clicked and going back to organiser contact page"+deletecancelclick);

					}
					
	

			}
}
					



			
			
		
	



			
			
			
			

	 
	
			
			
			
	 
	 
	








