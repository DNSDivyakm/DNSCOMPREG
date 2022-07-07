package DNSCompregPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class comDashboardPage {

	WebDriver driver;
	
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	By dashboardcompreglogo=By.xpath("//*[@class='dashboard-layout']/div/div/div/div/img");


	
	
	public comDashboardPage(WebDriver driver)
	{
		this.driver=driver;
		//driver = TestService.getDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
	}
	
	
	public void dashboardcompreglogoimage()
	{
		driver.findElement(dashboardcompreglogo).isDisplayed();

		
			     
}
}









