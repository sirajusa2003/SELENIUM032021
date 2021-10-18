package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_AboutUsPOM {

	WebDriver driver;

	public OrangeHRM_AboutUsPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// copy xpath for company
	@FindBy(xpath = "//*[@id=\"header-navbar\"]/ul[1]/li[4]/a")

	WebElement act_Company;

	public WebElement Company() {
		return act_Company;
	}

	// copy xpath for About Us
	@FindBy(xpath = "//*[@id=\"header-navbar\"]/ul[1]/li[4]/ul/div/div/div/p[1]/a")

	WebElement click_AboutUs;

	public WebElement AboutUs() {
		return click_AboutUs;
	}
}
