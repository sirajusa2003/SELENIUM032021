package com.nexttech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FacebookHomePage {

	WebDriver driver;

	@Given("^User visits Facebook Home page$")
	public void user_visits_Facebook_Home_page() throws Throwable {

		// how to open browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		// how to open url
		driver.get("https://facebook.com/");

	}

	@Then("^User should see FB News Feed$")
	public void user_should_see_FB_News_Feed() throws Throwable {

	}

}
