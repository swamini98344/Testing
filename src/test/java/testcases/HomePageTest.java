package testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.lmx.base.BaseFile;
import com.lmx.pages.HomePage;
import com.lmx.pages.LoginPage;
import com.lmx.util.Utilities;

public class HomePageTest extends BaseFile {

	LoginPage loginPage;
	HomePage homePage;
	Utilities utilities;

	public HomePageTest() {
		super();// using this it will not throw null pointer exception
	}

	@BeforeTest
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		utilities = new Utilities();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		driver.manage().timeouts().pageLoadTimeout(Utilities.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
	}

	@Test(priority = 1)

	public void lmxLogoImageTest() {
		boolean flag = homePage.verifyHomePageLogo();
		Assert.assertTrue(flag);	
		System.out.println("Logo visible: "+flag);
	}
}
