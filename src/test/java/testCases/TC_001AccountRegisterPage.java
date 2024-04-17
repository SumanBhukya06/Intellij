package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001AccountRegisterPage extends BaseClass{
	
	@Test(groups= {"regression","master"})
	public void verify_account_registration()
	{
		logger.info("****starting TC_001AccountRegisterPage****");
		logger.debug("Starting debug");
		//MOWA
		try
		{
		HomePage hp=new HomePage(driver);
		
		hp.ClickMyAccount();
		logger.info("****clicked on My account****");
		
		hp.ClickRegister();
		logger.info("****clicked on Register****");
		
		logger.info("****Entering Customer Info****");
		AccountRegistrationPage repage= new AccountRegistrationPage(driver);
		repage.setFirstName(randomeString().toUpperCase());
		repage.setLastName(randomeString().toUpperCase());
		repage.setEmail(randomeString()+"@gmail.com");//randomly generated mail
		
		String password=randomAlphaNumeric();
		
		repage.setPassword(password);
		
		repage.setNewsletter();
		logger.info("Clicked on NNewsletter");
		repage.setPrivacyPolicy();
		//Thread.sleep(2000);		
		repage.clickContinue();
		logger.info("****clicked on Continue****");
		
		String confmsz=repage.getConfirmmsz();
		logger.info("Validating expected message");
		
		Assert.assertEquals(confmsz, "Your Account Has Been Created!");
		}
		catch(Exception e)
		{
			logger.error("Test is failed");
			logger.debug("Test is failed");
			Assert.fail();
		}
		logger.debug("***Debug finished");
		logger.info("****finishing TC_001AccountRegisterPage****");
		
	}
}



