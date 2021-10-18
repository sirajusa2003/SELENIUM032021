package com.nexttech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.pageobjectmodel.BestSellerPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BestSellerAmazon {
	WebDriver driver;

	@Given("^User visits Amazon Home page$")
	public void user_visits_Amazon_Home_page() throws Throwable {
		// how to open Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		// how to open url
		driver.get("https://www.amazon.com/");

	}

	@When("^user clicks on Bestseller option$")
	public void user_clicks_on_Bestseller_option() throws Throwable {
		BestSellerPOM bestsell = new BestSellerPOM(driver);
		bestsell.bestseller().click();
	}

	@Then("^User should be able to redirect the bestseller page$")
	public void user_should_be_able_to_redirect_the_bestseller_page() throws Throwable {

	}
}