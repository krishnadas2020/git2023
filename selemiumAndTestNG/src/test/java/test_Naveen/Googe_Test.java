package test_Naveen;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Googe_Test {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","/users/krishnadas/downloads/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.google.com");
				
	}
	@Test
	public void googleTitleTest() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test
	public void googlelogoTest() {
		WebElement logo=driver.findElement(By.xpath(""));
		boolean l=logo.isDisplayed();
		//System.out.println(l);
	}
	@Test 
	public void mailLinkCheck() {
		WebElement mail=driver.findElement(By.linkText("Gmail"));
		boolean m =mail.isDisplayed();
		//System.out.println(m);
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
