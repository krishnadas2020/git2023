 package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_class {
	public static void main(String []args) {
	System.setProperty("webdriver.chrome.driver", "/users/krishnadas/downloads/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.facebook.com");
	
	Actions action = new Actions(driver);
	WebElement user =driver.findElement(By.xpath("//*[@id=\"email\"]"));
	action.sendKeys(user,"daskrishna@yahoo.com");
	action.perform();
	
	
	WebElement passWord =driver.findElement(By.xpath("//*[@id=\"pass\"]"));
	action.sendKeys(passWord,"das2345");
	action.perform();
	
	WebElement e =driver.findElement(By.xpath("//button")); 
	e.click();
 //action.perform();
	
	
	}
}
