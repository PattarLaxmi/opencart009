package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	
	
		WebDriver driver;
		
		public BasePage(WebDriver driver) 
		{
		    this.driver = driver; // Assign the WebDriver instance passed as a parameter to the 'driver' variable of the class.
		    PageFactory.initElements(driver, this); // Initialize the elements of the page using PageFactory. 'this' refers to the current instance of the class.
		}

	
		
}

