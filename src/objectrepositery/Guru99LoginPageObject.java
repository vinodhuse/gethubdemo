package objectrepositery;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99LoginPageObject {
	
	public Guru99LoginPageObject(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(name="email")
	public WebElement userid;
	@FindBy(name="pass")
	public WebElement password;
	@FindBy(name="login")
	public WebElement submit;
	@FindBy(xpath="//*[@id=\"login_link\"]/div")
	public WebElement Forgetpassword;
	@FindBy(xpath="//*[@id=\"initiate_interstitial\"]/div[3]/div/div[1]/button")
	public WebElement Continue;
	
	public void setUserID(String UserId)
	{
		userid.sendKeys(UserId);
	}
	public void SetPassword(String Password)
	{
		password.sendKeys(Password);
	}
	public void clickOnSubmitButton()
	{
		submit.click();
	}
	public void clickonForgetLink()
	{
		Forgetpassword.click();
	}
  public void Continue()
  {
	  Continue.click();
  }
	
}
