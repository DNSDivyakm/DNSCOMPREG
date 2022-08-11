package DNSCompregModule1Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class comRallydetailsfromUserLoginPage {

	WebDriver driver;
	

	
	public comRallydetailsfromUserLoginPage(WebDriver driver)
	{
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	

	}
	
	

	//verification of user dashboard upcoming events rally details click	

	public void rallydetaisclick()
	{
		WebElement rallydetaisclick = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div[2]/div/div/div[2]/a[2]"));
		rallydetaisclick.click();
		System.out.println("rally details clicked"+rallydetaisclick);
	}
		
	
	//verification of rally listing table on dashboard rally details click
	
	public void rallylistingtable()
	{
		
			//verification of rally listing table image
		
		
		WebElement rallylistingcompregimage = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[4]/div[2]/div/div/div[2]/table/tbody/tr/td/div/div/img"));
			if(rallylistingcompregimage.isDisplayed()==true)
			{
				System.out.println("rally listing table compreg image is displayed"+rallylistingcompregimage);

			}
		
		
			//verification of rally listing table rally name 
			
			WebElement rallylistingrallyname = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[4]/div[2]/div/div/div[2]/table/tbody/tr/td/div/div[2]"));
			if(rallylistingrallyname.isDisplayed()==true)
			{
				System.out.println("rally listing table rally name is displayed"+rallylistingrallyname);

			}
			
			
			//verification of rally listing table startdate or enddate
			
			WebElement startdateorenddate = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[4]/div[2]/div/div/div[2]/table/tbody/tr/td[2]/p"));
			if(startdateorenddate.isDisplayed()==true)
			{
				System.out.println("rally listing table rally  startdate or enddate is displayed"+startdateorenddate);

			}
			
			//verification of rally listing table rally participants
			
			WebElement rallylistingrallyparticipants = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[4]/div[2]/div/div/div[2]/table/tbody/tr/td[3]/p"));
			if(rallylistingrallyparticipants.isDisplayed()==true)
			{
				System.out.println("rally listing table rally participants is displayed"+rallylistingrallyparticipants);

			}
			
			//verification of rally listing table rally status
			
			WebElement rallylistingrallystatus = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[4]/div[2]/div/div/div[2]/table/tbody/tr/td[4]"));
			if(rallylistingrallystatus.isDisplayed()==true)
			{
				System.out.println("rally listing table rally status is displayed"+rallylistingrallystatus);

			}
			
			//verification of rally listing table rally uploaded files

			WebElement rallylistinguploadedfiles = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[4]/div[2]/div/div/div[2]/table/tbody/tr/td[5]/p"));
			if(rallylistinguploadedfiles.isDisplayed()==true)
			{
				System.out.println("rally listing uploaded files is displayed"+rallylistinguploadedfiles);

			}
			
			
			//verification of  rally listing table uploaded fileds click
			
			WebElement rallylistinguploadedfilesclick = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[4]/div[2]/div/div/div[2]/table/tbody/tr/td[5]/p"));
			rallylistinguploadedfilesclick.click();
			System.out.println("rally listing uploaded files is clicked"+rallylistinguploadedfilesclick);

			
			
			//verification of uploaded files click window

			
			WebElement rallylistinguploadedfilesclickwindow = driver.findElement(By.xpath("//*[@role='presentation']/div[3]"));
			rallylistinguploadedfilesclickwindow.click();
			System.out.println("rally listing uploaded files window is displayed"+rallylistinguploadedfilesclickwindow);

			

			//verification of uploaded files click window field file name disabled or not

			
			WebElement rallylistinguploadedfileswindowdisabledfilename = driver.findElement(By.xpath("//*[@role='presentation']/div[3]/p/div/div/div/input"));
			if(rallylistinguploadedfileswindowdisabledfilename.isEnabled()==false)
			{
				System.out.println("rally listing uploaded files window file name field is disabled"+rallylistinguploadedfileswindowdisabledfilename);

			}
			
			
			//verification of uploaded files click window field dropdown disabled or not

			
			WebElement rallylistinguploadedfileswindowdisabledropdown = driver.findElement(By.xpath("//*[@role='presentation']/div[3]/p/div/div/div[2]/select/option[4]"));
			if(rallylistinguploadedfileswindowdisabledropdown.isEnabled()==false)
			{
				System.out.println("rally listing uploaded files window dropdown field is disabled"+rallylistinguploadedfileswindowdisabledropdown);

			}
			
			
			
			
			//verification of uploaded files click window field eye icon

			
			WebElement rallylistinguploadedfileswindoweyeicon = driver.findElement(By.xpath("//*[@role='presentation']/div[3]//*[name()='svg']"));
			rallylistinguploadedfileswindoweyeicon.click();
			System.out.println("rally listing uploaded files window eye icon is clicked"+rallylistinguploadedfileswindoweyeicon);

		
	}
	
	
}









