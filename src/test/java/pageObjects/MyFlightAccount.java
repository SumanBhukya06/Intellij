package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyFlightAccount extends BasePage{

	public MyFlightAccount(WebDriver driver) {
		super(driver);
		}
		
@FindBy(xpath="//span[normalize-space()='Logout']")
WebElement clklogout;
		

public void clicklogout() {
	clklogout.click();
}
	
}
	
	

