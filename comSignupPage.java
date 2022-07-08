package DNSCompregPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class comSignupPage {
	
	
WebDriver driver;

By compregfirstname=By.name("firstName");
By compreglastname=By.name("lastName");
By compregusername=By.name("username");
By compregemail=By.name("email");
By compregtelephone=By.name("phone");
By compregpassword=By.name("password");
By compregconfirmpassword=By.name("confirmPassword");
By compregnextbutton=By.xpath("//button[@type='submit']");


public comSignupPage(WebDriver driver)
{
	this.driver=driver;
}

public void setvaluesregister(String firstName,String lastName,String username,String email,String phone,String password,String confirmPassword)
{
	driver.findElement(compregfirstname).sendKeys(firstName);
	driver.findElement(compreglastname).sendKeys(lastName);
	driver.findElement(compregusername).sendKeys(username);
	driver.findElement(compregemail).sendKeys(email);
	driver.findElement(compregtelephone).sendKeys(phone);
	driver.findElement(compregpassword).sendKeys(password);
	driver.findElement(compregconfirmpassword).sendKeys(confirmPassword);

}



//verifying image 1 displayed on left side of register page or not
public void registerfirstimgdisplay()
{
	
	WebElement registerfirstimage = driver.findElement(By.xpath("//*[@class='auth-layout']/div"));
	if(registerfirstimage.isDisplayed()==true)
	{
		System.out.println("first image is present in register page");
		
	}
	else
	{
		System.out.println("first image is not displayed in register page ");

	}
}

//verifying image 2 displayed on left side of register page or not

public void registersecondimgdisplay()
{
	
	WebElement registersecondimage = driver.findElement(By.xpath("//*[@class='auth-layout']/div"));
	if(registersecondimage.isDisplayed()==true)
	{
		System.out.println("second image is present in register page");
		
	}
	else
	{
		System.out.println("second image is not displayed in register page ");

	}
}


//verifying logo image is displayed in register page
public void registerpagelogoimage()
{
WebElement registerpagelogoimage = driver.findElement(By.xpath("//*[@class='wrap']/img"));
	
	if(registerpagelogoimage.isDisplayed()==true)
	{
		System.out.println("in register page Logo image is present");
		
	}
	else
	{
		System.out.println("in register page Logo image is not present");

	}
}

//verifying next button click in register page
public void registernextbutton()
{
	driver.findElement(compregnextbutton).click();
}

//verifying facebook url(optional) text field present in register page
public void facebookurlregister()
{
	WebElement facebookurl= driver.findElement(By.name("facebookUrl"));
	if(facebookurl.isEnabled()==true)
	{
		System.out.println("facebbok url textfield is enabled");
	}
	else
	{
		
//verifying skip and complete registration button in register page

		
		driver.findElement(By.xpath("//*[@class='add-social-media']/form/div/button[1]")).click();
		System.out.println("facebbok url textfield is not enabled");

	}
	
}

//verifying instagram url(optional) text field present in register page
public void instagramurlregister()
{
	WebElement instagramurl= driver.findElement(By.name("instagramUrl"));
	if(instagramurl.isEnabled()==true)
	{
		System.out.println("instagram url textfield is enabled");
	}
	else
	{
		
//verifying skip and complete registration button in register page

		driver.findElement(By.xpath("//*[@class='add-social-media']/form/div/button[1]")).click();

		System.out.println("instagram url textfield is not enabled");

	}
	
}



//verifying save and complete registration button in register page
public void saveandcompleteregistrationbutton()
{
	
	WebElement saveandcompleteregistration = driver.findElement(By.xpath("//*[@class='add-social-media']/form/div/button[2]"));
	saveandcompleteregistration.click();
}



}