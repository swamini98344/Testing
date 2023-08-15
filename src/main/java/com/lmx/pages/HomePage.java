package com.lmx.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lmx.base.BaseFile;

public class HomePage extends BaseFile {

	@FindBy(xpath = "//img[@onerror=\"this.src='assets/images/logo.svg'\"]")
	WebElement LogoDashBoard;

	public HomePage() {
		PageFactory.initElements(driver, this);// 'this' means current class objects.
	}

	public Boolean verifyHomePageLogo() {
		return LogoDashBoard.isDisplayed();
	}

}
