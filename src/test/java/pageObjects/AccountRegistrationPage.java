package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.Require;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	//WebDriver driver;
	public void Actions(WebDriver driver) {
	    this.driver = Require.nonNull("Driver", driver);
	}
	
	public AccountRegistrationPage(WebDriver driver )
	{
		super(driver);
	}
@FindBy(xpath="//input[@id='input-firstname']")
WebElement txtFirstName;

@FindBy(xpath="//input[@name='lastname']")
WebElement txtLastName;

@FindBy(xpath="//input[@name='email']")
WebElement txtEmail;

@FindBy(xpath="//input[@name='password']")
WebElement txtPassword;

@FindBy(xpath="(//input[@id='input-newsletter'])[1]")
WebElement rdNewsletter;

@FindBy(xpath="//input[@name='agree']")
WebElement chkdpolicy;

@FindBy(xpath="//button[@class='btn btn-primary']")
WebElement btncontinue;

@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
WebElement msgConfirmation;


public void setFirstName(String fname)
{
	txtFirstName.sendKeys(fname);
}

public void setLastName(String lname)
{
	txtLastName.sendKeys(lname);
}

public void setEmail(String email)
{
	txtEmail.sendKeys(email);
}

public void setPassword(String pwd)
{
	txtPassword.sendKeys(pwd);
}

/*public void setNewsletter()
{
	rdNewsletter.click();
}

public void setPrivacyPolicy()
{
	chkdpolicy.click();
}*/

public void setNewsletter()
{

	Actions act=new Actions(driver);
	act.moveToElement(rdNewsletter).click().perform();
}


public void setPrivacyPolicy()
{
	
	Actions act=new Actions(driver);
	act.moveToElement(chkdpolicy).click().perform();
}


public void clickContinue()
{
	Actions act=new Actions(driver);
	act.moveToElement(btncontinue).click().perform();
	
}

public String getConfirmmsz()
{
	try 
	{
		return (msgConfirmation.getText());
	}
	catch(Exception e)
	{
		return(e.getMessage());
	}
}


}

