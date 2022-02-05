package objectrepositery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {
	WebDriver driver;
	public RediffLoginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By username = By.xpath( "//*[@id='login1']");
	By password =By.cssSelector("#password");
	By go =By.name("proceed");
	By Forgetpassword =By.linkText("Forgot Password?");
	By Emailid=By.cssSelector("#txtlogin");
	By next=By.name("next");
	
	public WebElement Emaid()
	{
		return driver.findElement(username);		
	
	}
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	
	public WebElement Submit()
	{
		return driver.findElement(go);
	}
	public WebElement ForgetPassword()
	{
		return driver.findElement(Forgetpassword);
	}
	public WebElement Emailid()
	{
		return driver.findElement(Emailid);
	}
	public WebElement Next()
	{
		return driver.findElement(next);
	}



}
