package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public WebDriver driver;
	
	
	@BeforeClass
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.opencart.com/");		
				
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	public String randomString()
	{
		String generateString = RandomStringUtils.randomAlphanumeric(5);
		return (generateString);
	}

	public String randomNumber()
	{
		new RandomStringUtils();
		String generateString2 = RandomStringUtils.randomNumeric(10);
		return (generateString2);
	}
	
	public String randomAlphaNumeric()
	{
		String st = RandomStringUtils.randomAlphabetic(4);
		String num = RandomStringUtils.randomNumeric(4);
		
		return (st+"*"+num);
	}
	
	
	
}
