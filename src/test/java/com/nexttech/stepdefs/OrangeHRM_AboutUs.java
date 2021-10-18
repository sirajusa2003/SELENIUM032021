package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttech.pageobjectmodel.OrangeHRM_AboutUsPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRM_AboutUs {
	WebDriver driver;

	@Given("^user visits OrangeHRM home page$")
	public void user_visits_OrangeHRM_home_page() throws Throwable {

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

	@When("^user wants to visit Company dropdown menu and will be able to see  About Us option and click on it$")
	public void user_wants_to_visit_Company_dropdown_menu_and_will_be_able_to_see_About_Us_option_and_click_on_it()
			throws Throwable {

		Actions act = new Actions(driver);
		OrangeHRM_AboutUsPOM obj = new OrangeHRM_AboutUsPOM(driver);
		Thread.sleep(2000); // Hard wait
		act.moveToElement(obj.Company()).build().perform();
		Thread.sleep(2000); // Hard wait

		obj.AboutUs().click();

	}

	@Then("^user able to redirect to About Us page$")
	public void user_able_to_redirect_to_About_Us_page() throws Throwable {

	}

}
