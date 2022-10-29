package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FbTitileTestWith_Assertion {
	WebDriver driver;
	
//	@BeforeClass
//	public void setUp() {
//		System.setProperty("webdriver.chrome.driver", "/users/krishnadas/downloads/chromedriver");
//	 driver = new ChromeDriver();
//			}
	
	
	@Test(priority=2)
	public void fbtitiletest() {
		System.setProperty("webdriver.chrome.driver", "/users/krishnadas/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		String expectedTitile="Facebook - log in or sign up";
		String actualTitile= driver.getTitle();
		Assert.assertEquals(actualTitile, expectedTitile);
		
		
	}
	@Test(priority=1) //enabled=false)
	public void googletitiletest() {
		System.setProperty("webdriver.chrome.driver", "/users/krishnadas/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		String expectedTitile="Google";
		String actualTitile= driver.getTitle();
		Assert.assertEquals(actualTitile, expectedTitile);
		
	}	
		

}
