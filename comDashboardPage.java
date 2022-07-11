package DNSCompregPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class comDashboardPage {

	WebDriver driver;

	
	public comDashboardPage(WebDriver driver)
	{
		this.driver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	}


	//verification of overview menu click
	
	public void dashboardoverviewmenuclick()
	{
		WebElement overviewmenu=driver.findElement(By.xpath("//*[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root active MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button']"));
		overviewmenu.click();
		System.out.println("overview menu clicked"+overviewmenu);


	}
	
	
	//verification of upcoming events click
	 public void dashboardupcomingevents()
	 {
		 WebElement upcomingevents = driver.findElement(By.xpath("//*[@class='dashboard-card-sec']/div/div"));
			
			//new Actions(driver).moveToElement(pastevents).perform();
		 upcomingevents.click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	

			
			System.out.println("upcoming events clicked"+upcomingevents);
			
 
	 }
	 
	 //verification of upcoming events details display
	 public void dashboardupcomingeventsdetailsdisplay()
	 {
		 WebElement upcomingeventsdetails = driver.findElement(By.xpath("//*[@class='right-sec']/div[3]/div[2]/div")); 
		 if(upcomingeventsdetails.isDisplayed()==true)
		 {
			 System.out.println("upcoming events details are displayed");
		 }
		 else
		 {
			 System.out.println("upcoming events details are not displayed");

		 }
		 
	 }
	
	 //verification of event details click of upcoming events 
	 public void upcomingeventdetailsclick()
	 {
		 WebElement eventdetailsclick = driver.findElement(By.xpath("//*[@class='right-sec']/div[3]/div[2]/div/div[2]/div[2]/a[1]"));
		 eventdetailsclick.click();
		 System.out.println("event details clicked"+eventdetailsclick);

	 }
	 
}









