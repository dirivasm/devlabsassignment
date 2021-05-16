package assignment.selenium;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobjects.LoginPage;
import pageobjects.NavBarPage;

public class SeleniumTest1_5 {

	
	/**
	 * This CLASS contains the code for exercise 1 to 5
	 */
	@Test
	public void test1_5() {
		
		//Set up
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		//1- Open the above URL in Chrome browser
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		//2- Print the title of this application.
		String title = driver.getTitle();
		System.out.println("Title is: "+title);
		
		//3- Write Xpath and CssSelector of login page for following web objects - All Text box’s, All - Hyperlinks, All Images.
		
		//Text box
		String xpathUserTxt = "//input[@id='txtUsername']";
		String xpathPassTxt = "//input[@id='txtPassword']";
		String cssUserTxt = "#txtUsername";
		String cssPassTxt = "#txtPassword";
		
		//Hyperlink
		String xpathForgotPass = "//a[contains(text(),'Forgot your password?')]";
		String xpathOrangeHRM = "//a[contains(text(),'OrangeHRM, Inc')]";
		String cssForgotPass = "#forgotPasswordLink a";
		String cssOrangeHRM = "#footer a";
		
		//Images
		String xpathMainLogo = "//div[@id='divLogo']/img";
		String xpathSocialMedia = "//*[@id='social-icons']/a/img";
		String cssMainLogo = "#divLogo img";
		String cssSocialMedia = "#social-icons a img";
		
		//4- Login with given User Name and Password and validate Dashboard. 
		String user = "Admin";
		String pass = "admin123";
		
		LoginPage login = new LoginPage(driver);
		
		login.setUsername(user);
		login.setPassword(pass);
		login.clickLoginButton();
		
		WebElement dashboard = driver.findElement(By.cssSelector("#mainMenu li.current"));
		assertEquals("Dashboard",dashboard.getText());
		
		/*
		5- Click on Admin Link in Home Page and validate following text-
		• User Management
		• Job
		• Organization
		• Qualifications
		*/
		
		NavBarPage navbar = new NavBarPage(driver);
		navbar.clickOnOption("Admin");
		
		List<String> expectedValues = List.of("User Management", "Job", "Organization", "Qualifications");
		List<String> actualValues = driver.findElements(By.cssSelector("#mainMenu li.current > ul >li"))
				.stream()
				.map(we -> we.getText())
				.collect(Collectors.toList());
		
		System.out.println("Actual Values: "+ actualValues);
		expectedValues.forEach(i -> {
			System.out.println("Expected Value: "+ i);
			assertTrue(actualValues.contains(i));
		});
		
		
		driver.quit();
		}

}
