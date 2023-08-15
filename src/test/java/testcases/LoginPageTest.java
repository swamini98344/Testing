package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.lmx.base.BaseFile;
import com.lmx.pages.HomePage;
import com.lmx.pages.LoginPage;

public class LoginPageTest extends BaseFile {

	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() {
		super();// using this it will not throw null pointer exception
	}

	@BeforeTest
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "TakeIn-Learner");
	}

	@Test(priority = 2)
	public void lmxLogoImageTest() {
		boolean flag = loginPage.validatelmxlogo();
		Assert.assertTrue(flag);
	}

	@Test(priority=3)
	public void loginTest(){
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));//login method returns homepage class object
	}
}
