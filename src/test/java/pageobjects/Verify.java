package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify {
	WebDriver driver;
	
	public Verify() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a")
	@CacheLookup
	WebElement txt_click;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	@CacheLookup
	WebElement txt_empdetails ;
	
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[2]/div/div[2]/div/div/div[2]/i")
	@CacheLookup
	WebElement  txt_setunit ;
	
	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement  txt_search ;
	public void loginleav() {
		txt_click.click();
	}
	
	public void enteremply(String st) {
		
		txt_empdetails.sendKeys(st);
		}
	public void selectsetunit(String set) {
		txt_setunit.sendKeys(set);
	}
	
	public void clickserch() {
		txt_search.click();
	}
	
	
	
	
	
	
	
	
	

}
