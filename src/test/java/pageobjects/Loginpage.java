package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	public WebDriver driver;

	public Loginpage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	@CacheLookup
	WebElement txt_user;

	@FindBy(name = "password")
	@CacheLookup
	WebElement txt_password;

	@FindBy(xpath = "//*[@type='submit']")
	@CacheLookup
	WebElement txt_btn;

	@FindBy(linkText = "Logout")
	@CacheLookup
	WebElement txt_logoutbtn;

	public void setusername(String us) {
		txt_user.clear();
		txt_user.sendKeys(us);
	}

	public void setuserpassword(String pw) {
		txt_password.clear();
		txt_password.sendKeys(pw);
	}

	public void clicklogin() {
		txt_btn.click();
	}
	public void clicklogout() {
		txt_logoutbtn.click();
	}

}
