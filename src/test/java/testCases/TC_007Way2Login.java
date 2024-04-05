package testCases;

import org.testng.annotations.Test;

import pageObjects.Way2AccountReg;
import pageObjects.Way2login;
import testBase.BaseClass;

public class TC_007Way2Login extends BaseClass{
	
	@Test(groups= {"regression","sanity"})
	public void way2_login()
	{
		Way2AccountReg wayreg=new Way2AccountReg(driver);
		
		wayreg.clicksignin();
		
		Way2login waylogin=new Way2login(driver);
		
		waylogin.setUsername(p.getProperty("Uname"));
		
		waylogin.setPassword(p.getProperty("Pword"));
		
		waylogin.clciksubmit();
	}
	
	

}
