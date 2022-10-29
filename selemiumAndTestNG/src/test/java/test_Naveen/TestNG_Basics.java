package test_Naveen;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Basics {
	//WebDriver driver;
	
	@BeforeSuite
	public void Setup() {
		System.out.println("webdriver.chrome.driver: @BeforeSuite");
		
	}
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launchBrowser: @BeforeTest");
	}
	@BeforeClass
	public void lonin() {
		System.out.println("login to app: @BeforeClass");
	}
	@BeforeMethod
	public void enterURL() {
		System.out.println("enter url: @BeforeMethod");
		
	}
	@Test
	public void googleTittleTest() {
		System.out.println("google tittle test: @Test");
		
	}
	@AfterMethod
	public void logOut() {
		System.out.println("logout from app: @AfterMethod");
	}
	@AfterClass
	public void closeURL() {
	System.out.println("closeURL: @AfterClass");	
	}
	@AfterTest
	public void deleteAllCookies(){
	System.out.println("closeURL: @AfterTest");	
	}
	@AfterSuite
	public void closeBrowser() {
		System.out.println("close browser: @Aftersuite");
		
	}
	@Test
	public void fbTittleTest() {
		System.out.println("fb tittle test: @Test");
	}
	
	
	

}
