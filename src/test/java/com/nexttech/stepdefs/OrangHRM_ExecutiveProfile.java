package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttech.pageobjectmodel.OrangHRM_ExecutiveProfilePOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangHRM_ExecutiveProfile {
	WebDriver driver;

	@Given("^user lands on  OrangeHRM home page$")
	public void user_lands_on_OrangeHRM_home_page() throws Throwable {
		try {
			// how to open browser
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

			// Implicit wait is a soft wait to fix synchronizing issue.
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			// To maximize the window
			driver.manage().window().maximize();

			// To open URL
			driver.get("https://www.orangehrm.com/");

		} catch (Exception e) {
			e.printStackTrace(); // It helps to trace the exception
		}

	}

	@When("^user visits Company dropdown menu\\. user can see Executive Profile option and click on it$")
	public void user_visits_Company_dropdown_menu_user_can_see_Executive_Profile_option_and_click_on_it()
			throws Throwable {

		Actions act = new Actions(driver);

		OrangHRM_ExecutiveProfilePOM obj = new OrangHRM_ExecutiveProfilePOM(driver);
		Thread.sleep(2000);

		act.moveToElement(obj.Company()).build().perform();
		Thread.sleep(2000);
		obj.ExecutiveProfile().click();
	}

	@Then("^user should redirect to Executive Profile page$")
	public void user_should_redirect_to_Executive_Profile_page() throws Throwable {

	}

}
