package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import testBase.BaseClass;

public class TestRunner extends BaseClass{

		    public static void main(String[] args) 
		    {
		        // Initialize WebDriver
		        WebDriver driver = new ChromeDriver();
		        
		        // Create an instance of BasePage or other page objects
		        BaseClass basePage = new BaseClass();
		        
		        // Perform test actions using basePage object
		        
		        // Close the browser after the tests are done
		        //driver.quit();
		    
		    }

}
