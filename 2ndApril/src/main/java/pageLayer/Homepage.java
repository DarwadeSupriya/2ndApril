package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {
	
	WebDriver driver1;            // new ChromeDriver();
	private WebElement phones;
	private WebElement samsung_galaxy_product;
	
	public Homepage(WebDriver driver)   // driver = new ChromeDriver();
	{
		driver1=driver;
		phones = driver1.findElement(By.xpath("//a[contains(text(),'Phones')]"));
		samsung_galaxy_product= driver1.findElement(By.xpath("//a[contains(text(),'Samsung galaxy s6')]"));
	}
	
	public void clickOnPhones()
	{
		phones.click();
	}
	
	public void clickOnSamsungGalaxy()
	{
		samsung_galaxy_product.click();
	}
}
