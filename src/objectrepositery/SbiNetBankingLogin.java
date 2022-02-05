package objectrepositery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SbiNetBankingLogin {
	
	public SbiNetBankingLogin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	/*@FindBy(css="#banner > div.continue_btn > a")
	public WebElement Continue;*/
	@FindBy(css="#username")
	public WebElement username;
	@FindBy(xpath="//*[@id=\"label2\"]")
	public WebElement Password;
	@FindBy(className="btn btn-default")
	public WebElement Submit;
	
	/*public void clickonContinue()
	{
		Continue.click();
	}*/
	public void Username(String Username)
	{
		username.sendKeys(Username);
	}
	public void Password(String password)
	{
		Password.sendKeys(password);
	}
	public void clickonSubmit()
	{
		Submit.click();
	}
	
	
	
}
