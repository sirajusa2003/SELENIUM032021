package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellAction_IndustriesPOM {

	WebDriver driver;

	public DellAction_IndustriesPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/a/span")
	WebElement act_Solutions;

	public WebElement Solutions() {
		return act_Solutions;
	}

	@FindBy(xpath = "/html/body/main/header/div[2]/div[2]/nav/ul/li[2]/ul/li[4]/a")
	WebElement act_Industries;

	public WebElement Industries() {
		return act_Industries;

	}

	@FindBy(xpath = "/html/body/main/header/div[2]/div[2]/nav/ul/li[2]/ul/li[4]/ul/li[4]/a")
	WebElement click_Healthcare;

	public WebElement Healthcare() {
		return click_Healthcare;

	}

}
