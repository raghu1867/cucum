package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {
	public WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList");

		driver.findElement(By.xpath("//*[contains(@class,'oxd-grid-item oxd-grid-item--gutters')]/div[1]"))
				.sendKeys("05-04-2021");

		driver.findElement(By.xpath("//*[contains(@class,'oxd-grid-item oxd-grid-item--gutters')]/div[2]"))
				.sendKeys("23-04-2021");

		Select se = new Select(driver.findElement(
				By.xpath("//*[contains(@class,'oxd-grid-item oxd-grid-item--gutters')]/div/div/div/div/div[1]")));
		se.selectByVisibleText("CAN - Matternity");

		driver.findElement(By.xpath(
				"//*[contains(@class,'oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space')]"))
				.click();

		// WebElement wb =
		// driver.findElement(By.xpath("//*[contains(@class,'oxd-table-body')]/div[13]"));

		List<WebElement> coloum = driver.findElements(By.xpath("//*[@class='oxd-table-header']/div/div[4]"));
		int columcount = coloum.size();

		for (int i = 0; i < columcount; i++) {
			String str1 = coloum.get(i).getText();
			if (str1.equalsIgnoreCase("Number of days")) {
				System.out.println("data is found");

			} else {
				System.out.println("data is not found");
			}

		
	}

	List<WebElement> row=driver.findElements(By.xpath("//*[@class='oxd-table-body']/div"));
	int rowcount=row.size();

	for(int j=0;j<rowcount;j++)
	{
		String str1=row.get(j).getText();
		if (str1.equalsIgnoreCase("2.0")) {
			System.out.println("data is found");

		} else {
			System.out.println("data is not found");
		}

	}
}
}
