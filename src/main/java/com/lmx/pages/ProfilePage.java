package com.lmx.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lmx.base.BaseFile;

public class ProfilePage extends BaseFile {

	@FindBy(xpath = "//span[contains(text(),'My Profile')]")
	WebElement profileclick;

	@FindBy(xpath = "//span[contains(text(),'Personal Information')]")
	WebElement personelinfo;

	@FindBy(id = "firstName")
	WebElement firstName;

	@FindBy(id = "lastName")
	WebElement lastName;

	@FindBy(id = "emailId")
	WebElement email;

	@FindBy(id = "contactNumber")
	WebElement MobileNo;

	@FindBy(id = "birthDate")
	WebElement date;

	@FindBy(id = "gender")
	WebElement gender;

	@FindBy(id = "pincode")
	WebElement pincode;

	@FindBy(id = "city")
	WebElement city;

	@FindBy(id = "state")
	WebElement state;

	@FindBy(id = "country")
	WebElement country;

	@FindBy(xpath = "//form[@class='row ng-pristine ng-touched ng-invalid']//button[@class='btn btn-primary'][normalize-space()='Update']")
	WebElement update;

	@FindBy(id = "//span[contains(text(),'Change Password')]")
	WebElement changepassword;

	@FindBy(id = "password")
	WebElement oldpass;

	@FindBy(id = "state")
	WebElement newpass;

	@FindBy(id = "confirmPassword")
	WebElement confirmpass;

	@FindBy(id = "//b[contains(text(),'Logout')]")
	WebElement logout;

	// Initializing the page objects:
	public ProfilePage() {
		PageFactory.initElements(driver, this);
	}

	/********************************************
	 * Actions
	 **********************************************/

	public void clickonprofile() {
		profileclick.click();
	}

	public void firstname(String fn) {
		firstName.sendKeys(Keys.CONTROL + "a");
		firstName.sendKeys(Keys.DELETE);

		firstName.sendKeys(fn);
	}

	public void lastname(String ln) {
		firstName.sendKeys(Keys.CONTROL + "a");
		firstName.sendKeys(Keys.DELETE);

		lastName.sendKeys(ln);
		
	}
}
