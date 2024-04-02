package testCases;

import org.testng.annotations.Test;

import pageObjects.FlightAccount;
import pageObjects.FlightHomePage;
import testBase.BaseClass;

public class TC_005FlightAccount extends BaseClass{
	
@Test(groups= {"regression","master"})
public void verify_account_registration(){
		
	logger.info("****starting TC_005FlightAccount****");
	logger.debug("Starting debug");
			
		
	
	FlightHomePage fhp=new FlightHomePage(driver);
			
	//fhp.btnAccept();
	//logger.info("***clicked on accept****");
		
	fhp.CreateAccount();
	logger.info("****clicked on My account****");
			
	fhp.Selectplan();
	logger.info("****clicked on Register****");
			
	fhp.IwantPlan();
	logger.info("***clicked on i want this plan");
			
	logger.info("****Entering Customer Info****");
	FlightAccount mpage= new FlightAccount(driver);
			
			//mpage.setEmail(randomeString().toUpperCase());
			
	mpage.setcpassword(randomeString()+"@gmail.com");//randomly generated mail
	String password=randomAlphaNumeric();
			//mpage.setPassw(randomeString().toUpperCase());
	mpage.setPassw(password);
}
}
	
	
			//String password=randomAlphaNumeric();
			
			//repage.setPassword(password);
			
			//repage.setNewsletter();
			//repage.setPrivacyPolicy();
			//Thread.sleep(2000);		
			//repage.clickContinue();
			//logger.info("****clicked on Continue****");
			
		/*String confmsz=mpage.getConfirm();
		logger.info("Validating expected message");
			
		Assert.assertEquals(confmsz, "Thank you!");
		}
		catch(Exception e)
		{
			logger.error("Test is failed");
			logger.debug("Test is failed");
			Assert.fail();
		}
		logger.debug("***Debug finished");
		logger.info("****finishing TC_005FlightAccount****");*/
		







