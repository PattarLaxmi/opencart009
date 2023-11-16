package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage 
{

	public HomePage(WebDriver driver) 
	{
		super(driver);
	
	}

	//elements
	/*@FindBy(xpath =)
	WebElement lnkMyaccount;*/
	
	@FindBy(xpath = "//div[@class=\"navbar-right hidden-xs\"]//a[2]" )
	WebElement lnkRegister;
	
	
	//Action Methods
	/*public void clickMyAccount()
	{
		lnkMyaccount.click();
	}*/
	
	public void clickRegister()
	{
		lnkRegister.click();
	}
	
}
