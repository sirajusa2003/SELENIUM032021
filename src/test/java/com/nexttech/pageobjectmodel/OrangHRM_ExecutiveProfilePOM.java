package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangHRM_ExecutiveProfilePOM {

	WebDriver driver;

	public OrangHRM_ExecutiveProfilePOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// copy xpath for company
	@FindBy(xpath = "//*[@id=\"header-navbar\"]/ul[1]/li[4]/a")
	WebElement act_Company;

	public WebElement Company() {
		return act_Company;
	}

	// copy xpath for Executive Profile
	@FindBy(xpath = "//*[@id=\"header-navbar\"]/ul[1]/li[4]/ul/div/div/div/p[2]/a")
	WebElement click_ExecutiveProfile;

	public WebElement ExecutiveProfile() {
		return click_ExecutiveProfile;
	}

}
