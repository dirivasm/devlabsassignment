package assignment.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pageobjects.LoginPage;

public class SeleniumTest6_7 {

	
	/**
	 * This CLASS contains the code for exercise 6 to 7
	 */
	WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		
		//Set up
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		//6- Launch a browser in @Beforesuite annotation and open url.
		driver.get("https://opensource-demo.orangehrmlive.com");
		
	}
	
	
	@Test(priority = 1)
	public void test6_7() {
		
		//7- Login to application again in @Test method, set priority 1 of the same method Afterlogging
		String user = "Admin";
		String pass = "admin123";
		
		LoginPage login = new LoginPage(driver);
		
		login.setUsername(user);
		login.setPassword(pass);
		login.clickLoginButton();
		
		}
	
	@AfterSuite
	public void tear() {
		driver.quit();
	}

}
