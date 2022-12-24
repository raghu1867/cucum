package stepdefiniation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import jaya.com.util.Utils;
import jaya.com.util.WebEventListener;

public class Base_class {

public	static WebDriver driver;
public	static Properties prop;
public  static EventFiringWebDriver e_driver;
public static WebEventListener eventListener;

	public Base_class() {

		try {
			prop = new Properties();
			FileInputStream fs = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/jaya/com/configuration/config.properties");
			prop.load(fs);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	

	}public static  void inslization() {
		String browsername=prop.getProperty("browser");
		
		if(browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		}
		else if(browsername.equals("firfox")) {
			WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
		 
		}
		/*
		 * e_driver = new EventFiringWebDriver(driver); // Now create object of
		 * EventListerHandler to register it with EventFiringWebDriver eventListener =
		 * new WebEventListener(); e_driver.register(eventListener); driver = e_driver;
		 */
		
		driver.manage().timeouts().pageLoadTimeout(Utils.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Utils.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		}
	}


