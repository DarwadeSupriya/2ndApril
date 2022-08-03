package  pageLayer.utilityPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UtilClass {
	
	public UtilClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Add to cart')]")
	private WebElement add_to_cart;
	
	public void clickOnAddToCart()
	{
		add_to_cart.click();
	}
	
	
	public void takeSS()
	{
		
	}
}
