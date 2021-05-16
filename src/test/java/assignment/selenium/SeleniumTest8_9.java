package assignment.selenium;


import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.LoginPage;
import pageobjects.NavBarPage;

public class SeleniumTest8_9 {

	/**
	 * This CLASS contains the code for exercise 8 to 9
	 */
	WebDriver driver;

	@BeforeClass
	public void setUp() {

		// Set up
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com");
		
		maximizeWindow();
		
		String user = "Admin";
		String pass = "admin123";

		LoginPage login = new LoginPage(driver);

		login.setUsername(user);
		login.setPassword(pass);
		login.clickLoginButton();
	}

	@Test(dataProvider = "dp")
	public void test8_9(String option) {

		/*
		 * 8- Write Test method and page title for different menus- in order(Admin, PIM,
		 * Leave Dashboard, Directory and Maintenance)
		 */
		System.out.println("======================================");
		NavBarPage navBar = new NavBarPage(driver);
		navBar.clickOnOption(option);
		
		List<String> actualValues = driver.findElements(By.cssSelector("#mainMenu li.current > ul >li"))
				.stream()
				.map(we -> we.getText())
				.collect(Collectors.toList());
		
		System.out.println("Suboptions for "+ option + " page:");
		System.out.println(actualValues);
	
	}
	
	@DataProvider
	public Object[][] dp(){
		return new Object[][]{
					{"Admin"},
					{"PIM"},
					{"Leave"},
					{"Dashboard"},
					{"Directory"},
					{"Maintenance"}
				};
	}
	

	@AfterClass
	public void tear() {
		driver.quit();
	}
	
	private void maximizeWindow() {
		//9- Write a method (avoid using Test annotation) to minimize the window.
		
		//PS: There is no function for minimize, therefore I'm using Maximize instead
		driver.manage().window().maximize();
	}

}
