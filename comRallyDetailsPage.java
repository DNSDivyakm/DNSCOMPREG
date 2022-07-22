package DNSCompregPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class comRallyDetailsPage {

	WebDriver driver;
	
	

	public comRallyDetailsPage(WebDriver driver)
	{
		this.driver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		
	}

	
	//verification of rallies button click
	
	public void rallydetailsralliesbuttonclick()
	{
		WebElement ralliesbuttonclick = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[3]/div[2]/button[1]"));
		ralliesbuttonclick.click();
		System.out.println("Rallies button is clicked"+ralliesbuttonclick);

	}
	
	//verification of Rally details Add new button
	public void rallyaddnewbutton()
	{
		WebElement addnewbutton  = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[5]/div/div/div/div/div/div/div[3]/button"));
		addnewbutton.click();
		System.out.println("add new button button is clicked"+addnewbutton);

		
	}
	
	//verification of Add rally window Rally name
	public void addrallywindowrallyname()
	{
		WebElement addrallyname = driver.findElement(By.xpath("//*[@id='transition-modal-description']/form/div/div[2]/div/input"));
		addrallyname.sendKeys("dfsdfsd");
	}
	
	
	//verification of add rally window Rally type
	public void addrallywindowrallytype()
	{
		Select addrallytype = new Select(driver.findElement(By.xpath("//*[@id='transition-modal-description']/form/div/div[2]/div[2]/select")));
		addrallytype.selectByValue("61f941e07f85524074d8f4a2");
		System.out.println("Rally type selected"+addrallytype);

	}
	
	//verification of add rally window start date
		public void addrallywindowstartdate()
		{
			WebElement addstartdate = driver.findElement(By.xpath("//*[@id='transition-modal-description']/form/div/div[3]/div/div/div/input"));
			if(addstartdate.isDisplayed()==true)
			{
			System.out.println("startdate displayed"+addstartdate);
		}
			
		}
		
		//verification of add rally window start date
				public void addrallywindowenddate()
				{
					WebElement addenddate = driver.findElement(By.xpath("//*[@id='transition-modal-description']/form/div/div[3]/div/div/div/input"));
					if(addenddate.isDisplayed()==true)
					{
					System.out.println("startdate displayed"+addenddate);
					}
				}
					
					//verification of add rally window memo field
					public void addrallywindowmemo()
					{
						WebElement addmemo= driver.findElement(By.xpath("//*[@id='transition-modal-description']/form/div/div[4]/div/textarea"));
						addmemo.sendKeys("dbdfsdbdhfhdghsdshdhsdghsdhsghsfgsd");
				}
					
			
					//verification of add rally window addfile button 
					public void addrallyaddfilebutton()
					{
						WebElement addfilebutton= driver.findElement(By.xpath("//*[@id='transition-modal-description']/form/div/div[5]/div/button"));
						addfilebutton.click();
						System.out.println("add file button in add rally window is clicked"+addfilebutton);

					}
					
					//verification of add rally window addfile dropdown 
					public void addrallywindowaddfiledropdown()
					{
						
						
						Select addrallyaddfiledropdown= new Select(driver.findElement(By.xpath("//*[@id='transition-modal-description']/form/div/div[5]/div/div/div[2]/select")));
					
						addrallyaddfiledropdown.selectByValue("Timing schedule");
						System.out.println("add rally window add file dropdown value selected"+addrallyaddfiledropdown);
						}
					
					
					//verification of add rally window file upload button 

					public void addrallywindowfileuploadbutton()
					{
					
						WebElement fileuploadaddrally = driver.findElement(By.xpath("//*[@id='transition-modal-description']/form/div/div[5]/div[2]/div/div[3]/div/button"));
					if(fileuploadaddrally.isEnabled()==true)
					{
						System.out.println("can upload file in add rally window"+fileuploadaddrally);

					}
					else
					{
						System.out.println("cannot upload file"+fileuploadaddrally);

					}
					}
					
					//verification of add rally window submit button
					public void addrallywindowsubmitbutton()
					{
						WebElement addrallysubmitbutton = driver.findElement(By.xpath("//*[@id='transition-modal-description']/form/div/div[6]/div/div/button"));
						addrallysubmitbutton.click();
						System.out.println("add rally window submit button clicked"+addrallysubmitbutton);
						
					}
					
					//verification of rally created  successfully animator
					public void rallycreatedanimatorclick()
					{
						WebElement rallycreatedanimator = driver.findElement(By.xpath("//*[@class='Toastify__toast Toastify__toast-theme--light Toastify__toast--success']"));
						rallycreatedanimator.click();
						System.out.println("rally created successfully animator clicked"+rallycreatedanimator);
		        		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	

					}
					
					//verification of Rally listing export csv button
					public void rallylistingexportcsv()
					{
						WebElement exportcsvrallylisting = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[5]/div/div/div/div/div/div/div[2]/button"));
						exportcsvrallylisting.click();
						System.out.println("rally details export csv button clicked"+exportcsvrallylisting);


					}
					
					//verification of Rally listing sample csv link
					public void rallylistingsamplecsv()
					{
						WebElement samplecsvrallylisting = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[5]/div/div/div/div/div/div/div/div/div"));
						samplecsvrallylisting.click();
						System.out.println("rally details sample csv link clicked"+samplecsvrallylisting);

					}
					
					//verification of Rally listing choose csv button
					public void rallylistingchoosecsv()
					{
						WebElement choosecsvrallylisting = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[5]/div/div/div/div/div/div/div/button"));
						if(choosecsvrallylisting.isEnabled()==true)
						{
						System.out.println("rally details choose csv button is enabled"+choosecsvrallylisting);

						}
					
					
						
					}
}
			
			
			
			

	 
	
			
			
			
	 
	 
	








