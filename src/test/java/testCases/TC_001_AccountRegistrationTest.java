package testCases;

import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass
{
	
	
	@Test
	public void test_account_Registration() throws InterruptedException
	{

		
		HomePage hp = new HomePage(driver);
		hp.clickRegister();
		
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		
		regpage.setFirstName(randomString().toUpperCase());
		
		regpage.setLastName(randomString().toUpperCase());
		
		regpage.setEmail(randomString()+"@gmail.com");
		
		regpage.selectOptionByText("India");
		
		regpage.setPassword(randomAlphaNumeric());
		
		Thread.sleep(10000);
		
		regpage.clickButton();
		
		
		
	}
	
	
}
