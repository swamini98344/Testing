package testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.lmx.base.BaseFile;
import com.lmx.pages.HomePage;
import com.lmx.pages.LoginPage;
import com.lmx.pages.ProfilePage;
import com.lmx.util.Utilities;

public class ProfilePageTest extends BaseFile {

	LoginPage loginPage;
	HomePage homePage;
	Utilities utilities;
	ProfilePage profilePage;

	public ProfilePageTest() {
		super();// using this it will not throw null pointer exception
	}

	@BeforeTest
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		utilities = new Utilities();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.manage().timeouts().pageLoadTimeout(Utilities.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		profilePage = new ProfilePage();

	}

	@Test(priority = 1)
	public void profilePageclick() {
		profilePage.clickonprofile();
	}

	@Test(priority = 2)
	public void firstname() {
		profilePage.firstname("NN");
	}

	@Test(priority = 3)
	public void lastname() {
		profilePage.lastname("TTT");
	}

}
