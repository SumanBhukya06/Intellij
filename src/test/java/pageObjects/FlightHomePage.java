package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightHomePage extends BasePage{
	WebDriver driver; //Made public this WebDriver 
	
	public FlightHomePage(WebDriver driver) { 
		super(driver);//Invoke the WebDriver and added constructor
	}
	
//@FindBy(xpath="//button[normalize-space()='Accept All Cookies']")
//WebElement btnaccept;

@FindBy(xpath="//span[normalize-space()='CREATE ACCOUNT']")
WebElement crAccount;// created variable to call

@FindBy(xpath="(//span[normalize-space()='SELECT'])[1]")
WebElement clSelect;//created variable

@FindBy(xpath="//span[normalize-space()='I WANT THIS PLAN']")
WebElement iwantp;


//create methods

//public void btnAccept() {
//	btnaccept.click();
//}

public void CreateAccount()
{
	crAccount.click();
}

public void Selectplan() {
	clSelect.click();
}

public void IwantPlan() {
	iwantp.click();
}


}

	


