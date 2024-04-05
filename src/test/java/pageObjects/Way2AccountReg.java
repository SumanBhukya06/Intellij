package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Way2AccountReg extends BasePage{
	
	public Way2AccountReg(WebDriver driver) {
		super(driver);
		}
	
@FindBy(xpath="//div//form//fieldset[1]//input[@name='name']") //Name
WebElement txtname;

@FindBy(xpath="//div//form//fieldset[2]//input[@name='phone']") //phone
WebElement txtphone;

@FindBy(xpath="//div//form//fieldset[3]//input[@name='email']")//email
WebElement txtemail;

@FindBy(xpath="//div//form//fieldset[4]//select[@name='country']//option[1]")//drop down
WebElement dropdown;

@FindBy(xpath="//div//form//fieldset[5]//input[@name='city']")//city
WebElement txtcity;

@FindBy(xpath="//div//form//fieldset[6]//input[@name='username']")//user name
WebElement txtusername;

@FindBy(xpath="//div//form//fieldset[7]//input[@name='password']")//
WebElement txtpassword;

@FindBy(xpath="(//input[@value='Submit'])[2]")
WebElement btnsubmit;

@FindBy(xpath="//p[normalize-space()='This is just a dummy form, you just clicked SUBMIT BUTTON']")
WebElement txtdisplay;

@FindBy(xpath="(//a[normalize-space()='Signin'])[1]")
WebElement clksignin;

public void setName(String name) {
	txtname.sendKeys(name);
}

public void setPhone(String phone) {
	txtphone.sendKeys(phone);
}

public void setEmail(String email) {
	txtemail.sendKeys(email);
}

public void clickdropdwon()
{
	dropdown.click();
}

public void setCity(String city) {
	txtcity.sendKeys(city);
}

public void setUsername(String username) {
	txtusername.sendKeys(username);
}

public void setPassword(String password) {
	txtpassword.sendKeys(password);
}

public void Clicksubmit() {
	btnsubmit.click();
}

public String textdisplay() {
	try
	{
	return txtdisplay.getText();
	}
	catch(Exception e){
		return(e.getMessage());
	}
}
public void clicksignin() {
	clksignin.click();
}

}



