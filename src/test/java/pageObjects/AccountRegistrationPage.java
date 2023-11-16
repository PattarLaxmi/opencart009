package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountRegistrationPage extends BasePage
{

	public AccountRegistrationPage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	
	// Elements
	@FindBy(name = "firstname")
	WebElement txtFirstname;
	
	@FindBy(name = "lastname")
	WebElement txtLastname;
	
	@FindBy(name = "email")
	WebElement txtEmail;
	
	
	@FindBy(name = "country_id")
	private WebElement txtCountry;
	
	@FindBy(name = "password")
	WebElement txtPassword;
	
	@FindBy(linkText = "Register")
	WebElement buttonRegister;
	
	public void setFirstName(String fname)
	{
		txtFirstname.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		txtLastname.sendKeys(lname);
	}
	
	public void  setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
		
	
	public void selectOptionByText(String optionText)
	{
		Select drpdown = new Select(txtCountry);
		drpdown.selectByVisibleText(optionText);
	}
	
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}

	public void clickButton()
	{
		buttonRegister.click();
	}
	
	/*public String getConfirmation()
	{
		try
		{
			return ();
		}
		
	}*/
	
}
