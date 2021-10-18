package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttech.pageobjectmodel.FBLoginPOM;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBLogin {
	// Declare Selenium WebDriver Global variable
	WebDriver driver;

	@Given("^user should visit facebook landing page$")
	public void user_should_visit_facebook_landing_page() throws Throwable {

		try {
			// how to open browser
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

			// Implicit wait is a soft wait to fix synchronizing issue.
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			// To maximize the window
			driver.manage().window().maximize();

			// To open URL
			driver.get("https://facebook.com/");

		} catch (Exception e) {
			e.printStackTrace(); // It helps to trace the exception
		}

	}

	@When("^user type the \"([^\"]*)\"$")
	public void user_type_the(String arg1) throws Throwable {
		// Create an object to get methods from Page Object Model(POM) class
		FBLoginPOM FB = new FBLoginPOM(driver);

		// Type Sample Data into the input box by using method and sendkeys
		// value(argument).
		FB.FBUserName().sendKeys("sirajusa2003@yahoo.com");

		// Explicit wait is a soft wait to fix synchronizing issue.
		WebDriverWait wait = new WebDriverWait(driver, 20);
	}

	@And("^user should type the  \"([^\"]*)\"$")
	public void user_should_type_the(String arg2) throws Throwable {
		FBLoginPOM FB = new FBLoginPOM(driver);

		// Explicit wait is a soft wait to fix synchronizing issue.
		WebDriverWait wait = new WebDriverWait(driver, 20);
		FB.FBPassword().sendKeys("P@ssw0rd33");
	}

	@And("^user should click login button$")
	public void user_should_click_login_button() throws Throwable {
		FBLoginPOM FB = new FBLoginPOM(driver);

		// Explicit wait is a soft wait to fix synchronizing issue.
		WebDriverWait wait = new WebDriverWait(driver, 20);
		FB.LoginButton().click();

	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
		Thread.sleep(10000); // It is a hard wait code.
		System.out.println(driver.getTitle());// To print webpage's Title in the console
		// driver.close(); // To close the Internet connectivity
		// driver.quit();// To close the browser

	}

}
