package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.karnataka_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class KarnatkaTest {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private karnataka_POM karnataka_POM ;
	private static Properties properties;
	private ScreenShot screenShot;

//	@BeforeClass
//	public static void setUpBeforeClass() throws IOException {
//		
//	}
//	
	
	@BeforeTest
	public void setUp() throws Exception {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		karnataka_POM = new karnataka_POM(driver) ;
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver);

		// open the browser 
		driver.get(baseUrl);
		
	}
	
//	@AfterTest
//	public void tearDown() throws Exception {
//		Thread.sleep(1500);
//		driver.quit();
//	}
	
//	@Test
//	public void validLoginTest() {
//		loginPOM.sendUserName("admin");
//		loginPOM.sendPassword("admin@123");
//		loginPOM.clickLoginBtn(); 
//		screenShot.captureScreenShot("First");
//	}
	
	@Test
	public void tc1() throws InterruptedException {
		karnataka_POM.clickhamburgerBtn();
	}
	
	@Test
	public void tc2() throws InterruptedException {
//		karnataka_POM.start();
		karnataka_POM.tc2();
	}
	
	@Test
	public void tc3() throws InterruptedException {
		karnataka_POM.tc3();
	}
	
	@Test
	public void tc4() throws InterruptedException {
		karnataka_POM.tc4();
	}
	
	@Test
	public void tc5() throws InterruptedException {
		karnataka_POM.tc5();
	}
	
	@Test
	public void tc6() throws InterruptedException {
		karnataka_POM.tc6();
	}
	
	@Test
	public void tc7() throws InterruptedException {
		karnataka_POM.tc7();
	}
	
	
	
}
