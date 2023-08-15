package com.lmx.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lmx.base.BaseFile;

public class LoginPage extends BaseFile {

	@FindBy(xpath = "//input[@id='username']")
	WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	@FindBy(xpath = "//button[@id='btn_submit']")
	WebElement loginBtn;

	@FindBy(xpath = "//img[@class='w-75']")
	WebElement lmxlogo;

	// Initializing the page objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);// 'this' means current class objects. Can also use LoginPage.class
	}

	/********************************************
	 * Actions
	 **********************************************/

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public void veryHeader(String args1) {
		username.sendKeys(args1);
	}

	public boolean validatelmxlogo() {
		return lmxlogo.isDisplayed();// always use boolean for isDisplayed
	}

	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);

		loginBtn.click();

		return new HomePage();

		// login page lands to homepage, so use return method
	}

}
