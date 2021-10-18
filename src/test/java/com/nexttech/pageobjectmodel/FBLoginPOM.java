package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPOM {

	WebDriver driver;

	// Constructor

	public FBLoginPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// Locator

	@FindBy(name = "email")

	WebElement type_username;

	public WebElement FBUserName() {
		return type_username;
	}

	// Locator

	@FindBy(id = "pass") // Used 'id' locator to identify input box
	WebElement type_password;

	public WebElement FBPassword() {
		return type_password;
	}

	// Locator

	@FindBy(name = "login")
	WebElement click_login;

	public WebElement LoginButton() {
		return click_login;

	}

}
