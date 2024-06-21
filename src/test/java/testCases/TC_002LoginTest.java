package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC_002LoginTest extends BaseClass{
	
	@Test(groups={"sanity","master"})
	public void verify_Login()
	{
		logger.info("****Staring TC_002LoginTest ******* ");
		logger.debug("****capturing app logs****");
		try
		{
		//HomePage
		HomePage hp=new HomePage(driver);
		hp.ClickMyAccount();
		logger.info("Clicked on My Account");
		
		hp.clickLogin();
		logger.info("Clicked on Login");
		
		
		//Login page
		LoginPage lp=new LoginPage(driver);
		
		logger.info("Entering valid email and password");
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.ClickLogin();
		//lp.gettxtPlaceholder("placeholder");
		//WebElement place=lp.gettxtPlaceholder();
		//String placeholdertext= place.getAttribute("placeholder");
		logger.info("Clicked on Login");
		//Assert.assertEquals(lp,true,"E-mail Address");
		String placeholderText = lp.gettxtPlaceholder();
		System.out.println("Placeholder text:" + placeholderText);
		Assert.assertEquals(placeholderText, "E-Mail Address", "Placeholder text is correct!");

		String placeholderText1 = lp.getpwdtxtPlaceholder();
		System.out.println("Placeholder text: " + placeholderText1);
		Assert.assertEquals(placeholderText1,"Password","Placeholder text is correct!");
		lp.getpwdtxtPlaceholder();


		//My account page
		
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetpage=macc.isAccountPageExists();
		Assert.assertEquals(targetpage, true,"Login Failed");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("****Ending TC_002LoginTest *****");
		driver.navigate().back();
		logger.info("Clicked on back");
		//driver.getCurrentUrl();
	}


}
