package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttech.pageobjectmodel.DellAction_IndustriesPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellAction_Industries {

	WebDriver driver;

	@Given("^user intends to open Dell homepage$")
	public void user_intends_to_open_Dell_homepage() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		// soft wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// how to maximize the window of the browser
		driver.manage().window().maximize();

		// how to open url driver.get method
		driver.get("https://www.dell.com/en-us");

	}

	@When("^user wants to visit solutions menu and will be able to see  Healthcare & Life Sciences and click on it$")
	public void user_wants_to_visit_solutions_menu_and_will_be_able_to_see_Healthcare_Life_Sciences_and_click_on_it()
			throws Throwable {

		Actions act = new Actions(driver);
		DellAction_IndustriesPOM obj = new DellAction_IndustriesPOM(driver);
		act.moveToElement(obj.Solutions()).build().perform();
		act.moveToElement(obj.Industries()).build().perform();
		obj.Healthcare().click();

	}

	@Then("^user can be able to redirect Healthcare & Life Sciences$")
	public void user_can_be_able_to_redirect_Healthcare_Life_Sciences() throws Throwable {

	}

}
