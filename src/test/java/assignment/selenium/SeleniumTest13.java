package assignment.selenium;

import static org.junit.Assert.assertNotNull;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

import pageobjects.LoginPage;
import pageobjects.NavBarPage;
import pageobjects.PIMPage;

public class SeleniumTest13 {

	
	/**
	 * This CLASS contains the code for exercise 13
	 */
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {

		// Set up
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void test13() throws InterruptedException {
		
		/*
		 * 13- Execute followingscenario
		 */
	
		//• Login to OrangeHRM
		driver.get("https://opensource-demo.orangehrmlive.com");
		String user = "Admin";
		String pass = "admin123";
		
		LoginPage login = new LoginPage(driver);
		
		login.setUsername(user);
		login.setPassword(pass);
		login.clickLoginButton();
		
		//• Click on PIM
		NavBarPage navbar = new NavBarPage(driver);
		navbar.clickOnOption("PIM");
		
		//• Enter Employee Name-Linda Anderson in Search box
		PIMPage pim = new PIMPage(driver);
		
		pim.searchByEmployeeName("Linda Jane Anderson");
		pim.clickSearch();
		
		//• Validate and capture screenshot
		WebElement tableElement = driver.findElement(By.linkText("Linda Jane"));
		assertNotNull(tableElement);
		
		Shutterbug.shootPage(driver).withName("Exercise12LindaAnderson").save();
	
		}
	
	@AfterClass
	public void tear() {
		driver.quit();
	}

}
