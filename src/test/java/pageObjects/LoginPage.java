package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);	
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmailAddress;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btnLogin;

	@FindBy(xpath = "//input[@placeholder='E-Mail Address']")
	WebElement txtplaceholder;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement txtpwdplaceholder;
	
	public void setEmail(String email)
	{
		txtEmailAddress.sendKeys(email);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void ClickLogin() {
		btnLogin.click();
	}

	public String gettxtPlaceholder()
	{
		return txtplaceholder.getAttribute("placeholder");
	}

	public String getpwdtxtPlaceholder(){
		return txtpwdplaceholder.getAttribute("placeholder");

	}

}
