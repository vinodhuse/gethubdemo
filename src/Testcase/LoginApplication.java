package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepositery.Guru99LoginPageObject;
import objectrepositery.RediffLoginpage;
import objectrepositery.SbiNetBankingLogin;

public class LoginApplication {
	
	@Test
	
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver","/Users/Vanshikaa/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginpage rd=new RediffLoginpage(driver);
		rd.Emaid().sendKeys("vinod");
		rd.Password().sendKeys("password");
		rd.Submit().click();
		rd.ForgetPassword().click();
		rd.Emailid().sendKeys("vinodhuse");
		rd.Next().click();
		driver.get("https://www.facebook.com/login.php");
		
		Guru99LoginPageObject LoginPage =new Guru99LoginPageObject(driver);
		LoginPage.setUserID("vinodhuse@gmail.com");
		LoginPage.SetPassword("Vinod@1122");
		LoginPage.clickOnSubmitButton();
		LoginPage.clickonForgetLink();
		LoginPage.Continue(); 
		
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		
		SbiNetBankingLogin sbilogin = new SbiNetBankingLogin(driver);
		//sbilogin.clickonContinue();
		sbilogin.Username("Vinodhuse");
		sbilogin.Password("Vinod@1122");
		sbilogin.clickonSubmit();
	}
	

}
