package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightAccount extends BasePage {
	WebDriver driver;
	
	public FlightAccount(WebDriver driver) {
		super(driver);
	}
@FindBy(xpath="//input[@name='email']")
WebElement txtEmail;

@FindBy(xpath="//input[@name='password']")
WebElement txtpassword;

@FindBy(xpath="//input[@name='passwordConfirmation']")
WebElement txtconfirmPassword;

@FindBy(xpath="//input[@name='agreeTermsConditions']")
WebElement chkterms;

@FindBy(xpath="//span[normalize-space()='Continue']")
WebElement btnContinue;

/*@FindBy(xpath="//h2[normalize-space()='Thank you!']")
WebElement mszConfirm;*/



public void setEmail(String email) {
	txtEmail.sendKeys(email);
}

public void setPassw(String pwd) {
	txtpassword.sendKeys(pwd);
}

public void setcpassword(String cpwd) {
	txtconfirmPassword.sendKeys(cpwd);
}

public void clickterms() {
	chkterms.click();
}
public void clickContinue() {
	btnContinue.click();
}

/*public String getConfirm() {
	try {
		return(mszConfirm.getText());
	}
	catch(Exception e) {
		return(e.getMessage());
	}*/

}

