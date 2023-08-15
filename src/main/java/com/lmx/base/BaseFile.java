package com.lmx.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.lmx.util.Utilities;

public class BaseFile {
	public static WebDriver driver;
	public static Properties prop;

	public BaseFile() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("D:\\Eclipse ProjectsTest\\AT Automation Project\\LMSwork\\NLMX\\src\\main\\java\\com"
					+ "\\lmx\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Eclipse ProjectsTest\\Works\\driverssele\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "D:\\driverssele\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Utilities.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS); // create util class
																									// for timeunit
		driver.manage().timeouts().implicitlyWait(Utilities.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));

	}
}
