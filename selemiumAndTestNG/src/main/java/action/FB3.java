package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FB3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/users/krishnadas/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");

		//Actions act = new Actions(driver);
		//WebElement we = driver.findElement(By.xpath("//a[text()='Create new account']"));
		
		//we.click();
		//act.perform();
		
		WebElement fName=driver.findElement(By.xpath("//input[@placeholder='First name']"));
		fName.sendKeys("krishna");
		//act.perform();
		
	}
	
}	
		
		
