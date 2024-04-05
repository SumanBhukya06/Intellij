package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Way2login extends BasePage {
	
	public Way2login(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div//form//fieldset[1]//input[@name='username']")
	WebElement txtUsername;
	
	@FindBy(xpath="//div//form//fieldset[2]//input[@name='password']")
	WebElement txtPassword;
	
	@FindBy(xpath="(//input[@value='Submit'])[2]")
	WebElement clclick;
	
	
	public void setUsername(String Uname) {
		txtUsername.sendKeys(Uname);
		
	}
	
	public void setPassword(String Pword) {
		txtPassword.sendKeys(Pword);;
	}
	
	public void clciksubmit() {
		clclick.click();
	}

}
