

package DNSCompregPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class comEventDetailsPage {

	WebDriver driver;
	



	public comEventDetailsPage(WebDriver driver)
	{
		this.driver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	}


		 
	 //verification of details button click in event page
	 public void detailsbuttonineventdetailspage()
	 {
		 WebElement detailsbtn = driver.findElement(By.xpath("//*[@class='dashboard-layout']/div[2]/div[3]/div/div[3]/div[2]/button[2]"));
		 detailsbtn.click();
		 System.out.println(" details button in events clicked"+detailsbtn);

	 }
	 
	 
	
	 
	 
	 
	 
}









