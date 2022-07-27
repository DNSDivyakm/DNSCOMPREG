
package DNSCompregPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;




public class comOrganiserContactTablePage {

	WebDriver driver;

	


public comOrganiserContactTablePage(WebDriver driver)
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
		

		WebElement elementclickmenuedit = driver.findElement(By.xpath("//*[@class='jss146 iconify iconify--feather']"));

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

					

}

			
			
		
	



			
			
			
			

	 
	
			
			
			
	 
	 
	








