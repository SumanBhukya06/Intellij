package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Way2AccountReg;
import testBase.BaseClass;

public class TC_006Way2Account extends BaseClass{
	
	@Test(groups= {"regression","master"})
	public void way_account() 
	{
		logger.info("****starting TC_006Way2Account****");
		logger.debug("Starting debug");
		
		Way2AccountReg way=new Way2AccountReg(driver);
		
		way.setName(randomeString().toUpperCase());
		
		//String phoneNumber=randomNumeric();
		way.setPhone(randomeNumber());
		
		way.setEmail(randomeString()+"@gmail.com");
		
		way.clickdropdwon();
		
		way.setCity(randomeString());
		
		String username=randomAlphaNumeric();
		way.setUsername(username);
		
		String Password=randomAlphaNumeric();
		way.setPassword(Password);
		
		way.Clicksubmit();
		String confmsz=way.textdisplay();
		Assert.assertEquals(confmsz,"This is just a dummy form, you just clicked SUBMIT BUTTON");
		
		
		
		logger.info("****finished TC_006Way2Account****");
		logger.debug("Starting debug");
		
		
		
	}
	
}