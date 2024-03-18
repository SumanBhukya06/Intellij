package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
@FindBy(xpath="//span[normalize-space()='My Account']")
WebElement lkMyaccount;

@FindBy(xpath="//a[normalize-space()='Register']")
WebElement lkRegister;

@FindBy(xpath="(//a[normalize-space()='Login'])[1]")
WebElement linkLogin;


public void ClickMyAccount()
{
	lkMyaccount.click();
}

public void ClickRegister()
{
	lkRegister.click();
}

public void clickLogin()
{
	linkLogin.click();
}

}
