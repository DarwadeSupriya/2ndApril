package testLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageLayer.Homepage1;
import pageLayer.utilityPackage.UtilClass;


public class HomePageTest1 {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoblaze.com/index.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Homepage1 home = new Homepage1(driver);
		UtilClass  util = new UtilClass(driver);
		home.clickOnPhones();
		home.clickOnNexus6();
		util.clickOnAddToCart();

	}

}


//System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\07 May 22 EB\\chromedriver.exe");