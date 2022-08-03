package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage1 {
	
	public Homepage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//click on phones
	@FindBy(xpath="//a[contains(text(),'Phones')]")
	private WebElement phones;
	
	public void clickOnPhones()
	{
		phones.click();
	}
	
	//click on nexus_6
	@FindBy(xpath="//a[contains(text(),'Nexus 6')]")
	private WebElement nexus_6;
	
	public void clickOnNexus6()
	{
		nexus_6.click();
	}
}
