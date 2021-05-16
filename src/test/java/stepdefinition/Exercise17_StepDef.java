package stepdefinition;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.NavBarPage;

public class Exercise17_StepDef {
	

	private WebDriver driver;
	
	@cucumber.api.java.Before("@Exercise17")
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		String user = "Admin";
		String pass = "admin123";

		LoginPage login = new LoginPage(driver);

		login.setUsername(user);
		login.setPassword(pass);
		login.clickLoginButton();
	}
	
	@Given("I click on Admin Link")
	public void i_click_on_admin_link() {
		NavBarPage navbar = new NavBarPage(driver);
		navbar.clickOnOption("Admin");
	}

	@Given("Click on Job")
	public void click_on_job() {
		HomePage hp = new HomePage(driver);
		hp.moveToJobTitle();
	}

	@Then("validate text Job Title")
	public void validate_text_job_title() {
		WebElement title = driver.findElement(By.xpath("//h1[contains(text(),'Job Titles')]"));
		assertEquals(title.getText(),"Job Titles");
	}

	@After("@Exercise17")
	public void tear() {
		driver.quit();
	}

}
