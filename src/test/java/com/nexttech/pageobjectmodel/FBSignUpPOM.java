package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBSignUpPOM {

	WebDriver driver;

	// Constructor

	public FBSignUpPOM(WebDriver driver) {
		// This driver is a local driver inside the constructor

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")

	WebElement click_create_account;

	public WebElement CreateACButton() {
		return click_create_account;
	}

	@FindBy(name = "firstname")

	WebElement type_Firstname;

	public WebElement Firstname() {
		return type_Firstname;
	}

	@FindBy(name = "lastname")

	WebElement type_Lastname;

	public WebElement Lastname() {
		return type_Lastname;
	}

	@FindBy(name = "reg_email__")
	WebElement type_email;

	public WebElement Email() {
		return type_email;
	}

	@FindBy(name = "reg_email_confirmation__")
	WebElement type_confirm_email;

	public WebElement ConfirmEmail() {
		return type_confirm_email;
	}

	@FindBy(name = "reg_passwd__")
	WebElement type_password;

	public WebElement Password() {
		return type_password;
	}

	@FindBy(name = "birthday_month")
	WebElement select_month;

	public WebElement Month() {
		return select_month;
	}

	@FindBy(name = "birthday_day")
	WebElement select_day;

	public WebElement Day() {
		return select_day;
	}

	@FindBy(name = "birthday_year")
	WebElement select_year;

	public WebElement Year() {
		return select_year;

	}

	@FindBy(xpath = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")

	WebElement select_sex;

	public WebElement Sex() {
		return select_sex;
	}

	@FindBy(xpath = "/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[10]/button")
	WebElement click_signup;

	public WebElement Signup() {
		return click_signup;
	}

}
