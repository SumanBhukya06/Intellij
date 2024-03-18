package testCases;

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
		logger.info("Clicked on Login");
		
		//My account page
		
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetpage=macc.isAccountPageExists();
		Assert.assertEquals(targetpage, true,"Login Failed");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("****Staring TC_002LoginTest *****");
	}

}
