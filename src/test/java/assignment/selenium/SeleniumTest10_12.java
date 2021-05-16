package assignment.selenium;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageobjects.LoginPage;

/*
 * 11- Implement ITestListener for above scenario where full-page screenshot needs to be capture where ever test is pass or failed
 */
@Listeners(listeners.Exercise11Listener.class)
public class SeleniumTest10_12 {

	/**
	 * This CLASS contains the code for exercise 10 to 12
	 */
	public WebDriver driver;

	@BeforeClass
	public void beforeSuite() {

		// Set up
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");

		String user = "Admin";
		String pass = "admin123";

		LoginPage login = new LoginPage(driver);

		login.setUsername(user);
		login.setPassword(pass);
		login.clickLoginButton();
	}

	
	/*
	 * 12- Implement Retry analyzer – retry 3 times only for the above scenario. 
	 */

	@Test(retryAnalyzer = listeners.Exercise12Listener.class)
	public void test10_12() {

		/*
		 * 10- Read Dashboard heading using [driver.findelement(by.xpath()).gettext()].
		 */

		String dashboardtext = driver.findElement(By.xpath("//div[@id='content']//div[@class='head']/h1")).getText();
		assertEquals("Dashoard", dashboardtext);

	}

	@AfterClass
	public void tear() {
		driver.quit();
	}

}
